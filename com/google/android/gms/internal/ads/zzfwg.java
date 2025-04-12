/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfwf;
import com.google.android.gms.internal.ads.zzfwh;
import com.google.android.gms.internal.ads.zzfwn;

public final class zzfwg {
    public static zzfwf zza(Context context) {
        Context context2 = context.getApplicationContext();
        if (context2 != null) {
            context = context2;
        }
        zzfwn zzfwn2 = new zzfwn(context);
        zzfwh zzfwh2 = new zzfwh(zzfwn2);
        return zzfwh2;
    }
}

