/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class IfscConfirmLayoutBinding
implements BC3 {
    public final ImageButton closeButton;
    private final LinearLayout rootView;
    public final RelativeLayout topLayout;
    public final AjioTextView tvCancel;
    public final AjioTextView tvIfscCode;
    public final AjioTextView tvSubmit;

    private IfscConfirmLayoutBinding(LinearLayout linearLayout, ImageButton imageButton, RelativeLayout relativeLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = linearLayout;
        this.closeButton = imageButton;
        this.topLayout = relativeLayout;
        this.tvCancel = ajioTextView;
        this.tvIfscCode = ajioTextView2;
        this.tvSubmit = ajioTextView3;
    }

    public static IfscConfirmLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.close_button;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageButton)view;
        if (view2 != null) {
            n3 = R$id.top_layout;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (RelativeLayout)view;
            if (view3 != null) {
                n3 = R$id.tv_cancel;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.tv_ifsc_code;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null) {
                        n3 = R$id.tv_submit;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            Object object5 = object;
                            object5 = (LinearLayout)object;
                            IfscConfirmLayoutBinding ifscConfirmLayoutBinding = new IfscConfirmLayoutBinding((LinearLayout)object5, (ImageButton)view2, (RelativeLayout)view3, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4);
                            return ifscConfirmLayoutBinding;
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

    public static IfscConfirmLayoutBinding inflate(LayoutInflater layoutInflater) {
        return IfscConfirmLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static IfscConfirmLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.ifsc_confirm_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return IfscConfirmLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

