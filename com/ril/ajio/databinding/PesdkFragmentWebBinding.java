/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.widget.FrameLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.PEProgressView;

public final class PesdkFragmentWebBinding
implements BC3 {
    public final WebView ajioWebpages;
    public final PEProgressView fragmentWebProgressView;
    private final FrameLayout rootView;

    private PesdkFragmentWebBinding(FrameLayout frameLayout, WebView webView, PEProgressView pEProgressView) {
        this.rootView = frameLayout;
        this.ajioWebpages = webView;
        this.fragmentWebProgressView = pEProgressView;
    }

    public static PesdkFragmentWebBinding bind(View object) {
        PEProgressView pEProgressView;
        int n3 = R$id.ajio_webpages;
        WebView webView = (WebView)dd2_2.a(n3, object);
        if (webView != null && (pEProgressView = (PEProgressView)dd2_2.a(n3 = R$id.fragment_web_progressView, object)) != null) {
            object = (FrameLayout)object;
            PesdkFragmentWebBinding pesdkFragmentWebBinding = new PesdkFragmentWebBinding((FrameLayout)object, webView, pEProgressView);
            return pesdkFragmentWebBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkFragmentWebBinding inflate(LayoutInflater layoutInflater) {
        return PesdkFragmentWebBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkFragmentWebBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_fragment_web;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkFragmentWebBinding.bind((View)layoutInflater);
    }

    public FrameLayout getRoot() {
        return this.rootView;
    }
}

