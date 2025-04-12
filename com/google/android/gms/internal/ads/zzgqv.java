/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgqu;
import java.util.Objects;

final class zzgqv {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgqv(Class clazz, Class clazz2, zzgqu zzgqu2) {
        this.zza = clazz;
        this.zzb = clazz2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzgqv;
        if (!bl3) {
            return false;
        }
        object = (zzgqv)object;
        Class clazz = ((zzgqv)object).zza;
        Class clazz2 = this.zza;
        bl3 = clazz.equals(clazz2);
        return bl3 && (bl2 = (object = ((zzgqv)object).zzb).equals(clazz = this.zzb));
    }

    public final int hashCode() {
        Class clazz = this.zza;
        Class clazz2 = this.zzb;
        Object[] objectArray = new Object[]{clazz, clazz2};
        return Objects.hash(objectArray);
    }

    public final String toString() {
        Object object = this.zzb;
        String string2 = this.zza.getSimpleName();
        object = ((Class)object).getSimpleName();
        return n1.a(string2, " with serialization type: ", (String)object);
    }
}

