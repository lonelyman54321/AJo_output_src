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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutFreebieGetFreebiesPdpBinding;
import com.ril.ajio.databinding.RatingWidgetViewBinding;

public final class PdpPriceBrandLayoutBinding
implements BC3 {
    public final AjioTextView brandName;
    public final LinearLayout colorLayout;
    public final AjioTextView freeDeliveryTag;
    public final LayoutFreebieGetFreebiesPdpBinding freebiesLyt;
    public final RatingWidgetViewBinding includeRatingView;
    public final AjioImageView ivTagAjiogram;
    public final LinearLayout layoutTagAjiogram;
    public final AjioTextView numberOfColors;
    public final AjioTextView oosTv;
    public final AjioTextView productDiscPercentageOff;
    public final AjioTextView productDiscPrice;
    public final AjioTextView productMrpText;
    public final AjioTextView productMrpTextNoDiscount;
    public final AjioTextView productName;
    public final AjioTextView productPrice;
    public final AjioTextView productPriceGstTv;
    private final ConstraintLayout rootView;
    public final View saleBgStrip;
    public final ImageView saleImv;
    public final AjioTextView sellingFastTag;
    public final TextView tvTagAjiogram;
    public final TextView txtDiscoverBrand;

    private PdpPriceBrandLayoutBinding(ConstraintLayout constraintLayout, AjioTextView ajioTextView, LinearLayout linearLayout, AjioTextView ajioTextView2, LayoutFreebieGetFreebiesPdpBinding layoutFreebieGetFreebiesPdpBinding, RatingWidgetViewBinding ratingWidgetViewBinding, AjioImageView ajioImageView, LinearLayout linearLayout2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10, AjioTextView ajioTextView11, View view, ImageView imageView, AjioTextView ajioTextView12, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.brandName = ajioTextView;
        this.colorLayout = linearLayout;
        this.freeDeliveryTag = ajioTextView2;
        this.freebiesLyt = layoutFreebieGetFreebiesPdpBinding;
        this.includeRatingView = ratingWidgetViewBinding;
        this.ivTagAjiogram = ajioImageView;
        this.layoutTagAjiogram = linearLayout2;
        this.numberOfColors = ajioTextView3;
        this.oosTv = ajioTextView4;
        this.productDiscPercentageOff = ajioTextView5;
        this.productDiscPrice = ajioTextView6;
        this.productMrpText = ajioTextView7;
        this.productMrpTextNoDiscount = ajioTextView8;
        this.productName = ajioTextView9;
        this.productPrice = ajioTextView10;
        this.productPriceGstTv = ajioTextView11;
        this.saleBgStrip = view;
        this.saleImv = imageView;
        this.sellingFastTag = ajioTextView12;
        this.tvTagAjiogram = textView;
        this.txtDiscoverBrand = textView2;
    }

    public static PdpPriceBrandLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.brand_name;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioTextView)view2;
        if (object2 != null) {
            n3 = R$id.color_layout;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (LinearLayout)view2;
            if (view3 != null) {
                n3 = R$id.free_delivery_tag;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AjioTextView)view2;
                if (object3 != null && (view2 = dd2_2.a(n3 = R$id.freebies_lyt, view)) != null) {
                    LayoutFreebieGetFreebiesPdpBinding layoutFreebieGetFreebiesPdpBinding = LayoutFreebieGetFreebiesPdpBinding.bind(view2);
                    n3 = R$id.include_rating_view;
                    view2 = dd2_2.a(n3, view);
                    if (view2 != null) {
                        RatingWidgetViewBinding ratingWidgetViewBinding = RatingWidgetViewBinding.bind(view2);
                        n3 = R$id.iv_tag_ajiogram;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (AjioImageView)view2;
                        if (object4 != null) {
                            n3 = R$id.layout_tag_ajiogram;
                            View view4 = view2 = dd2_2.a(n3, view);
                            view4 = (LinearLayout)view2;
                            if (view4 != null) {
                                n3 = R$id.number_of_colors;
                                Object object5 = view2 = dd2_2.a(n3, view);
                                object5 = (AjioTextView)view2;
                                if (object5 != null) {
                                    n3 = R$id.oos_tv;
                                    Object object6 = view2 = dd2_2.a(n3, view);
                                    object6 = (AjioTextView)view2;
                                    if (object6 != null) {
                                        n3 = R$id.product_disc_percentage_off;
                                        Object object7 = view2 = dd2_2.a(n3, view);
                                        object7 = (AjioTextView)view2;
                                        if (object7 != null) {
                                            n3 = R$id.product_disc_price;
                                            Object object8 = view2 = dd2_2.a(n3, view);
                                            object8 = (AjioTextView)view2;
                                            if (object8 != null) {
                                                n3 = R$id.product_mrp_text;
                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                object9 = (AjioTextView)view2;
                                                if (object9 != null) {
                                                    n3 = R$id.product_mrp_text_no_discount;
                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                    object10 = (AjioTextView)view2;
                                                    if (object10 != null) {
                                                        n3 = R$id.product_name;
                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                        object11 = (AjioTextView)view2;
                                                        if (object11 != null) {
                                                            n3 = R$id.product_price;
                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                            object12 = (AjioTextView)view2;
                                                            if (object12 != null) {
                                                                View view5;
                                                                n3 = R$id.product_price_gst_tv;
                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                object13 = (AjioTextView)view2;
                                                                if (object13 != null && (view5 = dd2_2.a(n3 = R$id.sale_bg_strip, view)) != null) {
                                                                    n3 = R$id.sale_imv;
                                                                    View view6 = view2 = dd2_2.a(n3, view);
                                                                    view6 = (ImageView)view2;
                                                                    if (view6 != null) {
                                                                        n3 = R$id.selling_fast_tag;
                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                        object14 = (AjioTextView)view2;
                                                                        if (object14 != null) {
                                                                            n3 = R$id.tv_tag_ajiogram;
                                                                            View view7 = view2 = dd2_2.a(n3, view);
                                                                            view7 = (TextView)view2;
                                                                            if (view7 != null) {
                                                                                n3 = R$id.txt_discover_brand;
                                                                                View view8 = view2 = dd2_2.a(n3, view);
                                                                                view8 = (TextView)view2;
                                                                                if (view8 != null) {
                                                                                    Object object15 = view;
                                                                                    object15 = (ConstraintLayout)view;
                                                                                    PdpPriceBrandLayoutBinding pdpPriceBrandLayoutBinding = new PdpPriceBrandLayoutBinding((ConstraintLayout)((Object)object15), (AjioTextView)object2, (LinearLayout)view3, (AjioTextView)object3, layoutFreebieGetFreebiesPdpBinding, ratingWidgetViewBinding, (AjioImageView)((Object)object4), (LinearLayout)view4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, view5, (ImageView)view6, (AjioTextView)object14, (TextView)view7, (TextView)view8);
                                                                                    return pdpPriceBrandLayoutBinding;
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

    public static PdpPriceBrandLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PdpPriceBrandLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PdpPriceBrandLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_price_brand_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpPriceBrandLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

