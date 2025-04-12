/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall;

import com.google.android.play.core.splitinstall.zzg;
import com.google.android.play.core.splitinstall.zzh;
import java.util.concurrent.atomic.AtomicReference;

public final class zzo
extends Enum
implements zzg {
    public static final /* enum */ zzo zza;
    private static final AtomicReference zzb;
    private static final /* synthetic */ zzo[] zzc;

    static {
        AtomicReference<Object> atomicReference = new AtomicReference<Object>("INSTANCE", 0);
        zza = atomicReference;
        zzo[] zzoArray = new zzo[]{atomicReference};
        zzc = zzoArray;
        zzb = atomicReference = new AtomicReference<Object>(null);
    }

    public static zzo[] values() {
        return (zzo[])zzc.clone();
    }

    public final zzh zza() {
        return (zzh)zzb.get();
    }

    public final void zzb(zzh zzh2) {
        zzb.set(zzh2);
    }
}

