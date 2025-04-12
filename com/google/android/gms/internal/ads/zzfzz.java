/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

final class zzfzz {
    public static int zza(int n3, String string2) {
        if (n3 >= 0) {
            return n3;
        }
        String string3 = LO1.a(n3, string2, " cannot be negative but was: ");
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string3);
        throw illegalArgumentException;
    }

    public static void zzb(Object object, Object object2) {
        if (object != null) {
            if (object2 != null) {
                return;
            }
            object = object.toString();
            object = cP.a("null value in entry: ", (String)object, "=null");
            object2 = new NullPointerException((String)object);
            throw object2;
        }
        object2 = String.valueOf(object2);
        object2 = "null key in entry: null=".concat((String)object2);
        object = new NullPointerException((String)object2);
        throw object;
    }
}

