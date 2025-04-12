/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzaoj;
import com.google.android.gms.internal.ads.zzgp;
import com.google.android.gms.internal.ads.zzgq;
import com.google.android.gms.internal.ads.zzgs;

final class zzaok {
    private final zzafa zza;
    private final SparseArray zzb;
    private final SparseArray zzc;
    private final zzgs zzd;
    private final byte[] zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private final zzaoj zzi;
    private final zzaoj zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private boolean zzo;

    public zzaok(zzafa object, boolean bl2, boolean bl3) {
        zzgs zzgs2;
        this.zza = object;
        this.zzb = object;
        super();
        this.zzc = object;
        this.zzi = object = new zzaoj(null);
        this.zzj = object = new zzaoj(null);
        object = new byte[128];
        this.zze = (byte[])object;
        this.zzd = zzgs2 = new zzgs((byte[])object, 0, 0);
        this.zzk = false;
    }

    public final void zza(zzgp zzgp2) {
        SparseArray sparseArray = this.zzc;
        int n3 = zzgp2.zza;
        sparseArray.append(n3, (Object)zzgp2);
    }

    public final void zzb(zzgq zzgq2) {
        SparseArray sparseArray = this.zzb;
        int n3 = zzgq2.zzd;
        sparseArray.append(n3, (Object)zzgq2);
    }

    public final void zzc() {
        this.zzk = false;
    }

    public final void zzd(long l2, int n3, long l3, boolean bl2) {
        this.zzf = n3;
        this.zzh = l3;
        this.zzg = l2;
        this.zzo = bl2;
    }

    public final boolean zze(long l2, int n3, boolean n4) {
        int n7;
        int n8 = this.zzf;
        int n10 = 9;
        int n14 = 0;
        int n15 = 1;
        if (n8 == n10) {
            if (n4 != 0 && (n4 = (int)(this.zzk ? 1 : 0)) != 0) {
                long l3 = this.zzg;
                n7 = (int)(l2 - l3);
                int n16 = n3 + n7;
                long l4 = this.zzm;
                l2 = -9223372036854775807L;
                long l7 = l4 - l2;
                n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
                if (n3 != 0) {
                    int n17 = this.zzn;
                    l2 = this.zzl;
                    zzafa zzafa2 = this.zza;
                    int n18 = (int)(l3 -= l2);
                    zzafa2.zzs(l4, n17, n18, n16, null);
                }
            }
            this.zzl = l2 = this.zzg;
            this.zzm = l2 = this.zzh;
            this.zzn = false;
            this.zzk = n15;
        }
        boolean bl2 = this.zzo;
        n7 = this.zzn;
        n3 = this.zzf;
        n4 = 5;
        if (n3 == n4 || bl2 && n3 == n15) {
            n14 = 1;
        }
        this.zzn = bl2 = n7 | n14;
        return bl2;
    }
}

