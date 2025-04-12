/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.escape;

class Platform$1
extends ThreadLocal {
    public char[] initialValue() {
        return new char[1024];
    }
}

