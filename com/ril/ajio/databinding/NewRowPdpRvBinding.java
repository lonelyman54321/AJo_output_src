/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class NewRowPdpRvBinding
implements BC3 {
    public final LinearLayout parentRecentlyViewed;
    public final RecyclerView pdoRvRecentlyViewed;
    private final ConstraintLayout rootView;
    public final View rvDivider;
    public final TextView rvTitle;

    private NewRowPdpRvBinding(ConstraintLayout constraintLayout, LinearLayout linearLayout, RecyclerView recyclerView, View view, TextView textView) {
        this.rootView = constraintLayout;
        this.parentRecentlyViewed = linearLayout;
        this.pdoRvRecentlyViewed = recyclerView;
        this.rvDivider = view;
        this.rvTitle = textView;
    }

    public static NewRowPdpRvBinding bind(View object) {
        View view;
        int n3 = R$id.parent_recently_viewed;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            View view3;
            n3 = R$id.pdo_rv_recently_viewed;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (RecyclerView)view;
            if (object2 != null && (view3 = dd2_2.a(n3 = R$id.rv_divider, object)) != null) {
                n3 = R$id.rv_title;
                View view4 = view = dd2_2.a(n3, object);
                view4 = (TextView)view;
                if (view4 != null) {
                    Object object3 = object;
                    object3 = (ConstraintLayout)((Object)object);
                    NewRowPdpRvBinding newRowPdpRvBinding = new NewRowPdpRvBinding((ConstraintLayout)((Object)object3), (LinearLayout)view2, (RecyclerView)object2, view3, (TextView)view4);
                    return newRowPdpRvBinding;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static NewRowPdpRvBinding inflate(LayoutInflater layoutInflater) {
        return NewRowPdpRvBinding.inflate(layoutInflater, null, false);
    }

    public static NewRowPdpRvBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_row_pdp_rv;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewRowPdpRvBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

