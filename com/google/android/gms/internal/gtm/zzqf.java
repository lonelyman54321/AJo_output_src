/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzjl;
import com.google.android.gms.internal.gtm.zzqh;
import java.util.ArrayList;
import java.util.List;

public final class zzqf {
    private final List zza;
    private String zzb;

    public zzqf() {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
    }

    public final zzqf zza(zzjl zzjl2) {
        this.zza.add(zzjl2);
        return this;
    }

    public final zzqf zzb(String string2) {
        this.zzb = string2;
        return this;
    }

    public final zzqh zzc() {
        String string2 = this.zzb;
        List list = this.zza;
        zzqh zzqh2 = new zzqh(string2, list, null);
        return zzqh2;
    }
}

