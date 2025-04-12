/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class MyAccountTitleViewJcpBinding
implements BC3 {
    public final AjioTextView nameLetters;
    private final ConstraintLayout rootView;
    public final AjioTextView userName;
    public final AjioTextView userPhoneNo;

    private MyAccountTitleViewJcpBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.nameLetters = ajioTextView;
        this.userName = ajioTextView2;
        this.userPhoneNo = ajioTextView3;
    }

    public static MyAccountTitleViewJcpBinding bind(View object) {
        AjioTextView ajioTextView;
        AjioTextView ajioTextView2;
        int n3 = R$id.name_letters;
        AjioTextView ajioTextView3 = (AjioTextView)dd2_2.a(n3, object);
        if (ajioTextView3 != null && (ajioTextView2 = (AjioTextView)dd2_2.a(n3 = R$id.user_name, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.user_phone_no, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            MyAccountTitleViewJcpBinding myAccountTitleViewJcpBinding = new MyAccountTitleViewJcpBinding((ConstraintLayout)((Object)object), ajioTextView3, ajioTextView2, ajioTextView);
            return myAccountTitleViewJcpBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static MyAccountTitleViewJcpBinding inflate(LayoutInflater layoutInflater) {
        return MyAccountTitleViewJcpBinding.inflate(layoutInflater, null, false);
    }

    public static MyAccountTitleViewJcpBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.my_account_title_view_jcp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return MyAccountTitleViewJcpBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

