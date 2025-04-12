/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.appupdate.internal;

public final class zzae {
    public static Object zza(Object object) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        throw object;
    }
}

