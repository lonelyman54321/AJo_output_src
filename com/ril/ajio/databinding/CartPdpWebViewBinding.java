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
import androidx.appcompat.widget.Toolbar;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.databinding.ToolbarTitleViewBinding;
import com.ril.ajio.web.AjioCustomWebView;

public final class CartPdpWebViewBinding
implements BC3 {
    public final AjioCustomWebView cartPDPWebView;
    public final AjioLoaderView loaderView;
    private final LinearLayout rootView;
    public final Toolbar toolbar;
    public final ToolbarTitleViewBinding toolbarHeaderView;

    private CartPdpWebViewBinding(LinearLayout linearLayout, AjioCustomWebView ajioCustomWebView, AjioLoaderView ajioLoaderView, Toolbar toolbar, ToolbarTitleViewBinding toolbarTitleViewBinding) {
        this.rootView = linearLayout;
        this.cartPDPWebView = ajioCustomWebView;
        this.loaderView = ajioLoaderView;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleViewBinding;
    }

    public static CartPdpWebViewBinding bind(View object) {
        View view;
        int n3 = R$id.cartPDPWebView;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioCustomWebView)view;
        if (object2 != null) {
            n3 = R$id.loaderView;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (AjioLoaderView)view;
            if (object3 != null) {
                n3 = R$id.toolbar;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (Toolbar)view;
                if (object4 != null && (view = dd2_2.a(n3 = R$id.toolbar_header_view, object)) != null) {
                    ToolbarTitleViewBinding toolbarTitleViewBinding = ToolbarTitleViewBinding.bind(view);
                    Object object5 = object;
                    object5 = (LinearLayout)object;
                    CartPdpWebViewBinding cartPdpWebViewBinding = new CartPdpWebViewBinding((LinearLayout)object5, (AjioCustomWebView)((Object)object2), (AjioLoaderView)((Object)object3), (Toolbar)object4, toolbarTitleViewBinding);
                    return cartPdpWebViewBinding;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static CartPdpWebViewBinding inflate(LayoutInflater layoutInflater) {
        return CartPdpWebViewBinding.inflate(layoutInflater, null, false);
    }

    public static CartPdpWebViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.cart_pdp_web_view;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return CartPdpWebViewBinding.bind((View)layoutInflater);
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }
}

