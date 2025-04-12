/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebView
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.databinding.ToolbarGamezoneGamelistBinding;
import com.ril.ajio.databinding.ToolbarGamezoneOpengameBinding;
import com.ril.ajio.databinding.ToolbarGamezonePlaygameBinding;

public final class ActivityGamezoneBinding
implements BC3 {
    public final WebView agWebView;
    public final AjioLoaderView ajioLoaderView;
    public final RelativeLayout gamezoneToolbar;
    public final AjioTextView notificationText;
    private final RelativeLayout rootView;
    public final ToolbarGamezoneGamelistBinding toolbarGamezone;
    public final ToolbarGamezoneOpengameBinding toolbarGamezoneOpengame;
    public final ToolbarGamezonePlaygameBinding toolbarGamezonePlaygame;

    private ActivityGamezoneBinding(RelativeLayout relativeLayout, WebView webView, AjioLoaderView ajioLoaderView, RelativeLayout relativeLayout2, AjioTextView ajioTextView, ToolbarGamezoneGamelistBinding toolbarGamezoneGamelistBinding, ToolbarGamezoneOpengameBinding toolbarGamezoneOpengameBinding, ToolbarGamezonePlaygameBinding toolbarGamezonePlaygameBinding) {
        this.rootView = relativeLayout;
        this.agWebView = webView;
        this.ajioLoaderView = ajioLoaderView;
        this.gamezoneToolbar = relativeLayout2;
        this.notificationText = ajioTextView;
        this.toolbarGamezone = toolbarGamezoneGamelistBinding;
        this.toolbarGamezoneOpengame = toolbarGamezoneOpengameBinding;
        this.toolbarGamezonePlaygame = toolbarGamezonePlaygameBinding;
    }

    public static ActivityGamezoneBinding bind(View object) {
        View view;
        int n3 = R$id.agWebView;
        View view2 = view = dd2_2.a(n3, object);
        view2 = (WebView)view;
        if (view2 != null) {
            n3 = R$id.ajio_loader_view;
            Object object2 = view = dd2_2.a(n3, object);
            object2 = (AjioLoaderView)view;
            if (object2 != null) {
                n3 = R$id.gamezone_toolbar;
                View view3 = view = dd2_2.a(n3, object);
                view3 = (RelativeLayout)view;
                if (view3 != null) {
                    n3 = R$id.notification_text;
                    Object object3 = view = dd2_2.a(n3, object);
                    object3 = (AjioTextView)view;
                    if (object3 != null && (view = dd2_2.a(n3 = R$id.toolbar_gamezone, object)) != null) {
                        ToolbarGamezoneGamelistBinding toolbarGamezoneGamelistBinding = ToolbarGamezoneGamelistBinding.bind(view);
                        n3 = R$id.toolbar_gamezone_opengame;
                        view = dd2_2.a(n3, object);
                        if (view != null) {
                            ToolbarGamezoneOpengameBinding toolbarGamezoneOpengameBinding = ToolbarGamezoneOpengameBinding.bind(view);
                            n3 = R$id.toolbar_gamezone_playgame;
                            view = dd2_2.a(n3, object);
                            if (view != null) {
                                ToolbarGamezonePlaygameBinding toolbarGamezonePlaygameBinding = ToolbarGamezonePlaygameBinding.bind(view);
                                Object object4 = object;
                                object4 = (RelativeLayout)object;
                                ActivityGamezoneBinding activityGamezoneBinding = new ActivityGamezoneBinding((RelativeLayout)object4, (WebView)view2, (AjioLoaderView)((Object)object2), (RelativeLayout)view3, (AjioTextView)object3, toolbarGamezoneGamelistBinding, toolbarGamezoneOpengameBinding, toolbarGamezonePlaygameBinding);
                                return activityGamezoneBinding;
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

    public static ActivityGamezoneBinding inflate(LayoutInflater layoutInflater) {
        return ActivityGamezoneBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityGamezoneBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_gamezone;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityGamezoneBinding.bind((View)layoutInflater);
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }
}

