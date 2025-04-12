/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaen;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;

public final class zzaoq
implements zzaoc {
    private final zzfu zza;
    private final zzaen zzb;
    private final String zzc;
    private final int zzd;
    private zzafa zze;
    private String zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private int zzl;
    private long zzm;

    public zzaoq() {
        throw null;
    }

    public zzaoq(String string2, int n3) {
        zzaen zzaen2;
        zzfu zzfu2;
        this.zzg = 0;
        this.zza = zzfu2 = new zzfu(4);
        zzfu2.zzM()[0] = -1;
        this.zzb = zzaen2 = new zzaen();
        this.zzm = -9223372036854775807L;
        this.zzc = string2;
        this.zzd = n3;
    }

    public final void zza(zzfu zzfu2) {
        Object object;
        Object object2 = this.zze;
        zzeq.zzb(object2);
        block0: while ((object = zzfu2.zzb()) > 0) {
            int n3;
            Object object3;
            int n4;
            int n7;
            int n8;
            int n10;
            object = this.zzg;
            int n14 = 2;
            int n15 = 1;
            byte[] byArray = null;
            if (object != 0) {
                Object object4;
                zzfu zzfu3;
                if (object != n15) {
                    object = zzfu2.zzb();
                    n14 = this.zzl;
                    n10 = this.zzh;
                    object = Math.min(object, n14 -= n10);
                    zzafa zzafa2 = this.zze;
                    zzafa2.zzq(zzfu2, (int)object);
                    this.zzh = n14 = this.zzh + object;
                    object = this.zzl;
                    if (n14 < object) continue;
                    long l2 = this.zzm;
                    long l3 = -9223372036854775807L;
                    long l4 = l2 - l3;
                    n8 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                    if (n8 == 0) {
                        n15 = 0;
                        zzfu3 = null;
                    }
                    zzeq.zzf(n15 != 0);
                    object4 = this.zze;
                    long l7 = this.zzm;
                    n7 = this.zzl;
                    n4 = 0;
                    object3 = true;
                    object4.zzs(l7, (int)object3, n7, 0, null);
                    l2 = this.zzm;
                    l3 = this.zzk;
                    this.zzm = l2 += l3;
                    this.zzh = 0;
                    this.zzg = 0;
                    continue;
                }
                object = zzfu2.zzb();
                n10 = this.zzh;
                n3 = 4;
                n10 = 4 - n10;
                object = Math.min(object, n10);
                object4 = this.zza.zzM();
                n8 = this.zzh;
                zzfu2.zzG((byte[])object4, n8, (int)object);
                this.zzh = n10 = this.zzh + object;
                if (n10 < n3) continue;
                this.zza.zzK(0);
                object2 = this.zzb;
                object4 = this.zza;
                n10 = ((zzfu)object4).zzg();
                object = ((zzaen)object2).zza(n10);
                if (object == 0) {
                    this.zzh = 0;
                    this.zzg = n15;
                    continue;
                }
                object2 = this.zzb;
                this.zzl = n10 = ((zzaen)object2).zzc;
                n10 = (int)(this.zzi ? 1 : 0);
                if (n10 == 0) {
                    long l8 = ((zzaen)object2).zzg;
                    object = ((zzaen)object2).zzd;
                    l8 *= 1000000L;
                    long l12 = object;
                    this.zzk = l8 /= l12;
                    object2 = new zzal();
                    object4 = this.zzf;
                    ((zzal)object2).zzK((String)object4);
                    object4 = this.zzb.zzb;
                    ((zzal)object2).zzX((String)object4);
                    ((zzal)object2).zzP(4096);
                    n10 = this.zzb.zze;
                    ((zzal)object2).zzy(n10);
                    n10 = this.zzb.zzd;
                    ((zzal)object2).zzY(n10);
                    object4 = this.zzc;
                    ((zzal)object2).zzO((String)object4);
                    n10 = this.zzd;
                    ((zzal)object2).zzV(n10);
                    object2 = ((zzal)object2).zzad();
                    object4 = this.zze;
                    object4.zzl((zzan)object2);
                    this.zzi = n15;
                }
                this.zza.zzK(0);
                object2 = this.zze;
                zzfu3 = this.zza;
                object2.zzq(zzfu3, n3);
                this.zzg = n14;
                continue;
            }
            object2 = zzfu2.zzM();
            n10 = zzfu2.zzd();
            n3 = zzfu2.zze();
            while (n10 < n3) {
                n8 = n10 + 1;
                object3 = object2[n10];
                n7 = object3 & 0xFF;
                n4 = 255;
                n7 = n7 == n4 ? 1 : 0;
                n4 = (int)(this.zzj ? 1 : 0);
                object3 = n4 != 0 && (object3 = (Object)(object3 & 0xE0)) == (n4 = 224) ? (Object)true : (Object)false;
                this.zzj = n7;
                if (object3 != false) {
                    zzfu2.zzK(n8);
                    this.zzj = false;
                    byArray = this.zza.zzM();
                    byArray[n15] = object = object2[n10];
                    this.zzh = n14;
                    this.zzg = n15;
                    continue block0;
                }
                n10 = n8;
            }
            zzfu2.zzK(n3);
        }
    }

    public final void zzb(zzadx object, zzapo zzapo2) {
        String string2;
        zzapo2.zzc();
        this.zzf = string2 = zzapo2.zzb();
        int n3 = zzapo2.zza();
        this.zze = object = object.zzw(n3, 1);
    }

    public final void zzc() {
    }

    public final void zzd(long l2, int n3) {
        this.zzm = l2;
    }

    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
    }
}

