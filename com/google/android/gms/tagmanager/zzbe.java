/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 */
package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

final class zzbe
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzl.toString();

    public zzbe() {
        String string2 = zza;
        String[] stringArray = new String[]{};
        super(string2, stringArray);
    }

    public final zzap zza(Map object) {
        String string2;
        String string3 = Build.MODEL;
        object = Build.MANUFACTURER;
        boolean bl2 = string3.startsWith((String)object);
        if (!bl2 && !(bl2 = ((String)object).equals(string2 = "unknown"))) {
            string2 = " ";
            string3 = n1.a((String)object, string2, string3);
        }
        return zzfp.zzb(string3);
    }

    public final boolean zzb() {
        return true;
    }
}

