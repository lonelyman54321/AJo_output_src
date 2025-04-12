/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.util.internal;

public final class PrivateMaxEntriesMap$l {
    public final int a;
    public final Object b;

    public PrivateMaxEntriesMap$l(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final boolean a() {
        int n3 = this.a;
        n3 = n3 > 0 ? 1 : 0;
        return n3 != 0;
    }
}

