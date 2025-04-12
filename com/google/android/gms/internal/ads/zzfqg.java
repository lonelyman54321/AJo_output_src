/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfph;
import java.util.ArrayList;

public final class zzfqg {
    private final zzfph zza;
    private final ArrayList zzb;

    public zzfqg(zzfph zzfph2, String string2) {
        ArrayList<String> arrayList;
        this.zzb = arrayList = new ArrayList<String>();
        this.zza = zzfph2;
        arrayList.add(string2);
    }

    public final zzfph zza() {
        return this.zza;
    }

    public final ArrayList zzb() {
        return this.zzb;
    }

    public final void zzc(String string2) {
        this.zzb.add(string2);
    }
}

