package com.greenguide.dlsu.greenguide;

import com.bignerdranch.expandablerecyclerview.Model.ParentListItem;

import java.util.List;

/**
 * Created by jasonsioco on 8/10/2016.
 */
public class ExpandableParentListItem implements ParentListItem{
    private String mTitle;
    private List<ExpandableChildListItem> mChildItemList;

    public ExpandableParentListItem(String title) {
        setmTitle(title);
    }

    @Override
    public List<ExpandableChildListItem> getChildItemList() {
        return getmChildItemList();
    }

    public void setChildItemList(List<ExpandableChildListItem> list) {
        setmChildItemList(list);
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public List<ExpandableChildListItem> getmChildItemList() {
        return mChildItemList;
    }

    public void setmChildItemList(List<ExpandableChildListItem> mChildItemList) {
        this.mChildItemList = mChildItemList;
    }
}
