/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEProgressView;
import com.ril.ajio.databinding.PesdkViewEnterMobileNumberBinding;
import com.ril.ajio.databinding.PesdkViewEnterOtpBinding;

public final class PesdkMobileOtpBottomSheetBinding
implements BC3 {
    public final AjioTextView btnSubmit;
    public final ImageView imvClose;
    public final PesdkViewEnterMobileNumberBinding mobileLayout;
    public final AjioTextView mobileOtpTitle;
    public final PesdkViewEnterOtpBinding otpLayout;
    public final PEProgressView paymentProgressBar;
    private final FrameLayout rootView;

    private PesdkMobileOtpBottomSheetBinding(FrameLayout frameLayout, AjioTextView ajioTextView, ImageView imageView, PesdkViewEnterMobileNumberBinding pesdkViewEnterMobileNumberBinding, AjioTextView ajioTextView2, PesdkViewEnterOtpBinding pesdkViewEnterOtpBinding, PEProgressView pEProgressView) {
        this.rootView = frameLayout;
        this.btnSubmit = ajioTextView;
        this.imvClose = imageView;
        this.mobileLayout = pesdkViewEnterMobileNumberBinding;
        this.mobileOtpTitle = ajioTextView2;
        this.otpLayout = pesdkViewEnterOtpBinding;
        this.paymentProgressBar = pEProgressView;
    }

    public static PesdkMobileOtpBottomSheetBinding bind(View object) {
        View view;
        int n3 = R$id.btn_submit;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.imv_close;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null && (view = dd2_2.a(n3 = R$id.mobile_layout, object)) != null) {
                PesdkViewEnterMobileNumberBinding pesdkViewEnterMobileNumberBinding = PesdkViewEnterMobileNumberBinding.bind(view);
                n3 = R$id.mobile_otp_title;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null && (view = dd2_2.a(n3 = R$id.otp_layout, object)) != null) {
                    PesdkViewEnterOtpBinding pesdkViewEnterOtpBinding = PesdkViewEnterOtpBinding.bind(view);
                    n3 = R$id.payment_progress_bar;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (PEProgressView)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (FrameLayout)object;
                        PesdkMobileOtpBottomSheetBinding pesdkMobileOtpBottomSheetBinding = new PesdkMobileOtpBottomSheetBinding((FrameLayout)object5, (AjioTextView)object2, (ImageView)view2, pesdkViewEnterMobileNumberBinding, (AjioTextView)object3, pesdkViewEnterOtpBinding, (PEProgressView)((Object)object4));
                        return pesdkMobileOtpBottomSheetBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkMobileOtpBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return PesdkMobileOtpBottomSheetBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkMobileOtpBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_mobile_otp_bottom_sheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkMobileOtpBottomSheetBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

