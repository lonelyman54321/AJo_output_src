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
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class FooterConsignmentBinding
implements BC3 {
    public final AjioButton btReturnorderitem;
    public final AjioButton btTrackshipment;
    public final LinearLayout exchangeStepsMessageContainer;
    public final ImageView ivExchangeStepsMessageCancel;
    private final LinearLayout rootView;
    public final AjioTextView tvConfirmdelivery;

    private FooterConsignmentBinding(LinearLayout linearLayout, AjioButton ajioButton, AjioButton ajioButton2, LinearLayout linearLayout2, ImageView imageView, AjioTextView ajioTextView) {
        this.rootView = linearLayout;
        this.btReturnorderitem = ajioButton;
        this.btTrackshipment = ajioButton2;
        this.exchangeStepsMessageContainer = linearLayout2;
        this.ivExchangeStepsMessageCancel = imageView;
        this.tvConfirmdelivery = ajioTextView;
    }

    public static FooterConsignmentBinding bind(View object) {
        View view;
        int n3 = R$id.bt_returnorderitem;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioButton)view;
        if (object2 != null) {
            n3 = R$id.bt_trackshipment;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioButton)view;
            if (object3 != null) {
                n3 = R$id.exchange_steps_message_container;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (LinearLayout)view;
                if (view2 != null) {
                    n3 = R$id.iv_exchange_steps_message_cancel;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (ImageView)view;
                    if (view3 != null) {
                        n3 = R$id.tv_confirmdelivery;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioTextView)view;
                        if (object4 != null) {
                            Object object5 = object;
                            object5 = (LinearLayout)object;
                            FooterConsignmentBinding footerConsignmentBinding = new FooterConsignmentBinding((LinearLayout)object5, (AjioButton)object2, (AjioButton)object3, (LinearLayout)view2, (ImageView)view3, (AjioTextView)object4);
                            return footerConsignmentBinding;
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

    public static FooterConsignmentBinding inflate(LayoutInflater layoutInflater) {
        return FooterConsignmentBinding.inflate(layoutInflater, null, false);
    }

    public static FooterConsignmentBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.footer_consignment;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FooterConsignmentBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

