/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.internal.ads.zzfon;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzfpg;
import com.google.android.gms.internal.ads.zzfps;
import java.util.Iterator;

public final class zzfpd
extends zzfpg {
    private static final zzfpd zzb;

    static {
        zzfpd zzfpd2;
        zzb = zzfpd2 = new zzfpd();
    }

    private zzfpd() {
    }

    public static zzfpd zza() {
        return zzb;
    }

    public final void zzb(boolean bl2) {
        boolean bl3;
        Iterator iterator = zzfpe.zza().zzc().iterator();
        while (bl3 = iterator.hasNext()) {
            zzfps zzfps2 = ((zzfon)iterator.next()).zzg();
            zzfps2.zzk(bl2);
        }
    }

    public final boolean zzc() {
        boolean bl2;
        Iterator iterator = zzfpe.zza().zzb().iterator();
        while (bl2 = iterator.hasNext()) {
            View view = ((zzfon)iterator.next()).zzf();
            if (view == null || !(bl2 = view.hasWindowFocus())) continue;
            return true;
        }
        return false;
    }
}

