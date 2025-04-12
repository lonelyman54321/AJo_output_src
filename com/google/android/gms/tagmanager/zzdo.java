/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.google.android.gms.tagmanager;

import android.os.Build;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

final class zzdo
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzx.toString();

    public zzdo() {
        String string2 = zza;
        String[] stringArray = new String[]{};
        super(string2, stringArray);
    }

    public final zzap zza(Map map2) {
        return zzfp.zzb(Build.VERSION.RELEASE);
    }

    public final boolean zzb() {
        return true;
    }
}

