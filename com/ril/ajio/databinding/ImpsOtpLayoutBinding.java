/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ImpsOtpLayoutBinding
implements BC3 {
    public final AjioButton confirmButton;
    public final ProgressBar detectingotpProgressview;
    public final AjioTextView emailPhNo;
    public final AjioEditText etOtp;
    private final RelativeLayout rootView;
    public final RelativeLayout signinotpResendotpContainer;
    public final AjioTextView tvSigninotpResendotp;
    public final AjioTextView tvSigninotpTimerExpires;

    private ImpsOtpLayoutBinding(RelativeLayout relativeLayout, AjioButton ajioButton, ProgressBar progressBar, AjioTextView ajioTextView, AjioEditText ajioEditText, RelativeLayout relativeLayout2, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = relativeLayout;
        this.confirmButton = ajioButton;
        this.detectingotpProgressview = progressBar;
        this.emailPhNo = ajioTextView;
        this.etOtp = ajioEditText;
        this.signinotpResendotpContainer = relativeLayout2;
        this.tvSigninotpResendotp = ajioTextView2;
        this.tvSigninotpTimerExpires = ajioTextView3;
    }

    public static ImpsOtpLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.confirm_button;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioButton)view;
        if (object2 != null) {
            n3 = R$id.detectingotp_progressview;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ProgressBar)view;
            if (view2 != null) {
                n3 = R$id.email_ph_no;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.et_otp;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioEditText)view;
                    if (object4 != null) {
                        n3 = R$id.signinotp_resendotp_container;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (RelativeLayout)view;
                        if (view3 != null) {
                            n3 = R$id.tv_signinotp_resendotp;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioTextView)view;
                            if (object5 != null) {
                                n3 = R$id.tv_signinotp_timer_expires;
                                Object object6 = view = dd2_2.a(n3, object);
                                object6 = (AjioTextView)view;
                                if (object6 != null) {
                                    Object object7 = object;
                                    object7 = (RelativeLayout)object;
                                    ImpsOtpLayoutBinding impsOtpLayoutBinding = new ImpsOtpLayoutBinding((RelativeLayout)object7, (AjioButton)object2, (ProgressBar)view2, (AjioTextView)object3, (AjioEditText)object4, (RelativeLayout)view3, (AjioTextView)object5, (AjioTextView)object6);
                                    return impsOtpLayoutBinding;
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

    public static ImpsOtpLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ImpsOtpLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ImpsOtpLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.imps_otp_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ImpsOtpLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

