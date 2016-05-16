package com.mobileapps.jera.listtworows;

/**
 * Created by jera on 5/14/16.
 */
public class ListViewItem {
    private String text;
    private int type;

    public ListViewItem(String text, int type) {
        this.text = text;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

}