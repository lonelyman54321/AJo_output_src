/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videoAds;

import com.jio.jioads.videoAds.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class b
extends FunctionReferenceImpl
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        int n3 = ((Number)object).intValue();
        int n4 = ((Number)object2).intValue();
        h.f((h)this.receiver, n3, n4);
        return Unit.a;
    }
}

