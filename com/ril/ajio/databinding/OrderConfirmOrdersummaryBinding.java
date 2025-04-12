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

public final class OrderConfirmOrdersummaryBinding
implements BC3 {
    public final LinearLayout contentContainer;
    public final AjioToggleButton expand;
    public final AjioCustomExpandablePanel expandablePanel;
    private final AjioCustomExpandablePanel rootView;

    private OrderConfirmOrdersummaryBinding(AjioCustomExpandablePanel ajioCustomExpandablePanel, LinearLayout linearLayout, AjioToggleButton ajioToggleButton, AjioCustomExpandablePanel ajioCustomExpandablePanel2) {
        this.rootView = ajioCustomExpandablePanel;
        this.contentContainer = linearLayout;
        this.expand = ajioToggleButton;
        this.expandablePanel = ajioCustomExpandablePanel2;
    }

    public static OrderConfirmOrdersummaryBinding bind(View object) {
        AjioToggleButton ajioToggleButton;
        int n3 = R$id.content_container;
        LinearLayout linearLayout = (LinearLayout)dd2_2.a(n3, object);
        if (linearLayout != null && (ajioToggleButton = (AjioToggleButton)dd2_2.a(n3 = R$id.expand, object)) != null) {
            object = (AjioCustomExpandablePanel)((Object)object);
            OrderConfirmOrdersummaryBinding orderConfirmOrdersummaryBinding = new OrderConfirmOrdersummaryBinding((AjioCustomExpandablePanel)((Object)object), linearLayout, ajioToggleButton, (AjioCustomExpandablePanel)((Object)object));
            return orderConfirmOrdersummaryBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OrderConfirmOrdersummaryBinding inflate(LayoutInflater layoutInflater) {
        return OrderConfirmOrdersummaryBinding.inflate(layoutInflater, null, false);
    }

    public static OrderConfirmOrdersummaryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.order_confirm_ordersummary;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OrderConfirmOrdersummaryBinding.bind((View)layoutInflater);
    }

    public AjioCustomExpandablePanel getRoot() {
        return this.rootView;
    }
}

