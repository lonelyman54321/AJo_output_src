/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfu;

public final class zzaoo
implements zzaoc {
    private final zzfu zza;
    private zzafa zzb;
    private boolean zzc;
    private long zzd;
    private int zze;
    private int zzf;

    public zzaoo() {
        zzfu zzfu2;
        this.zza = zzfu2 = new zzfu(10);
        this.zzd = -9223372036854775807L;
    }

    public final void zza(zzfu zzfu2) {
        int n3;
        zzafa zzafa2 = this.zzb;
        zzeq.zzb(zzafa2);
        int n4 = this.zzc;
        if (n4 == 0) {
            return;
        }
        n4 = zzfu2.zzb();
        int n7 = this.zzf;
        int n8 = 10;
        if (n7 < n8) {
            n7 = 10 - n7;
            n7 = Math.min(n4, n7);
            byte[] byArray = zzfu2.zzM();
            int n10 = zzfu2.zzd();
            byte[] byArray2 = this.zza.zzM();
            int n14 = this.zzf;
            System.arraycopy(byArray, n10, byArray2, n14, n7);
            int n15 = this.zzf + n7;
            if (n15 == n8) {
                zzfu zzfu3 = this.zza;
                n15 = 0;
                byArray = null;
                zzfu3.zzK(0);
                zzfu3 = this.zza;
                n7 = zzfu3.zzm();
                n10 = 73;
                if (n7 == n10 && (n7 = (zzfu3 = this.zza).zzm()) == (n10 = 68) && (n7 = (zzfu3 = this.zza).zzm()) == (n10 = 51)) {
                    zzfu3 = this.zza;
                    n15 = 3;
                    zzfu3.zzL(n15);
                    zzfu3 = this.zza;
                    this.zze = n7 = zzfu3.zzl() + n8;
                } else {
                    zzfk.zzf("Id3Reader", "Discarding invalid ID3 tag");
                    this.zzc = false;
                    return;
                }
            }
        }
        n7 = this.zze;
        n8 = this.zzf;
        n4 = Math.min(n4, n7 -= n8);
        this.zzb.zzq(zzfu2, n4);
        this.zzf = n3 = this.zzf + n4;
    }

    public final void zzb(zzadx object, zzapo object2) {
        ((zzapo)object2).zzc();
        int n3 = ((zzapo)object2).zza();
        this.zzb = object = object.zzw(n3, 5);
        zzal zzal2 = new zzal();
        object2 = ((zzapo)object2).zzb();
        zzal2.zzK((String)object2);
        zzal2.zzX("application/id3");
        object2 = zzal2.zzad();
        object.zzl((zzan)object2);
    }

    public final void zzc() {
        int n3;
        zzafa zzafa2 = this.zzb;
        zzeq.zzb(zzafa2);
        int n4 = this.zzc;
        if (n4 != 0 && (n4 = this.zze) != 0 && (n3 = this.zzf) == n4) {
            long l2 = this.zzd;
            long l3 = -9223372036854775807L;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object != false) {
                n4 = 1;
            } else {
                n4 = 0;
                zzafa2 = null;
            }
            zzeq.zzf(n4 != 0);
            zzafa zzafa3 = this.zzb;
            long l7 = this.zzd;
            int n7 = this.zze;
            int n8 = 1;
            zzafa3.zzs(l7, n8, n7, 0, null);
            this.zzc = false;
        }
    }

    public final void zzd(long l2, int n3) {
        if ((n3 &= 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzd = l2;
        this.zze = 0;
        this.zzf = 0;
    }

    public final void zze() {
        this.zzc = false;
        this.zzd = -9223372036854775807L;
    }
}

