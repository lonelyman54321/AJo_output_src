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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class HeaderConsignmentBinding
implements BC3 {
    public final AjioTextView consignmentName;
    private final LinearLayout rootView;

    private HeaderConsignmentBinding(LinearLayout linearLayout, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.consignmentName = ajioTextView;
    }

    public static HeaderConsignmentBinding bind(View object) {
        int n3 = R$id.consignment_name;
        AjioTextView ajioTextView = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView != null) {
            object = (LinearLayout)object;
            HeaderConsignmentBinding headerConsignmentBinding = new HeaderConsignmentBinding((LinearLayout)object, ajioTextView);
            return headerConsignmentBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static HeaderConsignmentBinding inflate(LayoutInflater layoutInflater) {
        return HeaderConsignmentBinding.inflate(layoutInflater, null, false);
    }

    public static HeaderConsignmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.header_consignment;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HeaderConsignmentBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

