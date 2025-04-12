/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzlk;
import com.google.android.gms.internal.ads.zzmn;
import com.google.android.gms.internal.ads.zzpj;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzv;

public final class zzcgb
implements zzlk {
    private final zzzv zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private int zzg;
    private boolean zzh;

    public zzcgb() {
        zzzv zzzv2;
        this.zzb = zzzv2 = new zzzv(true, 65536);
        this.zzc = 15000000L;
        this.zzd = 30000000L;
        this.zze = 2500000L;
        this.zzf = 5000000L;
    }

    public final void zza(boolean bl2) {
        this.zzg = 0;
        this.zzh = false;
        if (bl2) {
            zzzv zzzv2 = this.zzb;
            zzzv2.zze();
        }
    }

    public final long zzb(zzpj zzpj2) {
        return 0L;
    }

    public final void zzc(zzpj zzpj2) {
        this.zza(false);
    }

    public final void zzd(zzpj zzpj2) {
        this.zza(true);
    }

    public final void zze(zzpj zzpj2) {
        this.zza(true);
    }

    public final void zzf(zzpj object, zzdc object2, zzvo object3, zzmn[] zzmnArray, zzxr zzxr2, zzzg[] zzzgArray) {
        int n3;
        int n4 = 0;
        object = null;
        this.zzg = 0;
        while (true) {
            n3 = zzmnArray.length;
            n3 = 2;
            if (n4 >= n3) break;
            object2 = zzzgArray[n4];
            if (object2 != null) {
                int n7;
                n3 = this.zzg;
                object3 = zzmnArray[n4];
                int n8 = object3.zzb();
                n8 = n8 != (n7 = 1) ? 0x7D00000 : 0xC80000;
                this.zzg = n3 += n8;
            }
            ++n4;
        }
        object = this.zzb;
        n3 = this.zzg;
        ((zzzv)object).zzf(n3);
    }

    public final boolean zzg(zzpj zzpj2) {
        return false;
    }

    public final boolean zzh(zzpj zzpj2, zzdc object, zzvo zzvo2, long l2, long l3, float f5) {
        long l4;
        long l7 = this.zzd;
        int n3 = 2;
        int n4 = 1;
        Object object2 = l3 == l7 ? 0 : (l3 < l7 ? -1 : 1);
        int n7 = object2 > 0 ? 0 : ((object2 = (l4 = l3 - (l7 = this.zzc)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) < 0 ? 2 : 1);
        object = this.zzb;
        int n8 = ((zzzv)object).zza();
        int n10 = this.zzg;
        if (n7 != n3 && (n7 != n4 || (n7 = this.zzh) == 0 || n8 >= n10)) {
            n4 = 0;
        }
        this.zzh = n4;
        return n4 != 0;
    }

    public final boolean zzi(zzpj zzpj2, zzdc zzdc2, zzvo zzvo2, long l2, float f5, boolean bl2, long l3) {
        long l4 = bl2 ? this.zzf : this.zze;
        long l7 = 0L;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        return l8 <= 0 || (l8 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1)) >= 0;
        {
        }
    }

    public final zzzv zzj() {
        return this.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk(int n3) {
        synchronized (this) {
            long l2 = n3;
            long l3 = 1000L;
            this.zze = l2 *= l3;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzl(int n3) {
        synchronized (this) {
            long l2 = n3;
            long l3 = 1000L;
            this.zzf = l2 *= l3;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzm(int n3) {
        synchronized (this) {
            long l2 = n3;
            long l3 = 1000L;
            this.zzd = l2 *= l3;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzn(int n3) {
        synchronized (this) {
            long l2 = n3;
            long l3 = 1000L;
            this.zzc = l2 *= l3;
            return;
        }
    }
}

