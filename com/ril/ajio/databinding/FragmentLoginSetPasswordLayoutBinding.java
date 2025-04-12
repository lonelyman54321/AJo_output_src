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

public final class FragmentLoginSetPasswordLayoutBinding
implements BC3 {
    public final AjioTextView loginSetPasswordAlphabetLimitView;
    public final AjioTextView loginSetPasswordCharacterLimitView;
    public final TextInputEditText loginSetPasswordConfirmTiet;
    public final TextInputLayout loginSetPasswordConfirmTil;
    public final AjioTextView loginSetPasswordContinueTv;
    public final AjioTextView loginSetPasswordDoLaterTv;
    public final AjioTextView loginSetPasswordHeaderTv;
    public final LinearLayout loginSetPasswordLimitView;
    public final AjioTextView loginSetPasswordNumericLimitView;
    public final AjioTextView loginSetPasswordSpecialLimitView;
    public final TextInputEditText loginSetPasswordTiet;
    public final TextInputLayout loginSetPasswordTil;
    private final LinearLayout rootView;

    private FragmentLoginSetPasswordLayoutBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, TextInputEditText textInputEditText, TextInputLayout textInputLayout, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, LinearLayout linearLayout2, AjioTextView ajioTextView6, AjioTextView ajioTextView7, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2) {
        this.rootView = linearLayout;
        this.loginSetPasswordAlphabetLimitView = ajioTextView;
        this.loginSetPasswordCharacterLimitView = ajioTextView2;
        this.loginSetPasswordConfirmTiet = textInputEditText;
        this.loginSetPasswordConfirmTil = textInputLayout;
        this.loginSetPasswordContinueTv = ajioTextView3;
        this.loginSetPasswordDoLaterTv = ajioTextView4;
        this.loginSetPasswordHeaderTv = ajioTextView5;
        this.loginSetPasswordLimitView = linearLayout2;
        this.loginSetPasswordNumericLimitView = ajioTextView6;
        this.loginSetPasswordSpecialLimitView = ajioTextView7;
        this.loginSetPasswordTiet = textInputEditText2;
        this.loginSetPasswordTil = textInputLayout2;
    }

    public static FragmentLoginSetPasswordLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.login_set_password_alphabet_limit_view;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.login_set_password_character_limit_view;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                n3 = R$id.login_set_password_confirm_tiet;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (TextInputEditText)view2;
                if (object4 != null) {
                    n3 = R$id.login_set_password_confirm_til;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (TextInputLayout)view2;
                    if (object5 != null) {
                        n3 = R$id.login_set_password_continue_tv;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioTextView)view2;
                        if (object6 != null) {
                            n3 = R$id.login_set_password_do_later_tv;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (AjioTextView)view2;
                            if (object7 != null) {
                                n3 = R$id.login_set_password_header_tv;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (AjioTextView)view2;
                                if (object8 != null) {
                                    n3 = R$id.login_set_password_limit_view;
                                    View view3 = view2 = dd2_2.a(n3, view);
                                    view3 = (LinearLayout)view2;
                                    if (view3 != null) {
                                        n3 = R$id.login_set_password_numeric_limit_view;
                                        Object object9 = view2 = dd2_2.a(n3, view);
                                        object9 = (AjioTextView)view2;
                                        if (object9 != null) {
                                            n3 = R$id.login_set_password_special_limit_view;
                                            Object object10 = view2 = dd2_2.a(n3, view);
                                            object10 = (AjioTextView)view2;
                                            if (object10 != null) {
                                                n3 = R$id.login_set_password_tiet;
                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                object11 = (TextInputEditText)view2;
                                                if (object11 != null) {
                                                    n3 = R$id.login_set_password_til;
                                                    Object object12 = view2 = dd2_2.a(n3, view);
                                                    object12 = (TextInputLayout)view2;
                                                    if (object12 != null) {
                                                        View view4 = view;
                                                        view4 = (LinearLayout)view;
                                                        FragmentLoginSetPasswordLayoutBinding fragmentLoginSetPasswordLayoutBinding = new FragmentLoginSetPasswordLayoutBinding((LinearLayout)view4, (AjioTextView)object2, (AjioTextView)object3, (TextInputEditText)object4, (TextInputLayout)((Object)object5), (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (LinearLayout)view3, (AjioTextView)object9, (AjioTextView)object10, (TextInputEditText)object11, (TextInputLayout)((Object)object12));
                                                        return fragmentLoginSetPasswordLayoutBinding;
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

    public static FragmentLoginSetPasswordLayoutBinding inflate(LayoutInflater layoutInflater) {
        return FragmentLoginSetPasswordLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentLoginSetPasswordLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_login_set_password_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentLoginSetPasswordLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

