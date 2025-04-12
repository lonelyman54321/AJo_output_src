/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CartQuantityUpdateBottomsheetLuxeBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final TextView cartQtyDod;
    public final TextView cartQtyInfoTvHeader;
    public final ImageView decQty;
    public final ImageView incQty;
    public final ConstraintLayout parentLayout;
    public final ConstraintLayout qtyContainer;
    public final TextView quantityTv;
    private final LinearLayout rootView;
    public final TextView selectQty;
    public final TextView updateBtn;

    private CartQuantityUpdateBottomsheetLuxeBinding(LinearLayout linearLayout, ImageView imageView, FrameLayout frameLayout, TextView textView, TextView textView2, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView3, TextView textView4, TextView textView5) {
        this.rootView = linearLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.cartQtyDod = textView;
        this.cartQtyInfoTvHeader = textView2;
        this.decQty = imageView2;
        this.incQty = imageView3;
        this.parentLayout = constraintLayout;
        this.qtyContainer = constraintLayout2;
        this.quantityTv = textView3;
        this.selectQty = textView4;
        this.updateBtn = textView5;
    }

    public static CartQuantityUpdateBottomsheetLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.cancelBtn;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.cancelContainer;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (FrameLayout)view;
            if (view3 != null) {
                n3 = R$id.cart_qty_dod;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    n3 = R$id.cart_qty_info_tv_header;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (TextView)view;
                    if (view5 != null) {
                        n3 = R$id.decQty;
                        View view6 = view = dd2_2.a(n3, object);
                        view6 = (ImageView)view;
                        if (view6 != null) {
                            n3 = R$id.incQty;
                            View view7 = view = dd2_2.a(n3, object);
                            view7 = (ImageView)view;
                            if (view7 != null) {
                                n3 = R$id.parent_layout;
                                Object object2 = view = dd2_2.a(n3, object);
                                object2 = (ConstraintLayout)view;
                                if (object2 != null) {
                                    n3 = R$id.qtyContainer;
                                    Object object3 = view = dd2_2.a(n3, object);
                                    object3 = (ConstraintLayout)view;
                                    if (object3 != null) {
                                        n3 = R$id.quantityTv;
                                        View view8 = view = dd2_2.a(n3, object);
                                        view8 = (TextView)view;
                                        if (view8 != null) {
                                            n3 = R$id.selectQty;
                                            View view9 = view = dd2_2.a(n3, object);
                                            view9 = (TextView)view;
                                            if (view9 != null) {
                                                n3 = R$id.updateBtn;
                                                View view10 = view = dd2_2.a(n3, object);
                                                view10 = (TextView)view;
                                                if (view10 != null) {
                                                    Object object4 = object;
                                                    object4 = (LinearLayout)object;
                                                    CartQuantityUpdateBottomsheetLuxeBinding cartQuantityUpdateBottomsheetLuxeBinding = new CartQuantityUpdateBottomsheetLuxeBinding((LinearLayout)object4, (ImageView)view2, (FrameLayout)view3, (TextView)view4, (TextView)view5, (ImageView)view6, (ImageView)view7, (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), (TextView)view8, (TextView)view9, (TextView)view10);
                                                    return cartQuantityUpdateBottomsheetLuxeBinding;
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CartQuantityUpdateBottomsheetLuxeBinding inflate(LayoutInflater layoutInflater) {
        return CartQuantityUpdateBottomsheetLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static CartQuantityUpdateBottomsheetLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_quantity_update_bottomsheet_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartQuantityUpdateBottomsheetLuxeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

