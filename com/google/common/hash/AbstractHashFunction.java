/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.Funnel;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

abstract class AbstractHashFunction
implements HashFunction {
    public HashCode hashBytes(ByteBuffer byteBuffer) {
        int n3 = byteBuffer.remaining();
        return this.newHasher(n3).putBytes(byteBuffer).hash();
    }

    public HashCode hashBytes(byte[] byArray) {
        int n3 = byArray.length;
        return this.hashBytes(byArray, 0, n3);
    }

    public HashCode hashBytes(byte[] byArray, int n3, int n4) {
        int n7 = n3 + n4;
        int n8 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n7, n8);
        return this.newHasher(n4).putBytes(byArray, n3, n4).hash();
    }

    public HashCode hashInt(int n3) {
        return this.newHasher(4).putInt(n3).hash();
    }

    public HashCode hashLong(long l2) {
        return this.newHasher(8).putLong(l2).hash();
    }

    public HashCode hashObject(Object object, Funnel funnel) {
        return this.newHasher().putObject(object, funnel).hash();
    }

    public HashCode hashString(CharSequence charSequence, Charset charset) {
        return this.newHasher().putString(charSequence, charset).hash();
    }

    public HashCode hashUnencodedChars(CharSequence charSequence) {
        int n3 = charSequence.length() * 2;
        return this.newHasher(n3).putUnencodedChars(charSequence).hash();
    }

    public Hasher newHasher(int n3) {
        boolean bl2 = n3 >= 0;
        Preconditions.checkArgument(bl2, "expectedInputSize must be >= 0 but was %s", n3);
        return this.newHasher();
    }
}

