/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class UsefulLinksItemBinding
implements BC3 {
    private final LinearLayout rootView;
    public final RecyclerView usefulLinksRv;

    private UsefulLinksItemBinding(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.usefulLinksRv = recyclerView;
    }

    public static UsefulLinksItemBinding bind(View object) {
        int n3 = R$id.useful_links_rv;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null) {
            object = (LinearLayout)object;
            UsefulLinksItemBinding usefulLinksItemBinding = new UsefulLinksItemBinding((LinearLayout)object, recyclerView);
            return usefulLinksItemBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static UsefulLinksItemBinding inflate(LayoutInflater layoutInflater) {
        return UsefulLinksItemBinding.inflate(layoutInflater, null, false);
    }

    public static UsefulLinksItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.useful_links_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return UsefulLinksItemBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

