/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.internal.gtm.zzb;
import com.google.android.gms.tagmanager.zzbp;
import java.util.Map;

final class zzr
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzg.toString();
    private static final String zzb = com.google.android.gms.internal.gtm.zzb.zzec.toString();

    public zzr() {
        String string2 = zza;
        String[] stringArray = zzb;
        stringArray = new String[]{stringArray};
        super(string2, stringArray);
    }

    public static String zzc() {
        return zza;
    }

    public static String zzd() {
        return zzb;
    }

    public final zzap zza(Map map2) {
        String string2 = zzb;
        return (zzap)map2.get(string2);
    }

    public final boolean zzb() {
        return true;
    }
}

