/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzccn;
import com.google.android.gms.internal.ads.zzdxf;
import com.google.android.gms.internal.ads.zzgfp;

final class zzdxd
implements zzgfp {
    final /* synthetic */ zzdxf zza;

    public zzdxd(zzdxf zzdxf2) {
        this.zza = zzdxf2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Throwable object) {
        synchronized (this) {
            object = this.zza;
            boolean bl2 = true;
            zzdxf.zzi((zzdxf)object, bl2);
            object = this.zza;
            Object object2 = "com.google.android.gms.ads.MobileAds";
            String string2 = "Internal Error.";
            Clock clock = zzu.zzB();
            long l2 = clock.elapsedRealtime();
            zzdxf zzdxf2 = this.zza;
            long l3 = zzdxf.zza(zzdxf2);
            int n3 = (int)(l2 -= l3);
            clock = null;
            zzdxf.zzk((zzdxf)object, (String)object2, false, string2, n3);
            object = this.zza;
            object = zzdxf.zzb((zzdxf)object);
            object2 = new Exception();
            ((zzccn)object).zzd((Throwable)object2);
            return;
        }
    }
}

