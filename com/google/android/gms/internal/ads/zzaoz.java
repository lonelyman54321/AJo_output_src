/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaoc;
import com.google.android.gms.internal.ads.zzft;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgb;

final class zzaoz {
    private final zzaoc zza;
    private final zzgb zzb;
    private final zzft zzc;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzaoz(zzaoc object, zzgb zzgb2) {
        this.zza = object;
        this.zzb = zzgb2;
        int n3 = 64;
        byte[] byArray = new byte[n3];
        this.zzc = object = new zzft(byArray, n3);
    }

    public final void zza(zzfu zzfu2) {
        long l2;
        int n3;
        zzaoz zzaoz2 = this;
        zzfu zzfu3 = zzfu2;
        Object object = this.zzc.zza;
        int n4 = 3;
        zzfu2.zzG((byte[])object, 0, n4);
        this.zzc.zzk(0);
        object = this.zzc;
        int n7 = 8;
        ((zzft)object).zzm(n7);
        this.zzd = n3 = this.zzc.zzo();
        this.zze = n3 = this.zzc.zzo();
        object = this.zzc;
        int n8 = 6;
        ((zzft)object).zzm(n8);
        object = this.zzc;
        n7 = ((zzft)object).zzd(n7);
        object = ((zzft)object).zza;
        zzfu2.zzG((byte[])object, 0, n7);
        object = this.zzc;
        ((zzft)object).zzk(0);
        n3 = this.zzd;
        int n10 = 4;
        if (n3 != 0) {
            long l3;
            Object object2;
            this.zzc.zzm(n10);
            long l4 = this.zzc.zzd(n4);
            object = this.zzc;
            int n14 = 1;
            ((zzft)object).zzm(n14);
            object = this.zzc;
            int n15 = 15;
            n3 = ((zzft)object).zzd(n15) << n15;
            this.zzc.zzm(n14);
            zzft zzft2 = this.zzc;
            int n16 = zzft2.zzd(n15);
            long l7 = n16;
            zzft zzft3 = this.zzc;
            zzft3.zzm(n14);
            boolean bl2 = this.zzf;
            int n17 = 30;
            if (!bl2 && (bl2 = this.zze)) {
                this.zzc.zzm(n10);
                long l8 = (long)this.zzc.zzd(n4) << n17;
                this.zzc.zzm(n14);
                object2 = this.zzc;
                n4 = ((zzft)object2).zzd(n15) << n15;
                this.zzc.zzm(n14);
                zzft3 = this.zzc;
                n15 = zzft3.zzd(n15);
                long l12 = n15;
                this.zzc.zzm(n14);
                zzgb zzgb2 = this.zzb;
                l3 = (long)n4 | l8 | l12;
                zzgb2.zzb(l3);
                this.zzf = n14;
            }
            n10 = 30;
            l3 = l4 << n10;
            l4 = n3;
            l2 = l3 | l4 | l7;
            object2 = zzaoz2.zzb;
            l2 = ((zzgb)object2).zzb(l2);
        } else {
            l2 = 0L;
        }
        zzaoz2.zza.zzd(l2, 4);
        zzaoz2.zza.zza(zzfu3);
        zzaoz2.zza.zzc();
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}

