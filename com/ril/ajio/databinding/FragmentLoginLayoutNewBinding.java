/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 *  android.widget.ScrollView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
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

public final class FragmentLoginLayoutNewBinding
implements BC3 {
    public final AjioTextView accessibilityClickHereEmailBasedLogin;
    public final Barrier barrierSocialLogin;
    public final TextView emptyViewLogin;
    public final AjioImageView idLoginRemocalIcon;
    public final ConstraintLayout idLoginRemoval;
    public final AjioTextView idLoginRemovalText;
    public final AjioTextView loginAjioCashInfo;
    public final AppCompatImageView loginAjioLogo;
    public final AjioTextView loginContinueTv;
    public final AppCompatImageView loginFbIv;
    public final AppCompatImageView loginGoogleIv;
    public final ConstraintLayout loginHeaderView;
    public final AjioTextView loginOrView;
    public final AjioTextView loginTermsConditionsTv;
    public final AjioTextView loginWelcomeMsgTv;
    public final ConstraintLayout mobileEmailView;
    public final AppCompatEditText mobileEt;
    public final AppCompatTextView mobileEtError;
    public final RelativeLayout mobileLayout;
    public final ProgressBar progressBarMobile;
    public final ConstraintLayout rootView;
    private final ScrollView rootView_;
    public final ScrollView scrollRootView;

    private FragmentLoginLayoutNewBinding(ScrollView scrollView, AjioTextView ajioTextView, Barrier barrier, TextView textView, AjioImageView ajioImageView, ConstraintLayout constraintLayout, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AppCompatImageView appCompatImageView, AjioTextView ajioTextView4, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, ConstraintLayout constraintLayout2, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, ConstraintLayout constraintLayout3, AppCompatEditText appCompatEditText, AppCompatTextView appCompatTextView, RelativeLayout relativeLayout, ProgressBar progressBar, ConstraintLayout constraintLayout4, ScrollView scrollView2) {
        this.rootView_ = scrollView;
        this.accessibilityClickHereEmailBasedLogin = ajioTextView;
        this.barrierSocialLogin = barrier;
        this.emptyViewLogin = textView;
        this.idLoginRemocalIcon = ajioImageView;
        this.idLoginRemoval = constraintLayout;
        this.idLoginRemovalText = ajioTextView2;
        this.loginAjioCashInfo = ajioTextView3;
        this.loginAjioLogo = appCompatImageView;
        this.loginContinueTv = ajioTextView4;
        this.loginFbIv = appCompatImageView2;
        this.loginGoogleIv = appCompatImageView3;
        this.loginHeaderView = constraintLayout2;
        this.loginOrView = ajioTextView5;
        this.loginTermsConditionsTv = ajioTextView6;
        this.loginWelcomeMsgTv = ajioTextView7;
        this.mobileEmailView = constraintLayout3;
        this.mobileEt = appCompatEditText;
        this.mobileEtError = appCompatTextView;
        this.mobileLayout = relativeLayout;
        this.progressBarMobile = progressBar;
        this.rootView = constraintLayout4;
        this.scrollRootView = scrollView2;
    }

    public static FragmentLoginLayoutNewBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.accessibility_click_here_email_based_login;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.barrier_social_login;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (Barrier)view2;
            if (view3 != null) {
                n3 = R$id.empty_view_login;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (TextView)view2;
                if (view4 != null) {
                    n3 = R$id.id_login_remocal_icon;
                    Object object3 = view2 = dd2_2.a(n3, view);
                    object3 = (AjioImageView)view2;
                    if (object3 != null) {
                        n3 = R$id.id_login_removal;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (ConstraintLayout)view2;
                        if (object4 != null) {
                            n3 = R$id.id_login_removal_text;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (AjioTextView)view2;
                            if (object5 != null) {
                                n3 = R$id.login_ajio_cash_info;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (AjioTextView)view2;
                                if (object6 != null) {
                                    n3 = R$id.login_ajio_logo;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AppCompatImageView)view2;
                                    if (object7 != null) {
                                        n3 = R$id.login_continue_tv;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (AjioTextView)view2;
                                        if (object8 != null) {
                                            n3 = R$id.login_fb_iv;
                                            Object object9 = view2 = dd2_2.a(n3, view);
                                            object9 = (AppCompatImageView)view2;
                                            if (object9 != null) {
                                                n3 = R$id.login_google_iv;
                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                object10 = (AppCompatImageView)view2;
                                                if (object10 != null) {
                                                    n3 = R$id.login_header_view;
                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                    object11 = (ConstraintLayout)view2;
                                                    if (object11 != null) {
                                                        n3 = R$id.login_or_view;
                                                        Object object12 = view2 = dd2_2.a(n3, view);
                                                        object12 = (AjioTextView)view2;
                                                        if (object12 != null) {
                                                            n3 = R$id.login_terms_conditions_tv;
                                                            Object object13 = view2 = dd2_2.a(n3, view);
                                                            object13 = (AjioTextView)view2;
                                                            if (object13 != null) {
                                                                n3 = R$id.login_welcome_msg_tv;
                                                                Object object14 = view2 = dd2_2.a(n3, view);
                                                                object14 = (AjioTextView)view2;
                                                                if (object14 != null) {
                                                                    n3 = R$id.mobile_email_view;
                                                                    Object object15 = view2 = dd2_2.a(n3, view);
                                                                    object15 = (ConstraintLayout)view2;
                                                                    if (object15 != null) {
                                                                        n3 = R$id.mobile_et;
                                                                        Object object16 = view2 = dd2_2.a(n3, view);
                                                                        object16 = (AppCompatEditText)view2;
                                                                        if (object16 != null) {
                                                                            n3 = R$id.mobile_et_error;
                                                                            Object object17 = view2 = dd2_2.a(n3, view);
                                                                            object17 = (AppCompatTextView)view2;
                                                                            if (object17 != null) {
                                                                                n3 = R$id.mobile_layout;
                                                                                View view5 = view2 = dd2_2.a(n3, view);
                                                                                view5 = (RelativeLayout)view2;
                                                                                if (view5 != null) {
                                                                                    n3 = R$id.progress_bar_mobile;
                                                                                    View view6 = view2 = dd2_2.a(n3, view);
                                                                                    view6 = (ProgressBar)view2;
                                                                                    if (view6 != null) {
                                                                                        n3 = R$id.root_view;
                                                                                        Object object18 = view2 = dd2_2.a(n3, view);
                                                                                        object18 = (ConstraintLayout)view2;
                                                                                        if (object18 != null) {
                                                                                            View view7 = view;
                                                                                            view7 = (ScrollView)view;
                                                                                            object = new FragmentLoginLayoutNewBinding((ScrollView)view7, (AjioTextView)object2, (Barrier)view3, (TextView)view4, (AjioImageView)((Object)object3), (ConstraintLayout)((Object)object4), (AjioTextView)object5, (AjioTextView)object6, (AppCompatImageView)((Object)object7), (AjioTextView)object8, (AppCompatImageView)((Object)object9), (AppCompatImageView)((Object)object10), (ConstraintLayout)((Object)object11), (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, (ConstraintLayout)((Object)object15), (AppCompatEditText)object16, (AppCompatTextView)object17, (RelativeLayout)view5, (ProgressBar)view6, (ConstraintLayout)((Object)object18), (ScrollView)view7);
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
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentLoginLayoutNewBinding inflate(LayoutInflater layoutInflater) {
        return FragmentLoginLayoutNewBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentLoginLayoutNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_login_layout_new;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentLoginLayoutNewBinding.bind((View)layoutInflater);
    }

    public ScrollView getRoot() {
        return this.rootView_;
    }
}

