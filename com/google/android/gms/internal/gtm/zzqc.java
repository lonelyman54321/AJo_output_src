/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzqb;
import com.google.android.gms.internal.gtm.zzqe;
import java.util.ArrayList;
import java.util.List;

public final class zzqc {
    private final List zza;
    private final List zzb;
    private final List zzc;
    private final List zzd;

    public zzqc() {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
        this.zzb = arrayList = new ArrayList();
        this.zzc = arrayList = new ArrayList();
        this.zzd = arrayList = new ArrayList();
    }

    public final zzqc zza(zzqb zzqb2) {
        this.zzc.add(zzqb2);
        return this;
    }

    public final zzqc zzb(zzqb zzqb2) {
        this.zzb.add(zzqb2);
        return this;
    }

    public final zzqc zzc(zzqb zzqb2) {
        this.zza.add(zzqb2);
        return this;
    }

    public final zzqc zzd(zzqb zzqb2) {
        this.zzd.add(zzqb2);
        return this;
    }

    public final zzqe zze() {
        List list = this.zza;
        List list2 = this.zzb;
        List list3 = this.zzc;
        List list4 = this.zzd;
        zzqe zzqe2 = new zzqe(list, list2, list3, list4, null);
        return zzqe2;
    }
}

