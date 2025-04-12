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

public final class LuxeFooterLinkMainViewBinding
implements BC3 {
    public final RecyclerView pdpFooterLinksRv;
    private final LinearLayout rootView;

    private LuxeFooterLinkMainViewBinding(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.pdpFooterLinksRv = recyclerView;
    }

    public static LuxeFooterLinkMainViewBinding bind(View object) {
        int n3 = R$id.pdp_footer_links_rv;
        RecyclerView recyclerView = (RecyclerView)dd2_2.a(n3, object);
        if (recyclerView != null) {
            object = (LinearLayout)object;
            LuxeFooterLinkMainViewBinding luxeFooterLinkMainViewBinding = new LuxeFooterLinkMainViewBinding((LinearLayout)object, recyclerView);
            return luxeFooterLinkMainViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxeFooterLinkMainViewBinding inflate(LayoutInflater layoutInflater) {
        return LuxeFooterLinkMainViewBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeFooterLinkMainViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_footer_link_main_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeFooterLinkMainViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

