/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzhe;
import com.google.android.gms.internal.ads.zzhh;
import java.util.Collections;
import java.util.Map;

public final class zzhf {
    private Uri zza;
    private Map zzb;
    private long zzc;
    private final long zzd;
    private int zze;

    public zzhf() {
        Map map2;
        this.zzb = map2 = Collections.emptyMap();
        this.zzd = -1;
    }

    public /* synthetic */ zzhf(zzhh zzhh2, zzhe object) {
        int n3;
        long l2;
        object = zzhh2.zza;
        this.zza = object;
        this.zzb = object = zzhh2.zzd;
        this.zzc = l2 = zzhh2.zze;
        this.zzd = l2 = zzhh2.zzf;
        this.zze = n3 = zzhh2.zzg;
    }

    public final zzhf zza(int n3) {
        this.zze = 6;
        return this;
    }

    public final zzhf zzb(Map map2) {
        this.zzb = map2;
        return this;
    }

    public final zzhf zzc(long l2) {
        this.zzc = l2;
        return this;
    }

    public final zzhf zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzhh zze() {
        Object object = this.zza;
        if (object != null) {
            Uri uri = this.zza;
            Map map2 = this.zzb;
            long l2 = this.zzc;
            long l3 = this.zzd;
            int n3 = this.zze;
            object = new zzhh(uri, 0L, 1, null, map2, l2, l3, null, n3, null, null);
            return object;
        }
        object = new IllegalStateException("The uri must be set.");
        throw object;
    }
}

