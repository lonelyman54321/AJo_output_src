/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PlpSelectedQuickFilterClearAllLayoutBinding
implements BC3 {
    public final TextView clearAllTv;
    public final RelativeLayout rootRl;
    private final RelativeLayout rootView;

    private PlpSelectedQuickFilterClearAllLayoutBinding(RelativeLayout relativeLayout, TextView textView, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.clearAllTv = textView;
        this.rootRl = relativeLayout2;
    }

    public static PlpSelectedQuickFilterClearAllLayoutBinding bind(View object) {
        int n3 = R$id.clear_all_tv;
        TextView textView = (TextView)dd2_2.a(n3, object);
        if (textView != null) {
            object = (RelativeLayout)object;
            PlpSelectedQuickFilterClearAllLayoutBinding plpSelectedQuickFilterClearAllLayoutBinding = new PlpSelectedQuickFilterClearAllLayoutBinding((RelativeLayout)object, textView, (RelativeLayout)object);
            return plpSelectedQuickFilterClearAllLayoutBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpSelectedQuickFilterClearAllLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PlpSelectedQuickFilterClearAllLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PlpSelectedQuickFilterClearAllLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_selected_quick_filter_clear_all_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpSelectedQuickFilterClearAllLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

