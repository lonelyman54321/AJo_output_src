/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzhh;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class zzvf {
    private static final AtomicLong zzd;
    public final zzhh zza;
    public final Uri zzb;
    public final Map zzc;

    static {
        AtomicLong atomicLong;
        zzd = atomicLong = new AtomicLong();
    }

    public zzvf(long l2, zzhh zzhh2, Uri uri, Map map2, long l3, long l4, long l7) {
        this.zza = zzhh2;
        this.zzb = uri;
        this.zzc = map2;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}

