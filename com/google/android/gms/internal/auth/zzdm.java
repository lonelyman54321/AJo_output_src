/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzdj;
import java.io.Serializable;
import java.util.Arrays;

final class zzdm
implements Serializable,
zzdj {
    final Object zza;

    public zzdm(Object object) {
        this.zza = object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzdm;
        if (bl2) {
            boolean bl3;
            object = (zzdm)object;
            Object object2 = this.zza;
            object = ((zzdm)object).zza;
            return object2 == object || (bl3 = object2.equals(object));
            {
            }
        }
        return false;
    }

    public final int hashCode() {
        Object object = this.zza;
        Object[] objectArray = new Object[]{object};
        return Arrays.hashCode(objectArray);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Suppliers.ofInstance(");
        Object object = this.zza;
        return fK.a(stringBuilder, object, ")");
    }

    public final Object zza() {
        return this.zza;
    }
}

