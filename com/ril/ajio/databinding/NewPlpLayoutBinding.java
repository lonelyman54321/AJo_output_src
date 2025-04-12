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
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.ImageUploadWidget;
import com.ril.ajio.databinding.LayoutPlpBauBinding;
import com.ril.ajio.databinding.LayoutPlpSaleBinding;
import com.ril.ajio.databinding.RefereeWidgetLayoutBinding;
import com.ril.ajio.utility.customview.InAppBottomUpdatesView;

public final class NewPlpLayoutBinding
implements BC3 {
    public final CardView goToHome;
    public final ImageView imgToggleView;
    public final InAppBottomUpdatesView inappUpdateWidget;
    public final LayoutPlpBauBinding plpBAUContainer;
    public final AjioTextView plpCategoryHeadingTv;
    public final LinearLayout plpCategoryView;
    public final FrameLayout plpFilterBackground;
    public final FrameLayout plpFilterFragContainer;
    public final AjioTextView plpFilterHeadingTv;
    public final View plpFilterSelectedIconView;
    public final AjioTextView plpFilterSubheadingTv;
    public final LinearLayout plpFilterView;
    public final ImageUploadWidget plpImageUpload;
    public final LayoutPlpSaleBinding plpSaleContainer;
    public final FrameLayout plpShimmerContainer;
    public final FrameLayout plpShimmerContainerQuickFilters;
    public final ShimmerFrameLayout plpShimmerView;
    public final ShimmerFrameLayout plpShimmerViewQuickFilters;
    public final LinearLayout plpSortByView;
    public final ConstraintLayout plpSortFilterView;
    public final AjioTextView plpSortHeadingTv;
    public final AjioTextView plpSortSubheadingTv;
    public final RefereeWidgetLayoutBinding refereeWidget;
    private final FrameLayout rootView;
    public final CardView toggleListView;

    private NewPlpLayoutBinding(FrameLayout frameLayout, CardView cardView, ImageView imageView, InAppBottomUpdatesView inAppBottomUpdatesView, LayoutPlpBauBinding layoutPlpBauBinding, AjioTextView ajioTextView, LinearLayout linearLayout, FrameLayout frameLayout2, FrameLayout frameLayout3, AjioTextView ajioTextView2, View view, AjioTextView ajioTextView3, LinearLayout linearLayout2, ImageUploadWidget imageUploadWidget, LayoutPlpSaleBinding layoutPlpSaleBinding, FrameLayout frameLayout4, FrameLayout frameLayout5, ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2, LinearLayout linearLayout3, ConstraintLayout constraintLayout, AjioTextView ajioTextView4, AjioTextView ajioTextView5, RefereeWidgetLayoutBinding refereeWidgetLayoutBinding, CardView cardView2) {
        this.rootView = frameLayout;
        this.goToHome = cardView;
        this.imgToggleView = imageView;
        this.inappUpdateWidget = inAppBottomUpdatesView;
        this.plpBAUContainer = layoutPlpBauBinding;
        this.plpCategoryHeadingTv = ajioTextView;
        this.plpCategoryView = linearLayout;
        this.plpFilterBackground = frameLayout2;
        this.plpFilterFragContainer = frameLayout3;
        this.plpFilterHeadingTv = ajioTextView2;
        this.plpFilterSelectedIconView = view;
        this.plpFilterSubheadingTv = ajioTextView3;
        this.plpFilterView = linearLayout2;
        this.plpImageUpload = imageUploadWidget;
        this.plpSaleContainer = layoutPlpSaleBinding;
        this.plpShimmerContainer = frameLayout4;
        this.plpShimmerContainerQuickFilters = frameLayout5;
        this.plpShimmerView = shimmerFrameLayout;
        this.plpShimmerViewQuickFilters = shimmerFrameLayout2;
        this.plpSortByView = linearLayout3;
        this.plpSortFilterView = constraintLayout;
        this.plpSortHeadingTv = ajioTextView4;
        this.plpSortSubheadingTv = ajioTextView5;
        this.refereeWidget = refereeWidgetLayoutBinding;
        this.toggleListView = cardView2;
    }

    public static NewPlpLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.goToHome;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (CardView)view2;
        if (object2 != null) {
            n3 = R$id.imgToggleView;
            View view3 = view2 = dd2_2.a(n3, view);
            view3 = (ImageView)view2;
            if (view3 != null) {
                n3 = R$id.inapp_update_widget;
                Object object3 = view2 = dd2_2.a(n3, view);
                object3 = (InAppBottomUpdatesView)view2;
                if (object3 != null && (view2 = dd2_2.a(n3 = R$id.plpBAUContainer, view)) != null) {
                    LayoutPlpBauBinding layoutPlpBauBinding = LayoutPlpBauBinding.bind(view2);
                    n3 = R$id.plp_category_heading_tv;
                    Object object4 = view2 = dd2_2.a(n3, view);
                    object4 = (AjioTextView)view2;
                    if (object4 != null) {
                        n3 = R$id.plp_category_view;
                        View view4 = view2 = dd2_2.a(n3, view);
                        view4 = (LinearLayout)view2;
                        if (view4 != null) {
                            n3 = R$id.plp_filter_background;
                            View view5 = view2 = dd2_2.a(n3, view);
                            view5 = (FrameLayout)view2;
                            if (view5 != null) {
                                n3 = R$id.plp_filter_frag_container;
                                View view6 = view2 = dd2_2.a(n3, view);
                                view6 = (FrameLayout)view2;
                                if (view6 != null) {
                                    View view7;
                                    n3 = R$id.plp_filter_heading_tv;
                                    Object object5 = view2 = dd2_2.a(n3, view);
                                    object5 = (AjioTextView)view2;
                                    if (object5 != null && (view7 = dd2_2.a(n3 = R$id.plp_filter_selected_icon_view, view)) != null) {
                                        n3 = R$id.plp_filter_subheading_tv;
                                        Object object6 = view2 = dd2_2.a(n3, view);
                                        object6 = (AjioTextView)view2;
                                        if (object6 != null) {
                                            n3 = R$id.plp_filter_view;
                                            View view8 = view2 = dd2_2.a(n3, view);
                                            view8 = (LinearLayout)view2;
                                            if (view8 != null) {
                                                n3 = R$id.plpImageUpload;
                                                Object object7 = view2 = dd2_2.a(n3, view);
                                                object7 = (ImageUploadWidget)view2;
                                                if (object7 != null && (view2 = dd2_2.a(n3 = R$id.plpSaleContainer, view)) != null) {
                                                    LayoutPlpSaleBinding layoutPlpSaleBinding = LayoutPlpSaleBinding.bind(view2);
                                                    n3 = R$id.plp_shimmer_container;
                                                    View view9 = view2 = dd2_2.a(n3, view);
                                                    view9 = (FrameLayout)view2;
                                                    if (view9 != null) {
                                                        n3 = R$id.plp_shimmer_container_quick_filters;
                                                        View view10 = view2 = dd2_2.a(n3, view);
                                                        view10 = (FrameLayout)view2;
                                                        if (view10 != null) {
                                                            n3 = R$id.plp_shimmer_view;
                                                            Object object8 = view2 = dd2_2.a(n3, view);
                                                            object8 = (ShimmerFrameLayout)view2;
                                                            if (object8 != null) {
                                                                n3 = R$id.plp_shimmer_view_quick_filters;
                                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                                object9 = (ShimmerFrameLayout)view2;
                                                                if (object9 != null) {
                                                                    n3 = R$id.plp_sort_by_view;
                                                                    View view11 = view2 = dd2_2.a(n3, view);
                                                                    view11 = (LinearLayout)view2;
                                                                    if (view11 != null) {
                                                                        n3 = R$id.plp_sort_filter_view;
                                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                                        object10 = (ConstraintLayout)view2;
                                                                        if (object10 != null) {
                                                                            n3 = R$id.plp_sort_heading_tv;
                                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                                            object11 = (AjioTextView)view2;
                                                                            if (object11 != null) {
                                                                                n3 = R$id.plp_sort_subheading_tv;
                                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                                object12 = (AjioTextView)view2;
                                                                                if (object12 != null && (view2 = dd2_2.a(n3 = R$id.refereeWidget, view)) != null) {
                                                                                    RefereeWidgetLayoutBinding refereeWidgetLayoutBinding = RefereeWidgetLayoutBinding.bind(view2);
                                                                                    n3 = R$id.toggleListView;
                                                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                                                    object13 = (CardView)view2;
                                                                                    if (object13 != null) {
                                                                                        View view12 = view;
                                                                                        view12 = (FrameLayout)view;
                                                                                        NewPlpLayoutBinding newPlpLayoutBinding = new NewPlpLayoutBinding((FrameLayout)view12, (CardView)((Object)object2), (ImageView)view3, (InAppBottomUpdatesView)((Object)object3), layoutPlpBauBinding, (AjioTextView)object4, (LinearLayout)view4, (FrameLayout)view5, (FrameLayout)view6, (AjioTextView)object5, view7, (AjioTextView)object6, (LinearLayout)view8, (ImageUploadWidget)((Object)object7), layoutPlpSaleBinding, (FrameLayout)view9, (FrameLayout)view10, (ShimmerFrameLayout)((Object)object8), (ShimmerFrameLayout)((Object)object9), (LinearLayout)view11, (ConstraintLayout)((Object)object10), (AjioTextView)object11, (AjioTextView)object12, refereeWidgetLayoutBinding, (CardView)((Object)object13));
                                                                                        return newPlpLayoutBinding;
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

    public static NewPlpLayoutBinding inflate(LayoutInflater layoutInflater) {
        return NewPlpLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static NewPlpLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_plp_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewPlpLayoutBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

