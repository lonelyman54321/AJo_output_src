/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzatp;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzazs;
import java.lang.reflect.Method;

public final class zzazj
extends zzazs {
    private final boolean zzi;

    public zzazj(zzaye zzaye2, String string2, String string3, zzatp zzatp2, int n3, int n4) {
        super(zzaye2, "vvYcBqgI4aoC3GZZ7n1bdLp71k52s6EJLh0/nA6ME39LmvOZf3TBZ+H4xg1YfQXg", "6jGSPrUM0+2YrTO2vsTOKq3+XL/IfUFs5oxZaSEvsQg=", zzatp2, n3, 61);
        boolean bl2;
        this.zzi = bl2 = zzaye2.zzs();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza() {
        Object object = this.zzf;
        Context context = this.zzb.zzb();
        boolean bl2 = this.zzi;
        Object object2 = bl2;
        int n3 = 2;
        Object object3 = new Object[n3];
        object3[0] = context;
        object3[1] = object2;
        context = null;
        object = (Long)((Method)object).invoke(null, (Object[])object3);
        long l2 = (Long)object;
        object2 = this.zze;
        synchronized (object2) {
            object3 = this.zze;
            ((zzatp)object3).zzK(l2);
            return;
        }
    }
}

