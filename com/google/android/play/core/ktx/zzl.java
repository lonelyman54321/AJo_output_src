/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.ktx;

import com.google.android.gms.tasks.OnFailureListener;
import kotlin.jvm.internal.Intrinsics;

final class zzl
implements OnFailureListener {
    private final /* synthetic */ bl_2 zza;

    public zzl(bl_2 bl_22) {
        this.zza = bl_22;
    }

    public final void onFailure(Exception serializable) {
        Intrinsics.checkNotNullParameter(serializable, "exception");
        bl_2 bl_22 = this.zza;
        serializable = vl2_2.a(serializable);
        bl_22.resumeWith(serializable);
    }
}

