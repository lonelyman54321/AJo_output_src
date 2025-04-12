/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.ktx;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class zzm
extends Lambda
implements Function1 {
    private final /* synthetic */ bl_2 zza;

    public zzm(bl_2 bl_22) {
        this.zza = bl_22;
        super(1);
    }

    public final Object invoke(Object object) {
        bl_2 bl_22 = this.zza;
        bl_22.resumeWith(object);
        return Unit.a;
    }
}

