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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.EmptyFullWishlistRefreshBinding;
import com.ril.ajio.databinding.LayoutClosetBauBinding;
import com.ril.ajio.databinding.LayoutClosetSaleBinding;
import com.ril.ajio.databinding.RefereeWidgetLayoutBinding;
import com.ril.ajio.utility.customview.InAppBottomUpdatesView;

public final class FragmentClosetRefreshBinding
implements BC3 {
    public final EmptyFullWishlistRefreshBinding emptyClosetLayout;
    public final InAppBottomUpdatesView inappUpdateWidget;
    public final RefereeWidgetLayoutBinding refereeWidget;
    private final ConstraintLayout rootView;
    public final LayoutClosetBauBinding wishlistBAUContainer;
    public final LayoutClosetSaleBinding wishlistSaleContainer;

    private FragmentClosetRefreshBinding(ConstraintLayout constraintLayout, EmptyFullWishlistRefreshBinding emptyFullWishlistRefreshBinding, InAppBottomUpdatesView inAppBottomUpdatesView, RefereeWidgetLayoutBinding refereeWidgetLayoutBinding, LayoutClosetBauBinding layoutClosetBauBinding, LayoutClosetSaleBinding layoutClosetSaleBinding) {
        this.rootView = constraintLayout;
        this.emptyClosetLayout = emptyFullWishlistRefreshBinding;
        this.inappUpdateWidget = inAppBottomUpdatesView;
        this.refereeWidget = refereeWidgetLayoutBinding;
        this.wishlistBAUContainer = layoutClosetBauBinding;
        this.wishlistSaleContainer = layoutClosetSaleBinding;
    }

    public static FragmentClosetRefreshBinding bind(View object) {
        int n3 = R$id.empty_closet_layout;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            EmptyFullWishlistRefreshBinding emptyFullWishlistRefreshBinding = EmptyFullWishlistRefreshBinding.bind(view);
            n3 = R$id.inapp_update_widget;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (InAppBottomUpdatesView)view;
            if (object2 != null && (view = dd2_2.a(n3 = R$id.refereeWidget, object)) != null) {
                RefereeWidgetLayoutBinding refereeWidgetLayoutBinding = RefereeWidgetLayoutBinding.bind(view);
                n3 = R$id.wishlistBAUContainer;
                view = dd2_2.a(n3, object);
                if (view != null) {
                    LayoutClosetBauBinding layoutClosetBauBinding = LayoutClosetBauBinding.bind(view);
                    n3 = R$id.wishlistSaleContainer;
                    view = dd2_2.a(n3, object);
                    if (view != null) {
                        LayoutClosetSaleBinding layoutClosetSaleBinding = LayoutClosetSaleBinding.bind(view);
                        Object object3 = object;
                        object3 = (ConstraintLayout)((Object)object);
                        FragmentClosetRefreshBinding fragmentClosetRefreshBinding = new FragmentClosetRefreshBinding((ConstraintLayout)((Object)object3), emptyFullWishlistRefreshBinding, (InAppBottomUpdatesView)((Object)object2), refereeWidgetLayoutBinding, layoutClosetBauBinding, layoutClosetSaleBinding);
                        return fragmentClosetRefreshBinding;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentClosetRefreshBinding inflate(LayoutInflater layoutInflater) {
        return FragmentClosetRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentClosetRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_closet_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentClosetRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

