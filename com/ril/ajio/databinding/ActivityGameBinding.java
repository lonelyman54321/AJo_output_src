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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public final class ActivityGameBinding
implements BC3 {
    public final WebView agWebView;
    private final ConstraintLayout rootView;

    private ActivityGameBinding(ConstraintLayout constraintLayout, WebView webView) {
        this.rootView = constraintLayout;
        this.agWebView = webView;
    }

    public static ActivityGameBinding bind(View object) {
        int n3 = R$id.agWebView;
        WebView webView = (WebView)dd2_2.a(n3, object);
        if (webView != null) {
            object = (ConstraintLayout)((Object)object);
            ActivityGameBinding activityGameBinding = new ActivityGameBinding((ConstraintLayout)((Object)object), webView);
            return activityGameBinding;
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static ActivityGameBinding inflate(LayoutInflater layoutInflater) {
        return ActivityGameBinding.inflate(layoutInflater, null, false);
    }

    public static ActivityGameBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.activity_game;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return ActivityGameBinding.bind((View)layoutInflater);
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}

