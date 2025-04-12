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
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ExchangeFragmentProductLayoutRevampBinding;
import com.ril.ajio.databinding.ExchangeReturnQuantityViewBinding;
import com.ril.ajio.databinding.ExlamationErrorBinding;
import com.ril.ajio.databinding.ReturnExchangeReasonLayoutRevampBinding;
import com.ril.ajio.databinding.RowExchangeEddBinding;

public final class ExchangeFragementLayoutRevampBinding
implements BC3 {
    public final Toolbar alfToolbar;
    public final AppBarLayout appBarLayout;
    public final CollapsingToolbarLayout collapseToolBar;
    public final ConstraintLayout detailsContainer;
    public final ReturnExchangeReasonLayoutRevampBinding exchangeReason;
    public final ExchangeReturnQuantityViewBinding exchangeReturnQuantityLayout;
    public final NestedScrollView exchangeScroll;
    public final AjioTextView gotoSizeGuideButton;
    public final ConstraintLayout pdpSizeLayout;
    public final RecyclerView productDetailSizeRv;
    public final ExchangeFragmentProductLayoutRevampBinding productExchange;
    public final ExlamationErrorBinding quantityAlertView;
    private final CoordinatorLayout rootView;
    public final RowExchangeEddBinding rowExchangeEdd;
    public final ExlamationErrorBinding sizeAlertView;
    public final AjioTextView tvDetails;
    public final AjioTextView tvExchange;
    public final AjioTextView tvModelSize;
    public final AjioTextView tvSelectQuantity;

    private ExchangeFragementLayoutRevampBinding(CoordinatorLayout coordinatorLayout, Toolbar toolbar, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ConstraintLayout constraintLayout, ReturnExchangeReasonLayoutRevampBinding returnExchangeReasonLayoutRevampBinding, ExchangeReturnQuantityViewBinding exchangeReturnQuantityViewBinding, NestedScrollView nestedScrollView, AjioTextView ajioTextView, ConstraintLayout constraintLayout2, RecyclerView recyclerView, ExchangeFragmentProductLayoutRevampBinding exchangeFragmentProductLayoutRevampBinding, ExlamationErrorBinding exlamationErrorBinding, RowExchangeEddBinding rowExchangeEddBinding, ExlamationErrorBinding exlamationErrorBinding2, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5) {
        this.rootView = coordinatorLayout;
        this.alfToolbar = toolbar;
        this.appBarLayout = appBarLayout;
        this.collapseToolBar = collapsingToolbarLayout;
        this.detailsContainer = constraintLayout;
        this.exchangeReason = returnExchangeReasonLayoutRevampBinding;
        this.exchangeReturnQuantityLayout = exchangeReturnQuantityViewBinding;
        this.exchangeScroll = nestedScrollView;
        this.gotoSizeGuideButton = ajioTextView;
        this.pdpSizeLayout = constraintLayout2;
        this.productDetailSizeRv = recyclerView;
        this.productExchange = exchangeFragmentProductLayoutRevampBinding;
        this.quantityAlertView = exlamationErrorBinding;
        this.rowExchangeEdd = rowExchangeEddBinding;
        this.sizeAlertView = exlamationErrorBinding2;
        this.tvDetails = ajioTextView2;
        this.tvExchange = ajioTextView3;
        this.tvModelSize = ajioTextView4;
        this.tvSelectQuantity = ajioTextView5;
    }

    public static ExchangeFragementLayoutRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.alfToolbar;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (Toolbar)view2;
        if (object2 != null) {
            n3 = R$id.appBarLayout;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AppBarLayout)view2;
            if (object3 != null) {
                n3 = R$id.collapseToolBar;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (CollapsingToolbarLayout)view2;
                if (object4 != null) {
                    n3 = R$id.details_container;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (ConstraintLayout)view2;
                    if (object5 != null && (view2 = dd2_2.a(n3 = R$id.exchangeReason, view)) != null) {
                        ReturnExchangeReasonLayoutRevampBinding returnExchangeReasonLayoutRevampBinding = ReturnExchangeReasonLayoutRevampBinding.bind(view2);
                        n3 = R$id.exchange_return_quantity_layout;
                        view2 = dd2_2.a(n3, view);
                        if (view2 != null) {
                            ExchangeReturnQuantityViewBinding exchangeReturnQuantityViewBinding = ExchangeReturnQuantityViewBinding.bind(view2);
                            n3 = R$id.exchange_scroll;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (NestedScrollView)view2;
                            if (object6 != null) {
                                n3 = R$id.goto_size_guide_button;
                                Object object7 = view2 = dd2_2.a(n3, view);
                                object7 = (AjioTextView)view2;
                                if (object7 != null) {
                                    n3 = R$id.pdp_size_layout;
                                    Object object8 = view2 = dd2_2.a(n3, view);
                                    object8 = (ConstraintLayout)view2;
                                    if (object8 != null) {
                                        n3 = R$id.product_detail_size_rv;
                                        Object object9 = view2 = dd2_2.a(n3, view);
                                        object9 = (RecyclerView)view2;
                                        if (object9 != null && (view2 = dd2_2.a(n3 = R$id.product_exchange, view)) != null) {
                                            ExchangeFragmentProductLayoutRevampBinding exchangeFragmentProductLayoutRevampBinding = ExchangeFragmentProductLayoutRevampBinding.bind(view2);
                                            n3 = R$id.quantity_alert_view;
                                            view2 = dd2_2.a(n3, view);
                                            if (view2 != null) {
                                                ExlamationErrorBinding exlamationErrorBinding = ExlamationErrorBinding.bind(view2);
                                                n3 = R$id.row_exchange_edd;
                                                view2 = dd2_2.a(n3, view);
                                                if (view2 != null) {
                                                    RowExchangeEddBinding rowExchangeEddBinding = RowExchangeEddBinding.bind(view2);
                                                    n3 = R$id.size_alert_view;
                                                    view2 = dd2_2.a(n3, view);
                                                    if (view2 != null) {
                                                        ExlamationErrorBinding exlamationErrorBinding2 = ExlamationErrorBinding.bind(view2);
                                                        n3 = R$id.tvDetails;
                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                        object10 = (AjioTextView)view2;
                                                        if (object10 != null) {
                                                            n3 = R$id.tvExchange;
                                                            Object object11 = view2 = dd2_2.a(n3, view);
                                                            object11 = (AjioTextView)view2;
                                                            if (object11 != null) {
                                                                n3 = R$id.tvModelSize;
                                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                                object12 = (AjioTextView)view2;
                                                                if (object12 != null) {
                                                                    n3 = R$id.tvSelectQuantity;
                                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                                    object13 = (AjioTextView)view2;
                                                                    if (object13 != null) {
                                                                        Object object14 = view;
                                                                        object14 = (CoordinatorLayout)view;
                                                                        ExchangeFragementLayoutRevampBinding exchangeFragementLayoutRevampBinding = new ExchangeFragementLayoutRevampBinding((CoordinatorLayout)object14, (Toolbar)object2, (AppBarLayout)object3, (CollapsingToolbarLayout)((Object)object4), (ConstraintLayout)((Object)object5), returnExchangeReasonLayoutRevampBinding, exchangeReturnQuantityViewBinding, (NestedScrollView)object6, (AjioTextView)object7, (ConstraintLayout)((Object)object8), (RecyclerView)object9, exchangeFragmentProductLayoutRevampBinding, exlamationErrorBinding, rowExchangeEddBinding, exlamationErrorBinding2, (AjioTextView)object10, (AjioTextView)object11, (AjioTextView)object12, (AjioTextView)object13);
                                                                        return exchangeFragementLayoutRevampBinding;
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

    public static ExchangeFragementLayoutRevampBinding inflate(LayoutInflater layoutInflater) {
        return ExchangeFragementLayoutRevampBinding.inflate(layoutInflater, null, false);
    }

    public static ExchangeFragementLayoutRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.exchange_fragement_layout_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ExchangeFragementLayoutRevampBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

