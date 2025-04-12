/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ImpsNotPossibleRevampBinding;

public final class ImpsAccountDetailsRevampBinding
implements BC3 {
    public final AjioEditText accountNumberEt;
    public final TextInputLayout accountNumberTextInput;
    public final CardView ajioCashBalanceView;
    public final TextView awCashBalanceTv;
    public final TextView awTransferableCashTime;
    public final LinearLayout clParent;
    public final AjioEditText confirmAccountNumberEt;
    public final TextInputLayout confirmAccountNumberTextInput;
    public final AjioEditText ifscEt;
    public final TextInputLayout ifscTextInput;
    public final ImpsNotPossibleRevampBinding impsNotPossible;
    public final LinearLayout layoutIfscVerified;
    public final AjioLoaderView progressview;
    private final ConstraintLayout rootView;
    public final AjioTextView transferAmountValue;
    public final AjioTextView tvAccountDetailsLabel;
    public final AjioTextView tvAccountnumberError;
    public final AjioTextView tvConfirmaccountnumberError;
    public final AjioTextView tvIfscInfo;
    public final AjioTextView tvIfsccodeBlankError;
    public final AjioTextView whatIsIfsc;

    private ImpsAccountDetailsRevampBinding(ConstraintLayout constraintLayout, AjioEditText ajioEditText, TextInputLayout textInputLayout, CardView cardView, TextView textView, TextView textView2, LinearLayout linearLayout, AjioEditText ajioEditText2, TextInputLayout textInputLayout2, AjioEditText ajioEditText3, TextInputLayout textInputLayout3, ImpsNotPossibleRevampBinding impsNotPossibleRevampBinding, LinearLayout linearLayout2, AjioLoaderView ajioLoaderView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7) {
        this.rootView = constraintLayout;
        this.accountNumberEt = ajioEditText;
        this.accountNumberTextInput = textInputLayout;
        this.ajioCashBalanceView = cardView;
        this.awCashBalanceTv = textView;
        this.awTransferableCashTime = textView2;
        this.clParent = linearLayout;
        this.confirmAccountNumberEt = ajioEditText2;
        this.confirmAccountNumberTextInput = textInputLayout2;
        this.ifscEt = ajioEditText3;
        this.ifscTextInput = textInputLayout3;
        this.impsNotPossible = impsNotPossibleRevampBinding;
        this.layoutIfscVerified = linearLayout2;
        this.progressview = ajioLoaderView;
        this.transferAmountValue = ajioTextView;
        this.tvAccountDetailsLabel = ajioTextView2;
        this.tvAccountnumberError = ajioTextView3;
        this.tvConfirmaccountnumberError = ajioTextView4;
        this.tvIfscInfo = ajioTextView5;
        this.tvIfsccodeBlankError = ajioTextView6;
        this.whatIsIfsc = ajioTextView7;
    }

    public static ImpsAccountDetailsRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.account_number_et;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioEditText)view2;
        if (object2 != null) {
            n3 = R$id.account_number_text_input;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (TextInputLayout)view2;
            if (object3 != null) {
                n3 = R$id.ajio_cash_balance_view;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (CardView)view2;
                if (object4 != null) {
                    n3 = R$id.aw_cash_balance_tv;
                    View view3 = view2 = dd2_2.a(n3, view);
                    view3 = (TextView)view2;
                    if (view3 != null) {
                        n3 = R$id.aw_transferable_cash_time;
                        View view4 = view2 = dd2_2.a(n3, view);
                        view4 = (TextView)view2;
                        if (view4 != null) {
                            n3 = R$id.clParent;
                            View view5 = view2 = dd2_2.a(n3, view);
                            view5 = (LinearLayout)view2;
                            if (view5 != null) {
                                n3 = R$id.confirm_account_number_et;
                                Object object5 = view2 = dd2_2.a(n3, view);
                                object5 = (AjioEditText)view2;
                                if (object5 != null) {
                                    n3 = R$id.confirm_account_number_text_input;
                                    Object object6 = view2 = dd2_2.a(n3, view);
                                    object6 = (TextInputLayout)view2;
                                    if (object6 != null) {
                                        n3 = R$id.ifsc_et;
                                        Object object7 = view2 = dd2_2.a(n3, view);
                                        object7 = (AjioEditText)view2;
                                        if (object7 != null) {
                                            n3 = R$id.ifsc_text_input;
                                            Object object8 = view2 = dd2_2.a(n3, view);
                                            object8 = (TextInputLayout)view2;
                                            if (object8 != null && (view2 = dd2_2.a(n3 = R$id.imps_not_possible, view)) != null) {
                                                ImpsNotPossibleRevampBinding impsNotPossibleRevampBinding = ImpsNotPossibleRevampBinding.bind(view2);
                                                n3 = R$id.layout_ifsc_verified;
                                                View view6 = view2 = dd2_2.a(n3, view);
                                                view6 = (LinearLayout)view2;
                                                if (view6 != null) {
                                                    n3 = R$id.progressview;
                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                    object9 = (AjioLoaderView)view2;
                                                    if (object9 != null) {
                                                        n3 = R$id.transfer_amount_value;
                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                        object10 = (AjioTextView)view2;
                                                        if (object10 != null) {
                                                            n3 = R$id.tvAccountDetailsLabel;
                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                            object11 = (AjioTextView)view2;
                                                            if (object11 != null) {
                                                                n3 = R$id.tv_accountnumber_error;
                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                object12 = (AjioTextView)view2;
                                                                if (object12 != null) {
                                                                    n3 = R$id.tv_confirmaccountnumber_error;
                                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                                    object13 = (AjioTextView)view2;
                                                                    if (object13 != null) {
                                                                        n3 = R$id.tv_ifsc_info;
                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                        object14 = (AjioTextView)view2;
                                                                        if (object14 != null) {
                                                                            n3 = R$id.tv_ifsccode_blank_error;
                                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                                            object15 = (AjioTextView)view2;
                                                                            if (object15 != null) {
                                                                                n3 = R$id.what_is_ifsc;
                                                                                Object object16 = view2 = dd2_2.a(n3, view);
                                                                                object16 = (AjioTextView)view2;
                                                                                if (object16 != null) {
                                                                                    Object object17 = view;
                                                                                    object17 = (ConstraintLayout)view;
                                                                                    ImpsAccountDetailsRevampBinding impsAccountDetailsRevampBinding = new ImpsAccountDetailsRevampBinding((ConstraintLayout)((Object)object17), (AjioEditText)object2, (TextInputLayout)((Object)object3), (CardView)((Object)object4), (TextView)view3, (TextView)view4, (LinearLayout)view5, (AjioEditText)object5, (TextInputLayout)((Object)object6), (AjioEditText)object7, (TextInputLayout)((Object)object8), impsNotPossibleRevampBinding, (LinearLayout)view6, (AjioLoaderView)((Object)object9), (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, (AjioTextView)object15, (AjioTextView)object16);
                                                                                    return impsAccountDetailsRevampBinding;
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

    public static ImpsAccountDetailsRevampBinding inflate(LayoutInflater layoutInflater) {
        return ImpsAccountDetailsRevampBinding.inflate(layoutInflater, null, false);
    }

    public static ImpsAccountDetailsRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.imps_account_details_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ImpsAccountDetailsRevampBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

