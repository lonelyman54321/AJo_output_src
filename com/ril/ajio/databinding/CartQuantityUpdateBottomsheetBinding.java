/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CartQuantityUpdateBottomsheetBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final TextView cartQtyDod;
    public final TextView cartQtyInfoTvHeader;
    public final ImageView decQty;
    public final ImageView incQty;
    public final ConstraintLayout parentLayout;
    public final ConstraintLayout qtyContainer;
    public final CardView qtyTvContainer;
    public final TextView quantityTv;
    private final ConstraintLayout rootView;
    public final TextView selectQty;
    public final TextView updateBtn;

    private CartQuantityUpdateBottomsheetBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, TextView textView, TextView textView2, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, CardView cardView, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = constraintLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.cartQtyDod = textView;
        this.cartQtyInfoTvHeader = textView2;
        this.decQty = imageView2;
        this.incQty = imageView3;
        this.parentLayout = constraintLayout2;
        this.qtyContainer = constraintLayout3;
        this.qtyTvContainer = cardView;
        this.quantityTv = textView3;
        this.selectQty = textView4;
        this.updateBtn = textView5;
    }

    public static CartQuantityUpdateBottomsheetBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.cancelBtn;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (ImageView)view2;
        if (view3 != null) {
            n3 = R$id.cancelContainer;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (FrameLayout)view2;
            if (view4 != null) {
                n3 = R$id.cart_qty_dod;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (TextView)view2;
                if (view5 != null) {
                    n3 = R$id.cart_qty_info_tv_header;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (TextView)view2;
                    if (view6 != null) {
                        n3 = R$id.decQty;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (ImageView)view2;
                        if (view7 != null) {
                            n3 = R$id.incQty;
                            View view8 = view2 = dd2_2.a(n3, view);
                            view8 = (ImageView)view2;
                            if (view8 != null) {
                                n3 = R$id.parent_layout;
                                Object object2 = view2 = dd2_2.a(n3, view);
                                object2 = (ConstraintLayout)view2;
                                if (object2 != null) {
                                    n3 = R$id.qtyContainer;
                                    Object object3 = view2 = dd2_2.a(n3, view);
                                    object3 = (ConstraintLayout)view2;
                                    if (object3 != null) {
                                        n3 = R$id.qtyTvContainer;
                                        Object object4 = view2 = dd2_2.a(n3, view);
                                        object4 = (CardView)view2;
                                        if (object4 != null) {
                                            n3 = R$id.quantityTv;
                                            View view9 = view2 = dd2_2.a(n3, view);
                                            view9 = (TextView)view2;
                                            if (view9 != null) {
                                                n3 = R$id.selectQty;
                                                View view10 = view2 = dd2_2.a(n3, view);
                                                view10 = (TextView)view2;
                                                if (view10 != null) {
                                                    n3 = R$id.updateBtn;
                                                    View view11 = view2 = dd2_2.a(n3, view);
                                                    view11 = (TextView)view2;
                                                    if (view11 != null) {
                                                        Object object5 = view;
                                                        object5 = (ConstraintLayout)view;
                                                        CartQuantityUpdateBottomsheetBinding cartQuantityUpdateBottomsheetBinding = new CartQuantityUpdateBottomsheetBinding((ConstraintLayout)((Object)object5), (ImageView)view3, (FrameLayout)view4, (TextView)view5, (TextView)view6, (ImageView)view7, (ImageView)view8, (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), (CardView)((Object)object4), (TextView)view9, (TextView)view10, (TextView)view11);
                                                        return cartQuantityUpdateBottomsheetBinding;
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

    public static CartQuantityUpdateBottomsheetBinding inflate(LayoutInflater layoutInflater) {
        return CartQuantityUpdateBottomsheetBinding.inflate(layoutInflater, null, false);
    }

    public static CartQuantityUpdateBottomsheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_quantity_update_bottomsheet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartQuantityUpdateBottomsheetBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

