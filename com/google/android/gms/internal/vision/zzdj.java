/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzcz;
import com.google.android.gms.internal.vision.zzdf;
import java.io.Serializable;
import java.util.Arrays;

final class zzdj
implements zzdf,
Serializable {
    private final Object zza;

    public zzdj(Object object) {
        this.zza = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzdj;
        if (bl2) {
            object = (zzdj)object;
            Object object2 = this.zza;
            object = ((zzdj)object).zza;
            return zzcz.zza(object2, object);
        }
        return false;
    }

    public final int hashCode() {
        Object object = this.zza;
        Object[] objectArray = new Object[]{object};
        return Arrays.hashCode(objectArray);
    }

    public final String toString() {
        String string2 = String.valueOf(this.zza);
        int n3 = string2.length() + 22;
        StringBuilder stringBuilder = new StringBuilder(n3);
        stringBuilder.append("Suppliers.ofInstance(");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final Object zza() {
        return this.zza;
    }
}

