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
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.databinding.LayoutFreebieGetFreebiesPlpBinding;
import com.ril.ajio.databinding.LayoutSalePriceV2Binding;
import com.ril.ajio.databinding.RatingWidgetViewBinding;

public final class PlpProductRowViewBinding
implements BC3 {
    public final LinearLayout brandLayout;
    public final LayoutFreebieGetFreebiesPlpBinding freebieLyt;
    public final LottieAnimationView idDeliveryAnim;
    public final RatingWidgetViewBinding includeRatingView;
    public final AjioImageView ivTagAjiogram;
    public final LinearLayout layoutTagAjiogram;
    public final LinearLayout llPdDelivery;
    public final TextView plpAdTv;
    public final ImageView plpRowAddToClosetIv;
    public final TextView plpRowAddToClosetWishcountIv;
    public final TextView plpRowBrandTv;
    public final ImageView plpRowClosetIvAdded;
    public final TextView plpRowClosetIvAddedWishcount;
    public final TextView plpRowDiscountPercentTv;
    public final TextView plpRowDodTimerTv;
    public final LinearLayout plpRowDodTimerView;
    public final TextView plpRowExclusiveTv;
    public final TextView plpRowFinalPriceTv;
    public final TextView plpRowMrpPriceTv;
    public final TextView plpRowOfferPriceTv;
    public final TextView plpRowPrdNameTv;
    public final LinearLayout plpRowPriceView;
    public final ImageView plpRowProductIv;
    public final CardView plpRowProductIvRoot;
    public final ImageView plpRowSimilarProductIv;
    public final TextView plpRowSimilarProductTv;
    public final TextView plpRowSizeCountTv;
    public final LinearLayout plpRowSizeList;
    public final TextView priorityDate;
    private final ConstraintLayout rootView;
    public final LayoutSalePriceV2Binding saleContainer;
    public final TextView sellingFastTag;
    public final TextView tvTagAjiogram;

    private PlpProductRowViewBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding, LottieAnimationView lottieAnimationView, RatingWidgetViewBinding ratingWidgetViewBinding, AjioImageView ajioImageView, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView, ImageView imageView, TextView textView2, TextView textView3, ImageView imageView2, TextView textView4, TextView textView5, TextView textView6, LinearLayout linearLayout4, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, LinearLayout linearLayout5, ImageView imageView3, CardView cardView, ImageView imageView4, TextView textView12, TextView textView13, LinearLayout linearLayout6, TextView textView14, LayoutSalePriceV2Binding layoutSalePriceV2Binding, TextView textView15, TextView textView16) {
        this.rootView = constraintLayout;
        this.brandLayout = linearLayout;
        this.freebieLyt = layoutFreebieGetFreebiesPlpBinding;
        this.idDeliveryAnim = lottieAnimationView;
        this.includeRatingView = ratingWidgetViewBinding;
        this.ivTagAjiogram = ajioImageView;
        this.layoutTagAjiogram = linearLayout2;
        this.llPdDelivery = linearLayout3;
        this.plpAdTv = textView;
        this.plpRowAddToClosetIv = imageView;
        this.plpRowAddToClosetWishcountIv = textView2;
        this.plpRowBrandTv = textView3;
        this.plpRowClosetIvAdded = imageView2;
        this.plpRowClosetIvAddedWishcount = textView4;
        this.plpRowDiscountPercentTv = textView5;
        this.plpRowDodTimerTv = textView6;
        this.plpRowDodTimerView = linearLayout4;
        this.plpRowExclusiveTv = textView7;
        this.plpRowFinalPriceTv = textView8;
        this.plpRowMrpPriceTv = textView9;
        this.plpRowOfferPriceTv = textView10;
        this.plpRowPrdNameTv = textView11;
        this.plpRowPriceView = linearLayout5;
        this.plpRowProductIv = imageView3;
        this.plpRowProductIvRoot = cardView;
        this.plpRowSimilarProductIv = imageView4;
        this.plpRowSimilarProductTv = textView12;
        this.plpRowSizeCountTv = textView13;
        this.plpRowSizeList = linearLayout6;
        this.priorityDate = textView14;
        this.saleContainer = layoutSalePriceV2Binding;
        this.sellingFastTag = textView15;
        this.tvTagAjiogram = textView16;
    }

    public static PlpProductRowViewBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.brand_layout;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (LinearLayout)view2;
        if (view3 != null && (view2 = dd2_2.a(n3 = R$id.freebie_lyt, view)) != null) {
            LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding = LayoutFreebieGetFreebiesPlpBinding.bind(view2);
            n3 = R$id.id_delivery_anim;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (LottieAnimationView)view2;
            if (object2 != null && (view2 = dd2_2.a(n3 = R$id.include_rating_view, view)) != null) {
                RatingWidgetViewBinding ratingWidgetViewBinding = RatingWidgetViewBinding.bind(view2);
                n3 = R$id.iv_tag_ajiogram;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AjioImageView)view2;
                if (object3 != null) {
                    n3 = R$id.layout_tag_ajiogram;
                    View view4 = view2 = dd2_2.a(n3, view);
                    view4 = (LinearLayout)view2;
                    if (view4 != null) {
                        n3 = R$id.ll_pd_delivery;
                        View view5 = view2 = dd2_2.a(n3, view);
                        view5 = (LinearLayout)view2;
                        if (view5 != null) {
                            n3 = R$id.plp_ad_tv;
                            View view6 = view2 = dd2_2.a(n3, view);
                            view6 = (TextView)view2;
                            if (view6 != null) {
                                n3 = R$id.plp_row_add_to_closet_iv;
                                View view7 = view2 = dd2_2.a(n3, view);
                                view7 = (ImageView)view2;
                                if (view7 != null) {
                                    n3 = R$id.plp_row_add_to_closet_wishcount_iv;
                                    View view8 = view2 = dd2_2.a(n3, view);
                                    view8 = (TextView)view2;
                                    if (view8 != null) {
                                        n3 = R$id.plp_row_brand_tv;
                                        View view9 = view2 = dd2_2.a(n3, view);
                                        view9 = (TextView)view2;
                                        if (view9 != null) {
                                            n3 = R$id.plp_row_closet_iv_added;
                                            View view10 = view2 = dd2_2.a(n3, view);
                                            view10 = (ImageView)view2;
                                            if (view10 != null) {
                                                n3 = R$id.plp_row_closet_iv_added_wishcount;
                                                View view11 = view2 = dd2_2.a(n3, view);
                                                view11 = (TextView)view2;
                                                if (view11 != null) {
                                                    n3 = R$id.plp_row_discount_percent_tv;
                                                    View view12 = view2 = dd2_2.a(n3, view);
                                                    view12 = (TextView)view2;
                                                    if (view12 != null) {
                                                        n3 = R$id.plp_row_dod_timer_tv;
                                                        View view13 = view2 = dd2_2.a(n3, view);
                                                        view13 = (TextView)view2;
                                                        if (view13 != null) {
                                                            n3 = R$id.plp_row_dod_timer_view;
                                                            View view14 = view2 = dd2_2.a(n3, view);
                                                            view14 = (LinearLayout)view2;
                                                            if (view14 != null) {
                                                                n3 = R$id.plp_row_exclusive_tv;
                                                                View view15 = view2 = dd2_2.a(n3, view);
                                                                view15 = (TextView)view2;
                                                                if (view15 != null) {
                                                                    n3 = R$id.plp_row_final_price_tv;
                                                                    View view16 = view2 = dd2_2.a(n3, view);
                                                                    view16 = (TextView)view2;
                                                                    if (view16 != null) {
                                                                        n3 = R$id.plp_row_mrp_price_tv;
                                                                        View view17 = view2 = dd2_2.a(n3, view);
                                                                        view17 = (TextView)view2;
                                                                        if (view17 != null) {
                                                                            n3 = R$id.plp_row_offer_price_tv;
                                                                            View view18 = view2 = dd2_2.a(n3, view);
                                                                            view18 = (TextView)view2;
                                                                            if (view18 != null) {
                                                                                n3 = R$id.plp_row_prd_name_tv;
                                                                                View view19 = view2 = dd2_2.a(n3, view);
                                                                                view19 = (TextView)view2;
                                                                                if (view19 != null) {
                                                                                    n3 = R$id.plp_row_price_view;
                                                                                    View view20 = view2 = dd2_2.a(n3, view);
                                                                                    view20 = (LinearLayout)view2;
                                                                                    if (view20 != null) {
                                                                                        n3 = R$id.plp_row_product_iv;
                                                                                        View view21 = view2 = dd2_2.a(n3, view);
                                                                                        view21 = (ImageView)view2;
                                                                                        if (view21 != null) {
                                                                                            n3 = R$id.plp_row_product_iv_root;
                                                                                            Object object4 = view2 = dd2_2.a(n3, view);
                                                                                            object4 = (CardView)view2;
                                                                                            if (object4 != null) {
                                                                                                n3 = R$id.plp_row_similar_product_iv;
                                                                                                View view22 = view2 = dd2_2.a(n3, view);
                                                                                                view22 = (ImageView)view2;
                                                                                                if (view22 != null) {
                                                                                                    n3 = R$id.plp_row_similar_product_tv;
                                                                                                    View view23 = view2 = dd2_2.a(n3, view);
                                                                                                    view23 = (TextView)view2;
                                                                                                    if (view23 != null) {
                                                                                                        n3 = R$id.plp_row_size_count_tv;
                                                                                                        View view24 = view2 = dd2_2.a(n3, view);
                                                                                                        view24 = (TextView)view2;
                                                                                                        if (view24 != null) {
                                                                                                            n3 = R$id.plp_row_size_list;
                                                                                                            View view25 = view2 = dd2_2.a(n3, view);
                                                                                                            view25 = (LinearLayout)view2;
                                                                                                            if (view25 != null) {
                                                                                                                n3 = R$id.priority_date;
                                                                                                                View view26 = view2 = dd2_2.a(n3, view);
                                                                                                                view26 = (TextView)view2;
                                                                                                                if (view26 != null && (view2 = dd2_2.a(n3 = R$id.sale_container, view)) != null) {
                                                                                                                    LayoutSalePriceV2Binding layoutSalePriceV2Binding = LayoutSalePriceV2Binding.bind(view2);
                                                                                                                    n3 = R$id.selling_fast_tag;
                                                                                                                    View view27 = view2 = dd2_2.a(n3, view);
                                                                                                                    view27 = (TextView)view2;
                                                                                                                    if (view27 != null) {
                                                                                                                        n3 = R$id.tv_tag_ajiogram;
                                                                                                                        View view28 = view2 = dd2_2.a(n3, view);
                                                                                                                        view28 = (TextView)view2;
                                                                                                                        if (view28 != null) {
                                                                                                                            Object object5 = view;
                                                                                                                            object5 = (ConstraintLayout)view;
                                                                                                                            PlpProductRowViewBinding plpProductRowViewBinding = new PlpProductRowViewBinding((ConstraintLayout)((Object)object5), (LinearLayout)view3, layoutFreebieGetFreebiesPlpBinding, (LottieAnimationView)((Object)object2), ratingWidgetViewBinding, (AjioImageView)((Object)object3), (LinearLayout)view4, (LinearLayout)view5, (TextView)view6, (ImageView)view7, (TextView)view8, (TextView)view9, (ImageView)view10, (TextView)view11, (TextView)view12, (TextView)view13, (LinearLayout)view14, (TextView)view15, (TextView)view16, (TextView)view17, (TextView)view18, (TextView)view19, (LinearLayout)view20, (ImageView)view21, (CardView)((Object)object4), (ImageView)view22, (TextView)view23, (TextView)view24, (LinearLayout)view25, (TextView)view26, layoutSalePriceV2Binding, (TextView)view27, (TextView)view28);
                                                                                                                            return plpProductRowViewBinding;
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

    public static PlpProductRowViewBinding inflate(LayoutInflater layoutInflater) {
        return PlpProductRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static PlpProductRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_product_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpProductRowViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

