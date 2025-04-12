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
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewViewEditMobileOtpBinding
implements BC3 {
    public final TextInputLayout OTPtil;
    public final AjioAspectRatioImageView closeMobile;
    public final AjioAspectRatioImageView closeOtp;
    public final AjioTextView confirmOtpBtn;
    public final LinearLayout editMobileView;
    public final AjioTextView errorMsg;
    public final AjioTextView idNewNumberNoteMessage;
    public final AjioTextView idNewNumberNoteMessageEdit;
    public final AjioEditText mobileEditText;
    public final AjioTextView mobileErrorMsg;
    public final AjioEditText otpEditText;
    public final AjioTextView otpValidTime;
    public final LinearLayout otpView;
    public final LinearLayout parentLayout;
    public final AjioProgressView progressBar;
    public final AjioTextView resendOtp;
    public final AjioTextView resendOtpTime;
    private final FrameLayout rootView;
    public final AjioTextView sendOtpBtn;
    public final TextInputLayout telephoneFieldTextInput;
    public final AjioTextView userInfoTextview;

    private NewViewEditMobileOtpBinding(FrameLayout frameLayout, TextInputLayout textInputLayout, AjioAspectRatioImageView ajioAspectRatioImageView, AjioAspectRatioImageView ajioAspectRatioImageView2, AjioTextView ajioTextView, LinearLayout linearLayout, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioEditText ajioEditText, AjioTextView ajioTextView5, AjioEditText ajioEditText2, AjioTextView ajioTextView6, LinearLayout linearLayout2, LinearLayout linearLayout3, AjioProgressView ajioProgressView, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, TextInputLayout textInputLayout2, AjioTextView ajioTextView10) {
        this.rootView = frameLayout;
        this.OTPtil = textInputLayout;
        this.closeMobile = ajioAspectRatioImageView;
        this.closeOtp = ajioAspectRatioImageView2;
        this.confirmOtpBtn = ajioTextView;
        this.editMobileView = linearLayout;
        this.errorMsg = ajioTextView2;
        this.idNewNumberNoteMessage = ajioTextView3;
        this.idNewNumberNoteMessageEdit = ajioTextView4;
        this.mobileEditText = ajioEditText;
        this.mobileErrorMsg = ajioTextView5;
        this.otpEditText = ajioEditText2;
        this.otpValidTime = ajioTextView6;
        this.otpView = linearLayout2;
        this.parentLayout = linearLayout3;
        this.progressBar = ajioProgressView;
        this.resendOtp = ajioTextView7;
        this.resendOtpTime = ajioTextView8;
        this.sendOtpBtn = ajioTextView9;
        this.telephoneFieldTextInput = textInputLayout2;
        this.userInfoTextview = ajioTextView10;
    }

    public static NewViewEditMobileOtpBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.OTPtil;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (TextInputLayout)view2;
        if (object2 != null) {
            n3 = R$id.close_mobile;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioAspectRatioImageView)view2;
            if (object3 != null) {
                n3 = R$id.close_otp;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioAspectRatioImageView)view2;
                if (object4 != null) {
                    n3 = R$id.confirm_otp_btn;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioTextView)view2;
                    if (object5 != null) {
                        n3 = R$id.edit_mobile_view;
                        View view3 = view2 = dd2_2.a(n3, view);
                        view3 = (LinearLayout)view2;
                        if (view3 != null) {
                            n3 = R$id.error_msg;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (AjioTextView)view2;
                            if (object6 != null) {
                                n3 = R$id.id_new_number_note_message;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (AjioTextView)view2;
                                if (object7 != null) {
                                    n3 = R$id.id_new_number_note_message_edit;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (AjioTextView)view2;
                                    if (object8 != null) {
                                        n3 = R$id.mobile_edit_text;
                                        Object object9 = view2 = dd2_2.a(n3, view);
                                        object9 = (AjioEditText)view2;
                                        if (object9 != null) {
                                            n3 = R$id.mobile_error_msg;
                                            Object object10 = view2 = dd2_2.a(n3, view);
                                            object10 = (AjioTextView)view2;
                                            if (object10 != null) {
                                                n3 = R$id.otp_edit_text;
                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                object11 = (AjioEditText)view2;
                                                if (object11 != null) {
                                                    n3 = R$id.otp_valid_time;
                                                    Object object12 = view2 = dd2_2.a(n3, view);
                                                    object12 = (AjioTextView)view2;
                                                    if (object12 != null) {
                                                        n3 = R$id.otp_view;
                                                        View view4 = view2 = dd2_2.a(n3, view);
                                                        view4 = (LinearLayout)view2;
                                                        if (view4 != null) {
                                                            n3 = R$id.parent_layout;
                                                            View view5 = view2 = dd2_2.a(n3, view);
                                                            view5 = (LinearLayout)view2;
                                                            if (view5 != null) {
                                                                n3 = R$id.progress_bar;
                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                object13 = (AjioProgressView)view2;
                                                                if (object13 != null) {
                                                                    n3 = R$id.resend_otp;
                                                                    Object object14 = view2 = dd2_2.a(n3, view);
                                                                    object14 = (AjioTextView)view2;
                                                                    if (object14 != null) {
                                                                        n3 = R$id.resend_otp_time;
                                                                        Object object15 = view2 = dd2_2.a(n3, view);
                                                                        object15 = (AjioTextView)view2;
                                                                        if (object15 != null) {
                                                                            n3 = R$id.send_otp_btn;
                                                                            Object object16 = view2 = dd2_2.a(n3, view);
                                                                            object16 = (AjioTextView)view2;
                                                                            if (object16 != null) {
                                                                                n3 = R$id.telephone_field_text_input;
                                                                                Object object17 = view2 = dd2_2.a(n3, view);
                                                                                object17 = (TextInputLayout)view2;
                                                                                if (object17 != null) {
                                                                                    n3 = R$id.user_info_textview;
                                                                                    Object object18 = view2 = dd2_2.a(n3, view);
                                                                                    object18 = (AjioTextView)view2;
                                                                                    if (object18 != null) {
                                                                                        View view6 = view;
                                                                                        view6 = (FrameLayout)view;
                                                                                        NewViewEditMobileOtpBinding newViewEditMobileOtpBinding = new NewViewEditMobileOtpBinding((FrameLayout)view6, (TextInputLayout)((Object)object2), (AjioAspectRatioImageView)((Object)object3), (AjioAspectRatioImageView)((Object)object4), (AjioTextView)object5, (LinearLayout)view3, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioEditText)object9, (AjioTextView)object10, (AjioEditText)object11, (AjioTextView)object12, (LinearLayout)view4, (LinearLayout)view5, (AjioProgressView)((Object)object13), (AjioTextView)object14, (AjioTextView)object15, (AjioTextView)object16, (TextInputLayout)((Object)object17), (AjioTextView)object18);
                                                                                        return newViewEditMobileOtpBinding;
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

    public static NewViewEditMobileOtpBinding inflate(LayoutInflater layoutInflater) {
        return NewViewEditMobileOtpBinding.inflate(layoutInflater, null, false);
    }

    public static NewViewEditMobileOtpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_view_edit_mobile_otp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewViewEditMobileOtpBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

