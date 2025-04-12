/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.AbstractByteHasher;
import com.google.common.hash.ChecksumHashFunction;
import com.google.common.hash.ChecksumHashFunction$1;
import com.google.common.hash.HashCode;
import java.util.zip.Checksum;

final class ChecksumHashFunction$ChecksumHasher
extends AbstractByteHasher {
    private final Checksum checksum;
    final /* synthetic */ ChecksumHashFunction this$0;

    private ChecksumHashFunction$ChecksumHasher(ChecksumHashFunction object, Checksum checksum) {
        this.this$0 = object;
        this.checksum = object = (Checksum)Preconditions.checkNotNull(checksum);
    }

    public /* synthetic */ ChecksumHashFunction$ChecksumHasher(ChecksumHashFunction checksumHashFunction, Checksum checksum, ChecksumHashFunction$1 checksumHashFunction$1) {
        this(checksumHashFunction, checksum);
    }

    public HashCode hash() {
        int n3;
        Checksum checksum = this.checksum;
        long l2 = checksum.getValue();
        ChecksumHashFunction checksumHashFunction = this.this$0;
        int n4 = ChecksumHashFunction.access$100(checksumHashFunction);
        if (n4 == (n3 = 32)) {
            return HashCode.fromInt((int)l2);
        }
        return HashCode.fromLong(l2);
    }

    public void update(byte by2) {
        this.checksum.update(by2);
    }

    public void update(byte[] byArray, int n3, int n4) {
        this.checksum.update(byArray, n3, n4);
    }
}

