/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FiltersAppliedShimmerBinding
implements BC3 {
    public final View plpFilterShimmer1;
    public final View plpFilterShimmer10;
    public final View plpFilterShimmer2;
    public final View plpFilterShimmer3;
    public final View plpFilterShimmer4;
    public final View plpFilterShimmer5;
    public final View plpFilterShimmer6;
    public final View plpFilterShimmer7;
    public final View plpFilterShimmer8;
    public final View plpFilterShimmer9;
    public final RelativeLayout plpFilterShimmerRl1;
    public final RelativeLayout plpFilterShimmerRl2;
    public final RelativeLayout plpFilterShimmerRl3;
    private final RelativeLayout rootView;
    public final LinearLayout topContainer;

    private FiltersAppliedShimmerBinding(RelativeLayout relativeLayout, View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, LinearLayout linearLayout) {
        this.rootView = relativeLayout;
        this.plpFilterShimmer1 = view;
        this.plpFilterShimmer10 = view2;
        this.plpFilterShimmer2 = view3;
        this.plpFilterShimmer3 = view4;
        this.plpFilterShimmer4 = view5;
        this.plpFilterShimmer5 = view6;
        this.plpFilterShimmer6 = view7;
        this.plpFilterShimmer7 = view8;
        this.plpFilterShimmer8 = view9;
        this.plpFilterShimmer9 = view10;
        this.plpFilterShimmerRl1 = relativeLayout2;
        this.plpFilterShimmerRl2 = relativeLayout3;
        this.plpFilterShimmerRl3 = relativeLayout4;
        this.topContainer = linearLayout;
    }

    public static FiltersAppliedShimmerBinding bind(View view) {
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        View view8;
        View view9;
        View view10;
        Object object = view;
        int n3 = R$id.plp_filter_shimmer_1;
        View view11 = dd2_2.a(n3, view);
        if (view11 != null && (view10 = dd2_2.a(n3 = R$id.plp_filter_shimmer_10, view)) != null && (view9 = dd2_2.a(n3 = R$id.plp_filter_shimmer_2, view)) != null && (view8 = dd2_2.a(n3 = R$id.plp_filter_shimmer_3, view)) != null && (view7 = dd2_2.a(n3 = R$id.plp_filter_shimmer_4, view)) != null && (view6 = dd2_2.a(n3 = R$id.plp_filter_shimmer_5, view)) != null && (view5 = dd2_2.a(n3 = R$id.plp_filter_shimmer_6, view)) != null && (view4 = dd2_2.a(n3 = R$id.plp_filter_shimmer_7, view)) != null && (view3 = dd2_2.a(n3 = R$id.plp_filter_shimmer_8, view)) != null && (view2 = dd2_2.a(n3 = R$id.plp_filter_shimmer_9, view)) != null) {
            Object object2;
            n3 = R$id.plp_filter_shimmer_rl_1;
            View view12 = object2 = dd2_2.a(n3, view);
            view12 = (RelativeLayout)object2;
            if (view12 != null) {
                n3 = R$id.plp_filter_shimmer_rl_2;
                View view13 = object2 = dd2_2.a(n3, view);
                view13 = (RelativeLayout)object2;
                if (view13 != null) {
                    n3 = R$id.plp_filter_shimmer_rl_3;
                    View view14 = object2 = dd2_2.a(n3, view);
                    view14 = (RelativeLayout)object2;
                    if (view14 != null) {
                        n3 = R$id.top_container;
                        View view15 = object2 = dd2_2.a(n3, view);
                        view15 = (LinearLayout)object2;
                        if (view15 != null) {
                            FiltersAppliedShimmerBinding filtersAppliedShimmerBinding;
                            View view16 = view;
                            view16 = (RelativeLayout)view;
                            object2 = filtersAppliedShimmerBinding;
                            filtersAppliedShimmerBinding = new FiltersAppliedShimmerBinding((RelativeLayout)view16, view11, view10, view9, view8, view7, view6, view5, view4, view3, view2, (RelativeLayout)view12, (RelativeLayout)view13, (RelativeLayout)view14, (LinearLayout)view15);
                            return filtersAppliedShimmerBinding;
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

    public static FiltersAppliedShimmerBinding inflate(LayoutInflater layoutInflater) {
        return FiltersAppliedShimmerBinding.inflate(layoutInflater, null, false);
    }

    public static FiltersAppliedShimmerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.filters_applied_shimmer;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FiltersAppliedShimmerBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

