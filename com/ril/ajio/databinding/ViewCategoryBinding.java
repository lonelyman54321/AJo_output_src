/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ViewCategoryBinding
implements BC3 {
    public final AjioImageView categoryImvAjioLux;
    public final AjioImageView categoryImvBack;
    public final AjioImageView categoryImvClose;
    public final ImageView categoryImvHome;
    public final AjioImageView categoryImvLogo;
    public final ImageView categoryImvSearch;
    public final LinearLayout categoryLayoutBack;
    public final RelativeLayout categoryLayoutSearch;
    public final RecyclerView categoryRv;
    public final AjioTextView categorySubtitleTv;
    public final AjioTextView categoryTvHeader;
    public final AjioTextView categoryTvTitle;
    public final AjioImageView ivSignupBenefit;
    private final RelativeLayout rootView;
    public final FrameLayout subCategoryFrame;

    private ViewCategoryBinding(RelativeLayout relativeLayout, AjioImageView ajioImageView, AjioImageView ajioImageView2, AjioImageView ajioImageView3, ImageView imageView, AjioImageView ajioImageView4, ImageView imageView2, LinearLayout linearLayout, RelativeLayout relativeLayout2, RecyclerView recyclerView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, AjioImageView ajioImageView5, FrameLayout frameLayout) {
        this.rootView = relativeLayout;
        this.categoryImvAjioLux = ajioImageView;
        this.categoryImvBack = ajioImageView2;
        this.categoryImvClose = ajioImageView3;
        this.categoryImvHome = imageView;
        this.categoryImvLogo = ajioImageView4;
        this.categoryImvSearch = imageView2;
        this.categoryLayoutBack = linearLayout;
        this.categoryLayoutSearch = relativeLayout2;
        this.categoryRv = recyclerView;
        this.categorySubtitleTv = ajioTextView;
        this.categoryTvHeader = ajioTextView2;
        this.categoryTvTitle = ajioTextView3;
        this.ivSignupBenefit = ajioImageView5;
        this.subCategoryFrame = frameLayout;
    }

    public static ViewCategoryBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.category_imv_ajio_lux;
        Object object2 = view2 = dd2_2.a(n3, view);
        object2 = (AjioImageView)view2;
        if (object2 != null) {
            n3 = R$id.category_imv_back;
            Object object3 = view2 = dd2_2.a(n3, view);
            object3 = (AjioImageView)view2;
            if (object3 != null) {
                n3 = R$id.category_imv_close;
                Object object4 = view2 = dd2_2.a(n3, view);
                object4 = (AjioImageView)view2;
                if (object4 != null) {
                    n3 = R$id.category_imv_home;
                    View view3 = view2 = dd2_2.a(n3, view);
                    view3 = (ImageView)view2;
                    if (view3 != null) {
                        n3 = R$id.category_imv_logo;
                        Object object5 = view2 = dd2_2.a(n3, view);
                        object5 = (AjioImageView)view2;
                        if (object5 != null) {
                            n3 = R$id.category_imv_search;
                            View view4 = view2 = dd2_2.a(n3, view);
                            view4 = (ImageView)view2;
                            if (view4 != null) {
                                n3 = R$id.category_layout_back;
                                View view5 = view2 = dd2_2.a(n3, view);
                                view5 = (LinearLayout)view2;
                                if (view5 != null) {
                                    n3 = R$id.category_layout_search;
                                    View view6 = view2 = dd2_2.a(n3, view);
                                    view6 = (RelativeLayout)view2;
                                    if (view6 != null) {
                                        n3 = R$id.category_rv;
                                        Object object6 = view2 = dd2_2.a(n3, view);
                                        object6 = (RecyclerView)view2;
                                        if (object6 != null) {
                                            n3 = R$id.category_subtitle_tv;
                                            Object object7 = view2 = dd2_2.a(n3, view);
                                            object7 = (AjioTextView)view2;
                                            if (object7 != null) {
                                                n3 = R$id.category_tv_header;
                                                Object object8 = view2 = dd2_2.a(n3, view);
                                                object8 = (AjioTextView)view2;
                                                if (object8 != null) {
                                                    n3 = R$id.category_tv_title;
                                                    Object object9 = view2 = dd2_2.a(n3, view);
                                                    object9 = (AjioTextView)view2;
                                                    if (object9 != null) {
                                                        n3 = R$id.iv_signup_benefit;
                                                        Object object10 = view2 = dd2_2.a(n3, view);
                                                        object10 = (AjioImageView)view2;
                                                        if (object10 != null) {
                                                            n3 = R$id.sub_category_frame;
                                                            View view7 = view2 = dd2_2.a(n3, view);
                                                            view7 = (FrameLayout)view2;
                                                            if (view7 != null) {
                                                                View view8 = view;
                                                                view8 = (RelativeLayout)view;
                                                                ViewCategoryBinding viewCategoryBinding = new ViewCategoryBinding((RelativeLayout)view8, (AjioImageView)((Object)object2), (AjioImageView)((Object)object3), (AjioImageView)((Object)object4), (ImageView)view3, (AjioImageView)((Object)object5), (ImageView)view4, (LinearLayout)view5, (RelativeLayout)view6, (RecyclerView)object6, (AjioTextView)object7, (AjioTextView)object8, (AjioTextView)object9, (AjioImageView)((Object)object10), (FrameLayout)view7);
                                                                return viewCategoryBinding;
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

    public static ViewCategoryBinding inflate(LayoutInflater layoutInflater) {
        return ViewCategoryBinding.inflate(layoutInflater, null, false);
    }

    public static ViewCategoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.view_category;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ViewCategoryBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

