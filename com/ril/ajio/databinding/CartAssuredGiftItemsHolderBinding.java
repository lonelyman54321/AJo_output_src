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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CartAssuredGiftItemsHolderBinding
implements BC3 {
    public final AjioTextView idCartAssuredGiftAlert;
    public final ConstraintLayout idCartAssuredGiftItem;
    public final LinearLayout idCartAssuredGiftProduct;
    public final AjioTextView idCartGiftApplicable;
    public final AjioTextView idCartGiftDetails;
    public final AppCompatImageView idCartGiftDownArrow;
    public final AjioTextView idCartGiftItemTitle;
    public final View idLine;
    private final ConstraintLayout rootView;

    private CartAssuredGiftItemsHolderBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, ConstraintLayout constraintLayout2, LinearLayout linearLayout, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AppCompatImageView appCompatImageView, AjioTextView ajioTextView4, View view) {
        this.rootView = constraintLayout;
        this.idCartAssuredGiftAlert = ajioTextView;
        this.idCartAssuredGiftItem = constraintLayout2;
        this.idCartAssuredGiftProduct = linearLayout;
        this.idCartGiftApplicable = ajioTextView2;
        this.idCartGiftDetails = ajioTextView3;
        this.idCartGiftDownArrow = appCompatImageView;
        this.idCartGiftItemTitle = ajioTextView4;
        this.idLine = view;
    }

    public static CartAssuredGiftItemsHolderBinding bind(View object) {
        View view;
        int n3 = R$id.id_cart_assured_gift_alert;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.id_cart_assured_gift_item;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (ConstraintLayout)view;
            if (object3 != null) {
                n3 = R$id.id_cart_assured_gift_product;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (LinearLayout)view;
                if (view2 != null) {
                    n3 = R$id.id_cart_gift_applicable;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.id_cart_gift_details;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.id_cart_gift_down_arrow;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AppCompatImageView)view;
                            if (object6 != null) {
                                View view3;
                                n3 = R$id.id_cart_gift_item_title;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null && (view3 = dd2_2.a(n3 = R$id.id_line, object)) != null) {
                                    Object object8 = object;
                                    object8 = (ConstraintLayout)((Object)object);
                                    CartAssuredGiftItemsHolderBinding cartAssuredGiftItemsHolderBinding = new CartAssuredGiftItemsHolderBinding((ConstraintLayout)((Object)object8), (AjioTextView)object2, (ConstraintLayout)((Object)object3), (LinearLayout)view2, (AjioTextView)object4, (AjioTextView)object5, (AppCompatImageView)((Object)object6), (AjioTextView)object7, view3);
                                    return cartAssuredGiftItemsHolderBinding;
                                }
                            }
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

    public static CartAssuredGiftItemsHolderBinding inflate(LayoutInflater layoutInflater) {
        return CartAssuredGiftItemsHolderBinding.inflate(layoutInflater, null, false);
    }

    public static CartAssuredGiftItemsHolderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_assured_gift_items_holder;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartAssuredGiftItemsHolderBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

