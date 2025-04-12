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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentAcNonTransferableBinding
implements BC3 {
    public final ShimmerFrameLayout acNtShimmerView;
    public final FrameLayout acNtShimmerViewParent;
    public final RecyclerView ntRv;
    private final ConstraintLayout rootView;

    private FragmentAcNonTransferableBinding(ConstraintLayout constraintLayout, ShimmerFrameLayout shimmerFrameLayout, FrameLayout frameLayout, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.acNtShimmerView = shimmerFrameLayout;
        this.acNtShimmerViewParent = frameLayout;
        this.ntRv = recyclerView;
    }

    public static FragmentAcNonTransferableBinding bind(View object) {
        RecyclerView recyclerView;
        FrameLayout frameLayout;
        int n3 = R$id.ac_nt_shimmer_view;
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout)dd2_2.a(n3, object);
        if (shimmerFrameLayout != null && (frameLayout = (FrameLayout)dd2_2.a(n3 = R$id.ac_nt_shimmer_view_parent, object)) != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.nt_rv, object)) != null) {
            object = (ConstraintLayout)((Object)object);
            FragmentAcNonTransferableBinding fragmentAcNonTransferableBinding = new FragmentAcNonTransferableBinding((ConstraintLayout)((Object)object), shimmerFrameLayout, frameLayout, recyclerView);
            return fragmentAcNonTransferableBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentAcNonTransferableBinding inflate(LayoutInflater layoutInflater) {
        return FragmentAcNonTransferableBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentAcNonTransferableBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_ac_non_transferable;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentAcNonTransferableBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

