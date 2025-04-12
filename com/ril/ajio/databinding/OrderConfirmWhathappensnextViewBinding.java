/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioToggleButton;

public final class OrderConfirmWhathappensnextViewBinding
implements BC3 {
    private final AjioCustomExpandablePanel rootView;
    public final LinearLayout whathappensContentContainer;
    public final AjioToggleButton whathappensNextExpand;
    public final AjioCustomExpandablePanel whathappensNextExpandPanel;

    private OrderConfirmWhathappensnextViewBinding(AjioCustomExpandablePanel ajioCustomExpandablePanel, LinearLayout linearLayout, AjioToggleButton ajioToggleButton, AjioCustomExpandablePanel ajioCustomExpandablePanel2) {
        this.rootView = ajioCustomExpandablePanel;
        this.whathappensContentContainer = linearLayout;
        this.whathappensNextExpand = ajioToggleButton;
        this.whathappensNextExpandPanel = ajioCustomExpandablePanel2;
    }

    public static OrderConfirmWhathappensnextViewBinding bind(View object) {
        AjioToggleButton ajioToggleButton;
        int n3 = R$id.whathappens_content_container;
        LinearLayout linearLayout = (LinearLayout)dd2_2.a(n3, object);
        if (linearLayout != null && (ajioToggleButton = (AjioToggleButton)dd2_2.a(n3 = R$id.whathappens_next_expand, object)) != null) {
            object = (AjioCustomExpandablePanel)((Object)object);
            OrderConfirmWhathappensnextViewBinding orderConfirmWhathappensnextViewBinding = new OrderConfirmWhathappensnextViewBinding((AjioCustomExpandablePanel)((Object)object), linearLayout, ajioToggleButton, (AjioCustomExpandablePanel)((Object)object));
            return orderConfirmWhathappensnextViewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OrderConfirmWhathappensnextViewBinding inflate(LayoutInflater layoutInflater) {
        return OrderConfirmWhathappensnextViewBinding.inflate(layoutInflater, null, false);
    }

    public static OrderConfirmWhathappensnextViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.order_confirm_whathappensnext_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OrderConfirmWhathappensnextViewBinding.bind((View)layoutInflater);
    }

    public AjioCustomExpandablePanel getRoot() {
        return this.rootView;
    }
}

