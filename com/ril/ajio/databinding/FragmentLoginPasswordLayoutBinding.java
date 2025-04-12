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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentLoginPasswordLayoutBinding
implements BC3 {
    public final AppCompatImageView ivLoginCaptcha;
    public final AppCompatImageView ivRetryCaptcha;
    public final CardView layoutCaptcha;
    public final TextInputEditText loginPasswordCaptchaTiet;
    public final TextInputLayout loginPasswordCaptchaTil;
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

    private FragmentLoginPasswordLayoutBinding(ScrollView scrollView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, CardView cardView, TextInputEditText textInputEditText, TextInputLayout textInputLayout, ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, AjioTextView ajioTextView6) {
        this.rootView = scrollView;
        this.ivLoginCaptcha = appCompatImageView;
        this.ivRetryCaptcha = appCompatImageView2;
        this.layoutCaptcha = cardView;
        this.loginPasswordCaptchaTiet = textInputEditText;
        this.loginPasswordCaptchaTil = textInputLayout;
        this.loginPasswordEtView = constraintLayout;
        this.loginPasswordForgetPasswordTv = ajioTextView;
        this.loginPasswordHeaderTv = ajioTextView2;
        this.loginPasswordLoginOtpTv = ajioTextView3;
        this.loginPasswordStartShoppingTv = ajioTextView4;
        this.loginPasswordSubheaderTv = ajioTextView5;
        this.loginPasswordTiet = textInputEditText2;
        this.loginPasswordTil = textInputLayout2;
        this.loginPasswordToggleTv = ajioTextView6;
    }

    public static FragmentLoginPasswordLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.iv_login_captcha;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AppCompatImageView)view2;
        if (object2 != null) {
            n3 = R$id.iv_retry_captcha;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AppCompatImageView)view2;
            if (object3 != null) {
                n3 = R$id.layout_captcha;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (CardView)view2;
                if (object4 != null) {
                    n3 = R$id.login_password_captcha_tiet;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (TextInputEditText)view2;
                    if (object5 != null) {
                        n3 = R$id.login_password_captcha_til;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (TextInputLayout)view2;
                        if (object6 != null) {
                            n3 = R$id.login_password_et_view;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (ConstraintLayout)view2;
                            if (object7 != null) {
                                n3 = R$id.login_password_forget_password_tv;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (AjioTextView)view2;
                                if (object8 != null) {
                                    n3 = R$id.login_password_header_tv;
                                    Object object9 = view2 = dd2_2.a(n3, view);
                                    object9 = (AjioTextView)view2;
                                    if (object9 != null) {
                                        n3 = R$id.login_password_login_otp_tv;
                                        Object object10 = view2 = dd2_2.a(n3, view);
                                        object10 = (AjioTextView)view2;
                                        if (object10 != null) {
                                            n3 = R$id.login_password_start_shopping_tv;
                                            Object object11 = view2 = dd2_2.a(n3, view);
                                            object11 = (AjioTextView)view2;
                                            if (object11 != null) {
                                                n3 = R$id.login_password_subheader_tv;
                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                object12 = (AjioTextView)view2;
                                                if (object12 != null) {
                                                    n3 = R$id.login_password_tiet;
                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                    object13 = (TextInputEditText)view2;
                                                    if (object13 != null) {
                                                        n3 = R$id.login_password_til;
                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                        object14 = (TextInputLayout)view2;
                                                        if (object14 != null) {
                                                            n3 = R$id.login_password_toggle_tv;
                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                            object15 = (AjioTextView)view2;
                                                            if (object15 != null) {
                                                                View view3 = view;
                                                                view3 = (ScrollView)view;
                                                                FragmentLoginPasswordLayoutBinding fragmentLoginPasswordLayoutBinding = new FragmentLoginPasswordLayoutBinding((ScrollView)view3, (AppCompatImageView)((Object)object2), (AppCompatImageView)((Object)object3), (CardView)((Object)object4), (TextInputEditText)object5, (TextInputLayout)((Object)object6), (ConstraintLayout)((Object)object7), (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (TextInputEditText)object13, (TextInputLayout)((Object)object14), (AjioTextView)object15);
                                                                return fragmentLoginPasswordLayoutBinding;
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

    public static FragmentLoginPasswordLayoutBinding inflate(LayoutInflater layoutInflater) {
        return FragmentLoginPasswordLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentLoginPasswordLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_login_password_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentLoginPasswordLayoutBinding.bind((View)layoutInflater);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}

