/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.AbstractCompositeHashFunction;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing$1;
import java.util.Arrays;

final class Hashing$ConcatenatedHashFunction
extends AbstractCompositeHashFunction {
    private Hashing$ConcatenatedHashFunction(HashFunction ... hashFunctionArray) {
        super(hashFunctionArray);
        for (HashFunction hashFunction : hashFunctionArray) {
            boolean bl2 = hashFunction.bits() % 8;
            bl2 = !bl2;
            String string2 = "the number of bits (%s) in hashFunction (%s) must be divisible by 8";
            int n3 = hashFunction.bits();
            Preconditions.checkArgument(bl2, string2, n3, (Object)hashFunction);
        }
    }

    public /* synthetic */ Hashing$ConcatenatedHashFunction(HashFunction[] hashFunctionArray, Hashing$1 hashing$1) {
        this(hashFunctionArray);
    }

    public int bits() {
        HashFunction[] hashFunctionArray = this.functions;
        int n3 = hashFunctionArray.length;
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            HashFunction hashFunction = hashFunctionArray[i3];
            int n7 = hashFunction.bits();
            n4 += n7;
        }
        return n4;
    }

    public boolean equals(Object objectArray) {
        boolean bl2 = objectArray instanceof Hashing$ConcatenatedHashFunction;
        if (bl2) {
            objectArray = (Hashing$ConcatenatedHashFunction)objectArray;
            Object[] objectArray2 = this.functions;
            objectArray = objectArray.functions;
            return Arrays.equals(objectArray2, objectArray);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.functions);
    }

    public HashCode makeHash(Hasher[] hasherArray) {
        int n3 = this.bits() / 8;
        byte[] byArray = new byte[n3];
        int n4 = hasherArray.length;
        int n7 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            HashCode hashCode = hasherArray[i3].hash();
            int n8 = hashCode.bits() / 8;
            int n10 = hashCode.writeBytesTo(byArray, n7, n8);
            n7 += n10;
        }
        return HashCode.fromBytesNoCopy(byArray);
    }
}

