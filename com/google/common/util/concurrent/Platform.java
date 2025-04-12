/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;

final class Platform {
    private Platform() {
    }

    public static boolean isInstanceOfThrowableClass(Throwable throwable, Class clazz) {
        return clazz.isInstance(throwable);
    }

    public static void restoreInterruptIfIsInterruptedException(Throwable object) {
        Preconditions.checkNotNull(object);
        boolean bl2 = object instanceof InterruptedException;
        if (bl2) {
            object = Thread.currentThread();
            ((Thread)object).interrupt();
        }
    }
}

