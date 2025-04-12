/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowCartPdDeliveryAlertBinding
implements BC3 {
    public final ImageView ivPdClose;
    public final ImageView ivPdDeliveryAlert;
    private final CardView rootView;
    public final TextView tvPdDeliveryAlertHeader;
    public final TextView tvPdDeliveryAlertMessage;

    private RowCartPdDeliveryAlertBinding(CardView cardView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2) {
        this.rootView = cardView;
        this.ivPdClose = imageView;
        this.ivPdDeliveryAlert = imageView2;
        this.tvPdDeliveryAlertHeader = textView;
        this.tvPdDeliveryAlertMessage = textView2;
    }

    public static RowCartPdDeliveryAlertBinding bind(View object) {
        View view;
        int n3 = R$id.iv_pd_close;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.iv_pd_delivery_alert;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.tv_pd_delivery_alert_header;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.tv_pd_delivery_alert_message;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (CardView)((Object)object);
                        RowCartPdDeliveryAlertBinding rowCartPdDeliveryAlertBinding = new RowCartPdDeliveryAlertBinding((CardView)((Object)object2), (ImageView)view2, (ImageView)view3, (TextView)view4, (TextView)view5);
                        return rowCartPdDeliveryAlertBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static RowCartPdDeliveryAlertBinding inflate(LayoutInflater layoutInflater) {
        return RowCartPdDeliveryAlertBinding.inflate(layoutInflater, null, false);
    }

    public static RowCartPdDeliveryAlertBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_cart_pd_delivery_alert;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowCartPdDeliveryAlertBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

