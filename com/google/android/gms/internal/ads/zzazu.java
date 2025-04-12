/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageManager$OnChecksumsReadyListener
 */
package com.google.android.gms.internal.ads;

import android.content.pm.PackageManager;
import com.google.android.gms.internal.ads.zzayh;
import com.google.android.gms.internal.ads.zzggm;
import java.util.List;

public final class zzazu
implements PackageManager.OnChecksumsReadyListener {
    public final /* synthetic */ zzggm zza;

    public /* synthetic */ zzazu(zzggm zzggm2) {
        this.zza = zzggm2;
    }

    public final void onChecksumsReady(List object) {
        zzggm zzggm2 = this.zza;
        if (object == null) {
            zzggm2.zzc(null);
            return;
        }
        int n3 = object.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object.get(i3);
            object2 = pk3_1.a(object2);
            int n4 = qk3_1.a(object2);
            int n7 = 8;
            if (n4 != n7) continue;
            object = rk3_2.a(object2);
            object = zzayh.zzb((byte[])object);
            zzggm2.zzc(object);
            return;
        }
        try {
            zzggm2.zzc(null);
            return;
        }
        catch (Throwable throwable) {
            zzggm2.zzc(null);
            return;
        }
    }
}

