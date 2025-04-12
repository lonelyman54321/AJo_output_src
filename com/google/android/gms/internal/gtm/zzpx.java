/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzpy;
import com.google.android.gms.internal.gtm.zzqb;
import com.google.android.gms.internal.gtm.zzqe;
import com.google.android.gms.internal.gtm.zzqk;
import java.util.List;
import java.util.Map;

public final class zzpx {
    private final List zza;
    private final Map zzb;
    private String zzc;

    public zzpx() {
        Cloneable cloneable;
        this.zza = cloneable = new Cloneable();
        this.zzb = cloneable;
        this.zzc = "";
    }

    public final zzpx zza(zzqb zzqb2) {
        String string2 = ((zzqk)zzqb2.zza().get("instance_name")).toString();
        this.zzb.put(string2, zzqb2);
        return this;
    }

    public final zzpx zzb(zzqe zzqe2) {
        this.zza.add(zzqe2);
        return this;
    }

    public final zzpx zzc(String string2) {
        this.zzc = string2;
        return this;
    }

    public final zzpy zzd() {
        List list = this.zza;
        Map map2 = this.zzb;
        String string2 = this.zzc;
        zzpy zzpy2 = new zzpy(list, map2, string2, 0);
        return zzpy2;
    }
}

