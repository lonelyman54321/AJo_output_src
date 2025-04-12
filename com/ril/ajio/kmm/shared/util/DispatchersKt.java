/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.util;

import kotlinx.coroutines.c;

public final class DispatchersKt {
    private static final c ioDispatcher;
    private static final c mainDispatcher;

    static {
        mainDispatcher = bg1_1.a;
        ioDispatcher = em0_2.b;
    }

    public static final c getIoDispatcher() {
        return ioDispatcher;
    }

    public static final c getMainDispatcher() {
        return mainDispatcher;
    }
}

