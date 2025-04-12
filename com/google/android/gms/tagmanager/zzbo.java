/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzep;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

final class zzbo
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzr.toString();
    private final zzep zzb;

    public zzbo(zzep zzep2) {
        String string2 = zza;
        String[] stringArray = new String[]{};
        super(string2, stringArray);
        this.zzb = zzep2;
    }

    public final zzap zza(Map object) {
        object = this.zzb.zzb();
        object = object == null ? zzfp.zza() : zzfp.zzb(object);
        return object;
    }

    public final boolean zzb() {
        return false;
    }
}

