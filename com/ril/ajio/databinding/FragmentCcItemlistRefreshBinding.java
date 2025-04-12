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
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class FragmentCcItemlistRefreshBinding
implements BC3 {
    public final FrameLayout cancelContainer;
    public final ImageView ccItemlistBtnClose;
    public final ConstraintLayout ccItemlistContainer;
    public final TextView ccItemlistLblTitle;
    public final RecyclerView ccItemlistRv;
    public final LinearLayout fragmentCcItemlist;
    private final LinearLayout rootView;

    private FragmentCcItemlistRefreshBinding(LinearLayout linearLayout, FrameLayout frameLayout, ImageView imageView, ConstraintLayout constraintLayout, TextView textView, RecyclerView recyclerView, LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.cancelContainer = frameLayout;
        this.ccItemlistBtnClose = imageView;
        this.ccItemlistContainer = constraintLayout;
        this.ccItemlistLblTitle = textView;
        this.ccItemlistRv = recyclerView;
        this.fragmentCcItemlist = linearLayout2;
    }

    public static FragmentCcItemlistRefreshBinding bind(View object) {
        View view;
        int n3 = R$id.cancelContainer;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (FrameLayout)view;
        if (view2 != null) {
            n3 = R$id.cc_itemlist_btn_close;
            View view3 = view = dd2_2.a(n3, object);
            view3 = (ImageView)view;
            if (view3 != null) {
                n3 = R$id.cc_itemlist_container;
                Object object2 = view = dd2_2.a(n3, object);
                object2 = (ConstraintLayout)view;
                if (object2 != null) {
                    n3 = R$id.cc_itemlist_lbl_title;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        n3 = R$id.cc_itemlist_rv;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (RecyclerView)view;
                        if (object3 != null) {
                            Object object4 = object;
                            object4 = (LinearLayout)object;
                            object = new FragmentCcItemlistRefreshBinding((LinearLayout)object4, (FrameLayout)view2, (ImageView)view3, (ConstraintLayout)((Object)object2), (TextView)view4, (RecyclerView)object3, (LinearLayout)object4);
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

    public static FragmentCcItemlistRefreshBinding inflate(LayoutInflater layoutInflater) {
        return FragmentCcItemlistRefreshBinding.inflate(layoutInflater, null, false);
    }

    public static FragmentCcItemlistRefreshBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.fragment_cc_itemlist_refresh;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return FragmentCcItemlistRefreshBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

