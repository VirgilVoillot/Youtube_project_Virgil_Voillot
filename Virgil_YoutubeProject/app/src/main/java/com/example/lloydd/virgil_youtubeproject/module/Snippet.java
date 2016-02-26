package com.example.lloydd.virgil_youtubeproject.module;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lloydd on 26/02/2016.
 */
public class Snippet {
    @SerializedName("publishedAt")
    private String publishedat;
    @SerializedName("vchannelId")
    private String chanelid;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("thumbnails")
    private Thumbnails thumbnail;
    @SerializedName("channelTitle")
    private String chanelTitle;
    @SerializedName("liveBroadcastContent")
    private String liveBroadcastContent;

    public String getPublishedat() {
        return publishedat;
    }

    public void setPublishedat(String publishedat) {
        this.publishedat = publishedat;
    }

    public String getChanelid() {
        return chanelid;
    }

    public void setChanelid(String chanelid) {
        this.chanelid = chanelid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Thumbnails getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnails thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getChanelTitle() {
        return chanelTitle;
    }

    public void setChanelTitle(String chanelTitle) {
        this.chanelTitle = chanelTitle;
    }

    public String getLiveBroadcastContent() {
        return liveBroadcastContent;
    }

    public void setLiveBroadcastContent(String liveBroadcastContent) {
        this.liveBroadcastContent = liveBroadcastContent;
    }
}
