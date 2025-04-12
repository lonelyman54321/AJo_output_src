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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutSaleHeaderWishlistWidgetBinding;

public final class CartWishlistBinding
implements BC3 {
    public final AjioImageView imvWishList;
    private final ConstraintLayout rootView;
    public final RecyclerView rvWishList;
    public final LayoutSaleHeaderWishlistWidgetBinding saleHeader;
    public final AjioTextView tvAddFromWishList;
    public final AjioTextView tvViewAll;

    private CartWishlistBinding(ConstraintLayout constraintLayout, AjioImageView ajioImageView, RecyclerView recyclerView, LayoutSaleHeaderWishlistWidgetBinding layoutSaleHeaderWishlistWidgetBinding, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.imvWishList = ajioImageView;
        this.rvWishList = recyclerView;
        this.saleHeader = layoutSaleHeaderWishlistWidgetBinding;
        this.tvAddFromWishList = ajioTextView;
        this.tvViewAll = ajioTextView2;
    }

    public static CartWishlistBinding bind(View object) {
        View view;
        int n3 = R$id.imvWishList;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioImageView)view;
        if (object2 != null) {
            n3 = R$id.rvWishList;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (RecyclerView)view;
            if (object3 != null && (view = dd2_2.a(n3 = R$id.saleHeader, object)) != null) {
                LayoutSaleHeaderWishlistWidgetBinding layoutSaleHeaderWishlistWidgetBinding = LayoutSaleHeaderWishlistWidgetBinding.bind(view);
                n3 = R$id.tvAddFromWishList;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.tvViewAll;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        Object object6 = object;
                        object6 = (ConstraintLayout)((Object)object);
                        CartWishlistBinding cartWishlistBinding = new CartWishlistBinding((ConstraintLayout)((Object)object6), (AjioImageView)((Object)object2), (RecyclerView)object3, layoutSaleHeaderWishlistWidgetBinding, (AjioTextView)object4, (AjioTextView)object5);
                        return cartWishlistBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CartWishlistBinding inflate(LayoutInflater layoutInflater) {
        return CartWishlistBinding.inflate(layoutInflater, null, false);
    }

    public static CartWishlistBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_wishlist;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartWishlistBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

