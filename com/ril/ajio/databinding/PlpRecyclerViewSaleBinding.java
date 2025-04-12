/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class PlpRecyclerViewSaleBinding
implements BC3 {
    public final AjioTextView continueShoppingPdBtn;
    public final AjioTextView emptyLayoutSubtitle;
    public final AjioTextView emptyLayoutTitle;
    public final AjioTextView offerTimerSale;
    public final RecyclerView plpProductRvSale;
    public final FrameLayout plpShimmerContainerImageSearch;
    public final ShimmerFrameLayout plpShimmerViewImageSearch;
    public final LinearLayout plpZeroProductLayoutSale;
    private final LinearLayout rootView;

    private PlpRecyclerViewSaleBinding(LinearLayout linearLayout, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, RecyclerView recyclerView, FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.continueShoppingPdBtn = ajioTextView;
        this.emptyLayoutSubtitle = ajioTextView2;
        this.emptyLayoutTitle = ajioTextView3;
        this.offerTimerSale = ajioTextView4;
        this.plpProductRvSale = recyclerView;
        this.plpShimmerContainerImageSearch = frameLayout;
        this.plpShimmerViewImageSearch = shimmerFrameLayout;
        this.plpZeroProductLayoutSale = linearLayout2;
    }

    public static PlpRecyclerViewSaleBinding bind(View object) {
        View view;
        int n3 = R$id.continue_shopping_pd_btn;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.empty_layout_subtitle;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioTextView)view;
            if (object3 != null) {
                n3 = R$id.empty_layout_title;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AjioTextView)view;
                if (object4 != null) {
                    n3 = R$id.offer_timer_sale;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (AjioTextView)view;
                    if (object5 != null) {
                        n3 = R$id.plp_product_rv_sale;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (RecyclerView)view;
                        if (object6 != null) {
                            n3 = R$id.plp_shimmer_container_image_search;
                            View view2 = view = dd2_2.a(n3, object);
                            view2 = (FrameLayout)view;
                            if (view2 != null) {
                                n3 = R$id.plp_shimmer_view_image_search;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (ShimmerFrameLayout)view;
                                if (object7 != null) {
                                    n3 = R$id.plp_zero_product_layout_sale;
                                    View view3 = view = dd2_2.a(n3, object);
                                    view3 = (LinearLayout)view;
                                    if (view3 != null) {
                                        Object object8 = object;
                                        object8 = (LinearLayout)object;
                                        PlpRecyclerViewSaleBinding plpRecyclerViewSaleBinding = new PlpRecyclerViewSaleBinding((LinearLayout)object8, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (AjioTextView)object5, (RecyclerView)object6, (FrameLayout)view2, (ShimmerFrameLayout)((Object)object7), (LinearLayout)view3);
                                        return plpRecyclerViewSaleBinding;
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

    public static PlpRecyclerViewSaleBinding inflate(LayoutInflater layoutInflater) {
        return PlpRecyclerViewSaleBinding.inflate(layoutInflater, null, false);
    }

    public static PlpRecyclerViewSaleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_recycler_view_sale;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpRecyclerViewSaleBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

