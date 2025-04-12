/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CartGiftWithProductsRowLuxeBinding
implements BC3 {
    public final CardView cartProductParent;
    public final ConstraintLayout idCartGwpHeader;
    public final ImageView idCartGwpImg;
    public final RecyclerView idCartGwpList;
    public final AjioTextView idCartGwpShowMoreLess;
    public final AjioTextView idCartGwpSubTitle;
    public final AjioTextView idCartGwpTitle;
    private final CardView rootView;

    private CartGiftWithProductsRowLuxeBinding(CardView cardView, CardView cardView2, ConstraintLayout constraintLayout, ImageView imageView, RecyclerView recyclerView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = cardView;
        this.cartProductParent = cardView2;
        this.idCartGwpHeader = constraintLayout;
        this.idCartGwpImg = imageView;
        this.idCartGwpList = recyclerView;
        this.idCartGwpShowMoreLess = ajioTextView;
        this.idCartGwpSubTitle = ajioTextView2;
        this.idCartGwpTitle = ajioTextView3;
    }

    public static CartGiftWithProductsRowLuxeBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (CardView)((Object)object);
        int n3 = R$id.id_cart_gwp_header;
        Object object3 = view = dd2_2.a(n3, object);
        object3 = (ConstraintLayout)view;
        if (object3 != null) {
            n3 = R$id.id_cart_gwp_img;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.id_cart_gwp_list;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (RecyclerView)view;
                if (object4 != null) {
                    n3 = R$id.id_cart_gwp_show_more_less;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.id_cart_gwp_sub_title;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (AjioTextView)view;
                        if (object6 != null) {
                            n3 = R$id.id_cart_gwp_title;
                            Object object7 = view = dd2_2.a(n3, object);
                            object7 = (AjioTextView)view;
                            if (object7 != null) {
                                Object object8 = object;
                                view = object2;
                                object = new CartGiftWithProductsRowLuxeBinding((CardView)((Object)object2), (CardView)((Object)object2), (ConstraintLayout)((Object)object3), (ImageView)view2, (RecyclerView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7);
                                return object;
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

    public static CartGiftWithProductsRowLuxeBinding inflate(LayoutInflater layoutInflater) {
        return CartGiftWithProductsRowLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static CartGiftWithProductsRowLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_gift_with_products_row_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartGiftWithProductsRowLuxeBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

