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
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LuxePlpFilterLayoutBinding
implements BC3 {
    public final LinearLayout filterFooterLayout;
    public final ConstraintLayout filterParentLyt;
    public final Toolbar filterToolbar;
    public final ImageView filterToolbarNavigationIv;
    public final AjioTextView filterViewApplyFilterTv;
    public final AjioTextView filterViewCancelTv;
    public final RecyclerView filterViewFacetTitleRv;
    public final FrameLayout filterViewFacetValueFragContainer;
    public final AjioTextView filterViewHeadingTv;
    public final AjioTextView filterViewResetFiltersTv;
    public final AjioTextView filterViewSubheadingTv;
    private final ConstraintLayout rootView;

    private LuxePlpFilterLayoutBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, ConstraintLayout constraintLayout2, Toolbar toolbar, ImageView imageView, AjioTextView ajioTextView, AjioTextView ajioTextView2, RecyclerView recyclerView, FrameLayout frameLayout, AjioTextView ajioTextView3, AjioTextView ajioTextView4, AjioTextView ajioTextView5) {
        this.rootView = constraintLayout;
        this.filterFooterLayout = linearLayout;
        this.filterParentLyt = constraintLayout2;
        this.filterToolbar = toolbar;
        this.filterToolbarNavigationIv = imageView;
        this.filterViewApplyFilterTv = ajioTextView;
        this.filterViewCancelTv = ajioTextView2;
        this.filterViewFacetTitleRv = recyclerView;
        this.filterViewFacetValueFragContainer = frameLayout;
        this.filterViewHeadingTv = ajioTextView3;
        this.filterViewResetFiltersTv = ajioTextView4;
        this.filterViewSubheadingTv = ajioTextView5;
    }

    public static LuxePlpFilterLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.filter_footer_layout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            Object object2 = object;
            object2 = (ConstraintLayout)((Object)object);
            n3 = R$id.filter_toolbar;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (Toolbar)view;
            if (object3 != null) {
                n3 = R$id.filter_toolbar_navigation_iv;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (ImageView)view;
                if (view3 != null) {
                    n3 = R$id.filter_view_apply_filter_tv;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (AjioTextView)view;
                    if (object4 != null) {
                        n3 = R$id.filter_view_cancel_tv;
                        Object object5 = view = dd2_2.a(n3, object);
                        object5 = (AjioTextView)view;
                        if (object5 != null) {
                            n3 = R$id.filter_view_facet_title_rv;
                            Object object6 = view = dd2_2.a(n3, object);
                            object6 = (RecyclerView)view;
                            if (object6 != null) {
                                n3 = R$id.filter_view_facet_value_frag_container;
                                View view4 = view = dd2_2.a(n3, object);
                                view4 = (FrameLayout)view;
                                if (view4 != null) {
                                    n3 = R$id.filter_view_heading_tv;
                                    Object object7 = view = dd2_2.a(n3, object);
                                    object7 = (AjioTextView)view;
                                    if (object7 != null) {
                                        n3 = R$id.filter_view_reset_filters_tv;
                                        Object object8 = view = dd2_2.a(n3, object);
                                        object8 = (AjioTextView)view;
                                        if (object8 != null) {
                                            n3 = R$id.filter_view_subheading_tv;
                                            Object object9 = view = dd2_2.a(n3, object);
                                            object9 = (AjioTextView)view;
                                            if (object9 != null) {
                                                object = new LuxePlpFilterLayoutBinding((ConstraintLayout)((Object)object2), (LinearLayout)view2, (ConstraintLayout)((Object)object2), (Toolbar)object3, (ImageView)view3, (AjioTextView)object4, (AjioTextView)object5, (RecyclerView)object6, (FrameLayout)view4, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9);
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static LuxePlpFilterLayoutBinding inflate(LayoutInflater layoutInflater) {
        return LuxePlpFilterLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static LuxePlpFilterLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_plp_filter_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxePlpFilterLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

