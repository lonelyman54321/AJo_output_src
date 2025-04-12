/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class LuxeNewProductMoreInformationCardBinding
implements BC3 {
    public final ConstraintLayout clMainMoreInfo;
    public final ConstraintLayout clMoreInfo;
    public final View divider4;
    public final TextView moreInfoHeader;
    private final ConstraintLayout rootView;
    public final LinearLayout rowMoreInfoLayoutDynamic;
    public final ImageView rowPdpImvMoreInfo;

    private LuxeNewProductMoreInformationCardBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, View view, TextView textView, LinearLayout linearLayout, ImageView imageView) {
        this.rootView = constraintLayout;
        this.clMainMoreInfo = constraintLayout2;
        this.clMoreInfo = constraintLayout3;
        this.divider4 = view;
        this.moreInfoHeader = textView;
        this.rowMoreInfoLayoutDynamic = linearLayout;
        this.rowPdpImvMoreInfo = imageView;
    }

    public static LuxeNewProductMoreInformationCardBinding bind(View object) {
        View view;
        View view2;
        Object object2 = object;
        object2 = (ConstraintLayout)((Object)object);
        int n3 = R$id.cl_more_info;
        Object object3 = view2 = dd2_2.a(n3, object);
        object3 = (ConstraintLayout)view2;
        if (object3 != null && (view = dd2_2.a(n3 = R$id.divider4, object)) != null) {
            n3 = R$id.more_info_header;
            View view3 = view2 = dd2_2.a(n3, object);
            view3 = (TextView)view2;
            if (view3 != null) {
                n3 = R$id.row_more_info_layout_dynamic;
                View view4 = view2 = dd2_2.a(n3, object);
                view4 = (LinearLayout)view2;
                if (view4 != null) {
                    n3 = R$id.row_pdp_imv_more_info;
                    View view5 = view2 = dd2_2.a(n3, object);
                    view5 = (ImageView)view2;
                    if (view5 != null) {
                        Object object4 = object;
                        view2 = object2;
                        object = new LuxeNewProductMoreInformationCardBinding((ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object2), (ConstraintLayout)((Object)object3), view, (TextView)view3, (LinearLayout)view4, (ImageView)view5);
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

    public static LuxeNewProductMoreInformationCardBinding inflate(LayoutInflater layoutInflater) {
        return LuxeNewProductMoreInformationCardBinding.inflate(layoutInflater, null, false);
    }

    public static LuxeNewProductMoreInformationCardBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.luxe_new_product_more_information_card;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return LuxeNewProductMoreInformationCardBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

