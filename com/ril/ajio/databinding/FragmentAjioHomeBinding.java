/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.AddressBarUiBinding;
import com.ril.ajio.databinding.LayoutHomeShimmerRevampBinding;
import com.ril.ajio.databinding.LayoutLandingPageSearchBinding;
import com.ril.ajio.databinding.LayoutLuxeToolbarBinding;
import com.ril.ajio.databinding.PageErrorHomePageBinding;
import com.ril.ajio.databinding.RefereeWidgetLayoutBinding;
import com.ril.ajio.databinding.StoreSecondarySplashLayoutBinding;
import com.ril.ajio.databinding.TopBarNavigationShimmerBinding;
import com.ril.ajio.databinding.TopToolbarHomeRevampAjioBinding;
import com.ril.ajio.databinding.TopToolbarHomeRevampLuxeBinding;
import com.ril.ajio.utility.customview.InAppBottomUpdatesView;

public final class FragmentAjioHomeBinding
implements BC3 {
    public final AddressBarUiBinding addressBarUiAjio;
    public final AddressBarUiBinding addressBarUiLuxe;
    public final AppBarLayout appBarLayout2;
    public final ConstraintLayout clFloatingVideoView;
    public final ConstraintLayout clFloatingView;
    public final PlayerView draggableMiniPlayer;
    public final PageErrorHomePageBinding errorContainer;
    public final AppBarLayout fahAppBarLayout;
    public final AjioImageView fahIvAjioLogo;
    public final AjioImageView fahIvDropdown;
    public final AjioImageView fahIvMenu;
    public final ConstraintLayout fahLayoutTopbar;
    public final ConstraintLayout fahLuxeTabContainer;
    public final TabLayout fahLuxeTabLayout;
    public final AppCompatImageView fahNotiIcon;
    public final AjioProgressView fahPbLoading;
    public final RefereeWidgetLayoutBinding fahRefereeWidget;
    public final LayoutLandingPageSearchBinding fahSearchLayout;
    public final LayoutLuxeToolbarBinding fahTbLuxe;
    public final TextView fahTvNotification;
    public final TextView fahTvStoreName;
    public final FrameLayout homeCmsShimmerParent;
    public final RecyclerView homeListRV;
    public final CoordinatorLayout homeParentLyt;
    public final AjioImageView imageGifPlayer;
    public final ImageView imgClose;
    public final ImageView imgFullScreen;
    public final ImageView imgVolume;
    public final LayoutHomeShimmerRevampBinding layoutHomeShimmer;
    public final TopBarNavigationShimmerBinding layoutTopNavTabShimmer;
    private final CoordinatorLayout rootView;
    public final RecyclerView rvTopCollapsing;
    public final StoreSecondarySplashLayoutBinding splashToCoachLyt;
    public final FrameLayout tabNavshimmerParent;
    public final TopToolbarHomeRevampAjioBinding topToolbarAjioLytRevamp;
    public final TopToolbarHomeRevampLuxeBinding topToolbarLuxeLytRevamp;
    public final AjioTextView tvDuration;
    public final InAppBottomUpdatesView updateBottomWidget;

    private FragmentAjioHomeBinding(CoordinatorLayout coordinatorLayout, AddressBarUiBinding addressBarUiBinding, AddressBarUiBinding addressBarUiBinding2, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, PlayerView playerView, PageErrorHomePageBinding pageErrorHomePageBinding, AppBarLayout appBarLayout2, AjioImageView ajioImageView, AjioImageView ajioImageView2, AjioImageView ajioImageView3, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, TabLayout tabLayout, AppCompatImageView appCompatImageView, AjioProgressView ajioProgressView, RefereeWidgetLayoutBinding refereeWidgetLayoutBinding, LayoutLandingPageSearchBinding layoutLandingPageSearchBinding, LayoutLuxeToolbarBinding layoutLuxeToolbarBinding, TextView textView, TextView textView2, FrameLayout frameLayout, RecyclerView recyclerView, CoordinatorLayout coordinatorLayout2, AjioImageView ajioImageView4, ImageView imageView, ImageView imageView2, ImageView imageView3, LayoutHomeShimmerRevampBinding layoutHomeShimmerRevampBinding, TopBarNavigationShimmerBinding topBarNavigationShimmerBinding, RecyclerView recyclerView2, StoreSecondarySplashLayoutBinding storeSecondarySplashLayoutBinding, FrameLayout frameLayout2, TopToolbarHomeRevampAjioBinding topToolbarHomeRevampAjioBinding, TopToolbarHomeRevampLuxeBinding topToolbarHomeRevampLuxeBinding, AjioTextView ajioTextView, InAppBottomUpdatesView inAppBottomUpdatesView) {
        this.rootView = coordinatorLayout;
        this.addressBarUiAjio = addressBarUiBinding;
        this.addressBarUiLuxe = addressBarUiBinding2;
        this.appBarLayout2 = appBarLayout;
        this.clFloatingVideoView = constraintLayout;
        this.clFloatingView = constraintLayout2;
        this.draggableMiniPlayer = playerView;
        this.errorContainer = pageErrorHomePageBinding;
        this.fahAppBarLayout = appBarLayout2;
        this.fahIvAjioLogo = ajioImageView;
        this.fahIvDropdown = ajioImageView2;
        this.fahIvMenu = ajioImageView3;
        this.fahLayoutTopbar = constraintLayout3;
        this.fahLuxeTabContainer = constraintLayout4;
        this.fahLuxeTabLayout = tabLayout;
        this.fahNotiIcon = appCompatImageView;
        this.fahPbLoading = ajioProgressView;
        this.fahRefereeWidget = refereeWidgetLayoutBinding;
        this.fahSearchLayout = layoutLandingPageSearchBinding;
        this.fahTbLuxe = layoutLuxeToolbarBinding;
        this.fahTvNotification = textView;
        this.fahTvStoreName = textView2;
        this.homeCmsShimmerParent = frameLayout;
        this.homeListRV = recyclerView;
        this.homeParentLyt = coordinatorLayout2;
        this.imageGifPlayer = ajioImageView4;
        this.imgClose = imageView;
        this.imgFullScreen = imageView2;
        this.imgVolume = imageView3;
        this.layoutHomeShimmer = layoutHomeShimmerRevampBinding;
        this.layoutTopNavTabShimmer = topBarNavigationShimmerBinding;
        this.rvTopCollapsing = recyclerView2;
        this.splashToCoachLyt = storeSecondarySplashLayoutBinding;
        this.tabNavshimmerParent = frameLayout2;
        this.topToolbarAjioLytRevamp = topToolbarHomeRevampAjioBinding;
        this.topToolbarLuxeLytRevamp = topToolbarHomeRevampLuxeBinding;
        this.tvDuration = ajioTextView;
        this.updateBottomWidget = inAppBottomUpdatesView;
    }

    public static FragmentAjioHomeBinding bind(View view) {
        Object object = view;
        int n3 = R$id.address_bar_ui_ajio;
        View view2 = dd2_2.a(n3, view);
        if (view2 != null) {
            AddressBarUiBinding addressBarUiBinding = AddressBarUiBinding.bind(view2);
            n3 = R$id.address_bar_ui_luxe;
            view2 = dd2_2.a(n3, view);
            if (view2 != null) {
                AddressBarUiBinding addressBarUiBinding2 = AddressBarUiBinding.bind(view2);
                n3 = R$id.appBarLayout2;
                Object object2 = view2 = dd2_2.a(n3, view);
                object2 = (AppBarLayout)view2;
                if (object2 != null) {
                    n3 = R$id.clFloatingVideoView;
                    Object object3 = view2 = dd2_2.a(n3, view);
                    object3 = (ConstraintLayout)view2;
                    if (object3 != null) {
                        n3 = R$id.clFloatingView;
                        Object object4 = view2 = dd2_2.a(n3, view);
                        object4 = (ConstraintLayout)view2;
                        if (object4 != null) {
                            n3 = R$id.draggableMiniPlayer;
                            Object object5 = view2 = dd2_2.a(n3, view);
                            object5 = (PlayerView)view2;
                            if (object5 != null && (view2 = dd2_2.a(n3 = R$id.error_container, view)) != null) {
                                PageErrorHomePageBinding pageErrorHomePageBinding = PageErrorHomePageBinding.bind(view2);
                                n3 = R$id.fahAppBarLayout;
                                Object object6 = view2 = dd2_2.a(n3, view);
                                object6 = (AppBarLayout)view2;
                                if (object6 != null) {
                                    n3 = R$id.fahIvAjioLogo;
                                    Object object7 = view2 = dd2_2.a(n3, view);
                                    object7 = (AjioImageView)view2;
                                    if (object7 != null) {
                                        n3 = R$id.fahIvDropdown;
                                        Object object8 = view2 = dd2_2.a(n3, view);
                                        object8 = (AjioImageView)view2;
                                        if (object8 != null) {
                                            n3 = R$id.fahIvMenu;
                                            Object object9 = view2 = dd2_2.a(n3, view);
                                            object9 = (AjioImageView)view2;
                                            if (object9 != null) {
                                                n3 = R$id.fahLayoutTopbar;
                                                Object object10 = view2 = dd2_2.a(n3, view);
                                                object10 = (ConstraintLayout)view2;
                                                if (object10 != null) {
                                                    n3 = R$id.fahLuxeTabContainer;
                                                    Object object11 = view2 = dd2_2.a(n3, view);
                                                    object11 = (ConstraintLayout)view2;
                                                    if (object11 != null) {
                                                        n3 = R$id.fahLuxeTabLayout;
                                                        Object object12 = view2 = dd2_2.a(n3, view);
                                                        object12 = (TabLayout)view2;
                                                        if (object12 != null) {
                                                            n3 = R$id.fahNotiIcon;
                                                            Object object13 = view2 = dd2_2.a(n3, view);
                                                            object13 = (AppCompatImageView)view2;
                                                            if (object13 != null) {
                                                                n3 = R$id.fahPbLoading;
                                                                Object object14 = view2 = dd2_2.a(n3, view);
                                                                object14 = (AjioProgressView)view2;
                                                                if (object14 != null && (view2 = dd2_2.a(n3 = R$id.fahRefereeWidget, view)) != null) {
                                                                    RefereeWidgetLayoutBinding refereeWidgetLayoutBinding = RefereeWidgetLayoutBinding.bind(view2);
                                                                    n3 = R$id.fahSearchLayout;
                                                                    view2 = dd2_2.a(n3, view);
                                                                    if (view2 != null) {
                                                                        LayoutLandingPageSearchBinding layoutLandingPageSearchBinding = LayoutLandingPageSearchBinding.bind(view2);
                                                                        n3 = R$id.fahTbLuxe;
                                                                        view2 = dd2_2.a(n3, view);
                                                                        if (view2 != null) {
                                                                            LayoutLuxeToolbarBinding layoutLuxeToolbarBinding = LayoutLuxeToolbarBinding.bind(view2);
                                                                            n3 = R$id.fahTvNotification;
                                                                            View view3 = view2 = dd2_2.a(n3, view);
                                                                            view3 = (TextView)view2;
                                                                            if (view3 != null) {
                                                                                n3 = R$id.fahTvStoreName;
                                                                                View view4 = view2 = dd2_2.a(n3, view);
                                                                                view4 = (TextView)view2;
                                                                                if (view4 != null) {
                                                                                    n3 = R$id.homeCmsShimmerParent;
                                                                                    View view5 = view2 = dd2_2.a(n3, view);
                                                                                    view5 = (FrameLayout)view2;
                                                                                    if (view5 != null) {
                                                                                        n3 = R$id.homeListRV;
                                                                                        Object object15 = view2 = dd2_2.a(n3, view);
                                                                                        object15 = (RecyclerView)view2;
                                                                                        if (object15 != null) {
                                                                                            Object object16 = view;
                                                                                            object16 = (CoordinatorLayout)view;
                                                                                            n3 = R$id.imageGifPlayer;
                                                                                            Object object17 = view2 = dd2_2.a(n3, view);
                                                                                            object17 = (AjioImageView)view2;
                                                                                            if (object17 != null) {
                                                                                                n3 = R$id.imgClose;
                                                                                                View view6 = view2 = dd2_2.a(n3, view);
                                                                                                view6 = (ImageView)view2;
                                                                                                if (view6 != null) {
                                                                                                    n3 = R$id.imgFullScreen;
                                                                                                    View view7 = view2 = dd2_2.a(n3, view);
                                                                                                    view7 = (ImageView)view2;
                                                                                                    if (view7 != null) {
                                                                                                        n3 = R$id.imgVolume;
                                                                                                        View view8 = view2 = dd2_2.a(n3, view);
                                                                                                        view8 = (ImageView)view2;
                                                                                                        if (view8 != null && (view2 = dd2_2.a(n3 = R$id.layoutHomeShimmer, view)) != null) {
                                                                                                            LayoutHomeShimmerRevampBinding layoutHomeShimmerRevampBinding = LayoutHomeShimmerRevampBinding.bind(view2);
                                                                                                            n3 = R$id.layoutTopNavTabShimmer;
                                                                                                            view2 = dd2_2.a(n3, view);
                                                                                                            if (view2 != null) {
                                                                                                                TopBarNavigationShimmerBinding topBarNavigationShimmerBinding = TopBarNavigationShimmerBinding.bind(view2);
                                                                                                                n3 = R$id.rvTopCollapsing;
                                                                                                                Object object18 = view2 = dd2_2.a(n3, view);
                                                                                                                object18 = (RecyclerView)view2;
                                                                                                                if (object18 != null && (view2 = dd2_2.a(n3 = R$id.splash_to_coach_lyt, view)) != null) {
                                                                                                                    StoreSecondarySplashLayoutBinding storeSecondarySplashLayoutBinding = StoreSecondarySplashLayoutBinding.bind(view2);
                                                                                                                    n3 = R$id.tabNavshimmerParent;
                                                                                                                    View view9 = view2 = dd2_2.a(n3, view);
                                                                                                                    view9 = (FrameLayout)view2;
                                                                                                                    if (view9 != null && (view2 = dd2_2.a(n3 = R$id.top_toolbar_ajio_lyt_revamp, view)) != null) {
                                                                                                                        TopToolbarHomeRevampAjioBinding topToolbarHomeRevampAjioBinding = TopToolbarHomeRevampAjioBinding.bind(view2);
                                                                                                                        n3 = R$id.top_toolbar_luxe_lyt_revamp;
                                                                                                                        view2 = dd2_2.a(n3, view);
                                                                                                                        if (view2 != null) {
                                                                                                                            TopToolbarHomeRevampLuxeBinding topToolbarHomeRevampLuxeBinding = TopToolbarHomeRevampLuxeBinding.bind(view2);
                                                                                                                            n3 = R$id.tvDuration;
                                                                                                                            Object object19 = view2 = dd2_2.a(n3, view);
                                                                                                                            object19 = (AjioTextView)view2;
                                                                                                                            if (object19 != null) {
                                                                                                                                n3 = R$id.updateBottomWidget;
                                                                                                                                Object object20 = view2 = dd2_2.a(n3, view);
                                                                                                                                object20 = (InAppBottomUpdatesView)view2;
                                                                                                                                if (object20 != null) {
                                                                                                                                    object = new FragmentAjioHomeBinding((CoordinatorLayout)object16, addressBarUiBinding, addressBarUiBinding2, (AppBarLayout)object2, (ConstraintLayout)((Object)object3), (ConstraintLayout)((Object)object4), (PlayerView)((Object)object5), pageErrorHomePageBinding, (AppBarLayout)object6, (AjioImageView)((Object)object7), (AjioImageView)((Object)object8), (AjioImageView)((Object)object9), (ConstraintLayout)((Object)object10), (ConstraintLayout)((Object)object11), (TabLayout)((Object)object12), (AppCompatImageView)((Object)object13), (AjioProgressView)((Object)object14), refereeWidgetLayoutBinding, layoutLandingPageSearchBinding, layoutLuxeToolbarBinding, (TextView)view3, (TextView)view4, (FrameLayout)view5, (RecyclerView)object15, (CoordinatorLayout)object16, (AjioImageView)((Object)object17), (ImageView)view6, (ImageView)view7, (ImageView)view8, layoutHomeShimmerRevampBinding, topBarNavigationShimmerBinding, (RecyclerView)object18, storeSecondarySplashLayoutBinding, (FrameLayout)view9, topToolbarHomeRevampAjioBinding, topToolbarHomeRevampLuxeBinding, (AjioTextView)object19, (InAppBottomUpdatesView)((Object)object20));
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

    public static FragmentAjioHomeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentAjioHomeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentAjioHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_ajio_home;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentAjioHomeBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

