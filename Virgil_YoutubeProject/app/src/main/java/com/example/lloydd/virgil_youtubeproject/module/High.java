package com.example.lloydd.virgil_youtubeproject.module;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lloydd on 26/02/2016.
 */
public class High {
    @SerializedName("url")
    private String url;
    @SerializedName("width")
    private String width;
    @SerializedName("height")
    private String height;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
