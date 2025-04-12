/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.ktx;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

final class zzj
extends Lambda
implements Function1 {
    private final /* synthetic */ Function0 zza;

    public zzj(Function0 function0) {
        this.zza = function0;
        super(1);
    }

    public final /* synthetic */ Object invoke(Object object) {
        object = (Throwable)object;
        this.zza.invoke();
        return Unit.a;
    }
}

