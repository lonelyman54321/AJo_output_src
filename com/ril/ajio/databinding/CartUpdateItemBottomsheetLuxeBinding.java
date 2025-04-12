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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class CartUpdateItemBottomsheetLuxeBinding
implements BC3 {
    public final TextView brandSizeTv;
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final TextView cartQtyDod;
    public final TextView cartQtyInfoTvHeader;
    public final TextView cartSizeDod;
    public final TextView cartSizeInfoTvHeader;
    public final ImageView decQty;
    public final ImageView incQty;
    public final ConstraintLayout parentLayout;
    public final ConstraintLayout qtyContainer;
    public final TextView quantityTv;
    private final LinearLayout rootView;
    public final TextView selectQty;
    public final RecyclerView sizeRv;
    public final AjioTextView sizeUnitTv;
    public final TextView sizeUpdateHeader;
    public final TextView updateBtn;

    private CartUpdateItemBottomsheetLuxeBinding(LinearLayout linearLayout, TextView textView, ImageView imageView, FrameLayout frameLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView6, TextView textView7, RecyclerView recyclerView, AjioTextView ajioTextView, TextView textView8, TextView textView9) {
        this.rootView = linearLayout;
        this.brandSizeTv = textView;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.cartQtyDod = textView2;
        this.cartQtyInfoTvHeader = textView3;
        this.cartSizeDod = textView4;
        this.cartSizeInfoTvHeader = textView5;
        this.decQty = imageView2;
        this.incQty = imageView3;
        this.parentLayout = constraintLayout;
        this.qtyContainer = constraintLayout2;
        this.quantityTv = textView6;
        this.selectQty = textView7;
        this.sizeRv = recyclerView;
        this.sizeUnitTv = ajioTextView;
        this.sizeUpdateHeader = textView8;
        this.updateBtn = textView9;
    }

    public static CartUpdateItemBottomsheetLuxeBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.brand_size_tv;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (TextView)view2;
        if (view3 != null) {
            n3 = R$id.cancelBtn;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (ImageView)view2;
            if (view4 != null) {
                n3 = R$id.cancelContainer;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (FrameLayout)view2;
                if (view5 != null) {
                    n3 = R$id.cart_qty_dod;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (TextView)view2;
                    if (view6 != null) {
                        n3 = R$id.cart_qty_info_tv_header;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (TextView)view2;
                        if (view7 != null) {
                            n3 = R$id.cart_size_dod;
                            View view8 = view2 = dd2_2.a(n3, view);
                            view8 = (TextView)view2;
                            if (view8 != null) {
                                n3 = R$id.cart_size_info_tv_header;
                                View view9 = view2 = dd2_2.a(n3, view);
                                view9 = (TextView)view2;
                                if (view9 != null) {
                                    n3 = R$id.decQty;
                                    View view10 = view2 = dd2_2.a(n3, view);
                                    view10 = (ImageView)view2;
                                    if (view10 != null) {
                                        n3 = R$id.incQty;
                                        View view11 = view2 = dd2_2.a(n3, view);
                                        view11 = (ImageView)view2;
                                        if (view11 != null) {
                                            n3 = R$id.parent_layout;
                                            Object object2 = view2 = dd2_2.a(n3, view);
                                            object2 = (ConstraintLayout)view2;
                                            if (object2 != null) {
                                                n3 = R$id.qtyContainer;
                                                Object object3 = view2 = dd2_2.a(n3, view);
                                                object3 = (ConstraintLayout)view2;
                                                if (object3 != null) {
                                                    n3 = R$id.quantityTv;
                                                    View view12 = view2 = dd2_2.a(n3, view);
                                                    view12 = (TextView)view2;
                                                    if (view12 != null) {
                                                        n3 = R$id.selectQty;
                                                        View view13 = view2 = dd2_2.a(n3, view);
                                                        view13 = (TextView)view2;
                                                        if (view13 != null) {
                                                            n3 = R$id.sizeRv;
                                                            Object object4 = view2 = dd2_2.a(n3, view);
                                                            object4 = (RecyclerView)view2;
                                                            if (object4 != null) {
                                                                n3 = R$id.size_unit_tv;
                                                                Object object5 = view2 = dd2_2.a(n3, view);
                                                                object5 = (AjioTextView)view2;
                                                                if (object5 != null) {
                                                                    n3 = R$id.sizeUpdateHeader;
                                                                    View view14 = view2 = dd2_2.a(n3, view);
                                                                    view14 = (TextView)view2;
                                                                    if (view14 != null) {
                                                                        n3 = R$id.updateBtn;
                                                                        View view15 = view2 = dd2_2.a(n3, view);
                                                                        view15 = (TextView)view2;
                                                                        if (view15 != null) {
                                                                            View view16 = view;
                                                                            view16 = (LinearLayout)view;
                                                                            CartUpdateItemBottomsheetLuxeBinding cartUpdateItemBottomsheetLuxeBinding = new CartUpdateItemBottomsheetLuxeBinding((LinearLayout)view16, (TextView)view3, (ImageView)view4, (FrameLayout)view5, (TextView)view6, (TextView)view7, (TextView)view8, (TextView)view9, (ImageView)view10, (ImageView)view11, (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), (TextView)view12, (TextView)view13, (RecyclerView)object4, (AjioTextView)object5, (TextView)view14, (TextView)view15);
                                                                            return cartUpdateItemBottomsheetLuxeBinding;
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
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CartUpdateItemBottomsheetLuxeBinding inflate(LayoutInflater layoutInflater) {
        return CartUpdateItemBottomsheetLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static CartUpdateItemBottomsheetLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_update_item_bottomsheet_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartUpdateItemBottomsheetLuxeBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

