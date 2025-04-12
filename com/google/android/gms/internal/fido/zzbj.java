/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.fido.zzbk;
import java.util.Arrays;

public final class zzbj
extends zzbk {
    private final String zza;

    public zzbj(String string2) {
        this.zza = string2;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        String string2 = null;
        if (object == null) {
            return false;
        }
        Class<zzbj> clazz = zzbj.class;
        Class<?> clazz2 = object.getClass();
        if (clazz != clazz2) {
            return false;
        }
        object = (zzbj)object;
        string2 = this.zza;
        object = ((zzbj)object).zza;
        return string2.equals(object);
    }

    public final int hashCode() {
        Integer n3 = 3;
        String string2 = this.zza;
        Object[] objectArray = new Object[]{n3, string2};
        return Arrays.hashCode(objectArray);
    }

    public final String toString() {
        String string2 = this.zza;
        String string3 = "\"";
        return cP.a(string3, string2, string3);
    }

    public final int zza() {
        return 3;
    }
}

