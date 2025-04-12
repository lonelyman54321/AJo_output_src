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
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class LayoutReturnCancelledBinding
implements BC3 {
    private final ConstraintLayout rootView;
    public final ConstraintLayout rowOdReturnProduct;
    public final RecyclerView rvCancelItem;
    public final AjioTextView tvCancelStatus;
    public final AjioTextView tvNeedHelp;
    public final AjioTextView tvSubDescription;

    private LayoutReturnCancelledBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView, AjioTextView ajioTextView, AjioTextView ajioTextView2, AjioTextView ajioTextView3) {
        this.rootView = constraintLayout;
        this.rowOdReturnProduct = constraintLayout2;
        this.rvCancelItem = recyclerView;
        this.tvCancelStatus = ajioTextView;
        this.tvNeedHelp = ajioTextView2;
        this.tvSubDescription = ajioTextView3;
    }

    public static LayoutReturnCancelledBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.rvCancelItem;
        Object object3 = view = dd2_2.a(n3, object);
        object3 = (RecyclerView)view;
        if (object3 != null) {
            n3 = R$id.tvCancelStatus;
            Object object4 = view = dd2_2.a(n3, object);
            object4 = (AjioTextView)view;
            if (object4 != null) {
                n3 = R$id.tvNeedHelp;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (AjioTextView)view;
                if (object5 != null) {
                    n3 = R$id.tvSubDescription;
                    Object object6 = view = dd2_2.a(n3, object);
                    object6 = (AjioTextView)view;
                    if (object6 != null) {
                        Object object7 = object;
                        view = object2;
                        object = new LayoutReturnCancelledBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), (RecyclerView)object3, (AjioTextView)object4, (AjioTextView)object5, (AjioTextView)object6);
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

    public static LayoutReturnCancelledBinding inflate(LayoutInflater layoutInflater) {
        return LayoutReturnCancelledBinding.inflate(layoutInflater, null, false);
    }

    public static LayoutReturnCancelledBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.layout_return_cancelled;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LayoutReturnCancelledBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

