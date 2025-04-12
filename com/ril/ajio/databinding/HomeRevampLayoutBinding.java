/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.SeparatorLineBinding;
import com.ril.ajio.home.category.revamp.AjioDrawerLayout;

public final class HomeRevampLayoutBinding
implements BC3 {
    public final AjioLoaderView ajioLoaderView;
    public final AppBarLayout appbarLayout;
    public final FrameLayout content;
    public final AjioDrawerLayout drawerLayout;
    public final LinearLayout linToolbarLayout;
    public final TabLayout luxeBottomTab;
    public final FragmentContainerView navFrgContainer;
    public final LinearLayout notification;
    public final AjioTextView notificationText;
    private final AjioDrawerLayout rootView;
    public final LinearLayout separatorLineContainer;
    public final SeparatorLineBinding tabDivider;
    public final TabLayout tabs;
    public final AjioCustomToolbar toolbar;

    private HomeRevampLayoutBinding(AjioDrawerLayout ajioDrawerLayout, AjioLoaderView ajioLoaderView, AppBarLayout appBarLayout, FrameLayout frameLayout, AjioDrawerLayout ajioDrawerLayout2, LinearLayout linearLayout, TabLayout tabLayout, FragmentContainerView fragmentContainerView, LinearLayout linearLayout2, AjioTextView ajioTextView, LinearLayout linearLayout3, SeparatorLineBinding separatorLineBinding, TabLayout tabLayout2, AjioCustomToolbar ajioCustomToolbar) {
        this.rootView = ajioDrawerLayout;
        this.ajioLoaderView = ajioLoaderView;
        this.appbarLayout = appBarLayout;
        this.content = frameLayout;
        this.drawerLayout = ajioDrawerLayout2;
        this.linToolbarLayout = linearLayout;
        this.luxeBottomTab = tabLayout;
        this.navFrgContainer = fragmentContainerView;
        this.notification = linearLayout2;
        this.notificationText = ajioTextView;
        this.separatorLineContainer = linearLayout3;
        this.tabDivider = separatorLineBinding;
        this.tabs = tabLayout2;
        this.toolbar = ajioCustomToolbar;
    }

    public static HomeRevampLayoutBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.ajio_loader_view;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioLoaderView)view2;
        if (object2 != null) {
            n3 = R$id.appbar_layout;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AppBarLayout)view2;
            if (object3 != null) {
                n3 = R$id.content;
                View view3 = view2 = dd2_2.a(n3, view);
                view3 = (FrameLayout)view2;
                if (view3 != null) {
                    Object object4 = view;
                    object4 = (AjioDrawerLayout)view;
                    n3 = R$id.lin_toolbar_layout;
                    View view4 = view2 = dd2_2.a(n3, view);
                    view4 = (LinearLayout)view2;
                    if (view4 != null) {
                        n3 = R$id.luxeBottomTab;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (TabLayout)view2;
                        if (object5 != null) {
                            n3 = R$id.nav_frg_container;
                            Object object6 = view2 = dd2_2.a(n3, view);
                            object6 = (FragmentContainerView)view2;
                            if (object6 != null) {
                                n3 = R$id.notification;
                                View view5 = view2 = dd2_2.a(n3, view);
                                view5 = (LinearLayout)view2;
                                if (view5 != null) {
                                    n3 = R$id.notification_text;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AjioTextView)view2;
                                    if (object7 != null) {
                                        n3 = R$id.separator_line_container;
                                        View view6 = view2 = dd2_2.a(n3, view);
                                        view6 = (LinearLayout)view2;
                                        if (view6 != null && (view2 = dd2_2.a(n3 = R$id.tab_divider, view)) != null) {
                                            SeparatorLineBinding separatorLineBinding = SeparatorLineBinding.bind(view2);
                                            n3 = R$id.tabs;
                                            Object object8 = view2 = dd2_2.a(n3, view);
                                            object8 = (TabLayout)view2;
                                            if (object8 != null) {
                                                n3 = R$id.toolbar;
                                                Object object9 = view2 = dd2_2.a(n3, view);
                                                object9 = (AjioCustomToolbar)view2;
                                                if (object9 != null) {
                                                    object = new HomeRevampLayoutBinding((AjioDrawerLayout)((Object)object4), (AjioLoaderView)((Object)object2), (AppBarLayout)object3, (FrameLayout)view3, (AjioDrawerLayout)((Object)object4), (LinearLayout)view4, (TabLayout)((Object)object5), (FragmentContainerView)((Object)object6), (LinearLayout)view5, (AjioTextView)object7, (LinearLayout)view6, separatorLineBinding, (TabLayout)((Object)object8), (AjioCustomToolbar)object9);
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
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static HomeRevampLayoutBinding inflate(LayoutInflater layoutInflater) {
        return HomeRevampLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static HomeRevampLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.home_revamp_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HomeRevampLayoutBinding.bind((View)layoutInflater);
    }

    public AjioDrawerLayout getRoot() {
        return this.rootView;
    }
}

