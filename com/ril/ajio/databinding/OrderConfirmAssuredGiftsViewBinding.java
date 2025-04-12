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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class OrderConfirmAssuredGiftsViewBinding
implements BC3 {
    public final AppCompatImageView icOsAssuredGift;
    public final ConstraintLayout idAjioOsAssuredGift;
    public final AjioTextView idOsGiftDetails;
    public final AjioTextView idOsGiftTitle;
    public final AjioTextView idOsViewRewards;
    private final ConstraintLayout rootView;

    private OrderConfirmAssuredGiftsViewBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.icOsAssuredGift = appCompatImageView;
        this.idAjioOsAssuredGift = constraintLayout2;
        this.idOsGiftDetails = ajioTextView;
        this.idOsGiftTitle = ajioTextView2;
        this.idOsViewRewards = ajioTextView3;
    }

    public static OrderConfirmAssuredGiftsViewBinding bind(View object) {
        View view;
        int n3 = R$id.ic_os_assured_gift;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            Object object3 = object;
            object3 = (ConstraintLayout)((Object)object);
            n3 = R$id.id_os_gift_details;
            Object object4 = view = dd2_2.a(n3, object);
            object4 = (AjioTextView)view;
            if (object4 != null) {
                n3 = R$id.id_os_gift_title;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (AjioTextView)view;
                if (object5 != null) {
                    n3 = R$id.id_os_view_rewards;
                    Object object6 = view = dd2_2.a(n3, object);
                    object6 = (AjioTextView)view;
                    if (object6 != null) {
                        object = new OrderConfirmAssuredGiftsViewBinding((ConstraintLayout)((Object)object3), (AppCompatImageView)((Object)object2), (ConstraintLayout)((Object)object3), (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static OrderConfirmAssuredGiftsViewBinding inflate(LayoutInflater layoutInflater) {
        return OrderConfirmAssuredGiftsViewBinding.inflate(layoutInflater, null, false);
    }

    public static OrderConfirmAssuredGiftsViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.order_confirm_assured_gifts_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return OrderConfirmAssuredGiftsViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

