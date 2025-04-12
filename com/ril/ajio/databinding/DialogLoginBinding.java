/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class DialogLoginBinding
implements BC3 {
    public final ImageView ajioImage;
    public final AjioButton closeButton;
    public final LinearLayout contentRelative;
    public final AjioButton joinAjioBt;
    private final RelativeLayout rootView;
    public final AjioButton signinAjioBt;
    public final AjioTextView title;

    private DialogLoginBinding(RelativeLayout relativeLayout, ImageView imageView, AjioButton ajioButton, LinearLayout linearLayout, AjioButton ajioButton2, AjioButton ajioButton3, AjioTextView ajioTextView) {
        this.rootView = relativeLayout;
        this.ajioImage = imageView;
        this.closeButton = ajioButton;
        this.contentRelative = linearLayout;
        this.joinAjioBt = ajioButton2;
        this.signinAjioBt = ajioButton3;
        this.title = ajioTextView;
    }

    public static DialogLoginBinding bind(View object) {
        View view;
        int n3 = R$id.ajio_image;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.close_button;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioButton)view;
            if (object2 != null) {
                n3 = R$id.content_relative;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (LinearLayout)view;
                if (view3 != null) {
                    n3 = R$id.join_ajio_bt;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioButton)view;
                    if (object3 != null) {
                        n3 = R$id.signin_ajio_bt;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioButton)view;
                        if (object4 != null) {
                            n3 = R$id.title;
                            Object object5 = view = dd2_2.a(n3, object);
                            object5 = (AjioTextView)view;
                            if (object5 != null) {
                                Object object6 = object;
                                object6 = (RelativeLayout)object;
                                DialogLoginBinding dialogLoginBinding = new DialogLoginBinding((RelativeLayout)object6, (ImageView)view2, (AjioButton)object2, (LinearLayout)view3, (AjioButton)object3, (AjioButton)object4, (AjioTextView)object5);
                                return dialogLoginBinding;
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

    public static DialogLoginBinding inflate(LayoutInflater layoutInflater) {
        return DialogLoginBinding.inflate(layoutInflater, null, false);
    }

    public static DialogLoginBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_login;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogLoginBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

