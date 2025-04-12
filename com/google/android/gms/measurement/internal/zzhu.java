/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzo;
import com.google.android.gms.measurement.internal.zzhm;
import java.util.Map;

final class zzhu
implements zzo {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzhm zzb;

    public zzhu(zzhm zzhm2, String string2) {
        this.zza = string2;
        this.zzb = zzhm2;
    }

    public final String zza(String string2) {
        boolean bl2;
        Map map2 = zzhm.zzb(this.zzb);
        String string3 = this.zza;
        if ((map2 = (Map)map2.get(string3)) != null && (bl2 = map2.containsKey(string2))) {
            return (String)map2.get(string2);
        }
        return null;
    }
}

