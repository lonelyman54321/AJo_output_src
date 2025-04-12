/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgqb;
import java.util.Objects;

final class zzgqc {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgqc(Class clazz, Class clazz2, zzgqb zzgqb2) {
        this.zza = clazz;
        this.zzb = clazz2;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = object instanceof zzgqc;
        if (!bl3) {
            return false;
        }
        object = (zzgqc)object;
        Class clazz = ((zzgqc)object).zza;
        Class clazz2 = this.zza;
        bl3 = clazz.equals(clazz2);
        return bl3 && (bl2 = (object = ((zzgqc)object).zzb).equals(clazz = this.zzb));
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
        return n1.a(string2, " with primitive type: ", (String)object);
    }
}

