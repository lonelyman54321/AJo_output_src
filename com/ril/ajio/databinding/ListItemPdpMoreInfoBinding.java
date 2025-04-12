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

public final class ListItemPdpMoreInfoBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final AjioTextView tvKey;
    public final AjioTextView tvValue;

    private ListItemPdpMoreInfoBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.tvKey = ajioTextView;
        this.tvValue = ajioTextView2;
    }

    public static ListItemPdpMoreInfoBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.tv_key;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tv_value, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            ListItemPdpMoreInfoBinding listItemPdpMoreInfoBinding = new ListItemPdpMoreInfoBinding((ConstraintLayout)((Object)object), ajioTextView2, ajioTextView);
            return listItemPdpMoreInfoBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ListItemPdpMoreInfoBinding inflate(LayoutInflater layoutInflater) {
        return ListItemPdpMoreInfoBinding.inflate(layoutInflater, null, false);
    }

    public static ListItemPdpMoreInfoBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.list_item_pdp_more_info;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ListItemPdpMoreInfoBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

