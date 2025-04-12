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

public final class RowMergesOosLimitedstockLayoutRefreshBinding
implements BC3 {
    public final TextView bagUpdatedInfo;
    public final TextView bagUpdatedTv;
    public final ImageView cancelTv;
    public final RecyclerView productMergeRv;
    private final CardView rootView;

    private RowMergesOosLimitedstockLayoutRefreshBinding(CardView cardView, TextView textView, TextView textView2, ImageView imageView, RecyclerView recyclerView) {
        this.rootView = cardView;
        this.bagUpdatedInfo = textView;
        this.bagUpdatedTv = textView2;
        this.cancelTv = imageView;
        this.productMergeRv = recyclerView;
    }

    public static RowMergesOosLimitedstockLayoutRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.bagUpdatedInfo;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.bagUpdatedTv;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.cancelTv;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.productMergeRv;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (RecyclerView)view;
                    if (object2 != null) {
                        Object object3 = object;
                        object3 = (CardView)((Object)object);
                        RowMergesOosLimitedstockLayoutRefreshBinding rowMergesOosLimitedstockLayoutRefreshBinding = new RowMergesOosLimitedstockLayoutRefreshBinding((CardView)((Object)object3), (TextView)view2, (TextView)view3, (ImageView)view4, (RecyclerView)object2);
                        return rowMergesOosLimitedstockLayoutRefreshBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowMergesOosLimitedstockLayoutRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowMergesOosLimitedstockLayoutRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowMergesOosLimitedstockLayoutRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_merges_oos_limitedstock_layout_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowMergesOosLimitedstockLayoutRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

