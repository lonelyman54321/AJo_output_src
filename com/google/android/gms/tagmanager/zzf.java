/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzd;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

final class zzf
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzb.toString();
    private final zzd zzb;

    public zzf(zzd zzd2) {
        String string2 = zza;
        String[] stringArray = new String[]{};
        super(string2, stringArray);
        this.zzb = zzd2;
    }

    public final zzap zza(Map map2) {
        return zzfp.zzb(this.zzb.zzf() ^ true);
    }

    public final boolean zzb() {
        return false;
    }
}

