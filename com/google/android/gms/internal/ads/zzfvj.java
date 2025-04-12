/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh;

final class zzfvj
extends zzgeh {
    Object zza;

    public zzfvj(Object object, Runnable runnable2) {
        this.zza = object;
    }

    public final String zza() {
        Object object = this.zza;
        if (object == null) {
            return "";
        }
        return object.toString();
    }

    public final void zzb() {
        this.zza = null;
    }

    public final boolean zzc(Object object) {
        return super.zzc(object);
    }

    public final boolean zzd(Throwable throwable) {
        return super.zzd(throwable);
    }
}

