/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

final class zztg {
    public static void zza(Object object, Object object2) {
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

