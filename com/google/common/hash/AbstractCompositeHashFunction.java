/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.AbstractCompositeHashFunction$1;
import com.google.common.hash.AbstractHashFunction;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;

abstract class AbstractCompositeHashFunction
extends AbstractHashFunction {
    private static final long serialVersionUID;
    final HashFunction[] functions;

    public AbstractCompositeHashFunction(HashFunction ... hashFunctionArray) {
        int n3 = hashFunctionArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            HashFunction hashFunction = hashFunctionArray[i3];
            Preconditions.checkNotNull(hashFunction);
        }
        this.functions = hashFunctionArray;
    }

    private Hasher fromHashers(Hasher[] hasherArray) {
        AbstractCompositeHashFunction$1 abstractCompositeHashFunction$1 = new AbstractCompositeHashFunction$1(this, hasherArray);
        return abstractCompositeHashFunction$1;
    }

    public abstract HashCode makeHash(Hasher[] var1);

    public Hasher newHasher() {
        HashFunction[] hashFunctionArray = this.functions;
        int n3 = hashFunctionArray.length;
        Hasher[] hasherArray = new Hasher[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            Hasher hasher;
            hasherArray[i3] = hasher = this.functions[i3].newHasher();
        }
        return this.fromHashers(hasherArray);
    }

    public Hasher newHasher(int n3) {
        HashFunction[] hashFunctionArray;
        int n4;
        int n7 = 0;
        if (n3 >= 0) {
            n4 = 1;
        } else {
            n4 = 0;
            hashFunctionArray = null;
        }
        Preconditions.checkArgument(n4 != 0);
        hashFunctionArray = this.functions;
        n4 = hashFunctionArray.length;
        Hasher[] hasherArray = new Hasher[n4];
        while (n7 < n4) {
            Hasher hasher;
            hasherArray[n7] = hasher = this.functions[n7].newHasher(n3);
            ++n7;
        }
        return this.fromHashers(hasherArray);
    }
}

