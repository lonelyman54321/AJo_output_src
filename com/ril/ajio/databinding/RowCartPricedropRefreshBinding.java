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
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCartPricedropRefreshBinding
implements BC3 {
    public final ImageView priceDropCloseIv;
    public final TextView priceDropHeader;
    public final TextView priceDropInfo;
    private final CardView rootView;
    public final ImageView rupeeImg;

    private RowCartPricedropRefreshBinding(CardView cardView, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
        this.rootView = cardView;
        this.priceDropCloseIv = imageView;
        this.priceDropHeader = textView;
        this.priceDropInfo = textView2;
        this.rupeeImg = imageView2;
    }

    public static RowCartPricedropRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.priceDropCloseIv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.priceDropHeader;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.priceDropInfo;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.rupeeImg;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (ImageView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (CardView)((Object)object);
                        RowCartPricedropRefreshBinding rowCartPricedropRefreshBinding = new RowCartPricedropRefreshBinding((CardView)((Object)object2), (ImageView)view2, (TextView)view3, (TextView)view4, (ImageView)view5);
                        return rowCartPricedropRefreshBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCartPricedropRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCartPricedropRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartPricedropRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_pricedrop_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartPricedropRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

