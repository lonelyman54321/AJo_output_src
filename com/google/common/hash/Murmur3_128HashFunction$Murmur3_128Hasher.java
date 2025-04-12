/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.hash.AbstractStreamingHasher;
import com.google.common.hash.HashCode;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class Murmur3_128HashFunction$Murmur3_128Hasher
extends AbstractStreamingHasher {
    private static final long C1 = -8663945395140668459L;
    private static final long C2 = 5545529020109919103L;
    private static final int CHUNK_SIZE = 16;
    private long h1;
    private long h2;
    private int length;

    public Murmur3_128HashFunction$Murmur3_128Hasher(int n3) {
        super(16);
        long l2;
        this.h1 = l2 = (long)n3;
        this.h2 = l2;
        this.length = 0;
    }

    private void bmix64(long l2, long l3) {
        long l4 = this.h1;
        this.h1 = l2 = Murmur3_128HashFunction$Murmur3_128Hasher.mixK1(l2) ^ l4;
        l2 = Long.rotateLeft(l2, 27);
        l4 = this.h2;
        l2 += l4;
        long l7 = 5;
        this.h1 = l2 = l2 * l7 + 1390208809L;
        this.h2 = l2 = Murmur3_128HashFunction$Murmur3_128Hasher.mixK2(l3) ^ l4;
        l2 = Long.rotateLeft(l2, 31);
        l3 = this.h1;
        this.h2 = l2 = (l2 + l3) * l7 + 944331445L;
    }

    private static long fmix64(long l2) {
        int n3 = 33;
        long l3 = l2 >>> n3;
        l2 = (l2 ^ l3) * -49064778989728563L;
        l3 = l2 >>> n3;
        l2 = (l2 ^ l3) * -4265267296055464877L;
        long l4 = l2 >>> n3;
        return l2 ^ l4;
    }

    private static long mixK1(long l2) {
        return Long.rotateLeft(l2 * -8663945395140668459L, 31) * 5545529020109919103L;
    }

    private static long mixK2(long l2) {
        return Long.rotateLeft(l2 * 5545529020109919103L, 33) * -8663945395140668459L;
    }

    public HashCode makeHash() {
        long l2 = this.h1;
        int n3 = this.length;
        long l3 = n3;
        l2 ^= l3;
        l3 = this.h2;
        long l4 = n3;
        long l7 = l3 ^ l4;
        this.h1 = l2 += l7;
        this.h2 = l7 += l2;
        this.h1 = l2 = Murmur3_128HashFunction$Murmur3_128Hasher.fmix64(l2);
        l2 = Murmur3_128HashFunction$Murmur3_128Hasher.fmix64(this.h2);
        this.h1 = l7 = this.h1 + l2;
        this.h2 = l2 += l7;
        ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[16]);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        byteBuffer = byteBuffer.order(byteOrder);
        long l8 = this.h1;
        byteBuffer = byteBuffer.putLong(l8);
        l8 = this.h2;
        return HashCode.fromBytesNoCopy(byteBuffer.putLong(l8).array());
    }

    public void process(ByteBuffer byteBuffer) {
        int n3;
        long l2 = byteBuffer.getLong();
        long l3 = byteBuffer.getLong();
        this.bmix64(l2, l3);
        this.length = n3 = this.length + 16;
    }

    /*
     * Unable to fully structure code
     */
    public void processRemaining(ByteBuffer var1_1) {
        block17: {
            block18: {
                var2_2 = this.length;
                this.length = var3_3 = var1_1.remaining() + var2_2;
                var2_2 = var1_1.remaining();
                var3_3 = 16;
                var4_4 = 24;
                var5_5 = 32;
                var6_6 = 40;
                var7_7 = 48;
                var8_8 = 8;
                var9_9 = 0L;
                switch (var2_2) {
                    default: {
                        var1_1 = new AssertionError((Object)"Should never get here.");
                        throw var1_1;
                    }
                    case 15: {
                        var2_2 = UnsignedBytes.toInt(var1_1.get(14));
                        var9_9 = (long)var2_2 << var7_7;
                    }
                    case 14: {
                        var2_2 = UnsignedBytes.toInt(var1_1.get(13));
                        var11_10 = var2_2;
                        var13_12 = var11_10 << var6_6;
                        var9_9 ^= var13_12;
                    }
                    case 13: {
                        var2_2 = UnsignedBytes.toInt(var1_1.get(12));
                        var13_12 = var2_2;
                        var15_14 = var13_12 << var5_5;
                        var9_9 ^= var15_14;
                    }
                    case 12: {
                        var2_2 = UnsignedBytes.toInt(var1_1.get(11));
                        var15_14 = var2_2;
                        var17_16 = var15_14 << var4_4;
                        var9_9 ^= var17_16;
                    }
                    case 11: {
                        var2_2 = UnsignedBytes.toInt(var1_1.get(10));
                        var17_16 = var2_2;
                        var19_17 = var17_16 << var3_3;
                        var9_9 ^= var19_17;
                    }
                    case 10: {
                        var2_2 = UnsignedBytes.toInt(var1_1.get(9));
                        var19_17 = (long)var2_2 << var8_8;
                        var9_9 ^= var19_17;
                    }
                    case 9: {
                        var2_2 = UnsignedBytes.toInt(var1_1.get(var8_8));
                        var19_17 = var2_2;
                        var9_9 ^= var19_17;
                    }
                    case 8: {
                        var19_17 = var1_1.getLong();
                        break block17;
                    }
                    case 7: {
                        var2_2 = UnsignedBytes.toInt(var1_1.get(6));
                        var11_11 = (long)var2_2 << var7_7;
                        ** GOTO lbl55
                    }
                    case 6: {
                        var11_11 = var9_9;
lbl55:
                        // 2 sources

                        var2_2 = UnsignedBytes.toInt(var1_1.get(5));
                        var21_18 = var2_2;
                        var13_13 = var21_18 << var6_6 ^ var11_11;
                        ** GOTO lbl61
                    }
                    case 5: {
                        var13_13 = var9_9;
lbl61:
                        // 2 sources

                        var2_2 = UnsignedBytes.toInt(var1_1.get(4));
                        var11_11 = (long)var2_2 << var5_5;
                        var15_15 = var13_13 ^ var11_11;
                        ** GOTO lbl67
                    }
                    case 4: {
                        var15_15 = var9_9;
lbl67:
                        // 2 sources

                        var2_2 = UnsignedBytes.toInt(var1_1.get(3));
                        var11_11 = (long)var2_2 << var4_4;
                        var17_16 = var15_15 ^ var11_11;
                        ** GOTO lbl73
                    }
                    case 3: {
                        var17_16 = var9_9;
lbl73:
                        // 2 sources

                        var2_2 = UnsignedBytes.toInt(var1_1.get(2));
                        var13_13 = var2_2;
                        var19_17 = var13_13 << var3_3 ^ var17_16;
                        ** GOTO lbl79
                    }
                    case 2: {
                        var19_17 = var9_9;
lbl79:
                        // 2 sources

                        var4_4 = UnsignedBytes.toInt(var1_1.get(1));
                        var17_16 = (long)var4_4 << var8_8;
                        var19_17 ^= var17_16;
                        break block18;
                    }
                    case 1: 
                }
                var19_17 = var9_9;
            }
            var4_4 = 0;
            var23_19 = UnsignedBytes.toInt(var1_1.get(0));
            var17_16 = var23_19;
            var19_17 ^= var17_16;
        }
        var17_16 = this.h1;
        this.h1 = var19_17 = Murmur3_128HashFunction$Murmur3_128Hasher.mixK1(var19_17) ^ var17_16;
        var19_17 = this.h2;
        var17_16 = Murmur3_128HashFunction$Murmur3_128Hasher.mixK2(var9_9);
        this.h2 = var19_17 ^= var17_16;
    }
}

