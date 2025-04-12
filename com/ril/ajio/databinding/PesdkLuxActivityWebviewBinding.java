/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.PEProgressView;

public final class PesdkLuxActivityWebviewBinding
implements BC3 {
    public final PEProgressView peWebviewProgressBar;
    public final LinearLayout pesdkLayoutCoordinator;
    private final LinearLayout rootView;
    public final WebView webview;

    private PesdkLuxActivityWebviewBinding(LinearLayout linearLayout, PEProgressView pEProgressView, LinearLayout linearLayout2, WebView webView) {
        this.rootView = linearLayout;
        this.peWebviewProgressBar = pEProgressView;
        this.pesdkLayoutCoordinator = linearLayout2;
        this.webview = webView;
    }

    public static PesdkLuxActivityWebviewBinding bind(View object) {
        WebView webView;
        LinearLayout linearLayout;
        int n3 = R$id.pe_webview_progress_bar;
        PEProgressView pEProgressView = (PEProgressView)dd2_2.a(n3, object);
        if (pEProgressView != null && (linearLayout = (LinearLayout)dd2_2.a(n3 = R$id.pesdk_layout_coordinator, object)) != null && (webView = (WebView)dd2_2.a(n3 = R$id.webview, object)) != null) {
            object = (LinearLayout)object;
            PesdkLuxActivityWebviewBinding pesdkLuxActivityWebviewBinding = new PesdkLuxActivityWebviewBinding((LinearLayout)object, pEProgressView, linearLayout, webView);
            return pesdkLuxActivityWebviewBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkLuxActivityWebviewBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxActivityWebviewBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxActivityWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_activity_webview;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxActivityWebviewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

