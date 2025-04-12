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

public final class EmptyWishlistRefreshBinding
implements BC3 {
    public final ImageView emptyWishlistIcon;
    public final TextView gotoBag;
    private final LinearLayout rootView;
    public final TextView wishListEmptyMsg;
    public final TextView wishlistEmptyTv;

    private EmptyWishlistRefreshBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.emptyWishlistIcon = imageView;
        this.gotoBag = textView;
        this.wishListEmptyMsg = textView2;
        this.wishlistEmptyTv = textView3;
    }

    public static EmptyWishlistRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.emptyWishlistIcon;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.gotoBag;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.wishListEmptyMsg;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.wishlistEmptyTv;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (LinearLayout)object;
                        EmptyWishlistRefreshBinding emptyWishlistRefreshBinding = new EmptyWishlistRefreshBinding((LinearLayout)object2, (ImageView)view2, (TextView)view3, (TextView)view4, (TextView)view5);
                        return emptyWishlistRefreshBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static EmptyWishlistRefreshBinding inflate(LayoutInflater layoutInflater) {
        return EmptyWishlistRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static EmptyWishlistRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.empty_wishlist_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return EmptyWishlistRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

