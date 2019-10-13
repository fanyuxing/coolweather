package com.sc.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class DailyForecast {
    @SerializedName("date")
    public String date;// 日期

    @SerializedName("cond_txt_d")
    public String condTxtD;// 阴晴天气

    @SerializedName("tmp_max")
    public String tmpMax;// 最高温度

    @SerializedName("tmp_min")
    public String tmpMin;// 最低温度

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCondTxtD() {
        return condTxtD;
    }

    public void setCondTxtD(String condTxtD) {
        this.condTxtD = condTxtD;
    }

    public String getTmpMax() {
        return tmpMax;
    }

    public void setTmpMax(String tmpMax) {
        this.tmpMax = tmpMax;
    }

    public String getTmpMin() {
        return tmpMin;
    }

    public void setTmpMin(String tmpMin) {
        this.tmpMin = tmpMin;
    }
}
