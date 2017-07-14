package com.greenguide.dlsu.greenguide.adapter.expandable;

/**
 * Created by jasonsioco on 8/10/2016.
 */

public class ExpandableChildListItem {

    private final String mTitle;
    private final String mDetails;

    public ExpandableChildListItem(String mTitle,String mDetails) {
        this.mTitle = mTitle;
        this.mDetails = mDetails;
    }

    public String getmTitle() {
        return mTitle;
    }


    public String getmDetails() {
        return mDetails;
    }
}