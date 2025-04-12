/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgti;
import com.google.android.gms.internal.ads.zzgtj;
import java.util.Map;

public final class zzgtk {
    public static final zzgtk zza;
    private final Map zzb;

    static {
        zzgti zzgti2 = new zzgti();
        zza = zzgti2.zza();
    }

    public /* synthetic */ zzgtk(Map map2, zzgtj zzgtj2) {
        this.zzb = map2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzgtk;
        if (!bl2) {
            return false;
        }
        object = (zzgtk)object;
        Map map2 = this.zzb;
        object = ((zzgtk)object).zzb;
        return ((Object)map2).equals(object);
    }

    public final int hashCode() {
        return ((Object)this.zzb).hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}

