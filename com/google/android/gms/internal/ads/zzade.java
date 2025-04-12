/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzacy;
import com.google.android.gms.internal.ads.zzada;
import com.google.android.gms.internal.ads.zzadb;
import com.google.android.gms.internal.ads.zzadc;
import com.google.android.gms.internal.ads.zzadd;
import com.google.android.gms.internal.ads.zzadi;
import com.google.android.gms.internal.ads.zzadv;
import com.google.android.gms.internal.ads.zzaeq;
import com.google.android.gms.internal.ads.zzaet;
import com.google.android.gms.internal.ads.zzeq;

public class zzade {
    protected final zzacy zza;
    protected final zzadd zzb;
    protected zzada zzc;
    private final int zzd;

    public zzade(zzadb zzadb2, zzadd zzadd2, long l2, long l3, long l4, long l7, long l8, long l12, int n3) {
        zzacy zzacy2;
        this.zzb = zzadd2;
        this.zzd = n3;
        this.zza = zzacy2 = new zzacy(zzadb2, l2, 0L, l4, l7, l8, l12);
    }

    public static final int zzf(zzadv zzadv2, long l2, zzaeq zzaeq2) {
        long l3 = zzadv2.zzf();
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            return 0;
        }
        zzaeq2.zza = l2;
        return 1;
    }

    public static final boolean zzg(zzadv zzadv2, long l2) {
        long l3;
        long l4 = zzadv2.zzf();
        long l7 = (l2 -= l4) - (l4 = 0L);
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object >= 0 && (object = (l3 = l2 - (l4 = 262144L)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) <= 0) {
            int n3 = (int)l2;
            ((zzadi)zzadv2).zzo(n3, false);
            return true;
        }
        return false;
    }

    public final int zza(zzadv zzadv2, zzaeq zzaeq2) {
        long l2;
        while (true) {
            long l3;
            zzada zzada2 = this.zzc;
            zzeq.zzb(zzada2);
            long l4 = zzada.zzb(zzada2);
            long l7 = zzada.zza(zzada2) - l4;
            int n3 = this.zzd;
            l2 = zzada.zzc(zzada2);
            long l8 = n3;
            n3 = 0;
            long l12 = l7 == l8 ? 0 : (l7 < l8 ? -1 : 1);
            if (l12 <= 0) {
                this.zzc(false, l4);
                return zzade.zzf(zzadv2, l4, zzaeq2);
            }
            boolean bl2 = zzade.zzg(zzadv2, l2);
            if (!bl2) {
                return zzade.zzf(zzadv2, l2, zzaeq2);
            }
            zzadv2.zzj();
            Object object = this.zzb;
            long l14 = zzada.zze(zzada2);
            object = object.zza(zzadv2, l14);
            int n4 = zzadc.zza((zzadc)object);
            int n7 = -3;
            if (n4 == n7) break;
            n7 = -2;
            if (n4 != n7) {
                n7 = -1;
                if (n4 != n7) {
                    l14 = zzadc.zzb((zzadc)object);
                    zzade.zzg(zzadv2, l14);
                    l14 = zzadc.zzb((zzadc)object);
                    this.zzc(true, l14);
                    long l15 = zzadc.zzb((zzadc)object);
                    return zzade.zzf(zzadv2, l15, zzaeq2);
                }
                l14 = zzadc.zzc((zzadc)object);
                l3 = zzadc.zzb((zzadc)object);
                zzada.zzg(zzada2, l14, l3);
                continue;
            }
            l14 = zzadc.zzc((zzadc)object);
            l3 = zzadc.zzb((zzadc)object);
            zzada.zzh(zzada2, l14, l3);
        }
        this.zzc(false, l2);
        return zzade.zzf(zzadv2, l2, zzaeq2);
    }

    public final zzaet zzb() {
        return this.zza;
    }

    public final void zzc(boolean bl2, long l2) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long l2) {
        zzada zzada2;
        long l3;
        long l4;
        long l7;
        zzade zzade2 = this;
        long l8 = l2;
        Object object = this.zzc;
        if (object != null && (l7 = (l4 = (l3 = zzada.zzd((zzada)object)) - l2) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false) {
            return;
        }
        object = zzade2.zza;
        l3 = ((zzacy)object).zzf(l8);
        long l12 = zzacy.zzd((zzacy)object);
        long l14 = zzacy.zze((zzacy)object);
        long l15 = zzacy.zzc((zzacy)object);
        long l16 = zzacy.zzb((zzacy)object);
        object = zzada2;
        l8 = l2;
        zzade2.zzc = zzada2 = new zzada(l2, l3, 0L, l12, l14, l15, l16);
    }

    public final boolean zze() {
        zzada zzada2 = this.zzc;
        return zzada2 != null;
    }
}

