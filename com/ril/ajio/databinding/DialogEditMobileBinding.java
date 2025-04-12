/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.ScrollView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class DialogEditMobileBinding
implements BC3 {
    public final AjioButton buttonSendOtp;
    public final AjioButton closeButton;
    public final LinearLayout contentRelative;
    public final LinearLayout middleLayout;
    public final AjioEditText mobileEdit;
    public final TextInputLayout mobileTextInput;
    public final TextInputLayout otpValTextInput;
    public final AjioEditText otpValue;
    public final AjioButton otpVerify;
    public final AjioTextView resendOtpMsg;
    private final RelativeLayout rootView;
    public final ScrollView scrollOtpview;
    public final AjioTextView title;
    public final View topDevider;
    public final AjioTextView tvOtpSentMessage;

    private DialogEditMobileBinding(RelativeLayout relativeLayout, AjioButton ajioButton, AjioButton ajioButton2, LinearLayout linearLayout, LinearLayout linearLayout2, AjioEditText ajioEditText, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, AjioEditText ajioEditText2, AjioButton ajioButton3, AjioTextView ajioTextView, ScrollView scrollView, AjioTextView ajioTextView2, View view, AjioTextView ajioTextView3) {
        this.rootView = relativeLayout;
        this.buttonSendOtp = ajioButton;
        this.closeButton = ajioButton2;
        this.contentRelative = linearLayout;
        this.middleLayout = linearLayout2;
        this.mobileEdit = ajioEditText;
        this.mobileTextInput = textInputLayout;
        this.otpValTextInput = textInputLayout2;
        this.otpValue = ajioEditText2;
        this.otpVerify = ajioButton3;
        this.resendOtpMsg = ajioTextView;
        this.scrollOtpview = scrollView;
        this.title = ajioTextView2;
        this.topDevider = view;
        this.tvOtpSentMessage = ajioTextView3;
    }

    public static DialogEditMobileBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.button_send_otp;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioButton)view2;
        if (object2 != null) {
            n3 = R$id.close_button;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioButton)view2;
            if (object3 != null) {
                n3 = R$id.content_relative;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (LinearLayout)view2;
                if (view3 != null) {
                    n3 = R$id.middle_layout;
                    View view4 = view2 = dd2_2.a(n3, view);
                    view4 = (LinearLayout)view2;
                    if (view4 != null) {
                        n3 = R$id.mobile_edit;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (AjioEditText)view2;
                        if (object4 != null) {
                            n3 = R$id.mobile_text_input;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (TextInputLayout)view2;
                            if (object5 != null) {
                                n3 = R$id.otp_val_text_input;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (TextInputLayout)view2;
                                if (object6 != null) {
                                    n3 = R$id.otp_value;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AjioEditText)view2;
                                    if (object7 != null) {
                                        n3 = R$id.otp_verify;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (AjioButton)view2;
                                        if (object8 != null) {
                                            n3 = R$id.resend_otp_msg;
                                            Object object9 = view2 = dd2_2.a(n3, view);
                                            object9 = (AjioTextView)view2;
                                            if (object9 != null) {
                                                n3 = R$id.scroll_otpview;
                                                View view5 = view2 = dd2_2.a(n3, view);
                                                view5 = (ScrollView)view2;
                                                if (view5 != null) {
                                                    View view6;
                                                    n3 = R$id.title;
                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                    object10 = (AjioTextView)view2;
                                                    if (object10 != null && (view6 = dd2_2.a(n3 = R$id.top_devider, view)) != null) {
                                                        n3 = R$id.tv_otp_sent_message;
                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                        object11 = (AjioTextView)view2;
                                                        if (object11 != null) {
                                                            View view7 = view;
                                                            view7 = (RelativeLayout)view;
                                                            DialogEditMobileBinding dialogEditMobileBinding = new DialogEditMobileBinding((RelativeLayout)view7, (AjioButton)object2, (AjioButton)object3, (LinearLayout)view3, (LinearLayout)view4, (AjioEditText)object4, (TextInputLayout)((Object)object5), (TextInputLayout)((Object)object6), (AjioEditText)object7, (AjioButton)object8, (AjioTextView)object9, (ScrollView)view5, (AjioTextView)object10, view6, (AjioTextView)object11);
                                                            return dialogEditMobileBinding;
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

    public static DialogEditMobileBinding inflate(LayoutInflater layoutInflater) {
        return DialogEditMobileBinding.inflate(layoutInflater, null, false);
    }

    public static DialogEditMobileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_edit_mobile;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogEditMobileBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

