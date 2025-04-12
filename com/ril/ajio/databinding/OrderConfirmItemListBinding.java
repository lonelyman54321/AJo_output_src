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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioNonScrollableListView;
import com.ril.ajio.customviews.widgets.AjioToggleButton;

public final class OrderConfirmItemListBinding
implements BC3 {
    public final AjioToggleButton orderConfirmItemExpand;
    public final AjioCustomExpandablePanel orderConfirmItemExpandPanel;
    public final AjioNonScrollableListView orderConfirmItemListview;
    private final AjioCustomExpandablePanel rootView;

    private OrderConfirmItemListBinding(AjioCustomExpandablePanel ajioCustomExpandablePanel, AjioToggleButton ajioToggleButton, AjioCustomExpandablePanel ajioCustomExpandablePanel2, AjioNonScrollableListView ajioNonScrollableListView) {
        this.rootView = ajioCustomExpandablePanel;
        this.orderConfirmItemExpand = ajioToggleButton;
        this.orderConfirmItemExpandPanel = ajioCustomExpandablePanel2;
        this.orderConfirmItemListview = ajioNonScrollableListView;
    }

    public static OrderConfirmItemListBinding bind(View object) {
        Object object2;
        int n3 = R$id.order_confirm_item_expand;
        AjioToggleButton ajioToggleButton = (AjioToggleButton)dd2_2.a(n3, object);
        if (ajioToggleButton != null) {
            object2 = object;
            object2 = (AjioCustomExpandablePanel)((Object)object);
            int n4 = R$id.order_confirm_item_listview;
            AjioNonScrollableListView ajioNonScrollableListView = (AjioNonScrollableListView)dd2_2.a(n4, object);
            if (ajioNonScrollableListView != null) {
                object = new OrderConfirmItemListBinding((AjioCustomExpandablePanel)((Object)object2), ajioToggleButton, (AjioCustomExpandablePanel)((Object)object2), ajioNonScrollableListView);
                return object;
            }
            n3 = n4;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static OrderConfirmItemListBinding inflate(LayoutInflater layoutInflater) {
        return OrderConfirmItemListBinding.inflate(layoutInflater, null, false);
    }

    public static OrderConfirmItemListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.order_confirm_item_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OrderConfirmItemListBinding.bind((View)layoutInflater);
    }

    public AjioCustomExpandablePanel getRoot() {
        return this.rootView;
    }
}

