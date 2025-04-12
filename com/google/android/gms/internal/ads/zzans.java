/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzacs;
import com.google.android.gms.internal.ads.zzact;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;

public final class zzans
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

    public zzans() {
        throw null;
    }

    public zzans(String string2, int n3) {
        zzfu zzfu2;
        int n4 = 128;
        byte[] byArray = new byte[n4];
        Object object = new zzft(byArray, n4);
        this.zza = object;
        object = ((zzft)object).zza;
        this.zzb = zzfu2 = new zzfu((byte[])object);
        this.zzg = 0;
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
            n3 = this.zzg;
            int n8 = 2;
            int n10 = 1;
            if (n3 != 0) {
                Object object3;
                Object object4;
                Object object5;
                if (n3 != n10) {
                    n3 = zzfu2.zzb();
                    n8 = this.zzl;
                    n7 = this.zzh;
                    n3 = Math.min(n3, n8 -= n7);
                    zzafa zzafa2 = this.zzf;
                    zzafa2.zzq(zzfu2, n3);
                    this.zzh = n8 = this.zzh + n3;
                    n3 = this.zzl;
                    if (n8 != n3) continue;
                    long l2 = this.zzm;
                    long l3 = -9223372036854775807L;
                    long l4 = l2 - l3;
                    object5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
                    if (object5 == false) {
                        n10 = 0;
                        object4 = null;
                    }
                    zzeq.zzf(n10 != 0);
                    object3 = this.zzf;
                    long l7 = this.zzm;
                    int n14 = this.zzl;
                    int n15 = 1;
                    object3.zzs(l7, n15, n14, 0, null);
                    l2 = this.zzm;
                    l3 = this.zzj;
                    this.zzm = l2 += l3;
                    this.zzg = 0;
                    continue;
                }
                object = this.zzb.zzM();
                n10 = zzfu2.zzb();
                n7 = this.zzh;
                n4 = 128;
                n7 = 128 - n7;
                n10 = Math.min(n10, n7);
                n7 = this.zzh;
                zzfu2.zzG((byte[])object, n7, n10);
                this.zzh = n3 = this.zzh + n10;
                if (n3 != n4) continue;
                this.zza.zzk(0);
                object = zzact.zze(this.zza);
                object4 = this.zzk;
                if (object4 == null || (n7 = ((zzacs)object).zzc) != (object5 = (Object)((zzan)object4).zzA) || (n7 = ((zzacs)object).zzb) != (object5 = (Object)((zzan)object4).zzB) || (n10 = (int)(zzgd.zzG(object3 = ((zzacs)object).zza, object4 = ((zzan)object4).zzn) ? 1 : 0)) == 0) {
                    object4 = new zzal();
                    object3 = this.zze;
                    ((zzal)object4).zzK((String)object3);
                    object3 = ((zzacs)object).zza;
                    ((zzal)object4).zzX((String)object3);
                    n7 = ((zzacs)object).zzc;
                    ((zzal)object4).zzy(n7);
                    n7 = ((zzacs)object).zzb;
                    ((zzal)object4).zzY(n7);
                    object3 = this.zzc;
                    ((zzal)object4).zzO((String)object3);
                    n7 = this.zzd;
                    ((zzal)object4).zzV(n7);
                    n7 = ((zzacs)object).zzf;
                    ((zzal)object4).zzS(n7);
                    object3 = ((zzacs)object).zza;
                    object2 = "audio/ac3";
                    n7 = (int)(((String)object2).equals(object3) ? 1 : 0);
                    if (n7 != 0) {
                        n7 = ((zzacs)object).zzf;
                        ((zzal)object4).zzx(n7);
                    }
                    this.zzk = object4 = ((zzal)object4).zzad();
                    object3 = this.zzf;
                    object3.zzl((zzan)object4);
                }
                this.zzl = n10 = ((zzacs)object).zzd;
                n3 = ((zzacs)object).zze;
                n10 = this.zzk.zzB;
                long l8 = (long)n3 * 1000000L;
                long l12 = n10;
                this.zzj = l8 /= l12;
                this.zzb.zzK(0);
                object = this.zzf;
                object4 = this.zzb;
                object.zzq((zzfu)object4, n4);
                this.zzg = n8;
                continue;
            }
            while ((n3 = zzfu2.zzb()) > 0) {
                n3 = (int)(this.zzi ? 1 : 0);
                n7 = 11;
                if (n3 == 0) {
                    n3 = zzfu2.zzm();
                    if (n3 == n7) {
                        n3 = 1;
                    } else {
                        n3 = 0;
                        object = null;
                    }
                    this.zzi = n3;
                    continue;
                }
                n3 = zzfu2.zzm();
                if (n3 == (n4 = 119)) {
                    this.zzi = false;
                    this.zzg = n10;
                    object = this.zzb;
                    object2 = ((zzfu)object).zzM();
                    object2[0] = n7;
                    object = ((zzfu)object).zzM();
                    object[n10] = n4;
                    this.zzh = n8;
                    continue block0;
                }
                if (n3 == n7) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    object = null;
                }
                this.zzi = n3;
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

