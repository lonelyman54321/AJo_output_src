/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.jio.unity.plugin.android;

import android.view.ViewTreeObserver;
import com.jio.unity.plugin.android.UnityBridge;

class UnityBridge$2
implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ UnityBridge a;

    public UnityBridge$2(UnityBridge unityBridge) {
        this.a = unityBridge;
    }

    public final void onGlobalLayout() {
        UnityBridge unityBridge = this.a;
        unityBridge.b.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        StringBuilder stringBuilder = new StringBuilder("Inside cacheAd() myLayout height after layout: ");
        int n3 = unityBridge.b.getHeight();
        stringBuilder.append(n3);
        UnityBridge.a(stringBuilder.toString());
        stringBuilder = new StringBuilder("Inside cacheAd() myLayout width after layout: ");
        n3 = unityBridge.b.getWidth();
        stringBuilder.append(n3);
        UnityBridge.a(stringBuilder.toString());
        unityBridge.d.cacheAd();
    }
}

