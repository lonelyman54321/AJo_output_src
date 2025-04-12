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
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.ImageSearchCategoryWidget;

public final class LayoutSaleHeaderBinding
implements BC3 {
    public final CollapsingToolbarLayout collapsingToolbar;
    public final ImageSearchCategoryWidget layoutCategorySales;
    private final AppBarLayout rootView;
    public final AppBarLayout saleAppBarLayout;
    public final ConstraintLayout saleHeaderContainer;
    public final ImageView saleHeaderIV;
    public final TextView saleHeaderTV;
    public final TextView saleInfo2TV;
    public final TextView saleInfoTV;
    public final TextView showPriceBtn;

    private LayoutSaleHeaderBinding(AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, ImageSearchCategoryWidget imageSearchCategoryWidget, AppBarLayout appBarLayout2, ConstraintLayout constraintLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        this.rootView = appBarLayout;
        this.collapsingToolbar = collapsingToolbarLayout;
        this.layoutCategorySales = imageSearchCategoryWidget;
        this.saleAppBarLayout = appBarLayout2;
        this.saleHeaderContainer = constraintLayout;
        this.saleHeaderIV = imageView;
        this.saleHeaderTV = textView;
        this.saleInfo2TV = textView2;
        this.saleInfoTV = textView3;
        this.showPriceBtn = textView4;
    }

    public static LayoutSaleHeaderBinding bind(View object) {
        View view;
        int n3 = R$id.collapsing_toolbar;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (CollapsingToolbarLayout)view;
        if (object2 != null) {
            n3 = R$id.layout_category_sales;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (ImageSearchCategoryWidget)view;
            if (object3 != null) {
                Object object4 = object;
                object4 = (AppBarLayout)object;
                n3 = R$id.saleHeaderContainer;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (ConstraintLayout)view;
                if (object5 != null) {
                    n3 = R$id.saleHeaderIV;
                    View view2 = view = dd2_2.a(n3, object);
                    view2 = (ImageView)view;
                    if (view2 != null) {
                        n3 = R$id.saleHeaderTV;
                        View view3 = view = dd2_2.a(n3, object);
                        view3 = (TextView)view;
                        if (view3 != null) {
                            n3 = R$id.saleInfo2TV;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (TextView)view;
                            if (view4 != null) {
                                n3 = R$id.saleInfoTV;
                                View view5 = view = dd2_2.a(n3, object);
                                view5 = (TextView)view;
                                if (view5 != null) {
                                    n3 = R$id.showPriceBtn;
                                    View view6 = view = dd2_2.a(n3, object);
                                    view6 = (TextView)view;
                                    if (view6 != null) {
                                        object = new LayoutSaleHeaderBinding((AppBarLayout)object4, (CollapsingToolbarLayout)((Object)object2), (ImageSearchCategoryWidget)object3, (AppBarLayout)object4, (ConstraintLayout)((Object)object5), (ImageView)view2, (TextView)view3, (TextView)view4, (TextView)view5, (TextView)view6);
                                        return object;
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

    public static LayoutSaleHeaderBinding inflate(LayoutInflater layoutInflater) {
        return LayoutSaleHeaderBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutSaleHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_sale_header;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutSaleHeaderBinding.bind((View)layoutInflater);
    }

    public AppBarLayout getRoot() {
        return this.rootView;
    }
}

