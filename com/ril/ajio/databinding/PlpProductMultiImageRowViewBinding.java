/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutFreebieGetFreebiesPlpBinding;
import com.ril.ajio.databinding.LayoutSalePriceV2Binding;
import com.ril.ajio.databinding.RatingWidgetViewBinding;

public final class PlpProductMultiImageRowViewBinding
implements BC3 {
    public final LayoutFreebieGetFreebiesPlpBinding freebieLyt;
    public final LottieAnimationView idDeliveryAnim;
    public final RatingWidgetViewBinding includeRatingView;
    public final LinearLayout llPdDelivery;
    public final AjioTextView plpAdTv;
    public final AjioAspectRatioImageView plpRowAddToClosetIv;
    public final AjioTextView plpRowAddToClosetWishcountIv;
    public final AjioTextView plpRowBrandTv;
    public final AjioAspectRatioImageView plpRowClosetIvAdded;
    public final AjioTextView plpRowClosetIvAddedWishcount;
    public final AjioTextView plpRowDiscountPercentTv;
    public final AjioTextView plpRowDodTimerTv;
    public final LinearLayout plpRowDodTimerView;
    public final AjioTextView plpRowExclusiveTv;
    public final AjioTextView plpRowFinalPriceTv;
    public final AjioTextView plpRowMrpPriceTv;
    public final AjioTextView plpRowOfferPriceTv;
    public final AjioTextView plpRowPrdNameTv;
    public final LinearLayout plpRowPriceView;
    public final RecyclerView plpRowProductRv;
    public final AjioAspectRatioImageView plpRowSimilarProductIv;
    public final AjioTextView plpRowSimilarProductTv;
    public final AjioTextView plpRowSizeCountTv;
    public final LinearLayout plpRowSizeList;
    public final TextView priorityDate;
    private final ConstraintLayout rootView;
    public final LayoutSalePriceV2Binding saleContainer;
    public final AjioTextView sellingFastTag;

    private PlpProductMultiImageRowViewBinding(ConstraintLayout constraintLayout, LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding, LottieAnimationView lottieAnimationView, RatingWidgetViewBinding ratingWidgetViewBinding, LinearLayout linearLayout, AjioTextView ajioTextView, AjioAspectRatioImageView ajioAspectRatioImageView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioAspectRatioImageView ajioAspectRatioImageView2, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, LinearLayout linearLayout2, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, AjioTextView ajioTextView10, AjioTextView ajioTextView11, LinearLayout linearLayout3, RecyclerView recyclerView, AjioAspectRatioImageView ajioAspectRatioImageView3, AjioTextView ajioTextView12, AjioTextView ajioTextView13, LinearLayout linearLayout4, TextView textView, LayoutSalePriceV2Binding layoutSalePriceV2Binding, AjioTextView ajioTextView14) {
        this.rootView = constraintLayout;
        this.freebieLyt = layoutFreebieGetFreebiesPlpBinding;
        this.idDeliveryAnim = lottieAnimationView;
        this.includeRatingView = ratingWidgetViewBinding;
        this.llPdDelivery = linearLayout;
        this.plpAdTv = ajioTextView;
        this.plpRowAddToClosetIv = ajioAspectRatioImageView;
        this.plpRowAddToClosetWishcountIv = ajioTextView2;
        this.plpRowBrandTv = ajioTextView3;
        this.plpRowClosetIvAdded = ajioAspectRatioImageView2;
        this.plpRowClosetIvAddedWishcount = ajioTextView4;
        this.plpRowDiscountPercentTv = ajioTextView5;
        this.plpRowDodTimerTv = ajioTextView6;
        this.plpRowDodTimerView = linearLayout2;
        this.plpRowExclusiveTv = ajioTextView7;
        this.plpRowFinalPriceTv = ajioTextView8;
        this.plpRowMrpPriceTv = ajioTextView9;
        this.plpRowOfferPriceTv = ajioTextView10;
        this.plpRowPrdNameTv = ajioTextView11;
        this.plpRowPriceView = linearLayout3;
        this.plpRowProductRv = recyclerView;
        this.plpRowSimilarProductIv = ajioAspectRatioImageView3;
        this.plpRowSimilarProductTv = ajioTextView12;
        this.plpRowSizeCountTv = ajioTextView13;
        this.plpRowSizeList = linearLayout4;
        this.priorityDate = textView;
        this.saleContainer = layoutSalePriceV2Binding;
        this.sellingFastTag = ajioTextView14;
    }

    public static PlpProductMultiImageRowViewBinding bind(View view) {
        Object object = view;
        int n3 = R$id.freebie_lyt;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding = LayoutFreebieGetFreebiesPlpBinding.bind(view2);
            n3 = R$id.id_delivery_anim;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (LottieAnimationView)view2;
            if (object2 != null && (view2 = dd2_2.a(n3 = R$id.include_rating_view, view)) != null) {
                RatingWidgetViewBinding ratingWidgetViewBinding = RatingWidgetViewBinding.bind(view2);
                n3 = R$id.ll_pd_delivery;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (LinearLayout)view2;
                if (view3 != null) {
                    n3 = R$id.plp_ad_tv;
                    Object object3 = view2 = dd2_2.a(n3, view);
                    object3 = (AjioTextView)view2;
                    if (object3 != null) {
                        n3 = R$id.plp_row_add_to_closet_iv;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (AjioAspectRatioImageView)view2;
                        if (object4 != null) {
                            n3 = R$id.plp_row_add_to_closet_wishcount_iv;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (AjioTextView)view2;
                            if (object5 != null) {
                                n3 = R$id.plp_row_brand_tv;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (AjioTextView)view2;
                                if (object6 != null) {
                                    n3 = R$id.plp_row_closet_iv_added;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AjioAspectRatioImageView)view2;
                                    if (object7 != null) {
                                        n3 = R$id.plp_row_closet_iv_added_wishcount;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (AjioTextView)view2;
                                        if (object8 != null) {
                                            n3 = R$id.plp_row_discount_percent_tv;
                                            Object object9 = view2 = dd2_2.a(n3, view);
                                            object9 = (AjioTextView)view2;
                                            if (object9 != null) {
                                                n3 = R$id.plp_row_dod_timer_tv;
                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                object10 = (AjioTextView)view2;
                                                if (object10 != null) {
                                                    n3 = R$id.plp_row_dod_timer_view;
                                                    View view4 = view2 = dd2_2.a(n3, view);
                                                    view4 = (LinearLayout)view2;
                                                    if (view4 != null) {
                                                        n3 = R$id.plp_row_exclusive_tv;
                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                        object11 = (AjioTextView)view2;
                                                        if (object11 != null) {
                                                            n3 = R$id.plp_row_final_price_tv;
                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                            object12 = (AjioTextView)view2;
                                                            if (object12 != null) {
                                                                n3 = R$id.plp_row_mrp_price_tv;
                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                object13 = (AjioTextView)view2;
                                                                if (object13 != null) {
                                                                    n3 = R$id.plp_row_offer_price_tv;
                                                                    Object object14 = view2 = dd2_2.a(n3, view);
                                                                    object14 = (AjioTextView)view2;
                                                                    if (object14 != null) {
                                                                        n3 = R$id.plp_row_prd_name_tv;
                                                                        Object object15 = view2 = dd2_2.a(n3, view);
                                                                        object15 = (AjioTextView)view2;
                                                                        if (object15 != null) {
                                                                            n3 = R$id.plp_row_price_view;
                                                                            View view5 = view2 = dd2_2.a(n3, view);
                                                                            view5 = (LinearLayout)view2;
                                                                            if (view5 != null) {
                                                                                n3 = R$id.plp_row_product_rv;
                                                                                Object object16 = view2 = dd2_2.a(n3, view);
                                                                                object16 = (RecyclerView)view2;
                                                                                if (object16 != null) {
                                                                                    n3 = R$id.plp_row_similar_product_iv;
                                                                                    Object object17 = view2 = dd2_2.a(n3, view);
                                                                                    object17 = (AjioAspectRatioImageView)view2;
                                                                                    if (object17 != null) {
                                                                                        n3 = R$id.plp_row_similar_product_tv;
                                                                                        Object object18 = view2 = dd2_2.a(n3, view);
                                                                                        object18 = (AjioTextView)view2;
                                                                                        if (object18 != null) {
                                                                                            n3 = R$id.plp_row_size_count_tv;
                                                                                            Object object19 = view2 = dd2_2.a(n3, view);
                                                                                            object19 = (AjioTextView)view2;
                                                                                            if (object19 != null) {
                                                                                                n3 = R$id.plp_row_size_list;
                                                                                                View view6 = view2 = dd2_2.a(n3, view);
                                                                                                view6 = (LinearLayout)view2;
                                                                                                if (view6 != null) {
                                                                                                    n3 = R$id.priority_date;
                                                                                                    View view7 = view2 = dd2_2.a(n3, view);
                                                                                                    view7 = (TextView)view2;
                                                                                                    if (view7 != null && (view2 = dd2_2.a(n3 = R$id.sale_container, view)) != null) {
                                                                                                        LayoutSalePriceV2Binding layoutSalePriceV2Binding = LayoutSalePriceV2Binding.bind(view2);
                                                                                                        n3 = R$id.selling_fast_tag;
                                                                                                        Object object20 = view2 = dd2_2.a(n3, view);
                                                                                                        object20 = (AjioTextView)view2;
                                                                                                        if (object20 != null) {
                                                                                                            Object object21 = view;
                                                                                                            object21 = (ConstraintLayout)view;
                                                                                                            PlpProductMultiImageRowViewBinding plpProductMultiImageRowViewBinding = new PlpProductMultiImageRowViewBinding((ConstraintLayout)((Object)object21), layoutFreebieGetFreebiesPlpBinding, (LottieAnimationView)((Object)object2), ratingWidgetViewBinding, (LinearLayout)view3, (AjioTextView)object3, (AjioAspectRatioImageView)((Object)object4), (AjioTextView)object5, (AjioTextView)object6, (AjioAspectRatioImageView)((Object)object7), (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (LinearLayout)view4, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (AjioTextView)object14, (AjioTextView)object15, (LinearLayout)view5, (RecyclerView)object16, (AjioAspectRatioImageView)((Object)object17), (AjioTextView)object18, (AjioTextView)object19, (LinearLayout)view6, (TextView)view7, layoutSalePriceV2Binding, (AjioTextView)object20);
                                                                                                            return plpProductMultiImageRowViewBinding;
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

    public static PlpProductMultiImageRowViewBinding inflate(LayoutInflater layoutInflater) {
        return PlpProductMultiImageRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static PlpProductMultiImageRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_product_multi_image_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpProductMultiImageRowViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

