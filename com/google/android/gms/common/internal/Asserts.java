/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.google.android.gms.common.internal;

import android.os.Looper;

public final class Asserts {
    private Asserts() {
        AssertionError assertionError = new AssertionError((Object)"Uninstantiable");
        throw assertionError;
    }

    public static void checkMainThread(String string2) {
        Thread thread2;
        Object object = Looper.getMainLooper().getThread();
        if (object == (thread2 = Thread.currentThread())) {
            return;
        }
        String.valueOf(Thread.currentThread());
        String.valueOf(Looper.getMainLooper().getThread());
        object = new IllegalStateException(string2);
        throw object;
    }

    public static void checkNotMainThread(String string2) {
        Thread thread2;
        Object object = Looper.getMainLooper().getThread();
        if (object != (thread2 = Thread.currentThread())) {
            return;
        }
        String.valueOf(Thread.currentThread());
        String.valueOf(Looper.getMainLooper().getThread());
        object = new IllegalStateException(string2);
        throw object;
    }

    public static void checkNotNull(Object object) {
        if (object != null) {
            return;
        }
        object = new IllegalArgumentException("null reference");
        throw object;
    }

    public static void checkNotNull(Object object, Object object2) {
        if (object != null) {
            return;
        }
        object2 = String.valueOf(object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static void checkNull(Object object) {
        if (object == null) {
            return;
        }
        object = new IllegalArgumentException("non-null reference");
        throw object;
    }

    public static void checkNull(Object object, Object object2) {
        if (object == null) {
            return;
        }
        object2 = String.valueOf(object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static void checkState(boolean bl2) {
        if (bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException();
        throw illegalStateException;
    }

    public static void checkState(boolean bl2, Object object) {
        if (bl2) {
            return;
        }
        object = String.valueOf(object);
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }
}

