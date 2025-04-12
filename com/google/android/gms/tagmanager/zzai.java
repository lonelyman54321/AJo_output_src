/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

final class zzai
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzj.toString();
    private final String zzb;

    public zzai(String string2) {
        String string3 = zza;
        String[] stringArray = new String[]{};
        super(string3, stringArray);
        this.zzb = string2;
    }

    public final zzap zza(Map object) {
        object = this.zzb;
        object = object == null ? zzfp.zza() : zzfp.zzb(object);
        return object;
    }

    public final boolean zzb() {
        return true;
    }
}

