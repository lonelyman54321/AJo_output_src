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
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentOtpLoginLayoutBinding
implements BC3 {
    public final AppCompatImageView errorIv;
    public final AjioTextView errorTv;
    public final AjioTextView loginButtonAccessibleUser;
    public final AjioTextView otpCheckAlsoTv;
    public final AjioTextView otpCheckingMsgTv;
    public final AjioTextView otpEmailEdit;
    public final AjioTextView otpEmailTv;
    public final AppCompatEditText otpEt1;
    public final AppCompatEditText otpEt2;
    public final AppCompatEditText otpEt3;
    public final AppCompatEditText otpEt4;
    public final AjioTextView otpLoginHeaderTv;
    public final AjioTextView otpLoginOtpSentDescTv;
    public final AjioTextView otpLoginWithPassTv;
    public final AjioTextView otpMobileEdit;
    public final AjioTextView otpPhoneTv;
    public final AjioTextView otpResendOtpTv;
    public final AjioTextView otpTimerTv;
    public final AjioTextView otpTroubleGettingTv;
    public final AjioTextView otpVerifiedAccessibilityUser;
    public final AjioTextView otpYouCanTv;
    private final ConstraintLayout rootView;

    private FragmentOtpLoginLayoutBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AppCompatEditText appCompatEditText, AppCompatEditText appCompatEditText2, AppCompatEditText appCompatEditText3, AppCompatEditText appCompatEditText4, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10, AjioTextView ajioTextView11, AjioTextView ajioTextView12, AjioTextView ajioTextView13, AjioTextView ajioTextView14, AjioTextView ajioTextView15, AjioTextView ajioTextView16) {
        this.rootView = constraintLayout;
        this.errorIv = appCompatImageView;
        this.errorTv = ajioTextView;
        this.loginButtonAccessibleUser = ajioTextView2;
        this.otpCheckAlsoTv = ajioTextView3;
        this.otpCheckingMsgTv = ajioTextView4;
        this.otpEmailEdit = ajioTextView5;
        this.otpEmailTv = ajioTextView6;
        this.otpEt1 = appCompatEditText;
        this.otpEt2 = appCompatEditText2;
        this.otpEt3 = appCompatEditText3;
        this.otpEt4 = appCompatEditText4;
        this.otpLoginHeaderTv = ajioTextView7;
        this.otpLoginOtpSentDescTv = ajioTextView8;
        this.otpLoginWithPassTv = ajioTextView9;
        this.otpMobileEdit = ajioTextView10;
        this.otpPhoneTv = ajioTextView11;
        this.otpResendOtpTv = ajioTextView12;
        this.otpTimerTv = ajioTextView13;
        this.otpTroubleGettingTv = ajioTextView14;
        this.otpVerifiedAccessibilityUser = ajioTextView15;
        this.otpYouCanTv = ajioTextView16;
    }

    public static FragmentOtpLoginLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.error_iv;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AppCompatImageView)view2;
        if (object2 != null) {
            n3 = R$id.error_tv;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                n3 = R$id.login_button_accessible_user;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioTextView)view2;
                if (object4 != null) {
                    n3 = R$id.otp_check_also_tv;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioTextView)view2;
                    if (object5 != null) {
                        n3 = R$id.otp_checking_msg_tv;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioTextView)view2;
                        if (object6 != null) {
                            n3 = R$id.otp_email_edit;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (AjioTextView)view2;
                            if (object7 != null) {
                                n3 = R$id.otp_email_tv;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (AjioTextView)view2;
                                if (object8 != null) {
                                    n3 = R$id.otp_et1;
                                    Object object9 = view2 = dd2_2.a(n3, view);
                                    object9 = (AppCompatEditText)view2;
                                    if (object9 != null) {
                                        n3 = R$id.otp_et2;
                                        Object object10 = view2 = dd2_2.a(n3, view);
                                        object10 = (AppCompatEditText)view2;
                                        if (object10 != null) {
                                            n3 = R$id.otp_et3;
                                            Object object11 = view2 = dd2_2.a(n3, view);
                                            object11 = (AppCompatEditText)view2;
                                            if (object11 != null) {
                                                n3 = R$id.otp_et4;
                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                object12 = (AppCompatEditText)view2;
                                                if (object12 != null) {
                                                    n3 = R$id.otp_login_header_tv;
                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                    object13 = (AjioTextView)view2;
                                                    if (object13 != null) {
                                                        n3 = R$id.otp_login_otp_sent_desc_tv;
                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                        object14 = (AjioTextView)view2;
                                                        if (object14 != null) {
                                                            n3 = R$id.otp_login_with_pass_tv;
                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                            object15 = (AjioTextView)view2;
                                                            if (object15 != null) {
                                                                n3 = R$id.otp_mobile_edit;
                                                                Object object16 = view2 = dd2_2.a(n3, view);
                                                                object16 = (AjioTextView)view2;
                                                                if (object16 != null) {
                                                                    n3 = R$id.otp_phone_tv;
                                                                    Object object17 = view2 = dd2_2.a(n3, view);
                                                                    object17 = (AjioTextView)view2;
                                                                    if (object17 != null) {
                                                                        n3 = R$id.otp_resend_otp_tv;
                                                                        Object object18 = view2 = dd2_2.a(n3, view);
                                                                        object18 = (AjioTextView)view2;
                                                                        if (object18 != null) {
                                                                            n3 = R$id.otp_timer_tv;
                                                                            Object object19 = view2 = dd2_2.a(n3, view);
                                                                            object19 = (AjioTextView)view2;
                                                                            if (object19 != null) {
                                                                                n3 = R$id.otp_trouble_getting_tv;
                                                                                Object object20 = view2 = dd2_2.a(n3, view);
                                                                                object20 = (AjioTextView)view2;
                                                                                if (object20 != null) {
                                                                                    n3 = R$id.otp_verified_accessibility_user;
                                                                                    Object object21 = view2 = dd2_2.a(n3, view);
                                                                                    object21 = (AjioTextView)view2;
                                                                                    if (object21 != null) {
                                                                                        n3 = R$id.otp_you_can_tv;
                                                                                        Object object22 = view2 = dd2_2.a(n3, view);
                                                                                        object22 = (AjioTextView)view2;
                                                                                        if (object22 != null) {
                                                                                            Object object23 = view;
                                                                                            object23 = (ConstraintLayout)view;
                                                                                            FragmentOtpLoginLayoutBinding fragmentOtpLoginLayoutBinding = new FragmentOtpLoginLayoutBinding((ConstraintLayout)((Object)object23), (AppCompatImageView)((Object)object2), (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AppCompatEditText)object9, (AppCompatEditText)object10, (AppCompatEditText)object11, (AppCompatEditText)object12, (AjioTextView)object13, (AjioTextView)object14, (AjioTextView)object15, (AjioTextView)object16, (AjioTextView)object17, (AjioTextView)object18, (AjioTextView)object19, (AjioTextView)object20, (AjioTextView)object21, (AjioTextView)object22);
                                                                                            return fragmentOtpLoginLayoutBinding;
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
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentOtpLoginLayoutBinding inflate(LayoutInflater layoutInflater) {
        return FragmentOtpLoginLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentOtpLoginLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_otp_login_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentOtpLoginLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

