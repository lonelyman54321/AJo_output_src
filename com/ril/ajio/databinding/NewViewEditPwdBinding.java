/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewViewEditPwdBinding
implements BC3 {
    public final AjioAspectRatioImageView close;
    public final AjioTextView errorMsg;
    public final TextInputLayout pwdTextInput;
    public final AjioEditText pwdTxt;
    private final ConstraintLayout rootView;
    public final TextView submitBtn;
    public final AjioTextView title;

    private NewViewEditPwdBinding(ConstraintLayout constraintLayout, AjioAspectRatioImageView ajioAspectRatioImageView, AjioTextView ajioTextView, TextInputLayout textInputLayout, AjioEditText ajioEditText, TextView textView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.close = ajioAspectRatioImageView;
        this.errorMsg = ajioTextView;
        this.pwdTextInput = textInputLayout;
        this.pwdTxt = ajioEditText;
        this.submitBtn = textView;
        this.title = ajioTextView2;
    }

    public static NewViewEditPwdBinding bind(View object) {
        View view;
        int n3 = R$id.close;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioAspectRatioImageView)view;
        if (object2 != null) {
            n3 = R$id.error_msg;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.pwd_text_input;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (TextInputLayout)view;
                if (object4 != null) {
                    n3 = R$id.pwd_txt;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioEditText)view;
                    if (object5 != null) {
                        n3 = R$id.submit_btn;
                        View view2 = view = dd2_2.a(n3, object);
                        view2 = (TextView)view;
                        if (view2 != null) {
                            n3 = R$id.title;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                Object object7 = object;
                                object7 = (ConstraintLayout)((Object)object);
                                NewViewEditPwdBinding newViewEditPwdBinding = new NewViewEditPwdBinding((ConstraintLayout)((Object)object7), (AjioAspectRatioImageView)((Object)object2), (AjioTextView)object3, (TextInputLayout)((Object)object4), (AjioEditText)object5, (TextView)view2, (AjioTextView)object6);
                                return newViewEditPwdBinding;
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

    public static NewViewEditPwdBinding inflate(LayoutInflater layoutInflater) {
        return NewViewEditPwdBinding.inflate(layoutInflater, null, false);
    }

    public static NewViewEditPwdBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_view_edit_pwd;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewViewEditPwdBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

