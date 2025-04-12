/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.ChecksumHashFunction;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing$1;
import com.google.common.hash.Hashing$ChecksumType$1;
import com.google.common.hash.Hashing$ChecksumType$2;
import com.google.common.hash.ImmutableSupplier;

abstract class Hashing$ChecksumType
extends Enum
implements ImmutableSupplier {
    private static final /* synthetic */ Hashing$ChecksumType[] $VALUES;
    public static final /* enum */ Hashing$ChecksumType ADLER_32;
    public static final /* enum */ Hashing$ChecksumType CRC_32;
    public final HashFunction hashFunction;

    private static /* synthetic */ Hashing$ChecksumType[] $values() {
        Hashing$ChecksumType hashing$ChecksumType = CRC_32;
        hashing$ChecksumType = ADLER_32;
        Hashing$ChecksumType[] hashing$ChecksumTypeArray = new Hashing$ChecksumType[]{hashing$ChecksumType, hashing$ChecksumType};
        return hashing$ChecksumTypeArray;
    }

    static {
        Hashing$ChecksumType hashing$ChecksumType = new Hashing$ChecksumType$1("Hashing.crc32()");
        CRC_32 = hashing$ChecksumType;
        hashing$ChecksumType = new Hashing$ChecksumType$2("Hashing.adler32()");
        ADLER_32 = hashing$ChecksumType;
        $VALUES = Hashing$ChecksumType.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Hashing$ChecksumType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        ChecksumHashFunction checksumHashFunction = new ChecksumHashFunction(this, 32, (String)var3_2);
        this.hashFunction = checksumHashFunction;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ Hashing$ChecksumType(String string2, Hashing$1 hashing$1) {
        this((String)var1_-1, (int)hashing$1, (String)var3_2);
        void var3_2;
        void var1_-1;
    }

    public static Hashing$ChecksumType valueOf(String string2) {
        return Enum.valueOf(Hashing$ChecksumType.class, string2);
    }

    public static Hashing$ChecksumType[] values() {
        return (Hashing$ChecksumType[])$VALUES.clone();
    }
}

