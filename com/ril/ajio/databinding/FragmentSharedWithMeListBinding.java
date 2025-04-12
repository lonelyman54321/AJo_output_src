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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.databinding.LayoutSharedWithMeStateBinding;

public final class FragmentSharedWithMeListBinding
implements BC3 {
    public final AjioProgressView fswmlProgressBar;
    public final RecyclerView fswmlRvList;
    private final FrameLayout rootView;
    public final LayoutSharedWithMeStateBinding sharedWithMeState;

    private FragmentSharedWithMeListBinding(FrameLayout frameLayout, AjioProgressView ajioProgressView, RecyclerView recyclerView, LayoutSharedWithMeStateBinding layoutSharedWithMeStateBinding) {
        this.rootView = frameLayout;
        this.fswmlProgressBar = ajioProgressView;
        this.fswmlRvList = recyclerView;
        this.sharedWithMeState = layoutSharedWithMeStateBinding;
    }

    public static FragmentSharedWithMeListBinding bind(View object) {
        Object object2;
        RecyclerView recyclerView;
        int n3 = R$id.fswmlProgressBar;
        AjioProgressView ajioProgressView = (AjioProgressView)dd2_2.a(n3, object);
        if (ajioProgressView != null && (recyclerView = (RecyclerView)dd2_2.a(n3 = R$id.fswmlRvList, object)) != null && (object2 = dd2_2.a(n3 = R$id.sharedWithMeState, object)) != null) {
            LayoutSharedWithMeStateBinding layoutSharedWithMeStateBinding = LayoutSharedWithMeStateBinding.bind(object2);
            object = (FrameLayout)object;
            object2 = new FragmentSharedWithMeListBinding((FrameLayout)object, ajioProgressView, recyclerView, layoutSharedWithMeStateBinding);
            return object2;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentSharedWithMeListBinding inflate(LayoutInflater layoutInflater) {
        return FragmentSharedWithMeListBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentSharedWithMeListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_shared_with_me_list;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentSharedWithMeListBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

