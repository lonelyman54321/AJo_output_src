/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzapl;
import com.google.android.gms.internal.ads.zzapo;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import java.util.Collections;
import java.util.List;

public final class zzaob
implements zzaoc {
    private final List zza;
    private final zzafa[] zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private long zzf;

    public zzaob(List zzafaArray) {
        this.zza = zzafaArray;
        zzafaArray = new zzafa[zzafaArray.size()];
        this.zzb = zzafaArray;
        this.zzf = -9223372036854775807L;
    }

    private final boolean zzf(zzfu zzfu2, int n3) {
        int n4 = zzfu2.zzb();
        if (n4 == 0) {
            return false;
        }
        int n7 = zzfu2.zzm();
        if (n7 != n3) {
            this.zzc = false;
        }
        this.zzd = n7 = this.zzd + -1;
        return this.zzc;
    }

    public final void zza(zzfu zzfu2) {
        int n3;
        int n4 = this.zzc;
        if (n4 != 0 && ((n4 = this.zzd) != (n3 = 2) || (n4 = (int)(this.zzf(zzfu2, 32) ? 1 : 0)) != 0)) {
            n4 = this.zzd;
            int n7 = 1;
            if (n4 != n7 || (n4 = (int)(this.zzf(zzfu2, 0) ? 1 : 0)) != 0) {
                int n8;
                int n10;
                n4 = zzfu2.zzd();
                n7 = zzfu2.zzb();
                zzafa[] zzafaArray = this.zzb;
                for (n3 = 0; n3 < (n10 = zzafaArray.length); ++n3) {
                    zzafa zzafa2 = zzafaArray[n3];
                    zzfu2.zzK(n4);
                    zzafa2.zzq(zzfu2, n7);
                }
                this.zze = n8 = this.zze + n7;
            }
        }
    }

    public final void zzb(zzadx zzadx2, zzapo zzapo2) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((zzafa[])(object = this.zzb)).length); ++i3) {
            object = (zzapl)this.zza.get(i3);
            zzapo2.zzc();
            int n4 = zzapo2.zza();
            int n7 = 3;
            zzafa zzafa2 = zzadx2.zzw(n4, n7);
            zzal zzal2 = new zzal();
            Object object2 = zzapo2.zzb();
            zzal2.zzK((String)object2);
            zzal2.zzX("application/dvbsubs");
            object2 = Collections.singletonList(object.zzb);
            zzal2.zzL((List)object2);
            object = object.zza;
            zzal2.zzO((String)object);
            object = zzal2.zzad();
            zzafa2.zzl((zzan)object);
            object = this.zzb;
            object[i3] = zzafa2;
        }
    }

    public final void zzc() {
        boolean bl2 = this.zzc;
        if (bl2) {
            int n3;
            zzafa[] zzafaArray;
            long l2 = this.zzf;
            long l3 = -9223372036854775807L;
            long l4 = l2 - l3;
            Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object != false) {
                bl2 = true;
            } else {
                bl2 = false;
                zzafaArray = null;
            }
            zzeq.zzf(bl2);
            zzafaArray = this.zzb;
            for (int i3 = 0; i3 < (n3 = zzafaArray.length); ++i3) {
                zzafa zzafa2 = zzafaArray[i3];
                long l7 = this.zzf;
                int n4 = this.zze;
                int n7 = 1;
                zzafa2.zzs(l7, n7, n4, 0, null);
            }
            this.zzc = false;
        }
    }

    public final void zzd(long l2, int n3) {
        if ((n3 &= 4) == 0) {
            return;
        }
        this.zzc = true;
        this.zzf = l2;
        this.zze = 0;
        this.zzd = 2;
    }

    public final void zze() {
        this.zzc = false;
        this.zzf = -9223372036854775807L;
    }
}

