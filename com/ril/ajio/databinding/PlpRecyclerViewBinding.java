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
import com.ril.ajio.customviews.widgets.ImageSearchCategoryWidget;
import com.ril.ajio.databinding.AddressBarUiBinding;

public final class PlpRecyclerViewBinding
implements BC3 {
    public final AddressBarUiBinding addressBarUiBau;
    public final AjioTextView continueShoppingPdBtn;
    public final AjioTextView emptyLayoutSubtitle;
    public final AjioTextView emptyLayoutTitle;
    public final ImageSearchCategoryWidget layoutCategory;
    public final AjioTextView offerTimer;
    public final RecyclerView plpProductRv;
    public final FrameLayout plpShimmerContainerImageSearch;
    public final ShimmerFrameLayout plpShimmerViewImageSearch;
    public final LinearLayout plpZeroProductLayout;
    private final LinearLayout rootView;

    private PlpRecyclerViewBinding(LinearLayout linearLayout, AddressBarUiBinding addressBarUiBinding, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, ImageSearchCategoryWidget imageSearchCategoryWidget, AjioTextView ajioTextView4, RecyclerView recyclerView, FrameLayout frameLayout, ShimmerFrameLayout shimmerFrameLayout, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.addressBarUiBau = addressBarUiBinding;
        this.continueShoppingPdBtn = ajioTextView;
        this.emptyLayoutSubtitle = ajioTextView2;
        this.emptyLayoutTitle = ajioTextView3;
        this.layoutCategory = imageSearchCategoryWidget;
        this.offerTimer = ajioTextView4;
        this.plpProductRv = recyclerView;
        this.plpShimmerContainerImageSearch = frameLayout;
        this.plpShimmerViewImageSearch = shimmerFrameLayout;
        this.plpZeroProductLayout = linearLayout2;
    }

    public static PlpRecyclerViewBinding bind(View object) {
        int n3 = R$id.address_bar_ui_bau;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            AddressBarUiBinding addressBarUiBinding = AddressBarUiBinding.bind(view);
            n3 = R$id.continue_shopping_pd_btn;
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
                        n3 = R$id.layout_category;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (ImageSearchCategoryWidget)view;
                        if (object5 != null) {
                            n3 = R$id.offer_timer;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (AjioTextView)view;
                            if (object6 != null) {
                                n3 = R$id.plp_product_rv;
                                Object object7 = view = dd2_2.a(n3, object);
                                object7 = (RecyclerView)view;
                                if (object7 != null) {
                                    n3 = R$id.plp_shimmer_container_image_search;
                                    View view2 = view = dd2_2.a(n3, object);
                                    view2 = (FrameLayout)view;
                                    if (view2 != null) {
                                        n3 = R$id.plp_shimmer_view_image_search;
                                        Object object8 = view = dd2_2.a(n3, object);
                                        object8 = (ShimmerFrameLayout)view;
                                        if (object8 != null) {
                                            n3 = R$id.plp_zero_product_layout;
                                            View view3 = view = dd2_2.a(n3, object);
                                            view3 = (LinearLayout)view;
                                            if (view3 != null) {
                                                Object object9 = object;
                                                object9 = (LinearLayout)object;
                                                PlpRecyclerViewBinding plpRecyclerViewBinding = new PlpRecyclerViewBinding((LinearLayout)object9, addressBarUiBinding, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (ImageSearchCategoryWidget)object5, (AjioTextView)object6, (RecyclerView)object7, (FrameLayout)view2, (ShimmerFrameLayout)((Object)object8), (LinearLayout)view3);
                                                return plpRecyclerViewBinding;
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PlpRecyclerViewBinding inflate(LayoutInflater layoutInflater) {
        return PlpRecyclerViewBinding.inflate(layoutInflater, null, false);
    }

    public static PlpRecyclerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.plp_recycler_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PlpRecyclerViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

