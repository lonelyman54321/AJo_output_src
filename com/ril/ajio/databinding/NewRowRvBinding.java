/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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

public final class NewRowRvBinding
implements BC3 {
    public final AjioAspectRatioImageView addToClosetIv;
    public final AjioRoundedCornerImageView capsuleImage;
    public final AjioTextView capsuleItemBrandName;
    public final AjioTextView capsuleItemOldPrice;
    public final AjioTextView capsuleItemPrice;
    public final AjioTextView capsuleItemProductName;
    public final AppCompatImageView closetIvAdded;
    public final LayoutFreebieGetFreebiesPlpBinding freebieLyt;
    public final LottieAnimationView idDeliveryAnim;
    public final RatingWidgetViewBinding includeRatingView;
    public final LinearLayout llPdDelivery;
    public final AjioTextView plpRowDiscountPercentTv;
    public final AjioTextView plpRowOfferPriceTv;
    public final RelativeLayout pricelayout;
    public final TextView priorityDate;
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowShopTheLook;
    public final AjioRoundedCornerImageView rowStlImvPromo;
    public final LayoutSalePriceBinding saleContainer;

    private NewRowRvBinding(ConstraintLayout constraintLayout, AjioAspectRatioImageView ajioAspectRatioImageView, AjioRoundedCornerImageView ajioRoundedCornerImageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AppCompatImageView appCompatImageView, LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding, LottieAnimationView lottieAnimationView, RatingWidgetViewBinding ratingWidgetViewBinding, LinearLayout linearLayout, AjioTextView ajioTextView5, AjioTextView ajioTextView6, RelativeLayout relativeLayout, TextView textView, ConstraintLayout constraintLayout2, AjioRoundedCornerImageView ajioRoundedCornerImageView2, LayoutSalePriceBinding layoutSalePriceBinding) {
        this.rootView = constraintLayout;
        this.addToClosetIv = ajioAspectRatioImageView;
        this.capsuleImage = ajioRoundedCornerImageView;
        this.capsuleItemBrandName = ajioTextView;
        this.capsuleItemOldPrice = ajioTextView2;
        this.capsuleItemPrice = ajioTextView3;
        this.capsuleItemProductName = ajioTextView4;
        this.closetIvAdded = appCompatImageView;
        this.freebieLyt = layoutFreebieGetFreebiesPlpBinding;
        this.idDeliveryAnim = lottieAnimationView;
        this.includeRatingView = ratingWidgetViewBinding;
        this.llPdDelivery = linearLayout;
        this.plpRowDiscountPercentTv = ajioTextView5;
        this.plpRowOfferPriceTv = ajioTextView6;
        this.pricelayout = relativeLayout;
        this.priorityDate = textView;
        this.rowShopTheLook = constraintLayout2;
        this.rowStlImvPromo = ajioRoundedCornerImageView2;
        this.saleContainer = layoutSalePriceBinding;
    }

    public static NewRowRvBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.add_to_closet_iv;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioAspectRatioImageView)view2;
        if (object2 != null) {
            n3 = R$id.capsule_image;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioRoundedCornerImageView)view2;
            if (object3 != null) {
                n3 = R$id.capsule_item_brand_name;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioTextView)view2;
                if (object4 != null) {
                    n3 = R$id.capsule_item_old_price;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (AjioTextView)view2;
                    if (object5 != null) {
                        n3 = R$id.capsule_item_price;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (AjioTextView)view2;
                        if (object6 != null) {
                            n3 = R$id.capsule_item_product_name;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (AjioTextView)view2;
                            if (object7 != null) {
                                n3 = R$id.closet_iv_added;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (AppCompatImageView)view2;
                                if (object8 != null && (view2 = dd2_2.a(n3 = R$id.freebie_lyt, view)) != null) {
                                    LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding = LayoutFreebieGetFreebiesPlpBinding.bind(view2);
                                    n3 = R$id.id_delivery_anim;
                                    Object object9 = view2 = dd2_2.a(n3, view);
                                    object9 = (LottieAnimationView)view2;
                                    if (object9 != null && (view2 = dd2_2.a(n3 = R$id.include_rating_view, view)) != null) {
                                        RatingWidgetViewBinding ratingWidgetViewBinding = RatingWidgetViewBinding.bind(view2);
                                        n3 = R$id.ll_pd_delivery;
                                        View view3 = view2 = dd2_2.a(n3, view);
                                        view3 = (LinearLayout)view2;
                                        if (view3 != null) {
                                            n3 = R$id.plp_row_discount_percent_tv;
                                            Object object10 = view2 = dd2_2.a(n3, view);
                                            object10 = (AjioTextView)view2;
                                            if (object10 != null) {
                                                n3 = R$id.plp_row_offer_price_tv;
                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                object11 = (AjioTextView)view2;
                                                if (object11 != null) {
                                                    n3 = R$id.pricelayout;
                                                    View view4 = view2 = dd2_2.a(n3, view);
                                                    view4 = (RelativeLayout)view2;
                                                    if (view4 != null) {
                                                        n3 = R$id.priority_date;
                                                        View view5 = view2 = dd2_2.a(n3, view);
                                                        view5 = (TextView)view2;
                                                        if (view5 != null) {
                                                            Object object12 = view;
                                                            object12 = (ConstraintLayout)view;
                                                            n3 = R$id.row_stl_imv_promo;
                                                            Object object13 = view2 = dd2_2.a(n3, view);
                                                            object13 = (AjioRoundedCornerImageView)view2;
                                                            if (object13 != null && (view2 = dd2_2.a(n3 = R$id.sale_container, view)) != null) {
                                                                LayoutSalePriceBinding layoutSalePriceBinding = LayoutSalePriceBinding.bind(view2);
                                                                object = new NewRowRvBinding((ConstraintLayout)((Object)object12), (AjioAspectRatioImageView)((Object)object2), (AjioRoundedCornerImageView)((Object)object3), (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (AppCompatImageView)((Object)object8), layoutFreebieGetFreebiesPlpBinding, (LottieAnimationView)((Object)object9), ratingWidgetViewBinding, (LinearLayout)view3, (AjioTextView)object10, (AjioTextView)object11, (RelativeLayout)view4, (TextView)view5, (ConstraintLayout)((Object)object12), (AjioRoundedCornerImageView)((Object)object13), layoutSalePriceBinding);
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
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewRowRvBinding inflate(LayoutInflater layoutInflater) {
        return NewRowRvBinding.inflate(layoutInflater, null, false);
    }

    public static NewRowRvBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_row_rv;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewRowRvBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

