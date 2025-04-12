/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

final class Hashing$LinearCongruentialGenerator {
    private long state;

    public Hashing$LinearCongruentialGenerator(long l2) {
        this.state = l2;
    }

    public double nextDouble() {
        long l2;
        this.state = l2 = this.state * 2862933555777941757L + 1L;
        return (double)((int)(l2 >>> 33) + 1) / 2.147483648E9;
    }
}

