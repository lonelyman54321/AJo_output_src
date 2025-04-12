/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.ScrollView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.ShimmerBottomSectionPdpBinding;

public final class NewPdpShimmerLayoutBinding
implements BC3 {
    public final View divider1;
    public final View divider2;
    public final ShimmerBottomSectionPdpBinding firstBottomSection;
    public final ShimmerBottomSectionPdpBinding lastBottomSection;
    public final View leftWiderImage;
    public final LinearLayout middleBarContainer;
    public final View rightThinnerImage;
    private final ScrollView rootView;

    private NewPdpShimmerLayoutBinding(ScrollView scrollView, View view, View view2, ShimmerBottomSectionPdpBinding shimmerBottomSectionPdpBinding, ShimmerBottomSectionPdpBinding shimmerBottomSectionPdpBinding2, View view3, LinearLayout linearLayout, View view4) {
        this.rootView = scrollView;
        this.divider1 = view;
        this.divider2 = view2;
        this.firstBottomSection = shimmerBottomSectionPdpBinding;
        this.lastBottomSection = shimmerBottomSectionPdpBinding2;
        this.leftWiderImage = view3;
        this.middleBarContainer = linearLayout;
        this.rightThinnerImage = view4;
    }

    public static NewPdpShimmerLayoutBinding bind(View object) {
        Object object2;
        View view;
        int n3 = R$id.divider1;
        View view2 = dd2_2.a(n3, object);
        if (view2 != null && (view = dd2_2.a(n3 = R$id.divider2, object)) != null && (object2 = dd2_2.a(n3 = R$id.first_bottom_section, object)) != null) {
            ShimmerBottomSectionPdpBinding shimmerBottomSectionPdpBinding = ShimmerBottomSectionPdpBinding.bind(object2);
            n3 = R$id.last_bottom_section;
            object2 = dd2_2.a(n3, object);
            if (object2 != null) {
                ShimmerBottomSectionPdpBinding shimmerBottomSectionPdpBinding2 = ShimmerBottomSectionPdpBinding.bind(object2);
                n3 = R$id.left_wider_image;
                View view3 = dd2_2.a(n3, object);
                if (view3 != null) {
                    View view4;
                    n3 = R$id.middle_bar_container;
                    View view5 = object2 = dd2_2.a(n3, object);
                    view5 = (LinearLayout)object2;
                    if (view5 != null && (view4 = dd2_2.a(n3 = R$id.right_thinner_image, object)) != null) {
                        NewPdpShimmerLayoutBinding newPdpShimmerLayoutBinding;
                        Object object3 = object;
                        object3 = (ScrollView)object;
                        object2 = newPdpShimmerLayoutBinding;
                        newPdpShimmerLayoutBinding = new NewPdpShimmerLayoutBinding((ScrollView)object3, view2, view, shimmerBottomSectionPdpBinding, shimmerBottomSectionPdpBinding2, view3, (LinearLayout)view5, view4);
                        return newPdpShimmerLayoutBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewPdpShimmerLayoutBinding inflate(LayoutInflater layoutInflater) {
        return NewPdpShimmerLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static NewPdpShimmerLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_pdp_shimmer_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewPdpShimmerLayoutBinding.bind((View)layoutInflater);
    }

    public ScrollView getRoot() {
        return this.rootView;
    }
}

