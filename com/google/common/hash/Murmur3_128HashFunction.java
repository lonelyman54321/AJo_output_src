/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.AbstractHashFunction;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import com.google.common.hash.Murmur3_128HashFunction$Murmur3_128Hasher;
import java.io.Serializable;

final class Murmur3_128HashFunction
extends AbstractHashFunction
implements Serializable {
    static final HashFunction GOOD_FAST_HASH_128;
    static final HashFunction MURMUR3_128;
    private static final long serialVersionUID;
    private final int seed;

    static {
        Murmur3_128HashFunction murmur3_128HashFunction = new Murmur3_128HashFunction(0);
        MURMUR3_128 = murmur3_128HashFunction;
        int n3 = Hashing.GOOD_FAST_HASH_SEED;
        murmur3_128HashFunction = new Murmur3_128HashFunction(n3);
        GOOD_FAST_HASH_128 = murmur3_128HashFunction;
    }

    public Murmur3_128HashFunction(int n3) {
        this.seed = n3;
    }

    public int bits() {
        return 128;
    }

    public boolean equals(Object object) {
        int n3 = object instanceof Murmur3_128HashFunction;
        boolean bl2 = false;
        if (n3 != 0) {
            object = (Murmur3_128HashFunction)object;
            n3 = this.seed;
            int n4 = ((Murmur3_128HashFunction)object).seed;
            if (n3 == n4) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public int hashCode() {
        int n3 = Murmur3_128HashFunction.class.hashCode();
        int n4 = this.seed;
        return n3 ^ n4;
    }

    public Hasher newHasher() {
        int n3 = this.seed;
        Murmur3_128HashFunction$Murmur3_128Hasher murmur3_128HashFunction$Murmur3_128Hasher = new Murmur3_128HashFunction$Murmur3_128Hasher(n3);
        return murmur3_128HashFunction$Murmur3_128Hasher;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Hashing.murmur3_128(");
        return g30.a(this.seed, ")", stringBuilder);
    }
}

