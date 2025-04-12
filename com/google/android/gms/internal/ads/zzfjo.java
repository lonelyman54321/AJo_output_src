/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfjm;

public final class zzfjo
implements zzfjm {
    private final String zza;

    public zzfjo(String string2) {
        this.zza = string2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzfjo;
        if (!bl2) {
            return false;
        }
        object = (zzfjo)object;
        String string2 = this.zza;
        object = ((zzfjo)object).zza;
        return string2.equals(object);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}

