/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.ItemCcImagesRefreshBinding;

public final class RowCcProductRefreshBinding
implements BC3 {
    public final ItemCcImagesRefreshBinding imageList;
    private final CardView rootView;
    public final CardView rowCcProduct;
    public final TextView rowCcProductTvDelivery;
    public final TextView rowCcProductTvOrderId;
    public final TextView rowCcProductTvStatus;
    public final TextView rowCcProductTvTotalItems;

    private RowCcProductRefreshBinding(CardView cardView, ItemCcImagesRefreshBinding itemCcImagesRefreshBinding, CardView cardView2, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = cardView;
        this.imageList = itemCcImagesRefreshBinding;
        this.rowCcProduct = cardView2;
        this.rowCcProductTvDelivery = textView;
        this.rowCcProductTvOrderId = textView2;
        this.rowCcProductTvStatus = textView3;
        this.rowCcProductTvTotalItems = textView4;
    }

    public static RowCcProductRefreshBinding bind(View object) {
        int n3 = R$id.imageList;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            ItemCcImagesRefreshBinding itemCcImagesRefreshBinding = ItemCcImagesRefreshBinding.bind(view);
            Object object2 = object;
            object2 = (CardView)((Object)object);
            n3 = R$id.row_cc_product_tv_delivery;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (TextView)view;
            if (view2 != null) {
                n3 = R$id.row_cc_product_tv_orderId;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (TextView)view;
                if (view3 != null) {
                    n3 = R$id.row_cc_product_tv_status;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        n3 = R$id.row_cc_product_tv_total_items;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (TextView)view;
                        if (view5 != null) {
                            object = new RowCcProductRefreshBinding((CardView)((Object)object2), itemCcImagesRefreshBinding, (CardView)((Object)object2), (TextView)view2, (TextView)view3, (TextView)view4, (TextView)view5);
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

    public static RowCcProductRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcProductRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcProductRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_product_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcProductRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

