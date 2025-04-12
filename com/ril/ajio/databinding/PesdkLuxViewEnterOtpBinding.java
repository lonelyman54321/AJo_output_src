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

public final class PesdkLuxViewEnterOtpBinding
implements BC3 {
    public final EditText etOtp;
    public final AjioTextView lblResend;
    private final LinearLayout rootView;
    public final AjioTextView tvHeadingOtp;
    public final AjioTextView tvTime;

    private PesdkLuxViewEnterOtpBinding(LinearLayout linearLayout, EditText editText, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = linearLayout;
        this.etOtp = editText;
        this.lblResend = ajioTextView;
        this.tvHeadingOtp = ajioTextView2;
        this.tvTime = ajioTextView3;
    }

    public static PesdkLuxViewEnterOtpBinding bind(View object) {
        View view;
        int n3 = R$id.et_otp;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (EditText)view;
        if (view2 != null) {
            n3 = R$id.lbl_resend;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.tv_heading_otp;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.tv_time;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (LinearLayout)object;
                        PesdkLuxViewEnterOtpBinding pesdkLuxViewEnterOtpBinding = new PesdkLuxViewEnterOtpBinding((LinearLayout)object5, (EditText)view2, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4);
                        return pesdkLuxViewEnterOtpBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkLuxViewEnterOtpBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxViewEnterOtpBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxViewEnterOtpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_view_enter_otp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxViewEnterOtpBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

