/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzauh;
import com.google.android.gms.internal.ads.zzaxw;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;

public final class zzazc
extends zzazs {
    private final zzaxw zzi;

    public zzazc(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4, zzaxw zzaxw2) {
        super(zzaye2, "QcEEfK1PwFv2Eb+NZQ+4kWKAUUVvycYqoBzmAjBexJV/sKEjaFlajeD5MAZYWXy5", "361aY1ErIwpwsXwpamiiDSCpkl/IcdBM93dd8sW9a/Y=", zzatp2, n3, 94);
        this.zzi = zzaxw2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = this.zzf;
        Object object2 = this.zzi.zza();
        int n3 = 1;
        Object object3 = new Object[n3];
        object3[0] = object2;
        object = (Integer)((Method)object).invoke(null, (Object[])object3);
        int n4 = (Integer)object;
        object2 = this.zze;
        synchronized (object2) {
            object3 = this.zze;
            object = zzauh.zzb(n4);
            ((zzatp)object3).zzD((zzauh)object);
            return;
        }
    }
}

