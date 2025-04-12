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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewViewUpdateProfileOtpBinding
implements BC3 {
    public final TextInputLayout OTPtil;
    public final AjioLoaderView ajioLoaderView;
    public final AppCompatImageButton closeDialog;
    public final AjioTextView confirmOtpBtn;
    public final AjioTextView errorMsg;
    public final AjioEditText otpEditText;
    public final AjioTextView otpValidTime;
    public final LinearLayout parentLayout;
    public final AjioProgressView progressBar;
    public final AjioTextView resendOtp;
    public final AjioTextView resendOtpTime;
    private final ConstraintLayout rootView;
    public final AjioTextView tvOtpHeading;
    public final AjioTextView userInfoTextview;

    private NewViewUpdateProfileOtpBinding(ConstraintLayout constraintLayout, TextInputLayout textInputLayout, AjioLoaderView ajioLoaderView, AppCompatImageButton appCompatImageButton, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioEditText ajioEditText, AjioTextView ajioTextView3, LinearLayout linearLayout, AjioProgressView ajioProgressView, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7) {
        this.rootView = constraintLayout;
        this.OTPtil = textInputLayout;
        this.ajioLoaderView = ajioLoaderView;
        this.closeDialog = appCompatImageButton;
        this.confirmOtpBtn = ajioTextView;
        this.errorMsg = ajioTextView2;
        this.otpEditText = ajioEditText;
        this.otpValidTime = ajioTextView3;
        this.parentLayout = linearLayout;
        this.progressBar = ajioProgressView;
        this.resendOtp = ajioTextView4;
        this.resendOtpTime = ajioTextView5;
        this.tvOtpHeading = ajioTextView6;
        this.userInfoTextview = ajioTextView7;
    }

    public static NewViewUpdateProfileOtpBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.OTPtil;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (TextInputLayout)view2;
        if (object2 != null) {
            n3 = R$id.ajio_loader_view;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioLoaderView)view2;
            if (object3 != null) {
                n3 = R$id.close_dialog;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AppCompatImageButton)view2;
                if (object4 != null) {
                    n3 = R$id.confirm_otp_btn;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioTextView)view2;
                    if (object5 != null) {
                        n3 = R$id.error_msg;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioTextView)view2;
                        if (object6 != null) {
                            n3 = R$id.otp_edit_text;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (AjioEditText)view2;
                            if (object7 != null) {
                                n3 = R$id.otp_valid_time;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (AjioTextView)view2;
                                if (object8 != null) {
                                    n3 = R$id.parent_layout;
                                    View view3 = view2 = dd2_2.a(n3, view);
                                    view3 = (LinearLayout)view2;
                                    if (view3 != null) {
                                        n3 = R$id.progress_bar;
                                        Object object9 = view2 = dd2_2.a(n3, view);
                                        object9 = (AjioProgressView)view2;
                                        if (object9 != null) {
                                            n3 = R$id.resend_otp;
                                            Object object10 = view2 = dd2_2.a(n3, view);
                                            object10 = (AjioTextView)view2;
                                            if (object10 != null) {
                                                n3 = R$id.resend_otp_time;
                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                object11 = (AjioTextView)view2;
                                                if (object11 != null) {
                                                    n3 = R$id.tvOtpHeading;
                                                    Object object12 = view2 = dd2_2.a(n3, view);
                                                    object12 = (AjioTextView)view2;
                                                    if (object12 != null) {
                                                        n3 = R$id.user_info_textview;
                                                        Object object13 = view2 = dd2_2.a(n3, view);
                                                        object13 = (AjioTextView)view2;
                                                        if (object13 != null) {
                                                            Object object14 = view;
                                                            object14 = (ConstraintLayout)view;
                                                            NewViewUpdateProfileOtpBinding newViewUpdateProfileOtpBinding = new NewViewUpdateProfileOtpBinding((ConstraintLayout)((Object)object14), (TextInputLayout)((Object)object2), (AjioLoaderView)((Object)object3), (AppCompatImageButton)((Object)object4), (AjioTextView)object5, (AjioTextView)object6, (AjioEditText)object7, (AjioTextView)object8, (LinearLayout)view3, (AjioProgressView)((Object)object9), (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13);
                                                            return newViewUpdateProfileOtpBinding;
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

    public static NewViewUpdateProfileOtpBinding inflate(LayoutInflater layoutInflater) {
        return NewViewUpdateProfileOtpBinding.inflate(layoutInflater, null, false);
    }

    public static NewViewUpdateProfileOtpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_view_update_profile_otp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewViewUpdateProfileOtpBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

