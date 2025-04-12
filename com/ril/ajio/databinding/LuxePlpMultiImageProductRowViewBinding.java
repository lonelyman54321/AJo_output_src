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
import com.ril.ajio.databinding.LayoutSalePriceLuxeV2Binding;

public final class LuxePlpMultiImageProductRowViewBinding
implements BC3 {
    public final LayoutFreebieGetFreebiesPlpBinding freebieLyt;
    public final AjioTextView luxePlpAdTv;
    public final AjioAspectRatioImageView luxePlpRowAddToClosetIv;
    public final AjioTextView luxePlpRowAddToClosetWishlistcountIv;
    public final AppCompatImageView luxePlpRowAddedToClosetIv;
    public final AjioTextView luxePlpRowAddedToClosetWishcountIv;
    public final AjioTextView luxePlpRowBrandTv;
    public final AjioTextView luxePlpRowExclusiveTv;
    public final AjioTextView luxePlpRowPrdNameTv;
    public final RecyclerView luxePlpRowPriceRv;
    public final RecyclerView luxePlpRowProductRecycler;
    private final ConstraintLayout rootView;
    public final LayoutSalePriceLuxeV2Binding saleContainer;
    public final AjioTextView sellingFastTag;

    private LuxePlpMultiImageProductRowViewBinding(ConstraintLayout constraintLayout, LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding, AjioTextView ajioTextView, AjioAspectRatioImageView ajioAspectRatioImageView, AjioTextView ajioTextView2, AppCompatImageView appCompatImageView, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, RecyclerView recyclerView, RecyclerView recyclerView2, LayoutSalePriceLuxeV2Binding layoutSalePriceLuxeV2Binding, AjioTextView ajioTextView7) {
        this.rootView = constraintLayout;
        this.freebieLyt = layoutFreebieGetFreebiesPlpBinding;
        this.luxePlpAdTv = ajioTextView;
        this.luxePlpRowAddToClosetIv = ajioAspectRatioImageView;
        this.luxePlpRowAddToClosetWishlistcountIv = ajioTextView2;
        this.luxePlpRowAddedToClosetIv = appCompatImageView;
        this.luxePlpRowAddedToClosetWishcountIv = ajioTextView3;
        this.luxePlpRowBrandTv = ajioTextView4;
        this.luxePlpRowExclusiveTv = ajioTextView5;
        this.luxePlpRowPrdNameTv = ajioTextView6;
        this.luxePlpRowPriceRv = recyclerView;
        this.luxePlpRowProductRecycler = recyclerView2;
        this.saleContainer = layoutSalePriceLuxeV2Binding;
        this.sellingFastTag = ajioTextView7;
    }

    public static LuxePlpMultiImageProductRowViewBinding bind(View view) {
        Object object = view;
        int n3 = R$id.freebie_lyt;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding = LayoutFreebieGetFreebiesPlpBinding.bind(view2);
            n3 = R$id.luxe_plp_ad_tv;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (AjioTextView)view2;
            if (object2 != null) {
                n3 = R$id.luxe_plp_row_add_to_closet_iv;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AjioAspectRatioImageView)view2;
                if (object3 != null) {
                    n3 = R$id.luxe_plp_row_add_to_closet_wishlistcount_iv;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.luxe_plp_row_added_to_closet_iv;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (AppCompatImageView)view2;
                        if (object5 != null) {
                            n3 = R$id.luxe_plp_row_added_to_closet_wishcount_iv;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (AjioTextView)view2;
                            if (object6 != null) {
                                n3 = R$id.luxe_plp_row_brand_tv;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (AjioTextView)view2;
                                if (object7 != null) {
                                    n3 = R$id.luxe_plp_row_exclusive_tv;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (AjioTextView)view2;
                                    if (object8 != null) {
                                        n3 = R$id.luxe_plp_row_prd_name_tv;
                                        Object object9 = view2 = dd2_2.a(n3, view);
                                        object9 = (AjioTextView)view2;
                                        if (object9 != null) {
                                            n3 = R$id.luxe_plp_row_price_rv;
                                            Object object10 = view2 = dd2_2.a(n3, view);
                                            object10 = (RecyclerView)view2;
                                            if (object10 != null) {
                                                n3 = R$id.luxe_plp_row_product_recycler;
                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                object11 = (RecyclerView)view2;
                                                if (object11 != null && (view2 = dd2_2.a(n3 = R$id.sale_container, view)) != null) {
                                                    LayoutSalePriceLuxeV2Binding layoutSalePriceLuxeV2Binding = LayoutSalePriceLuxeV2Binding.bind(view2);
                                                    n3 = R$id.selling_fast_tag;
                                                    Object object12 = view2 = dd2_2.a(n3, view);
                                                    object12 = (AjioTextView)view2;
                                                    if (object12 != null) {
                                                        Object object13 = view;
                                                        object13 = (ConstraintLayout)view;
                                                        LuxePlpMultiImageProductRowViewBinding luxePlpMultiImageProductRowViewBinding = new LuxePlpMultiImageProductRowViewBinding((ConstraintLayout)((Object)object13), layoutFreebieGetFreebiesPlpBinding, (AjioTextView)object2, (AjioAspectRatioImageView)((Object)object3), (AjioTextView)object4, (AppCompatImageView)((Object)object5), (AjioTextView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (RecyclerView)object10, (RecyclerView)object11, layoutSalePriceLuxeV2Binding, (AjioTextView)object12);
                                                        return luxePlpMultiImageProductRowViewBinding;
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

    public static LuxePlpMultiImageProductRowViewBinding inflate(LayoutInflater layoutInflater) {
        return LuxePlpMultiImageProductRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePlpMultiImageProductRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_plp_multi_image_product_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePlpMultiImageProductRowViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

