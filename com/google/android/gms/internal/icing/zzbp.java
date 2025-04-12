/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzbq;

public final class zzbp {
    public static Object zza(Object object) {
        if (object != null) {
            return object;
        }
        int n3 = 29;
        CharSequence charSequence = new StringBuilder(n3);
        charSequence.append("expected a non-null reference", 0, n3);
        charSequence = charSequence.toString();
        object = new zzbq((String)charSequence);
        throw object;
    }
}

