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

public final class CartAssuredGiftProductItemBinding
implements BC3 {
    public final AjioTextView idProductAmount;
    public final AjioTextView idProductDetail;
    public final AppCompatImageView idProductImage;
    public final AjioTextView idProductTitle;
    public final AjioTextView idProductType;
    private final ConstraintLayout rootView;

    private CartAssuredGiftProductItemBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AppCompatImageView appCompatImageView, AjioTextView ajioTextView3, AjioTextView ajioTextView4) {
        this.rootView = constraintLayout;
        this.idProductAmount = ajioTextView;
        this.idProductDetail = ajioTextView2;
        this.idProductImage = appCompatImageView;
        this.idProductTitle = ajioTextView3;
        this.idProductType = ajioTextView4;
    }

    public static CartAssuredGiftProductItemBinding bind(View object) {
        View view;
        int n3 = R$id.id_product_amount;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.id_product_detail;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.id_product_image;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AppCompatImageView)view;
                if (object4 != null) {
                    n3 = R$id.id_product_title;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.id_product_type;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            Object object7 = object;
                            object7 = (ConstraintLayout)((Object)object);
                            CartAssuredGiftProductItemBinding cartAssuredGiftProductItemBinding = new CartAssuredGiftProductItemBinding((ConstraintLayout)((Object)object7), (AjioTextView)object2, (AjioTextView)object3, (AppCompatImageView)((Object)object4), (AjioTextView)object5, (AjioTextView)object6);
                            return cartAssuredGiftProductItemBinding;
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

    public static CartAssuredGiftProductItemBinding inflate(LayoutInflater layoutInflater) {
        return CartAssuredGiftProductItemBinding.inflate(layoutInflater, null, false);
    }

    public static CartAssuredGiftProductItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_assured_gift_product_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartAssuredGiftProductItemBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

