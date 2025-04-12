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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowPricedropLayoutRefreshBinding
implements BC3 {
    public final ImageView ivClose;
    public final ImageView ivTypeIndicator;
    public final RecyclerView mergeOosProductList;
    private final CardView rootView;
    public final TextView tvMergeOosLabel;
    public final TextView tvMergeOosMessage;

    private RowPricedropLayoutRefreshBinding(CardView cardView, ImageView imageView, ImageView imageView2, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = cardView;
        this.ivClose = imageView;
        this.ivTypeIndicator = imageView2;
        this.mergeOosProductList = recyclerView;
        this.tvMergeOosLabel = textView;
        this.tvMergeOosMessage = textView2;
    }

    public static RowPricedropLayoutRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.iv_close;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.iv_type_indicator;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.merge_oos_product_list;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (RecyclerView)view;
                if (object2 != null) {
                    n3 = R$id.tv_merge_oos_label;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        n3 = R$id.tv_merge_oos_message;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (TextView)view;
                        if (view5 != null) {
                            Object object3 = object;
                            object3 = (CardView)((Object)object);
                            RowPricedropLayoutRefreshBinding rowPricedropLayoutRefreshBinding = new RowPricedropLayoutRefreshBinding((CardView)((Object)object3), (ImageView)view2, (ImageView)view3, (RecyclerView)object2, (TextView)view4, (TextView)view5);
                            return rowPricedropLayoutRefreshBinding;
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

    public static RowPricedropLayoutRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowPricedropLayoutRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowPricedropLayoutRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_pricedrop_layout_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowPricedropLayoutRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

