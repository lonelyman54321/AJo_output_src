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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutFreebieGetFreebiesPlpBinding;
import com.ril.ajio.databinding.LayoutSalePriceWishlistWidgetLuxeBinding;

public final class ClosetListFromCartLayoutLuxeBinding
implements BC3 {
    public final TextView cancelSizeTv;
    public final LinearLayout closetAddBagContainer;
    public final ImageView closetAddBagImg;
    public final TextView closetAddBagTv;
    public final AjioTextView closetAddedToBag;
    public final ConstraintLayout closetCartContainer;
    public final ImageView closetImg;
    public final RecyclerView closetSizeRv;
    public final TextView discount;
    public final LayoutFreebieGetFreebiesPlpBinding freebieLyt;
    public final TextView offerPrice;
    public final TextView originalPrice;
    public final ConstraintLayout productInfoContainer;
    public final TextView productName;
    public final ConstraintLayout productSizeContainer;
    public final TextView productTitle;
    private final ConstraintLayout rootView;
    public final LayoutSalePriceWishlistWidgetLuxeBinding saleContainer;
    public final TextView sizeSelectTv;
    public final AjioTextView sizeUnitTv;
    public final AjioTextView wishlistRowExclusiveTv;

    private ClosetListFromCartLayoutLuxeBinding(ConstraintLayout constraintLayout, TextView textView, LinearLayout linearLayout, ImageView imageView, TextView textView2, AjioTextView ajioTextView, ConstraintLayout constraintLayout2, ImageView imageView2, RecyclerView recyclerView, TextView textView3, LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding, TextView textView4, TextView textView5, ConstraintLayout constraintLayout3, TextView textView6, ConstraintLayout constraintLayout4, TextView textView7, LayoutSalePriceWishlistWidgetLuxeBinding layoutSalePriceWishlistWidgetLuxeBinding, TextView textView8, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.cancelSizeTv = textView;
        this.closetAddBagContainer = linearLayout;
        this.closetAddBagImg = imageView;
        this.closetAddBagTv = textView2;
        this.closetAddedToBag = ajioTextView;
        this.closetCartContainer = constraintLayout2;
        this.closetImg = imageView2;
        this.closetSizeRv = recyclerView;
        this.discount = textView3;
        this.freebieLyt = layoutFreebieGetFreebiesPlpBinding;
        this.offerPrice = textView4;
        this.originalPrice = textView5;
        this.productInfoContainer = constraintLayout3;
        this.productName = textView6;
        this.productSizeContainer = constraintLayout4;
        this.productTitle = textView7;
        this.saleContainer = layoutSalePriceWishlistWidgetLuxeBinding;
        this.sizeSelectTv = textView8;
        this.sizeUnitTv = ajioTextView2;
        this.wishlistRowExclusiveTv = ajioTextView3;
    }

    public static ClosetListFromCartLayoutLuxeBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.cancelSizeTv;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (TextView)view2;
        if (view3 != null) {
            n3 = R$id.closetAddBagContainer;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (LinearLayout)view2;
            if (view4 != null) {
                n3 = R$id.closetAddBagImg;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (ImageView)view2;
                if (view5 != null) {
                    n3 = R$id.closetAddBagTv;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (TextView)view2;
                    if (view6 != null) {
                        n3 = R$id.closetAddedToBag;
                        Object object2 = view2 = dd2_2.a(n3, view);
                        object2 = (AjioTextView)view2;
                        if (object2 != null) {
                            Object object3 = view;
                            object3 = (ConstraintLayout)view;
                            n3 = R$id.closetImg;
                            View view7 = view2 = dd2_2.a(n3, view);
                            view7 = (ImageView)view2;
                            if (view7 != null) {
                                n3 = R$id.closetSizeRv;
                                Object object4 = view2 = dd2_2.a(n3, view);
                                object4 = (RecyclerView)view2;
                                if (object4 != null) {
                                    n3 = R$id.discount;
                                    View view8 = view2 = dd2_2.a(n3, view);
                                    view8 = (TextView)view2;
                                    if (view8 != null && (view2 = dd2_2.a(n3 = R$id.freebie_lyt, view)) != null) {
                                        LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding = LayoutFreebieGetFreebiesPlpBinding.bind(view2);
                                        n3 = R$id.offerPrice;
                                        View view9 = view2 = dd2_2.a(n3, view);
                                        view9 = (TextView)view2;
                                        if (view9 != null) {
                                            n3 = R$id.originalPrice;
                                            View view10 = view2 = dd2_2.a(n3, view);
                                            view10 = (TextView)view2;
                                            if (view10 != null) {
                                                n3 = R$id.productInfoContainer;
                                                Object object5 = view2 = dd2_2.a(n3, view);
                                                object5 = (ConstraintLayout)view2;
                                                if (object5 != null) {
                                                    n3 = R$id.productName;
                                                    View view11 = view2 = dd2_2.a(n3, view);
                                                    view11 = (TextView)view2;
                                                    if (view11 != null) {
                                                        n3 = R$id.productSizeContainer;
                                                        Object object6 = view2 = dd2_2.a(n3, view);
                                                        object6 = (ConstraintLayout)view2;
                                                        if (object6 != null) {
                                                            n3 = R$id.productTitle;
                                                            View view12 = view2 = dd2_2.a(n3, view);
                                                            view12 = (TextView)view2;
                                                            if (view12 != null && (view2 = dd2_2.a(n3 = R$id.sale_container, view)) != null) {
                                                                LayoutSalePriceWishlistWidgetLuxeBinding layoutSalePriceWishlistWidgetLuxeBinding = LayoutSalePriceWishlistWidgetLuxeBinding.bind(view2);
                                                                n3 = R$id.sizeSelectTv;
                                                                View view13 = view2 = dd2_2.a(n3, view);
                                                                view13 = (TextView)view2;
                                                                if (view13 != null) {
                                                                    n3 = R$id.size_unit_tv;
                                                                    Object object7 = view2 = dd2_2.a(n3, view);
                                                                    object7 = (AjioTextView)view2;
                                                                    if (object7 != null) {
                                                                        n3 = R$id.wishlist_row_exclusive_tv;
                                                                        Object object8 = view2 = dd2_2.a(n3, view);
                                                                        object8 = (AjioTextView)view2;
                                                                        if (object8 != null) {
                                                                            object = new ClosetListFromCartLayoutLuxeBinding((ConstraintLayout)((Object)object3), (TextView)view3, (LinearLayout)view4, (ImageView)view5, (TextView)view6, (AjioTextView)object2, (ConstraintLayout)((Object)object3), (ImageView)view7, (RecyclerView)object4, (TextView)view8, layoutFreebieGetFreebiesPlpBinding, (TextView)view9, (TextView)view10, (ConstraintLayout)((Object)object5), (TextView)view11, (ConstraintLayout)((Object)object6), (TextView)view12, layoutSalePriceWishlistWidgetLuxeBinding, (TextView)view13, (AjioTextView)object7, (AjioTextView)object8);
                                                                            return object;
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

    public static ClosetListFromCartLayoutLuxeBinding inflate(LayoutInflater layoutInflater) {
        return ClosetListFromCartLayoutLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static ClosetListFromCartLayoutLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.closet_list_from_cart_layout_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ClosetListFromCartLayoutLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

