/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCcRatingRefreshBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final ImageView rowCcRatingRbDislike;
    public final LinearLayout rowCcRatingRbGroup;
    public final ImageView rowCcRatingRbLike;
    public final TextView rowCcRatingTv;

    private RowCcRatingRefreshBinding(ConstraintLayout constraintLayout, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, TextView textView) {
        this.rootView = constraintLayout;
        this.rowCcRatingRbDislike = imageView;
        this.rowCcRatingRbGroup = linearLayout;
        this.rowCcRatingRbLike = imageView2;
        this.rowCcRatingTv = textView;
    }

    public static RowCcRatingRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.row_cc_rating_rb_dislike;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.row_cc_rating_rb_group;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.row_cc_rating_rb_like;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.row_cc_rating_tv;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (ConstraintLayout)((Object)object);
                        RowCcRatingRefreshBinding rowCcRatingRefreshBinding = new RowCcRatingRefreshBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (LinearLayout)view3, (ImageView)view4, (TextView)view5);
                        return rowCcRatingRefreshBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCcRatingRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcRatingRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcRatingRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_rating_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcRatingRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

