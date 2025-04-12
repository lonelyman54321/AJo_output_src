/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzre;
import com.google.android.gms.internal.gtm.zzri;
import com.google.android.gms.internal.gtm.zzrl;
import java.util.ArrayList;
import java.util.List;

public final class zzrj {
    private final List zza;
    private final List zzb;
    private final List zzc;
    private final List zzd;
    private final List zze;
    private final List zzf;
    private final List zzg;
    private final List zzh;
    private final List zzi;
    private final List zzj;

    private zzrj() {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
        this.zzb = arrayList = new ArrayList();
        this.zzc = arrayList = new ArrayList();
        this.zzd = arrayList = new ArrayList();
        this.zze = arrayList = new ArrayList();
        this.zzf = arrayList = new ArrayList();
        this.zzg = arrayList = new ArrayList();
        this.zzh = arrayList = new ArrayList();
        this.zzi = arrayList = new ArrayList();
        this.zzj = arrayList = new ArrayList();
    }

    public /* synthetic */ zzrj(zzrl arrayList) {
        this.zza = arrayList = new ArrayList();
        this.zzb = arrayList = new ArrayList();
        this.zzc = arrayList = new ArrayList();
        this.zzd = arrayList = new ArrayList();
        this.zze = arrayList = new ArrayList();
        this.zzf = arrayList = new ArrayList();
        this.zzg = arrayList = new ArrayList();
        this.zzh = arrayList = new ArrayList();
        this.zzi = arrayList = new ArrayList();
        this.zzj = arrayList = new ArrayList();
    }

    public final zzri zza() {
        List list = this.zza;
        List list2 = this.zzb;
        List list3 = this.zzc;
        List list4 = this.zzd;
        List list5 = this.zze;
        List list6 = this.zzf;
        List list7 = this.zzg;
        List list8 = this.zzh;
        List list9 = this.zzi;
        List list10 = this.zzj;
        zzri zzri2 = new zzri(list, list2, list3, list4, list5, list6, list7, list8, list9, list10, null);
        return zzri2;
    }

    public final zzrj zzb(zzre zzre2) {
        this.zze.add(zzre2);
        return this;
    }

    public final zzrj zzc(String string2) {
        this.zzg.add(string2);
        return this;
    }

    public final zzrj zzd(zzre zzre2) {
        this.zzc.add(zzre2);
        return this;
    }

    public final zzrj zze(String string2) {
        this.zzi.add(string2);
        return this;
    }

    public final zzrj zzf(zzre zzre2) {
        this.zzb.add(zzre2);
        return this;
    }

    public final zzrj zzg(zzre zzre2) {
        this.zza.add(zzre2);
        return this;
    }

    public final zzrj zzh(zzre zzre2) {
        this.zzf.add(zzre2);
        return this;
    }

    public final zzrj zzi(String string2) {
        this.zzh.add(string2);
        return this;
    }

    public final zzrj zzj(zzre zzre2) {
        this.zzd.add(zzre2);
        return this;
    }

    public final zzrj zzk(String string2) {
        this.zzj.add(string2);
        return this;
    }
}

