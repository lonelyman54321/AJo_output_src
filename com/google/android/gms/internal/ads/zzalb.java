/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzady;
import com.google.android.gms.internal.ads.zzalc;
import com.google.android.gms.internal.ads.zzfu;
import java.util.Arrays;

final class zzalb {
    private final zzalc zza;
    private final zzfu zzb;
    private int zzc;
    private int zzd;
    private boolean zze;

    public zzalb() {
        Object object = new zzalc();
        this.zza = object;
        byte[] byArray = new byte[65025];
        this.zzb = object = new zzfu(byArray, 0);
        this.zzc = -1;
    }

    private final int zzf(int n3) {
        int n4;
        int n7;
        int n8 = 0;
        this.zzd = 0;
        do {
            n7 = this.zzd;
            n4 = n3 + n7;
            zzalc zzalc2 = this.zza;
            int n10 = zzalc2.zzc;
            if (n4 >= n10) break;
            this.zzd = ++n7;
            int[] nArray = zzalc2.zzf;
            n7 = nArray[n4];
            n8 += n7;
        } while (n7 == (n4 = 255));
        return n8;
    }

    public final zzfu zza() {
        return this.zzb;
    }

    public final zzalc zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzH(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        int n3;
        zzfu zzfu2 = this.zzb;
        byte[] byArray = zzfu2.zzM();
        int n4 = byArray.length;
        if (n4 == (n3 = 65025)) {
            return;
        }
        byArray = zzfu2.zzM();
        int n7 = zzfu2.zze();
        n3 = Math.max(n3, n7);
        byArray = Arrays.copyOf(byArray, n3);
        n3 = this.zzb.zze();
        zzfu2.zzI(byArray, n3);
    }

    public final boolean zze(zzadv zzadv2) {
        int n3;
        Object object;
        Object object2 = this.zze;
        if (object2 != 0) {
            this.zze = false;
            object = this.zzb;
            ((zzfu)object).zzH(0);
        }
        while (true) {
            int n4;
            object2 = this.zze;
            n3 = 1;
            if (object2 != 0) break;
            object2 = this.zzc;
            if (object2 < 0) {
                object = this.zza;
                long l2 = -1;
                object2 = ((zzalc)object).zzc(zzadv2, l2);
                if (object2 != 0 && (object2 = (Object)((zzalc)(object = this.zza)).zzb(zzadv2, n3 != 0)) != 0) {
                    object = this.zza;
                    n4 = ((zzalc)object).zzd;
                    object2 = ((zzalc)object).zza & n3;
                    if (object2 == n3 && (object2 = ((zzfu)(object = this.zzb)).zze()) == 0) {
                        object2 = this.zzf(0);
                        n4 += object2;
                        object2 = this.zzd;
                    } else {
                        object2 = 0;
                        object = null;
                    }
                    n4 = (int)(zzady.zze(zzadv2, n4) ? 1 : 0);
                    if (n4 == 0) {
                        return false;
                    }
                    this.zzc = object2;
                } else {
                    return false;
                }
            }
            object2 = this.zzf((int)object2);
            n4 = this.zzc;
            int n7 = this.zzd;
            n4 += n7;
            if (object2 > 0) {
                zzfu zzfu2 = this.zzb;
                int n8 = zzfu2.zze() + object2;
                zzfu2.zzE(n8);
                zzfu2 = this.zzb;
                byte[] byArray = zzfu2.zzM();
                n7 = zzfu2.zze();
                n7 = (int)(zzady.zzd(zzadv2, byArray, n7, object2) ? 1 : 0);
                if (n7 == 0) {
                    return false;
                }
                zzfu2 = this.zzb;
                n8 = zzfu2.zze() + object2;
                zzfu2.zzJ(n8);
                object = this.zza;
                n7 = n4 + -1;
                object = ((zzalc)object).zzf;
                object2 = object[n7];
                n7 = 255;
                if (object2 == n7) {
                    n3 = 0;
                }
                this.zze = n3;
            }
            object = this.zza;
            object2 = ((zzalc)object).zzc;
            if (n4 == object2) {
                n4 = -1;
            }
            this.zzc = n4;
        }
        return n3 != 0;
    }
}

