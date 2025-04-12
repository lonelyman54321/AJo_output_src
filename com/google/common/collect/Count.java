/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import java.io.Serializable;

final class Count
implements Serializable {
    private int value;

    public Count(int n3) {
        this.value = n3;
    }

    public void add(int n3) {
        int n4;
        this.value = n4 = this.value + n3;
    }

    public int addAndGet(int n3) {
        int n4;
        this.value = n4 = this.value + n3;
        return n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int n3 = object instanceof Count;
        if (n3 == 0) return 0 != 0;
        object = (Count)object;
        int n4 = ((Count)object).value;
        n3 = this.value;
        if (n4 != n3) return 0 != 0;
        return 1 != 0;
    }

    public int get() {
        return this.value;
    }

    public int getAndSet(int n3) {
        int n4 = this.value;
        this.value = n3;
        return n4;
    }

    public int hashCode() {
        return this.value;
    }

    public void set(int n3) {
        this.value = n3;
    }

    public String toString() {
        return Integer.toString(this.value);
    }
}

