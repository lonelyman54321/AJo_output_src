/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.base;

import java.nio.Buffer;

final class Java8Compatibility {
    private Java8Compatibility() {
    }

    public static void clear(Buffer buffer) {
        buffer.clear();
    }

    public static void flip(Buffer buffer) {
        buffer.flip();
    }

    public static void limit(Buffer buffer, int n3) {
        buffer.limit(n3);
    }

    public static void position(Buffer buffer, int n3) {
        buffer.position(n3);
    }
}

