/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.splitinstall.testing.zzc;
import com.google.android.play.core.splitinstall.testing.zzu;
import com.google.android.play.core.splitinstall.testing.zzv;
import java.util.Map;

final class zza
extends zzu {
    private Integer zza;
    private Map zzb;

    public final zzu zza(int n3) {
        Integer n4;
        this.zza = n4 = Integer.valueOf(n3);
        return this;
    }

    public final zzu zzb(Map object) {
        if (object != null) {
            this.zzb = object;
            return this;
        }
        object = new NullPointerException("Null splitInstallErrorCodeByModule");
        throw object;
    }

    public final zzv zzc() {
        Object object = this.zzb;
        if (object != null) {
            Integer n3 = this.zza;
            Map map2 = this.zzb;
            object = new zzc(n3, map2, null);
            return object;
        }
        object = new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
        throw object;
    }

    public final Map zzd() {
        Object object = this.zzb;
        if (object != null) {
            return object;
        }
        object = new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
        throw object;
    }
}

