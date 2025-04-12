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

public final class PdpKnowTheProductCardBinding
implements BC3 {
    public final ConstraintLayout clMoreInfo;
    public final View divider4;
    public final AjioTextView knowTheProductHeader;
    public final ConstraintLayout kypMainCl;
    private final ConstraintLayout rootView;
    public final RecyclerView rvImageVideoItem;

    private PdpKnowTheProductCardBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, AjioTextView ajioTextView, ConstraintLayout constraintLayout3, RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.clMoreInfo = constraintLayout2;
        this.divider4 = view;
        this.knowTheProductHeader = ajioTextView;
        this.kypMainCl = constraintLayout3;
        this.rvImageVideoItem = recyclerView;
    }

    public static PdpKnowTheProductCardBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.cl_more_info;
        Object object2 = view2 = dd2_2.a(n3, object);
        object2 = (ConstraintLayout)view2;
        if (object2 != null && (view = dd2_2.a(n3 = R$id.divider4, object)) != null) {
            n3 = R$id.know_the_product_header;
            Object object3 = view2 = dd2_2.a(n3, object);
            object3 = (AjioTextView)view2;
            if (object3 != null) {
                Object object4 = object;
                object4 = (ConstraintLayout)((Object)object);
                n3 = R$id.rv_image_video_item;
                Object object5 = view2 = dd2_2.a(n3, object);
                object5 = (RecyclerView)view2;
                if (object5 != null) {
                    object = new PdpKnowTheProductCardBinding((ConstraintLayout)((Object)object4), (ConstraintLayout)((Object)object2), view, (AjioTextView)object3, (ConstraintLayout)((Object)object4), (RecyclerView)object5);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PdpKnowTheProductCardBinding inflate(LayoutInflater layoutInflater) {
        return PdpKnowTheProductCardBinding.inflate(layoutInflater, null, false);
    }

    public static PdpKnowTheProductCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_know_the_product_card;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpKnowTheProductCardBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

