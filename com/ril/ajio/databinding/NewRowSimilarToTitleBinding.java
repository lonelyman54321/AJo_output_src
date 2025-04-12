/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.SimilarToFiltersLayoutBinding;

public final class NewRowSimilarToTitleBinding
implements BC3 {
    public final FrameLayout closeIv;
    public final ImageView productImg;
    public final View returnDivider;
    private final ConstraintLayout rootView;
    public final AjioTextView simProdName;
    public final AjioTextView similarProdTo;
    public final SimilarToFiltersLayoutBinding similarToCustomSizeFiltersRl;
    public final RelativeLayout similarToFilterCloseRl;
    public final FrameLayout similarToFilterFl;
    public final RelativeLayout similarToFiltersRl;
    public final ConstraintLayout similarToParentLayout;

    private NewRowSimilarToTitleBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, View view, AjioTextView ajioTextView, AjioTextView ajioTextView2, SimilarToFiltersLayoutBinding similarToFiltersLayoutBinding, RelativeLayout relativeLayout, FrameLayout frameLayout2, RelativeLayout relativeLayout2, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.closeIv = frameLayout;
        this.productImg = imageView;
        this.returnDivider = view;
        this.simProdName = ajioTextView;
        this.similarProdTo = ajioTextView2;
        this.similarToCustomSizeFiltersRl = similarToFiltersLayoutBinding;
        this.similarToFilterCloseRl = relativeLayout;
        this.similarToFilterFl = frameLayout2;
        this.similarToFiltersRl = relativeLayout2;
        this.similarToParentLayout = constraintLayout2;
    }

    public static NewRowSimilarToTitleBinding bind(View object) {
        View view;
        int n3 = R$id.close_iv;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (FrameLayout)view;
        if (view2 != null) {
            View view3;
            n3 = R$id.productImg;
            View view4 = view = dd2_2.a(n3, object);
            view4 = (ImageView)view;
            if (view4 != null && (view3 = dd2_2.a(n3 = R$id.return_divider, object)) != null) {
                n3 = R$id.sim_prod_name;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (AjioTextView)view;
                if (object2 != null) {
                    n3 = R$id.similar_prod_to;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null && (view = dd2_2.a(n3 = R$id.similar_to_custom_size_filters_rl, object)) != null) {
                        SimilarToFiltersLayoutBinding similarToFiltersLayoutBinding = SimilarToFiltersLayoutBinding.bind(view);
                        n3 = R$id.similar_to_filter_close_rl;
                        View view5 = view = dd2_2.a(n3, object);
                        view5 = (RelativeLayout)view;
                        if (view5 != null) {
                            n3 = R$id.similar_to_filter_fl;
                            View view6 = view = dd2_2.a(n3, object);
                            view6 = (FrameLayout)view;
                            if (view6 != null) {
                                n3 = R$id.similar_to_filters_rl;
                                View view7 = view = dd2_2.a(n3, object);
                                view7 = (RelativeLayout)view;
                                if (view7 != null) {
                                    Object object4 = object;
                                    object4 = (ConstraintLayout)((Object)object);
                                    object = new NewRowSimilarToTitleBinding((ConstraintLayout)((Object)object4), (FrameLayout)view2, (ImageView)view4, view3, (AjioTextView)object2, (AjioTextView)object3, similarToFiltersLayoutBinding, (RelativeLayout)view5, (FrameLayout)view6, (RelativeLayout)view7, (ConstraintLayout)((Object)object4));
                                    return object;
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

    public static NewRowSimilarToTitleBinding inflate(LayoutInflater layoutInflater) {
        return NewRowSimilarToTitleBinding.inflate(layoutInflater, null, false);
    }

    public static NewRowSimilarToTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_row_similar_to_title;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewRowSimilarToTitleBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

