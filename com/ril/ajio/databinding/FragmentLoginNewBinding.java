/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentLoginNewBinding
implements BC3 {
    public final Barrier barrierSocialLogin;
    public final View dividerEnd;
    public final View dividerStart;
    public final AjioImageView idLoginRemocalIcon;
    public final ConstraintLayout idLoginRemoval;
    public final AjioTextView idLoginRemovalText;
    public final AjioImageView ivCancel;
    public final AjioImageView ivSignupBenefit;
    public final ConstraintLayout layoutHalfCard;
    public final AjioTextView loginAjioCashInfo;
    public final AjioTextView loginContinueTv;
    public final AppCompatImageView loginFbIv;
    public final AppCompatImageView loginGoogleIv;
    public final AjioTextView loginOrView;
    public final AjioTextView loginTermsConditionsTv;
    public final AjioTextView loginWelcomeMsgTv;
    public final ConstraintLayout mobileEmailView;
    public final AppCompatEditText mobileEt;
    public final AppCompatTextView mobileEtError;
    public final RelativeLayout mobileLayout;
    public final ProgressBar progressBarMobile;
    private final ConstraintLayout rootView;
    public final TextView spacerView;

    private FragmentLoginNewBinding(ConstraintLayout constraintLayout, Barrier barrier, View view, View view2, AjioImageView ajioImageView, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioImageView ajioImageView2, AjioImageView ajioImageView3, ConstraintLayout constraintLayout3, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, ConstraintLayout constraintLayout4, AppCompatEditText appCompatEditText, AppCompatTextView appCompatTextView, RelativeLayout relativeLayout, ProgressBar progressBar, TextView textView) {
        this.rootView = constraintLayout;
        this.barrierSocialLogin = barrier;
        this.dividerEnd = view;
        this.dividerStart = view2;
        this.idLoginRemocalIcon = ajioImageView;
        this.idLoginRemoval = constraintLayout2;
        this.idLoginRemovalText = ajioTextView;
        this.ivCancel = ajioImageView2;
        this.ivSignupBenefit = ajioImageView3;
        this.layoutHalfCard = constraintLayout3;
        this.loginAjioCashInfo = ajioTextView2;
        this.loginContinueTv = ajioTextView3;
        this.loginFbIv = appCompatImageView;
        this.loginGoogleIv = appCompatImageView2;
        this.loginOrView = ajioTextView4;
        this.loginTermsConditionsTv = ajioTextView5;
        this.loginWelcomeMsgTv = ajioTextView6;
        this.mobileEmailView = constraintLayout4;
        this.mobileEt = appCompatEditText;
        this.mobileEtError = appCompatTextView;
        this.mobileLayout = relativeLayout;
        this.progressBarMobile = progressBar;
        this.spacerView = textView;
    }

    public static FragmentLoginNewBinding bind(View view) {
        View view2;
        View view3;
        View view4;
        Object object = view;
        int n3 = R$id.barrier_social_login;
        View view5 = view4 = dd2_2.a(n3, view);
        view5 = (Barrier)view4;
        if (view5 != null && (view3 = dd2_2.a(n3 = R$id.divider_end, view)) != null && (view2 = dd2_2.a(n3 = R$id.divider_start, view)) != null) {
            n3 = R$id.id_login_remocal_icon;
            Object object2 = view4 = dd2_2.a(n3, view);
            object2 = (AjioImageView)view4;
            if (object2 != null) {
                n3 = R$id.id_login_removal;
                Object object3 = view4 = dd2_2.a(n3, view);
                object3 = (ConstraintLayout)view4;
                if (object3 != null) {
                    n3 = R$id.id_login_removal_text;
                    Object object4 = view4 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view4;
                    if (object4 != null) {
                        n3 = R$id.iv_cancel;
                        Object object5 = view4 = dd2_2.a(n3, view);
                        object5 = (AjioImageView)view4;
                        if (object5 != null) {
                            n3 = R$id.iv_signup_benefit;
                            Object object6 = view4 = dd2_2.a(n3, view);
                            object6 = (AjioImageView)view4;
                            if (object6 != null) {
                                Object object7 = view;
                                object7 = (ConstraintLayout)view;
                                n3 = R$id.login_ajio_cash_info;
                                Object object8 = view4 = dd2_2.a(n3, view);
                                object8 = (AjioTextView)view4;
                                if (object8 != null) {
                                    n3 = R$id.login_continue_tv;
                                    Object object9 = view4 = dd2_2.a(n3, view);
                                    object9 = (AjioTextView)view4;
                                    if (object9 != null) {
                                        n3 = R$id.login_fb_iv;
                                        Object object10 = view4 = dd2_2.a(n3, view);
                                        object10 = (AppCompatImageView)view4;
                                        if (object10 != null) {
                                            n3 = R$id.login_google_iv;
                                            Object object11 = view4 = dd2_2.a(n3, view);
                                            object11 = (AppCompatImageView)view4;
                                            if (object11 != null) {
                                                n3 = R$id.login_or_view;
                                                Object object12 = view4 = dd2_2.a(n3, view);
                                                object12 = (AjioTextView)view4;
                                                if (object12 != null) {
                                                    n3 = R$id.login_terms_conditions_tv;
                                                    Object object13 = view4 = dd2_2.a(n3, view);
                                                    object13 = (AjioTextView)view4;
                                                    if (object13 != null) {
                                                        n3 = R$id.login_welcome_msg_tv;
                                                        Object object14 = view4 = dd2_2.a(n3, view);
                                                        object14 = (AjioTextView)view4;
                                                        if (object14 != null) {
                                                            n3 = R$id.mobile_email_view;
                                                            Object object15 = view4 = dd2_2.a(n3, view);
                                                            object15 = (ConstraintLayout)view4;
                                                            if (object15 != null) {
                                                                n3 = R$id.mobile_et;
                                                                Object object16 = view4 = dd2_2.a(n3, view);
                                                                object16 = (AppCompatEditText)view4;
                                                                if (object16 != null) {
                                                                    n3 = R$id.mobile_et_error;
                                                                    Object object17 = view4 = dd2_2.a(n3, view);
                                                                    object17 = (AppCompatTextView)view4;
                                                                    if (object17 != null) {
                                                                        n3 = R$id.mobile_layout;
                                                                        View view6 = view4 = dd2_2.a(n3, view);
                                                                        view6 = (RelativeLayout)view4;
                                                                        if (view6 != null) {
                                                                            n3 = R$id.progress_bar_mobile;
                                                                            View view7 = view4 = dd2_2.a(n3, view);
                                                                            view7 = (ProgressBar)view4;
                                                                            if (view7 != null) {
                                                                                n3 = R$id.spacer_view;
                                                                                View view8 = view4 = dd2_2.a(n3, view);
                                                                                view8 = (TextView)view4;
                                                                                if (view8 != null) {
                                                                                    object = new FragmentLoginNewBinding((ConstraintLayout)((Object)object7), (Barrier)view5, view3, view2, (AjioImageView)((Object)object2), (ConstraintLayout)((Object)object3), (AjioTextView)object4, (AjioImageView)((Object)object5), (AjioImageView)((Object)object6), (ConstraintLayout)((Object)object7), (AjioTextView)object8, (AjioTextView)object9, (AppCompatImageView)((Object)object10), (AppCompatImageView)((Object)object11), (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, (ConstraintLayout)((Object)object15), (AppCompatEditText)object16, (AppCompatTextView)object17, (RelativeLayout)view6, (ProgressBar)view7, (TextView)view8);
                                                                                    return object;
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

    public static FragmentLoginNewBinding inflate(LayoutInflater layoutInflater) {
        return FragmentLoginNewBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentLoginNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_login_new;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentLoginNewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

