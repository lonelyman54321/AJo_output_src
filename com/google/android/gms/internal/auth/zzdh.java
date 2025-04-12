/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdf;
import com.google.android.gms.internal.auth.zzdi;
import java.io.Serializable;

public abstract class zzdh
implements Serializable {
    public static zzdh zzc() {
        return zzdf.zza;
    }

    public static zzdh zzd(Object object) {
        zzdi zzdi2 = new zzdi(object);
        return zzdi2;
    }

    public abstract Object zza();

    public abstract boolean zzb();
}

