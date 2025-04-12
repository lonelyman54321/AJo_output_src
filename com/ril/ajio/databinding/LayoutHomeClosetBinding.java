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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.LayoutSaleHeaderWishlistWidgetBinding;

public final class LayoutHomeClosetBinding
implements BC3 {
    public final AppCompatImageView gotoCloset;
    public final ConstraintLayout lhcLayout;
    public final AjioTextView lhcTvCloset;
    public final AjioTextView lhcTvCount;
    public final AjioTextView lhcTvTitle;
    public final RecyclerView lhrvCrvCloset;
    private final ConstraintLayout rootView;
    public final LayoutSaleHeaderWishlistWidgetBinding saleContainer;

    private LayoutHomeClosetBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3, RecyclerView recyclerView, LayoutSaleHeaderWishlistWidgetBinding layoutSaleHeaderWishlistWidgetBinding) {
        this.rootView = constraintLayout;
        this.gotoCloset = appCompatImageView;
        this.lhcLayout = constraintLayout2;
        this.lhcTvCloset = ajioTextView;
        this.lhcTvCount = ajioTextView2;
        this.lhcTvTitle = ajioTextView3;
        this.lhrvCrvCloset = recyclerView;
        this.saleContainer = layoutSaleHeaderWishlistWidgetBinding;
    }

    public static LayoutHomeClosetBinding bind(View object) {
        View view;
        int n3 = R$id.goto_closet;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view;
        if (object2 != null) {
            Object object3 = object;
            object3 = (ConstraintLayout)((Object)object);
            n3 = R$id.lhc_tv_closet;
            Object object4 = view = dd2_2.a(n3, object);
            object4 = (AjioTextView)view;
            if (object4 != null) {
                n3 = R$id.lhc_tv_count;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (AjioTextView)view;
                if (object5 != null) {
                    n3 = R$id.lhc_tv_title;
                    Object object6 = view = dd2_2.a(n3, object);
                    object6 = (AjioTextView)view;
                    if (object6 != null) {
                        n3 = R$id.lhrv_crv_closet;
                        Object object7 = view = dd2_2.a(n3, object);
                        object7 = (RecyclerView)view;
                        if (object7 != null && (view = dd2_2.a(n3 = R$id.sale_container, object)) != null) {
                            LayoutSaleHeaderWishlistWidgetBinding layoutSaleHeaderWishlistWidgetBinding = LayoutSaleHeaderWishlistWidgetBinding.bind(view);
                            object = new LayoutHomeClosetBinding((ConstraintLayout)((Object)object3), (AppCompatImageView)((Object)object2), (ConstraintLayout)((Object)object3), (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6, (RecyclerView)object7, layoutSaleHeaderWishlistWidgetBinding);
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

    public static LayoutHomeClosetBinding inflate(LayoutInflater layoutInflater) {
        return LayoutHomeClosetBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutHomeClosetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_home_closet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutHomeClosetBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

