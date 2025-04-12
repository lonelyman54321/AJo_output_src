/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.escape;

import com.google.common.escape.Platform$1;

final class Platform {
    private static final ThreadLocal DEST_TL;

    static {
        Platform$1 platform$1 = new Platform$1();
        DEST_TL = platform$1;
    }

    private Platform() {
    }

    public static char[] charBufferFromThreadLocal() {
        return (char[])DEST_TL.get();
    }
}

