package com.sc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class LifeStyle {
    @SerializedName("brf")
    public String brf;// 舒适度

    @SerializedName("txt")
    public String suggestion;// 建议

    public String getBrf() {
        return brf;
    }

    public void setBrf(String brf) {
        this.brf = brf;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
}
