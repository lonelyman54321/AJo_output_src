/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ShopTheLookListLayoutBinding
implements BC3 {
    private final RelativeLayout rootView;
    public final RecyclerView stlHList;
    public final RelativeLayout stlParent;
    public final TextView stlTitleTv;

    private ShopTheLookListLayoutBinding(RelativeLayout relativeLayout, RecyclerView recyclerView, RelativeLayout relativeLayout2, TextView textView) {
        this.rootView = relativeLayout;
        this.stlHList = recyclerView;
        this.stlParent = relativeLayout2;
        this.stlTitleTv = textView;
    }

    public static ShopTheLookListLayoutBinding bind(View object) {
        Object object2;
        int n3 = R$id.stlHList;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null) {
            object2 = object;
            object2 = (RelativeLayout)object;
            int n4 = R$id.stlTitleTv;
            TextView textView = (TextView)dd2_2.a(n4, object);
            if (textView != null) {
                object = new ShopTheLookListLayoutBinding((RelativeLayout)object2, recyclerView, (RelativeLayout)object2, textView);
                return object;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static ShopTheLookListLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ShopTheLookListLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ShopTheLookListLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shop_the_look_list_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShopTheLookListLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

