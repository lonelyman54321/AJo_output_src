/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ExlamationErrorBinding;

public final class ActivityReturnInfoRevampBinding
implements BC3 {
    public final Toolbar alfToolbar;
    public final AppBarLayout appBarLayout;
    public final CollapsingToolbarLayout collapseToolBar;
    public final ConstraintLayout dropAtStoreLayoutHeader1;
    public final ConstraintLayout dropAtStoreLayoutHeader2;
    public final ConstraintLayout dropAtStoreLayoutHeader3;
    public final ConstraintLayout dropAtStoreLayoutReturnInfo;
    public final AjioTextView lblItemReturnAtStore;
    public final AjioTextView lblItemToReturn;
    public final AjioTextView lblNearestStore;
    public final ConstraintLayout returnInfoLayoutItems;
    public final ExlamationErrorBinding returnInfoLblHomePickup;
    public final AjioTextView returnInfoLblOne;
    public final AjioTextView returnInfoLblThree;
    public final AjioTextView returnInfoLblTwo;
    public final RecyclerView returnInfoRvEligible;
    public final AjioTextView returnInfoTvEligible;
    private final CoordinatorLayout rootView;
    public final AjioTextView tvElligible;
    public final AjioTextView tvSteps;

    private ActivityReturnInfoRevampBinding(CoordinatorLayout coordinatorLayout, Toolbar toolbar, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, ConstraintLayout constraintLayout5, ExlamationErrorBinding exlamationErrorBinding, AjioTextView ajioTextView4, AjioTextView ajioTextView5, AjioTextView ajioTextView6, RecyclerView recyclerView, AjioTextView ajioTextView7, AjioTextView ajioTextView8, AjioTextView ajioTextView9) {
        this.rootView = coordinatorLayout;
        this.alfToolbar = toolbar;
        this.appBarLayout = appBarLayout;
        this.collapseToolBar = collapsingToolbarLayout;
        this.dropAtStoreLayoutHeader1 = constraintLayout;
        this.dropAtStoreLayoutHeader2 = constraintLayout2;
        this.dropAtStoreLayoutHeader3 = constraintLayout3;
        this.dropAtStoreLayoutReturnInfo = constraintLayout4;
        this.lblItemReturnAtStore = ajioTextView;
        this.lblItemToReturn = ajioTextView2;
        this.lblNearestStore = ajioTextView3;
        this.returnInfoLayoutItems = constraintLayout5;
        this.returnInfoLblHomePickup = exlamationErrorBinding;
        this.returnInfoLblOne = ajioTextView4;
        this.returnInfoLblThree = ajioTextView5;
        this.returnInfoLblTwo = ajioTextView6;
        this.returnInfoRvEligible = recyclerView;
        this.returnInfoTvEligible = ajioTextView7;
        this.tvElligible = ajioTextView8;
        this.tvSteps = ajioTextView9;
    }

    public static ActivityReturnInfoRevampBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.alfToolbar;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (Toolbar)view2;
        if (object2 != null) {
            n3 = R$id.appBarLayout;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AppBarLayout)view2;
            if (object3 != null) {
                n3 = R$id.collapseToolBar;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (CollapsingToolbarLayout)view2;
                if (object4 != null) {
                    n3 = R$id.drop_at_store_layout_header1;
                    Object object5 = view2 = dd2_2.a(n3, view);
                    object5 = (ConstraintLayout)view2;
                    if (object5 != null) {
                        n3 = R$id.drop_at_store_layout_header2;
                        Object object6 = view2 = dd2_2.a(n3, view);
                        object6 = (ConstraintLayout)view2;
                        if (object6 != null) {
                            n3 = R$id.drop_at_store_layout_header3;
                            Object object7 = view2 = dd2_2.a(n3, view);
                            object7 = (ConstraintLayout)view2;
                            if (object7 != null) {
                                n3 = R$id.drop_at_store_layout_return_info;
                                Object object8 = view2 = dd2_2.a(n3, view);
                                object8 = (ConstraintLayout)view2;
                                if (object8 != null) {
                                    n3 = R$id.lbl_item_return_at_store;
                                    Object object9 = view2 = dd2_2.a(n3, view);
                                    object9 = (AjioTextView)view2;
                                    if (object9 != null) {
                                        n3 = R$id.lbl_item_to_return;
                                        Object object10 = view2 = dd2_2.a(n3, view);
                                        object10 = (AjioTextView)view2;
                                        if (object10 != null) {
                                            n3 = R$id.lbl_nearest_store;
                                            Object object11 = view2 = dd2_2.a(n3, view);
                                            object11 = (AjioTextView)view2;
                                            if (object11 != null) {
                                                n3 = R$id.return_info_layout_items;
                                                Object object12 = view2 = dd2_2.a(n3, view);
                                                object12 = (ConstraintLayout)view2;
                                                if (object12 != null && (view2 = dd2_2.a(n3 = R$id.return_info_lbl_home_pickup, view)) != null) {
                                                    ExlamationErrorBinding exlamationErrorBinding = ExlamationErrorBinding.bind(view2);
                                                    n3 = R$id.return_info_lbl_one;
                                                    Object object13 = view2 = dd2_2.a(n3, view);
                                                    object13 = (AjioTextView)view2;
                                                    if (object13 != null) {
                                                        n3 = R$id.return_info_lbl_three;
                                                        Object object14 = view2 = dd2_2.a(n3, view);
                                                        object14 = (AjioTextView)view2;
                                                        if (object14 != null) {
                                                            n3 = R$id.return_info_lbl_two;
                                                            Object object15 = view2 = dd2_2.a(n3, view);
                                                            object15 = (AjioTextView)view2;
                                                            if (object15 != null) {
                                                                n3 = R$id.return_info_rv_eligible;
                                                                Object object16 = view2 = dd2_2.a(n3, view);
                                                                object16 = (RecyclerView)view2;
                                                                if (object16 != null) {
                                                                    n3 = R$id.return_info_tv_eligible;
                                                                    Object object17 = view2 = dd2_2.a(n3, view);
                                                                    object17 = (AjioTextView)view2;
                                                                    if (object17 != null) {
                                                                        n3 = R$id.tvElligible;
                                                                        Object object18 = view2 = dd2_2.a(n3, view);
                                                                        object18 = (AjioTextView)view2;
                                                                        if (object18 != null) {
                                                                            n3 = R$id.tvSteps;
                                                                            Object object19 = view2 = dd2_2.a(n3, view);
                                                                            object19 = (AjioTextView)view2;
                                                                            if (object19 != null) {
                                                                                Object object20 = view;
                                                                                object20 = (CoordinatorLayout)view;
                                                                                ActivityReturnInfoRevampBinding activityReturnInfoRevampBinding = new ActivityReturnInfoRevampBinding((CoordinatorLayout)object20, (Toolbar)object2, (AppBarLayout)object3, (CollapsingToolbarLayout)((Object)object4), (ConstraintLayout)((Object)object5), (ConstraintLayout)((Object)object6), (ConstraintLayout)((Object)object7), (ConstraintLayout)((Object)object8), (AjioTextView)object9, (AjioTextView)object10, (AjioTextView)object11, (ConstraintLayout)((Object)object12), exlamationErrorBinding, (AjioTextView)object13, (AjioTextView)object14, (AjioTextView)object15, (RecyclerView)object16, (AjioTextView)object17, (AjioTextView)object18, (AjioTextView)object19);
                                                                                return activityReturnInfoRevampBinding;
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

    public static ActivityReturnInfoRevampBinding inflate(LayoutInflater layoutInflater) {
        return ActivityReturnInfoRevampBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityReturnInfoRevampBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_return_info_revamp;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityReturnInfoRevampBinding.bind((View)layoutInflater);
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }
}

