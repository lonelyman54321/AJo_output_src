/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ViewLuxCategoryBinding
implements BC3 {
    public final ImageView categoryImvRevamp;
    public final ImageView categoryLuxImvClose;
    public final ImageView categoryLuxImvSearch;
    public final RelativeLayout categoryLuxLayoutSearch;
    public final TabLayout categoryTabLayout;
    public final ViewPager categoryViewpager;
    public final ImageView luxeIcSideNav;
    private final RelativeLayout rootView;
    public final ConstraintLayout vlcLuxeTabContainer;

    private ViewLuxCategoryBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, RelativeLayout relativeLayout2, TabLayout tabLayout, ViewPager viewPager, ImageView imageView4, ConstraintLayout constraintLayout) {
        this.rootView = relativeLayout;
        this.categoryImvRevamp = imageView;
        this.categoryLuxImvClose = imageView2;
        this.categoryLuxImvSearch = imageView3;
        this.categoryLuxLayoutSearch = relativeLayout2;
        this.categoryTabLayout = tabLayout;
        this.categoryViewpager = viewPager;
        this.luxeIcSideNav = imageView4;
        this.vlcLuxeTabContainer = constraintLayout;
    }

    public static ViewLuxCategoryBinding bind(View object) {
        View view;
        int n3 = R$id.category_imv_revamp;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.category_lux_imv_close;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.category_lux_imv_search;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (ImageView)view;
                if (view4 != null) {
                    n3 = R$id.category_lux_layout_search;
                    View view5 = view = dd2_2.a(n3, object);
                    view5 = (RelativeLayout)view;
                    if (view5 != null) {
                        n3 = R$id.category_tabLayout;
                        Object object2 = view = dd2_2.a(n3, object);
                        object2 = (TabLayout)view;
                        if (object2 != null) {
                            n3 = R$id.category_viewpager;
                            Object object3 = view = dd2_2.a(n3, object);
                            object3 = (ViewPager)view;
                            if (object3 != null) {
                                n3 = R$id.luxe_ic_side_nav;
                                View view6 = view = dd2_2.a(n3, object);
                                view6 = (ImageView)view;
                                if (view6 != null) {
                                    n3 = R$id.vlcLuxeTabContainer;
                                    Object object4 = view = dd2_2.a(n3, object);
                                    object4 = (ConstraintLayout)view;
                                    if (object4 != null) {
                                        Object object5 = object;
                                        object5 = (RelativeLayout)object;
                                        ViewLuxCategoryBinding viewLuxCategoryBinding = new ViewLuxCategoryBinding((RelativeLayout)object5, (ImageView)view2, (ImageView)view3, (ImageView)view4, (RelativeLayout)view5, (TabLayout)((Object)object2), (ViewPager)((Object)object3), (ImageView)view6, (ConstraintLayout)((Object)object4));
                                        return viewLuxCategoryBinding;
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

    public static ViewLuxCategoryBinding inflate(LayoutInflater layoutInflater) {
        return ViewLuxCategoryBinding.inflate(layoutInflater, null, false);
    }

    public static ViewLuxCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_lux_category;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewLuxCategoryBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

