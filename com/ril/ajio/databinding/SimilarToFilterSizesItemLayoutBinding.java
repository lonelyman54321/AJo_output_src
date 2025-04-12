/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class SimilarToFilterSizesItemLayoutBinding
implements BC3 {
    private final RelativeLayout rootView;
    public final RelativeLayout selectedViewRl;
    public final RelativeLayout similarToSizeItemContainerRl;
    public final AjioTextView sizeTv;
    public final AjioTextView sizeTvUnselected;
    public final RelativeLayout unselectedViewRl;

    private SimilarToFilterSizesItemLayoutBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, AjioTextView ajioTextView, AjioTextView ajioTextView2, RelativeLayout relativeLayout4) {
        this.rootView = relativeLayout;
        this.selectedViewRl = relativeLayout2;
        this.similarToSizeItemContainerRl = relativeLayout3;
        this.sizeTv = ajioTextView;
        this.sizeTvUnselected = ajioTextView2;
        this.unselectedViewRl = relativeLayout4;
    }

    public static SimilarToFilterSizesItemLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.selected_view_rl;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (RelativeLayout)view;
        if (view2 != null) {
            View view3 = object;
            view3 = (RelativeLayout)object;
            n3 = R$id.sizeTv;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.sizeTv_unselected;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (AjioTextView)view;
                if (object3 != null) {
                    n3 = R$id.unselected_view_rl;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (RelativeLayout)view;
                    if (view4 != null) {
                        object = new SimilarToFilterSizesItemLayoutBinding((RelativeLayout)view3, (RelativeLayout)view2, (RelativeLayout)view3, (AjioTextView)object2, (AjioTextView)object3, (RelativeLayout)view4);
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static SimilarToFilterSizesItemLayoutBinding inflate(LayoutInflater layoutInflater) {
        return SimilarToFilterSizesItemLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static SimilarToFilterSizesItemLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.similar_to_filter_sizes_item_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return SimilarToFilterSizesItemLayoutBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

