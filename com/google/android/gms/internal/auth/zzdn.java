/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdj;
import com.google.android.gms.internal.auth.zzdk;
import com.google.android.gms.internal.auth.zzdl;
import com.google.android.gms.internal.auth.zzdm;
import java.io.Serializable;

public final class zzdn {
    public static zzdj zza(zzdj zzdj2) {
        boolean bl2 = zzdj2 instanceof zzdl;
        if (!bl2 && !(bl2 = zzdj2 instanceof zzdk)) {
            bl2 = zzdj2 instanceof Serializable;
            zzdj zzdj3 = bl2 ? new zzdk(zzdj2) : new zzdl(zzdj2);
            return zzdj3;
        }
        return zzdj2;
    }

    public static zzdj zzb(Object object) {
        zzdm zzdm2 = new zzdm(object);
        return zzdm2;
    }
}

