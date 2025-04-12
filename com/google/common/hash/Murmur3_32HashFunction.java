/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.hash;

import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.hash.AbstractHashFunction;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import com.google.common.hash.Murmur3_32HashFunction$Murmur3_32Hasher;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.nio.charset.Charset;

final class Murmur3_32HashFunction
extends AbstractHashFunction
implements Serializable {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final int CHUNK_SIZE = 4;
    static final HashFunction GOOD_FAST_HASH_32;
    static final HashFunction MURMUR3_32;
    static final HashFunction MURMUR3_32_FIXED;
    private static final long serialVersionUID;
    private final int seed;
    private final boolean supplementaryPlaneFix;

    static {
        Murmur3_32HashFunction murmur3_32HashFunction = new Murmur3_32HashFunction(0, false);
        MURMUR3_32 = murmur3_32HashFunction;
        boolean bl2 = true;
        murmur3_32HashFunction = new Murmur3_32HashFunction(0, bl2);
        MURMUR3_32_FIXED = murmur3_32HashFunction;
        int n3 = Hashing.GOOD_FAST_HASH_SEED;
        murmur3_32HashFunction = new Murmur3_32HashFunction(n3, bl2);
        GOOD_FAST_HASH_32 = murmur3_32HashFunction;
    }

    public Murmur3_32HashFunction(int n3, boolean bl2) {
        this.seed = n3;
        this.supplementaryPlaneFix = bl2;
    }

    public static /* synthetic */ int access$000(int n3) {
        return Murmur3_32HashFunction.mixK1(n3);
    }

    public static /* synthetic */ int access$100(int n3, int n4) {
        return Murmur3_32HashFunction.mixH1(n3, n4);
    }

    public static /* synthetic */ int access$200(byte[] byArray, int n3) {
        return Murmur3_32HashFunction.getIntLittleEndian(byArray, n3);
    }

    public static /* synthetic */ long access$300(char c2) {
        return Murmur3_32HashFunction.charToTwoUtf8Bytes(c2);
    }

    public static /* synthetic */ long access$400(char c2) {
        return Murmur3_32HashFunction.charToThreeUtf8Bytes(c2);
    }

    public static /* synthetic */ long access$500(int n3) {
        return Murmur3_32HashFunction.codePointToFourUtf8Bytes(n3);
    }

    public static /* synthetic */ HashCode access$600(int n3, int n4) {
        return Murmur3_32HashFunction.fmix(n3, n4);
    }

    private static long charToThreeUtf8Bytes(char c2) {
        long l2 = (long)(c2 >>> 12) | 0xE0L;
        long l3 = (c2 >>> 6 & 0x3F | 0x80) << 8;
        l2 |= l3;
        l3 = (c2 & 0x3F | 0x80) << 16;
        return l2 | l3;
    }

    private static long charToTwoUtf8Bytes(char c2) {
        long l2 = (long)(c2 >>> 6) | 0xC0L;
        long l3 = (c2 & 0x3F | 0x80) << 8;
        return l2 | l3;
    }

    private static long codePointToFourUtf8Bytes(int n3) {
        long l2 = (long)(n3 >>> 18) | 0xF0L;
        long l3 = n3 >>> 12 & 0x3F;
        long l4 = 128L;
        l3 = (l3 | l4) << 8;
        l2 |= l3;
        l3 = ((long)(n3 >>> 6 & 0x3F) | l4) << 16;
        l2 |= l3;
        l3 = ((long)(n3 & 0x3F) | l4) << 24;
        return l2 | l3;
    }

    private static HashCode fmix(int n3, int n4) {
        n3 ^= n4;
        n4 = n3 >>> 16;
        n3 = (n3 ^ n4) * -2048144789;
        n4 = n3 >>> 13;
        n3 = (n3 ^ n4) * -1028477387;
        n4 = n3 >>> 16;
        return HashCode.fromInt(n3 ^ n4);
    }

    private static int getIntLittleEndian(byte[] byArray, int n3) {
        byte by2 = n3 + 3;
        by2 = byArray[by2];
        byte by4 = n3 + 2;
        by4 = byArray[by4];
        byte by5 = n3 + 1;
        by5 = byArray[by5];
        byte by6 = byArray[n3];
        return Ints.fromBytes(by2, by4, by5, by6);
    }

    private static int mixH1(int n3, int n4) {
        return Integer.rotateLeft(n3 ^ n4, 13) * 5 + -430675100;
    }

    private static int mixK1(int n3) {
        return Integer.rotateLeft(n3 * -862048943, 15) * 461845907;
    }

    public int bits() {
        return 32;
    }

    public boolean equals(Object object) {
        int n3 = object instanceof Murmur3_32HashFunction;
        boolean bl2 = false;
        if (n3 != 0) {
            int n4;
            object = (Murmur3_32HashFunction)object;
            n3 = this.seed;
            int n7 = ((Murmur3_32HashFunction)object).seed;
            if (n3 == n7 && (n3 = (int)(this.supplementaryPlaneFix ? 1 : 0)) == (n4 = ((Murmur3_32HashFunction)object).supplementaryPlaneFix)) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public HashCode hashBytes(byte[] byArray, int n3, int n4) {
        int n7;
        int n8 = n3 + n4;
        int n10 = byArray.length;
        Preconditions.checkPositionIndexes(n3, n8, n10);
        n8 = this.seed;
        n10 = 0;
        int n14 = 0;
        while ((n7 = n14 + 4) <= n4) {
            n14 += n3;
            n14 = Murmur3_32HashFunction.mixK1(Murmur3_32HashFunction.getIntLittleEndian(byArray, n14));
            n8 = Murmur3_32HashFunction.mixH1(n8, n14);
            n14 = n7;
        }
        n7 = n14;
        n14 = 0;
        while (n7 < n4) {
            int n15 = n3 + n7;
            n15 = UnsignedBytes.toInt(byArray[n15]) << n14;
            n10 ^= n15;
            ++n7;
            n14 += 8;
        }
        return Murmur3_32HashFunction.fmix(Murmur3_32HashFunction.mixK1(n10) ^ n8, n4);
    }

    public int hashCode() {
        int n3 = Murmur3_32HashFunction.class.hashCode();
        int n4 = this.seed;
        return n3 ^ n4;
    }

    public HashCode hashInt(int n3) {
        n3 = Murmur3_32HashFunction.mixK1(n3);
        return Murmur3_32HashFunction.fmix(Murmur3_32HashFunction.mixH1(this.seed, n3), 4);
    }

    public HashCode hashLong(long l2) {
        int n3 = (int)l2;
        int n4 = (int)(l2 >>> 32);
        int n7 = Murmur3_32HashFunction.mixK1(n3);
        n7 = Murmur3_32HashFunction.mixH1(this.seed, n7);
        n4 = Murmur3_32HashFunction.mixK1(n4);
        return Murmur3_32HashFunction.fmix(Murmur3_32HashFunction.mixH1(n7, n4), 8);
    }

    public HashCode hashString(CharSequence object, Charset charset) {
        Charset charset2 = Charsets.UTF_8;
        int n3 = charset2.equals(charset);
        if (n3 != 0) {
            int n4;
            int n7;
            int n8;
            n3 = object.length();
            int n10 = this.seed;
            int n14 = 0;
            int n15 = 0;
            int n16 = 0;
            while (true) {
                n8 = n15 + 4;
                n7 = 128;
                if (n8 > n3) break;
                int n17 = object.charAt(n15);
                int n18 = n15 + 1;
                n18 = object.charAt(n18);
                n4 = n15 + 2;
                n4 = object.charAt(n4);
                int n19 = n15 + 3;
                n19 = object.charAt(n19);
                if (n17 >= n7 || n18 >= n7 || n4 >= n7 || n19 >= n7) break;
                n15 = n18 << 8 | n17;
                n7 = n4 << 16;
                n15 |= n7;
                n7 = n19 << 24;
                n15 = Murmur3_32HashFunction.mixK1(n15 | n7);
                n10 = Murmur3_32HashFunction.mixH1(n10, n15);
                n16 += 4;
                n15 = n8;
            }
            long l2 = 0L;
            while (n15 < n3) {
                long l3;
                n8 = object.charAt(n15);
                if (n8 < n7) {
                    l3 = (long)n8 << n14;
                    l2 |= l3;
                    n14 += 8;
                    ++n16;
                } else {
                    n4 = 2048;
                    if (n8 < n4) {
                        l3 = Murmur3_32HashFunction.charToTwoUtf8Bytes((char)n8) << n14;
                        l2 |= l3;
                        n14 += 16;
                        n16 += 2;
                    } else {
                        n4 = 55296;
                        if (n8 >= n4 && n8 <= (n4 = 57343)) {
                            n4 = Character.codePointAt((CharSequence)object, n15);
                            if (n4 == n8) {
                                object = object.toString().getBytes(charset);
                                return this.hashBytes((byte[])object);
                            }
                            ++n15;
                            l3 = Murmur3_32HashFunction.codePointToFourUtf8Bytes(n4) << n14;
                            l2 |= l3;
                            n8 = (int)(this.supplementaryPlaneFix ? 1 : 0);
                            if (n8 != 0) {
                                n14 += 32;
                            }
                            n16 += 4;
                        } else {
                            l3 = Murmur3_32HashFunction.charToThreeUtf8Bytes((char)n8) << n14;
                            l2 |= l3;
                            n14 += 24;
                            n16 += 3;
                        }
                    }
                }
                n8 = 32;
                if (n14 >= n8) {
                    n4 = Murmur3_32HashFunction.mixK1((int)l2);
                    n10 = Murmur3_32HashFunction.mixH1(n10, n4);
                    l2 >>>= n8;
                    n14 += -32;
                }
                ++n15;
            }
            return Murmur3_32HashFunction.fmix(Murmur3_32HashFunction.mixK1((int)l2) ^ n10, n16);
        }
        object = object.toString().getBytes(charset);
        return this.hashBytes((byte[])object);
    }

    public HashCode hashUnencodedChars(CharSequence charSequence) {
        int n3;
        int n4;
        int n7 = this.seed;
        int n8 = 1;
        for (n4 = 1; n4 < (n3 = charSequence.length()); n4 += 2) {
            n3 = n4 + -1;
            n3 = charSequence.charAt(n3);
            int n10 = charSequence.charAt(n4) << 16;
            n3 = Murmur3_32HashFunction.mixK1(n3 | n10);
            n7 = Murmur3_32HashFunction.mixH1(n7, n3);
        }
        n4 = charSequence.length() & n8;
        if (n4 == n8) {
            n4 = charSequence.length() - n8;
            n8 = Murmur3_32HashFunction.mixK1(charSequence.charAt(n4));
            n7 ^= n8;
        }
        int n14 = charSequence.length() * 2;
        return Murmur3_32HashFunction.fmix(n7, n14);
    }

    public Hasher newHasher() {
        int n3 = this.seed;
        Murmur3_32HashFunction$Murmur3_32Hasher murmur3_32HashFunction$Murmur3_32Hasher = new Murmur3_32HashFunction$Murmur3_32Hasher(n3);
        return murmur3_32HashFunction$Murmur3_32Hasher;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Hashing.murmur3_32(");
        return g30.a(this.seed, ")", stringBuilder);
    }
}

