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
import com.ril.ajio.customviews.widgets.AjioButton;

public final class RowCcItemhelpButtonTextRefreshBinding
implements BC3 {
    private final LinearLayout rootView;
    public final AjioButton rowCcitemhelpHeaderBtn;
    public final LinearLayout rowCcitemhelpHeaderBtnContainer;

    private RowCcItemhelpButtonTextRefreshBinding(LinearLayout linearLayout, AjioButton ajioButton, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.rowCcitemhelpHeaderBtn = ajioButton;
        this.rowCcitemhelpHeaderBtnContainer = linearLayout2;
    }

    public static RowCcItemhelpButtonTextRefreshBinding bind(View object) {
        int n3 = R$id.row_ccitemhelp_header_btn;
        AjioButton ajioButton = (AjioButton)dd2_2.a(n3, object);
        if (ajioButton != null) {
            object = (LinearLayout)object;
            RowCcItemhelpButtonTextRefreshBinding rowCcItemhelpButtonTextRefreshBinding = new RowCcItemhelpButtonTextRefreshBinding((LinearLayout)object, ajioButton, (LinearLayout)object);
            return rowCcItemhelpButtonTextRefreshBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCcItemhelpButtonTextRefreshBinding inflate(LayoutInflater layoutInflater) {
        return RowCcItemhelpButtonTextRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static RowCcItemhelpButtonTextRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cc_itemhelp_button_text_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCcItemhelpButtonTextRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

