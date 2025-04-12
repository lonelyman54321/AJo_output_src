/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzgcm {
    public static Object zza(Object object, int n3) {
        if (object != null) {
            return object;
        }
        String string2 = hj0_0.a(n3, "at index ");
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object[] zzb(Object[] objectArray, int n3) {
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = objectArray[i3];
            zzgcm.zza(object, i3);
        }
        return objectArray;
    }
}

