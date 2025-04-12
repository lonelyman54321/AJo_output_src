/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ProductZoomLayoutBinding
implements BC3 {
    public final LinearLayout parentScrollView;
    public final ImageButton productGalleryClose;
    private final LinearLayout rootView;
    public final WebView sizeguideWebview;

    private ProductZoomLayoutBinding(LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, WebView webView) {
        this.rootView = linearLayout;
        this.parentScrollView = linearLayout2;
        this.productGalleryClose = imageButton;
        this.sizeguideWebview = webView;
    }

    public static ProductZoomLayoutBinding bind(View object) {
        WebView webView;
        Object object2 = object;
        object2 = (LinearLayout)object;
        int n3 = R$id.product_gallery_close;
        ImageButton imageButton = (ImageButton)dd2_2.a(n3, object);
        if (imageButton != null && (webView = (WebView)dd2_2.a(n3 = R$id.sizeguide_webview, object)) != null) {
            object = new ProductZoomLayoutBinding((LinearLayout)object2, (LinearLayout)object2, imageButton, webView);
            return object;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        object2 = new NullPointerException((String)object);
        throw object2;
    }

    public static ProductZoomLayoutBinding inflate(LayoutInflater layoutInflater) {
        return ProductZoomLayoutBinding.inflate(layoutInflater, null, false);
    }

    public static ProductZoomLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.product_zoom_layout;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ProductZoomLayoutBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

