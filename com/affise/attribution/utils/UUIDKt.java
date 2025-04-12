/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.utils;

import com.affise.attribution.utils.TimestampKt;
import java.util.Random;
import java.util.UUID;

public final class UUIDKt {
    private static final UUID generateType1UUID() {
        long l2 = UUIDKt.get64MostSignificantBitsForVersion1();
        long l3 = UUIDKt.get64LeastSignificantBitsForVersion1();
        UUID uUID = new UUID(l2, l3);
        return uUID;
    }

    public static final UUID generateUUID() {
        return UUIDKt.generateType1UUID();
    }

    private static final long get64LeastSignificantBitsForVersion1() {
        Random random = new Random();
        return random.nextLong() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
    }

    private static final long get64MostSignificantBitsForVersion1() {
        long l2 = TimestampKt.timestamp();
        long l3 = 0xFFFFFFFFL & l2;
        int n3 = 32;
        l3 <<= n3;
        long l4 = (l2 >> n3 & (long)((char)-1)) << 16;
        l2 = l2 >> 48 & 0xFFFL;
        l3 = l3 | l4 | 0x1000L;
        return l2 | l3;
    }
}

