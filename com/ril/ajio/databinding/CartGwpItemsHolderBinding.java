/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CartGwpItemsHolderBinding
implements BC3 {
    public final AjioTextView idCartGwpFreeText;
    public final AjioTextView idCartGwpPrice;
    public final AjioTextView idCartGwpQty;
    public final AjioTextView idCartGwpTitle;
    public final AjioTextView idCartNeedForReturn;
    public final ImageView productImg;
    public final RelativeLayout productImgContainer;
    private final ConstraintLayout rootView;

    private CartGwpItemsHolderBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, ImageView imageView, RelativeLayout relativeLayout) {
        this.rootView = constraintLayout;
        this.idCartGwpFreeText = ajioTextView;
        this.idCartGwpPrice = ajioTextView2;
        this.idCartGwpQty = ajioTextView3;
        this.idCartGwpTitle = ajioTextView4;
        this.idCartNeedForReturn = ajioTextView5;
        this.productImg = imageView;
        this.productImgContainer = relativeLayout;
    }

    public static CartGwpItemsHolderBinding bind(View object) {
        View view;
        int n3 = R$id.id_cart_gwp_free_text;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.id_cart_gwp_price;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.id_cart_gwp_qty;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.id_cart_gwp_title;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.id_cart_need_for_return;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.productImg;
                            View view2 = view = dd2_2.a(n3, object);
                            view2 = (ImageView)view;
                            if (view2 != null) {
                                n3 = R$id.productImgContainer;
                                View view3 = view = dd2_2.a(n3, object);
                                view3 = (RelativeLayout)view;
                                if (view3 != null) {
                                    Object object7 = object;
                                    object7 = (ConstraintLayout)((Object)object);
                                    CartGwpItemsHolderBinding cartGwpItemsHolderBinding = new CartGwpItemsHolderBinding((ConstraintLayout)((Object)object7), (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (ImageView)view2, (RelativeLayout)view3);
                                    return cartGwpItemsHolderBinding;
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

    public static CartGwpItemsHolderBinding inflate(LayoutInflater layoutInflater) {
        return CartGwpItemsHolderBinding.inflate(layoutInflater, null, false);
    }

    public static CartGwpItemsHolderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_gwp_items_holder;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartGwpItemsHolderBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

