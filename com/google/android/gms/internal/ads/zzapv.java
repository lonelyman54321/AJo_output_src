/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzadx;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzapu;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzaqa;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzgd;
import java.math.RoundingMode;

final class zzapv
implements zzapu {
    private final zzadx zza;
    private final zzafa zzb;
    private final zzapx zzc;
    private final zzan zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzapv(zzadx object, zzafa object2, zzapx object3, String string2, int n3) {
        this.zza = object;
        this.zzb = object2;
        this.zzc = object3;
        int n4 = ((zzapx)object3).zzb;
        int n7 = ((zzapx)object3).zze;
        n4 *= n7;
        n7 = ((zzapx)object3).zzd;
        if (n7 == (n4 /= 8)) {
            n7 = ((zzapx)object3).zzc * n4;
            int n8 = n7 * 8;
            this.zze = n4 = Math.max(n4, n7 /= 10);
            object2 = new zzal();
            ((zzal)object2).zzX(string2);
            ((zzal)object2).zzx(n8);
            ((zzal)object2).zzS(n8);
            ((zzal)object2).zzP(n4);
            n4 = ((zzapx)object3).zzb;
            ((zzal)object2).zzy(n4);
            n4 = ((zzapx)object3).zzc;
            ((zzal)object2).zzY(n4);
            ((zzal)object2).zzR(n3);
            this.zzd = object = ((zzal)object2).zzad();
            return;
        }
        object3 = new StringBuilder("Expected block size: ");
        ((StringBuilder)object3).append(n4);
        ((StringBuilder)object3).append("; got: ");
        ((StringBuilder)object3).append(n7);
        throw zzch.zza(((StringBuilder)object3).toString(), null);
    }

    public final void zza(int n3, long l2) {
        long l3 = n3;
        zzapx zzapx2 = this.zzc;
        Object object = new zzaqa(zzapx2, 1, l3, l2);
        this.zza.zzO((zzaet)object);
        object = this.zzb;
        zzan zzan2 = this.zzd;
        object.zzl(zzan2);
    }

    public final void zzb(long l2) {
        this.zzf = l2;
        this.zzg = 0;
        this.zzh = 0L;
    }

    public final boolean zzc(zzadv zzadv2, long l2) {
        int n3;
        Object object;
        long l3;
        int n4;
        zzapv zzapv2 = this;
        long l4 = l2;
        while (true) {
            int n7;
            int n8;
            n4 = 1;
            l3 = 0L;
            long l7 = l4 - l3;
            object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object <= 0 || (n8 = zzapv2.zzg) >= (n7 = zzapv2.zze)) break;
            zzafa zzafa2 = zzapv2.zzb;
            long l8 = Math.min((long)(n7 -= n8), l4);
            n4 = zzaey.zza(zzafa2, zzadv2, n8 = (int)l8, n4 != 0);
            if (n4 == (object = (Object)-1)) {
                l4 = l3;
                continue;
            }
            zzapv2.zzg = n3 = zzapv2.zzg + n4;
            long l12 = n4;
            l4 -= l12;
        }
        zzapx zzapx2 = zzapv2.zzc;
        int n10 = zzapv2.zzg;
        n3 = zzapx2.zzd;
        if ((n10 /= n3) > 0) {
            long l14 = zzapv2.zzf;
            long l15 = zzapv2.zzh;
            long l16 = zzapx2.zzc;
            RoundingMode roundingMode = RoundingMode.FLOOR;
            long l17 = 1000000L;
            l15 = zzgd.zzt(l15, l17, l16, roundingMode);
            long l18 = l14 + l15;
            int n14 = n10 * n3;
            int n15 = zzapv2.zzg - n14;
            zzafa zzafa3 = zzapv2.zzb;
            int n16 = 1;
            zzafa3.zzs(l18, n16, n14, n15, null);
            l3 = zzapv2.zzh;
            l14 = n10;
            zzapv2.zzh = l3 += l14;
            zzapv2.zzg = n15;
        }
        if (object <= 0) {
            return n4 != 0;
        }
        return false;
    }
}

