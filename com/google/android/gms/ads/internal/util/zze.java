/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbgm;
import com.google.android.gms.internal.ads.zzfyt;

public final class zze
extends zzm {
    public static void zza(String object) {
        int n3;
        int n4 = zze.zzc();
        if (n4 != 0 && object != null && (n4 = ((String)object).length()) > (n3 = 4000)) {
            Object object2 = zzm.zza;
            object = ((zzfyt)object2).zzd((CharSequence)object).iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (String)object.next();
            }
        }
    }

    public static void zzb(String string2, Throwable throwable) {
        zze.zzc();
    }

    public static boolean zzc() {
        Boolean bl2;
        boolean bl3 = zzm.zzm(2);
        return bl3 && (bl3 = (bl2 = (Boolean)zzbgm.zza.zze()).booleanValue());
    }
}

