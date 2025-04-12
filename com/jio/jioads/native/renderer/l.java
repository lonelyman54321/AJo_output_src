/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native.renderer;

import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class l
extends Lambda
implements Function0 {
    public final /* synthetic */ NativeAdViewRenderer c;

    public l(NativeAdViewRenderer nativeAdViewRenderer) {
        this.c = nativeAdViewRenderer;
        super(0);
    }

    public final Object invoke() {
        NativeAdViewRenderer.access$prepredNativeVideoAd(this.c);
        return Unit.a;
    }
}

