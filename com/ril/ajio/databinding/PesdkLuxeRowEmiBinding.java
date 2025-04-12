/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.PEToggleButton;
import com.ril.ajio.databinding.PesdkLuxeEmiRowBinding;

public final class PesdkLuxeRowEmiBinding
implements BC3 {
    public final LinearLayout contentContainer;
    public final PesdkLuxeEmiRowBinding emiBankFour;
    public final PesdkLuxeEmiRowBinding emiBankOne;
    public final PesdkLuxeEmiRowBinding emiBankThree;
    public final PesdkLuxeEmiRowBinding emiBankTwo;
    public final LinearLayout emiContentContainer;
    public final AjioTextView emiErrorFetchMsg;
    public final AjioTextView emiInfo;
    public final AjioCustomExpandablePanel emiPayment;
    public final LinearLayout emiRefreshButton;
    public final LinearLayout emiRetryContainer;
    public final ShimmerFrameLayout emiShimmerRootView;
    public final PEToggleButton emiToggleExpand;
    private final AjioCustomExpandablePanel rootView;
    public final AjioTextView viewEmiTvShowMorebank;

    private PesdkLuxeRowEmiBinding(AjioCustomExpandablePanel ajioCustomExpandablePanel, LinearLayout linearLayout, PesdkLuxeEmiRowBinding pesdkLuxeEmiRowBinding, PesdkLuxeEmiRowBinding pesdkLuxeEmiRowBinding2, PesdkLuxeEmiRowBinding pesdkLuxeEmiRowBinding3, PesdkLuxeEmiRowBinding pesdkLuxeEmiRowBinding4, LinearLayout linearLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioCustomExpandablePanel ajioCustomExpandablePanel2, LinearLayout linearLayout3, LinearLayout linearLayout4, ShimmerFrameLayout shimmerFrameLayout, PEToggleButton pEToggleButton, AjioTextView ajioTextView3) {
        this.rootView = ajioCustomExpandablePanel;
        this.contentContainer = linearLayout;
        this.emiBankFour = pesdkLuxeEmiRowBinding;
        this.emiBankOne = pesdkLuxeEmiRowBinding2;
        this.emiBankThree = pesdkLuxeEmiRowBinding3;
        this.emiBankTwo = pesdkLuxeEmiRowBinding4;
        this.emiContentContainer = linearLayout2;
        this.emiErrorFetchMsg = ajioTextView;
        this.emiInfo = ajioTextView2;
        this.emiPayment = ajioCustomExpandablePanel2;
        this.emiRefreshButton = linearLayout3;
        this.emiRetryContainer = linearLayout4;
        this.emiShimmerRootView = shimmerFrameLayout;
        this.emiToggleExpand = pEToggleButton;
        this.viewEmiTvShowMorebank = ajioTextView3;
    }

    public static PesdkLuxeRowEmiBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.content_container;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (LinearLayout)view2;
        if (view3 != null && (view2 = dd2_2.a(n3 = R$id.emi_bank_four, view)) != null) {
            PesdkLuxeEmiRowBinding pesdkLuxeEmiRowBinding = PesdkLuxeEmiRowBinding.bind(view2);
            n3 = R$id.emi_bank_one;
            view2 = dd2_2.a(n3, view);
            if (view2 != null) {
                PesdkLuxeEmiRowBinding pesdkLuxeEmiRowBinding2 = PesdkLuxeEmiRowBinding.bind(view2);
                n3 = R$id.emi_bank_three;
                view2 = dd2_2.a(n3, view);
                if (view2 != null) {
                    PesdkLuxeEmiRowBinding pesdkLuxeEmiRowBinding3 = PesdkLuxeEmiRowBinding.bind(view2);
                    n3 = R$id.emi_bank_two;
                    view2 = dd2_2.a(n3, view);
                    if (view2 != null) {
                        PesdkLuxeEmiRowBinding pesdkLuxeEmiRowBinding4 = PesdkLuxeEmiRowBinding.bind(view2);
                        n3 = R$id.emi_contentContainer;
                        View view4 = view2 = dd2_2.a(n3, view);
                        view4 = (LinearLayout)view2;
                        if (view4 != null) {
                            n3 = R$id.emi_error_fetch_msg;
                            Object object2 = view2 = dd2_2.a(n3, view);
                            object2 = (AjioTextView)view2;
                            if (object2 != null) {
                                n3 = R$id.emi_info;
                                Object object3 = view2 = dd2_2.a(n3, view);
                                object3 = (AjioTextView)view2;
                                if (object3 != null) {
                                    Object object4 = view;
                                    object4 = (AjioCustomExpandablePanel)view;
                                    n3 = R$id.emi_refresh_button;
                                    View view5 = view2 = dd2_2.a(n3, view);
                                    view5 = (LinearLayout)view2;
                                    if (view5 != null) {
                                        n3 = R$id.emi_retry_container;
                                        View view6 = view2 = dd2_2.a(n3, view);
                                        view6 = (LinearLayout)view2;
                                        if (view6 != null) {
                                            n3 = R$id.emiShimmerRootView;
                                            Object object5 = view2 = dd2_2.a(n3, view);
                                            object5 = (ShimmerFrameLayout)view2;
                                            if (object5 != null) {
                                                n3 = R$id.emi_toggle_expand;
                                                Object object6 = view2 = dd2_2.a(n3, view);
                                                object6 = (PEToggleButton)view2;
                                                if (object6 != null) {
                                                    n3 = R$id.view_emi_tv_showMorebank;
                                                    Object object7 = view2 = dd2_2.a(n3, view);
                                                    object7 = (AjioTextView)view2;
                                                    if (object7 != null) {
                                                        object = new PesdkLuxeRowEmiBinding((AjioCustomExpandablePanel)((Object)object4), (LinearLayout)view3, pesdkLuxeEmiRowBinding, pesdkLuxeEmiRowBinding2, pesdkLuxeEmiRowBinding3, pesdkLuxeEmiRowBinding4, (LinearLayout)view4, (AjioTextView)object2, (AjioTextView)object3, (AjioCustomExpandablePanel)((Object)object4), (LinearLayout)view5, (LinearLayout)view6, (ShimmerFrameLayout)((Object)object5), (PEToggleButton)object6, (AjioTextView)object7);
                                                        return object;
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

    public static PesdkLuxeRowEmiBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxeRowEmiBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxeRowEmiBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_luxe_row_emi;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxeRowEmiBinding.bind((View)layoutInflater);
    }

    public AjioCustomExpandablePanel getRoot() {
        return this.rootView;
    }
}

