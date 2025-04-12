/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PdpPriorityLayoutBinding
implements BC3 {
    public final ConstraintLayout pdConstraintLayout;
    public final ImageView pdCornerIcon;
    public final TextView pdDeliveryDate;
    public final TextView pdFinalDate;
    private final ConstraintLayout rootView;
    public final ConstraintLayout sdConstraintLayout;
    public final ImageView sdCornerIcon;
    public final TextView sdDeliveryDate;
    public final TextView sdFinalDate;

    private PdpPriorityLayoutBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView, TextView textView2, ConstraintLayout constraintLayout3, ImageView imageView2, TextView textView3, TextView textView4) {
        this.rootView = constraintLayout;
        this.pdConstraintLayout = constraintLayout2;
        this.pdCornerIcon = imageView;
        this.pdDeliveryDate = textView;
        this.pdFinalDate = textView2;
        this.sdConstraintLayout = constraintLayout3;
        this.sdCornerIcon = imageView2;
        this.sdDeliveryDate = textView3;
        this.sdFinalDate = textView4;
    }

    public static PdpPriorityLayoutBinding bind(View object) {
        View view;
        int n3 = R$id.pd_constraint_layout;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (ConstraintLayout)view;
        if (object2 != null) {
            n3 = R$id.pd_cornerIcon;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (ImageView)view;
            if (view2 != null) {
                n3 = R$id.pd_deliveryDate;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (TextView)view;
                if (view3 != null) {
                    n3 = R$id.pd_finalDate;
                    View view4 = view = dd2_2.a(n3, object);
                    view4 = (TextView)view;
                    if (view4 != null) {
                        n3 = R$id.sd_constraint_layout;
                        Object object3 = view = dd2_2.a(n3, object);
                        object3 = (ConstraintLayout)view;
                        if (object3 != null) {
                            n3 = R$id.sd_cornerIcon;
                            View view5 = view = dd2_2.a(n3, object);
                            view5 = (ImageView)view;
                            if (view5 != null) {
                                n3 = R$id.sd_deliveryDate;
                                View view6 = view = dd2_2.a(n3, object);
                                view6 = (TextView)view;
                                if (view6 != null) {
                                    n3 = R$id.sd_finalDate;
                                    View view7 = view = dd2_2.a(n3, object);
                                    view7 = (TextView)view;
                                    if (view7 != null) {
                                        Object object4 = object;
                                        object4 = (ConstraintLayout)((Object)object);
                                        PdpPriorityLayoutBinding pdpPriorityLayoutBinding = new PdpPriorityLayoutBinding((ConstraintLayout)((Object)object4), (ConstraintLayout)((Object)object2), (ImageView)view2, (TextView)view3, (TextView)view4, (ConstraintLayout)((Object)object3), (ImageView)view5, (TextView)view6, (TextView)view7);
                                        return pdpPriorityLayoutBinding;
                                    }
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

    public static PdpPriorityLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PdpPriorityLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PdpPriorityLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_priority_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpPriorityLayoutBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

