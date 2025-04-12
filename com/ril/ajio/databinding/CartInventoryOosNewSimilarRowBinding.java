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
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class CartInventoryOosNewSimilarRowBinding
implements BC3 {
    public final View cartProductDivider;
    public final TextView cartS1S2Info;
    public final TextView idAlertText;
    public final ImageView idDeleteIcon;
    public final ImageView idQtyArrow;
    public final ImageView idSizeArrow;
    public final TextView originalPrice;
    public final TextView price;
    public final TextView productBrandTv;
    public final RelativeLayout productDetailsContainer;
    public final ImageView productImg;
    public final FrameLayout productImgContainer;
    public final RelativeLayout productInfoContainer;
    public final TextView productTitle;
    public final LinearLayout qtyContainer;
    public final TextView qtyInfo;
    public final TextView qtyText;
    public final TextView removeBtn;
    public final ConstraintLayout removeBtnConstraint;
    private final LinearLayout rootView;
    public final TextView showSimilar;
    public final LinearLayout sizeContainer;
    public final TextView sizeInfo;
    public final ConstraintLayout sizeQtyContainer;
    public final TextView sizeText;

    private CartInventoryOosNewSimilarRowBinding(LinearLayout linearLayout, View view, TextView textView, TextView textView2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView3, TextView textView4, TextView textView5, RelativeLayout relativeLayout, ImageView imageView4, FrameLayout frameLayout, RelativeLayout relativeLayout2, TextView textView6, LinearLayout linearLayout2, TextView textView7, TextView textView8, TextView textView9, ConstraintLayout constraintLayout, TextView textView10, LinearLayout linearLayout3, TextView textView11, ConstraintLayout constraintLayout2, TextView textView12) {
        this.rootView = linearLayout;
        this.cartProductDivider = view;
        this.cartS1S2Info = textView;
        this.idAlertText = textView2;
        this.idDeleteIcon = imageView;
        this.idQtyArrow = imageView2;
        this.idSizeArrow = imageView3;
        this.originalPrice = textView3;
        this.price = textView4;
        this.productBrandTv = textView5;
        this.productDetailsContainer = relativeLayout;
        this.productImg = imageView4;
        this.productImgContainer = frameLayout;
        this.productInfoContainer = relativeLayout2;
        this.productTitle = textView6;
        this.qtyContainer = linearLayout2;
        this.qtyInfo = textView7;
        this.qtyText = textView8;
        this.removeBtn = textView9;
        this.removeBtnConstraint = constraintLayout;
        this.showSimilar = textView10;
        this.sizeContainer = linearLayout3;
        this.sizeInfo = textView11;
        this.sizeQtyContainer = constraintLayout2;
        this.sizeText = textView12;
    }

    public static CartInventoryOosNewSimilarRowBinding bind(View view) {
        Object object = view;
        int n3 = R$id.cartProductDivider;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            Object object2;
            n3 = R$id.cartS1S2Info;
            View view3 = object2 = dd2_2.a(n3, view);
            view3 = (TextView)object2;
            if (view3 != null) {
                n3 = R$id.id_alert_text;
                View view4 = object2 = dd2_2.a(n3, view);
                view4 = (TextView)object2;
                if (view4 != null) {
                    n3 = R$id.id_delete_icon;
                    View view5 = object2 = dd2_2.a(n3, view);
                    view5 = (ImageView)object2;
                    if (view5 != null) {
                        n3 = R$id.id_qty_arrow;
                        View view6 = object2 = dd2_2.a(n3, view);
                        view6 = (ImageView)object2;
                        if (view6 != null) {
                            n3 = R$id.id_size_arrow;
                            View view7 = object2 = dd2_2.a(n3, view);
                            view7 = (ImageView)object2;
                            if (view7 != null) {
                                n3 = R$id.originalPrice;
                                View view8 = object2 = dd2_2.a(n3, view);
                                view8 = (TextView)object2;
                                if (view8 != null) {
                                    n3 = R$id.price;
                                    View view9 = object2 = dd2_2.a(n3, view);
                                    view9 = (TextView)object2;
                                    if (view9 != null) {
                                        n3 = R$id.productBrandTv;
                                        View view10 = object2 = dd2_2.a(n3, view);
                                        view10 = (TextView)object2;
                                        if (view10 != null) {
                                            n3 = R$id.productDetailsContainer;
                                            View view11 = object2 = dd2_2.a(n3, view);
                                            view11 = (RelativeLayout)object2;
                                            if (view11 != null) {
                                                n3 = R$id.productImg;
                                                View view12 = object2 = dd2_2.a(n3, view);
                                                view12 = (ImageView)object2;
                                                if (view12 != null) {
                                                    n3 = R$id.productImgContainer;
                                                    View view13 = object2 = dd2_2.a(n3, view);
                                                    view13 = (FrameLayout)object2;
                                                    if (view13 != null) {
                                                        n3 = R$id.productInfoContainer;
                                                        View view14 = object2 = dd2_2.a(n3, view);
                                                        view14 = (RelativeLayout)object2;
                                                        if (view14 != null) {
                                                            n3 = R$id.productTitle;
                                                            View view15 = object2 = dd2_2.a(n3, view);
                                                            view15 = (TextView)object2;
                                                            if (view15 != null) {
                                                                n3 = R$id.qtyContainer;
                                                                View view16 = object2 = dd2_2.a(n3, view);
                                                                view16 = (LinearLayout)object2;
                                                                if (view16 != null) {
                                                                    n3 = R$id.qtyInfo;
                                                                    View view17 = object2 = dd2_2.a(n3, view);
                                                                    view17 = (TextView)object2;
                                                                    if (view17 != null) {
                                                                        n3 = R$id.qtyText;
                                                                        View view18 = object2 = dd2_2.a(n3, view);
                                                                        view18 = (TextView)object2;
                                                                        if (view18 != null) {
                                                                            n3 = R$id.removeBtn;
                                                                            View view19 = object2 = dd2_2.a(n3, view);
                                                                            view19 = (TextView)object2;
                                                                            if (view19 != null) {
                                                                                n3 = R$id.removeBtnConstraint;
                                                                                Object object3 = object2 = dd2_2.a(n3, view);
                                                                                object3 = (ConstraintLayout)((Object)object2);
                                                                                if (object3 != null) {
                                                                                    n3 = R$id.showSimilar;
                                                                                    View view20 = object2 = dd2_2.a(n3, view);
                                                                                    view20 = (TextView)object2;
                                                                                    if (view20 != null) {
                                                                                        n3 = R$id.sizeContainer;
                                                                                        View view21 = object2 = dd2_2.a(n3, view);
                                                                                        view21 = (LinearLayout)object2;
                                                                                        if (view21 != null) {
                                                                                            n3 = R$id.sizeInfo;
                                                                                            View view22 = object2 = dd2_2.a(n3, view);
                                                                                            view22 = (TextView)object2;
                                                                                            if (view22 != null) {
                                                                                                n3 = R$id.sizeQtyContainer;
                                                                                                Object object4 = object2 = dd2_2.a(n3, view);
                                                                                                object4 = (ConstraintLayout)((Object)object2);
                                                                                                if (object4 != null) {
                                                                                                    n3 = R$id.sizeText;
                                                                                                    View view23 = object2 = dd2_2.a(n3, view);
                                                                                                    view23 = (TextView)object2;
                                                                                                    if (view23 != null) {
                                                                                                        CartInventoryOosNewSimilarRowBinding cartInventoryOosNewSimilarRowBinding;
                                                                                                        object2 = cartInventoryOosNewSimilarRowBinding;
                                                                                                        View view24 = view;
                                                                                                        view24 = (LinearLayout)view;
                                                                                                        cartInventoryOosNewSimilarRowBinding = new CartInventoryOosNewSimilarRowBinding((LinearLayout)view24, view2, (TextView)view3, (TextView)view4, (ImageView)view5, (ImageView)view6, (ImageView)view7, (TextView)view8, (TextView)view9, (TextView)view10, (RelativeLayout)view11, (ImageView)view12, (FrameLayout)view13, (RelativeLayout)view14, (TextView)view15, (LinearLayout)view16, (TextView)view17, (TextView)view18, (TextView)view19, (ConstraintLayout)((Object)object3), (TextView)view20, (LinearLayout)view21, (TextView)view22, (ConstraintLayout)((Object)object4), (TextView)view23);
                                                                                                        return cartInventoryOosNewSimilarRowBinding;
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

    public static CartInventoryOosNewSimilarRowBinding inflate(LayoutInflater layoutInflater) {
        return CartInventoryOosNewSimilarRowBinding.inflate(layoutInflater, null, false);
    }

    public static CartInventoryOosNewSimilarRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_inventory_oos_new_similar_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartInventoryOosNewSimilarRowBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

