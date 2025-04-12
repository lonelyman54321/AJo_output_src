/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

final class zzfr
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzS.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzr.toString();

    public zzfr() {
        String string2 = zza;
        String[] stringArray = zzb;
        stringArray = new String[]{stringArray};
        super(string2, stringArray);
    }

    public final zzap zza(Map map2) {
        String string2 = zzb;
        return zzfp.zzb(zzfp.zzm(zzfp.zzk((zzap)map2.get(string2))).toUpperCase());
    }

    public final boolean zzb() {
        return true;
    }
}

