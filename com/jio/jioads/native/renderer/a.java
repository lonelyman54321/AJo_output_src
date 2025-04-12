/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler$Callback
 *  android.os.Message
 */
package com.jio.jioads.native.renderer;

import android.os.Handler;
import android.os.Message;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;

public final class a
implements Handler.Callback {
    public final /* synthetic */ NativeAdViewRenderer a;

    public /* synthetic */ a(NativeAdViewRenderer nativeAdViewRenderer) {
        this.a = nativeAdViewRenderer;
    }

    public final boolean handleMessage(Message message) {
        return NativeAdViewRenderer.a(this.a, message);
    }
}

