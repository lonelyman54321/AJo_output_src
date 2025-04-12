/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.security;

import java.util.Arrays;

public class Base64Codec {
    static final /* synthetic */ boolean $assertionsDisabled;

    public static int computeEncodedLength(int n3, boolean bl2) {
        if (n3 == 0) {
            return 0;
        }
        if (bl2) {
            int n4;
            int n7 = n3 / 3 << 2;
            if ((n3 %= 3) != 0) {
                n4 = n7 + n3 + 1;
            }
            return n4;
        }
        return (n3 + -1) / 3 + 1 << 2;
    }

    public static byte[] decode(String object) {
        int n3;
        if (object != null && (n3 = ((String)object).isEmpty()) == 0) {
            int n4;
            String string2 = "UTF-8";
            object = ((String)object).getBytes(string2);
            n3 = ((Object)object).length;
            int n7 = n3 * 6;
            int n8 = 3;
            byte[] byArray = new byte[n7 >>= n8];
            int n10 = 0;
            int n14 = 0;
            while (n10 < (n4 = ((Object)object).length)) {
                int n15;
                int n16;
                int n17;
                n4 = 0;
                int n18 = 0;
                while (n4 < (n17 = 4) && n10 < n3) {
                    n17 = n10 + 1;
                    if ((n10 = Base64Codec.decodeDigit((byte)object[n10])) >= 0) {
                        n16 = n4 * 6;
                        n16 = 18 - n16;
                        n18 |= (n10 <<= n16);
                        ++n4;
                    }
                    n10 = n17;
                }
                n16 = 2;
                if (n4 < n16) continue;
                n16 = n14 + 1;
                byArray[n14] = n15 = (int)(n18 >> 16);
                if (n4 >= n8) {
                    byte by2;
                    n15 = n14 + 2;
                    byArray[n16] = by2 = (byte)(n18 >> 8);
                    if (n4 >= n17) {
                        n14 += 3;
                        byArray[n15] = n4 = (int)((byte)n18);
                        continue;
                    }
                    n14 = n15;
                    continue;
                }
                n14 = n16;
            }
            return Arrays.copyOf(byArray, n14);
        }
        return new byte[0];
    }

    public static int decodeDigit(byte by2) {
        int n3 = Base64Codec.tpGT(by2, 64);
        int n4 = Base64Codec.tpLT(by2, 91);
        n3 &= n4;
        n4 = Base64Codec.tpGT(by2, 96);
        int n7 = Base64Codec.tpLT(by2, 123);
        n4 &= n7;
        n7 = 47;
        int n8 = Base64Codec.tpGT(by2, n7);
        int n10 = Base64Codec.tpLT(by2, 58);
        n8 &= n10;
        n10 = Base64Codec.tpEq(by2, 45);
        int n14 = Base64Codec.tpEq(by2, 43);
        n10 |= n14;
        n14 = Base64Codec.tpEq(by2, 95);
        n7 = Base64Codec.tpEq(by2, n7) | n14;
        n14 = n3 | n4 | n8 | n10 | n7;
        int n15 = by2 + -65;
        int n16 = by2 + -71;
        by2 = (byte)(by2 + 4);
        n3 = Base64Codec.tpSelect(n3, n15, 0);
        n4 = Base64Codec.tpSelect(n4, n16, 0);
        by2 = (byte)(Base64Codec.tpSelect(n8, by2, 0) | (n3 |= n4));
        n3 = Base64Codec.tpSelect(n10, 62, 0);
        by2 = (byte)(by2 | n3);
        n3 = Base64Codec.tpSelect(n7, 63, 0);
        by2 = (byte)(by2 | n3);
        n3 = Base64Codec.tpSelect(n14, 0, -1);
        return by2 | n3;
    }

    public static byte encodeDigitBase64(int n3) {
        int n4 = Base64Codec.tpLT(n3, 26);
        int n7 = Base64Codec.tpGT(n3, 25);
        int n8 = Base64Codec.tpLT(n3, 52);
        n7 &= n8;
        n8 = Base64Codec.tpGT(n3, 51);
        int n10 = 62;
        int n14 = Base64Codec.tpLT(n3, n10);
        n8 &= n14;
        n10 = Base64Codec.tpEq(n3, n10);
        n14 = Base64Codec.tpEq(n3, 63);
        int n15 = n3 + 65;
        int n16 = n3 + 71;
        n3 += -4;
        n4 = Base64Codec.tpSelect(n4, n15, 0);
        n7 = Base64Codec.tpSelect(n7, n16, 0);
        n3 = Base64Codec.tpSelect(n8, n3, 0) | (n4 |= n7);
        n4 = Base64Codec.tpSelect(n10, 43, 0);
        n3 |= n4;
        n4 = Base64Codec.tpSelect(n14, 47, 0);
        return (byte)(n3 | n4);
    }

    public static byte encodeDigitBase64URL(int n3) {
        int n4 = Base64Codec.tpLT(n3, 26);
        int n7 = Base64Codec.tpGT(n3, 25);
        int n8 = Base64Codec.tpLT(n3, 52);
        n7 &= n8;
        n8 = Base64Codec.tpGT(n3, 51);
        int n10 = 62;
        int n14 = Base64Codec.tpLT(n3, n10);
        n8 &= n14;
        n10 = Base64Codec.tpEq(n3, n10);
        n14 = Base64Codec.tpEq(n3, 63);
        int n15 = n3 + 65;
        int n16 = n3 + 71;
        n3 += -4;
        n4 = Base64Codec.tpSelect(n4, n15, 0);
        n7 = Base64Codec.tpSelect(n7, n16, 0);
        n3 = Base64Codec.tpSelect(n8, n3, 0) | (n4 |= n7);
        n4 = Base64Codec.tpSelect(n10, 45, 0);
        n3 |= n4;
        n4 = Base64Codec.tpSelect(n14, 95, 0);
        return (byte)(n3 | n4);
    }

    public static String encodeToString(byte[] object, boolean bl2) {
        int n3 = 0;
        int n4 = object != null ? ((Object)object).length : 0;
        if (n4 == 0) {
            return "";
        }
        int n7 = n4 / 3 * 3;
        int n8 = Base64Codec.computeEncodedLength(n4, bl2);
        byte[] byArray = new byte[n8];
        int n10 = 0;
        int n14 = 0;
        while (n10 < n7) {
            byte by2;
            int n15 = n10 + 1;
            int n16 = (object[n10] & 0xFF) << 16;
            int n17 = n10 + 2;
            n15 = (object[n15] & 0xFF) << 8 | n16;
            n10 += 3;
            n16 = object[n17] & 0xFF;
            n15 |= n16;
            if (bl2) {
                n16 = n14 + 1;
                byArray[n14] = n17 = (int)Base64Codec.encodeDigitBase64URL(n15 >>> 18 & 0x3F);
                n17 = n14 + 2;
                byArray[n16] = by2 = Base64Codec.encodeDigitBase64URL(n15 >>> 12 & 0x3F);
                n16 = n14 + 3;
                byArray[n17] = by2 = Base64Codec.encodeDigitBase64URL(n15 >>> 6 & 0x3F);
                n14 += 4;
                byArray[n16] = n15 = (int)Base64Codec.encodeDigitBase64URL(n15 & 0x3F);
                continue;
            }
            n16 = n14 + 1;
            byArray[n14] = n17 = (int)Base64Codec.encodeDigitBase64(n15 >>> 18 & 0x3F);
            n17 = n14 + 2;
            byArray[n16] = by2 = Base64Codec.encodeDigitBase64(n15 >>> 12 & 0x3F);
            n16 = n14 + 3;
            byArray[n17] = by2 = Base64Codec.encodeDigitBase64(n15 >>> 6 & 0x3F);
            n14 += 4;
            byArray[n16] = n15 = (int)Base64Codec.encodeDigitBase64(n15 & 0x3F);
        }
        n10 = n4 - n7;
        if (n10 > 0) {
            int n18;
            n7 = (object[n7] & 0xFF) << 10;
            n14 = 2;
            if (n10 == n14) {
                n18 = object[n4 += -1] & 0xFF;
                n3 = n18 << 2;
            }
            n18 = n7 | n3;
            if (bl2) {
                if (n10 == n14) {
                    int n19 = n8 + -3;
                    byArray[n19] = n3 = (int)Base64Codec.encodeDigitBase64URL(n18 >> 12);
                    int n20 = n8 + -2;
                    byArray[n20] = n3 = (int)Base64Codec.encodeDigitBase64URL(n18 >>> 6 & 0x3F);
                    byArray[n8 += -1] = n18 = (int)Base64Codec.encodeDigitBase64URL(n18 & 0x3F);
                } else {
                    int n21 = n8 + -2;
                    byArray[n21] = n3 = (int)Base64Codec.encodeDigitBase64URL(n18 >> 12);
                    byArray[n8 += -1] = n18 = (int)Base64Codec.encodeDigitBase64URL(n18 >>> 6 & 0x3F);
                }
            } else {
                int n22 = n8 + -4;
                byArray[n22] = n3 = (int)Base64Codec.encodeDigitBase64(n18 >> 12);
                int n24 = n8 + -3;
                byArray[n24] = n3 = (int)Base64Codec.encodeDigitBase64(n18 >>> 6 & 0x3F);
                int n25 = n8 + -2;
                n3 = 61;
                n18 = n10 == n14 ? (int)Base64Codec.encodeDigitBase64(n18 & 0x3F) : 61;
                byArray[n25] = n18;
                byArray[n8 += -1] = n3;
            }
        }
        object = new String(byArray, "UTF-8");
        return object;
    }

    public static int tpEq(int n3, int n4) {
        n3 ^= n4;
        n4 = n3 + -1;
        return (~n3 & n4) >>> 63;
    }

    public static int tpGT(int n3, int n4) {
        long l2 = n4;
        long l3 = n3;
        return (int)(l2 - l3 >>> 63);
    }

    public static int tpLT(int n3, int n4) {
        long l2 = n3;
        long l3 = n4;
        return (int)(l2 - l3 >>> 63);
    }

    public static int tpSelect(int n3, int n4, int n7) {
        return (n3 += -1) & (n7 ^= n4) ^ n4;
    }
}

