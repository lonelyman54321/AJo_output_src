/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutSalePriceBinding;
import com.ril.ajio.databinding.RatingWidgetViewBinding;

public final class PdpProductWidgetBinding
implements BC3 {
    public final RatingWidgetViewBinding includeRatingView;
    public final AjioTextView plpAdTv;
    public final AjioAspectRatioImageView plpRowAddToClosetIv;
    public final AjioTextView plpRowBrandTv;
    public final AppCompatImageView plpRowClosetIvAdded;
    public final AjioTextView plpRowDiscountPercentTv;
    public final AjioTextView plpRowDodTimerTv;
    public final LinearLayout plpRowDodTimerView;
    public final AjioTextView plpRowExclusiveTv;
    public final AjioTextView plpRowFinalPriceTv;
    public final AjioTextView plpRowMrpPriceTv;
    public final AjioTextView plpRowOfferPriceTv;
    public final AjioTextView plpRowPrdNameTv;
    public final LinearLayout plpRowPriceView;
    public final AjioRoundedCornerImageView plpRowProductIv;
    public final AjioTextView plpRowSizeCountTv;
    public final LinearLayout plpRowSizeList;
    private final ConstraintLayout rootView;
    public final LayoutSalePriceBinding saleContainer;

    private PdpProductWidgetBinding(ConstraintLayout constraintLayout, RatingWidgetViewBinding ratingWidgetViewBinding, AjioTextView ajioTextView, AjioAspectRatioImageView ajioAspectRatioImageView, AjioTextView ajioTextView2, AppCompatImageView appCompatImageView, AjioTextView ajioTextView3, AjioTextView ajioTextView4, LinearLayout linearLayout, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, LinearLayout linearLayout2, AjioRoundedCornerImageView ajioRoundedCornerImageView, AjioTextView ajioTextView10, LinearLayout linearLayout3, LayoutSalePriceBinding layoutSalePriceBinding) {
        this.rootView = constraintLayout;
        this.includeRatingView = ratingWidgetViewBinding;
        this.plpAdTv = ajioTextView;
        this.plpRowAddToClosetIv = ajioAspectRatioImageView;
        this.plpRowBrandTv = ajioTextView2;
        this.plpRowClosetIvAdded = appCompatImageView;
        this.plpRowDiscountPercentTv = ajioTextView3;
        this.plpRowDodTimerTv = ajioTextView4;
        this.plpRowDodTimerView = linearLayout;
        this.plpRowExclusiveTv = ajioTextView5;
        this.plpRowFinalPriceTv = ajioTextView6;
        this.plpRowMrpPriceTv = ajioTextView7;
        this.plpRowOfferPriceTv = ajioTextView8;
        this.plpRowPrdNameTv = ajioTextView9;
        this.plpRowPriceView = linearLayout2;
        this.plpRowProductIv = ajioRoundedCornerImageView;
        this.plpRowSizeCountTv = ajioTextView10;
        this.plpRowSizeList = linearLayout3;
        this.saleContainer = layoutSalePriceBinding;
    }

    public static PdpProductWidgetBinding bind(View view) {
        Object object = view;
        int n3 = R$id.include_rating_view;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            RatingWidgetViewBinding ratingWidgetViewBinding = RatingWidgetViewBinding.bind(view2);
            n3 = R$id.plp_ad_tv;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (AjioTextView)view2;
            if (object2 != null) {
                n3 = R$id.plp_row_add_to_closet_iv;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AjioAspectRatioImageView)view2;
                if (object3 != null) {
                    n3 = R$id.plp_row_brand_tv;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.plp_row_closet_iv_added;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (AppCompatImageView)view2;
                        if (object5 != null) {
                            n3 = R$id.plp_row_discount_percent_tv;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (AjioTextView)view2;
                            if (object6 != null) {
                                n3 = R$id.plp_row_dod_timer_tv;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (AjioTextView)view2;
                                if (object7 != null) {
                                    n3 = R$id.plp_row_dod_timer_view;
                                    View view3 = view2 = dd2_2.a(n3, view);
                                    view3 = (LinearLayout)view2;
                                    if (view3 != null) {
                                        n3 = R$id.plp_row_exclusive_tv;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (AjioTextView)view2;
                                        if (object8 != null) {
                                            n3 = R$id.plp_row_final_price_tv;
                                            Object object9 = view2 = dd2_2.a(n3, view);
                                            object9 = (AjioTextView)view2;
                                            if (object9 != null) {
                                                n3 = R$id.plp_row_mrp_price_tv;
                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                object10 = (AjioTextView)view2;
                                                if (object10 != null) {
                                                    n3 = R$id.plp_row_offer_price_tv;
                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                    object11 = (AjioTextView)view2;
                                                    if (object11 != null) {
                                                        n3 = R$id.plp_row_prd_name_tv;
                                                        Object object12 = view2 = dd2_2.a(n3, view);
                                                        object12 = (AjioTextView)view2;
                                                        if (object12 != null) {
                                                            n3 = R$id.plp_row_price_view;
                                                            View view4 = view2 = dd2_2.a(n3, view);
                                                            view4 = (LinearLayout)view2;
                                                            if (view4 != null) {
                                                                n3 = R$id.plp_row_product_iv;
                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                object13 = (AjioRoundedCornerImageView)view2;
                                                                if (object13 != null) {
                                                                    n3 = R$id.plp_row_size_count_tv;
                                                                    Object object14 = view2 = dd2_2.a(n3, view);
                                                                    object14 = (AjioTextView)view2;
                                                                    if (object14 != null) {
                                                                        n3 = R$id.plp_row_size_list;
                                                                        View view5 = view2 = dd2_2.a(n3, view);
                                                                        view5 = (LinearLayout)view2;
                                                                        if (view5 != null && (view2 = dd2_2.a(n3 = R$id.sale_container, view)) != null) {
                                                                            LayoutSalePriceBinding layoutSalePriceBinding = LayoutSalePriceBinding.bind(view2);
                                                                            Object object15 = view;
                                                                            object15 = (ConstraintLayout)view;
                                                                            PdpProductWidgetBinding pdpProductWidgetBinding = new PdpProductWidgetBinding((ConstraintLayout)((Object)object15), ratingWidgetViewBinding, (AjioTextView)object2, (AjioAspectRatioImageView)((Object)object3), (AjioTextView)object4, (AppCompatImageView)((Object)object5), (AjioTextView)object6, (AjioTextView)object7, (LinearLayout)view3, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (LinearLayout)view4, (AjioRoundedCornerImageView)((Object)object13), (AjioTextView)object14, (LinearLayout)view5, layoutSalePriceBinding);
                                                                            return pdpProductWidgetBinding;
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

    public static PdpProductWidgetBinding inflate(LayoutInflater layoutInflater) {
        return PdpProductWidgetBinding.inflate(layoutInflater, null, false);
    }

    public static PdpProductWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_product_widget;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpProductWidgetBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

