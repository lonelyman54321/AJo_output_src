/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ShopTheLookHomeLayoutBinding
implements BC3 {
    public final ImageView imgStlPlay;
    private final RelativeLayout rootView;
    public final ImageView stlIv;
    public final ImageView stlProductIv;
    public final RelativeLayout stlProductViewRl;
    public final TextView stlTv;
    public final RelativeLayout stlVideoInfo;
    public final TextView txtDuration;

    private ShopTheLookHomeLayoutBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout2, TextView textView, RelativeLayout relativeLayout3, TextView textView2) {
        this.rootView = relativeLayout;
        this.imgStlPlay = imageView;
        this.stlIv = imageView2;
        this.stlProductIv = imageView3;
        this.stlProductViewRl = relativeLayout2;
        this.stlTv = textView;
        this.stlVideoInfo = relativeLayout3;
        this.txtDuration = textView2;
    }

    public static ShopTheLookHomeLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.imgStlPlay;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.stlIv;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.stlProductIv;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    Object object2 = object;
                    object2 = (RelativeLayout)object;
                    n3 = R$id.stlTv;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.stlVideoInfo;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (RelativeLayout)view;
                        if (view6 != null) {
                            n3 = R$id.txtDuration;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (TextView)view;
                            if (view7 != null) {
                                object = new ShopTheLookHomeLayoutBinding((RelativeLayout)object2, (ImageView)view2, (ImageView)view3, (ImageView)view4, (RelativeLayout)object2, (TextView)view5, (RelativeLayout)view6, (TextView)view7);
                                return object;
                            }
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

    public static ShopTheLookHomeLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ShopTheLookHomeLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ShopTheLookHomeLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shop_the_look_home_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShopTheLookHomeLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

