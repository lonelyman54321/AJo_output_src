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

public final class ListItemStoreBinding
implements BC3 {
    public final ImageView fcsIvStoreLogo;
    public final ImageView fcsIvStoreSelected;
    public final ConstraintLayout fcsLayoutStore;
    public final ConstraintLayout fcsTvStoreLyt;
    public final TextView fcsTvStoreText;
    public final View itemSeparator;
    public final ImageView revampStoreBanner;
    private final ConstraintLayout rootView;

    private ListItemStoreBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, TextView textView, View view, ImageView imageView3) {
        this.rootView = constraintLayout;
        this.fcsIvStoreLogo = imageView;
        this.fcsIvStoreSelected = imageView2;
        this.fcsLayoutStore = constraintLayout2;
        this.fcsTvStoreLyt = constraintLayout3;
        this.fcsTvStoreText = textView;
        this.itemSeparator = view;
        this.revampStoreBanner = imageView3;
    }

    public static ListItemStoreBinding bind(View object) {
        View view;
        int n3 = R$id.fcsIvStoreLogo;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.fcsIvStoreSelected;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                Object object2 = object;
                object2 = (ConstraintLayout)((Object)object);
                n3 = R$id.fcsTvStoreLyt;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (ConstraintLayout)view;
                if (object3 != null) {
                    View view4;
                    n3 = R$id.fcsTvStoreText;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null && (view4 = dd2_2.a(n3 = R$id.item_separator, object)) != null) {
                        n3 = R$id.revamp_store_banner;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (ImageView)view;
                        if (view6 != null) {
                            object = new ListItemStoreBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (ImageView)view3, (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), (TextView)view5, view4, (ImageView)view6);
                            return object;
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ListItemStoreBinding inflate(LayoutInflater layoutInflater) {
        return ListItemStoreBinding.inflate(layoutInflater, null, false);
    }

    public static ListItemStoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.list_item_store;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ListItemStoreBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

