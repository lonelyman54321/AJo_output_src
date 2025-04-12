/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaec;
import com.google.android.gms.internal.ads.zzaed;
import com.google.android.gms.internal.ads.zzaef;
import com.google.android.gms.internal.ads.zzaeg;
import com.google.android.gms.internal.ads.zzakx;
import com.google.android.gms.internal.ads.zzalf;
import com.google.android.gms.internal.ads.zzali;
import com.google.android.gms.internal.ads.zzfu;
import java.util.Arrays;

final class zzaky
extends zzali {
    private zzaeg zza;
    private zzakx zzb;

    private static boolean zzd(byte[] byArray) {
        byte by2 = byArray[0];
        byte by4 = -1;
        return by2 == by4;
    }

    public final long zza(zzfu zzfu2) {
        block2: {
            int n3;
            block4: {
                int n4;
                block3: {
                    byte[] byArray = zzfu2.zzM();
                    n3 = zzaky.zzd(byArray);
                    if (n3 == 0) break block2;
                    byArray = zzfu2.zzM();
                    n3 = byArray[2] & 0xFF;
                    n4 = 4;
                    int n7 = 6;
                    if ((n3 >>= n4) == n7) break block3;
                    n7 = 7;
                    if (n3 != n7) break block4;
                    n3 = 7;
                }
                zzfu2.zzL(n4);
                zzfu2.zzw();
            }
            n3 = zzaec.zza(zzfu2, n3);
            zzfu2.zzK(0);
            return n3;
        }
        return -1;
    }

    public final void zzb(boolean bl2) {
        super.zzb(bl2);
        if (bl2) {
            bl2 = false;
            this.zza = null;
            this.zzb = null;
        }
    }

    public final boolean zzc(zzfu object, long l2, zzalf zzalf2) {
        byte[] byArray = ((zzfu)object).zzM();
        zzaeg zzaeg2 = this.zza;
        boolean bl2 = true;
        if (zzaeg2 == null) {
            zzaeg zzaeg3;
            this.zza = zzaeg3 = new zzaeg(byArray, 17);
            int n3 = ((zzfu)object).zze();
            object = Arrays.copyOfRange(byArray, 9, n3);
            zzalf2.zza = object = zzaeg3.zzc((byte[])object, null);
            return bl2;
        }
        int n4 = byArray[0] & 0x7F;
        int n7 = 3;
        if (n4 == n7) {
            zzakx zzakx2;
            zzaeg zzaeg4;
            object = zzaed.zzb((zzfu)object);
            this.zza = zzaeg4 = zzaeg2.zzf((zzaef)object);
            this.zzb = zzakx2 = new zzakx(zzaeg4, (zzaef)object);
            return bl2;
        }
        boolean bl3 = zzaky.zzd(byArray);
        if (bl3) {
            object = this.zzb;
            if (object != null) {
                ((zzakx)object).zza(l2);
                zzalf2.zzb = object = this.zzb;
            }
            zzalf2.zza.getClass();
            return false;
        }
        return bl2;
    }
}

