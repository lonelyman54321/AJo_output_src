/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

public abstract class ForwardingObject {
    public abstract Object delegate();

    public String toString() {
        return this.delegate().toString();
    }
}

