/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PlpSettingsQuickFilterItemViewBinding
implements BC3 {
    public final ImageView filterIconIv;
    public final TextView filterNameTv;
    public final RelativeLayout layoutRelativeQuickFilter;
    public final LinearLayout llView;
    public final RelativeLayout rootRl;
    private final RelativeLayout rootView;

    private PlpSettingsQuickFilterItemViewBinding(RelativeLayout relativeLayout, ImageView imageView, TextView textView, RelativeLayout relativeLayout2, LinearLayout linearLayout, RelativeLayout relativeLayout3) {
        this.rootView = relativeLayout;
        this.filterIconIv = imageView;
        this.filterNameTv = textView;
        this.layoutRelativeQuickFilter = relativeLayout2;
        this.llView = linearLayout;
        this.rootRl = relativeLayout3;
    }

    public static PlpSettingsQuickFilterItemViewBinding bind(View object) {
        View view;
        int n3 = R$id.filter_icon_iv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.filter_name_tv;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.layout_relative_quick_filter;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (RelativeLayout)view;
                if (view4 != null) {
                    n3 = R$id.ll_view;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (LinearLayout)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (RelativeLayout)object;
                        object = new PlpSettingsQuickFilterItemViewBinding((RelativeLayout)object2, (ImageView)view2, (TextView)view3, (RelativeLayout)view4, (LinearLayout)view5, (RelativeLayout)object2);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpSettingsQuickFilterItemViewBinding inflate(LayoutInflater layoutInflater) {
        return PlpSettingsQuickFilterItemViewBinding.inflate(layoutInflater, null, false);
    }

    public static PlpSettingsQuickFilterItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_settings_quick_filter_item_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpSettingsQuickFilterItemViewBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

