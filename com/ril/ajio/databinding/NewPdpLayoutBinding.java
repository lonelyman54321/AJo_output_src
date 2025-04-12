/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.databinding.LuxeNewPdpFooterLayoutBinding;
import com.ril.ajio.databinding.LuxeNewRowPdpSizeBinding;
import com.ril.ajio.databinding.LuxeToolbarLayoutBinding;
import com.ril.ajio.databinding.NewPdpFooterLayoutBinding;
import com.ril.ajio.databinding.NewRowPdpSizeBinding;
import com.ril.ajio.databinding.PdpPriceErrorLayoutBinding;
import com.ril.ajio.databinding.RefereeWidgetLayoutBinding;
import com.ril.ajio.pdprefresh.customview.PDPCustomDoDView;

public final class NewPdpLayoutBinding
implements BC3 {
    public final NewPdpFooterLayoutBinding footerLayout;
    public final LuxeNewPdpFooterLayoutBinding luxeFooterLayout;
    public final LuxeNewRowPdpSizeBinding luxeMainPdpSizeLayout;
    public final RelativeLayout luxeNewPdpSizeLayout;
    public final LuxeToolbarLayoutBinding luxePlpToolbar;
    public final ConstraintLayout mainPdpLayout;
    public final NewRowPdpSizeBinding mainPdpSizeLayout;
    public final RelativeLayout newPdpSizeLayout;
    public final LinearLayout parentFooterLayout;
    public final PDPCustomDoDView pdpDealLayout;
    public final PdpPriceErrorLayoutBinding pdpPriceErrorLayout;
    public final RecyclerView pdpRv;
    public final ShimmerFrameLayout pdpShimmerView;
    public final AjioProgressView productDetailsProgressBar;
    public final RefereeWidgetLayoutBinding refereeWidget;
    private final FrameLayout rootView;
    public final View shadowLayout;

    private NewPdpLayoutBinding(FrameLayout frameLayout, NewPdpFooterLayoutBinding newPdpFooterLayoutBinding, LuxeNewPdpFooterLayoutBinding luxeNewPdpFooterLayoutBinding, LuxeNewRowPdpSizeBinding luxeNewRowPdpSizeBinding, RelativeLayout relativeLayout, LuxeToolbarLayoutBinding luxeToolbarLayoutBinding, ConstraintLayout constraintLayout, NewRowPdpSizeBinding newRowPdpSizeBinding, RelativeLayout relativeLayout2, LinearLayout linearLayout, PDPCustomDoDView pDPCustomDoDView, PdpPriceErrorLayoutBinding pdpPriceErrorLayoutBinding, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, AjioProgressView ajioProgressView, RefereeWidgetLayoutBinding refereeWidgetLayoutBinding, View view) {
        this.rootView = frameLayout;
        this.footerLayout = newPdpFooterLayoutBinding;
        this.luxeFooterLayout = luxeNewPdpFooterLayoutBinding;
        this.luxeMainPdpSizeLayout = luxeNewRowPdpSizeBinding;
        this.luxeNewPdpSizeLayout = relativeLayout;
        this.luxePlpToolbar = luxeToolbarLayoutBinding;
        this.mainPdpLayout = constraintLayout;
        this.mainPdpSizeLayout = newRowPdpSizeBinding;
        this.newPdpSizeLayout = relativeLayout2;
        this.parentFooterLayout = linearLayout;
        this.pdpDealLayout = pDPCustomDoDView;
        this.pdpPriceErrorLayout = pdpPriceErrorLayoutBinding;
        this.pdpRv = recyclerView;
        this.pdpShimmerView = shimmerFrameLayout;
        this.productDetailsProgressBar = ajioProgressView;
        this.refereeWidget = refereeWidgetLayoutBinding;
        this.shadowLayout = view;
    }

    public static NewPdpLayoutBinding bind(View view) {
        Object object = view;
        int n3 = R$id.footer_layout;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            NewPdpFooterLayoutBinding newPdpFooterLayoutBinding = NewPdpFooterLayoutBinding.bind(view2);
            n3 = R$id.luxe_footer_layout;
            view2 = dd2_2.a(n3, view);
            if (view2 != null) {
                LuxeNewPdpFooterLayoutBinding luxeNewPdpFooterLayoutBinding = LuxeNewPdpFooterLayoutBinding.bind(view2);
                n3 = R$id.luxe_main_pdp_size_layout;
                view2 = dd2_2.a(n3, view);
                if (view2 != null) {
                    LuxeNewRowPdpSizeBinding luxeNewRowPdpSizeBinding = LuxeNewRowPdpSizeBinding.bind(view2);
                    n3 = R$id.luxe_new_pdp_size_layout;
                    View view3 = view2 = dd2_2.a(n3, view);
                    view3 = (RelativeLayout)view2;
                    if (view3 != null && (view2 = dd2_2.a(n3 = R$id.luxe_plp_toolbar, view)) != null) {
                        LuxeToolbarLayoutBinding luxeToolbarLayoutBinding = LuxeToolbarLayoutBinding.bind(view2);
                        n3 = R$id.main_pdp_layout;
                        Object object2 = view2 = dd2_2.a(n3, view);
                        object2 = (ConstraintLayout)view2;
                        if (object2 != null && (view2 = dd2_2.a(n3 = R$id.main_pdp_size_layout, view)) != null) {
                            NewRowPdpSizeBinding newRowPdpSizeBinding = NewRowPdpSizeBinding.bind(view2);
                            n3 = R$id.new_pdp_size_layout;
                            View view4 = view2 = dd2_2.a(n3, view);
                            view4 = (RelativeLayout)view2;
                            if (view4 != null) {
                                n3 = R$id.parent_footer_layout;
                                View view5 = view2 = dd2_2.a(n3, view);
                                view5 = (LinearLayout)view2;
                                if (view5 != null) {
                                    n3 = R$id.pdp_deal_layout;
                                    Object object3 = view2 = dd2_2.a(n3, view);
                                    object3 = (PDPCustomDoDView)view2;
                                    if (object3 != null && (view2 = dd2_2.a(n3 = R$id.pdp_price_error_layout, view)) != null) {
                                        PdpPriceErrorLayoutBinding pdpPriceErrorLayoutBinding = PdpPriceErrorLayoutBinding.bind(view2);
                                        n3 = R$id.pdp_rv;
                                        Object object4 = view2 = dd2_2.a(n3, view);
                                        object4 = (RecyclerView)view2;
                                        if (object4 != null) {
                                            n3 = R$id.pdp_shimmer_view;
                                            Object object5 = view2 = dd2_2.a(n3, view);
                                            object5 = (ShimmerFrameLayout)view2;
                                            if (object5 != null) {
                                                n3 = R$id.product_details_progress_bar;
                                                Object object6 = view2 = dd2_2.a(n3, view);
                                                object6 = (AjioProgressView)view2;
                                                if (object6 != null && (view2 = dd2_2.a(n3 = R$id.refereeWidget, view)) != null) {
                                                    RefereeWidgetLayoutBinding refereeWidgetLayoutBinding = RefereeWidgetLayoutBinding.bind(view2);
                                                    n3 = R$id.shadow_layout;
                                                    View view6 = dd2_2.a(n3, view);
                                                    if (view6 != null) {
                                                        View view7 = view;
                                                        view7 = (FrameLayout)view;
                                                        NewPdpLayoutBinding newPdpLayoutBinding = new NewPdpLayoutBinding((FrameLayout)view7, newPdpFooterLayoutBinding, luxeNewPdpFooterLayoutBinding, luxeNewRowPdpSizeBinding, (RelativeLayout)view3, luxeToolbarLayoutBinding, (ConstraintLayout)((Object)object2), newRowPdpSizeBinding, (RelativeLayout)view4, (LinearLayout)view5, (PDPCustomDoDView)((Object)object3), pdpPriceErrorLayoutBinding, (RecyclerView)object4, (ShimmerFrameLayout)((Object)object5), (AjioProgressView)((Object)object6), refereeWidgetLayoutBinding, view6);
                                                        return newPdpLayoutBinding;
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

    public static NewPdpLayoutBinding inflate(LayoutInflater layoutInflater) {
        return NewPdpLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static NewPdpLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_pdp_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewPdpLayoutBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

