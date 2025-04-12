/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LayoutNoInternetPlpBinding
implements BC3 {
    public final Button btnRetry;
    private final ConstraintLayout rootView;
    public final TextView tvDesc;
    public final TextView tvTitle;

    private LayoutNoInternetPlpBinding(ConstraintLayout constraintLayout, Button button, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.btnRetry = button;
        this.tvDesc = textView;
        this.tvTitle = textView2;
    }

    public static LayoutNoInternetPlpBinding bind(View object) {
        TextView textView;
        TextView textView2;
        int n3 = R$id.btn_retry;
        Button button = (Button)dd2_2.a(n3, object);
        if (button != null && (textView2 = (TextView)dd2_2.a(n3 = R$id.tv_desc, object)) != null && (textView = (TextView)dd2_2.a(n3 = R$id.tv_title, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            LayoutNoInternetPlpBinding layoutNoInternetPlpBinding = new LayoutNoInternetPlpBinding((ConstraintLayout)((Object)object), button, textView2, textView);
            return layoutNoInternetPlpBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LayoutNoInternetPlpBinding inflate(LayoutInflater layoutInflater) {
        return LayoutNoInternetPlpBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutNoInternetPlpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_no_internet_plp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutNoInternetPlpBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

