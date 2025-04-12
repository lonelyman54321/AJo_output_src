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

public final class PdpBottomLinksBinding
implements BC3 {
    public final RecyclerView pdpBottomLinksRv;
    private final LinearLayout rootView;
    public final View rvDivider;

    private PdpBottomLinksBinding(LinearLayout linearLayout, RecyclerView recyclerView, View view) {
        this.rootView = linearLayout;
        this.pdpBottomLinksRv = recyclerView;
        this.rvDivider = view;
    }

    public static PdpBottomLinksBinding bind(View object) {
        View view;
        int n3 = R$id.pdp_bottom_links_rv;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null && (view = dd2_2.a(n3 = R$id.rv_divider, object)) != null) {
            object = (LinearLayout)object;
            PdpBottomLinksBinding pdpBottomLinksBinding = new PdpBottomLinksBinding((LinearLayout)object, recyclerView, view);
            return pdpBottomLinksBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PdpBottomLinksBinding inflate(LayoutInflater layoutInflater) {
        return PdpBottomLinksBinding.inflate(layoutInflater, null, false);
    }

    public static PdpBottomLinksBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_bottom_links;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpBottomLinksBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

