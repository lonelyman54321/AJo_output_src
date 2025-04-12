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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class HomepageRatingOtherItemBinding
implements BC3 {
    public final RecyclerView homepageRateOtherPurchaseList;
    public final TextView homepageRateOtherPurchaseProduct;
    private final ConstraintLayout rootView;

    private HomepageRatingOtherItemBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView) {
        this.rootView = constraintLayout;
        this.homepageRateOtherPurchaseList = recyclerView;
        this.homepageRateOtherPurchaseProduct = textView;
    }

    public static HomepageRatingOtherItemBinding bind(View object) {
        TextView textView;
        int n3 = R$id.homepage_rate_other_purchase_list;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null && (textView = (TextView)dd2_2.a(n3 = R$id.homepage_rate_other_purchase_product, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            HomepageRatingOtherItemBinding homepageRatingOtherItemBinding = new HomepageRatingOtherItemBinding((ConstraintLayout)((Object)object), recyclerView, textView);
            return homepageRatingOtherItemBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static HomepageRatingOtherItemBinding inflate(LayoutInflater layoutInflater) {
        return HomepageRatingOtherItemBinding.inflate(layoutInflater, null, false);
    }

    public static HomepageRatingOtherItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.homepage_rating_other_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HomepageRatingOtherItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

