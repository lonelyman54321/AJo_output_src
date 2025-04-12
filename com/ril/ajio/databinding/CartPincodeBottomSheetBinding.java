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

public final class CartPincodeBottomSheetBinding
implements BC3 {
    public final ProgressBar addaddressProgressview;
    public final TextView agInvalidPincodeError;
    public final AppCompatImageView closeDialog;
    public final ConstraintLayout dlprLayoutContent;
    public final TextView pdCheckPincode;
    public final TextView pdDialogTitle;
    public final TextInputEditText pdEnterPincodeEditText;
    public final TextInputLayout pdEnterPincodeEditTextInput;
    private final ConstraintLayout rootView;

    private CartPincodeBottomSheetBinding(ConstraintLayout constraintLayout, ProgressBar progressBar, TextView textView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, TextView textView2, TextView textView3, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        this.rootView = constraintLayout;
        this.addaddressProgressview = progressBar;
        this.agInvalidPincodeError = textView;
        this.closeDialog = appCompatImageView;
        this.dlprLayoutContent = constraintLayout2;
        this.pdCheckPincode = textView2;
        this.pdDialogTitle = textView3;
        this.pdEnterPincodeEditText = textInputEditText;
        this.pdEnterPincodeEditTextInput = textInputLayout;
    }

    public static CartPincodeBottomSheetBinding bind(View object) {
        View view;
        int n3 = R$id.addaddress_progressview;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ProgressBar)view;
        if (view2 != null) {
            n3 = R$id.ag_invalid_pincode_error;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.close_dialog;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AppCompatImageView)view;
                if (object2 != null) {
                    n3 = R$id.dlprLayoutContent;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (ConstraintLayout)view;
                    if (object3 != null) {
                        n3 = R$id.pd_check_pincode;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (TextView)view;
                        if (view4 != null) {
                            n3 = R$id.pd_dialog_title;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (TextView)view;
                            if (view5 != null) {
                                n3 = R$id.pd_enter_pincode_edit_text;
                                Object object4 = view = dd2_2.a(n3, object);
                                object4 = (TextInputEditText)view;
                                if (object4 != null) {
                                    n3 = R$id.pd_enter_pincode_edit_text_input;
                                    Object object5 = view = dd2_2.a(n3, object);
                                    object5 = (TextInputLayout)view;
                                    if (object5 != null) {
                                        Object object6 = object;
                                        object6 = (ConstraintLayout)((Object)object);
                                        CartPincodeBottomSheetBinding cartPincodeBottomSheetBinding = new CartPincodeBottomSheetBinding((ConstraintLayout)((Object)object6), (ProgressBar)view2, (TextView)view3, (AppCompatImageView)((Object)object2), (ConstraintLayout)((Object)object3), (TextView)view4, (TextView)view5, (TextInputEditText)object4, (TextInputLayout)((Object)object5));
                                        return cartPincodeBottomSheetBinding;
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

    public static CartPincodeBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return CartPincodeBottomSheetBinding.inflate(layoutInflater, null, false);
    }

    public static CartPincodeBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_pincode_bottom_sheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartPincodeBottomSheetBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

