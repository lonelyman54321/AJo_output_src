/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.jio.unity.plugin.android;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.unity.plugin.android.UnityBridge;

class UnityBridge$1
implements Runnable {
    public final /* synthetic */ UnityBridge a;

    public UnityBridge$1(UnityBridge unityBridge) {
        this.a = unityBridge;
    }

    public final void run() {
        Object object = this.a;
        JioAdView jioAdView = ((UnityBridge)object).d;
        if (jioAdView != null && (jioAdView = ((UnityBridge)object).b) != null) {
            UnityBridge.a("loadAd called");
            ((UnityBridge)object).b.removeAllViews();
            jioAdView = ((UnityBridge)object).d;
            FrameLayout frameLayout = ((UnityBridge)object).b;
            jioAdView.setContainer((ViewGroup)frameLayout);
            object = ((UnityBridge)object).d;
            ((JioAdView)object).loadAd();
        } else {
            object = "mAdView or myLayout is null";
            UnityBridge.a((String)object);
        }
    }
}

