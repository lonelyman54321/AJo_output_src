/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

public final class zzhkx {
    public static Object zza(Object object, String string2) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static Object zzb(Object object) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        throw object;
    }

    public static void zzc(Object object, Class object2) {
        if (object != null) {
            return;
        }
        object2 = String.valueOf(((Class)object2).getCanonicalName()).concat(" must be set");
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

