/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.testing.zza;
import com.google.android.play.core.splitinstall.testing.zzu;
import java.util.HashMap;
import java.util.Map;

public abstract class zzv {
    public static final zzv zza = zzv.zzc().zze();

    public static zzu zzc() {
        zza zza2 = new zza();
        HashMap hashMap = new HashMap();
        zza2.zzb(hashMap);
        return zza2;
    }

    public abstract Integer zza();

    public abstract Map zzb();
}

