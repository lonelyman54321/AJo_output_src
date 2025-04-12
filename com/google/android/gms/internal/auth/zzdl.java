/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdj;

final class zzdl
implements zzdj {
    volatile zzdj zza;
    volatile boolean zzb;
    Object zzc;

    public zzdl(zzdj zzdj2) {
        zzdj2.getClass();
        this.zza = zzdj2;
    }

    public final String toString() {
        Object object = this.zza;
        Object object2 = "Suppliers.memoize(";
        StringBuilder stringBuilder = new StringBuilder((String)object2);
        if (object == null) {
            object = new StringBuilder("<supplier that returned ");
            object2 = this.zzc;
            String string2 = ">";
            object = fK.a((StringBuilder)object, object2, string2);
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
                object.getClass();
                this.zzc = object = object.zza();
                this.zzb = bl3 = true;
                bl3 = false;
                this.zza = null;
                return object;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }
}

