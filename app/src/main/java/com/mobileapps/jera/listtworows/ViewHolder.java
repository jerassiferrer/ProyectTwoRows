package com.mobileapps.jera.listtworows;

import android.widget.TextView;

/**
 * Created by jera on 5/14/16.
 */
public class ViewHolder {
    TextView text;

    public ViewHolder(TextView text) {
        this.text = text;
    }

    public TextView getText() {
        return text;
    }

    public void setText(TextView text) {
        this.text = text;
    }

}
