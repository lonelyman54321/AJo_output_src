/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzm;
import com.google.android.gms.internal.icing.zzs;
import java.util.ArrayList;
import java.util.List;

public final class zzr {
    private final String zza;
    private String zzb;
    private boolean zzc;
    private boolean zzd;
    private final List zze;
    private String zzf;

    public zzr(String arrayList) {
        this.zza = arrayList;
        this.zze = arrayList = new ArrayList();
    }

    public final zzr zza(String string2) {
        this.zzb = "blob";
        return this;
    }

    public final zzr zzb(boolean bl2) {
        this.zzc = true;
        return this;
    }

    public final zzr zzc(boolean bl2) {
        this.zzd = true;
        return this;
    }

    public final zzr zzd(String string2) {
        this.zzf = string2;
        return this;
    }

    public final zzs zze() {
        zzs zzs2;
        String string2 = this.zza;
        String string3 = this.zzb;
        boolean bl2 = this.zzc;
        boolean bl3 = this.zzd;
        Object object = this.zze;
        zzm[] zzmArray = new zzm[object.size()];
        zzm[] zzmArray2 = object = object.toArray(zzmArray);
        zzmArray2 = object;
        String string4 = this.zzf;
        object = zzs2;
        zzs2 = new zzs(string2, string3, bl2, 1, bl3, null, zzmArray2, string4, null);
        return zzs2;
    }
}

