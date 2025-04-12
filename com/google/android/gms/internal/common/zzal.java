/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.common;

public final class zzal {
    public static Object[] zza(Object[] object, int n3) {
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = object[i3];
            if (object2 != null) {
                continue;
            }
            String string2 = hj0_0.a(i3, "at index ");
            object = new NullPointerException(string2);
            throw object;
        }
        return object;
    }
}

