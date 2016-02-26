package com.example.lloydd.virgil_youtubeproject.module;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Lloydd on 26/02/2016.
 */
public class Thumbnails {
    @SerializedName("default")
    private Default def;
    @SerializedName("medium")
    private Medium medium;
    @SerializedName("high")
    private High high;

    public Default getDef() {
        return def;
    }

    public void setDef(Default def) {
        this.def = def;
    }

    public Medium getMedium() {
        return medium;
    }

    public void setMedium(Medium medium) {
        this.medium = medium;
    }

    public High getHigh() {
        return high;
    }

    public void setHigh(High high) {
        this.high = high;
    }
}
