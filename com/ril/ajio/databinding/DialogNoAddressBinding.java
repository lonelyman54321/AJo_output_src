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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class DialogNoAddressBinding
implements BC3 {
    public final View dnaClose;
    public final LinearLayout dnaLayoutContent;
    public final TextView dnaTvAddAddress;
    public final TextView dnaTvMessage;
    public final TextView dnaTvTitle;
    private final ConstraintLayout rootView;

    private DialogNoAddressBinding(ConstraintLayout constraintLayout, View view, LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = constraintLayout;
        this.dnaClose = view;
        this.dnaLayoutContent = linearLayout;
        this.dnaTvAddAddress = textView;
        this.dnaTvMessage = textView2;
        this.dnaTvTitle = textView3;
    }

    public static DialogNoAddressBinding bind(View object) {
        int n3 = R$id.dnaClose;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            Object object2;
            n3 = R$id.dnaLayoutContent;
            View view2 = object2 = dd2_2.a(n3, object);
            view2 = (LinearLayout)object2;
            if (view2 != null) {
                n3 = R$id.dnaTvAddAddress;
                View view3 = object2 = dd2_2.a(n3, object);
                view3 = (TextView)object2;
                if (view3 != null) {
                    n3 = R$id.dnaTvMessage;
                    View view4 = object2 = dd2_2.a(n3, object);
                    view4 = (TextView)object2;
                    if (view4 != null) {
                        n3 = R$id.dnaTvTitle;
                        View view5 = object2 = dd2_2.a(n3, object);
                        view5 = (TextView)object2;
                        if (view5 != null) {
                            DialogNoAddressBinding dialogNoAddressBinding;
                            Object object3 = object;
                            object3 = (ConstraintLayout)((Object)object);
                            object2 = dialogNoAddressBinding;
                            dialogNoAddressBinding = new DialogNoAddressBinding((ConstraintLayout)((Object)object3), view, (LinearLayout)view2, (TextView)view3, (TextView)view4, (TextView)view5);
                            return dialogNoAddressBinding;
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

    public static DialogNoAddressBinding inflate(LayoutInflater layoutInflater) {
        return DialogNoAddressBinding.inflate(layoutInflater, null, false);
    }

    public static DialogNoAddressBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_no_address;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogNoAddressBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

