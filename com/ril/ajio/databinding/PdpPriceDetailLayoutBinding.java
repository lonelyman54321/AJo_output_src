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
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class PdpPriceDetailLayoutBinding
implements BC3 {
    public final AppCompatImageView icNoSize;
    public final View noSizeBg;
    public final ConstraintLayout noSizeInfoContainer;
    public final TextView noSizeTv1;
    public final TextView pdpPriceTitle;
    public final LinearLayout priceDetailDynamicContainer;
    private final LinearLayout rootView;
    public final AppCompatImageView selectSizeTriangle;

    private PdpPriceDetailLayoutBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, View view, ConstraintLayout constraintLayout, TextView textView, TextView textView2, LinearLayout linearLayout2, AppCompatImageView appCompatImageView2) {
        this.rootView = linearLayout;
        this.icNoSize = appCompatImageView;
        this.noSizeBg = view;
        this.noSizeInfoContainer = constraintLayout;
        this.noSizeTv1 = textView;
        this.pdpPriceTitle = textView2;
        this.priceDetailDynamicContainer = linearLayout2;
        this.selectSizeTriangle = appCompatImageView2;
    }

    public static PdpPriceDetailLayoutBinding bind(View object) {
        View view;
        View view2;
        int n3 = R$id.ic_no_size;
        Object object2 = view2 = dd2_2.a(n3, object);
        object2 = (AppCompatImageView)view2;
        if (object2 != null && (view = dd2_2.a(n3 = R$id.no_size_bg, object)) != null) {
            n3 = R$id.no_size_info_container;
            Object object3 = view2 = dd2_2.a(n3, object);
            object3 = (ConstraintLayout)view2;
            if (object3 != null) {
                n3 = R$id.no_size_tv_1;
                View view3 = view2 = dd2_2.a(n3, object);
                view3 = (TextView)view2;
                if (view3 != null) {
                    n3 = R$id.pdp_price_title;
                    View view4 = view2 = dd2_2.a(n3, object);
                    view4 = (TextView)view2;
                    if (view4 != null) {
                        n3 = R$id.price_detail_dynamic_container;
                        View view5 = view2 = dd2_2.a(n3, object);
                        view5 = (LinearLayout)view2;
                        if (view5 != null) {
                            n3 = R$id.select_size_triangle;
                            Object object4 = view2 = dd2_2.a(n3, object);
                            object4 = (AppCompatImageView)view2;
                            if (object4 != null) {
                                Object object5 = object;
                                object5 = (LinearLayout)object;
                                PdpPriceDetailLayoutBinding pdpPriceDetailLayoutBinding = new PdpPriceDetailLayoutBinding((LinearLayout)object5, (AppCompatImageView)((Object)object2), view, (ConstraintLayout)((Object)object3), (TextView)view3, (TextView)view4, (LinearLayout)view5, (AppCompatImageView)((Object)object4));
                                return pdpPriceDetailLayoutBinding;
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

    public static PdpPriceDetailLayoutBinding inflate(LayoutInflater layoutInflater) {
        return PdpPriceDetailLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static PdpPriceDetailLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_price_detail_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpPriceDetailLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

