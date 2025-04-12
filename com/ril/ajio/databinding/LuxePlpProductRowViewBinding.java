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
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutFreebieGetFreebiesPlpBinding;
import com.ril.ajio.databinding.LayoutSalePriceLuxeV2Binding;

public final class LuxePlpProductRowViewBinding
implements BC3 {
    public final LayoutFreebieGetFreebiesPlpBinding freebieLyt;
    public final LottieAnimationView idDeliveryAnim;
    public final LinearLayout llPdDelivery;
    public final AjioTextView luxePlpAdTv;
    public final AjioAspectRatioImageView luxePlpRowAddToClosetIv;
    public final AjioTextView luxePlpRowAddToClosetWishlistcountIv;
    public final AppCompatImageView luxePlpRowAddedToClosetIv;
    public final AjioTextView luxePlpRowAddedToClosetWishcountIv;
    public final AjioTextView luxePlpRowBrandTv;
    public final AjioTextView luxePlpRowExclusiveTv;
    public final AjioTextView luxePlpRowPrdNameTv;
    public final RecyclerView luxePlpRowPriceRv;
    public final AjioAspectRatioImageView luxePlpRowProductRv;
    public final TextView priorityDate;
    private final ConstraintLayout rootView;
    public final LayoutSalePriceLuxeV2Binding saleContainer;
    public final AjioTextView sellingFastTag;

    private LuxePlpProductRowViewBinding(ConstraintLayout constraintLayout, LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding, LottieAnimationView lottieAnimationView, LinearLayout linearLayout, AjioTextView ajioTextView, AjioAspectRatioImageView ajioAspectRatioImageView, AjioTextView ajioTextView2, AppCompatImageView appCompatImageView, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, RecyclerView recyclerView, AjioAspectRatioImageView ajioAspectRatioImageView2, TextView textView, LayoutSalePriceLuxeV2Binding layoutSalePriceLuxeV2Binding, AjioTextView ajioTextView7) {
        this.rootView = constraintLayout;
        this.freebieLyt = layoutFreebieGetFreebiesPlpBinding;
        this.idDeliveryAnim = lottieAnimationView;
        this.llPdDelivery = linearLayout;
        this.luxePlpAdTv = ajioTextView;
        this.luxePlpRowAddToClosetIv = ajioAspectRatioImageView;
        this.luxePlpRowAddToClosetWishlistcountIv = ajioTextView2;
        this.luxePlpRowAddedToClosetIv = appCompatImageView;
        this.luxePlpRowAddedToClosetWishcountIv = ajioTextView3;
        this.luxePlpRowBrandTv = ajioTextView4;
        this.luxePlpRowExclusiveTv = ajioTextView5;
        this.luxePlpRowPrdNameTv = ajioTextView6;
        this.luxePlpRowPriceRv = recyclerView;
        this.luxePlpRowProductRv = ajioAspectRatioImageView2;
        this.priorityDate = textView;
        this.saleContainer = layoutSalePriceLuxeV2Binding;
        this.sellingFastTag = ajioTextView7;
    }

    public static LuxePlpProductRowViewBinding bind(View view) {
        Object object = view;
        int n3 = R$id.freebie_lyt;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding = LayoutFreebieGetFreebiesPlpBinding.bind(view2);
            n3 = R$id.id_delivery_anim;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (LottieAnimationView)view2;
            if (object2 != null) {
                n3 = R$id.ll_pd_delivery;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (LinearLayout)view2;
                if (view3 != null) {
                    n3 = R$id.luxe_plp_ad_tv;
                    Object object3 = view2 = dd2_2.a(n3, view);
                    object3 = (AjioTextView)view2;
                    if (object3 != null) {
                        n3 = R$id.luxe_plp_row_add_to_closet_iv;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (AjioAspectRatioImageView)view2;
                        if (object4 != null) {
                            n3 = R$id.luxe_plp_row_add_to_closet_wishlistcount_iv;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (AjioTextView)view2;
                            if (object5 != null) {
                                n3 = R$id.luxe_plp_row_added_to_closet_iv;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (AppCompatImageView)view2;
                                if (object6 != null) {
                                    n3 = R$id.luxe_plp_row_added_to_closet_wishcount_iv;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AjioTextView)view2;
                                    if (object7 != null) {
                                        n3 = R$id.luxe_plp_row_brand_tv;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (AjioTextView)view2;
                                        if (object8 != null) {
                                            n3 = R$id.luxe_plp_row_exclusive_tv;
                                            Object object9 = view2 = dd2_2.a(n3, view);
                                            object9 = (AjioTextView)view2;
                                            if (object9 != null) {
                                                n3 = R$id.luxe_plp_row_prd_name_tv;
                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                object10 = (AjioTextView)view2;
                                                if (object10 != null) {
                                                    n3 = R$id.luxe_plp_row_price_rv;
                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                    object11 = (RecyclerView)view2;
                                                    if (object11 != null) {
                                                        n3 = R$id.luxe_plp_row_product_rv;
                                                        Object object12 = view2 = dd2_2.a(n3, view);
                                                        object12 = (AjioAspectRatioImageView)view2;
                                                        if (object12 != null) {
                                                            n3 = R$id.priority_date;
                                                            View view4 = view2 = dd2_2.a(n3, view);
                                                            view4 = (TextView)view2;
                                                            if (view4 != null && (view2 = dd2_2.a(n3 = R$id.sale_container, view)) != null) {
                                                                LayoutSalePriceLuxeV2Binding layoutSalePriceLuxeV2Binding = LayoutSalePriceLuxeV2Binding.bind(view2);
                                                                n3 = R$id.selling_fast_tag;
                                                                Object object13 = view2 = dd2_2.a(n3, view);
                                                                object13 = (AjioTextView)view2;
                                                                if (object13 != null) {
                                                                    Object object14 = view;
                                                                    object14 = (ConstraintLayout)view;
                                                                    LuxePlpProductRowViewBinding luxePlpProductRowViewBinding = new LuxePlpProductRowViewBinding((ConstraintLayout)((Object)object14), layoutFreebieGetFreebiesPlpBinding, (LottieAnimationView)((Object)object2), (LinearLayout)view3, (AjioTextView)object3, (AjioAspectRatioImageView)((Object)object4), (AjioTextView)object5, (AppCompatImageView)((Object)object6), (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioTextView)object10, (RecyclerView)object11, (AjioAspectRatioImageView)((Object)object12), (TextView)view4, layoutSalePriceLuxeV2Binding, (AjioTextView)object13);
                                                                    return luxePlpProductRowViewBinding;
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

    public static LuxePlpProductRowViewBinding inflate(LayoutInflater layoutInflater) {
        return LuxePlpProductRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePlpProductRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_plp_product_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePlpProductRowViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

