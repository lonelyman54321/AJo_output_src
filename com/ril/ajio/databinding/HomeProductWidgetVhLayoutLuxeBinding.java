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

public final class HomeProductWidgetVhLayoutLuxeBinding
implements BC3 {
    public final RecyclerView homeProductWidgetRv;
    public final ConstraintLayout productWidgetParent;
    public final AjioTextView productWidgetSubtitleTv;
    public final AjioTextView productWidgetTitleTv;
    private final ConstraintLayout rootView;

    private HomeProductWidgetVhLayoutLuxeBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout2, AjioTextView ajioTextView, AjioTextView ajioTextView2) {
        this.rootView = constraintLayout;
        this.homeProductWidgetRv = recyclerView;
        this.productWidgetParent = constraintLayout2;
        this.productWidgetSubtitleTv = ajioTextView;
        this.productWidgetTitleTv = ajioTextView2;
    }

    public static HomeProductWidgetVhLayoutLuxeBinding bind(View object) {
        View view;
        int n3 = R$id.home_product_widget_rv;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (RecyclerView)view;
        if (object2 != null) {
            Object object3 = object;
            object3 = (ConstraintLayout)((Object)object);
            n3 = R$id.product_widget_subtitle_tv;
            Object object4 = view = dd2_2.a(n3, object);
            object4 = (AjioTextView)view;
            if (object4 != null) {
                n3 = R$id.product_widget_title_tv;
                Object object5 = view = dd2_2.a(n3, object);
                object5 = (AjioTextView)view;
                if (object5 != null) {
                    object = new HomeProductWidgetVhLayoutLuxeBinding((ConstraintLayout)((Object)object3), (RecyclerView)object2, (ConstraintLayout)((Object)object3), (AjioTextView)object4, (AjioTextView)object5);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static HomeProductWidgetVhLayoutLuxeBinding inflate(LayoutInflater layoutInflater) {
        return HomeProductWidgetVhLayoutLuxeBinding.inflate(layoutInflater, null, false);
    }

    public static HomeProductWidgetVhLayoutLuxeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.home_product_widget_vh_layout_luxe;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return HomeProductWidgetVhLayoutLuxeBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

