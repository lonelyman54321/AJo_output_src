/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutFreebieGetFreebiesPlpBinding;
import com.ril.ajio.databinding.LayoutSalePriceLuxeBinding;

public final class LuxePdpSimilarToRowBinding
implements BC3 {
    public final LayoutFreebieGetFreebiesPlpBinding freebieLyt;
    public final AjioTextView luxePlpAdTv;
    public final AjioAspectRatioImageView luxePlpRowAddToClosetIv;
    public final AppCompatImageView luxePlpRowAddedToClosetIv;
    public final AjioTextView luxePlpRowBrandTv;
    public final AjioTextView luxePlpRowExclusiveTv;
    public final AjioTextView luxePlpRowPrdNameTv;
    public final RecyclerView luxePlpRowPriceRv;
    public final AjioAspectRatioImageView luxePlpRowProductRv;
    private final ConstraintLayout rootView;
    public final LayoutSalePriceLuxeBinding saleContainer;

    private LuxePdpSimilarToRowBinding(ConstraintLayout constraintLayout, LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding, AjioTextView ajioTextView, AjioAspectRatioImageView ajioAspectRatioImageView, AppCompatImageView appCompatImageView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, RecyclerView recyclerView, AjioAspectRatioImageView ajioAspectRatioImageView2, LayoutSalePriceLuxeBinding layoutSalePriceLuxeBinding) {
        this.rootView = constraintLayout;
        this.freebieLyt = layoutFreebieGetFreebiesPlpBinding;
        this.luxePlpAdTv = ajioTextView;
        this.luxePlpRowAddToClosetIv = ajioAspectRatioImageView;
        this.luxePlpRowAddedToClosetIv = appCompatImageView;
        this.luxePlpRowBrandTv = ajioTextView2;
        this.luxePlpRowExclusiveTv = ajioTextView3;
        this.luxePlpRowPrdNameTv = ajioTextView4;
        this.luxePlpRowPriceRv = recyclerView;
        this.luxePlpRowProductRv = ajioAspectRatioImageView2;
        this.saleContainer = layoutSalePriceLuxeBinding;
    }

    public static LuxePdpSimilarToRowBinding bind(View object) {
        int n3 = R$id.freebie_lyt;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding = LayoutFreebieGetFreebiesPlpBinding.bind(view);
            n3 = R$id.luxe_plp_ad_tv;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.luxe_plp_row_add_to_closet_iv;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioAspectRatioImageView)view;
                if (object3 != null) {
                    n3 = R$id.luxe_plp_row_added_to_closet_iv;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AppCompatImageView)view;
                    if (object4 != null) {
                        n3 = R$id.luxe_plp_row_brand_tv;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.luxe_plp_row_exclusive_tv;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                n3 = R$id.luxe_plp_row_prd_name_tv;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (AjioTextView)view;
                                if (object7 != null) {
                                    n3 = R$id.luxe_plp_row_price_rv;
                                    Object object8 = view = dd2_2.a(n3, object);
                                    object8 = (RecyclerView)view;
                                    if (object8 != null) {
                                        n3 = R$id.luxe_plp_row_product_rv;
                                        Object object9 = view = dd2_2.a(n3, object);
                                        object9 = (AjioAspectRatioImageView)view;
                                        if (object9 != null && (view = dd2_2.a(n3 = R$id.sale_container, object)) != null) {
                                            LayoutSalePriceLuxeBinding layoutSalePriceLuxeBinding = LayoutSalePriceLuxeBinding.bind(view);
                                            Object object10 = object;
                                            object10 = (ConstraintLayout)((Object)object);
                                            LuxePdpSimilarToRowBinding luxePdpSimilarToRowBinding = new LuxePdpSimilarToRowBinding((ConstraintLayout)((Object)object10), layoutFreebieGetFreebiesPlpBinding, (AjioTextView)object2, (AjioAspectRatioImageView)((Object)object3), (AppCompatImageView)((Object)object4), (AjioTextView)object5, (AjioTextView)object6, (AjioTextView)object7, (RecyclerView)object8, (AjioAspectRatioImageView)((Object)object9), layoutSalePriceLuxeBinding);
                                            return luxePdpSimilarToRowBinding;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxePdpSimilarToRowBinding inflate(LayoutInflater layoutInflater) {
        return LuxePdpSimilarToRowBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePdpSimilarToRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_pdp_similar_to_row;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePdpSimilarToRowBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

