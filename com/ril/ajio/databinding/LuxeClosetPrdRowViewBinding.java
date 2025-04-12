/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutFreebieGetFreebiesPlpBinding;
import com.ril.ajio.databinding.LayoutSalePriceLuxeBinding;

public final class LuxeClosetPrdRowViewBinding
implements BC3 {
    public final LayoutFreebieGetFreebiesPlpBinding freebieLyt;
    public final AjioTextView luxeClosetAddToBagTv;
    public final ImageView luxeClosetDeleteIv;
    public final View luxeClosetOosBgView;
    public final AjioTextView luxeClosetOosTv;
    public final LinearLayout luxeClosetOosTv1;
    public final LinearLayout luxeClosetRemoveOosLayout;
    public final AjioTextView luxeClosetRowBrandTv;
    public final AjioTextView luxeClosetRowPrdNameTv;
    public final RecyclerView luxeClosetRowPriceRv;
    public final AjioAspectRatioImageView luxeClosetRowProductIv;
    public final AjioTextView luxeWishlistRowExclusiveTv;
    private final ConstraintLayout rootView;
    public final LayoutSalePriceLuxeBinding saleContainer;

    private LuxeClosetPrdRowViewBinding(ConstraintLayout constraintLayout, LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding, AjioTextView ajioTextView, ImageView imageView, View view, AjioTextView ajioTextView2, LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, RecyclerView recyclerView, AjioAspectRatioImageView ajioAspectRatioImageView, AjioTextView ajioTextView5, LayoutSalePriceLuxeBinding layoutSalePriceLuxeBinding) {
        this.rootView = constraintLayout;
        this.freebieLyt = layoutFreebieGetFreebiesPlpBinding;
        this.luxeClosetAddToBagTv = ajioTextView;
        this.luxeClosetDeleteIv = imageView;
        this.luxeClosetOosBgView = view;
        this.luxeClosetOosTv = ajioTextView2;
        this.luxeClosetOosTv1 = linearLayout;
        this.luxeClosetRemoveOosLayout = linearLayout2;
        this.luxeClosetRowBrandTv = ajioTextView3;
        this.luxeClosetRowPrdNameTv = ajioTextView4;
        this.luxeClosetRowPriceRv = recyclerView;
        this.luxeClosetRowProductIv = ajioAspectRatioImageView;
        this.luxeWishlistRowExclusiveTv = ajioTextView5;
        this.saleContainer = layoutSalePriceLuxeBinding;
    }

    public static LuxeClosetPrdRowViewBinding bind(View view) {
        Object object = view;
        int n3 = R$id.freebie_lyt;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            LayoutFreebieGetFreebiesPlpBinding layoutFreebieGetFreebiesPlpBinding = LayoutFreebieGetFreebiesPlpBinding.bind(view2);
            n3 = R$id.luxe_closet_add_to_bag_tv;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (AjioTextView)view2;
            if (object2 != null) {
                View view3;
                n3 = R$id.luxe_closet_delete_iv;
                View view4 = view2 = dd2_2.a(n3, view);
                view4 = (ImageView)view2;
                if (view4 != null && (view3 = dd2_2.a(n3 = R$id.luxe_closet_oos_bg_view, view)) != null) {
                    n3 = R$id.luxe_closet_oos_tv;
                    Object object3 = view2 = dd2_2.a(n3, view);
                    object3 = (AjioTextView)view2;
                    if (object3 != null) {
                        n3 = R$id.luxe_closet_oos_Tv;
                        View view5 = view2 = dd2_2.a(n3, view);
                        view5 = (LinearLayout)view2;
                        if (view5 != null) {
                            n3 = R$id.luxe_closet_remove_oos_layout;
                            View view6 = view2 = dd2_2.a(n3, view);
                            view6 = (LinearLayout)view2;
                            if (view6 != null) {
                                n3 = R$id.luxe_closet_row_brand_tv;
                                Object object4 = view2 = dd2_2.a(n3, view);
                                object4 = (AjioTextView)view2;
                                if (object4 != null) {
                                    n3 = R$id.luxe_closet_row_prd_name_tv;
                                    Object object5 = view2 = dd2_2.a(n3, view);
                                    object5 = (AjioTextView)view2;
                                    if (object5 != null) {
                                        n3 = R$id.luxe_closet_row_price_rv;
                                        Object object6 = view2 = dd2_2.a(n3, view);
                                        object6 = (RecyclerView)view2;
                                        if (object6 != null) {
                                            n3 = R$id.luxe_closet_row_product_iv;
                                            Object object7 = view2 = dd2_2.a(n3, view);
                                            object7 = (AjioAspectRatioImageView)view2;
                                            if (object7 != null) {
                                                n3 = R$id.luxe_wishlist_row_exclusive_tv;
                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                object8 = (AjioTextView)view2;
                                                if (object8 != null && (view2 = dd2_2.a(n3 = R$id.sale_container, view)) != null) {
                                                    LayoutSalePriceLuxeBinding layoutSalePriceLuxeBinding = LayoutSalePriceLuxeBinding.bind(view2);
                                                    Object object9 = view;
                                                    object9 = (ConstraintLayout)view;
                                                    LuxeClosetPrdRowViewBinding luxeClosetPrdRowViewBinding = new LuxeClosetPrdRowViewBinding((ConstraintLayout)((Object)object9), layoutFreebieGetFreebiesPlpBinding, (AjioTextView)object2, (ImageView)view4, view3, (AjioTextView)object3, (LinearLayout)view5, (LinearLayout)view6, (AjioTextView)object4, (AjioTextView)object5, (RecyclerView)object6, (AjioAspectRatioImageView)((Object)object7), (AjioTextView)object8, layoutSalePriceLuxeBinding);
                                                    return luxeClosetPrdRowViewBinding;
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

    public static LuxeClosetPrdRowViewBinding inflate(LayoutInflater layoutInflater) {
        return LuxeClosetPrdRowViewBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeClosetPrdRowViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_closet_prd_row_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeClosetPrdRowViewBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

