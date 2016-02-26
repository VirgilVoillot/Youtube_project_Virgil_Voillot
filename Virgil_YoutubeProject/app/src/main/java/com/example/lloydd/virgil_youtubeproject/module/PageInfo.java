package com.example.lloydd.virgil_youtubeproject.module;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Lloydd on 26/02/2016.
 */
public class PageInfo {
    @SerializedName("totalResults")
    private String totalResults;
    @SerializedName("resultsPerPage")
    private String resultsPerPage;

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResultsPerPage() {
        return resultsPerPage;
    }

    public void setResultsPerPage(String resultsPerPage) {
        this.resultsPerPage = resultsPerPage;
    }
}
