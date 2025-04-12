/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzacv;
import com.google.android.gms.internal.ads.zzacw;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;

public final class zzanv
implements zzaoc {
    private final zzft zza;
    private final zzfu zzb;
    private final String zzc;
    private final int zzd;
    private String zze;
    private zzafa zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzan zzk;
    private int zzl;
    private long zzm;

    public zzanv() {
        throw null;
    }

    public zzanv(String string2, int n3) {
        zzfu zzfu2;
        int n4 = 16;
        byte[] byArray = new byte[n4];
        Object object = new zzft(byArray, n4);
        this.zza = object;
        object = ((zzft)object).zza;
        this.zzb = zzfu2 = new zzfu((byte[])object);
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
        this.zzc = string2;
        this.zzd = n3;
    }

    public final void zza(zzfu zzfu2) {
        int n3;
        Object object = this.zzf;
        zzeq.zzb(object);
        block0: while ((n3 = zzfu2.zzb()) > 0) {
            Object object2;
            int n4;
            int n7;
            Object object3;
            int n8;
            n3 = this.zzg;
            int n10 = 2;
            int n14 = 1;
            if (n3 != 0) {
                int n15;
                Object object4;
                Object object5;
                if (n3 != n14) {
                    n3 = zzfu2.zzb();
                    n10 = this.zzl;
                    n8 = this.zzh;
                    n3 = Math.min(n3, n10 -= n8);
                    zzafa zzafa2 = this.zzf;
                    zzafa2.zzq(zzfu2, n3);
                    this.zzh = n10 = this.zzh + n3;
                    n3 = this.zzl;
                    if (n10 != n3) continue;
                    long l2 = this.zzm;
                    long l3 = -9223372036854775807L;
                    long l4 = l2 - l3;
                    object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object5 == false) {
                        n14 = 0;
                        object4 = null;
                    }
                    zzeq.zzf(n14 != 0);
                    object3 = this.zzf;
                    long l7 = this.zzm;
                    n7 = this.zzl;
                    n15 = 1;
                    object3.zzs(l7, n15, n7, 0, null);
                    l2 = this.zzm;
                    l3 = this.zzj;
                    this.zzm = l2 += l3;
                    this.zzg = 0;
                    continue;
                }
                object = this.zzb.zzM();
                n14 = zzfu2.zzb();
                n8 = this.zzh;
                n4 = 16;
                n8 = 16 - n8;
                n14 = Math.min(n14, n8);
                n8 = this.zzh;
                zzfu2.zzG((byte[])object, n8, n14);
                this.zzh = n3 = this.zzh + n14;
                if (n3 != n4) continue;
                this.zza.zzk(0);
                object = zzacw.zza(this.zza);
                object4 = this.zzk;
                object3 = "audio/ac4";
                if (object4 == null || (object5 = (Object)((zzan)object4).zzA) != n10 || (object5 = (Object)((zzacv)object).zza) != (n15 = ((zzan)object4).zzB) || (n14 = (int)(((String)object3).equals(object4 = ((zzan)object4).zzn) ? 1 : 0)) == 0) {
                    object4 = new zzal();
                    object2 = this.zze;
                    ((zzal)object4).zzK((String)object2);
                    ((zzal)object4).zzX((String)object3);
                    ((zzal)object4).zzy(n10);
                    n8 = ((zzacv)object).zza;
                    ((zzal)object4).zzY(n8);
                    object3 = this.zzc;
                    ((zzal)object4).zzO((String)object3);
                    n8 = this.zzd;
                    ((zzal)object4).zzV(n8);
                    this.zzk = object4 = ((zzal)object4).zzad();
                    object3 = this.zzf;
                    object3.zzl((zzan)object4);
                }
                this.zzl = n14 = ((zzacv)object).zzb;
                n3 = ((zzacv)object).zzc;
                n14 = this.zzk.zzB;
                long l8 = (long)n3 * 1000000L;
                long l12 = n14;
                this.zzj = l8 /= l12;
                this.zzb.zzK(0);
                object = this.zzf;
                object4 = this.zzb;
                object.zzq((zzfu)object4, n4);
                this.zzg = n10;
                continue;
            }
            while ((n3 = zzfu2.zzb()) > 0) {
                n3 = (int)(this.zzi ? 1 : 0);
                n8 = 172;
                if (n3 == 0) {
                    n3 = zzfu2.zzm();
                    if (n3 == n8) {
                        n3 = 1;
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    this.zzi = n3;
                    continue;
                }
                n3 = zzfu2.zzm();
                if (n3 == n8) {
                    n8 = 1;
                } else {
                    n8 = 0;
                    object3 = null;
                }
                this.zzi = n8;
                n8 = 64;
                n4 = 65;
                if (n3 != n8) {
                    if (n3 != n4) continue;
                    n3 = 65;
                }
                this.zzg = n14;
                object2 = this.zzb;
                byte[] byArray = ((zzfu)object2).zzM();
                byArray[0] = n7 = -84;
                if (n3 == n4) {
                    n8 = 65;
                }
                object = ((zzfu)object2).zzM();
                object[n14] = n8;
                this.zzh = n10;
                continue block0;
            }
        }
    }

    public final void zzb(zzadx object, zzapo zzapo2) {
        String string2;
        zzapo2.zzc();
        this.zze = string2 = zzapo2.zzb();
        int n3 = zzapo2.zza();
        this.zzf = object = object.zzw(n3, 1);
    }

    public final void zzc() {
    }

    public final void zzd(long l2, int n3) {
        this.zzm = l2;
    }

    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = -9223372036854775807L;
    }
}

