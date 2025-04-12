/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.webkit.WebView
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.databinding.ToolbarTitleSubtitleViewBinding;

public final class ActivityMyRewardsBinding
implements BC3 {
    public final AjioLoaderView ajioLoaderView;
    private final ConstraintLayout rootView;
    public final Toolbar toolbar;
    public final ToolbarTitleSubtitleViewBinding toolbarHeaderView;
    public final WebView webview;

    private ActivityMyRewardsBinding(ConstraintLayout constraintLayout, AjioLoaderView ajioLoaderView, Toolbar toolbar, ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding, WebView webView) {
        this.rootView = constraintLayout;
        this.ajioLoaderView = ajioLoaderView;
        this.toolbar = toolbar;
        this.toolbarHeaderView = toolbarTitleSubtitleViewBinding;
        this.webview = webView;
    }

    public static ActivityMyRewardsBinding bind(View object) {
        View view;
        int n3 = R$id.ajioLoaderView;
        Object object2 = view = dd2_2.a(n3, object);
        object2 = (AjioLoaderView)view;
        if (object2 != null) {
            n3 = R$id.toolbar;
            Object object3 = view = dd2_2.a(n3, object);
            object3 = (Toolbar)view;
            if (object3 != null && (view = dd2_2.a(n3 = R$id.toolbar_header_view, object)) != null) {
                ToolbarTitleSubtitleViewBinding toolbarTitleSubtitleViewBinding = ToolbarTitleSubtitleViewBinding.bind(view);
                n3 = R$id.webview;
                View view2 = view = dd2_2.a(n3, object);
                view2 = (WebView)view;
                if (view2 != null) {
                    Object object4 = object;
                    object4 = (ConstraintLayout)((Object)object);
                    ActivityMyRewardsBinding activityMyRewardsBinding = new ActivityMyRewardsBinding((ConstraintLayout)((Object)object4), (AjioLoaderView)((Object)object2), (Toolbar)object3, toolbarTitleSubtitleViewBinding, (WebView)view2);
                    return activityMyRewardsBinding;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityMyRewardsBinding inflate(LayoutInflater layoutInflater) {
        return ActivityMyRewardsBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityMyRewardsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_my_rewards;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityMyRewardsBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

