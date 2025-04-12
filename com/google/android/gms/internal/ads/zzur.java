/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzih;
import com.google.android.gms.internal.ads.zzin;
import com.google.android.gms.internal.ads.zzlj;
import com.google.android.gms.internal.ads.zzus;
import com.google.android.gms.internal.ads.zzxf;

final class zzur
implements zzxf {
    public final zzxf zza;
    final /* synthetic */ zzus zzb;
    private boolean zzc;

    public zzur(zzus zzus2, zzxf zzxf2) {
        this.zzb = zzus2;
        this.zza = zzxf2;
    }

    public final int zza(zzlj object, zzin object2, int n3) {
        long l2;
        long l3;
        long l4;
        long l7;
        int n4;
        int n7;
        int n8;
        block7: {
            int n10;
            block9: {
                int n14;
                block8: {
                    zzus zzus2 = this.zzb;
                    boolean bl2 = zzus2.zzq();
                    n8 = -3;
                    if (bl2) {
                        return n8;
                    }
                    bl2 = this.zzc;
                    n7 = 4;
                    n4 = -4;
                    if (bl2) {
                        ((zzih)object2).zzc(n7);
                        return n4;
                    }
                    l7 = zzus2.zzb();
                    zzxf zzxf2 = this.zza;
                    n3 = zzxf2.zza((zzlj)object, (zzin)object2, n3);
                    n10 = -5;
                    l4 = Long.MIN_VALUE;
                    if (n3 != n10) break block7;
                    object2 = ((zzlj)object).zza;
                    object2.getClass();
                    n3 = ((zzan)object2).zzD;
                    n14 = 0;
                    zzus2 = null;
                    if (n3 != 0) break block8;
                    n3 = ((zzan)object2).zzE;
                    if (n3 == 0) break block9;
                    n3 = 0;
                }
                zzus zzus3 = this.zzb;
                long l8 = zzus3.zzb;
                long l12 = l8 - l4;
                n7 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1));
                if (n7 == 0) {
                    n14 = ((zzan)object2).zzE;
                }
                object2 = ((zzan)object2).zzb();
                ((zzal)object2).zzF(n3);
                ((zzal)object2).zzG(n14);
                ((zzlj)object).zza = object2 = ((zzal)object2).zzad();
            }
            return n10;
        }
        object = this.zzb;
        long l14 = ((zzus)object).zzb;
        long l15 = l14 - l4;
        Object object3 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object3 != false && (n3 == n4 && (object3 = (l3 = (l2 = ((zzin)object2).zze) - l14) == 0L ? 0 : (l3 < 0L ? -1 : 1)) >= 0 || n3 == n8 && (object3 = l7 == l4 ? 0 : (l7 < l4 ? -1 : 1)) == false && (object3 = (Object)((zzin)object2).zzd) == false)) {
            ((zzin)object2).zzb();
            ((zzih)object2).zzc(n7);
            this.zzc = true;
            return n4;
        }
        return n3;
    }

    public final int zzb(long l2) {
        zzus zzus2 = this.zzb;
        boolean bl2 = zzus2.zzq();
        if (bl2) {
            return -3;
        }
        return this.zza.zzb(l2);
    }

    public final void zzc() {
        this.zzc = false;
    }

    public final void zzd() {
        this.zza.zzd();
    }

    public final boolean zze() {
        Object object = this.zzb;
        boolean bl2 = ((zzus)object).zzq();
        return !bl2 && (bl2 = (object = this.zza).zze());
    }
}

