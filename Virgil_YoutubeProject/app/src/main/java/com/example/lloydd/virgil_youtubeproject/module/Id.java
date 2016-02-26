package com.example.lloydd.virgil_youtubeproject.module;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lloydd on 26/02/2016.
 */
public class Id {
    @SerializedName("kind")
    private String kind;
    @SerializedName("videoId")
    private String videoId;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}
