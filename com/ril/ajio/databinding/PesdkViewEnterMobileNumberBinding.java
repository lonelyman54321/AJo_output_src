/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.EditText
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkViewEnterMobileNumberBinding
implements BC3 {
    public final EditText etMobile;
    private final LinearLayout rootView;
    public final AjioTextView tvCardnumber;

    private PesdkViewEnterMobileNumberBinding(LinearLayout linearLayout, EditText editText, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.etMobile = editText;
        this.tvCardnumber = ajioTextView;
    }

    public static PesdkViewEnterMobileNumberBinding bind(View object) {
        AjioTextView ajioTextView;
        int n3 = R$id.et_mobile;
        EditText editText = (EditText)dd2_2.a(n3, object);
        if (editText != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tv_cardnumber, object)) != null) {
            object = (LinearLayout)object;
            PesdkViewEnterMobileNumberBinding pesdkViewEnterMobileNumberBinding = new PesdkViewEnterMobileNumberBinding((LinearLayout)object, editText, ajioTextView);
            return pesdkViewEnterMobileNumberBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkViewEnterMobileNumberBinding inflate(LayoutInflater layoutInflater) {
        return PesdkViewEnterMobileNumberBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkViewEnterMobileNumberBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_view_enter_mobile_number;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkViewEnterMobileNumberBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

