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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class RowHeroGridCarouselBinding
implements BC3 {
    public final ImageView componentViewImvOne;
    public final ImageView componentViewImvTwo;
    public final FrameLayout componentViewLayoutClickOne;
    public final FrameLayout componentViewLayoutClickTwo;
    private final RelativeLayout rootView;
    public final RelativeLayout subRowLayoutFrame;

    private RowHeroGridCarouselBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, FrameLayout frameLayout, FrameLayout frameLayout2, RelativeLayout relativeLayout2) {
        this.rootView = relativeLayout;
        this.componentViewImvOne = imageView;
        this.componentViewImvTwo = imageView2;
        this.componentViewLayoutClickOne = frameLayout;
        this.componentViewLayoutClickTwo = frameLayout2;
        this.subRowLayoutFrame = relativeLayout2;
    }

    public static RowHeroGridCarouselBinding bind(View object) {
        View view;
        int n3 = R$id.component_view_imv_one;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.component_view_imv_two;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.component_view_layout_click_one;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (FrameLayout)view;
                if (view4 != null) {
                    n3 = R$id.component_view_layout_click_two;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (FrameLayout)view;
                    if (view5 != null) {
                        Object object2 = object;
                        object2 = (RelativeLayout)object;
                        object = new RowHeroGridCarouselBinding((RelativeLayout)object2, (ImageView)view2, (ImageView)view3, (FrameLayout)view4, (FrameLayout)view5, (RelativeLayout)object2);
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

    public static RowHeroGridCarouselBinding inflate(LayoutInflater layoutInflater) {
        return RowHeroGridCarouselBinding.inflate(layoutInflater, null, false);
    }

    public static RowHeroGridCarouselBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.row_hero_grid_carousel;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return RowHeroGridCarouselBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

