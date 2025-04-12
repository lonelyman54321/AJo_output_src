/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzat;
import com.google.android.gms.internal.ads.zzaw;
import com.google.android.gms.internal.ads.zzba;
import com.google.android.gms.internal.ads.zzbc;
import com.google.android.gms.internal.ads.zzbk;
import com.google.android.gms.internal.ads.zzbn;
import com.google.android.gms.internal.ads.zzbq;
import com.google.android.gms.internal.ads.zzbt;
import com.google.android.gms.internal.ads.zzca;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzn;

public final class zzbu {
    public static final zzbu zza;
    public static final zzn zzb;
    private static final String zzk;
    private static final String zzl;
    private static final String zzm;
    private static final String zzn;
    private static final String zzo;
    private static final String zzp;
    public final String zzc;
    public final zzbn zzd;
    public final zzbn zze;
    public final zzbk zzf;
    public final zzca zzg;
    public final zzba zzh;
    public final zzbc zzi;
    public final zzbq zzj;

    static {
        Object object = new zzaw();
        zza = ((zzaw)object).zzc();
        int n3 = 36;
        zzk = Integer.toString(0, n3);
        zzl = Integer.toString(1, n3);
        zzm = Integer.toString(2, n3);
        zzn = Integer.toString(3, n3);
        zzo = Integer.toString(4, n3);
        zzp = Integer.toString(5, n3);
        zzb = object = new zzat();
    }

    public /* synthetic */ zzbu(String string2, zzbc zzbc2, zzbn zzbn2, zzbk zzbk2, zzca zzca2, zzbq zzbq2, zzbt zzbt2) {
        this.zzc = string2;
        this.zzd = zzbn2;
        this.zze = zzbn2;
        this.zzf = zzbk2;
        this.zzg = zzca2;
        this.zzh = zzbc2;
        this.zzi = zzbc2;
        this.zzj = zzbq2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof zzbu;
        if (!bl4) {
            return false;
        }
        object = (zzbu)object;
        Object object2 = this.zzc;
        Object object3 = ((zzbu)object).zzc;
        bl4 = zzgd.zzG(object2, object3);
        if (bl4 && (bl4 = ((zzba)(object2 = this.zzh)).equals(object3 = ((zzbu)object).zzh)) && (bl4 = zzgd.zzG(object2 = this.zzd, object3 = ((zzbu)object).zzd)) && (bl4 = zzgd.zzG(object2 = this.zzf, object3 = ((zzbu)object).zzf)) && (bl4 = zzgd.zzG(object2 = this.zzg, object3 = ((zzbu)object).zzg)) && (bl2 = zzgd.zzG(object2 = this.zzj, object = ((zzbu)object).zzj))) {
            return bl3;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.zzc;
        int n4 = string2.hashCode() * 31;
        zzbn zzbn2 = this.zzd;
        if (zzbn2 != null) {
            n3 = zzbn2.hashCode();
        } else {
            n3 = 0;
            zzbn2 = null;
        }
        n4 = (n4 + n3) * 31;
        n3 = (this.zzf.hashCode() + n4) * 31;
        n4 = (this.zzh.hashCode() + n3) * 31;
        return (this.zzg.hashCode() + n4) * 31;
    }
}

