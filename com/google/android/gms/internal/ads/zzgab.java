/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import java.util.Collection;

public final class zzgab {
    public static boolean zza(Collection collection, Object object) {
        collection.getClass();
        try {
            return collection.contains(object);
        }
        catch (ClassCastException | NullPointerException runtimeException) {
            return false;
        }
    }
}

