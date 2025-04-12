/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioRoundedCornerImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutFreebieGetFreebiesPlpBinding;
import com.ril.ajio.databinding.LayoutSalePriceBinding;
import com.ril.ajio.databinding.LayoutSalePriceV2Binding;
import com.ril.ajio.databinding.RatingWidgetViewBinding;

public final class CommonProductItemViewBinding
implements BC3 {
    public final Barrier barrier;
    public final LinearLayout brandLayout;
    public final TextView cancelSizeTv;
    public final LinearLayout closetAddBagContainer;
    public final AppCompatImageView closetAddBagImg;
    public final ImageView closetAddBagSimImg;
    public final TextView closetAddBagTv;
    public final AjioTextView closetAddedToBag;
    public final RecyclerView closetSizeRv;
    public final ImageView deleteImg;
    public final ImageView deleteImgOOS;
    public final LinearLayout deleteOOSContainer;
    public final LayoutFreebieGetFreebiesPlpBinding freebieLyt;
    public final LottieAnimationView idDeliveryAnim;
    public final RatingWidgetViewBinding includeRatingView;
    public final AjioImageView ivTagAjiogram;
    public final LinearLayout layoutTagAjiogram;
    public final LinearLayout llPdDelivery;
    public final RecyclerView luxeClosetRowPriceRv;
    public final View oosBg;
    public final LinearLayout oosSimilarContainer;
    public final TextView oosSimilarContainerText;
    public final TextView oosTv;
    public final ImageView pllBgGrey;
    public final ImageView pllIvSelected;
    public final View pllVUnselected;
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
    public final AjioTextView plpRowPrdNameTv;
    public final RelativeLayout plpRowPriceView;
    public final ImageView plpRowProductIv;
    public final CardView plpRowProductIvRoot;
    public final RecyclerView plpRowProductRv;
    public final ImageView plpRowSimilarProductIv;
    public final TextView plpRowSimilarProductTv;
    public final TextView plpRowSizeCountTv;
    public final LinearLayout plpRowSizeList;
    public final TextView priorityDate;
    public final ConstraintLayout productInfoContainer;
    public final ConstraintLayout productParentContainer;
    public final ConstraintLayout productSizeContainer;
    public final TextView removeOOSTV;
    private final ConstraintLayout rootView;
    public final AjioRoundedCornerImageView rowStlImvPromo;
    public final LayoutSalePriceBinding saleContainer;
    public final LayoutSalePriceV2Binding saleContainerV2;
    public final TextView sellingFastTag;
    public final TextView sizeSelectTv;
    public final TextView sizeUnitTv;
    public final TextView tvTagAjiogram;

    private CommonProductItemViewBinding(ConstraintLayout constraintLayout, Barrier barrier, LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, AppCompatImageView appCompatImageView, ImageView imageView, TextView textView2, AjioTextView ajioTextView, RecyclerView recyclerView, ImageView imageView2, ImageView imageView3, LinearLayout linearLayout3, LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding, LottieAnimationView lottieAnimationView, RatingWidgetViewBinding ratingWidgetViewBinding, AjioImageView ajioImageView, LinearLayout linearLayout4, LinearLayout linearLayout5, RecyclerView recyclerView2, View view, LinearLayout linearLayout6, TextView textView3, TextView textView4, ImageView imageView4, ImageView imageView5, View view2, TextView textView5, ImageView imageView6, TextView textView6, TextView textView7, ImageView imageView7, TextView textView8, TextView textView9, TextView textView10, LinearLayout linearLayout7, TextView textView11, TextView textView12, TextView textView13, TextView textView14, AjioTextView ajioTextView2, RelativeLayout relativeLayout, ImageView imageView8, CardView cardView, RecyclerView recyclerView3, ImageView imageView9, TextView textView15, TextView textView16, LinearLayout linearLayout8, TextView textView17, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, TextView textView18, AjioRoundedCornerImageView ajioRoundedCornerImageView, LayoutSalePriceBinding layoutSalePriceBinding, LayoutSalePriceV2Binding layoutSalePriceV2Binding, TextView textView19, TextView textView20, TextView textView21, TextView textView22) {
        this.rootView = constraintLayout;
        this.barrier = barrier;
        this.brandLayout = linearLayout;
        this.cancelSizeTv = textView;
        this.closetAddBagContainer = linearLayout2;
        this.closetAddBagImg = appCompatImageView;
        this.closetAddBagSimImg = imageView;
        this.closetAddBagTv = textView2;
        this.closetAddedToBag = ajioTextView;
        this.closetSizeRv = recyclerView;
        this.deleteImg = imageView2;
        this.deleteImgOOS = imageView3;
        this.deleteOOSContainer = linearLayout3;
        this.freebieLyt = layoutFreebieGetFreebiesPlpBinding;
        this.idDeliveryAnim = lottieAnimationView;
        this.includeRatingView = ratingWidgetViewBinding;
        this.ivTagAjiogram = ajioImageView;
        this.layoutTagAjiogram = linearLayout4;
        this.llPdDelivery = linearLayout5;
        this.luxeClosetRowPriceRv = recyclerView2;
        this.oosBg = view;
        this.oosSimilarContainer = linearLayout6;
        this.oosSimilarContainerText = textView3;
        this.oosTv = textView4;
        this.pllBgGrey = imageView4;
        this.pllIvSelected = imageView5;
        this.pllVUnselected = view2;
        this.plpAdTv = textView5;
        this.plpRowAddToClosetIv = imageView6;
        this.plpRowAddToClosetWishcountIv = textView6;
        this.plpRowBrandTv = textView7;
        this.plpRowClosetIvAdded = imageView7;
        this.plpRowClosetIvAddedWishcount = textView8;
        this.plpRowDiscountPercentTv = textView9;
        this.plpRowDodTimerTv = textView10;
        this.plpRowDodTimerView = linearLayout7;
        this.plpRowExclusiveTv = textView11;
        this.plpRowFinalPriceTv = textView12;
        this.plpRowMrpPriceTv = textView13;
        this.plpRowOfferPriceTv = textView14;
        this.plpRowPrdNameTv = ajioTextView2;
        this.plpRowPriceView = relativeLayout;
        this.plpRowProductIv = imageView8;
        this.plpRowProductIvRoot = cardView;
        this.plpRowProductRv = recyclerView3;
        this.plpRowSimilarProductIv = imageView9;
        this.plpRowSimilarProductTv = textView15;
        this.plpRowSizeCountTv = textView16;
        this.plpRowSizeList = linearLayout8;
        this.priorityDate = textView17;
        this.productInfoContainer = constraintLayout2;
        this.productParentContainer = constraintLayout3;
        this.productSizeContainer = constraintLayout4;
        this.removeOOSTV = textView18;
        this.rowStlImvPromo = ajioRoundedCornerImageView;
        this.saleContainer = layoutSalePriceBinding;
        this.saleContainerV2 = layoutSalePriceV2Binding;
        this.sellingFastTag = textView19;
        this.sizeSelectTv = textView20;
        this.sizeUnitTv = textView21;
        this.tvTagAjiogram = textView22;
    }

    public static CommonProductItemViewBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.barrier;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (Barrier)view2;
        if (view3 != null) {
            n3 = R$id.brand_layout;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (LinearLayout)view2;
            if (view4 != null) {
                n3 = R$id.cancelSizeTv;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (TextView)view2;
                if (view5 != null) {
                    n3 = R$id.closetAddBagContainer;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (LinearLayout)view2;
                    if (view6 != null) {
                        n3 = R$id.closetAddBagImg;
                        Object object2 = view2 = dd2_2.a(n3, view);
                        object2 = (AppCompatImageView)view2;
                        if (object2 != null) {
                            n3 = R$id.closetAddBagSimImg;
                            View view7 = view2 = dd2_2.a(n3, view);
                            view7 = (ImageView)view2;
                            if (view7 != null) {
                                n3 = R$id.closetAddBagTv;
                                View view8 = view2 = dd2_2.a(n3, view);
                                view8 = (TextView)view2;
                                if (view8 != null) {
                                    n3 = R$id.closetAddedToBag;
                                    Object object3 = view2 = dd2_2.a(n3, view);
                                    object3 = (AjioTextView)view2;
                                    if (object3 != null) {
                                        n3 = R$id.closetSizeRv;
                                        Object object4 = view2 = dd2_2.a(n3, view);
                                        object4 = (RecyclerView)view2;
                                        if (object4 != null) {
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
                                                    if (view11 != null && (view2 = dd2_2.a(n3 = R$id.freebie_lyt, view)) != null) {
                                                        LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding = LayoutFreebieGetFreebiesPlpBinding.bind(view2);
                                                        n3 = R$id.id_delivery_anim;
                                                        Object object5 = view2 = dd2_2.a(n3, view);
                                                        object5 = (LottieAnimationView)view2;
                                                        if (object5 != null && (view2 = dd2_2.a(n3 = R$id.include_rating_view, view)) != null) {
                                                            RatingWidgetViewBinding ratingWidgetViewBinding = RatingWidgetViewBinding.bind(view2);
                                                            n3 = R$id.iv_tag_ajiogram;
                                                            Object object6 = view2 = dd2_2.a(n3, view);
                                                            object6 = (AjioImageView)view2;
                                                            if (object6 != null) {
                                                                n3 = R$id.layout_tag_ajiogram;
                                                                View view12 = view2 = dd2_2.a(n3, view);
                                                                view12 = (LinearLayout)view2;
                                                                if (view12 != null) {
                                                                    n3 = R$id.ll_pd_delivery;
                                                                    View view13 = view2 = dd2_2.a(n3, view);
                                                                    view13 = (LinearLayout)view2;
                                                                    if (view13 != null) {
                                                                        View view14;
                                                                        n3 = R$id.luxe_closet_row_price_rv;
                                                                        Object object7 = view2 = dd2_2.a(n3, view);
                                                                        object7 = (RecyclerView)view2;
                                                                        if (object7 != null && (view14 = dd2_2.a(n3 = R$id.oosBg, view)) != null) {
                                                                            n3 = R$id.oosSimilarContainer;
                                                                            View view15 = view2 = dd2_2.a(n3, view);
                                                                            view15 = (LinearLayout)view2;
                                                                            if (view15 != null) {
                                                                                n3 = R$id.oosSimilarContainerText;
                                                                                View view16 = view2 = dd2_2.a(n3, view);
                                                                                view16 = (TextView)view2;
                                                                                if (view16 != null) {
                                                                                    n3 = R$id.oosTv;
                                                                                    View view17 = view2 = dd2_2.a(n3, view);
                                                                                    view17 = (TextView)view2;
                                                                                    if (view17 != null) {
                                                                                        n3 = R$id.pllBgGrey;
                                                                                        View view18 = view2 = dd2_2.a(n3, view);
                                                                                        view18 = (ImageView)view2;
                                                                                        if (view18 != null) {
                                                                                            View view19;
                                                                                            n3 = R$id.pllIvSelected;
                                                                                            View view20 = view2 = dd2_2.a(n3, view);
                                                                                            view20 = (ImageView)view2;
                                                                                            if (view20 != null && (view19 = dd2_2.a(n3 = R$id.pllVUnselected, view)) != null) {
                                                                                                n3 = R$id.plp_ad_tv;
                                                                                                View view21 = view2 = dd2_2.a(n3, view);
                                                                                                view21 = (TextView)view2;
                                                                                                if (view21 != null) {
                                                                                                    n3 = R$id.plp_row_add_to_closet_iv;
                                                                                                    View view22 = view2 = dd2_2.a(n3, view);
                                                                                                    view22 = (ImageView)view2;
                                                                                                    if (view22 != null) {
                                                                                                        n3 = R$id.plp_row_add_to_closet_wishcount_iv;
                                                                                                        View view23 = view2 = dd2_2.a(n3, view);
                                                                                                        view23 = (TextView)view2;
                                                                                                        if (view23 != null) {
                                                                                                            n3 = R$id.plp_row_brand_tv;
                                                                                                            View view24 = view2 = dd2_2.a(n3, view);
                                                                                                            view24 = (TextView)view2;
                                                                                                            if (view24 != null) {
                                                                                                                n3 = R$id.plp_row_closet_iv_added;
                                                                                                                View view25 = view2 = dd2_2.a(n3, view);
                                                                                                                view25 = (ImageView)view2;
                                                                                                                if (view25 != null) {
                                                                                                                    n3 = R$id.plp_row_closet_iv_added_wishcount;
                                                                                                                    View view26 = view2 = dd2_2.a(n3, view);
                                                                                                                    view26 = (TextView)view2;
                                                                                                                    if (view26 != null) {
                                                                                                                        n3 = R$id.plp_row_discount_percent_tv;
                                                                                                                        View view27 = view2 = dd2_2.a(n3, view);
                                                                                                                        view27 = (TextView)view2;
                                                                                                                        if (view27 != null) {
                                                                                                                            n3 = R$id.plp_row_dod_timer_tv;
                                                                                                                            View view28 = view2 = dd2_2.a(n3, view);
                                                                                                                            view28 = (TextView)view2;
                                                                                                                            if (view28 != null) {
                                                                                                                                n3 = R$id.plp_row_dod_timer_view;
                                                                                                                                View view29 = view2 = dd2_2.a(n3, view);
                                                                                                                                view29 = (LinearLayout)view2;
                                                                                                                                if (view29 != null) {
                                                                                                                                    n3 = R$id.plp_row_exclusive_tv;
                                                                                                                                    View view30 = view2 = dd2_2.a(n3, view);
                                                                                                                                    view30 = (TextView)view2;
                                                                                                                                    if (view30 != null) {
                                                                                                                                        n3 = R$id.plp_row_final_price_tv;
                                                                                                                                        View view31 = view2 = dd2_2.a(n3, view);
                                                                                                                                        view31 = (TextView)view2;
                                                                                                                                        if (view31 != null) {
                                                                                                                                            n3 = R$id.plp_row_mrp_price_tv;
                                                                                                                                            View view32 = view2 = dd2_2.a(n3, view);
                                                                                                                                            view32 = (TextView)view2;
                                                                                                                                            if (view32 != null) {
                                                                                                                                                n3 = R$id.plp_row_offer_price_tv;
                                                                                                                                                View view33 = view2 = dd2_2.a(n3, view);
                                                                                                                                                view33 = (TextView)view2;
                                                                                                                                                if (view33 != null) {
                                                                                                                                                    n3 = R$id.plp_row_prd_name_tv;
                                                                                                                                                    Object object8 = view2 = dd2_2.a(n3, view);
                                                                                                                                                    object8 = (AjioTextView)view2;
                                                                                                                                                    if (object8 != null) {
                                                                                                                                                        n3 = R$id.plp_row_price_view;
                                                                                                                                                        View view34 = view2 = dd2_2.a(n3, view);
                                                                                                                                                        view34 = (RelativeLayout)view2;
                                                                                                                                                        if (view34 != null) {
                                                                                                                                                            n3 = R$id.plp_row_product_iv;
                                                                                                                                                            View view35 = view2 = dd2_2.a(n3, view);
                                                                                                                                                            view35 = (ImageView)view2;
                                                                                                                                                            if (view35 != null) {
                                                                                                                                                                n3 = R$id.plp_row_product_iv_root;
                                                                                                                                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                object9 = (CardView)view2;
                                                                                                                                                                if (object9 != null) {
                                                                                                                                                                    n3 = R$id.plp_row_product_rv;
                                                                                                                                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                    object10 = (RecyclerView)view2;
                                                                                                                                                                    if (object10 != null) {
                                                                                                                                                                        n3 = R$id.plp_row_similar_product_iv;
                                                                                                                                                                        View view36 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                        view36 = (ImageView)view2;
                                                                                                                                                                        if (view36 != null) {
                                                                                                                                                                            n3 = R$id.plp_row_similar_product_tv;
                                                                                                                                                                            View view37 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                            view37 = (TextView)view2;
                                                                                                                                                                            if (view37 != null) {
                                                                                                                                                                                n3 = R$id.plp_row_size_count_tv;
                                                                                                                                                                                View view38 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                view38 = (TextView)view2;
                                                                                                                                                                                if (view38 != null) {
                                                                                                                                                                                    n3 = R$id.plp_row_size_list;
                                                                                                                                                                                    View view39 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                    view39 = (LinearLayout)view2;
                                                                                                                                                                                    if (view39 != null) {
                                                                                                                                                                                        n3 = R$id.priority_date;
                                                                                                                                                                                        View view40 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                        view40 = (TextView)view2;
                                                                                                                                                                                        if (view40 != null) {
                                                                                                                                                                                            n3 = R$id.productInfoContainer;
                                                                                                                                                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                            object11 = (ConstraintLayout)view2;
                                                                                                                                                                                            if (object11 != null) {
                                                                                                                                                                                                Object object12 = view;
                                                                                                                                                                                                object12 = (ConstraintLayout)view;
                                                                                                                                                                                                n3 = R$id.productSizeContainer;
                                                                                                                                                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                                object13 = (ConstraintLayout)view2;
                                                                                                                                                                                                if (object13 != null) {
                                                                                                                                                                                                    n3 = R$id.removeOOSTV;
                                                                                                                                                                                                    View view41 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                                    view41 = (TextView)view2;
                                                                                                                                                                                                    if (view41 != null) {
                                                                                                                                                                                                        n3 = R$id.row_stl_imv_promo;
                                                                                                                                                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                                        object14 = (AjioRoundedCornerImageView)view2;
                                                                                                                                                                                                        if (object14 != null && (view2 = dd2_2.a(n3 = R$id.sale_container, view)) != null) {
                                                                                                                                                                                                            LayoutSalePriceBinding layoutSalePriceBinding = LayoutSalePriceBinding.bind(view2);
                                                                                                                                                                                                            n3 = R$id.sale_container_v2;
                                                                                                                                                                                                            view2 = dd2_2.a(n3, view);
                                                                                                                                                                                                            if (view2 != null) {
                                                                                                                                                                                                                LayoutSalePriceV2Binding layoutSalePriceV2Binding = LayoutSalePriceV2Binding.bind(view2);
                                                                                                                                                                                                                n3 = R$id.selling_fast_tag;
                                                                                                                                                                                                                View view42 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                                                view42 = (TextView)view2;
                                                                                                                                                                                                                if (view42 != null) {
                                                                                                                                                                                                                    n3 = R$id.sizeSelectTv;
                                                                                                                                                                                                                    View view43 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                                                    view43 = (TextView)view2;
                                                                                                                                                                                                                    if (view43 != null) {
                                                                                                                                                                                                                        n3 = R$id.size_unit_tv;
                                                                                                                                                                                                                        View view44 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                                                        view44 = (TextView)view2;
                                                                                                                                                                                                                        if (view44 != null) {
                                                                                                                                                                                                                            n3 = R$id.tv_tag_ajiogram;
                                                                                                                                                                                                                            View view45 = view2 = dd2_2.a(n3, view);
                                                                                                                                                                                                                            view45 = (TextView)view2;
                                                                                                                                                                                                                            if (view45 != null) {
                                                                                                                                                                                                                                object = new CommonProductItemViewBinding((ConstraintLayout)((Object)object12), (Barrier)view3, (LinearLayout)view4, (TextView)view5, (LinearLayout)view6, (AppCompatImageView)((Object)object2), (ImageView)view7, (TextView)view8, (AjioTextView)object3, (RecyclerView)object4, (ImageView)view9, (ImageView)view10, (LinearLayout)view11, layoutFreebieGetFreebiesPlpBinding, (LottieAnimationView)((Object)object5), ratingWidgetViewBinding, (AjioImageView)((Object)object6), (LinearLayout)view12, (LinearLayout)view13, (RecyclerView)object7, view14, (LinearLayout)view15, (TextView)view16, (TextView)view17, (ImageView)view18, (ImageView)view20, view19, (TextView)view21, (ImageView)view22, (TextView)view23, (TextView)view24, (ImageView)view25, (TextView)view26, (TextView)view27, (TextView)view28, (LinearLayout)view29, (TextView)view30, (TextView)view31, (TextView)view32, (TextView)view33, (AjioTextView)object8, (RelativeLayout)view34, (ImageView)view35, (CardView)((Object)object9), (RecyclerView)object10, (ImageView)view36, (TextView)view37, (TextView)view38, (LinearLayout)view39, (TextView)view40, (ConstraintLayout)((Object)object11), (ConstraintLayout)((Object)object12), (ConstraintLayout)((Object)object13), (TextView)view41, (AjioRoundedCornerImageView)((Object)object14), layoutSalePriceBinding, layoutSalePriceV2Binding, (TextView)view42, (TextView)view43, (TextView)view44, (TextView)view45);
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
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CommonProductItemViewBinding inflate(LayoutInflater layoutInflater) {
        return CommonProductItemViewBinding.inflate(layoutInflater, null, false);
    }

    public static CommonProductItemViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.common_product_item_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CommonProductItemViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

