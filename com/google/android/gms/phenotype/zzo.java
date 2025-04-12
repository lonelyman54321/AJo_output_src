/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.phenotype;

import com.google.android.gms.phenotype.PhenotypeFlag;
import com.google.android.gms.phenotype.PhenotypeFlag$zza;
import com.google.android.gms.phenotype.zza;
import java.util.Map;

final class zzo
implements PhenotypeFlag$zza {
    private final PhenotypeFlag zzat;
    private final zza zzau;

    public zzo(PhenotypeFlag phenotypeFlag, zza zza2) {
        this.zzat = phenotypeFlag;
        this.zzau = zza2;
    }

    public final Object zzh() {
        Object object = this.zzat;
        Map map2 = this.zzau.zza();
        object = ((PhenotypeFlag)object).zzap;
        return (String)map2.get(object);
    }
}

