/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.UiModeManager
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;
import com.google.android.gms.internal.ads.zzfop;

public final class zzfpx {
    private static UiModeManager zza;

    public static zzfop zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager != null) {
            int n3;
            int n4 = uiModeManager.getCurrentModeType();
            if (n4 != (n3 = 1)) {
                n3 = 4;
                if (n4 != n3) {
                    return zzfop.zzc;
                }
                return zzfop.zza;
            }
            return zzfop.zzb;
        }
        return zzfop.zzc;
    }

    public static void zzb(Context context) {
        if (context != null) {
            String string2 = "uimode";
            context = (UiModeManager)context.getSystemService(string2);
            zza = context;
        }
    }
}

