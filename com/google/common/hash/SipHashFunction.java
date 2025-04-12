/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.common.hash.AbstractHashFunction;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.common.hash.SipHashFunction$SipHasher;
import java.io.Serializable;

final class SipHashFunction
extends AbstractHashFunction
implements Serializable {
    static final HashFunction SIP_HASH_24;
    private static final long serialVersionUID;
    private final int c;
    private final int d;
    private final long k0;
    private final long k1;

    static {
        SipHashFunction sipHashFunction = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
        SIP_HASH_24 = sipHashFunction;
    }

    public SipHashFunction(int n3, int n4, long l2, long l3) {
        boolean bl2 = false;
        boolean bl3 = n3 > 0;
        String string2 = "The number of SipRound iterations (c=%s) during Compression must be positive.";
        Preconditions.checkArgument(bl3, string2, n3);
        if (n4 > 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2, "The number of SipRound iterations (d=%s) during Finalization must be positive.", n4);
        this.c = n3;
        this.d = n4;
        this.k0 = l2;
        this.k1 = l3;
    }

    public int bits() {
        return 64;
    }

    public boolean equals(Object object) {
        int n3 = object instanceof SipHashFunction;
        boolean bl2 = false;
        if (n3 != 0) {
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            object = (SipHashFunction)object;
            n3 = this.c;
            int n4 = ((SipHashFunction)object).c;
            if (n3 == n4 && (n3 = this.d) == (n4 = ((SipHashFunction)object).d) && (n3 = (int)((l8 = (l7 = this.k0) - (l4 = ((SipHashFunction)object).k0)) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0 && (l3 = (l2 = (l7 = this.k1) - (l4 = ((SipHashFunction)object).k1)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public int hashCode() {
        int n3 = SipHashFunction.class.hashCode();
        int n4 = this.c;
        n3 ^= n4;
        n4 = this.d;
        long l2 = n3 ^ n4;
        long l3 = this.k0;
        l2 ^= l3;
        l3 = this.k1;
        return (int)(l2 ^ l3);
    }

    public Hasher newHasher() {
        int n3 = this.c;
        int n4 = this.d;
        long l2 = this.k0;
        long l3 = this.k1;
        SipHashFunction$SipHasher sipHashFunction$SipHasher = new SipHashFunction$SipHasher(n3, n4, l2, l3);
        return sipHashFunction$SipHasher;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Hashing.sipHash");
        int n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append("");
        n3 = this.d;
        stringBuilder.append(n3);
        stringBuilder.append("(");
        long l2 = this.k0;
        stringBuilder.append(l2);
        stringBuilder.append(", ");
        l2 = this.k1;
        return jl0_0.b(stringBuilder, l2, ")");
    }
}

