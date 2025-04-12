/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CartInventoryOosRowRefreshBinding
implements BC3 {
    public final TextView cartS1S2Info;
    public final TextView moveToWishlistBtn;
    public final TextView price;
    public final ConstraintLayout productContainer;
    public final ImageView productImg;
    public final CardView productImgContainer;
    public final ConstraintLayout productInfoContainer;
    public final TextView productTitle;
    public final LinearLayout qtyContainer;
    public final TextView qtyInfo;
    public final TextView qtyText;
    private final CardView rootView;
    public final LinearLayout sizeContainer;
    public final TextView sizeInfo;
    public final TextView sizeText;

    private CartInventoryOosRowRefreshBinding(CardView cardView, TextView textView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout, ImageView imageView, CardView cardView2, ConstraintLayout constraintLayout2, TextView textView4, LinearLayout linearLayout, TextView textView5, TextView textView6, LinearLayout linearLayout2, TextView textView7, TextView textView8) {
        this.rootView = cardView;
        this.cartS1S2Info = textView;
        this.moveToWishlistBtn = textView2;
        this.price = textView3;
        this.productContainer = constraintLayout;
        this.productImg = imageView;
        this.productImgContainer = cardView2;
        this.productInfoContainer = constraintLayout2;
        this.productTitle = textView4;
        this.qtyContainer = linearLayout;
        this.qtyInfo = textView5;
        this.qtyText = textView6;
        this.sizeContainer = linearLayout2;
        this.sizeInfo = textView7;
        this.sizeText = textView8;
    }

    public static CartInventoryOosRowRefreshBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.cartS1S2Info;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (TextView)view2;
        if (view3 != null) {
            n3 = R$id.moveToWishlistBtn;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (TextView)view2;
            if (view4 != null) {
                n3 = R$id.price;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (TextView)view2;
                if (view5 != null) {
                    n3 = R$id.productContainer;
                    Object object2 = view2 = dd2_2.a(n3, view);
                    object2 = (ConstraintLayout)view2;
                    if (object2 != null) {
                        n3 = R$id.productImg;
                        View view6 = view2 = dd2_2.a(n3, view);
                        view6 = (ImageView)view2;
                        if (view6 != null) {
                            n3 = R$id.productImgContainer;
                            Object object3 = view2 = dd2_2.a(n3, view);
                            object3 = (CardView)view2;
                            if (object3 != null) {
                                n3 = R$id.productInfoContainer;
                                Object object4 = view2 = dd2_2.a(n3, view);
                                object4 = (ConstraintLayout)view2;
                                if (object4 != null) {
                                    n3 = R$id.productTitle;
                                    View view7 = view2 = dd2_2.a(n3, view);
                                    view7 = (TextView)view2;
                                    if (view7 != null) {
                                        n3 = R$id.qtyContainer;
                                        View view8 = view2 = dd2_2.a(n3, view);
                                        view8 = (LinearLayout)view2;
                                        if (view8 != null) {
                                            n3 = R$id.qtyInfo;
                                            View view9 = view2 = dd2_2.a(n3, view);
                                            view9 = (TextView)view2;
                                            if (view9 != null) {
                                                n3 = R$id.qtyText;
                                                View view10 = view2 = dd2_2.a(n3, view);
                                                view10 = (TextView)view2;
                                                if (view10 != null) {
                                                    n3 = R$id.sizeContainer;
                                                    View view11 = view2 = dd2_2.a(n3, view);
                                                    view11 = (LinearLayout)view2;
                                                    if (view11 != null) {
                                                        n3 = R$id.sizeInfo;
                                                        View view12 = view2 = dd2_2.a(n3, view);
                                                        view12 = (TextView)view2;
                                                        if (view12 != null) {
                                                            n3 = R$id.sizeText;
                                                            View view13 = view2 = dd2_2.a(n3, view);
                                                            view13 = (TextView)view2;
                                                            if (view13 != null) {
                                                                Object object5 = view;
                                                                object5 = (CardView)view;
                                                                CartInventoryOosRowRefreshBinding cartInventoryOosRowRefreshBinding = new CartInventoryOosRowRefreshBinding((CardView)((Object)object5), (TextView)view3, (TextView)view4, (TextView)view5, (ConstraintLayout)((Object)object2), (ImageView)view6, (CardView)((Object)object3), (ConstraintLayout)((Object)object4), (TextView)view7, (LinearLayout)view8, (TextView)view9, (TextView)view10, (LinearLayout)view11, (TextView)view12, (TextView)view13);
                                                                return cartInventoryOosRowRefreshBinding;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CartInventoryOosRowRefreshBinding inflate(LayoutInflater layoutInflater) {
        return CartInventoryOosRowRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static CartInventoryOosRowRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_inventory_oos_row_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartInventoryOosRowRefreshBinding.bind((View)layoutInflater);
    }

    public CardView getRoot() {
        return this.rootView;
    }
}

