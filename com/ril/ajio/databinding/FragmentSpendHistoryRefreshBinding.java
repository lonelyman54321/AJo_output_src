/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentSpendHistoryRefreshBinding
implements BC3 {
    public final AppBarLayout appBarLayout;
    public final ConstraintLayout parentLayout;
    private final ConstraintLayout rootView;
    public final ShimmerFrameLayout spShimmerView;
    public final FrameLayout spShimmerViewParent;
    public final Toolbar spToolbar;
    public final RecyclerView spendHistoryRV;

    private FragmentSpendHistoryRefreshBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, ConstraintLayout constraintLayout2, ShimmerFrameLayout shimmerFrameLayout, FrameLayout frameLayout, Toolbar toolbar, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.appBarLayout = appBarLayout;
        this.parentLayout = constraintLayout2;
        this.spShimmerView = shimmerFrameLayout;
        this.spShimmerViewParent = frameLayout;
        this.spToolbar = toolbar;
        this.spendHistoryRV = recyclerView;
    }

    public static FragmentSpendHistoryRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.appBarLayout;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AppBarLayout)view;
        if (object2 != null) {
            Object object3 = object;
            object3 = (ConstraintLayout)((Object)object);
            n3 = R$id.spShimmerView;
            Object object4 = view = dd2_2.a(n3, object);
            object4 = (ShimmerFrameLayout)view;
            if (object4 != null) {
                n3 = R$id.spShimmerViewParent;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (FrameLayout)view;
                if (view2 != null) {
                    n3 = R$id.spToolbar;
                    Object object5 = view = dd2_2.a(n3, object);
                    object5 = (Toolbar)view;
                    if (object5 != null) {
                        n3 = R$id.spendHistoryRV;
                        Object object6 = view = dd2_2.a(n3, object);
                        object6 = (RecyclerView)view;
                        if (object6 != null) {
                            object = new FragmentSpendHistoryRefreshBinding((ConstraintLayout)((Object)object3), (AppBarLayout)object2, (ConstraintLayout)((Object)object3), (ShimmerFrameLayout)((Object)object4), (FrameLayout)view2, (Toolbar)object5, (RecyclerView)object6);
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

    public static FragmentSpendHistoryRefreshBinding inflate(LayoutInflater layoutInflater) {
        return FragmentSpendHistoryRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentSpendHistoryRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_spend_history_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentSpendHistoryRefreshBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

