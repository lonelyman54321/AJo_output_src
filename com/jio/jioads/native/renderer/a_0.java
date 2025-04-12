/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.native.renderer;

import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from com.jio.jioads.native.renderer.A
 */
public final class a_0
extends FunctionReferenceImpl
implements Function1 {
    public final Object invoke(Object object) {
        object = (String)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return NativeAdViewRenderer.access$getContainerSize((NativeAdViewRenderer)this.receiver, (String)object);
    }
}

