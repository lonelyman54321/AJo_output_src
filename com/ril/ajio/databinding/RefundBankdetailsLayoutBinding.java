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
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class RefundBankdetailsLayoutBinding
implements BC3 {
    public final AjioEditText etRefundAccountnumber;
    public final TextInputLayout etRefundAccountnumberTextInput;
    public final AjioEditText etRefundConfirmaccountnumber;
    public final TextInputLayout etRefundConfirmaccountnumberTextInput;
    public final AjioEditText etRefundIfsccode;
    public final TextInputLayout etRefundIfsccodeTextInput;
    public final LinearLayout layoutIfscVerified;
    private final LinearLayout rootView;
    public final AjioTextView tvAccountnumberError;
    public final AjioTextView tvConfirmaccountnumberError;
    public final AjioTextView tvIfscInfo;
    public final AjioTextView tvIfsccodeBlankError;
    public final AjioTextView whatIsIfsc;

    private RefundBankdetailsLayoutBinding(LinearLayout linearLayout, AjioEditText ajioEditText, TextInputLayout textInputLayout, AjioEditText ajioEditText2, TextInputLayout textInputLayout2, AjioEditText ajioEditText3, TextInputLayout textInputLayout3, LinearLayout linearLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5) {
        this.rootView = linearLayout;
        this.etRefundAccountnumber = ajioEditText;
        this.etRefundAccountnumberTextInput = textInputLayout;
        this.etRefundConfirmaccountnumber = ajioEditText2;
        this.etRefundConfirmaccountnumberTextInput = textInputLayout2;
        this.etRefundIfsccode = ajioEditText3;
        this.etRefundIfsccodeTextInput = textInputLayout3;
        this.layoutIfscVerified = linearLayout2;
        this.tvAccountnumberError = ajioTextView;
        this.tvConfirmaccountnumberError = ajioTextView2;
        this.tvIfscInfo = ajioTextView3;
        this.tvIfsccodeBlankError = ajioTextView4;
        this.whatIsIfsc = ajioTextView5;
    }

    public static RefundBankdetailsLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.et_refund_accountnumber;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioEditText)view2;
        if (object2 != null) {
            n3 = R$id.et_refund_accountnumber_text_input;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (TextInputLayout)view2;
            if (object3 != null) {
                n3 = R$id.et_refund_confirmaccountnumber;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioEditText)view2;
                if (object4 != null) {
                    n3 = R$id.et_refund_confirmaccountnumber_text_input;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (TextInputLayout)view2;
                    if (object5 != null) {
                        n3 = R$id.et_refund_ifsccode;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioEditText)view2;
                        if (object6 != null) {
                            n3 = R$id.et_refund_ifsccode_text_input;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (TextInputLayout)view2;
                            if (object7 != null) {
                                n3 = R$id.layout_ifsc_verified;
                                View view3 = view2 = dd2_2.a(n3, view);
                                view3 = (LinearLayout)view2;
                                if (view3 != null) {
                                    n3 = R$id.tv_accountnumber_error;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (AjioTextView)view2;
                                    if (object8 != null) {
                                        n3 = R$id.tv_confirmaccountnumber_error;
                                        Object object9 = view2 = dd2_2.a(n3, view);
                                        object9 = (AjioTextView)view2;
                                        if (object9 != null) {
                                            n3 = R$id.tv_ifsc_info;
                                            Object object10 = view2 = dd2_2.a(n3, view);
                                            object10 = (AjioTextView)view2;
                                            if (object10 != null) {
                                                n3 = R$id.tv_ifsccode_blank_error;
                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                object11 = (AjioTextView)view2;
                                                if (object11 != null) {
                                                    n3 = R$id.what_is_ifsc;
                                                    Object object12 = view2 = dd2_2.a(n3, view);
                                                    object12 = (AjioTextView)view2;
                                                    if (object12 != null) {
                                                        View view4 = view;
                                                        view4 = (LinearLayout)view;
                                                        RefundBankdetailsLayoutBinding refundBankdetailsLayoutBinding = new RefundBankdetailsLayoutBinding((LinearLayout)view4, (AjioEditText)object2, (TextInputLayout)((Object)object3), (AjioEditText)object4, (TextInputLayout)((Object)object5), (AjioEditText)object6, (TextInputLayout)((Object)object7), (LinearLayout)view3, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12);
                                                        return refundBankdetailsLayoutBinding;
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

    public static RefundBankdetailsLayoutBinding inflate(LayoutInflater layoutInflater) {
        return RefundBankdetailsLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static RefundBankdetailsLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.refund_bankdetails_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RefundBankdetailsLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

