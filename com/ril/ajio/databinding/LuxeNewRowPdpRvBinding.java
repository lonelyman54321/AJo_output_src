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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxeNewRowPdpRvBinding
implements BC3 {
    public final LinearLayout parentRecentlyViewed;
    public final RecyclerView pdoRvRecentlyViewed;
    private final ConstraintLayout rootView;
    public final AjioTextView rvTitle;

    private LuxeNewRowPdpRvBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, RecyclerView recyclerView, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.parentRecentlyViewed = linearLayout;
        this.pdoRvRecentlyViewed = recyclerView;
        this.rvTitle = ajioTextView;
    }

    public static LuxeNewRowPdpRvBinding bind(View object) {
        AjioTextView ajioTextView;
        RecyclerView recyclerView;
        int n3 = R$id.parent_recently_viewed;
        LinearLayout linearLayout = (LinearLayout)dd2_2.a(n3, object);
        if (linearLayout != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.pdo_rv_recently_viewed, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.rv_title, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            LuxeNewRowPdpRvBinding luxeNewRowPdpRvBinding = new LuxeNewRowPdpRvBinding((ConstraintLayout)((Object)object), linearLayout, recyclerView, ajioTextView);
            return luxeNewRowPdpRvBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxeNewRowPdpRvBinding inflate(LayoutInflater layoutInflater) {
        return LuxeNewRowPdpRvBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeNewRowPdpRvBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_new_row_pdp_rv;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeNewRowPdpRvBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

