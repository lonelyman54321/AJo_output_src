/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.testing.zzv;
import java.util.Collections;
import java.util.Map;

abstract class zzu {
    public abstract zzu zza(int var1);

    public abstract zzu zzb(Map var1);

    public abstract zzv zzc();

    public abstract Map zzd();

    public final zzv zze() {
        Map map2 = Collections.unmodifiableMap(this.zzd());
        this.zzb(map2);
        return this.zzc();
    }
}

