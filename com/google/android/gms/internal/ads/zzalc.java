/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzady;
import com.google.android.gms.internal.ads.zzch;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;

final class zzalc {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf;
    private final zzfu zzg;

    public zzalc() {
        int n3 = 255;
        Object object = new int[n3];
        this.zzf = object;
        object = new zzfu;
        super(n3);
        this.zzg = object;
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(zzadv object, boolean bl2) {
        long l2;
        long l3;
        long l4;
        long l7;
        this.zza();
        Object object2 = this.zzg;
        int n3 = 27;
        ((zzfu)object2).zzH(n3);
        object2 = this.zzg.zzM();
        int n4 = zzady.zzc((zzadv)object, (byte[])object2, 0, n3, bl2);
        if (n4 != 0 && (l7 = (l4 = (l3 = ((zzfu)(object2 = this.zzg)).zzu()) - (l2 = 1332176723L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
            object2 = this.zzg;
            n4 = ((zzfu)object2).zzm();
            if (n4 != 0) {
                if (bl2) {
                    return false;
                }
                throw zzch.zzc("unsupported bit stream revision");
            }
            this.zza = n4 = this.zzg.zzm();
            this.zzb = l3 = this.zzg.zzr();
            this.zzg.zzs();
            this.zzg.zzs();
            this.zzg.zzs();
            this.zzc = n4 = this.zzg.zzm();
            this.zzd = n3 = n4 + 27;
            zzfu zzfu2 = this.zzg;
            zzfu2.zzH(n4);
            object2 = this.zzg.zzM();
            n3 = this.zzc;
            int n7 = zzady.zzc((zzadv)object, (byte[])object2, 0, n3, bl2);
            if (n7 != 0) {
                for (int i3 = 0; i3 < (n7 = this.zzc); ++i3) {
                    object = this.zzf;
                    int n8 = this.zzg.zzm();
                    object[i3] = n8;
                    n7 = this.zze;
                    int[] nArray = this.zzf;
                    n8 = nArray[i3];
                    this.zze = n7 += n8;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(zzadv zzadv2, long l2) {
        long l3;
        long l4;
        long l7;
        int n3;
        int n4;
        boolean bl2;
        int n7;
        block5: {
            Object object;
            long l8 = zzadv2.zzf();
            long l12 = zzadv2.zze();
            n7 = 1;
            Object object2 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1);
            if (object2 == false) {
                bl2 = true;
            } else {
                bl2 = false;
                object = null;
            }
            zzeq.zzd(bl2);
            object = this.zzg;
            n4 = 4;
            ((zzfu)object).zzH(n4);
            while (true) {
                byte[] byArray;
                long l14;
                long l15;
                if (bl2 = (l15 = l2 - (l12 = (long)-1)) == 0L ? 0 : (l15 < 0L ? -1 : 1)) {
                    l12 = zzadv2.zzf();
                    l14 = 4;
                    long l16 = (l12 += l14) - l2;
                    object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                    if (object2 >= 0) break block5;
                }
                if ((n3 = zzady.zzc(zzadv2, byArray = this.zzg.zzM(), 0, n4, n7 != 0)) == 0) break block5;
                this.zzg.zzK(0);
                object = this.zzg;
                l12 = ((zzfu)object).zzu();
                l14 = 1332176723L;
                bl2 = l12 == l14 ? 0 : (l12 < l14 ? -1 : 1);
                if (!bl2) break;
                object = zzadv2;
                object = (zzadi)zzadv2;
                ((zzadi)object).zzo(n7, false);
            }
            zzadv2.zzj();
            return n7 != 0;
        }
        while (!(bl2 && (l7 = (l4 = (l3 = zzadv2.zzf()) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) >= 0 || (n4 = zzadv2.zzc(n7)) == (n3 = -1))) {
        }
        return false;
    }
}

