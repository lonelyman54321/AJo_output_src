/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.components;

public final class Preconditions {
    public static void checkArgument(boolean bl2, String string2) {
        if (bl2) {
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public static Object checkNotNull(Object object) {
        object.getClass();
        return object;
    }

    public static Object checkNotNull(Object object, String string2) {
        if (object != null) {
            return object;
        }
        object = new NullPointerException(string2);
        throw object;
    }

    public static void checkState(boolean bl2, String string2) {
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }
}

