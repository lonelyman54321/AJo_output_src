/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzayf;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;

public final class zzayy
extends zzazs {
    private final zzayf zzi;

    public zzayy(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4, zzayf zzayf2) {
        super(zzaye2, "ZdMwT5n8r4APV4u4GhQlb1VCwOIVHkTm7kF7LnArEpyZnsv+C3G3q6fVFgtTcqcc", "O+vmm8flr2e7ZrTWUx/T8ClWwcEwLlJlfjM8sMGjZbg=", zzatp2, n3, 85);
        this.zzi = zzayf2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = this.zzf;
        long l2 = this.zzi.zzd();
        Long l3 = l2;
        long l4 = this.zzi.zzh();
        Object object2 = l4;
        long l7 = this.zzi.zzb();
        Object object3 = l7;
        Object object4 = this.zzi.zzf();
        Long l8 = object4;
        int n3 = 4;
        Object[] objectArray = new Object[n3];
        objectArray[0] = l3;
        int n4 = 1;
        objectArray[n4] = object2;
        objectArray[2] = object3;
        objectArray[3] = l8;
        object = (long[])((Method)object).invoke(null, objectArray);
        object2 = this.zze;
        synchronized (object2) {
            object3 = this.zze;
            object4 = object[0];
            ((zzatp)object3).zzx((long)object4);
            object3 = this.zze;
            object4 = object[n4];
            ((zzatp)object3).zzw((long)object4);
            return;
        }
    }
}

