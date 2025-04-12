/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.ImageView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioZoomViewPager;
import com.ril.ajio.customviews.widgets.DynamicCirclePageIndicator;

public final class FragmentZoomPagerBinding
implements BC3 {
    public final ImageView ivZoomimageLefticon;
    public final ImageView ivZoomimageRighticon;
    public final ImageButton productGalleryClose;
    public final ConstraintLayout relativeLayout2;
    private final ConstraintLayout rootView;
    public final DynamicCirclePageIndicator viewPagerIndicator;
    public final AjioZoomViewPager viewpager;

    private FragmentZoomPagerBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ImageButton imageButton, ConstraintLayout constraintLayout2, DynamicCirclePageIndicator dynamicCirclePageIndicator, AjioZoomViewPager ajioZoomViewPager) {
        this.rootView = constraintLayout;
        this.ivZoomimageLefticon = imageView;
        this.ivZoomimageRighticon = imageView2;
        this.productGalleryClose = imageButton;
        this.relativeLayout2 = constraintLayout2;
        this.viewPagerIndicator = dynamicCirclePageIndicator;
        this.viewpager = ajioZoomViewPager;
    }

    public static FragmentZoomPagerBinding bind(View object) {
        View view;
        int n3 = R$id.iv_zoomimage_lefticon;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.iv_zoomimage_righticon;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.product_gallery_close;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageButton)view;
                if (view4 != null) {
                    Object object2 = object;
                    object2 = (ConstraintLayout)((Object)object);
                    n3 = R$id.view_pager_indicator;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (DynamicCirclePageIndicator)view;
                    if (view5 != null) {
                        n3 = R$id.viewpager;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (AjioZoomViewPager)view;
                        if (object3 != null) {
                            object = new FragmentZoomPagerBinding((ConstraintLayout)((Object)object2), (ImageView)view2, (ImageView)view3, (ImageButton)view4, (ConstraintLayout)((Object)object2), (DynamicCirclePageIndicator)view5, (AjioZoomViewPager)((Object)object3));
                            return object;
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

    public static FragmentZoomPagerBinding inflate(LayoutInflater layoutInflater) {
        return FragmentZoomPagerBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentZoomPagerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_zoom_pager;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentZoomPagerBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

