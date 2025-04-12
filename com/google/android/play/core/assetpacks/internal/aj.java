/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks.internal;

public final class aj {
    public static Object a(Object object, Object object2) {
        if (object != null) {
            return object;
        }
        object2 = (String)object2;
        object = new NullPointerException((String)object2);
        throw object;
    }

    public static void b(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        object = String.valueOf(object);
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }
}

