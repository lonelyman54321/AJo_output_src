/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.AjioProgressView;

public final class ActivityResetPasswordBinding
implements BC3 {
    public final LinearLayout activityResetPassword;
    public final Button btnResetpassword;
    public final EditText etNewpassword;
    public final EditText etRepeatpassword;
    public final TextInputLayout newpasswordcontainer;
    public final TextInputLayout repeatpasswordcontainer;
    public final AjioProgressView resetpasswordProgressBar;
    private final LinearLayout rootView;
    public final AjioCustomToolbar toolbar;
    public final TextView tvNewpasswordError;
    public final TextView tvRepeatpasswordError;

    private ActivityResetPasswordBinding(LinearLayout linearLayout, LinearLayout linearLayout2, Button button, EditText editText, EditText editText2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, AjioProgressView ajioProgressView, AjioCustomToolbar ajioCustomToolbar, TextView textView, TextView textView2) {
        this.rootView = linearLayout;
        this.activityResetPassword = linearLayout2;
        this.btnResetpassword = button;
        this.etNewpassword = editText;
        this.etRepeatpassword = editText2;
        this.newpasswordcontainer = textInputLayout;
        this.repeatpasswordcontainer = textInputLayout2;
        this.resetpasswordProgressBar = ajioProgressView;
        this.toolbar = ajioCustomToolbar;
        this.tvNewpasswordError = textView;
        this.tvRepeatpasswordError = textView2;
    }

    public static ActivityResetPasswordBinding bind(View object) {
        View view;
        View view2 = object;
        view2 = (LinearLayout)object;
        int n3 = R$id.btn_resetpassword;
        View view3 = view = dd2_2.a(n3, object);
        view3 = (Button)view;
        if (view3 != null) {
            n3 = R$id.et_newpassword;
            View view4 = view = dd2_2.a(n3, object);
            view4 = (EditText)view;
            if (view4 != null) {
                n3 = R$id.et_repeatpassword;
                View view5 = view = dd2_2.a(n3, object);
                view5 = (EditText)view;
                if (view5 != null) {
                    n3 = R$id.newpasswordcontainer;
                    Object object2 = view = dd2_2.a(n3, object);
                    object2 = (TextInputLayout)view;
                    if (object2 != null) {
                        n3 = R$id.repeatpasswordcontainer;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (TextInputLayout)view;
                        if (object3 != null) {
                            n3 = R$id.resetpassword_progress_bar;
                            Object object4 = view = dd2_2.a(n3, object);
                            object4 = (AjioProgressView)view;
                            if (object4 != null) {
                                n3 = R$id.toolbar;
                                Object object5 = view = dd2_2.a(n3, object);
                                object5 = (AjioCustomToolbar)view;
                                if (object5 != null) {
                                    n3 = R$id.tv_newpassword_error;
                                    View view6 = view = dd2_2.a(n3, object);
                                    view6 = (TextView)view;
                                    if (view6 != null) {
                                        n3 = R$id.tv_repeatpassword_error;
                                        View view7 = view = dd2_2.a(n3, object);
                                        view7 = (TextView)view;
                                        if (view7 != null) {
                                            Object object6 = object;
                                            view = view2;
                                            object = new ActivityResetPasswordBinding((LinearLayout)view2, (LinearLayout)view2, (Button)view3, (EditText)view4, (EditText)view5, (TextInputLayout)((Object)object2), (TextInputLayout)((Object)object3), (AjioProgressView)((Object)object4), (AjioCustomToolbar)object5, (TextView)view6, (TextView)view7);
                                            return object;
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

    public static ActivityResetPasswordBinding inflate(LayoutInflater layoutInflater) {
        return ActivityResetPasswordBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityResetPasswordBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_reset_password;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityResetPasswordBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

