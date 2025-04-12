/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class NewPdpOosColorRvBinding
implements BC3 {
    public final View colorTopDivider;
    public final RelativeLayout pdpColorLayout;
    public final AjioImageView pdpImvNextColor;
    public final AjioImageView pdpImvPrevColor;
    public final RecyclerView pdpRvColor;
    public final AjioTextView pdpTvSelectedColor;
    public final AjioTextView pdpTvTitle;
    private final LinearLayout rootView;

    private NewPdpOosColorRvBinding(LinearLayout linearLayout, View view, RelativeLayout relativeLayout, AjioImageView ajioImageView, AjioImageView ajioImageView2, RecyclerView recyclerView, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = linearLayout;
        this.colorTopDivider = view;
        this.pdpColorLayout = relativeLayout;
        this.pdpImvNextColor = ajioImageView;
        this.pdpImvPrevColor = ajioImageView2;
        this.pdpRvColor = recyclerView;
        this.pdpTvSelectedColor = ajioTextView;
        this.pdpTvTitle = ajioTextView2;
    }

    public static NewPdpOosColorRvBinding bind(View object) {
        int n3 = R$id.color_top_divider;
        View view = dd2_2.a(n3, object);
        if (view != null) {
            Object object2;
            n3 = R$id.pdp_color_layout;
            View view2 = object2 = dd2_2.a(n3, object);
            view2 = (RelativeLayout)object2;
            if (view2 != null) {
                n3 = R$id.pdp_Imv_next_color;
                Object object3 = object2 = dd2_2.a(n3, object);
                object3 = (AjioImageView)((Object)object2);
                if (object3 != null) {
                    n3 = R$id.pdp_Imv_prev_color;
                    Object object4 = object2 = dd2_2.a(n3, object);
                    object4 = (AjioImageView)((Object)object2);
                    if (object4 != null) {
                        n3 = R$id.pdp_rv_color;
                        Object object5 = object2 = dd2_2.a(n3, object);
                        object5 = (RecyclerView)object2;
                        if (object5 != null) {
                            n3 = R$id.pdp_tv_selected_color;
                            Object object6 = object2 = dd2_2.a(n3, object);
                            object6 = (AjioTextView)object2;
                            if (object6 != null) {
                                n3 = R$id.pdp_tv_title;
                                Object object7 = object2 = dd2_2.a(n3, object);
                                object7 = (AjioTextView)object2;
                                if (object7 != null) {
                                    NewPdpOosColorRvBinding newPdpOosColorRvBinding;
                                    Object object8 = object;
                                    object8 = (LinearLayout)object;
                                    object2 = newPdpOosColorRvBinding;
                                    newPdpOosColorRvBinding = new NewPdpOosColorRvBinding((LinearLayout)object8, view, (RelativeLayout)view2, (AjioImageView)((Object)object3), (AjioImageView)((Object)object4), (RecyclerView)object5, (AjioTextView)object6, (AjioTextView)object7);
                                    return newPdpOosColorRvBinding;
                                }
                            }
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

    public static NewPdpOosColorRvBinding inflate(LayoutInflater layoutInflater) {
        return NewPdpOosColorRvBinding.inflate(layoutInflater, null, false);
    }

    public static NewPdpOosColorRvBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.new_pdp_oos_color_rv;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return NewPdpOosColorRvBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

