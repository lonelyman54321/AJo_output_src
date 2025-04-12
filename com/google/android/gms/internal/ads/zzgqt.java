/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgqs;
import com.google.android.gms.internal.ads.zzgze;
import java.util.Objects;

final class zzgqt {
    private final Class zza;
    private final zzgze zzb;

    public /* synthetic */ zzgqt(Class clazz, zzgze zzgze2, zzgqs zzgqs2) {
        this.zza = clazz;
        this.zzb = zzgze2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzgqt;
        if (!bl3) {
            return false;
        }
        object = (zzgqt)object;
        Object object2 = ((zzgqt)object).zza;
        Class clazz = this.zza;
        bl3 = object2.equals(clazz);
        return bl3 && (bl2 = ((zzgze)(object = ((zzgqt)object).zzb)).equals(object2 = this.zzb));
    }

    public final int hashCode() {
        Class clazz = this.zza;
        zzgze zzgze2 = this.zzb;
        Object[] objectArray = new Object[]{clazz, zzgze2};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        Object object = this.zzb;
        String string2 = this.zza.getSimpleName();
        object = String.valueOf(object);
        return n1.a(string2, ", object identifier: ", (String)object);
    }
}

