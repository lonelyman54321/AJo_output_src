/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PesdkDialogInternalWalletDescBinding
implements BC3 {
    public final ImageView imvDialogClose;
    public final LinearLayout parentLayout;
    private final LinearLayout rootView;
    public final AjioTextView tvOkay;
    public final AjioTextView tvWalletDesc;
    public final AjioTextView tvWalletName;

    private PesdkDialogInternalWalletDescBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = linearLayout;
        this.imvDialogClose = imageView;
        this.parentLayout = linearLayout2;
        this.tvOkay = ajioTextView;
        this.tvWalletDesc = ajioTextView2;
        this.tvWalletName = ajioTextView3;
    }

    public static PesdkDialogInternalWalletDescBinding bind(View object) {
        View view;
        int n3 = R$id.imv_dialog_close;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.parent_layout;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.tvOkay;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.tvWalletDesc;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.tvWalletName;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            Object object5 = object;
                            object5 = (LinearLayout)object;
                            PesdkDialogInternalWalletDescBinding pesdkDialogInternalWalletDescBinding = new PesdkDialogInternalWalletDescBinding((LinearLayout)object5, (ImageView)view2, (LinearLayout)view3, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4);
                            return pesdkDialogInternalWalletDescBinding;
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

    public static PesdkDialogInternalWalletDescBinding inflate(LayoutInflater layoutInflater) {
        return PesdkDialogInternalWalletDescBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkDialogInternalWalletDescBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_dialog_internal_wallet_desc;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkDialogInternalWalletDescBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

