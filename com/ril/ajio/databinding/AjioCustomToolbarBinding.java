/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.CircularImageView;

public final class AjioCustomToolbarBinding
implements BC3 {
    public final ImageView actIvStoreCategoryImage;
    public final ImageView actIvStoreImage;
    public final RelativeLayout actLayoutParent;
    public final LinearLayout actSisLogoLayout;
    public final LinearLayout actToolbarSis;
    public final AjioTextView actTvStoreSubtitle1;
    public final AjioTextView actTvStoreSubtitle2;
    public final ImageView actionbarCategoryImage;
    public final AjioTextView btToolbarCategory;
    public final LinearLayout llToolbarCategory;
    public final AjioTextView productDetail;
    public final LinearLayout productInfo;
    public final AjioTextView productNameTitle;
    public final LinearLayout productTopHeader;
    public final AjioTextView productTopHeaderBrand;
    public final CircularImageView productTopHeaderImg;
    private final Toolbar rootView;
    public final AjioImageView titleImageView;
    public final LinearLayout titleLinearLayout;
    public final Toolbar toolbar;
    public final AjioTextView toolbarTitle;
    public final AjioTextView toolbarTitleInfo;

    private AjioCustomToolbarBinding(Toolbar toolbar, ImageView imageView, ImageView imageView2, RelativeLayout relativeLayout, LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, ImageView imageView3, AjioTextView ajioTextView3, LinearLayout linearLayout3, AjioTextView ajioTextView4, LinearLayout linearLayout4, AjioTextView ajioTextView5, LinearLayout linearLayout5, AjioTextView ajioTextView6, CircularImageView circularImageView, AjioImageView ajioImageView, LinearLayout linearLayout6, Toolbar toolbar2, AjioTextView ajioTextView7, AjioTextView ajioTextView8) {
        this.rootView = toolbar;
        this.actIvStoreCategoryImage = imageView;
        this.actIvStoreImage = imageView2;
        this.actLayoutParent = relativeLayout;
        this.actSisLogoLayout = linearLayout;
        this.actToolbarSis = linearLayout2;
        this.actTvStoreSubtitle1 = ajioTextView;
        this.actTvStoreSubtitle2 = ajioTextView2;
        this.actionbarCategoryImage = imageView3;
        this.btToolbarCategory = ajioTextView3;
        this.llToolbarCategory = linearLayout3;
        this.productDetail = ajioTextView4;
        this.productInfo = linearLayout4;
        this.productNameTitle = ajioTextView5;
        this.productTopHeader = linearLayout5;
        this.productTopHeaderBrand = ajioTextView6;
        this.productTopHeaderImg = circularImageView;
        this.titleImageView = ajioImageView;
        this.titleLinearLayout = linearLayout6;
        this.toolbar = toolbar2;
        this.toolbarTitle = ajioTextView7;
        this.toolbarTitleInfo = ajioTextView8;
    }

    public static AjioCustomToolbarBinding bind(View view) {
        View view2;
        Object object = view;
        int n3 = R$id.act_iv_store_category_image;
        View view3 = view2 = dd2_2.a(n3, view);
        view3 = (ImageView)view2;
        if (view3 != null) {
            n3 = R$id.act_iv_store_image;
            View view4 = view2 = dd2_2.a(n3, view);
            view4 = (ImageView)view2;
            if (view4 != null) {
                n3 = R$id.act_layout_parent;
                View view5 = view2 = dd2_2.a(n3, view);
                view5 = (RelativeLayout)view2;
                if (view5 != null) {
                    n3 = R$id.act_sis_logo_layout;
                    View view6 = view2 = dd2_2.a(n3, view);
                    view6 = (LinearLayout)view2;
                    if (view6 != null) {
                        n3 = R$id.act_toolbar_sis;
                        View view7 = view2 = dd2_2.a(n3, view);
                        view7 = (LinearLayout)view2;
                        if (view7 != null) {
                            n3 = R$id.act_tv_store_subtitle_1;
                            Object object2 = view2 = dd2_2.a(n3, view);
                            object2 = (AjioTextView)view2;
                            if (object2 != null) {
                                n3 = R$id.act_tv_store_subtitle_2;
                                Object object3 = view2 = dd2_2.a(n3, view);
                                object3 = (AjioTextView)view2;
                                if (object3 != null) {
                                    n3 = R$id.actionbar_category_image;
                                    View view8 = view2 = dd2_2.a(n3, view);
                                    view8 = (ImageView)view2;
                                    if (view8 != null) {
                                        n3 = R$id.bt_toolbar_category;
                                        Object object4 = view2 = dd2_2.a(n3, view);
                                        object4 = (AjioTextView)view2;
                                        if (object4 != null) {
                                            n3 = R$id.ll_toolbar_category;
                                            View view9 = view2 = dd2_2.a(n3, view);
                                            view9 = (LinearLayout)view2;
                                            if (view9 != null) {
                                                n3 = R$id.product_detail;
                                                Object object5 = view2 = dd2_2.a(n3, view);
                                                object5 = (AjioTextView)view2;
                                                if (object5 != null) {
                                                    n3 = R$id.product_info;
                                                    View view10 = view2 = dd2_2.a(n3, view);
                                                    view10 = (LinearLayout)view2;
                                                    if (view10 != null) {
                                                        n3 = R$id.product_name_title;
                                                        Object object6 = view2 = dd2_2.a(n3, view);
                                                        object6 = (AjioTextView)view2;
                                                        if (object6 != null) {
                                                            n3 = R$id.product_top_header;
                                                            View view11 = view2 = dd2_2.a(n3, view);
                                                            view11 = (LinearLayout)view2;
                                                            if (view11 != null) {
                                                                n3 = R$id.product_top_header_brand;
                                                                Object object7 = view2 = dd2_2.a(n3, view);
                                                                object7 = (AjioTextView)view2;
                                                                if (object7 != null) {
                                                                    n3 = R$id.product_top_header_img;
                                                                    Object object8 = view2 = dd2_2.a(n3, view);
                                                                    object8 = (CircularImageView)view2;
                                                                    if (object8 != null) {
                                                                        n3 = R$id.title_image_view;
                                                                        Object object9 = view2 = dd2_2.a(n3, view);
                                                                        object9 = (AjioImageView)view2;
                                                                        if (object9 != null) {
                                                                            n3 = R$id.title_linear_layout;
                                                                            View view12 = view2 = dd2_2.a(n3, view);
                                                                            view12 = (LinearLayout)view2;
                                                                            if (view12 != null) {
                                                                                Object object10 = view;
                                                                                object10 = (Toolbar)view;
                                                                                n3 = R$id.toolbar_title;
                                                                                Object object11 = view2 = dd2_2.a(n3, view);
                                                                                object11 = (AjioTextView)view2;
                                                                                if (object11 != null) {
                                                                                    n3 = R$id.toolbar_title_info;
                                                                                    Object object12 = view2 = dd2_2.a(n3, view);
                                                                                    object12 = (AjioTextView)view2;
                                                                                    if (object12 != null) {
                                                                                        object = new AjioCustomToolbarBinding((Toolbar)object10, (ImageView)view3, (ImageView)view4, (RelativeLayout)view5, (LinearLayout)view6, (LinearLayout)view7, (AjioTextView)object2, (AjioTextView)object3, (ImageView)view8, (AjioTextView)object4, (LinearLayout)view9, (AjioTextView)object5, (LinearLayout)view10, (AjioTextView)object6, (LinearLayout)view11, (AjioTextView)object7, (CircularImageView)((Object)object8), (AjioImageView)((Object)object9), (LinearLayout)view12, (Toolbar)object10, (AjioTextView)object11, (AjioTextView)object12);
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
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static AjioCustomToolbarBinding inflate(LayoutInflater layoutInflater) {
        return AjioCustomToolbarBinding.inflate(layoutInflater, null, false);
    }

    public static AjioCustomToolbarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.ajio_custom_toolbar;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return AjioCustomToolbarBinding.bind((View)layoutInflater);
    }

    public Toolbar getRoot() {
        return this.rootView;
    }
}

