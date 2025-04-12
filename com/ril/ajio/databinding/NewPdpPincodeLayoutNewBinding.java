/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ProgressBar
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewPdpPincodeLayoutNewBinding
implements BC3 {
    public final ProgressBar addaddressProgressview;
    public final AppCompatImageView closeDialog;
    public final ConstraintLayout dlprLayoutContent;
    public final TextInputEditText fragmentPincodeEtPincode;
    public final TextView fragmentPincodeTvCheck;
    public final TextView fragmentPincodeTvError;
    public final TextInputLayout pdEnterPincodeEditTextInput;
    public final AjioTextView pincodeHeader;
    private final ConstraintLayout rootView;

    private NewPdpPincodeLayoutNewBinding(ConstraintLayout constraintLayout, ProgressBar progressBar, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, TextInputEditText textInputEditText, TextView textView, TextView textView2, TextInputLayout textInputLayout, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.addaddressProgressview = progressBar;
        this.closeDialog = appCompatImageView;
        this.dlprLayoutContent = constraintLayout2;
        this.fragmentPincodeEtPincode = textInputEditText;
        this.fragmentPincodeTvCheck = textView;
        this.fragmentPincodeTvError = textView2;
        this.pdEnterPincodeEditTextInput = textInputLayout;
        this.pincodeHeader = ajioTextView;
    }

    public static NewPdpPincodeLayoutNewBinding bind(View object) {
        View view;
        int n3 = R$id.addaddress_progressview;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ProgressBar)view;
        if (view2 != null) {
            n3 = R$id.close_dialog;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AppCompatImageView)view;
            if (object2 != null) {
                n3 = R$id.dlprLayoutContent;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (ConstraintLayout)view;
                if (object3 != null) {
                    n3 = R$id.fragment_pincode_et_pincode;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (TextInputEditText)view;
                    if (object4 != null) {
                        n3 = R$id.fragment_pincode_tv_check;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (TextView)view;
                        if (view3 != null) {
                            n3 = R$id.fragment_pincode_tv_error;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (TextView)view;
                            if (view4 != null) {
                                n3 = R$id.pd_enter_pincode_edit_text_input;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (TextInputLayout)view;
                                if (object5 != null) {
                                    n3 = R$id.pincode_header;
                                    Object object6 = view = dd2_2.a(n3, object);
                                    object6 = (AjioTextView)view;
                                    if (object6 != null) {
                                        Object object7 = object;
                                        object7 = (ConstraintLayout)((Object)object);
                                        NewPdpPincodeLayoutNewBinding newPdpPincodeLayoutNewBinding = new NewPdpPincodeLayoutNewBinding((ConstraintLayout)((Object)object7), (ProgressBar)view2, (AppCompatImageView)((Object)object2), (ConstraintLayout)((Object)object3), (TextInputEditText)object4, (TextView)view3, (TextView)view4, (TextInputLayout)((Object)object5), (AjioTextView)object6);
                                        return newPdpPincodeLayoutNewBinding;
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

    public static NewPdpPincodeLayoutNewBinding inflate(LayoutInflater layoutInflater) {
        return NewPdpPincodeLayoutNewBinding.inflate(layoutInflater, null, false);
    }

    public static NewPdpPincodeLayoutNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_pdp_pincode_layout_new;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewPdpPincodeLayoutNewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

