/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCcFaqRefreshBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final ImageView rowCcFaqImg;
    public final ConstraintLayout rowCcFaqLayout;
    public final TextView rowCcFaqTv;

    private RowCcFaqRefreshBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, TextView textView) {
        this.rootView = constraintLayout;
        this.rowCcFaqImg = imageView;
        this.rowCcFaqLayout = constraintLayout2;
        this.rowCcFaqTv = textView;
    }

    public static RowCcFaqRefreshBinding bind(View object) {
        Object object2;
        int n3 = R$id.row_cc_faq_img;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null) {
            object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            int n4 = R$id.row_cc_faq_tv;
            TextView textView = (TextView)dd2_2.a(n4, object);
            if (textView != null) {
                object = new RowCcFaqRefreshBinding((ConstraintLayout)((Object)object2), imageView, (ConstraintLayout)((Object)object2), textView);
                return object;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static RowCcFaqRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcFaqRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcFaqRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_faq_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcFaqRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

