/*
 * Decompiled with CFR 0.152.
 */
package com.google.protobuf;

import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Java8Compatibility;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.Utf8;
import com.google.protobuf.Utf8$DecodeUtil;
import com.google.protobuf.Utf8$Processor;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

final class Utf8$UnsafeProcessor
extends Utf8$Processor {
    public static boolean isAvailable() {
        boolean bl2 = UnsafeUtil.hasUnsafeArrayOperations();
        bl2 = bl2 && (bl2 = UnsafeUtil.hasUnsafeByteBufferOperations());
        return bl2;
    }

    private static int partialIsValidUtf8(long l2, int n3) {
        int n4;
        int n7 = Utf8$UnsafeProcessor.unsafeEstimateConsecutiveAscii(l2, n3);
        long l3 = n7;
        l2 += l3;
        n3 -= n7;
        while (true) {
            long l4;
            int n8;
            block12: {
                long l7;
                n7 = 0;
                n8 = 0;
                while (true) {
                    l4 = 1L;
                    if (n3 <= 0) break block12;
                    l7 = l2 + l4;
                    n8 = UnsafeUtil.getByte(l2);
                    if (n8 < 0) break;
                    n3 += -1;
                    l2 = l7;
                }
                l2 = l7;
            }
            if (n3 == 0) {
                return 0;
            }
            n7 = n3 + -1;
            int n10 = -32;
            n4 = -1;
            byte by2 = -65;
            if (n8 < n10) {
                if (n7 == 0) {
                    return n8;
                }
                n3 += -2;
                n7 = -62;
                if (n8 >= n7) {
                    l4 += l2;
                    byte by4 = UnsafeUtil.getByte(l2);
                    if (by4 <= by2) {
                        l2 = l4;
                        continue;
                    }
                }
                return n4;
            }
            int n14 = -16;
            long l8 = 2;
            if (n8 < n14) {
                n14 = 2;
                if (n7 < n14) {
                    return Utf8$UnsafeProcessor.unsafeIncompleteStateFor(l2, n8, n7);
                }
                n3 += -3;
                l4 += l2;
                n7 = UnsafeUtil.getByte(l2);
                if (n7 <= by2) {
                    n14 = -96;
                    if (!(n8 == n10 && n7 < n14 || n8 == (n10 = -19) && n7 >= n14)) {
                        l2 += l8;
                        n7 = UnsafeUtil.getByte(l4);
                        if (n7 <= by2) continue;
                    }
                }
                return n4;
            }
            n10 = 3;
            if (n7 < n10) {
                return Utf8$UnsafeProcessor.unsafeIncompleteStateFor(l2, n8, n7);
            }
            n3 += -4;
            l4 += l2;
            n7 = UnsafeUtil.getByte(l2);
            if (n7 > by2 || (n7 = n7 + 112 + (n8 <<= 28) >> 30) != 0) break;
            l8 += l2;
            n7 = UnsafeUtil.getByte(l4);
            if (n7 > by2) break;
            long l12 = 3;
            l2 += l12;
            n7 = UnsafeUtil.getByte(l8);
            if (n7 > by2) break;
        }
        return n4;
    }

    private static int partialIsValidUtf8(byte[] byArray, long l2, int n3) {
        int n4;
        int n7 = Utf8$UnsafeProcessor.unsafeEstimateConsecutiveAscii(byArray, l2, n3);
        n3 -= n7;
        long l3 = n7;
        l2 += l3;
        while (true) {
            long l4;
            int n8;
            block12: {
                long l7;
                n7 = 0;
                n8 = 0;
                while (true) {
                    l4 = 1L;
                    if (n3 <= 0) break block12;
                    l7 = l2 + l4;
                    n8 = UnsafeUtil.getByte(byArray, l2);
                    if (n8 < 0) break;
                    n3 += -1;
                    l2 = l7;
                }
                l2 = l7;
            }
            if (n3 == 0) {
                return 0;
            }
            n7 = n3 + -1;
            int n10 = -32;
            n4 = -1;
            byte by2 = -65;
            if (n8 < n10) {
                if (n7 == 0) {
                    return n8;
                }
                n3 += -2;
                n7 = -62;
                if (n8 >= n7) {
                    l4 += l2;
                    byte by4 = UnsafeUtil.getByte(byArray, l2);
                    if (by4 <= by2) {
                        l2 = l4;
                        continue;
                    }
                }
                return n4;
            }
            int n14 = -16;
            long l8 = 2;
            if (n8 < n14) {
                n14 = 2;
                if (n7 < n14) {
                    return Utf8$UnsafeProcessor.unsafeIncompleteStateFor(byArray, n8, l2, n7);
                }
                n3 += -3;
                l4 += l2;
                n7 = UnsafeUtil.getByte(byArray, l2);
                if (n7 <= by2) {
                    n14 = -96;
                    if (!(n8 == n10 && n7 < n14 || n8 == (n10 = -19) && n7 >= n14)) {
                        l2 += l8;
                        n7 = UnsafeUtil.getByte(byArray, l4);
                        if (n7 <= by2) continue;
                    }
                }
                return n4;
            }
            n10 = 3;
            if (n7 < n10) {
                return Utf8$UnsafeProcessor.unsafeIncompleteStateFor(byArray, n8, l2, n7);
            }
            n3 += -4;
            l4 += l2;
            n7 = UnsafeUtil.getByte(byArray, l2);
            if (n7 > by2 || (n7 = n7 + 112 + (n8 <<= 28) >> 30) != 0) break;
            l8 += l2;
            n7 = UnsafeUtil.getByte(byArray, l4);
            if (n7 > by2) break;
            l3 = 3;
            l2 += l3;
            n7 = UnsafeUtil.getByte(byArray, l8);
            if (n7 > by2) break;
        }
        return n4;
    }

    private static int unsafeEstimateConsecutiveAscii(long l2, int n3) {
        long l3;
        long l4;
        long l7;
        long l8;
        int n4;
        int n7 = 16;
        if (n3 < n7) {
            return 0;
        }
        long l12 = -l2;
        long l14 = 7;
        for (n7 = n4 = (int)(l12 &= l14); n7 > 0; n7 += -1) {
            l14 = 1L + l2;
            byte by2 = UnsafeUtil.getByte(l2);
            if (by2 < 0) {
                return n4 - n7;
            }
            l2 = l14;
        }
        n7 = n3 - n4;
        while (n7 >= (n4 = 8) && (l8 = (l7 = (l4 = UnsafeUtil.getLong(l2) & 0x8080808080808080L) - (l3 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) == false) {
            l4 = 8;
            l2 += l4;
            n7 += -8;
        }
        return n3 - n7;
    }

    private static int unsafeEstimateConsecutiveAscii(byte[] byArray, long l2, int n3) {
        long l3;
        byte by2;
        long l4;
        int n4 = 16;
        int n7 = 0;
        if (n3 < n4) {
            return 0;
        }
        n4 = (int)l2 & 7;
        n4 = 8 - n4;
        while (true) {
            l4 = 1L;
            if (n7 >= n4) break;
            l4 += l2;
            by2 = UnsafeUtil.getByte(byArray, l2);
            if (by2 < 0) {
                return n7;
            }
            ++n7;
            l2 = l4;
        }
        while ((n4 = n7 + 8) <= n3) {
            long l7;
            l3 = UnsafeUtil.BYTE_ARRAY_BASE_OFFSET + l2;
            long l8 = (l3 = UnsafeUtil.getLong((Object)byArray, l3) & 0x8080808080808080L) - (l7 = 0L);
            Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object != false) break;
            l3 = 8;
            l2 += l3;
            n7 = n4;
        }
        while (n7 < n3) {
            l3 = l2 + l4;
            by2 = UnsafeUtil.getByte(byArray, l2);
            if (by2 < 0) {
                return n7;
            }
            ++n7;
            l2 = l3;
        }
        return n3;
    }

    private static int unsafeIncompleteStateFor(long l2, int n3, int n4) {
        if (n4 != 0) {
            int n7 = 1;
            if (n4 != n7) {
                n7 = 2;
                if (n4 == n7) {
                    n4 = UnsafeUtil.getByte(l2);
                    byte by2 = UnsafeUtil.getByte(l2 + 1L);
                    return Utf8.access$100(n3, n4, by2);
                }
                AssertionError assertionError = new AssertionError();
                throw assertionError;
            }
            byte by4 = UnsafeUtil.getByte(l2);
            return Utf8.access$000(n3, by4);
        }
        return Utf8.access$1200(n3);
    }

    private static int unsafeIncompleteStateFor(byte[] object, int n3, long l2, int n4) {
        if (n4 != 0) {
            int n7 = 1;
            if (n4 != n7) {
                n7 = 2;
                if (n4 == n7) {
                    n4 = UnsafeUtil.getByte(object, l2);
                    byte by2 = UnsafeUtil.getByte(object, ++l2);
                    return Utf8.access$100(n3, n4, by2);
                }
                object = new AssertionError;
                object();
                throw object;
            }
            byte by4 = UnsafeUtil.getByte(object, l2);
            return Utf8.access$000(n3, by4);
        }
        return Utf8.access$1200(n3);
    }

    public String decodeUtf8(byte[] byArray, int n3, int n4) {
        Object object = Internal.UTF_8;
        String string2 = new String(byArray, n3, n4, (Charset)object);
        String string3 = "\ufffd";
        boolean bl2 = string2.contains(string3);
        if (!bl2) {
            return string2;
        }
        boolean bl3 = Arrays.equals((byte[])(object = (Object)string2.getBytes((Charset)object)), byArray = Arrays.copyOfRange(byArray, n3, n4 += n3));
        if (bl3) {
            return string2;
        }
        throw InvalidProtocolBufferException.invalidUtf8();
    }

    public String decodeUtf8Direct(ByteBuffer byteBuffer, int n3, int n4) {
        int n7 = n4;
        int n8 = 2;
        int n10 = 1;
        int n14 = n3 | n4;
        int n15 = byteBuffer.limit() - n3 - n4;
        if ((n14 |= n15) >= 0) {
            int n16;
            Object object;
            long l2;
            long l3 = UnsafeUtil.addressOffset(byteBuffer);
            long l4 = n3;
            l3 += l4;
            l4 = (long)n4 + l3;
            char[] cArray = new char[n4];
            n7 = 0;
            Object var14_13 = null;
            while (true) {
                l2 = 1L;
                object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
                if (object >= 0 || (n16 = Utf8$DecodeUtil.access$400((byte)(object = (Object)UnsafeUtil.getByte(l3)))) == 0) break;
                l3 += l2;
                n16 = n7 + 1;
                Utf8$DecodeUtil.access$500((byte)object, cArray, n7);
                n7 = n16;
            }
            while ((object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1)) < 0) {
                long l7;
                long l8 = l3 + l2;
                int n17 = UnsafeUtil.getByte(l3);
                Object object2 = Utf8$DecodeUtil.access$400((byte)n17);
                if (object2 != 0) {
                    n14 = n7 + 1;
                    Utf8$DecodeUtil.access$500((byte)n17, cArray, n7);
                    while ((n7 = (int)(l8 == l4 ? 0 : (l8 < l4 ? -1 : 1))) < 0 && (n15 = (int)(Utf8$DecodeUtil.access$400((byte)(n7 = (int)UnsafeUtil.getByte(l8))) ? 1 : 0)) != 0) {
                        l8 += l2;
                        n15 = n14 + 1;
                        Utf8$DecodeUtil.access$500((byte)n7, cArray, n14);
                        n14 = n15;
                    }
                    n7 = n14;
                    l3 = l8;
                    continue;
                }
                object2 = Utf8$DecodeUtil.access$600((byte)n17);
                long l12 = 2;
                if (object2 != 0) {
                    object2 = l8 == l4 ? 0 : (l8 < l4 ? -1 : 1);
                    if (object2 < 0) {
                        l3 += l12;
                        object = UnsafeUtil.getByte(l8);
                        n16 = n7 + 1;
                        Utf8$DecodeUtil.access$700((byte)n17, (byte)object, cArray, n7);
                        n7 = n16;
                        continue;
                    }
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                object2 = Utf8$DecodeUtil.access$800((byte)n17);
                long l14 = 3;
                if (object2 != 0) {
                    l7 = l4 - l2;
                    long l15 = l8 - l7;
                    object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
                    if (object2 < 0) {
                        object = UnsafeUtil.getByte(l8);
                        n16 = UnsafeUtil.getByte(l12 += (l3 += l14));
                        object2 = n7 + 1;
                        Utf8$DecodeUtil.access$900((byte)n17, (byte)object, (byte)n16, cArray, n7);
                        n7 = object2;
                        continue;
                    }
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
                l7 = l4 - l12;
                long l16 = l8 - l7;
                object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                if (object2 < 0) {
                    n16 = UnsafeUtil.getByte(l8);
                    l14 = l3 + l14;
                    object2 = UnsafeUtil.getByte(l12 += l3);
                    l12 = 4;
                    l3 += l12;
                    byte by2 = UnsafeUtil.getByte(l14);
                    object = n17;
                    n17 = object2;
                    object2 = by2;
                    Utf8$DecodeUtil.access$1000((byte)object, (byte)n16, (byte)n17, by2, cArray, n7);
                    n7 += n8;
                    continue;
                }
                throw InvalidProtocolBufferException.invalidUtf8();
            }
            String string2 = new String(cArray, 0, n7);
            return string2;
        }
        Integer n18 = byteBuffer.limit();
        Object object = n3;
        Integer n19 = n4;
        Object[] objectArray = new Object[3];
        objectArray[0] = n18;
        objectArray[n10] = object;
        objectArray[n8] = n19;
        object = String.format("buffer limit=%d, index=%d, limit=%d", objectArray);
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException((String)object);
        throw arrayIndexOutOfBoundsException;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int encodeUtf8(CharSequence var1_1, byte[] var2_2, int var3_3, int var4_4) {
        block15: {
            var5_5 = var1_1;
            var6_6 = var2_2;
            var7_7 = var3_3;
            var8_8 = var4_4;
            var9_9 = var3_3;
            var11_10 = (long)var4_4 + var9_9;
            var13_11 = var1_1.length();
            var14_12 = " at index ";
            var15_13 = "Failed writing ";
            if (var13_11 > var4_4 || (var16_14 = var2_2.length - var4_4) < var3_3) break block15;
            var7_7 = 0;
            while (true) {
                var17_15 = 1L;
                var19_16 = 4.9E-324;
                var8_8 = 128;
                if (var7_7 >= var13_11 || (var21_17 = var5_5.charAt(var7_7)) >= var8_8) break;
                var8_8 = var21_17;
                UnsafeUtil.putByte((byte[])var6_6, var9_9, var8_8);
                ++var7_7;
                var9_9 = var17_15 += var9_9;
            }
            if (var7_7 == var13_11) {
                return (int)var9_9;
            }
            while (var7_7 < var13_11) {
                block20: {
                    block21: {
                        block17: {
                            block18: {
                                block19: {
                                    block14: {
                                        block16: {
                                            var21_17 = var5_5.charAt(var7_7);
                                            if (var21_17 >= var8_8 || (var22_18 = (byte)(var9_9 == var11_10 ? 0 : (var9_9 < var11_10 ? -1 : 1))) >= 0) break block16;
                                            var23_19 = var9_9 + var17_15;
                                            var21_17 = var21_17;
                                            UnsafeUtil.putByte((byte[])var6_6, var9_9, var21_17);
                                            var25_20 = var11_10;
                                            var27_21 = var15_13;
                                            var28_22 = var17_15;
                                            var30_23 = var19_16;
                                            var9_9 = var23_19;
                                            var32_24 = var14_12;
                                            break block14;
                                        }
                                        var22_18 = 2048;
                                        var33_25 = 2;
                                        if (var21_17 < var22_18 && (var22_18 = (byte)((cfr_temp_0 = var9_9 - (var35_26 = var11_10 - var33_25)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) <= 0) {
                                            var32_24 = var14_12;
                                            var27_21 = var15_13;
                                            var37_27 = var9_9 + var17_15;
                                            var16_14 = (byte)(var21_17 >>> 6 | 960);
                                            UnsafeUtil.putByte((byte[])var6_6, var9_9, var16_14);
                                            var9_9 += var33_25;
                                            var16_14 = (byte)(var21_17 & 63 | var8_8);
                                            UnsafeUtil.putByte((byte[])var6_6, var37_27, var16_14);
lbl49:
                                            // 2 sources

                                            while (true) {
                                                var25_20 = var11_10;
                                                var28_22 = 1L;
                                                var30_23 = 4.9E-324;
                                                break block14;
                                                break;
                                            }
                                        }
                                        var32_24 = var14_12;
                                        var27_21 = var15_13;
                                        var39_28 = 57343;
                                        var40_29 = 55296;
                                        var17_15 = 3;
                                        var19_16 = 1.5E-323;
                                        if ((var21_17 < var40_29 || var39_28 < var21_17) && (var43_31 = (cfr_temp_1 = var9_9 - (var41_30 = var11_10 - var17_15)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) <= 0) {
                                            var41_30 = 1L;
                                            var37_27 = var9_9 + var41_30;
                                            var16_14 = (byte)(var21_17 >>> 12 | 480);
                                            UnsafeUtil.putByte((byte[])var6_6, var9_9, var16_14);
                                            var17_15 = var9_9 + var33_25;
                                            var44_32 = (byte)(var21_17 >>> 6 & 63 | var8_8);
                                            UnsafeUtil.putByte((byte[])var6_6, var37_27, var44_32);
                                            var37_27 = 3;
                                            var9_9 += var37_27;
                                            var39_28 = (byte)(var21_17 & 63 | var8_8);
                                            UnsafeUtil.putByte((byte[])var6_6, var17_15, var39_28);
                                            ** continue;
                                        }
                                        var17_15 = 4;
                                        var19_16 = 2.0E-323;
                                        var28_22 = var11_10 - var17_15;
                                        cfr_temp_2 = var9_9 - var28_22;
                                        var45_33 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                        if (var45_33 /* !! */  > 0) break block17;
                                        var39_28 = var7_7 + 1;
                                        if (var39_28 == var13_11) break block18;
                                        var7_7 = (byte)var5_5.charAt(var39_28);
                                        var40_29 = (byte)Character.isSurrogatePair((char)var21_17, (char)var7_7);
                                        if (var40_29 == 0) break block19;
                                        var7_7 = Character.toCodePoint((char)var21_17, (char)var7_7);
                                        var28_22 = 1L;
                                        var30_23 = 4.9E-324;
                                        var17_15 = var9_9 + var28_22;
                                        var40_29 = (byte)(var7_7 >>> 18 | 240);
                                        UnsafeUtil.putByte((byte[])var6_6, var9_9, var40_29);
                                        var25_20 = var11_10;
                                        var11_10 = var9_9 + var33_25;
                                        var40_29 = (byte)(var7_7 >>> 12 & 63 | var8_8);
                                        UnsafeUtil.putByte((byte[])var6_6, var17_15, var40_29);
                                        var46_34 = 3;
                                        var17_15 = var9_9 + var46_34;
                                        var40_29 = (byte)(var7_7 >>> 6 & 63 | var8_8);
                                        UnsafeUtil.putByte((byte[])var6_6, var11_10, var40_29);
                                        var11_10 = 4;
                                        var9_9 += var11_10;
                                        var7_7 = (byte)(var7_7 & 63 | var8_8);
                                        UnsafeUtil.putByte((byte[])var6_6, var17_15, var7_7);
                                        var7_7 = var39_28;
                                    }
                                    ++var7_7;
                                    var14_12 = var32_24;
                                    var15_13 = var27_21;
                                    var17_15 = var28_22;
                                    var19_16 = var30_23;
                                    var11_10 = var25_20;
                                    continue;
                                }
                                var7_7 = var39_28;
                            }
                            var5_5 = new Utf8$UnpairedSurrogateException(var7_7 += -1, var13_11);
                            throw var5_5;
                        }
                        if (var40_29 > var21_17 || var21_17 > var39_28) break block20;
                        var48_35 = var7_7 + 1;
                        if (var48_35 == var13_11) break block21;
                        var49_36 = var5_5.charAt(var48_35);
                        if ((var49_36 = (char)Character.isSurrogatePair((char)var21_17, var49_36)) != '\u0000') break block20;
                    }
                    var5_5 = new Utf8$UnpairedSurrogateException(var7_7, var13_11);
                    throw var5_5;
                }
                var6_6 = new StringBuilder;
                var6_6(var27_21);
                var6_6.append((char)var21_17);
                var6_6.append(var32_24);
                var6_6.append(var9_9);
                var6_6 = var6_6.toString();
                var5_5 = new ArrayIndexOutOfBoundsException((String)var6_6);
                throw var5_5;
            }
            return (int)var9_9;
        }
        var6_6 = new ArrayIndexOutOfBoundsException;
        var50_38 = new StringBuilder(var15_13);
        var49_37 = var5_5.charAt(var13_11 += -1);
        var50_38.append((char)var49_37);
        var50_38.append(var14_12);
        var49_37 = var7_7 + var8_8;
        var50_38.append(var49_37);
        var5_5 = var50_38.toString();
        var6_6((String)var5_5);
        throw var6_6;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void encodeUtf8Direct(CharSequence var1_1, ByteBuffer var2_2) {
        block15: {
            var3_3 = var1_1;
            var4_4 = var2_2;
            var5_5 = UnsafeUtil.addressOffset(var2_2);
            var7_6 = var2_2.position();
            var8_7 = (long)var7_6 + var5_5;
            var10_8 = var2_2.limit();
            var11_9 = (long)var10_8 + var5_5;
            var13_10 = var1_1.length();
            var14_11 = var13_10;
            var16_12 = var11_9 - var8_7;
            var18_13 = " at index ";
            var19_14 = "Failed writing ";
            var20_15 /* !! */  = (long)(var14_11 == var16_12 ? 0 : (var14_11 < var16_12 ? -1 : 1));
            if (var20_15 /* !! */  > 0) break block15;
            var21_16 = 0;
            while (true) {
                var22_17 = 1L;
                var24_18 = 4.9E-324;
                var26_19 = 128;
                if (var21_16 >= var13_10 || (var20_15 /* !! */  = (long)var3_3.charAt(var21_16)) >= var26_19) break;
                var26_19 = (byte)var20_15 /* !! */ ;
                UnsafeUtil.putByte(var8_7, (byte)var26_19);
                ++var21_16;
                var8_7 = var22_17 += var8_7;
            }
            if (var21_16 == var13_10) {
                var27_20 = (int)(var8_7 - var5_5);
                Java8Compatibility.position((Buffer)var4_4, var27_20);
                return;
            }
            while (var21_16 < var13_10) {
                block20: {
                    block21: {
                        block17: {
                            block18: {
                                block19: {
                                    block14: {
                                        block16: {
                                            var20_15 /* !! */  = var3_3.charAt(var21_16);
                                            if (var20_15 /* !! */  < var26_19 && (var28_24 = var8_7 == var11_9 ? 0 : (var8_7 < var11_9 ? -1 : 1)) < 0) {
                                                var29_25 = var8_7 + var22_17;
                                                var20_15 /* !! */  = (byte)var20_15 /* !! */ ;
                                                UnsafeUtil.putByte(var8_7, (byte)var20_15 /* !! */ );
                                                var31_26 = var5_5;
                                                var33_27 = var11_9;
                                                var35_28 = var21_16;
                                                var36_29 = var22_17;
                                                var38_30 = var24_18;
                                                var8_7 = var29_25;
lbl42:
                                                // 2 sources

                                                while (true) {
                                                    var21_16 = 128;
                                                    break block14;
                                                    break;
                                                }
                                            }
                                            var26_19 = 2048;
                                            var40_31 = 2;
                                            if (var20_15 /* !! */  < var26_19 && (var26_19 = (int)((cfr_temp_0 = var8_7 - (var31_26 = var11_9 - var40_31)) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) <= 0) {
                                                var31_26 = var5_5;
                                                var42_32 = var8_7 + var22_17;
                                                var44_33 /* !! */  = (byte)(var20_15 /* !! */  >>> 6 | 960);
                                                UnsafeUtil.putByte(var8_7, (byte)var44_33 /* !! */ );
                                                var8_7 += var40_31;
                                                var44_33 /* !! */  = var20_15 /* !! */  & 63;
                                                var26_19 = 128;
                                                var44_33 /* !! */  = (byte)(var44_33 /* !! */  | var26_19);
                                                UnsafeUtil.putByte(var42_32, (byte)var44_33 /* !! */ );
                                                var33_27 = var11_9;
                                                var35_28 = var21_16;
                                                var36_29 = var22_17;
                                                var38_30 = var24_18;
                                                ** continue;
                                            }
                                            var31_26 = var5_5;
                                            var35_28 = 57343;
                                            var45_34 = 55296;
                                            var46_35 = 3;
                                            if (var20_15 /* !! */  >= var45_34 && var35_28 >= var20_15 /* !! */  || (var44_33 /* !! */  = (cfr_temp_1 = var8_7 - (var36_29 = var11_9 - var46_35)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) > 0) break block16;
                                            var42_32 = var8_7 + var22_17;
                                            var44_33 /* !! */  = (byte)(var20_15 /* !! */  >>> 12 | 480);
                                            UnsafeUtil.putByte(var8_7, (byte)var44_33 /* !! */ );
                                            var22_17 = var8_7 + var40_31;
                                            var44_33 /* !! */  = var20_15 /* !! */  >>> 6 & 63;
                                            var26_19 = 128;
                                            var44_33 /* !! */  = (byte)(var44_33 /* !! */  | var26_19);
                                            UnsafeUtil.putByte(var42_32, (byte)var44_33 /* !! */ );
                                            var8_7 += var46_35;
                                            var35_28 = (byte)(var20_15 /* !! */  & 63 | var26_19);
                                            UnsafeUtil.putByte(var22_17, (byte)var35_28);
                                            var33_27 = var11_9;
                                            var35_28 = var21_16;
                                            var21_16 = 128;
                                            var36_29 = 1L;
                                            var38_30 = 4.9E-324;
                                            break block14;
                                        }
                                        var22_17 = 4;
                                        var24_18 = 2.0E-323;
                                        var48_36 = var11_9 - var22_17;
                                        cfr_temp_2 = var8_7 - var48_36;
                                        var44_33 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                        if (var44_33 /* !! */  > 0) break block17;
                                        var35_28 = var21_16 + 1;
                                        if (var35_28 == var13_10) break block18;
                                        var45_34 = (byte)var3_3.charAt(var35_28);
                                        var44_33 /* !! */  = (long)Character.isSurrogatePair((char)var20_15 /* !! */ , (char)var45_34);
                                        if (var44_33 /* !! */  == false) break block19;
                                        var45_34 = Character.toCodePoint((char)var20_15 /* !! */ , (char)var45_34);
                                        var36_29 = 1L;
                                        var38_30 = 4.9E-324;
                                        var22_17 = var8_7 + var36_29;
                                        var44_33 /* !! */  = (byte)(var45_34 >>> 18 | 240);
                                        UnsafeUtil.putByte(var8_7, (byte)var44_33 /* !! */ );
                                        var33_27 = var11_9;
                                        var11_9 = var8_7 + var40_31;
                                        var44_33 /* !! */  = var45_34 >>> 12 & 63;
                                        var21_16 = 128;
                                        var44_33 /* !! */  = (byte)(var44_33 /* !! */  | var21_16);
                                        UnsafeUtil.putByte(var22_17, (byte)var44_33 /* !! */ );
                                        var22_17 = var8_7 + var46_35;
                                        var44_33 /* !! */  = (byte)(var45_34 >>> 6 & 63 | var21_16);
                                        UnsafeUtil.putByte(var11_9, (byte)var44_33 /* !! */ );
                                        var11_9 = 4;
                                        var8_7 += var11_9;
                                        var45_34 = (byte)(var45_34 & 63 | var21_16);
                                        UnsafeUtil.putByte(var22_17, var45_34);
                                    }
                                    var21_16 = ++var35_28;
                                    var5_5 = var31_26;
                                    var22_17 = var36_29;
                                    var24_18 = var38_30;
                                    var11_9 = var33_27;
                                    var26_19 = 128;
                                    var4_4 = var2_2;
                                    continue;
                                }
                                var21_16 = var35_28;
                            }
                            var3_3 = new Utf8$UnpairedSurrogateException(var21_16 += -1, var13_10);
                            throw var3_3;
                        }
                        if (var45_34 > var20_15 /* !! */  || var20_15 /* !! */  > var35_28) break block20;
                        var35_28 = var21_16 + 1;
                        if (var35_28 == var13_10) break block21;
                        var27_21 = var3_3.charAt(var35_28);
                        if ((var27_21 = (char)Character.isSurrogatePair((char)var20_15 /* !! */ , var27_21)) != '\u0000') break block20;
                    }
                    var3_3 = new Utf8$UnpairedSurrogateException(var21_16, var13_10);
                    throw var3_3;
                }
                var4_4 = new StringBuilder(var19_14);
                var4_4.append((char)var20_15 /* !! */ );
                var4_4.append(var18_13);
                var4_4.append(var8_7);
                var4_4 = var4_4.toString();
                var3_3 = new ArrayIndexOutOfBoundsException((String)var4_4);
                throw var3_3;
            }
            var31_26 = var5_5;
            var27_22 = (int)(var8_7 - var5_5);
            var4_4 = var2_2;
            Java8Compatibility.position(var2_2, var27_22);
            return;
        }
        var51_38 = new StringBuilder(var19_14);
        var27_23 = var1_1.charAt(var13_10 += -1);
        var51_38.append((char)var27_23);
        var51_38.append(var18_13);
        var27_23 = var2_2.limit();
        var51_38.append(var27_23);
        var3_3 = var51_38.toString();
        var50_37 = new ArrayIndexOutOfBoundsException((String)var3_3);
        throw var50_37;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public int partialIsValidUtf8(int n3, byte[] object, int n4, int n7) {
        void var4_6;
        void var3_5;
        int n8 = 0;
        int n10 = var3_5 | var4_6;
        int n14 = ((byte[])object).length - var4_6;
        if ((n10 |= n14) < 0) {
            Integer n15 = ((byte[])object).length;
            Integer n16 = (int)var3_5;
            Integer n17 = (int)var4_6;
            Object[] objectArray = new Object[]{n15, n16, n17};
            String string2 = String.format("Array length=%d, index=%d, limit=%d", objectArray);
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(string2);
            throw arrayIndexOutOfBoundsException;
        }
        long l2 = (long)var3_5;
        long l3 = (long)var4_6;
        if (n3 != 0) {
            Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object2 >= 0) {
                return n3;
            }
            int n18 = n3;
            int n19 = -32;
            int n20 = -1;
            int n21 = -65;
            long l4 = 1L;
            if (n18 < n19) {
                n3 = -62;
                if (n18 < n3) return n20;
                l4 += l2;
                n3 = UnsafeUtil.getByte(object, l2);
                if (n3 > n21) {
                    return n20;
                }
                l2 = l4;
            } else {
                long l7;
                int n22 = -16;
                if (n18 < n22) {
                    if ((n3 = (int)((byte)(~(n3 >> 8)))) == 0) {
                        long l8 = l2 + l4;
                        n3 = UnsafeUtil.getByte(object, l2);
                        n8 = (int)(l8 == l3 ? 0 : (l8 < l3 ? -1 : 1));
                        if (n8 >= 0) {
                            return Utf8.access$000(n18, n3);
                        }
                        l2 = l8;
                    }
                    if (n3 > n21) return n20;
                    n8 = -96;
                    if (n18 == n19) {
                        if (n3 < n8) return n20;
                    }
                    if (n18 == (n19 = -19)) {
                        if (n3 >= n8) return n20;
                    }
                    l7 = l2 + l4;
                    n3 = UnsafeUtil.getByte(object, l2);
                    if (n3 > n21) {
                        return n20;
                    }
                } else {
                    long l12;
                    n19 = (byte)(~(n3 >> 8));
                    if (n19 == 0) {
                        l12 = l2 + l4;
                        n19 = UnsafeUtil.getByte(object, l2);
                        n3 = (int)(l12 == l3 ? 0 : (l12 < l3 ? -1 : 1));
                        if (n3 >= 0) {
                            return Utf8.access$000(n18, n19);
                        }
                        l2 = l12;
                    } else {
                        n8 = (byte)(n3 >>= 16);
                    }
                    if (n8 == 0) {
                        l12 = l2 + l4;
                        n8 = UnsafeUtil.getByte(object, l2);
                        n3 = (int)(l12 == l3 ? 0 : (l12 < l3 ? -1 : 1));
                        if (n3 >= 0) {
                            return Utf8.access$100(n18, n19, n8);
                        }
                        l2 = l12;
                    }
                    if (n19 > n21) return n20;
                    n3 = n18 << 28;
                    if ((n3 = (n19 = n19 + 112 + n3) >> 30) != 0) return n20;
                    if (n8 > n21) return n20;
                    l7 = l2 + l4;
                    n3 = UnsafeUtil.getByte(object, l2);
                    if (n3 > n21) {
                        return n20;
                    }
                }
                l2 = l7;
            }
        }
        n3 = (int)(l3 - l2);
        return Utf8$UnsafeProcessor.partialIsValidUtf8(object, l2, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public int partialIsValidUtf8Direct(int n3, ByteBuffer object, int n4, int n7) {
        int n8 = 0;
        int n10 = n4 | n7;
        int n14 = ((Buffer)object).limit() - n7;
        if ((n10 |= n14) < 0) {
            object = ((Buffer)object).limit();
            Integer n15 = n4;
            Integer n16 = n7;
            Object[] objectArray = new Object[]{object, n15, n16};
            object = String.format("buffer limit=%d, index=%d, limit=%d", objectArray);
            ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException((String)object);
            throw arrayIndexOutOfBoundsException;
        }
        long l2 = UnsafeUtil.addressOffset((ByteBuffer)object);
        long l3 = n4;
        long l4 = (long)(n7 -= n4) + (l2 += l3);
        if (n3 != 0) {
            n7 = (int)(l2 == l4 ? 0 : (l2 < l4 ? -1 : 1));
            if (n7 >= 0) {
                return n3;
            }
            n7 = (byte)n3;
            int n17 = -32;
            int n18 = -1;
            int n19 = -65;
            long l7 = 1L;
            if (n7 < n17) {
                n3 = -62;
                if (n7 < n3) return n18;
                l7 += l2;
                n3 = UnsafeUtil.getByte(l2);
                if (n3 > n19) {
                    return n18;
                }
            } else {
                int n20 = -16;
                if (n7 < n20) {
                    if ((n3 = (int)((byte)(~(n3 >> 8)))) == 0) {
                        long l8 = l2 + l7;
                        n3 = UnsafeUtil.getByte(l2);
                        n8 = (int)(l8 == l4 ? 0 : (l8 < l4 ? -1 : 1));
                        if (n8 >= 0) {
                            return Utf8.access$000(n7, n3);
                        }
                        l2 = l8;
                    }
                    if (n3 > n19) return n18;
                    n8 = -96;
                    if (n7 == n17) {
                        if (n3 < n8) return n18;
                    }
                    if (n7 == (n17 = -19)) {
                        if (n3 >= n8) return n18;
                    }
                    l7 += l2;
                    n3 = UnsafeUtil.getByte(l2);
                    if (n3 > n19) {
                        return n18;
                    }
                } else {
                    long l12;
                    n17 = (byte)(~(n3 >> 8));
                    if (n17 == 0) {
                        l12 = l2 + l7;
                        n17 = UnsafeUtil.getByte(l2);
                        n3 = (int)(l12 == l4 ? 0 : (l12 < l4 ? -1 : 1));
                        if (n3 >= 0) {
                            return Utf8.access$000(n7, n17);
                        }
                        l2 = l12;
                    } else {
                        n8 = (byte)(n3 >>= 16);
                    }
                    if (n8 == 0) {
                        l12 = l2 + l7;
                        n8 = UnsafeUtil.getByte(l2);
                        n3 = (int)(l12 == l4 ? 0 : (l12 < l4 ? -1 : 1));
                        if (n3 >= 0) {
                            return Utf8.access$100(n7, n17, n8);
                        }
                        l2 = l12;
                    }
                    if (n17 > n19) return n18;
                    n3 = n7 << 28;
                    if ((n3 = (n17 = n17 + 112 + n3) >> 30) != 0) return n18;
                    if (n8 > n19) return n18;
                    l7 += l2;
                    n3 = UnsafeUtil.getByte(l2);
                    if (n3 > n19) {
                        return n18;
                    }
                }
            }
            l2 = l7;
        }
        n3 = (int)(l4 - l2);
        return Utf8$UnsafeProcessor.partialIsValidUtf8(l2, n3);
    }
}

