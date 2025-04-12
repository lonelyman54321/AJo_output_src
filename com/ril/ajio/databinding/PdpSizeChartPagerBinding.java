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
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.web.AjioCustomWebView;

public final class PdpSizeChartPagerBinding
implements BC3 {
    public final AjioCustomWebView pdpSizeWeb;
    public final AjioProgressView progressBar;
    private final LinearLayout rootView;

    private PdpSizeChartPagerBinding(LinearLayout linearLayout, AjioCustomWebView ajioCustomWebView, AjioProgressView ajioProgressView) {
        this.rootView = linearLayout;
        this.pdpSizeWeb = ajioCustomWebView;
        this.progressBar = ajioProgressView;
    }

    public static PdpSizeChartPagerBinding bind(View object) {
        AjioProgressView ajioProgressView;
        int n3 = R$id.pdp_size_web;
        AjioCustomWebView ajioCustomWebView = (AjioCustomWebView)dd2_2.a(n3, object);
        if (ajioCustomWebView != null && (ajioProgressView = (AjioProgressView)dd2_2.a(n3 = R$id.progress_bar, object)) != null) {
            object = (LinearLayout)object;
            PdpSizeChartPagerBinding pdpSizeChartPagerBinding = new PdpSizeChartPagerBinding((LinearLayout)object, ajioCustomWebView, ajioProgressView);
            return pdpSizeChartPagerBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PdpSizeChartPagerBinding inflate(LayoutInflater layoutInflater) {
        return PdpSizeChartPagerBinding.inflate(layoutInflater, null, false);
    }

    public static PdpSizeChartPagerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pdp_size_chart_pager;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PdpSizeChartPagerBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

