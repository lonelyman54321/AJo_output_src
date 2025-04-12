/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.perf.util;

import com.google.firebase.perf.util.StorageUnit$1;
import com.google.firebase.perf.util.StorageUnit$2;
import com.google.firebase.perf.util.StorageUnit$3;
import com.google.firebase.perf.util.StorageUnit$4;
import com.google.firebase.perf.util.StorageUnit$5;

public abstract class StorageUnit
extends Enum {
    private static final /* synthetic */ StorageUnit[] $VALUES;
    public static final /* enum */ StorageUnit BYTES;
    public static final /* enum */ StorageUnit GIGABYTES;
    public static final /* enum */ StorageUnit KILOBYTES;
    public static final /* enum */ StorageUnit MEGABYTES;
    public static final /* enum */ StorageUnit TERABYTES;
    long numBytes;

    private static /* synthetic */ StorageUnit[] $values() {
        StorageUnit storageUnit = TERABYTES;
        storageUnit = GIGABYTES;
        storageUnit = MEGABYTES;
        storageUnit = KILOBYTES;
        storageUnit = BYTES;
        StorageUnit[] storageUnitArray = new StorageUnit[]{storageUnit, storageUnit, storageUnit, storageUnit, storageUnit};
        return storageUnitArray;
    }

    static {
        StorageUnit storageUnit = new StorageUnit$1(0x10000000000L);
        TERABYTES = storageUnit;
        storageUnit = new StorageUnit$2(0x40000000L);
        GIGABYTES = storageUnit;
        storageUnit = new StorageUnit$3(0x100000L);
        MEGABYTES = storageUnit;
        storageUnit = new StorageUnit$4(1024L);
        KILOBYTES = storageUnit;
        storageUnit = new StorageUnit$5(1L);
        BYTES = storageUnit;
        $VALUES = StorageUnit.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private StorageUnit() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.numBytes = var3_2;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ StorageUnit(long l2, StorageUnit$1 storageUnit$1) {
        this((String)var1_-1, (int)var2_1, (long)storageUnit$1);
        void var2_1;
        void var1_-1;
    }

    public static StorageUnit valueOf(String string2) {
        return Enum.valueOf(StorageUnit.class, string2);
    }

    public static StorageUnit[] values() {
        return (StorageUnit[])$VALUES.clone();
    }

    public abstract long convert(long var1, StorageUnit var3);

    public long toBytes(long l2) {
        long l3 = this.numBytes;
        return l2 * l3;
    }

    public long toGigabytes(long l2) {
        long l3 = this.numBytes;
        l2 *= l3;
        l3 = StorageUnit.GIGABYTES.numBytes;
        return l2 / l3;
    }

    public long toKilobytes(long l2) {
        long l3 = this.numBytes;
        l2 *= l3;
        l3 = StorageUnit.KILOBYTES.numBytes;
        return l2 / l3;
    }

    public long toMegabytes(long l2) {
        long l3 = this.numBytes;
        l2 *= l3;
        l3 = StorageUnit.MEGABYTES.numBytes;
        return l2 / l3;
    }

    public long toTerabytes(long l2) {
        long l3 = this.numBytes;
        l2 *= l3;
        l3 = StorageUnit.TERABYTES.numBytes;
        return l2 / l3;
    }
}

