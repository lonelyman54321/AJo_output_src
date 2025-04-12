/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.TopToolbarIconsRevampLuxeBinding;

public final class TopToolbarHomeRevampLuxeBinding
implements BC3 {
    public final TopToolbarIconsRevampLuxeBinding ajioIconsView;
    public final ConstraintLayout categoryLytLuxeRevamp;
    public final TextView categoryTitle;
    private final ConstraintLayout rootView;
    public final ImageView searchBarStaticIvRevampLuxe;
    public final TextView searchBarStaticTvRevampLuxe;
    public final ConstraintLayout searchLytParentLuxeRevamp;
    public final LottieAnimationView toolbarSearchImgRevampLuxe;
    public final ConstraintLayout topToolbarStaticLayoutRevampLuxe;

    private TopToolbarHomeRevampLuxeBinding(ConstraintLayout constraintLayout, TopToolbarIconsRevampLuxeBinding topToolbarIconsRevampLuxeBinding, ConstraintLayout constraintLayout2, TextView textView, ImageView imageView, TextView textView2, ConstraintLayout constraintLayout3, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout4) {
        this.rootView = constraintLayout;
        this.ajioIconsView = topToolbarIconsRevampLuxeBinding;
        this.categoryLytLuxeRevamp = constraintLayout2;
        this.categoryTitle = textView;
        this.searchBarStaticIvRevampLuxe = imageView;
        this.searchBarStaticTvRevampLuxe = textView2;
        this.searchLytParentLuxeRevamp = constraintLayout3;
        this.toolbarSearchImgRevampLuxe = lottieAnimationView;
        this.topToolbarStaticLayoutRevampLuxe = constraintLayout4;
    }

    public static TopToolbarHomeRevampLuxeBinding bind(View object) {
        int n3 = R$id.ajio_icons_view;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            TopToolbarIconsRevampLuxeBinding topToolbarIconsRevampLuxeBinding = TopToolbarIconsRevampLuxeBinding.bind(view);
            n3 = R$id.category_lyt_luxe_revamp;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (ConstraintLayout)view;
            if (object2 != null) {
                n3 = R$id.category_title;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (TextView)view;
                if (view2 != null) {
                    n3 = R$id.search_bar_static_iv_revamp_luxe;
                    View view3 = view = dd2_2.a(n3, object);
                    view3 = (ImageView)view;
                    if (view3 != null) {
                        n3 = R$id.search_bar_static_tv_revamp_luxe;
                        View view4 = view = dd2_2.a(n3, object);
                        view4 = (TextView)view;
                        if (view4 != null) {
                            n3 = R$id.search_lyt_parent_luxe_revamp;
                            Object object3 = view = dd2_2.a(n3, object);
                            object3 = (ConstraintLayout)view;
                            if (object3 != null) {
                                n3 = R$id.toolbar_search_img_revamp_luxe;
                                Object object4 = view = dd2_2.a(n3, object);
                                object4 = (LottieAnimationView)view;
                                if (object4 != null) {
                                    n3 = R$id.top_toolbar_static_layout_revamp_luxe;
                                    Object object5 = view = dd2_2.a(n3, object);
                                    object5 = (ConstraintLayout)view;
                                    if (object5 != null) {
                                        Object object6 = object;
                                        object6 = (ConstraintLayout)((Object)object);
                                        TopToolbarHomeRevampLuxeBinding topToolbarHomeRevampLuxeBinding = new TopToolbarHomeRevampLuxeBinding((ConstraintLayout)((Object)object6), topToolbarIconsRevampLuxeBinding, (ConstraintLayout)((Object)object2), (TextView)view2, (ImageView)view3, (TextView)view4, (ConstraintLayout)((Object)object3), (LottieAnimationView)((Object)object4), (ConstraintLayout)((Object)object5));
                                        return topToolbarHomeRevampLuxeBinding;
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

    public static TopToolbarHomeRevampLuxeBinding inflate(LayoutInflater layoutInflater) {
        return TopToolbarHomeRevampLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static TopToolbarHomeRevampLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.top_toolbar_home_revamp_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return TopToolbarHomeRevampLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

