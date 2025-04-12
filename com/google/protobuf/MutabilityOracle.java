/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.MutabilityOracle$1;

interface MutabilityOracle {
    public static final MutabilityOracle IMMUTABLE;

    static {
        MutabilityOracle$1 mutabilityOracle$1 = new MutabilityOracle$1();
        IMMUTABLE = mutabilityOracle$1;
    }

    public void ensureMutable();
}

