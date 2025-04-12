/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ScrollView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentLoginPasswordLayoutNewBinding
implements BC3 {
    public final AjioTextView captchaErrorTv;
    public final AjioTextView captchaHeaderTv;
    public final AppCompatImageView ivLoginCaptcha;
    public final ConstraintLayout layoutCaptcha;
    public final AjioTextView loginForgotPassTv;
    public final AppCompatEditText loginPasswordCaptchaTiet;
    public final ConstraintLayout loginPasswordEtView;
    public final AjioTextView loginPasswordForgetPasswordTv;
    public final AjioTextView loginPasswordHeaderTv;
    public final AjioTextView loginPasswordLoginOtpTv;
    public final AjioTextView loginPasswordStartShoppingTv;
    public final AjioTextView loginPasswordSubheaderTv;
    public final TextInputEditText loginPasswordTiet;
    public final TextInputLayout loginPasswordTil;
    public final AjioTextView loginPasswordToggleTv;
    private final ScrollView rootView;
    public final AjioTextView tvRetryCaptcha;

    private FragmentLoginPasswordLayoutNewBinding(ScrollView scrollView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout, AjioTextView ajioTextView3, AppCompatEditText appCompatEditText, ConstraintLayout constraintLayout2, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, TextInputEditText textInputEditText, TextInputLayout textInputLayout, AjioTextView ajioTextView9, AjioTextView ajioTextView10) {
        this.rootView = scrollView;
        this.captchaErrorTv = ajioTextView;
        this.captchaHeaderTv = ajioTextView2;
        this.ivLoginCaptcha = appCompatImageView;
        this.layoutCaptcha = constraintLayout;
        this.loginForgotPassTv = ajioTextView3;
        this.loginPasswordCaptchaTiet = appCompatEditText;
        this.loginPasswordEtView = constraintLayout2;
        this.loginPasswordForgetPasswordTv = ajioTextView4;
        this.loginPasswordHeaderTv = ajioTextView5;
        this.loginPasswordLoginOtpTv = ajioTextView6;
        this.loginPasswordStartShoppingTv = ajioTextView7;
        this.loginPasswordSubheaderTv = ajioTextView8;
        this.loginPasswordTiet = textInputEditText;
        this.loginPasswordTil = textInputLayout;
        this.loginPasswordToggleTv = ajioTextView9;
        this.tvRetryCaptcha = ajioTextView10;
    }

    public static FragmentLoginPasswordLayoutNewBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.captcha_error_tv;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.captcha_header_tv;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                n3 = R$id.iv_login_captcha;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AppCompatImageView)view2;
                if (object4 != null) {
                    n3 = R$id.layout_captcha;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (ConstraintLayout)view2;
                    if (object5 != null) {
                        n3 = R$id.login_forgot_pass_tv;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioTextView)view2;
                        if (object6 != null) {
                            n3 = R$id.login_password_captcha_tiet;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (AppCompatEditText)view2;
                            if (object7 != null) {
                                n3 = R$id.login_password_et_view;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (ConstraintLayout)view2;
                                if (object8 != null) {
                                    n3 = R$id.login_password_forget_password_tv;
                                    Object object9 = view2 = dd2_2.a(n3, view);
                                    object9 = (AjioTextView)view2;
                                    if (object9 != null) {
                                        n3 = R$id.login_password_header_tv;
                                        Object object10 = view2 = dd2_2.a(n3, view);
                                        object10 = (AjioTextView)view2;
                                        if (object10 != null) {
                                            n3 = R$id.login_password_login_otp_tv;
                                            Object object11 = view2 = dd2_2.a(n3, view);
                                            object11 = (AjioTextView)view2;
                                            if (object11 != null) {
                                                n3 = R$id.login_password_start_shopping_tv;
                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                object12 = (AjioTextView)view2;
                                                if (object12 != null) {
                                                    n3 = R$id.login_password_subheader_tv;
                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                    object13 = (AjioTextView)view2;
                                                    if (object13 != null) {
                                                        n3 = R$id.login_password_tiet;
                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                        object14 = (TextInputEditText)view2;
                                                        if (object14 != null) {
                                                            n3 = R$id.login_password_til;
                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                            object15 = (TextInputLayout)view2;
                                                            if (object15 != null) {
                                                                n3 = R$id.login_password_toggle_tv;
                                                                Object object16 = view2 = dd2_2.a(n3, view);
                                                                object16 = (AjioTextView)view2;
                                                                if (object16 != null) {
                                                                    n3 = R$id.tv_retry_captcha;
                                                                    Object object17 = view2 = dd2_2.a(n3, view);
                                                                    object17 = (AjioTextView)view2;
                                                                    if (object17 != null) {
                                                                        View view3 = view;
                                                                        view3 = (ScrollView)view;
                                                                        FragmentLoginPasswordLayoutNewBinding fragmentLoginPasswordLayoutNewBinding = new FragmentLoginPasswordLayoutNewBinding((ScrollView)view3, (AjioTextView)object2, (AjioTextView)object3, (AppCompatImageView)((Object)object4), (ConstraintLayout)((Object)object5), (AjioTextView)object6, (AppCompatEditText)object7, (ConstraintLayout)((Object)object8), (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (TextInputEditText)object14, (TextInputLayout)((Object)object15), (AjioTextView)object16, (AjioTextView)object17);
                                                                        return fragmentLoginPasswordLayoutNewBinding;
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

    public static FragmentLoginPasswordLayoutNewBinding inflate(LayoutInflater layoutInflater) {
        return FragmentLoginPasswordLayoutNewBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentLoginPasswordLayoutNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_login_password_layout_new;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentLoginPasswordLayoutNewBinding.bind((View)layoutInflater);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}

