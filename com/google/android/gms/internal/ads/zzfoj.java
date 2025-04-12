/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfol;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfoq;
import com.google.android.gms.internal.ads.zzfqd;
import java.util.UUID;

public abstract class zzfoj {
    public static zzfoj zza(zzfok zzfok2, zzfol zzfol2) {
        zzfqd.zza();
        String string2 = UUID.randomUUID().toString();
        zzfon zzfon2 = new zzfon(zzfok2, zzfol2, string2);
        return zzfon2;
    }

    public abstract void zzb(View var1, zzfoq var2, String var3);

    public abstract void zzc();

    public abstract void zzd(View var1);

    public abstract void zze();
}

