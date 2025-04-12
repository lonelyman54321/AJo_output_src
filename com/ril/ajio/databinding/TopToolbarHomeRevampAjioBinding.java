/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.TopToolbarIconsRevampAjioBinding;

public final class TopToolbarHomeRevampAjioBinding
implements BC3 {
    public final TopToolbarIconsRevampAjioBinding ajioIconsView;
    public final ImageView cameraIvAjioRevamp;
    public final LinearLayout categoryLytAjioRevamp;
    public final TextView categoryTitle;
    public final ConstraintLayout clMainToolbar;
    public final ImageView closeBtnCategory;
    private final ConstraintLayout rootView;
    public final ImageView searchBarStaticIvRevampAjio;
    public final TextView searchBarStaticTvRevampAjio;
    public final ConstraintLayout searchLytParentAjioRevamp;
    public final LottieAnimationView toolbarSearchImgRevampAjio;
    public final ConstraintLayout topToolbarStaticLayoutRevampAjio;

    private TopToolbarHomeRevampAjioBinding(ConstraintLayout constraintLayout, TopToolbarIconsRevampAjioBinding topToolbarIconsRevampAjioBinding, ImageView imageView, LinearLayout linearLayout, TextView textView, ConstraintLayout constraintLayout2, ImageView imageView2, ImageView imageView3, TextView textView2, ConstraintLayout constraintLayout3, LottieAnimationView lottieAnimationView, ConstraintLayout constraintLayout4) {
        this.rootView = constraintLayout;
        this.ajioIconsView = topToolbarIconsRevampAjioBinding;
        this.cameraIvAjioRevamp = imageView;
        this.categoryLytAjioRevamp = linearLayout;
        this.categoryTitle = textView;
        this.clMainToolbar = constraintLayout2;
        this.closeBtnCategory = imageView2;
        this.searchBarStaticIvRevampAjio = imageView3;
        this.searchBarStaticTvRevampAjio = textView2;
        this.searchLytParentAjioRevamp = constraintLayout3;
        this.toolbarSearchImgRevampAjio = lottieAnimationView;
        this.topToolbarStaticLayoutRevampAjio = constraintLayout4;
    }

    public static TopToolbarHomeRevampAjioBinding bind(View object) {
        int n3 = R$id.ajio_icons_view;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            TopToolbarIconsRevampAjioBinding topToolbarIconsRevampAjioBinding = TopToolbarIconsRevampAjioBinding.bind(view);
            n3 = R$id.camera_iv_ajio_revamp;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.category_lyt_ajio_revamp;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (LinearLayout)view;
                if (view3 != null) {
                    n3 = R$id.category_title;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        n3 = R$id.cl_main_toolbar;
                        Object object2 = view = dd2_2.a(n3, object);
                        object2 = (ConstraintLayout)view;
                        if (object2 != null) {
                            n3 = R$id.close_btn_category;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (ImageView)view;
                            if (view5 != null) {
                                n3 = R$id.search_bar_static_iv_revamp_ajio;
                                View view6 = view = dd2_2.a(n3, object);
                                view6 = (ImageView)view;
                                if (view6 != null) {
                                    n3 = R$id.search_bar_static_tv_revamp_ajio;
                                    View view7 = view = dd2_2.a(n3, object);
                                    view7 = (TextView)view;
                                    if (view7 != null) {
                                        n3 = R$id.search_lyt_parent_ajio_revamp;
                                        Object object3 = view = dd2_2.a(n3, object);
                                        object3 = (ConstraintLayout)view;
                                        if (object3 != null) {
                                            n3 = R$id.toolbar_search_img_revamp_ajio;
                                            Object object4 = view = dd2_2.a(n3, object);
                                            object4 = (LottieAnimationView)view;
                                            if (object4 != null) {
                                                n3 = R$id.top_toolbar_static_layout_revamp_ajio;
                                                Object object5 = view = dd2_2.a(n3, object);
                                                object5 = (ConstraintLayout)view;
                                                if (object5 != null) {
                                                    Object object6 = object;
                                                    object6 = (ConstraintLayout)((Object)object);
                                                    TopToolbarHomeRevampAjioBinding topToolbarHomeRevampAjioBinding = new TopToolbarHomeRevampAjioBinding((ConstraintLayout)((Object)object6), topToolbarIconsRevampAjioBinding, (ImageView)view2, (LinearLayout)view3, (TextView)view4, (ConstraintLayout)((Object)object2), (ImageView)view5, (ImageView)view6, (TextView)view7, (ConstraintLayout)((Object)object3), (LottieAnimationView)((Object)object4), (ConstraintLayout)((Object)object5));
                                                    return topToolbarHomeRevampAjioBinding;
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
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static TopToolbarHomeRevampAjioBinding inflate(LayoutInflater layoutInflater) {
        return TopToolbarHomeRevampAjioBinding.inflate(layoutInflater, null, false);
    }

    public static TopToolbarHomeRevampAjioBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.top_toolbar_home_revamp_ajio;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return TopToolbarHomeRevampAjioBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

