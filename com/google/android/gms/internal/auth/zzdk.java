/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdj;
import java.io.Serializable;

final class zzdk
implements Serializable,
zzdj {
    final zzdj zza;
    volatile transient boolean zzb;
    transient Object zzc;

    public zzdk(zzdj zzdj2) {
        zzdj2.getClass();
        this.zza = zzdj2;
    }

    public final String toString() {
        Object object = "Suppliers.memoize(";
        StringBuilder stringBuilder = new StringBuilder((String)object);
        boolean bl2 = this.zzb;
        if (bl2) {
            object = new StringBuilder("<supplier that returned ");
            Object object2 = this.zzc;
            String string2 = ">";
            object = fK.a((StringBuilder)object, object2, string2);
        } else {
            object = this.zza;
        }
        return fK.a(stringBuilder, object, ")");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza() {
        boolean bl2 = this.zzb;
        if (bl2) return this.zzc;
        synchronized (this) {
            try {
                boolean bl3;
                bl2 = this.zzb;
                if (bl2) return this.zzc;
                Object object = this.zza;
                this.zzc = object = object.zza();
                this.zzb = bl3 = true;
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

