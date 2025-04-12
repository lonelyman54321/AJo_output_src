/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.ktx;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class zzn
implements OnSuccessListener {
    private final /* synthetic */ Function1 zza;

    public zzn(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "function");
        this.zza = function1;
    }

    public final /* synthetic */ void onSuccess(Object object) {
        this.zza.invoke(object);
    }
}

