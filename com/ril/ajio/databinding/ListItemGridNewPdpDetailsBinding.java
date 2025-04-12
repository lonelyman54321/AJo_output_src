/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ListItemGridNewPdpDetailsBinding
implements BC3 {
    public final View pdpDetailView;
    private final ConstraintLayout rootView;
    public final AjioTextView tvKey1;
    public final AjioTextView tvValue1;

    private ListItemGridNewPdpDetailsBinding(ConstraintLayout constraintLayout, View view, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.pdpDetailView = view;
        this.tvKey1 = ajioTextView;
        this.tvValue1 = ajioTextView2;
    }

    public static ListItemGridNewPdpDetailsBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        int n3 = R$id.pdp_detail_view;
        View view = dd2_2.a(n3, object);
        if (view != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.tvKey1, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tvValue1, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            ListItemGridNewPdpDetailsBinding listItemGridNewPdpDetailsBinding = new ListItemGridNewPdpDetailsBinding((ConstraintLayout)((Object)object), view, ajioTextView2, ajioTextView);
            return listItemGridNewPdpDetailsBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ListItemGridNewPdpDetailsBinding inflate(LayoutInflater layoutInflater) {
        return ListItemGridNewPdpDetailsBinding.inflate(layoutInflater, null, false);
    }

    public static ListItemGridNewPdpDetailsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.list_item_grid_new_pdp_details;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ListItemGridNewPdpDetailsBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

