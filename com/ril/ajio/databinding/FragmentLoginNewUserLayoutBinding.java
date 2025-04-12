/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RadioGroup
 *  android.widget.ScrollView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioRadioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FragmentLoginNewUserLayoutBinding
implements BC3 {
    public final AjioTextView loginAjioCashInfo;
    public final AjioTextView loginNewUserEmailEditTv;
    public final AjioTextView loginNewUserEmailEntryTv;
    public final AjioTextView loginNewUserEmailHeadTv;
    public final TextInputEditText loginNewUserEmailTiet;
    public final TextInputLayout loginNewUserEmailTil;
    public final ConstraintLayout loginNewUserEmailView;
    public final LinearLayout loginNewUserFbView;
    public final LinearLayout loginNewUserGoogleView;
    public final AjioTextView loginNewUserHeaderTv;
    public final TextView loginNewUserInvalidReferral;
    public final TextInputEditText loginNewUserInviteCodeTiet;
    public final TextInputLayout loginNewUserInviteCodeTil;
    public final AjioTextView loginNewUserMobileEditTv;
    public final AjioTextView loginNewUserMobileEntryTv;
    public final AjioTextView loginNewUserMobileHeadTv;
    public final TextInputEditText loginNewUserMobileTiet;
    public final TextInputLayout loginNewUserMobileTil;
    public final LinearLayout loginNewUserMobileView;
    public final TextInputEditText loginNewUserNameTiet;
    public final TextInputLayout loginNewUserNameTil;
    public final LinearLayout loginNewUserOrDividerView;
    public final AjioTextView loginNewUserPasswordAlphabetLimitView;
    public final AjioTextView loginNewUserPasswordCharacterLimitView;
    public final LinearLayout loginNewUserPasswordLimitView;
    public final AjioTextView loginNewUserPasswordNumericLimitView;
    public final AjioTextView loginNewUserPasswordSpecialLimitView;
    public final TextInputEditText loginNewUserPasswordTiet;
    public final TextInputLayout loginNewUserPasswordTil;
    public final AjioTextView loginNewUserSendOtpTv;
    public final LinearLayout loginNewUserSocialLoginView;
    public final AppCompatCheckBox loginNewUserTAndCCb;
    public final AjioTextView loginNewUserTAndCTv;
    public final LinearLayout loginNewUserTAndCView;
    public final AjioRadioButton rbNewuserFemale;
    public final AjioRadioButton rbNewuserMale;
    public final RadioGroup rgNewuserGenderOptions;
    private final ScrollView rootView;

    private FragmentLoginNewUserLayoutBinding(ScrollView scrollView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, TextInputEditText textInputEditText, TextInputLayout textInputLayout, ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView5, TextView textView, TextInputEditText textInputEditText2, TextInputLayout textInputLayout2, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, TextInputEditText textInputEditText3, TextInputLayout textInputLayout3, LinearLayout linearLayout3, TextInputEditText textInputEditText4, TextInputLayout textInputLayout4, LinearLayout linearLayout4, AjioTextView ajioTextView9, AjioTextView ajioTextView10, LinearLayout linearLayout5, AjioTextView ajioTextView11, AjioTextView ajioTextView12, TextInputEditText textInputEditText5, TextInputLayout textInputLayout5, AjioTextView ajioTextView13, LinearLayout linearLayout6, AppCompatCheckBox appCompatCheckBox, AjioTextView ajioTextView14, LinearLayout linearLayout7, AjioRadioButton ajioRadioButton, AjioRadioButton ajioRadioButton2, RadioGroup radioGroup) {
        this.rootView = scrollView;
        this.loginAjioCashInfo = ajioTextView;
        this.loginNewUserEmailEditTv = ajioTextView2;
        this.loginNewUserEmailEntryTv = ajioTextView3;
        this.loginNewUserEmailHeadTv = ajioTextView4;
        this.loginNewUserEmailTiet = textInputEditText;
        this.loginNewUserEmailTil = textInputLayout;
        this.loginNewUserEmailView = constraintLayout;
        this.loginNewUserFbView = linearLayout;
        this.loginNewUserGoogleView = linearLayout2;
        this.loginNewUserHeaderTv = ajioTextView5;
        this.loginNewUserInvalidReferral = textView;
        this.loginNewUserInviteCodeTiet = textInputEditText2;
        this.loginNewUserInviteCodeTil = textInputLayout2;
        this.loginNewUserMobileEditTv = ajioTextView6;
        this.loginNewUserMobileEntryTv = ajioTextView7;
        this.loginNewUserMobileHeadTv = ajioTextView8;
        this.loginNewUserMobileTiet = textInputEditText3;
        this.loginNewUserMobileTil = textInputLayout3;
        this.loginNewUserMobileView = linearLayout3;
        this.loginNewUserNameTiet = textInputEditText4;
        this.loginNewUserNameTil = textInputLayout4;
        this.loginNewUserOrDividerView = linearLayout4;
        this.loginNewUserPasswordAlphabetLimitView = ajioTextView9;
        this.loginNewUserPasswordCharacterLimitView = ajioTextView10;
        this.loginNewUserPasswordLimitView = linearLayout5;
        this.loginNewUserPasswordNumericLimitView = ajioTextView11;
        this.loginNewUserPasswordSpecialLimitView = ajioTextView12;
        this.loginNewUserPasswordTiet = textInputEditText5;
        this.loginNewUserPasswordTil = textInputLayout5;
        this.loginNewUserSendOtpTv = ajioTextView13;
        this.loginNewUserSocialLoginView = linearLayout6;
        this.loginNewUserTAndCCb = appCompatCheckBox;
        this.loginNewUserTAndCTv = ajioTextView14;
        this.loginNewUserTAndCView = linearLayout7;
        this.rbNewuserFemale = ajioRadioButton;
        this.rbNewuserMale = ajioRadioButton2;
        this.rgNewuserGenderOptions = radioGroup;
    }

    public static FragmentLoginNewUserLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.login_ajio_cash_info;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.login_new_user_email_edit_tv;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                n3 = R$id.login_new_user_email_entry_tv;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioTextView)view2;
                if (object4 != null) {
                    n3 = R$id.login_new_user_email_head_tv;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioTextView)view2;
                    if (object5 != null) {
                        n3 = R$id.login_new_user_email_tiet;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (TextInputEditText)view2;
                        if (object6 != null) {
                            n3 = R$id.login_new_user_email_til;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (TextInputLayout)view2;
                            if (object7 != null) {
                                n3 = R$id.login_new_user_email_view;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (ConstraintLayout)view2;
                                if (object8 != null) {
                                    n3 = R$id.login_new_user_fb_view;
                                    View view3 = view2 = dd2_2.a(n3, view);
                                    view3 = (LinearLayout)view2;
                                    if (view3 != null) {
                                        n3 = R$id.login_new_user_google_view;
                                        View view4 = view2 = dd2_2.a(n3, view);
                                        view4 = (LinearLayout)view2;
                                        if (view4 != null) {
                                            n3 = R$id.login_new_user_header_tv;
                                            Object object9 = view2 = dd2_2.a(n3, view);
                                            object9 = (AjioTextView)view2;
                                            if (object9 != null) {
                                                n3 = R$id.login_new_user_invalid_referral;
                                                View view5 = view2 = dd2_2.a(n3, view);
                                                view5 = (TextView)view2;
                                                if (view5 != null) {
                                                    n3 = R$id.login_new_user_invite_code_tiet;
                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                    object10 = (TextInputEditText)view2;
                                                    if (object10 != null) {
                                                        n3 = R$id.login_new_user_invite_code_til;
                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                        object11 = (TextInputLayout)view2;
                                                        if (object11 != null) {
                                                            n3 = R$id.login_new_user_mobile_edit_tv;
                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                            object12 = (AjioTextView)view2;
                                                            if (object12 != null) {
                                                                n3 = R$id.login_new_user_mobile_entry_tv;
                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                object13 = (AjioTextView)view2;
                                                                if (object13 != null) {
                                                                    n3 = R$id.login_new_user_mobile_head_tv;
                                                                    Object object14 = view2 = dd2_2.a(n3, view);
                                                                    object14 = (AjioTextView)view2;
                                                                    if (object14 != null) {
                                                                        n3 = R$id.login_new_user_mobile_tiet;
                                                                        Object object15 = view2 = dd2_2.a(n3, view);
                                                                        object15 = (TextInputEditText)view2;
                                                                        if (object15 != null) {
                                                                            n3 = R$id.login_new_user_mobile_til;
                                                                            Object object16 = view2 = dd2_2.a(n3, view);
                                                                            object16 = (TextInputLayout)view2;
                                                                            if (object16 != null) {
                                                                                n3 = R$id.login_new_user_mobile_view;
                                                                                View view6 = view2 = dd2_2.a(n3, view);
                                                                                view6 = (LinearLayout)view2;
                                                                                if (view6 != null) {
                                                                                    n3 = R$id.login_new_user_name_tiet;
                                                                                    Object object17 = view2 = dd2_2.a(n3, view);
                                                                                    object17 = (TextInputEditText)view2;
                                                                                    if (object17 != null) {
                                                                                        n3 = R$id.login_new_user_name_til;
                                                                                        Object object18 = view2 = dd2_2.a(n3, view);
                                                                                        object18 = (TextInputLayout)view2;
                                                                                        if (object18 != null) {
                                                                                            n3 = R$id.login_new_user_or_divider_view;
                                                                                            View view7 = view2 = dd2_2.a(n3, view);
                                                                                            view7 = (LinearLayout)view2;
                                                                                            if (view7 != null) {
                                                                                                n3 = R$id.login_new_user_password_alphabet_limit_view;
                                                                                                Object object19 = view2 = dd2_2.a(n3, view);
                                                                                                object19 = (AjioTextView)view2;
                                                                                                if (object19 != null) {
                                                                                                    n3 = R$id.login_new_user_password_character_limit_view;
                                                                                                    Object object20 = view2 = dd2_2.a(n3, view);
                                                                                                    object20 = (AjioTextView)view2;
                                                                                                    if (object20 != null) {
                                                                                                        n3 = R$id.login_new_user_password_limit_view;
                                                                                                        View view8 = view2 = dd2_2.a(n3, view);
                                                                                                        view8 = (LinearLayout)view2;
                                                                                                        if (view8 != null) {
                                                                                                            n3 = R$id.login_new_user_password_numeric_limit_view;
                                                                                                            Object object21 = view2 = dd2_2.a(n3, view);
                                                                                                            object21 = (AjioTextView)view2;
                                                                                                            if (object21 != null) {
                                                                                                                n3 = R$id.login_new_user_password_special_limit_view;
                                                                                                                Object object22 = view2 = dd2_2.a(n3, view);
                                                                                                                object22 = (AjioTextView)view2;
                                                                                                                if (object22 != null) {
                                                                                                                    n3 = R$id.login_new_user_password_tiet;
                                                                                                                    Object object23 = view2 = dd2_2.a(n3, view);
                                                                                                                    object23 = (TextInputEditText)view2;
                                                                                                                    if (object23 != null) {
                                                                                                                        n3 = R$id.login_new_user_password_til;
                                                                                                                        Object object24 = view2 = dd2_2.a(n3, view);
                                                                                                                        object24 = (TextInputLayout)view2;
                                                                                                                        if (object24 != null) {
                                                                                                                            n3 = R$id.login_new_user_send_otp_tv;
                                                                                                                            Object object25 = view2 = dd2_2.a(n3, view);
                                                                                                                            object25 = (AjioTextView)view2;
                                                                                                                            if (object25 != null) {
                                                                                                                                n3 = R$id.login_new_user_social_login_view;
                                                                                                                                View view9 = view2 = dd2_2.a(n3, view);
                                                                                                                                view9 = (LinearLayout)view2;
                                                                                                                                if (view9 != null) {
                                                                                                                                    n3 = R$id.login_new_user_t_and_c_cb;
                                                                                                                                    Object object26 = view2 = dd2_2.a(n3, view);
                                                                                                                                    object26 = (AppCompatCheckBox)view2;
                                                                                                                                    if (object26 != null) {
                                                                                                                                        n3 = R$id.login_new_user_t_and_c_tv;
                                                                                                                                        Object object27 = view2 = dd2_2.a(n3, view);
                                                                                                                                        object27 = (AjioTextView)view2;
                                                                                                                                        if (object27 != null) {
                                                                                                                                            n3 = R$id.login_new_user_t_and_c_view;
                                                                                                                                            View view10 = view2 = dd2_2.a(n3, view);
                                                                                                                                            view10 = (LinearLayout)view2;
                                                                                                                                            if (view10 != null) {
                                                                                                                                                n3 = R$id.rb_newuser_female;
                                                                                                                                                Object object28 = view2 = dd2_2.a(n3, view);
                                                                                                                                                object28 = (AjioRadioButton)view2;
                                                                                                                                                if (object28 != null) {
                                                                                                                                                    n3 = R$id.rb_newuser_male;
                                                                                                                                                    Object object29 = view2 = dd2_2.a(n3, view);
                                                                                                                                                    object29 = (AjioRadioButton)view2;
                                                                                                                                                    if (object29 != null) {
                                                                                                                                                        n3 = R$id.rg_newuser_gender_options;
                                                                                                                                                        View view11 = view2 = dd2_2.a(n3, view);
                                                                                                                                                        view11 = (RadioGroup)view2;
                                                                                                                                                        if (view11 != null) {
                                                                                                                                                            View view12 = view;
                                                                                                                                                            view12 = (ScrollView)view;
                                                                                                                                                            FragmentLoginNewUserLayoutBinding fragmentLoginNewUserLayoutBinding = new FragmentLoginNewUserLayoutBinding((ScrollView)view12, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (TextInputEditText)object6, (TextInputLayout)((Object)object7), (ConstraintLayout)((Object)object8), (LinearLayout)view3, (LinearLayout)view4, (AjioTextView)object9, (TextView)view5, (TextInputEditText)object10, (TextInputLayout)((Object)object11), (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, (TextInputEditText)object15, (TextInputLayout)((Object)object16), (LinearLayout)view6, (TextInputEditText)object17, (TextInputLayout)((Object)object18), (LinearLayout)view7, (AjioTextView)object19, (AjioTextView)object20, (LinearLayout)view8, (AjioTextView)object21, (AjioTextView)object22, (TextInputEditText)object23, (TextInputLayout)((Object)object24), (AjioTextView)object25, (LinearLayout)view9, (AppCompatCheckBox)object26, (AjioTextView)object27, (LinearLayout)view10, (AjioRadioButton)object28, (AjioRadioButton)object29, (RadioGroup)view11);
                                                                                                                                                            return fragmentLoginNewUserLayoutBinding;
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

    public static FragmentLoginNewUserLayoutBinding inflate(LayoutInflater layoutInflater) {
        return FragmentLoginNewUserLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentLoginNewUserLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_login_new_user_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentLoginNewUserLayoutBinding.bind((View)layoutInflater);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}

