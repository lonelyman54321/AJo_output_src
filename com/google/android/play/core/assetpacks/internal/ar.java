/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks.internal;

public final class ar {
    public static Object a(Object object) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        throw object;
    }
}

