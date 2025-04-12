/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ShopTheLookProductCardLayoutBinding
implements BC3 {
    public final ImageView offerIv;
    public final RelativeLayout productRl;
    private final RelativeLayout rootView;
    public final RelativeLayout saleContainer;
    public final TextView saleDiscountTV;
    public final AppCompatImageView saleIV;
    public final TextView salePriceTV;
    public final TextView salePriceTextTV;
    public final ImageView stlAddToWishlistIv;
    public final TextView stlProductActualPriceTv;
    public final CardView stlProductCv;
    public final TextView stlProductDiscountPercentageTv;
    public final CardView stlProductImageCv;
    public final ImageView stlProductIv;
    public final RelativeLayout stlProductOfferPriceRl;
    public final TextView stlProductOfferPriceTv;
    public final TextView stlProductOosTv;
    public final RelativeLayout stlProductPriceRl;
    public final TextView stlProductSellingPriceTv;
    public final TextView stlProductSubTitleTv;
    public final TextView stlProductTitleTv;
    public final ImageView stlRemoveFromWishlistIv;
    public final RelativeLayout stlSpecialContentRl;

    private ShopTheLookProductCardLayoutBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView, AppCompatImageView appCompatImageView, TextView textView2, TextView textView3, ImageView imageView2, TextView textView4, CardView cardView, TextView textView5, CardView cardView2, ImageView imageView3, RelativeLayout relativeLayout4, TextView textView6, TextView textView7, RelativeLayout relativeLayout5, TextView textView8, TextView textView9, TextView textView10, ImageView imageView4, RelativeLayout relativeLayout6) {
        this.rootView = relativeLayout;
        this.offerIv = imageView;
        this.productRl = relativeLayout2;
        this.saleContainer = relativeLayout3;
        this.saleDiscountTV = textView;
        this.saleIV = appCompatImageView;
        this.salePriceTV = textView2;
        this.salePriceTextTV = textView3;
        this.stlAddToWishlistIv = imageView2;
        this.stlProductActualPriceTv = textView4;
        this.stlProductCv = cardView;
        this.stlProductDiscountPercentageTv = textView5;
        this.stlProductImageCv = cardView2;
        this.stlProductIv = imageView3;
        this.stlProductOfferPriceRl = relativeLayout4;
        this.stlProductOfferPriceTv = textView6;
        this.stlProductOosTv = textView7;
        this.stlProductPriceRl = relativeLayout5;
        this.stlProductSellingPriceTv = textView8;
        this.stlProductSubTitleTv = textView9;
        this.stlProductTitleTv = textView10;
        this.stlRemoveFromWishlistIv = imageView4;
        this.stlSpecialContentRl = relativeLayout6;
    }

    public static ShopTheLookProductCardLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.offerIv;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (ImageView)view2;
        if (view3 != null) {
            View view4 = view;
            view4 = (RelativeLayout)view;
            n3 = R$id.sale_container;
            View view5 = view2 = dd2_2.a(n3, view);
            view5 = (RelativeLayout)view2;
            if (view5 != null) {
                n3 = R$id.saleDiscountTV;
                View view6 = view2 = dd2_2.a(n3, view);
                view6 = (TextView)view2;
                if (view6 != null) {
                    n3 = R$id.saleIV;
                    Object object2 = view2 = dd2_2.a(n3, view);
                    object2 = (AppCompatImageView)view2;
                    if (object2 != null) {
                        n3 = R$id.salePriceTV;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (TextView)view2;
                        if (view7 != null) {
                            n3 = R$id.salePriceTextTV;
                            View view8 = view2 = dd2_2.a(n3, view);
                            view8 = (TextView)view2;
                            if (view8 != null) {
                                n3 = R$id.stlAddToWishlistIv;
                                View view9 = view2 = dd2_2.a(n3, view);
                                view9 = (ImageView)view2;
                                if (view9 != null) {
                                    n3 = R$id.stlProductActualPriceTv;
                                    View view10 = view2 = dd2_2.a(n3, view);
                                    view10 = (TextView)view2;
                                    if (view10 != null) {
                                        n3 = R$id.stlProductCv;
                                        Object object3 = view2 = dd2_2.a(n3, view);
                                        object3 = (CardView)view2;
                                        if (object3 != null) {
                                            n3 = R$id.stlProductDiscountPercentageTv;
                                            View view11 = view2 = dd2_2.a(n3, view);
                                            view11 = (TextView)view2;
                                            if (view11 != null) {
                                                n3 = R$id.stlProductImageCv;
                                                Object object4 = view2 = dd2_2.a(n3, view);
                                                object4 = (CardView)view2;
                                                if (object4 != null) {
                                                    n3 = R$id.stlProductIv;
                                                    View view12 = view2 = dd2_2.a(n3, view);
                                                    view12 = (ImageView)view2;
                                                    if (view12 != null) {
                                                        n3 = R$id.stlProductOfferPriceRl;
                                                        View view13 = view2 = dd2_2.a(n3, view);
                                                        view13 = (RelativeLayout)view2;
                                                        if (view13 != null) {
                                                            n3 = R$id.stlProductOfferPriceTv;
                                                            View view14 = view2 = dd2_2.a(n3, view);
                                                            view14 = (TextView)view2;
                                                            if (view14 != null) {
                                                                n3 = R$id.stlProductOosTv;
                                                                View view15 = view2 = dd2_2.a(n3, view);
                                                                view15 = (TextView)view2;
                                                                if (view15 != null) {
                                                                    n3 = R$id.stlProductPriceRl;
                                                                    View view16 = view2 = dd2_2.a(n3, view);
                                                                    view16 = (RelativeLayout)view2;
                                                                    if (view16 != null) {
                                                                        n3 = R$id.stlProductSellingPriceTv;
                                                                        View view17 = view2 = dd2_2.a(n3, view);
                                                                        view17 = (TextView)view2;
                                                                        if (view17 != null) {
                                                                            n3 = R$id.stlProductSubTitleTv;
                                                                            View view18 = view2 = dd2_2.a(n3, view);
                                                                            view18 = (TextView)view2;
                                                                            if (view18 != null) {
                                                                                n3 = R$id.stlProductTitleTv;
                                                                                View view19 = view2 = dd2_2.a(n3, view);
                                                                                view19 = (TextView)view2;
                                                                                if (view19 != null) {
                                                                                    n3 = R$id.stlRemoveFromWishlistIv;
                                                                                    View view20 = view2 = dd2_2.a(n3, view);
                                                                                    view20 = (ImageView)view2;
                                                                                    if (view20 != null) {
                                                                                        n3 = R$id.stlSpecialContentRl;
                                                                                        View view21 = view2 = dd2_2.a(n3, view);
                                                                                        view21 = (RelativeLayout)view2;
                                                                                        if (view21 != null) {
                                                                                            object = new ShopTheLookProductCardLayoutBinding((RelativeLayout)view4, (ImageView)view3, (RelativeLayout)view4, (RelativeLayout)view5, (TextView)view6, (AppCompatImageView)((Object)object2), (TextView)view7, (TextView)view8, (ImageView)view9, (TextView)view10, (CardView)((Object)object3), (TextView)view11, (CardView)((Object)object4), (ImageView)view12, (RelativeLayout)view13, (TextView)view14, (TextView)view15, (RelativeLayout)view16, (TextView)view17, (TextView)view18, (TextView)view19, (ImageView)view20, (RelativeLayout)view21);
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
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ShopTheLookProductCardLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ShopTheLookProductCardLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ShopTheLookProductCardLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.shop_the_look_product_card_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ShopTheLookProductCardLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

