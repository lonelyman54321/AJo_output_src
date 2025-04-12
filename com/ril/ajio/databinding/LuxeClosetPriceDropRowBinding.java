/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeClosetPriceDropRowBinding
implements BC3 {
    public final ImageView ivClose;
    public final ImageView ivTypeIndicator;
    public final RecyclerView mergeOosProductList;
    private final CardView rootView;
    public final AjioTextView tvMergeOosLabel;
    public final AjioTextView tvMergeOosMessage;

    private LuxeClosetPriceDropRowBinding(CardView cardView, ImageView imageView, ImageView imageView2, RecyclerView recyclerView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = cardView;
        this.ivClose = imageView;
        this.ivTypeIndicator = imageView2;
        this.mergeOosProductList = recyclerView;
        this.tvMergeOosLabel = ajioTextView;
        this.tvMergeOosMessage = ajioTextView2;
    }

    public static LuxeClosetPriceDropRowBinding bind(View object) {
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
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.tv_merge_oos_message;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            Object object5 = object;
                            object5 = (CardView)((Object)object);
                            LuxeClosetPriceDropRowBinding luxeClosetPriceDropRowBinding = new LuxeClosetPriceDropRowBinding((CardView)((Object)object5), (ImageView)view2, (ImageView)view3, (RecyclerView)object2, (AjioTextView)object3, (AjioTextView)object4);
                            return luxeClosetPriceDropRowBinding;
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

    public static LuxeClosetPriceDropRowBinding inflate(LayoutInflater layoutInflater) {
        return LuxeClosetPriceDropRowBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeClosetPriceDropRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_closet_price_drop_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeClosetPriceDropRowBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

