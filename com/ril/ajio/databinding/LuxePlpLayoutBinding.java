/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.AddressBarUiBinding;
import com.ril.ajio.databinding.LuxePlpToolbarLayoutBinding;

public final class LuxePlpLayoutBinding
implements BC3 {
    public final AddressBarUiBinding addressBarUiLuxeEmpty;
    public final AjioTextView continueShoppingPdBtn;
    public final AjioTextView emptyLayoutSubtitle;
    public final AjioTextView emptyLayoutTitle;
    public final ImageView imgToggleView;
    public final LinearLayout luxePlpCategoryView;
    public final FrameLayout luxePlpFilterBackground;
    public final FrameLayout luxePlpFilterFragContainer;
    public final AjioTextView luxePlpFilterHeadingTv;
    public final CardView luxePlpFilterSelectedIconView;
    public final AjioTextView luxePlpFilterSubheadingTv;
    public final LinearLayout luxePlpFilterView;
    public final RecyclerView luxePlpProductRv;
    public final ShimmerFrameLayout luxePlpShimmerView;
    public final LinearLayout luxePlpSortByView;
    public final View luxePlpSortFilterDivider;
    public final ConstraintLayout luxePlpSortFilterView;
    public final AjioTextView luxePlpSortHeadingTv;
    public final AjioTextView luxePlpSortSubheadingTv;
    public final LuxePlpToolbarLayoutBinding luxePlpToolbar;
    public final RelativeLayout luxePlpZeroProductLayout;
    public final AjioTextView plpCategoryHeadingTv;
    private final ConstraintLayout rootView;
    public final CardView toggleListViewLuxe;

    private LuxePlpLayoutBinding(ConstraintLayout constraintLayout, AddressBarUiBinding addressBarUiBinding, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, ImageView imageView, LinearLayout linearLayout, FrameLayout frameLayout, FrameLayout frameLayout2, AjioTextView ajioTextView4, CardView cardView, AjioTextView ajioTextView5, LinearLayout linearLayout2, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, LinearLayout linearLayout3, View view, ConstraintLayout constraintLayout2, AjioTextView ajioTextView6, AjioTextView ajioTextView7, LuxePlpToolbarLayoutBinding luxePlpToolbarLayoutBinding, RelativeLayout relativeLayout, AjioTextView ajioTextView8, CardView cardView2) {
        this.rootView = constraintLayout;
        this.addressBarUiLuxeEmpty = addressBarUiBinding;
        this.continueShoppingPdBtn = ajioTextView;
        this.emptyLayoutSubtitle = ajioTextView2;
        this.emptyLayoutTitle = ajioTextView3;
        this.imgToggleView = imageView;
        this.luxePlpCategoryView = linearLayout;
        this.luxePlpFilterBackground = frameLayout;
        this.luxePlpFilterFragContainer = frameLayout2;
        this.luxePlpFilterHeadingTv = ajioTextView4;
        this.luxePlpFilterSelectedIconView = cardView;
        this.luxePlpFilterSubheadingTv = ajioTextView5;
        this.luxePlpFilterView = linearLayout2;
        this.luxePlpProductRv = recyclerView;
        this.luxePlpShimmerView = shimmerFrameLayout;
        this.luxePlpSortByView = linearLayout3;
        this.luxePlpSortFilterDivider = view;
        this.luxePlpSortFilterView = constraintLayout2;
        this.luxePlpSortHeadingTv = ajioTextView6;
        this.luxePlpSortSubheadingTv = ajioTextView7;
        this.luxePlpToolbar = luxePlpToolbarLayoutBinding;
        this.luxePlpZeroProductLayout = relativeLayout;
        this.plpCategoryHeadingTv = ajioTextView8;
        this.toggleListViewLuxe = cardView2;
    }

    public static LuxePlpLayoutBinding bind(View view) {
        Object object = view;
        int n3 = R$id.address_bar_ui_luxe_empty;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            AddressBarUiBinding addressBarUiBinding = AddressBarUiBinding.bind(view2);
            n3 = R$id.continue_shopping_pd_btn;
            Object object2 = view2 = dd2_2.a(n3, view);
            object2 = (AjioTextView)view2;
            if (object2 != null) {
                n3 = R$id.empty_layout_subtitle;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (AjioTextView)view2;
                if (object3 != null) {
                    n3 = R$id.empty_layout_title;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.imgToggleView;
                        View view3 = view2 = dd2_2.a(n3, view);
                        view3 = (ImageView)view2;
                        if (view3 != null) {
                            n3 = R$id.luxe_plp_category_view;
                            View view4 = view2 = dd2_2.a(n3, view);
                            view4 = (LinearLayout)view2;
                            if (view4 != null) {
                                n3 = R$id.luxe_plp_filter_background;
                                View view5 = view2 = dd2_2.a(n3, view);
                                view5 = (FrameLayout)view2;
                                if (view5 != null) {
                                    n3 = R$id.luxe_plp_filter_frag_container;
                                    View view6 = view2 = dd2_2.a(n3, view);
                                    view6 = (FrameLayout)view2;
                                    if (view6 != null) {
                                        n3 = R$id.luxe_plp_filter_heading_tv;
                                        Object object5 = view2 = dd2_2.a(n3, view);
                                        object5 = (AjioTextView)view2;
                                        if (object5 != null) {
                                            n3 = R$id.luxe_plp_filter_selected_icon_view;
                                            Object object6 = view2 = dd2_2.a(n3, view);
                                            object6 = (CardView)view2;
                                            if (object6 != null) {
                                                n3 = R$id.luxe_plp_filter_subheading_tv;
                                                Object object7 = view2 = dd2_2.a(n3, view);
                                                object7 = (AjioTextView)view2;
                                                if (object7 != null) {
                                                    n3 = R$id.luxe_plp_filter_view;
                                                    View view7 = view2 = dd2_2.a(n3, view);
                                                    view7 = (LinearLayout)view2;
                                                    if (view7 != null) {
                                                        n3 = R$id.luxe_plp_product_rv;
                                                        Object object8 = view2 = dd2_2.a(n3, view);
                                                        object8 = (RecyclerView)view2;
                                                        if (object8 != null) {
                                                            n3 = R$id.luxe_plp_shimmer_view;
                                                            Object object9 = view2 = dd2_2.a(n3, view);
                                                            object9 = (ShimmerFrameLayout)view2;
                                                            if (object9 != null) {
                                                                View view8;
                                                                n3 = R$id.luxe_plp_sort_by_view;
                                                                View view9 = view2 = dd2_2.a(n3, view);
                                                                view9 = (LinearLayout)view2;
                                                                if (view9 != null && (view8 = dd2_2.a(n3 = R$id.luxe_plp_sort_filter_divider, view)) != null) {
                                                                    n3 = R$id.luxe_plp_sort_filter_view;
                                                                    Object object10 = view2 = dd2_2.a(n3, view);
                                                                    object10 = (ConstraintLayout)view2;
                                                                    if (object10 != null) {
                                                                        n3 = R$id.luxe_plp_sort_heading_tv;
                                                                        Object object11 = view2 = dd2_2.a(n3, view);
                                                                        object11 = (AjioTextView)view2;
                                                                        if (object11 != null) {
                                                                            n3 = R$id.luxe_plp_sort_subheading_tv;
                                                                            Object object12 = view2 = dd2_2.a(n3, view);
                                                                            object12 = (AjioTextView)view2;
                                                                            if (object12 != null && (view2 = dd2_2.a(n3 = R$id.luxe_plp_toolbar, view)) != null) {
                                                                                LuxePlpToolbarLayoutBinding luxePlpToolbarLayoutBinding = LuxePlpToolbarLayoutBinding.bind(view2);
                                                                                n3 = R$id.luxe_plp_zero_product_layout;
                                                                                View view10 = view2 = dd2_2.a(n3, view);
                                                                                view10 = (RelativeLayout)view2;
                                                                                if (view10 != null) {
                                                                                    n3 = R$id.plp_category_heading_tv;
                                                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                                                    object13 = (AjioTextView)view2;
                                                                                    if (object13 != null) {
                                                                                        n3 = R$id.toggleListViewLuxe;
                                                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                                                        object14 = (CardView)view2;
                                                                                        if (object14 != null) {
                                                                                            Object object15 = view;
                                                                                            object15 = (ConstraintLayout)view;
                                                                                            LuxePlpLayoutBinding luxePlpLayoutBinding = new LuxePlpLayoutBinding((ConstraintLayout)((Object)object15), addressBarUiBinding, (AjioTextView)object2, (AjioTextView)object3, (AjioTextView)object4, (ImageView)view3, (LinearLayout)view4, (FrameLayout)view5, (FrameLayout)view6, (AjioTextView)object5, (CardView)((Object)object6), (AjioTextView)object7, (LinearLayout)view7, (RecyclerView)object8, (ShimmerFrameLayout)((Object)object9), (LinearLayout)view9, view8, (ConstraintLayout)((Object)object10), (AjioTextView)object11, (AjioTextView)object12, luxePlpToolbarLayoutBinding, (RelativeLayout)view10, (AjioTextView)object13, (CardView)((Object)object14));
                                                                                            return luxePlpLayoutBinding;
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

    public static LuxePlpLayoutBinding inflate(LayoutInflater layoutInflater) {
        return LuxePlpLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePlpLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_plp_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePlpLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

