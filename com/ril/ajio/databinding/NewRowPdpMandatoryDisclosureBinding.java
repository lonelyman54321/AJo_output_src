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

public final class NewRowPdpMandatoryDisclosureBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioTextView rowPdpDisclosuresTvName;
    public final AjioTextView rowPdpDisclosuresTvValue;

    private NewRowPdpMandatoryDisclosureBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.rowPdpDisclosuresTvName = ajioTextView;
        this.rowPdpDisclosuresTvValue = ajioTextView2;
    }

    public static NewRowPdpMandatoryDisclosureBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.row_pdp_disclosures_tv_name;
        AjioTextView ajioTextView2 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView2 != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.row_pdp_disclosures_tv_value, object)) != null) {
            object = (LinearLayout)object;
            NewRowPdpMandatoryDisclosureBinding newRowPdpMandatoryDisclosureBinding = new NewRowPdpMandatoryDisclosureBinding((LinearLayout)object, ajioTextView2, ajioTextView);
            return newRowPdpMandatoryDisclosureBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewRowPdpMandatoryDisclosureBinding inflate(LayoutInflater layoutInflater) {
        return NewRowPdpMandatoryDisclosureBinding.inflate(layoutInflater, null, false);
    }

    public static NewRowPdpMandatoryDisclosureBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_row_pdp_mandatory_disclosure;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewRowPdpMandatoryDisclosureBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

