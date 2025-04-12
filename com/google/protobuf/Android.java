/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

final class Android {
    private static boolean ASSUME_ANDROID;
    private static final boolean IS_ROBOLECTRIC;
    private static final Class MEMORY_CLASS;

    static {
        Class clazz;
        MEMORY_CLASS = clazz = Android.getClassForName("libcore.io.Memory");
        boolean bl2 = ASSUME_ANDROID;
        if (!bl2 && (clazz = Android.getClassForName("org.robolectric.Robolectric")) != null) {
            bl2 = true;
        } else {
            bl2 = false;
            clazz = null;
        }
        IS_ROBOLECTRIC = bl2;
    }

    private Android() {
    }

    private static Class getClassForName(String string2) {
        try {
            return Class.forName(string2);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    public static Class getMemoryClass() {
        return MEMORY_CLASS;
    }

    public static boolean isOnAndroidDevice() {
        Class clazz;
        boolean bl2 = ASSUME_ANDROID;
        if (!bl2 && ((clazz = MEMORY_CLASS) == null || (bl2 = IS_ROBOLECTRIC))) {
            bl2 = false;
            clazz = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

