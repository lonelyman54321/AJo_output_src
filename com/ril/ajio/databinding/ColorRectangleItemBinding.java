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
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ColorRectangleItemBinding
implements BC3 {
    public final AjioTextView colorTv;
    public final LinearLayout myCardView;
    private final LinearLayout rootView;
    public final LinearLayout rowPdpColor;
    public final AppCompatImageView rowProductDetailImvColor;

    private ColorRectangleItemBinding(LinearLayout linearLayout, AjioTextView ajioTextView, LinearLayout linearLayout2, LinearLayout linearLayout3, AppCompatImageView appCompatImageView) {
        this.rootView = linearLayout;
        this.colorTv = ajioTextView;
        this.myCardView = linearLayout2;
        this.rowPdpColor = linearLayout3;
        this.rowProductDetailImvColor = appCompatImageView;
    }

    public static ColorRectangleItemBinding bind(View object) {
        View view;
        int n3 = R$id.color_tv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioTextView)view;
        if (object2 != null) {
            n3 = R$id.myCardView;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (LinearLayout)view;
            if (view2 != null) {
                Object object3 = object;
                object3 = (LinearLayout)object;
                n3 = R$id.row_product_detail_imv_color;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (AppCompatImageView)view;
                if (object4 != null) {
                    object = new ColorRectangleItemBinding((LinearLayout)object3, (AjioTextView)object2, (LinearLayout)view2, (LinearLayout)object3, (AppCompatImageView)((Object)object4));
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ColorRectangleItemBinding inflate(LayoutInflater layoutInflater) {
        return ColorRectangleItemBinding.inflate(layoutInflater, null, false);
    }

    public static ColorRectangleItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.color_rectangle_item;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ColorRectangleItemBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

