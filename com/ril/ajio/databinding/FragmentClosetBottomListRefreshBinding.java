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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.databinding.EmptyWishlistRefreshBinding;
import com.ril.ajio.databinding.LayoutSaleHeaderWishlistWidgetBinding;

public final class FragmentClosetBottomListRefreshBinding
implements BC3 {
    public final ImageView cancelBtn;
    public final FrameLayout cancelContainer;
    public final RecyclerView closetRv;
    public final EmptyWishlistRefreshBinding emptyWishlistContainer;
    public final AjioLoaderView halfClosetProgress;
    public final ConstraintLayout parentLayout;
    private final ConstraintLayout rootView;
    public final LayoutSaleHeaderWishlistWidgetBinding saleHeader;
    public final TextView viewAll;
    public final TextView wishlistTv;

    private FragmentClosetBottomListRefreshBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, RecyclerView recyclerView, EmptyWishlistRefreshBinding emptyWishlistRefreshBinding, AjioLoaderView ajioLoaderView, ConstraintLayout constraintLayout2, LayoutSaleHeaderWishlistWidgetBinding layoutSaleHeaderWishlistWidgetBinding, TextView textView, TextView textView2) {
        this.rootView = constraintLayout;
        this.cancelBtn = imageView;
        this.cancelContainer = frameLayout;
        this.closetRv = recyclerView;
        this.emptyWishlistContainer = emptyWishlistRefreshBinding;
        this.halfClosetProgress = ajioLoaderView;
        this.parentLayout = constraintLayout2;
        this.saleHeader = layoutSaleHeaderWishlistWidgetBinding;
        this.viewAll = textView;
        this.wishlistTv = textView2;
    }

    public static FragmentClosetBottomListRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.cancelBtn;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (ImageView)view;
        if (view2 != null) {
            n3 = R$id.cancelContainer;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (FrameLayout)view;
            if (view3 != null) {
                n3 = R$id.closetRv;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (RecyclerView)view;
                if (object2 != null && (view = dd2_2.a(n3 = R$id.emptyWishlistContainer, object)) != null) {
                    EmptyWishlistRefreshBinding emptyWishlistRefreshBinding = EmptyWishlistRefreshBinding.bind(view);
                    n3 = R$id.halfClosetProgress;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioLoaderView)view;
                    if (object3 != null) {
                        Object object4 = object;
                        object4 = (ConstraintLayout)((Object)object);
                        n3 = R$id.saleHeader;
                        view = dd2_2.a(n3, object);
                        if (view != null) {
                            LayoutSaleHeaderWishlistWidgetBinding layoutSaleHeaderWishlistWidgetBinding = LayoutSaleHeaderWishlistWidgetBinding.bind(view);
                            n3 = R$id.viewAll;
                            View view4 = view = dd2_2.a(n3, object);
                            view4 = (TextView)view;
                            if (view4 != null) {
                                n3 = R$id.wishlistTv;
                                View view5 = view = dd2_2.a(n3, object);
                                view5 = (TextView)view;
                                if (view5 != null) {
                                    object = new FragmentClosetBottomListRefreshBinding((ConstraintLayout)((Object)object4), (ImageView)view2, (FrameLayout)view3, (RecyclerView)object2, emptyWishlistRefreshBinding, (AjioLoaderView)((Object)object3), (ConstraintLayout)((Object)object4), layoutSaleHeaderWishlistWidgetBinding, (TextView)view4, (TextView)view5);
                                    return object;
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

    public static FragmentClosetBottomListRefreshBinding inflate(LayoutInflater layoutInflater) {
        return FragmentClosetBottomListRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentClosetBottomListRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_closet_bottom_list_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentClosetBottomListRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

