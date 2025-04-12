/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioProgressView;

public final class VerifyOtpBottomSheetLuxeBinding
implements BC3 {
    public final AjioLoaderView ajioLoaderView;
    public final AppCompatImageView closeDialog;
    public final TextView confirmOtpBtn;
    public final TextView errorMsg;
    public final TextInputEditText otpEditText;
    public final TextInputLayout otpEditTextInput;
    public final TextView otpHeader;
    public final AjioProgressView progressBar;
    public final TextView redemptionTv;
    public final TextView resendOtp;
    public final TextView resendOtpIn;
    public final TextView resendOtpTime;
    private final ConstraintLayout rootView;
    public final TextView validMsg;

    private VerifyOtpBottomSheetLuxeBinding(ConstraintLayout constraintLayout, AjioLoaderView ajioLoaderView, AppCompatImageView appCompatImageView, TextView textView, TextView textView2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, TextView textView3, AjioProgressView ajioProgressView, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
        this.rootView = constraintLayout;
        this.ajioLoaderView = ajioLoaderView;
        this.closeDialog = appCompatImageView;
        this.confirmOtpBtn = textView;
        this.errorMsg = textView2;
        this.otpEditText = textInputEditText;
        this.otpEditTextInput = textInputLayout;
        this.otpHeader = textView3;
        this.progressBar = ajioProgressView;
        this.redemptionTv = textView4;
        this.resendOtp = textView5;
        this.resendOtpIn = textView6;
        this.resendOtpTime = textView7;
        this.validMsg = textView8;
    }

    public static VerifyOtpBottomSheetLuxeBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.ajio_loader_view;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioLoaderView)view2;
        if (object2 != null) {
            n3 = R$id.close_dialog;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AppCompatImageView)view2;
            if (object3 != null) {
                n3 = R$id.confirm_otp_btn;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (TextView)view2;
                if (view3 != null) {
                    n3 = R$id.error_msg;
                    View view4 = view2 = dd2_2.a(n3, view);
                    view4 = (TextView)view2;
                    if (view4 != null) {
                        n3 = R$id.otp_edit_text;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (TextInputEditText)view2;
                        if (object4 != null) {
                            n3 = R$id.otp_edit_text_input;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (TextInputLayout)view2;
                            if (object5 != null) {
                                n3 = R$id.otp_header;
                                View view5 = view2 = dd2_2.a(n3, view);
                                view5 = (TextView)view2;
                                if (view5 != null) {
                                    n3 = R$id.progress_bar;
                                    Object object6 = view2 = dd2_2.a(n3, view);
                                    object6 = (AjioProgressView)view2;
                                    if (object6 != null) {
                                        n3 = R$id.redemption_tv;
                                        View view6 = view2 = dd2_2.a(n3, view);
                                        view6 = (TextView)view2;
                                        if (view6 != null) {
                                            n3 = R$id.resend_otp;
                                            View view7 = view2 = dd2_2.a(n3, view);
                                            view7 = (TextView)view2;
                                            if (view7 != null) {
                                                n3 = R$id.resend_otp_in;
                                                View view8 = view2 = dd2_2.a(n3, view);
                                                view8 = (TextView)view2;
                                                if (view8 != null) {
                                                    n3 = R$id.resend_otp_time;
                                                    View view9 = view2 = dd2_2.a(n3, view);
                                                    view9 = (TextView)view2;
                                                    if (view9 != null) {
                                                        n3 = R$id.valid_msg;
                                                        View view10 = view2 = dd2_2.a(n3, view);
                                                        view10 = (TextView)view2;
                                                        if (view10 != null) {
                                                            Object object7 = view;
                                                            object7 = (ConstraintLayout)view;
                                                            VerifyOtpBottomSheetLuxeBinding verifyOtpBottomSheetLuxeBinding = new VerifyOtpBottomSheetLuxeBinding((ConstraintLayout)((Object)object7), (AjioLoaderView)((Object)object2), (AppCompatImageView)((Object)object3), (TextView)view3, (TextView)view4, (TextInputEditText)object4, (TextInputLayout)((Object)object5), (TextView)view5, (AjioProgressView)((Object)object6), (TextView)view6, (TextView)view7, (TextView)view8, (TextView)view9, (TextView)view10);
                                                            return verifyOtpBottomSheetLuxeBinding;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static VerifyOtpBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater) {
        return VerifyOtpBottomSheetLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static VerifyOtpBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.verify_otp_bottom_sheet_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return VerifyOtpBottomSheetLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

