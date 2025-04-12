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
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutFreebieGetFreebiesPlpBinding;
import com.ril.ajio.databinding.LayoutSalePriceBinding;
import com.ril.ajio.databinding.RatingWidgetViewBinding;

public final class LayoutProductWishlistRefreshBinding
implements BC3 {
    public final LinearLayout closetAddBagContainer;
    public final ImageView closetAddBagImg;
    public final TextView closetAddBagTv;
    public final LinearLayout closetOOSContainer;
    public final ImageView closetOOSImg;
    public final TextView closetOOSTv;
    public final ImageView deleteImg;
    public final ImageView deleteImgOOS;
    public final LinearLayout deleteOOSContainer;
    public final TextView discountRefresh;
    public final LayoutFreebieGetFreebiesPlpBinding freebieLyt;
    public final RatingWidgetViewBinding includeRatingView;
    public final TextView offerPrice;
    public final View oosBg;
    public final TextView oosTv;
    public final TextView originalPrice;
    public final ImageView pllBgGrey;
    public final ImageView pllIvSelected;
    public final View pllVUnselected;
    public final TextView plpRowBrandTv;
    public final TextView plpRowPrdNameTv;
    public final ImageView plpRowProductIv;
    public final CardView productContainer;
    public final TextView removeOOSTV;
    private final ConstraintLayout rootView;
    public final LayoutSalePriceBinding saleContainer;
    public final AjioTextView wishlistRowExclusiveTv;

    private LayoutProductWishlistRefreshBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ImageView imageView, TextView textView, LinearLayout linearLayout2, ImageView imageView2, TextView textView2, ImageView imageView3, ImageView imageView4, LinearLayout linearLayout3, TextView textView3, LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding, RatingWidgetViewBinding ratingWidgetViewBinding, TextView textView4, View view, TextView textView5, TextView textView6, ImageView imageView5, ImageView imageView6, View view2, TextView textView7, TextView textView8, ImageView imageView7, CardView cardView, TextView textView9, LayoutSalePriceBinding layoutSalePriceBinding, AjioTextView ajioTextView) {
        this.rootView = constraintLayout;
        this.closetAddBagContainer = linearLayout;
        this.closetAddBagImg = imageView;
        this.closetAddBagTv = textView;
        this.closetOOSContainer = linearLayout2;
        this.closetOOSImg = imageView2;
        this.closetOOSTv = textView2;
        this.deleteImg = imageView3;
        this.deleteImgOOS = imageView4;
        this.deleteOOSContainer = linearLayout3;
        this.discountRefresh = textView3;
        this.freebieLyt = layoutFreebieGetFreebiesPlpBinding;
        this.includeRatingView = ratingWidgetViewBinding;
        this.offerPrice = textView4;
        this.oosBg = view;
        this.oosTv = textView5;
        this.originalPrice = textView6;
        this.pllBgGrey = imageView5;
        this.pllIvSelected = imageView6;
        this.pllVUnselected = view2;
        this.plpRowBrandTv = textView7;
        this.plpRowPrdNameTv = textView8;
        this.plpRowProductIv = imageView7;
        this.productContainer = cardView;
        this.removeOOSTV = textView9;
        this.saleContainer = layoutSalePriceBinding;
        this.wishlistRowExclusiveTv = ajioTextView;
    }

    public static LayoutProductWishlistRefreshBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.closetAddBagContainer;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (LinearLayout)view2;
        if (view3 != null) {
            n3 = R$id.closetAddBagImg;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (ImageView)view2;
            if (view4 != null) {
                n3 = R$id.closetAddBagTv;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (TextView)view2;
                if (view5 != null) {
                    n3 = R$id.closetOOSContainer;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (LinearLayout)view2;
                    if (view6 != null) {
                        n3 = R$id.closetOOSImg;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (ImageView)view2;
                        if (view7 != null) {
                            n3 = R$id.closetOOSTv;
                            View view8 = view2 = dd2_2.a(n3, view);
                            view8 = (TextView)view2;
                            if (view8 != null) {
                                n3 = R$id.deleteImg;
                                View view9 = view2 = dd2_2.a(n3, view);
                                view9 = (ImageView)view2;
                                if (view9 != null) {
                                    n3 = R$id.deleteImgOOS;
                                    View view10 = view2 = dd2_2.a(n3, view);
                                    view10 = (ImageView)view2;
                                    if (view10 != null) {
                                        n3 = R$id.deleteOOSContainer;
                                        View view11 = view2 = dd2_2.a(n3, view);
                                        view11 = (LinearLayout)view2;
                                        if (view11 != null) {
                                            n3 = R$id.discount_refresh;
                                            View view12 = view2 = dd2_2.a(n3, view);
                                            view12 = (TextView)view2;
                                            if (view12 != null && (view2 = dd2_2.a(n3 = R$id.freebie_lyt, view)) != null) {
                                                LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding = LayoutFreebieGetFreebiesPlpBinding.bind(view2);
                                                n3 = R$id.include_rating_view;
                                                view2 = dd2_2.a(n3, view);
                                                if (view2 != null) {
                                                    View view13;
                                                    RatingWidgetViewBinding ratingWidgetViewBinding = RatingWidgetViewBinding.bind(view2);
                                                    n3 = R$id.offerPrice;
                                                    View view14 = view2 = dd2_2.a(n3, view);
                                                    view14 = (TextView)view2;
                                                    if (view14 != null && (view13 = dd2_2.a(n3 = R$id.oosBg, view)) != null) {
                                                        n3 = R$id.oosTv;
                                                        View view15 = view2 = dd2_2.a(n3, view);
                                                        view15 = (TextView)view2;
                                                        if (view15 != null) {
                                                            n3 = R$id.originalPrice;
                                                            View view16 = view2 = dd2_2.a(n3, view);
                                                            view16 = (TextView)view2;
                                                            if (view16 != null) {
                                                                n3 = R$id.pllBgGrey;
                                                                View view17 = view2 = dd2_2.a(n3, view);
                                                                view17 = (ImageView)view2;
                                                                if (view17 != null) {
                                                                    View view18;
                                                                    n3 = R$id.pllIvSelected;
                                                                    View view19 = view2 = dd2_2.a(n3, view);
                                                                    view19 = (ImageView)view2;
                                                                    if (view19 != null && (view18 = dd2_2.a(n3 = R$id.pllVUnselected, view)) != null) {
                                                                        n3 = R$id.plp_row_brand_tv;
                                                                        View view20 = view2 = dd2_2.a(n3, view);
                                                                        view20 = (TextView)view2;
                                                                        if (view20 != null) {
                                                                            n3 = R$id.plp_row_prd_name_tv;
                                                                            View view21 = view2 = dd2_2.a(n3, view);
                                                                            view21 = (TextView)view2;
                                                                            if (view21 != null) {
                                                                                n3 = R$id.plp_row_product_iv;
                                                                                View view22 = view2 = dd2_2.a(n3, view);
                                                                                view22 = (ImageView)view2;
                                                                                if (view22 != null) {
                                                                                    n3 = R$id.productContainer;
                                                                                    Object object2 = view2 = dd2_2.a(n3, view);
                                                                                    object2 = (CardView)view2;
                                                                                    if (object2 != null) {
                                                                                        n3 = R$id.removeOOSTV;
                                                                                        View view23 = view2 = dd2_2.a(n3, view);
                                                                                        view23 = (TextView)view2;
                                                                                        if (view23 != null && (view2 = dd2_2.a(n3 = R$id.sale_container, view)) != null) {
                                                                                            LayoutSalePriceBinding layoutSalePriceBinding = LayoutSalePriceBinding.bind(view2);
                                                                                            n3 = R$id.wishlist_row_exclusive_tv;
                                                                                            Object object3 = view2 = dd2_2.a(n3, view);
                                                                                            object3 = (AjioTextView)view2;
                                                                                            if (object3 != null) {
                                                                                                Object object4 = view;
                                                                                                object4 = (ConstraintLayout)view;
                                                                                                LayoutProductWishlistRefreshBinding layoutProductWishlistRefreshBinding = new LayoutProductWishlistRefreshBinding((ConstraintLayout)((Object)object4), (LinearLayout)view3, (ImageView)view4, (TextView)view5, (LinearLayout)view6, (ImageView)view7, (TextView)view8, (ImageView)view9, (ImageView)view10, (LinearLayout)view11, (TextView)view12, layoutFreebieGetFreebiesPlpBinding, ratingWidgetViewBinding, (TextView)view14, view13, (TextView)view15, (TextView)view16, (ImageView)view17, (ImageView)view19, view18, (TextView)view20, (TextView)view21, (ImageView)view22, (CardView)((Object)object2), (TextView)view23, layoutSalePriceBinding, (AjioTextView)object3);
                                                                                                return layoutProductWishlistRefreshBinding;
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

    public static LayoutProductWishlistRefreshBinding inflate(LayoutInflater layoutInflater) {
        return LayoutProductWishlistRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutProductWishlistRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_product_wishlist_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutProductWishlistRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

