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

public final class RowTwoImageTextBinding
implements BC3 {
    public final ImageView infoImage;
    public final ImageView infoImage1;
    private final ConstraintLayout rootView;
    public final TextView subtitleTextview;
    public final TextView titleTextview;

    private RowTwoImageTextBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.infoImage = imageView;
        this.infoImage1 = imageView2;
        this.subtitleTextview = textView;
        this.titleTextview = textView2;
    }

    public static RowTwoImageTextBinding bind(View object) {
        View view;
        int n3 = R$id.info_image;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.info_image_1;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.subtitle_textview;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.title_textview;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (ConstraintLayout)((Object)object);
                        RowTwoImageTextBinding rowTwoImageTextBinding = new RowTwoImageTextBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (ImageView)view3, (TextView)view4, (TextView)view5);
                        return rowTwoImageTextBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowTwoImageTextBinding inflate(LayoutInflater layoutInflater) {
        return RowTwoImageTextBinding.inflate(layoutInflater, null, false);
    }

    public static RowTwoImageTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_two_image_text;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowTwoImageTextBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

