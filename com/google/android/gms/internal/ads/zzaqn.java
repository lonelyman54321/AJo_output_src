/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzaqn {
    public byte[] zza;
    public String zzb;
    public long zzc;
    public long zzd;
    public long zze;
    public long zzf;
    public Map zzg;
    public List zzh;

    public zzaqn() {
        Map map2;
        this.zzg = map2 = Collections.emptyMap();
    }

    public final boolean zza(long l2) {
        long l3 = this.zze;
        long l4 = l3 - l2;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        return object < 0;
    }
}

