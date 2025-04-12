/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 *  android.view.WindowManager
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.gtm.zza;
import com.google.android.gms.internal.gtm.zzap;
import com.google.android.gms.tagmanager.zzbp;
import com.google.android.gms.tagmanager.zzfp;
import java.util.Map;

final class zzea
extends zzbp {
    private static final String zza = com.google.android.gms.internal.gtm.zza.zzB.toString();
    private final Context zzb;

    public zzea(Context context) {
        String string2 = zza;
        String[] stringArray = new String[]{};
        super(string2, stringArray);
        this.zzb = context;
    }

    public final zzap zza(Map map2) {
        map2 = new DisplayMetrics();
        ((WindowManager)this.zzb.getSystemService("window")).getDefaultDisplay().getMetrics((DisplayMetrics)map2);
        int n3 = ((DisplayMetrics)map2).widthPixels;
        int n4 = ((DisplayMetrics)map2).heightPixels;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n3);
        stringBuilder.append("x");
        stringBuilder.append(n4);
        return zzfp.zzb(stringBuilder.toString());
    }

    public final boolean zzb() {
        return true;
    }
}

