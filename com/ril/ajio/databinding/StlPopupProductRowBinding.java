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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutFreebieGetFreebiesPlpBinding;
import com.ril.ajio.databinding.LayoutSalePriceBinding;
import com.ril.ajio.databinding.RatingWidgetViewBinding;

public final class StlPopupProductRowBinding
implements BC3 {
    public final LayoutFreebieGetFreebiesPlpBinding freebieLyt;
    public final LottieAnimationView idDeliveryAnim;
    public final RatingWidgetViewBinding includeRatingView;
    public final LinearLayout llPdDelivery;
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
    public final TextView priorityDate;
    private final ConstraintLayout rootView;
    public final LayoutSalePriceBinding saleContainer;

    private StlPopupProductRowBinding(ConstraintLayout constraintLayout, LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding, LottieAnimationView lottieAnimationView, RatingWidgetViewBinding ratingWidgetViewBinding, LinearLayout linearLayout, AjioTextView ajioTextView, AjioAspectRatioImageView ajioAspectRatioImageView, AjioTextView ajioTextView2, AppCompatImageView appCompatImageView, AjioTextView ajioTextView3, AjioTextView ajioTextView4, LinearLayout linearLayout2, AjioTextView ajioTextView5, AjioTextView ajioTextView6, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9, LinearLayout linearLayout3, AjioRoundedCornerImageView ajioRoundedCornerImageView, AjioTextView ajioTextView10, LinearLayout linearLayout4, TextView textView, LayoutSalePriceBinding layoutSalePriceBinding) {
        this.rootView = constraintLayout;
        this.freebieLyt = layoutFreebieGetFreebiesPlpBinding;
        this.idDeliveryAnim = lottieAnimationView;
        this.includeRatingView = ratingWidgetViewBinding;
        this.llPdDelivery = linearLayout;
        this.plpAdTv = ajioTextView;
        this.plpRowAddToClosetIv = ajioAspectRatioImageView;
        this.plpRowBrandTv = ajioTextView2;
        this.plpRowClosetIvAdded = appCompatImageView;
        this.plpRowDiscountPercentTv = ajioTextView3;
        this.plpRowDodTimerTv = ajioTextView4;
        this.plpRowDodTimerView = linearLayout2;
        this.plpRowExclusiveTv = ajioTextView5;
        this.plpRowFinalPriceTv = ajioTextView6;
        this.plpRowMrpPriceTv = ajioTextView7;
        this.plpRowOfferPriceTv = ajioTextView8;
        this.plpRowPrdNameTv = ajioTextView9;
        this.plpRowPriceView = linearLayout3;
        this.plpRowProductIv = ajioRoundedCornerImageView;
        this.plpRowSizeCountTv = ajioTextView10;
        this.plpRowSizeList = linearLayout4;
        this.priorityDate = textView;
        this.saleContainer = layoutSalePriceBinding;
    }

    public static StlPopupProductRowBinding bind(View view) {
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
                            n3 = R$id.plp_row_brand_tv;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (AjioTextView)view2;
                            if (object5 != null) {
                                n3 = R$id.plp_row_closet_iv_added;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (AppCompatImageView)view2;
                                if (object6 != null) {
                                    n3 = R$id.plp_row_discount_percent_tv;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AjioTextView)view2;
                                    if (object7 != null) {
                                        n3 = R$id.plp_row_dod_timer_tv;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (AjioTextView)view2;
                                        if (object8 != null) {
                                            n3 = R$id.plp_row_dod_timer_view;
                                            View view4 = view2 = dd2_2.a(n3, view);
                                            view4 = (LinearLayout)view2;
                                            if (view4 != null) {
                                                n3 = R$id.plp_row_exclusive_tv;
                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                object9 = (AjioTextView)view2;
                                                if (object9 != null) {
                                                    n3 = R$id.plp_row_final_price_tv;
                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                    object10 = (AjioTextView)view2;
                                                    if (object10 != null) {
                                                        n3 = R$id.plp_row_mrp_price_tv;
                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                        object11 = (AjioTextView)view2;
                                                        if (object11 != null) {
                                                            n3 = R$id.plp_row_offer_price_tv;
                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                            object12 = (AjioTextView)view2;
                                                            if (object12 != null) {
                                                                n3 = R$id.plp_row_prd_name_tv;
                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                object13 = (AjioTextView)view2;
                                                                if (object13 != null) {
                                                                    n3 = R$id.plp_row_price_view;
                                                                    View view5 = view2 = dd2_2.a(n3, view);
                                                                    view5 = (LinearLayout)view2;
                                                                    if (view5 != null) {
                                                                        n3 = R$id.plp_row_product_iv;
                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                        object14 = (AjioRoundedCornerImageView)view2;
                                                                        if (object14 != null) {
                                                                            n3 = R$id.plp_row_size_count_tv;
                                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                                            object15 = (AjioTextView)view2;
                                                                            if (object15 != null) {
                                                                                n3 = R$id.plp_row_size_list;
                                                                                View view6 = view2 = dd2_2.a(n3, view);
                                                                                view6 = (LinearLayout)view2;
                                                                                if (view6 != null) {
                                                                                    n3 = R$id.priority_date;
                                                                                    View view7 = view2 = dd2_2.a(n3, view);
                                                                                    view7 = (TextView)view2;
                                                                                    if (view7 != null && (view2 = dd2_2.a(n3 = R$id.sale_container, view)) != null) {
                                                                                        LayoutSalePriceBinding layoutSalePriceBinding = LayoutSalePriceBinding.bind(view2);
                                                                                        Object object16 = view;
                                                                                        object16 = (ConstraintLayout)view;
                                                                                        StlPopupProductRowBinding stlPopupProductRowBinding = new StlPopupProductRowBinding((ConstraintLayout)((Object)object16), layoutFreebieGetFreebiesPlpBinding, (LottieAnimationView)((Object)object2), ratingWidgetViewBinding, (LinearLayout)view3, (AjioTextView)object3, (AjioAspectRatioImageView)((Object)object4), (AjioTextView)object5, (AppCompatImageView)((Object)object6), (AjioTextView)object7, (AjioTextView)object8, (LinearLayout)view4, (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13, (LinearLayout)view5, (AjioRoundedCornerImageView)((Object)object14), (AjioTextView)object15, (LinearLayout)view6, (TextView)view7, layoutSalePriceBinding);
                                                                                        return stlPopupProductRowBinding;
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

    public static StlPopupProductRowBinding inflate(LayoutInflater layoutInflater) {
        return StlPopupProductRowBinding.inflate(layoutInflater, null, false);
    }

    public static StlPopupProductRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.stl_popup_product_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return StlPopupProductRowBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

