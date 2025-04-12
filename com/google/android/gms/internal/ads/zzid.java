/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzhb;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzie;
import java.util.Collections;
import java.util.Map;

public final class zzid
implements zzhb {
    private final zzhb zza;
    private long zzb;
    private Uri zzc;
    private Map zzd;

    public zzid(zzhb object) {
        this.zza = object;
        object = Uri.EMPTY;
        this.zzc = object;
        this.zzd = object = Collections.emptyMap();
    }

    public final int zza(byte[] byArray, int n3, int n4) {
        zzhb zzhb2 = this.zza;
        int n7 = zzhb2.zza(byArray, n3, n4);
        if (n7 != (n3 = -1)) {
            long l2 = this.zzb;
            long l3 = n7;
            this.zzb = l2 += l3;
        }
        return n7;
    }

    public final long zzb(zzhh object) {
        Object object2;
        this.zzc = object2 = ((zzhh)object).zza;
        object2 = Collections.emptyMap();
        this.zzd = object2;
        long l2 = this.zza.zzb((zzhh)object);
        object = this.zzc();
        object.getClass();
        this.zzc = object;
        this.zzd = object = this.zze();
        return l2;
    }

    public final Uri zzc() {
        return this.zza.zzc();
    }

    public final void zzd() {
        this.zza.zzd();
    }

    public final Map zze() {
        return this.zza.zze();
    }

    public final void zzf(zzie zzie2) {
        zzie2.getClass();
        this.zza.zzf(zzie2);
    }

    public final long zzg() {
        return this.zzb;
    }

    public final Uri zzh() {
        return this.zzc;
    }

    public final Map zzi() {
        return this.zzd;
    }
}

