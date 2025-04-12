/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxu;
import com.google.android.gms.internal.ads.zzfyb;
import com.google.android.gms.internal.ads.zzfyg;

final class zzfyl
extends zzfyb {
    private final Object zza;

    public zzfyl(Object object) {
        this.zza = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzfyl;
        if (bl2) {
            object = (zzfyl)object;
            Object object2 = this.zza;
            object = ((zzfyl)object).zza;
            return object2.equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String string2 = this.zza.toString();
        return cP.a("Optional.of(", string2, ")");
    }

    public final zzfyb zza(zzfxu object) {
        Object object2 = this.zza;
        object = object.apply(object2);
        zzfyg.zzc(object, "the Function passed to Optional.transform() must not return null.");
        zzfyl zzfyl2 = new zzfyl(object);
        return zzfyl2;
    }

    public final Object zzb(Object object) {
        return this.zza;
    }
}

