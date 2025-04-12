/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutTextviewInfoMsgBinding;

public final class NewViewEditEmailBinding
implements BC3 {
    public final TextInputLayout OTPtil;
    public final AjioAspectRatioImageView close;
    public final AjioTextView confirmOtpBtn;
    public final LinearLayout editEmailView;
    public final AjioEditText emailEditTxt;
    public final AjioTextView emailErrorMsg;
    public final TextInputLayout emailTextInput;
    public final AjioTextView errorMsg;
    public final AjioLoaderView loaderView;
    public final AjioEditText otpEditText;
    public final AjioTextView otpValidTime;
    public final LinearLayout otpView;
    public final LinearLayout parentLayout;
    public final AjioTextView resendOtp;
    public final AjioTextView resendOtpTime;
    public final LayoutTextviewInfoMsgBinding rilEmployeeNewEmailSigninInfo;
    private final FrameLayout rootView;
    public final AjioTextView sendOtpBtn;
    public final AjioTextView subHeaderOtpTv;

    private NewViewEditEmailBinding(FrameLayout frameLayout, TextInputLayout textInputLayout, AjioAspectRatioImageView ajioAspectRatioImageView, AjioTextView ajioTextView, LinearLayout linearLayout, AjioEditText ajioEditText, AjioTextView ajioTextView2, TextInputLayout textInputLayout2, AjioTextView ajioTextView3, AjioLoaderView ajioLoaderView, AjioEditText ajioEditText2, AjioTextView ajioTextView4, LinearLayout linearLayout2, LinearLayout linearLayout3, AjioTextView ajioTextView5, AjioTextView ajioTextView6, LayoutTextviewInfoMsgBinding layoutTextviewInfoMsgBinding, AjioTextView ajioTextView7, AjioTextView ajioTextView8) {
        this.rootView = frameLayout;
        this.OTPtil = textInputLayout;
        this.close = ajioAspectRatioImageView;
        this.confirmOtpBtn = ajioTextView;
        this.editEmailView = linearLayout;
        this.emailEditTxt = ajioEditText;
        this.emailErrorMsg = ajioTextView2;
        this.emailTextInput = textInputLayout2;
        this.errorMsg = ajioTextView3;
        this.loaderView = ajioLoaderView;
        this.otpEditText = ajioEditText2;
        this.otpValidTime = ajioTextView4;
        this.otpView = linearLayout2;
        this.parentLayout = linearLayout3;
        this.resendOtp = ajioTextView5;
        this.resendOtpTime = ajioTextView6;
        this.rilEmployeeNewEmailSigninInfo = layoutTextviewInfoMsgBinding;
        this.sendOtpBtn = ajioTextView7;
        this.subHeaderOtpTv = ajioTextView8;
    }

    public static NewViewEditEmailBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.OTPtil;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (TextInputLayout)view2;
        if (object2 != null) {
            n3 = R$id.close;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioAspectRatioImageView)view2;
            if (object3 != null) {
                n3 = R$id.confirm_otp_btn;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioTextView)view2;
                if (object4 != null) {
                    n3 = R$id.edit_email_view;
                    View view3 = view2 = dd2_2.a(n3, view);
                    view3 = (LinearLayout)view2;
                    if (view3 != null) {
                        n3 = R$id.email_edit_txt;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (AjioEditText)view2;
                        if (object5 != null) {
                            n3 = R$id.email_error_msg;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (AjioTextView)view2;
                            if (object6 != null) {
                                n3 = R$id.email_text_input;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (TextInputLayout)view2;
                                if (object7 != null) {
                                    n3 = R$id.error_msg;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (AjioTextView)view2;
                                    if (object8 != null) {
                                        n3 = R$id.loader_view;
                                        Object object9 = view2 = dd2_2.a(n3, view);
                                        object9 = (AjioLoaderView)view2;
                                        if (object9 != null) {
                                            n3 = R$id.otp_edit_text;
                                            Object object10 = view2 = dd2_2.a(n3, view);
                                            object10 = (AjioEditText)view2;
                                            if (object10 != null) {
                                                n3 = R$id.otp_valid_time;
                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                object11 = (AjioTextView)view2;
                                                if (object11 != null) {
                                                    n3 = R$id.otp_view;
                                                    View view4 = view2 = dd2_2.a(n3, view);
                                                    view4 = (LinearLayout)view2;
                                                    if (view4 != null) {
                                                        n3 = R$id.parent_layout;
                                                        View view5 = view2 = dd2_2.a(n3, view);
                                                        view5 = (LinearLayout)view2;
                                                        if (view5 != null) {
                                                            n3 = R$id.resend_otp;
                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                            object12 = (AjioTextView)view2;
                                                            if (object12 != null) {
                                                                n3 = R$id.resend_otp_time;
                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                object13 = (AjioTextView)view2;
                                                                if (object13 != null && (view2 = dd2_2.a(n3 = R$id.ril_employee_new_email_signin_info, view)) != null) {
                                                                    LayoutTextviewInfoMsgBinding layoutTextviewInfoMsgBinding = LayoutTextviewInfoMsgBinding.bind(view2);
                                                                    n3 = R$id.send_otp_btn;
                                                                    Object object14 = view2 = dd2_2.a(n3, view);
                                                                    object14 = (AjioTextView)view2;
                                                                    if (object14 != null) {
                                                                        n3 = R$id.sub_header_otp_tv;
                                                                        Object object15 = view2 = dd2_2.a(n3, view);
                                                                        object15 = (AjioTextView)view2;
                                                                        if (object15 != null) {
                                                                            View view6 = view;
                                                                            view6 = (FrameLayout)view;
                                                                            NewViewEditEmailBinding newViewEditEmailBinding = new NewViewEditEmailBinding((FrameLayout)view6, (TextInputLayout)((Object)object2), (AjioAspectRatioImageView)((Object)object3), (AjioTextView)object4, (LinearLayout)view3, (AjioEditText)object5, (AjioTextView)object6, (TextInputLayout)((Object)object7), (AjioTextView)object8, (AjioLoaderView)((Object)object9), (AjioEditText)object10, (AjioTextView)object11, (LinearLayout)view4, (LinearLayout)view5, (AjioTextView)object12, (AjioTextView)object13, layoutTextviewInfoMsgBinding, (AjioTextView)object14, (AjioTextView)object15);
                                                                            return newViewEditEmailBinding;
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
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewViewEditEmailBinding inflate(LayoutInflater layoutInflater) {
        return NewViewEditEmailBinding.inflate(layoutInflater, null, false);
    }

    public static NewViewEditEmailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_view_edit_email;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewViewEditEmailBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

