/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitcompat;

import com.google.android.play.core.splitcompat.zzh;
import com.google.android.play.core.splitcompat.zzl;
import com.google.android.play.core.splitcompat.zzm;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

final class zzg
implements zzl {
    final /* synthetic */ zzh zza;

    public zzg(zzh zzh2) {
        this.zza = zzh2;
    }

    public final void zza(zzm object, File file, boolean bl2) {
        object = this.zza.zzb;
        object.add(file);
        if (!bl2) {
            object = this.zza.zzc;
            file = null;
            ((AtomicBoolean)object).set(false);
        }
    }
}

