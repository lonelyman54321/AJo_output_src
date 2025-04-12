/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowOrderlistShimmerOneBinding
implements BC3 {
    public final CardView cardView;
    private final LinearLayout rootView;
    public final ImageView viewFour;
    public final View viewOne;
    public final View viewTwo;

    private RowOrderlistShimmerOneBinding(LinearLayout linearLayout, CardView cardView, ImageView imageView, View view, View view2) {
        this.rootView = linearLayout;
        this.cardView = cardView;
        this.viewFour = imageView;
        this.viewOne = view;
        this.viewTwo = view2;
    }

    public static RowOrderlistShimmerOneBinding bind(View object) {
        View view;
        int n3 = R$id.card_view;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (CardView)view;
        if (object2 != null) {
            View view2;
            View view3;
            n3 = R$id.view_four;
            View view4 = view = dd2_2.a(n3, object);
            view4 = (ImageView)view;
            if (view4 != null && (view3 = dd2_2.a(n3 = R$id.view_one, object)) != null && (view2 = dd2_2.a(n3 = R$id.view_two, object)) != null) {
                Object object3 = object;
                object3 = (LinearLayout)object;
                RowOrderlistShimmerOneBinding rowOrderlistShimmerOneBinding = new RowOrderlistShimmerOneBinding((LinearLayout)object3, (CardView)((Object)object2), (ImageView)view4, view3, view2);
                return rowOrderlistShimmerOneBinding;
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowOrderlistShimmerOneBinding inflate(LayoutInflater layoutInflater) {
        return RowOrderlistShimmerOneBinding.inflate(layoutInflater, null, false);
    }

    public static RowOrderlistShimmerOneBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_orderlist_shimmer_one;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowOrderlistShimmerOneBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

