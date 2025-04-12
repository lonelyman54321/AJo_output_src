/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioNonScrollableListView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class OrderConfirmProductListRevampBinding
implements BC3 {
    public final AjioTextView headingTv;
    public final AjioTextView idPdTitle;
    public final RelativeLayout idPriorityDeliveryLayout;
    public final ImageView ivPdDeliveryAlert;
    public final AjioNonScrollableListView orderConfirmItemListview;
    private final LinearLayout rootView;

    private OrderConfirmProductListRevampBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, RelativeLayout relativeLayout, ImageView imageView, AjioNonScrollableListView ajioNonScrollableListView) {
        this.rootView = linearLayout;
        this.headingTv = ajioTextView;
        this.idPdTitle = ajioTextView2;
        this.idPriorityDeliveryLayout = relativeLayout;
        this.ivPdDeliveryAlert = imageView;
        this.orderConfirmItemListview = ajioNonScrollableListView;
    }

    public static OrderConfirmProductListRevampBinding bind(View object) {
        View view;
        int n3 = R$id.heading_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.id_pd_title;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.id_priority_delivery_layout;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (RelativeLayout)view;
                if (view2 != null) {
                    n3 = R$id.iv_pd_delivery_alert;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (ImageView)view;
                    if (view3 != null) {
                        n3 = R$id.order_confirm_item_listview;
                        Object object4 = view = dd2_2.a(n3, object);
                        object4 = (AjioNonScrollableListView)view;
                        if (object4 != null) {
                            Object object5 = object;
                            object5 = (LinearLayout)object;
                            OrderConfirmProductListRevampBinding orderConfirmProductListRevampBinding = new OrderConfirmProductListRevampBinding((LinearLayout)object5, (AjioTextView)object2, (AjioTextView)object3, (RelativeLayout)view2, (ImageView)view3, (AjioNonScrollableListView)((Object)object4));
                            return orderConfirmProductListRevampBinding;
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

    public static OrderConfirmProductListRevampBinding inflate(LayoutInflater layoutInflater) {
        return OrderConfirmProductListRevampBinding.inflate(layoutInflater, null, false);
    }

    public static OrderConfirmProductListRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.order_confirm_product_list_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OrderConfirmProductListRevampBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

