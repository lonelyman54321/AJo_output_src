/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzef;

public final class zzeg {
    private final Object zza;
    private final Object zzb;

    private zzeg(Object object, Object object2, zzef zzef2) {
        this.zzb = object2 = new Object();
        this.zza = object;
    }

    public static zzeg zza(Object object, Object object2, zzef zzef2) {
        zzeg zzeg2 = new zzeg(object, object2, zzef2);
        return zzeg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object zzb() {
        Object object = this.zzb;
        // MONITORENTER : object
        // MONITOREXIT : object
        return this.zza;
    }
}

