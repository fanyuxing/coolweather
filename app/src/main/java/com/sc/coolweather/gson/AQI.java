package com.sc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class AQI {
    @SerializedName("aqi")
    public String AQI;// AQI指数

    @SerializedName("pm25")
    public String PM25;// PM2.5指数

    public String getAQI() {
        return AQI;
    }

    public void setAQI(String AQI) {
        this.AQI = AQI;
    }

    public String getPM25() {
        return PM25;
    }

    public void setPM25(String PM25) {
        this.PM25 = PM25;
    }
}
