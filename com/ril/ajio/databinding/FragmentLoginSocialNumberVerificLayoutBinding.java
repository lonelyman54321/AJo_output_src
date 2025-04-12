/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentLoginSocialNumberVerificLayoutBinding
implements BC3 {
    public final TextInputEditText loginNewUserEmailTiet;
    public final TextInputLayout loginNewUserEmailTil;
    public final AjioTextView loginSocialEnterTv;
    public final TextInputEditText loginSocialInviteCodeTiet;
    public final TextInputLayout loginSocialInviteCodeTil;
    public final AjioTextView loginSocialMobileContinueTv;
    public final AjioTextView loginSocialMobileHeaderTv;
    public final TextInputEditText loginSocialMobileTiet;
    public final TextInputLayout loginSocialMobileTil;
    private final LinearLayout rootView;

    private FragmentLoginSocialNumberVerificLayoutBinding(LinearLayout linearLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout, AjioTextView ajioTextView, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, AjioTextView ajioTextView2, AjioTextView ajioTextView3, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3) {
        this.rootView = linearLayout;
        this.loginNewUserEmailTiet = textInputEditText;
        this.loginNewUserEmailTil = textInputLayout;
        this.loginSocialEnterTv = ajioTextView;
        this.loginSocialInviteCodeTiet = textInputEditText2;
        this.loginSocialInviteCodeTil = textInputLayout2;
        this.loginSocialMobileContinueTv = ajioTextView2;
        this.loginSocialMobileHeaderTv = ajioTextView3;
        this.loginSocialMobileTiet = textInputEditText3;
        this.loginSocialMobileTil = textInputLayout3;
    }

    public static FragmentLoginSocialNumberVerificLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.login_new_user_email_tiet;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (TextInputEditText)view;
        if (object2 != null) {
            n3 = R$id.login_new_user_email_til;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (TextInputLayout)view;
            if (object3 != null) {
                n3 = R$id.login_social_enter_tv;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.login_social_invite_code_tiet;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (TextInputEditText)view;
                    if (object5 != null) {
                        n3 = R$id.login_social_invite_code_til;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (TextInputLayout)view;
                        if (object6 != null) {
                            n3 = R$id.login_social_mobile_continue_tv;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                n3 = R$id.login_social_mobile_header_tv;
                                Object object8 = view = dd2_2.a(n3, object);
                                object8 = (AjioTextView)view;
                                if (object8 != null) {
                                    n3 = R$id.login_social_mobile_tiet;
                                    Object object9 = view = dd2_2.a(n3, object);
                                    object9 = (TextInputEditText)view;
                                    if (object9 != null) {
                                        n3 = R$id.login_social_mobile_til;
                                        Object object10 = view = dd2_2.a(n3, object);
                                        object10 = (TextInputLayout)view;
                                        if (object10 != null) {
                                            Object object11 = object;
                                            object11 = (LinearLayout)object;
                                            FragmentLoginSocialNumberVerificLayoutBinding fragmentLoginSocialNumberVerificLayoutBinding = new FragmentLoginSocialNumberVerificLayoutBinding((LinearLayout)object11, (TextInputEditText)object2, (TextInputLayout)((Object)object3), (AjioTextView)object4, (TextInputEditText)object5, (TextInputLayout)((Object)object6), (AjioTextView)object7, (AjioTextView)object8, (TextInputEditText)object9, (TextInputLayout)((Object)object10));
                                            return fragmentLoginSocialNumberVerificLayoutBinding;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentLoginSocialNumberVerificLayoutBinding inflate(LayoutInflater layoutInflater) {
        return FragmentLoginSocialNumberVerificLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentLoginSocialNumberVerificLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_login_social_number_verific_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentLoginSocialNumberVerificLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

