/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzqk;
import java.util.ArrayList;
import java.util.List;

public final class zzqi {
    private final Integer zza;
    private final Object zzb;
    private final List zzc;
    private boolean zzd;

    public zzqi(int n3, Object object) {
        Integer n4;
        ArrayList arrayList;
        this.zzc = arrayList = new ArrayList();
        this.zzd = false;
        this.zza = n4 = Integer.valueOf(n3);
        this.zzb = object;
    }

    public final zzqi zza(int n3) {
        List list = this.zzc;
        Integer n4 = n3;
        list.add(n4);
        return this;
    }

    public final zzqi zzb(boolean bl2) {
        this.zzd = true;
        return this;
    }

    public final zzqk zzc() {
        Preconditions.checkNotNull(this.zza);
        Preconditions.checkNotNull(this.zzb);
        Integer n3 = this.zza;
        Object object = this.zzb;
        List list = this.zzc;
        boolean bl2 = this.zzd;
        zzqk zzqk2 = new zzqk(n3, object, list, bl2, null);
        return zzqk2;
    }
}

