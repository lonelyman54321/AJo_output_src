/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentQuickviewCartLuxeBinding
implements BC3 {
    public final TextView luxeQuickviewToolbarTitle;
    public final AppBarLayout quickviewAppBarLayout;
    public final RecyclerView quickviewCartList;
    public final Toolbar quickviewToolbarLuxe;
    private final ConstraintLayout rootView;
    public final ConstraintLayout titleProductContainer;

    private FragmentQuickviewCartLuxeBinding(ConstraintLayout constraintLayout, TextView textView, AppBarLayout appBarLayout, RecyclerView recyclerView, Toolbar toolbar, ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.luxeQuickviewToolbarTitle = textView;
        this.quickviewAppBarLayout = appBarLayout;
        this.quickviewCartList = recyclerView;
        this.quickviewToolbarLuxe = toolbar;
        this.titleProductContainer = constraintLayout2;
    }

    public static FragmentQuickviewCartLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.luxe_quickview_toolbar_title;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (TextView)view;
        if (view2 != null) {
            n3 = R$id.quickview_app_bar_layout;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AppBarLayout)view;
            if (object2 != null) {
                n3 = R$id.quickview_cart_list;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (RecyclerView)view;
                if (object3 != null) {
                    n3 = R$id.quickview_toolbar_luxe;
                    Object object4 = view = dd2_2.a(n3, object);
                    object4 = (Toolbar)view;
                    if (object4 != null) {
                        Object object5 = object;
                        object5 = (ConstraintLayout)((Object)object);
                        object = new FragmentQuickviewCartLuxeBinding((ConstraintLayout)((Object)object5), (TextView)view2, (AppBarLayout)object2, (RecyclerView)object3, (Toolbar)object4, (ConstraintLayout)((Object)object5));
                        return object;
                    }
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static FragmentQuickviewCartLuxeBinding inflate(LayoutInflater layoutInflater) {
        return FragmentQuickviewCartLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentQuickviewCartLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_quickview_cart_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentQuickviewCartLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

