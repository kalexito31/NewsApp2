package com.example.android.newsapp2;

/**
 * Created by Kevin on 7/11/2017.
 */

public class News {

    private String mTitle;
    private String mDate;
    private String mSection;
    private String mUrl;

    public News(String Title, String Date, String Section, String Url) {
        this.mTitle = Title;
        this.mDate = Date;
        this.mSection = Section;
        this.mUrl = Url;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getDate() {
        return mDate;
    }

    public String getSection() {
        return mSection;
    }

    public String getUrl() {
        return mUrl;
    }
}
