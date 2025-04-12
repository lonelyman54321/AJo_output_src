/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LoadMoreLayoutBinding
implements BC3 {
    public final RelativeLayout footerCategory;
    public final ProgressBar loadMore;
    private final RelativeLayout rootView;

    private LoadMoreLayoutBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, ProgressBar progressBar) {
        this.rootView = relativeLayout;
        this.footerCategory = relativeLayout2;
        this.loadMore = progressBar;
    }

    public static LoadMoreLayoutBinding bind(View object) {
        Object object2 = object;
        object2 = (RelativeLayout)object;
        int n3 = R$id.loadMore;
        ProgressBar progressBar = (ProgressBar)dd2_2.a(n3, object);
        if (progressBar != null) {
            object = new LoadMoreLayoutBinding((RelativeLayout)object2, (RelativeLayout)object2, progressBar);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static LoadMoreLayoutBinding inflate(LayoutInflater layoutInflater) {
        return LoadMoreLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LoadMoreLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.load_more_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LoadMoreLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

