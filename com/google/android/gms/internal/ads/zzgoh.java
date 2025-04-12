/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgof;
import com.google.android.gms.internal.ads.zzgog;
import java.security.GeneralSecurityException;
import java.util.Map;

public final class zzgoh {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgoh(Map map2, Map map3, zzgog zzgog2) {
        this.zza = map2;
        this.zzb = map3;
    }

    public static zzgof zza() {
        zzgof zzgof2 = new zzgof(null);
        return zzgof2;
    }

    public final Enum zzb(Object object) {
        Object object2 = (Enum)this.zzb.get(object);
        if (object2 != null) {
            return object2;
        }
        object = String.valueOf(object);
        object = "Unable to convert object enum: ".concat((String)object);
        object2 = new GeneralSecurityException((String)object);
        throw object2;
    }

    public final Object zzc(Enum object) {
        Object object2 = this.zza.get(object);
        if (object2 != null) {
            return object2;
        }
        object = String.valueOf(object);
        object = "Unable to convert proto enum: ".concat((String)object);
        object2 = new Object((String)object);
        throw object2;
    }
}

