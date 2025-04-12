/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ProgressBar
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;

public final class ProductlistfooterBinding
implements BC3 {
    public final FrameLayout filterFramelayoutHybris;
    public final ProgressBar filterProgressbarHybris;
    private final RelativeLayout rootView;
    public final AjioTextView tvProductliststaytunedmessage;

    private ProductlistfooterBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, ProgressBar progressBar, AjioTextView ajioTextView) {
        this.rootView = relativeLayout;
        this.filterFramelayoutHybris = frameLayout;
        this.filterProgressbarHybris = progressBar;
        this.tvProductliststaytunedmessage = ajioTextView;
    }

    public static ProductlistfooterBinding bind(View object) {
        AjioTextView ajioTextView;
        ProgressBar progressBar;
        int n3 = R$id.filter_framelayout_hybris;
        FrameLayout frameLayout = (FrameLayout)dd2_2.a(n3, object);
        if (frameLayout != null && (progressBar = (ProgressBar)dd2_2.a(n3 = R$id.filter_progressbar_hybris, object)) != null && (ajioTextView = (AjioTextView)dd2_2.a(n3 = R$id.tv_productliststaytunedmessage, object)) != null) {
            object = (RelativeLayout)object;
            ProductlistfooterBinding productlistfooterBinding = new ProductlistfooterBinding((RelativeLayout)object, frameLayout, progressBar, ajioTextView);
            return productlistfooterBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ProductlistfooterBinding inflate(LayoutInflater layoutInflater) {
        return ProductlistfooterBinding.inflate(layoutInflater, null, false);
    }

    public static ProductlistfooterBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.productlistfooter;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ProductlistfooterBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

