/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzgf$zzj;
import com.google.android.gms.measurement.internal.zzlu;
import com.google.android.gms.measurement.internal.zzon;
import com.google.android.gms.measurement.internal.zzov;
import com.google.android.gms.measurement.internal.zzpk;
import java.util.Map;

public final class zzpi {
    private long zza;
    private zzgf$zzj zzb;
    private String zzc;
    private Map zzd;
    private zzlu zze;
    private long zzf;

    private zzpi(long l2, zzgf$zzj zzgf$zzj, String string2, Map map2, zzlu zzlu2, long l3, long l4) {
        this.zza = l2;
        this.zzb = zzgf$zzj;
        this.zzc = string2;
        this.zzd = map2;
        this.zze = zzlu2;
        this.zzf = l4;
    }

    public /* synthetic */ zzpi(long l2, zzgf$zzj zzgf$zzj, String string2, Map map2, zzlu zzlu2, long l3, long l4, zzpk zzpk2) {
        this(l2, zzgf$zzj, string2, map2, zzlu2, l3, l4);
    }

    public final long zza() {
        return this.zza;
    }

    public final zzon zzb() {
        zzon zzon2;
        boolean bl2;
        Bundle bundle = new Bundle();
        Object object = this.zzd.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = object.next();
            String string2 = (String)object2.getKey();
            object2 = (String)object2.getValue();
            bundle.putString(string2, (String)object2);
        }
        long l2 = this.zza;
        byte[] byArray = this.zzb.zzce();
        String string3 = this.zzc;
        int n3 = this.zze.zza();
        long l3 = this.zzf;
        object = zzon2;
        zzon2 = new zzon(l2, byArray, string3, bundle, n3, l3);
        return zzon2;
    }

    public final zzov zzc() {
        String string2 = this.zzc;
        Map map2 = this.zzd;
        zzlu zzlu2 = this.zze;
        zzov zzov2 = new zzov(string2, map2, zzlu2);
        return zzov2;
    }

    public final zzgf$zzj zzd() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzc;
    }
}

