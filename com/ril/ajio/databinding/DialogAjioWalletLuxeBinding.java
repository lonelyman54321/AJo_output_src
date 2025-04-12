/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class DialogAjioWalletLuxeBinding
implements BC3 {
    public final TextView ajioWalletHeader;
    public final TextView ajioWalletSubHeader;
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final TextView okayBtn;
    private final LinearLayout rootView;

    private DialogAjioWalletLuxeBinding(LinearLayout linearLayout, TextView textView, TextView textView2, ImageView imageView, FrameLayout frameLayout, TextView textView3) {
        this.rootView = linearLayout;
        this.ajioWalletHeader = textView;
        this.ajioWalletSubHeader = textView2;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.okayBtn = textView3;
    }

    public static DialogAjioWalletLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.ajioWalletHeader;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.ajioWalletSubHeader;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (TextView)view;
            if (view3 != null) {
                n3 = R$id.cancelBtn;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.cancelContainer;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (FrameLayout)view;
                    if (view5 != null) {
                        n3 = R$id.okayBtn;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (TextView)view;
                        if (view6 != null) {
                            Object object2 = object;
                            object2 = (LinearLayout)object;
                            DialogAjioWalletLuxeBinding dialogAjioWalletLuxeBinding = new DialogAjioWalletLuxeBinding((LinearLayout)object2, (TextView)view2, (TextView)view3, (ImageView)view4, (FrameLayout)view5, (TextView)view6);
                            return dialogAjioWalletLuxeBinding;
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

    public static DialogAjioWalletLuxeBinding inflate(LayoutInflater layoutInflater) {
        return DialogAjioWalletLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static DialogAjioWalletLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.dialog_ajio_wallet_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return DialogAjioWalletLuxeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

