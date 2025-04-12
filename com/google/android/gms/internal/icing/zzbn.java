/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbm;

final class zzbn
implements zzbm {
    volatile zzbm zza;

    public zzbn(zzbm zzbm2) {
        this.zza = zzbm2;
    }

    public final String toString() {
        Object object = this.zza;
        if (object == null) {
            int n3 = "null".length();
            StringBuilder stringBuilder = new StringBuilder(n3 += 25);
            stringBuilder.append("<supplier that returned null>");
            object = stringBuilder.toString();
        }
        object = String.valueOf(object);
        int n4 = ((String)object).length();
        StringBuilder stringBuilder = new StringBuilder(n4 += 19);
        return BW0.b(stringBuilder, "Suppliers.memoize(", (String)object, ")");
    }
}

