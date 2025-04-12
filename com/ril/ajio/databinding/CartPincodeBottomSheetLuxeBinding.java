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
import com.ril.ajio.customviews.widgets.LuxeUnderLineTextView;

public final class CartPincodeBottomSheetLuxeBinding
implements BC3 {
    public final ProgressBar addaddressProgressview;
    public final TextView agInvalidPincodeError;
    public final AppCompatImageView closeDialog;
    public final ConstraintLayout dlprLayoutContent;
    public final View faaVTopSep;
    public final AppCompatImageView ivBackClick;
    public final LuxeUnderLineTextView pdCheckPincode;
    public final TextView pdDialogTitle;
    public final TextInputEditText pdEnterPincodeEditText;
    public final TextInputLayout pdEnterPincodeEditTextInput;
    private final ConstraintLayout rootView;

    private CartPincodeBottomSheetLuxeBinding(ConstraintLayout constraintLayout, ProgressBar progressBar, TextView textView, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, View view, AppCompatImageView appCompatImageView2, LuxeUnderLineTextView luxeUnderLineTextView, TextView textView2, TextInputEditText textInputEditText, TextInputLayout textInputLayout) {
        this.rootView = constraintLayout;
        this.addaddressProgressview = progressBar;
        this.agInvalidPincodeError = textView;
        this.closeDialog = appCompatImageView;
        this.dlprLayoutContent = constraintLayout2;
        this.faaVTopSep = view;
        this.ivBackClick = appCompatImageView2;
        this.pdCheckPincode = luxeUnderLineTextView;
        this.pdDialogTitle = textView2;
        this.pdEnterPincodeEditText = textInputEditText;
        this.pdEnterPincodeEditTextInput = textInputLayout;
    }

    public static CartPincodeBottomSheetLuxeBinding bind(View object) {
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
                    View view4;
                    n3 = R$id.dlprLayoutContent;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (ConstraintLayout)view;
                    if (object3 != null && (view4 = dd2_2.a(n3 = R$id.faaVTopSep, object)) != null) {
                        n3 = R$id.iv_back_click;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AppCompatImageView)view;
                        if (object4 != null) {
                            n3 = R$id.pd_check_pincode;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (LuxeUnderLineTextView)view;
                            if (object5 != null) {
                                n3 = R$id.pd_dialog_title;
                                View view5 = view = dd2_2.a(n3, object);
                                view5 = (TextView)view;
                                if (view5 != null) {
                                    n3 = R$id.pd_enter_pincode_edit_text;
                                    Object object6 = view = dd2_2.a(n3, object);
                                    object6 = (TextInputEditText)view;
                                    if (object6 != null) {
                                        n3 = R$id.pd_enter_pincode_edit_text_input;
                                        Object object7 = view = dd2_2.a(n3, object);
                                        object7 = (TextInputLayout)view;
                                        if (object7 != null) {
                                            Object object8 = object;
                                            object8 = (ConstraintLayout)((Object)object);
                                            CartPincodeBottomSheetLuxeBinding cartPincodeBottomSheetLuxeBinding = new CartPincodeBottomSheetLuxeBinding((ConstraintLayout)((Object)object8), (ProgressBar)view2, (TextView)view3, (AppCompatImageView)((Object)object2), (ConstraintLayout)((Object)object3), view4, (AppCompatImageView)((Object)object4), (LuxeUnderLineTextView)object5, (TextView)view5, (TextInputEditText)object6, (TextInputLayout)((Object)object7));
                                            return cartPincodeBottomSheetLuxeBinding;
                                        }
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

    public static CartPincodeBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater) {
        return CartPincodeBottomSheetLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static CartPincodeBottomSheetLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_pincode_bottom_sheet_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartPincodeBottomSheetLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

