/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager$OnOpActiveChangedListener
 */
package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import com.google.android.gms.internal.ads.zzayn;

final class zzaym
implements AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ zzayn zza;

    public zzaym(zzayn zzayn2) {
        this.zza = zzayn2;
    }

    public final void onOpActiveChanged(String object, int n3, String string2, boolean n4) {
        long l2;
        long l3;
        if (n4 != 0) {
            object = this.zza;
            long l4 = System.currentTimeMillis();
            zzayn.zzg((zzayn)object, l4);
            zzayn.zzf(this.zza, true);
            return;
        }
        object = this.zza;
        long l7 = System.currentTimeMillis();
        long l8 = zzayn.zza((zzayn)object);
        long l12 = l8 - (l3 = 0L);
        Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
        if (object2 > 0 && (n4 = (l2 = l7 - (l8 = zzayn.zza((zzayn)(object = this.zza)))) == 0L ? 0 : (l2 < 0L ? -1 : 1)) >= 0) {
            l8 = zzayn.zza((zzayn)object);
            zzayn.zze((zzayn)object, l7 -= l8);
        }
        zzayn.zzf(this.zza, false);
    }
}

