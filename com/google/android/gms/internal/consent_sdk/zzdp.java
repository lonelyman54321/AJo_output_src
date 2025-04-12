/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

public final class zzdp {
    public static Object zza(Object object) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        throw object;
    }

    public static void zzb(Object object, Class object2) {
        if (object != null) {
            return;
        }
        object2 = String.valueOf(((Class)object2).getCanonicalName()).concat(" must be set");
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

