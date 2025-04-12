/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ComponentOrderRecyclerViewBinding
implements BC3 {
    public final LinearLayout componentOrderLayout;
    public final AjioTextView componentOrderLblMyorder;
    public final RecyclerView componentOrderRecyclerView;
    public final LinearLayout corvLayout;
    private final LinearLayout rootView;

    private ComponentOrderRecyclerViewBinding(LinearLayout linearLayout, LinearLayout linearLayout2, AjioTextView ajioTextView, RecyclerView recyclerView, LinearLayout linearLayout3) {
        this.rootView = linearLayout;
        this.componentOrderLayout = linearLayout2;
        this.componentOrderLblMyorder = ajioTextView;
        this.componentOrderRecyclerView = recyclerView;
        this.corvLayout = linearLayout3;
    }

    public static ComponentOrderRecyclerViewBinding bind(View object) {
        View view;
        int n3 = R$id.component_order_layout;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (LinearLayout)view;
        if (view2 != null) {
            n3 = R$id.component_order_lbl_myorder;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioTextView)view;
            if (object2 != null) {
                n3 = R$id.component_order_recycler_view;
                Object object3 = view = dd2_2.a(n3, object);
                object3 = (RecyclerView)view;
                if (object3 != null) {
                    Object object4 = object;
                    object4 = (LinearLayout)object;
                    object = new ComponentOrderRecyclerViewBinding((LinearLayout)object4, (LinearLayout)view2, (AjioTextView)object2, (RecyclerView)object3, (LinearLayout)object4);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ComponentOrderRecyclerViewBinding inflate(LayoutInflater layoutInflater) {
        return ComponentOrderRecyclerViewBinding.inflate(layoutInflater, null, false);
    }

    public static ComponentOrderRecyclerViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.component_order_recycler_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ComponentOrderRecyclerViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

