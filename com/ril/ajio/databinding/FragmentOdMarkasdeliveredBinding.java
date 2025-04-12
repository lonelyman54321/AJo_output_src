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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentOdMarkasdeliveredBinding
implements BC3 {
    public final ImageView odMarkasdeliveredImvClose;
    public final AjioTextView odMarkasdeliveredTvDesc;
    public final TextView odMarkasdeliveredTvOk;
    private final LinearLayout rootView;

    private FragmentOdMarkasdeliveredBinding(LinearLayout linearLayout, ImageView imageView, AjioTextView ajioTextView, TextView textView) {
        this.rootView = linearLayout;
        this.odMarkasdeliveredImvClose = imageView;
        this.odMarkasdeliveredTvDesc = ajioTextView;
        this.odMarkasdeliveredTvOk = textView;
    }

    public static FragmentOdMarkasdeliveredBinding bind(View object) {
        TextView textView;
        AjioTextView ajioTextView;
        int n3 = R$id.od_markasdelivered_imv_close;
        ImageView imageView = (ImageView)dd2_2.a(n3, object);
        if (imageView != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.od_markasdelivered_tv_desc, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.od_markasdelivered_tv_ok, object)) != null) {
            object = (LinearLayout)object;
            FragmentOdMarkasdeliveredBinding fragmentOdMarkasdeliveredBinding = new FragmentOdMarkasdeliveredBinding((LinearLayout)object, imageView, ajioTextView, textView);
            return fragmentOdMarkasdeliveredBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentOdMarkasdeliveredBinding inflate(LayoutInflater layoutInflater) {
        return FragmentOdMarkasdeliveredBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentOdMarkasdeliveredBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_od_markasdelivered;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentOdMarkasdeliveredBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

