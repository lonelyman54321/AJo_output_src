/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.AbstractHashFunction;
import com.google.common.hash.ChecksumHashFunction$ChecksumHasher;
import com.google.common.hash.Hasher;
import com.google.common.hash.ImmutableSupplier;
import java.io.Serializable;
import java.util.zip.Checksum;

final class ChecksumHashFunction
extends AbstractHashFunction
implements Serializable {
    private static final long serialVersionUID;
    private final int bits;
    private final ImmutableSupplier checksumSupplier;
    private final String toString;

    public ChecksumHashFunction(ImmutableSupplier object, int n3, String string2) {
        object = (ImmutableSupplier)Preconditions.checkNotNull(object);
        this.checksumSupplier = object;
        int n4 = 32;
        if (n3 != n4 && n3 != (n4 = 64)) {
            n4 = 0;
            object = null;
        } else {
            n4 = 1;
        }
        Preconditions.checkArgument(n4 != 0, "bits (%s) must be either 32 or 64", n3);
        this.bits = n3;
        this.toString = object = (String)Preconditions.checkNotNull(string2);
    }

    public static /* synthetic */ int access$100(ChecksumHashFunction checksumHashFunction) {
        return checksumHashFunction.bits;
    }

    public int bits() {
        return this.bits;
    }

    public Hasher newHasher() {
        Checksum checksum = (Checksum)this.checksumSupplier.get();
        ChecksumHashFunction$ChecksumHasher checksumHashFunction$ChecksumHasher = new ChecksumHashFunction$ChecksumHasher(this, checksum, null);
        return checksumHashFunction$ChecksumHasher;
    }

    public String toString() {
        return this.toString;
    }
}

