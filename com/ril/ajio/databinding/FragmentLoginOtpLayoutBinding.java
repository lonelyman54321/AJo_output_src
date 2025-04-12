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
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentLoginOtpLayoutBinding
implements BC3 {
    public final AjioTextView loginAjioCashInfo;
    public final AjioTextView loginOtpErrorTv;
    public final AjioTextView loginOtpExpiresInTv;
    public final AjioTextView loginOtpHeaderTv;
    public final AjioTextView loginOtpLikeToSetTv;
    public final AjioTextView loginOtpNewPasswordTv;
    public final AjioTextView loginOtpResendOtpTv;
    public final AjioTextView loginOtpSendDescTv;
    public final AjioTextView loginOtpStartShoppingTv;
    public final TextInputEditText loginOtpTiet;
    public final TextInputLayout loginOtpTil;
    public final AjioTextView newDeviceDetectedTv;
    private final ConstraintLayout rootView;

    private FragmentLoginOtpLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, TextInputEditText textInputEditText, TextInputLayout textInputLayout, AjioTextView ajioTextView10) {
        this.rootView = constraintLayout;
        this.loginAjioCashInfo = ajioTextView;
        this.loginOtpErrorTv = ajioTextView2;
        this.loginOtpExpiresInTv = ajioTextView3;
        this.loginOtpHeaderTv = ajioTextView4;
        this.loginOtpLikeToSetTv = ajioTextView5;
        this.loginOtpNewPasswordTv = ajioTextView6;
        this.loginOtpResendOtpTv = ajioTextView7;
        this.loginOtpSendDescTv = ajioTextView8;
        this.loginOtpStartShoppingTv = ajioTextView9;
        this.loginOtpTiet = textInputEditText;
        this.loginOtpTil = textInputLayout;
        this.newDeviceDetectedTv = ajioTextView10;
    }

    public static FragmentLoginOtpLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.login_ajio_cash_info;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.login_otp_error_tv;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                n3 = R$id.login_otp_expires_in_tv;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioTextView)view2;
                if (object4 != null) {
                    n3 = R$id.login_otp_header_tv;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioTextView)view2;
                    if (object5 != null) {
                        n3 = R$id.login_otp_like_to_set_tv;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioTextView)view2;
                        if (object6 != null) {
                            n3 = R$id.login_otp_new_password_tv;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (AjioTextView)view2;
                            if (object7 != null) {
                                n3 = R$id.login_otp_resend_otp_tv;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (AjioTextView)view2;
                                if (object8 != null) {
                                    n3 = R$id.login_otp_send_desc_tv;
                                    Object object9 = view2 = dd2_2.a(n3, view);
                                    object9 = (AjioTextView)view2;
                                    if (object9 != null) {
                                        n3 = R$id.login_otp_start_shopping_tv;
                                        Object object10 = view2 = dd2_2.a(n3, view);
                                        object10 = (AjioTextView)view2;
                                        if (object10 != null) {
                                            n3 = R$id.login_otp_tiet;
                                            Object object11 = view2 = dd2_2.a(n3, view);
                                            object11 = (TextInputEditText)view2;
                                            if (object11 != null) {
                                                n3 = R$id.login_otp_til;
                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                object12 = (TextInputLayout)view2;
                                                if (object12 != null) {
                                                    n3 = R$id.new_device_detected_tv;
                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                    object13 = (AjioTextView)view2;
                                                    if (object13 != null) {
                                                        Object object14 = view;
                                                        object14 = (ConstraintLayout)view;
                                                        FragmentLoginOtpLayoutBinding fragmentLoginOtpLayoutBinding = new FragmentLoginOtpLayoutBinding((ConstraintLayout)((Object)object14), (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (TextInputEditText)object11, (TextInputLayout)((Object)object12), (AjioTextView)object13);
                                                        return fragmentLoginOtpLayoutBinding;
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

    public static FragmentLoginOtpLayoutBinding inflate(LayoutInflater layoutInflater) {
        return FragmentLoginOtpLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentLoginOtpLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_login_otp_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentLoginOtpLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

