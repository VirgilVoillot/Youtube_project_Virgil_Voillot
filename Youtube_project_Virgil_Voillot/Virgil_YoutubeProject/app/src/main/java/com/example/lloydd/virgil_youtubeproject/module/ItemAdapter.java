package com.example.lloydd.virgil_youtubeproject.module;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lloydd.virgil_youtubeproject.R;

import java.io.InputStream;
import java.util.List;

/**
 * Created by Lloydd on 26/02/2016.
 */
public class ItemAdapter extends ArrayAdapter<Items> {
    private final LayoutInflater layoutInflater;

    public ItemAdapter(Context context, List<Items> objects) {
        super(context, 0, objects);
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        //The convertView is null when the view is inflated for the first time
        if (convertView == null) {
            //In that case, we create the view and we hold the sub views in a ViewHolder for an easier, more efficient access
            convertView = layoutInflater.inflate(R.layout.items_layout, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.titre = (TextView) convertView.findViewById(R.id.titre);
            viewHolder.description = (TextView) convertView.findViewById(R.id.description);
            viewHolder.date = (TextView) convertView.findViewById(R.id.date);
            viewHolder.auteur = (TextView) convertView.findViewById(R.id.author);
            viewHolder.image = (ImageView) convertView.findViewById(R.id.imageView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        //Finally, we get the current item, and we set the View according to the data we wish to display
        Items items = getItem(position);
        new ImageDownloader(viewHolder.image).execute(items.getSnippet().getThumbnail().getMedium().getUrl());
        viewHolder.titre.setText(items.getSnippet().getTitle());
        viewHolder.description.setText(items.getSnippet().getDescription());
        viewHolder.date.setText(items.getSnippet().getPublishedat());
        viewHolder.auteur.setText(items.getSnippet().getChanelTitle());
        return convertView;
    }

    private class ImageDownloader extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public ImageDownloader(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String url = urls[0];
            Bitmap mIcon = null;
            try {
                InputStream in = new java.net.URL(url).openStream();
                mIcon = BitmapFactory.decodeStream(in);
            } catch (Exception e) {

            }
            return mIcon;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }

    static class ViewHolder {
        private TextView titre;
        private TextView description;
        private TextView date;
        private TextView auteur;
        private ImageView image;
    }
}
