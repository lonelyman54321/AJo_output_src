/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package com.jio.unity.plugin.android;

import android.view.ViewTreeObserver;
import com.jio.unity.plugin.android.UnityBridge;
import com.jio.unity.plugin.android.UnityBridge$2;

public final class b
implements Runnable {
    public final /* synthetic */ UnityBridge a;

    public /* synthetic */ b(UnityBridge unityBridge) {
        this.a = unityBridge;
    }

    public final void run() {
        UnityBridge unityBridge = this.a;
        ViewTreeObserver viewTreeObserver = unityBridge.b.getViewTreeObserver();
        UnityBridge$2 unityBridge$2 = new UnityBridge$2(unityBridge);
        viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)unityBridge$2);
    }
}

