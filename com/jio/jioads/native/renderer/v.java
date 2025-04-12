/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native.renderer;

import com.jio.jioads.common.c;
import com.jio.jioads.controller.f;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class v
extends Lambda
implements Function2 {
    public final /* synthetic */ NativeAdViewRenderer c;

    public v(NativeAdViewRenderer nativeAdViewRenderer) {
        this.c = nativeAdViewRenderer;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        Object object3 = this.c;
        c c2 = NativeAdViewRenderer.access$getIJioAdViewController$p((NativeAdViewRenderer)object3);
        object3 = NativeAdViewRenderer.access$getHeaders((NativeAdViewRenderer)object3);
        return ((f)c2).f((String)object, (String)object2, (Map)object3);
    }
}

