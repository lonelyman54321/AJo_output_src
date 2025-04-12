/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.zzbh;
import java.util.ArrayList;
import java.util.List;

public final class zzbf {
    private final List zza;
    private final List zzb;
    private final List zzc;

    public zzbf() {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
        this.zzb = arrayList = new ArrayList();
        this.zzc = arrayList = new ArrayList();
    }

    public static /* bridge */ /* synthetic */ List zzc(zzbf zzbf2) {
        return zzbf2.zzb;
    }

    public static /* bridge */ /* synthetic */ List zzd(zzbf zzbf2) {
        return zzbf2.zzc;
    }

    public static /* bridge */ /* synthetic */ List zze(zzbf zzbf2) {
        return zzbf2.zza;
    }

    public final zzbf zza(String object, double d2, double d5) {
        Object object2;
        int n3;
        int n4;
        for (n4 = 0; n4 < (n3 = (object2 = this.zza).size()); ++n4) {
            object2 = (Double)this.zzc.get(n4);
            double d7 = (Double)object2;
            Double d9 = (Double)this.zzb.get(n4);
            double d12 = d9;
            Object object3 = d2 == d7 ? 0 : (d2 < d7 ? -1 : 1);
            if (object3 < 0 || (object3 = d7 == d2 ? 0 : (d7 > d2 ? 1 : -1)) == false && (n3 = (int)(d5 == d12 ? 0 : (d5 < d12 ? -1 : 1))) < 0) break;
        }
        this.zza.add(n4, object);
        object = this.zzc;
        Double d13 = d2;
        object.add(n4, d13);
        object = this.zzb;
        d13 = d5;
        object.add(n4, d13);
        return this;
    }

    public final zzbh zzb() {
        zzbh zzbh2 = new zzbh(this, null);
        return zzbh2;
    }
}

