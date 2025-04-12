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

public final class PesdkLuxDialogDeleteCardBinding
implements BC3 {
    public final ImageView imvDialogClose;
    public final LinearLayout parentLayout;
    private final LinearLayout rootView;
    public final AjioTextView tvNo;
    public final AjioTextView tvYes;

    private PesdkLuxDialogDeleteCardBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.imvDialogClose = imageView;
        this.parentLayout = linearLayout2;
        this.tvNo = ajioTextView;
        this.tvYes = ajioTextView2;
    }

    public static PesdkLuxDialogDeleteCardBinding bind(View object) {
        View view;
        int n3 = R$id.imv_dialog_close;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.parent_layout;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (LinearLayout)view;
            if (view3 != null) {
                n3 = R$id.tv_no;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.tv_yes;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        Object object4 = object;
                        object4 = (LinearLayout)object;
                        PesdkLuxDialogDeleteCardBinding pesdkLuxDialogDeleteCardBinding = new PesdkLuxDialogDeleteCardBinding((LinearLayout)object4, (ImageView)view2, (LinearLayout)view3, (AjioTextView)object2, (AjioTextView)object3);
                        return pesdkLuxDialogDeleteCardBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkLuxDialogDeleteCardBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxDialogDeleteCardBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxDialogDeleteCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_dialog_delete_card;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxDialogDeleteCardBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

