/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.K;
import androidx.datastore.preferences.protobuf.K$a;
import androidx.datastore.preferences.protobuf.K$b;
import androidx.datastore.preferences.protobuf.K$d;

public final class K$e
extends K$b {
    public static int d(byte[] object, int n3, long l2, int n4) {
        if (n4 != 0) {
            int n7 = 1;
            if (n4 != n7) {
                n7 = 2;
                if (n4 == n7) {
                    n4 = nw3.f(object, l2);
                    byte by2 = nw3.f(object, ++l2);
                    return K.d(n3, n4, by2);
                }
                object = new AssertionError;
                object();
                throw object;
            }
            byte by4 = nw3.f(object, l2);
            return K.c(n3, by4);
        }
        object = K.a;
        int n8 = -12;
        if (n3 > n8) {
            n3 = -1;
        }
        return n3;
    }

    public final String a(byte[] object, int n3, int n4) {
        int n7 = 3;
        int n8 = 2;
        int n10 = 1;
        int n14 = n3 | n4;
        int n15 = ((byte[])object).length - n3 - n4;
        if ((n14 |= n15) >= 0) {
            long l2;
            char c2;
            int n16;
            n14 = n3 + n4;
            char[] cArray = new char[n4];
            n15 = 0;
            while (n3 < n14 && (n16 = K$a.b((byte)(c2 = nw3.f(object, l2 = (long)n3)))) != 0) {
                n3 += n10;
                n16 = n15 + 1;
                cArray[n15] = c2 = (char)c2;
                n15 = n16;
            }
            int n17 = n15;
            while (n3 < n14) {
                int n18;
                long l3;
                long l4;
                n15 = n3 + 1;
                l2 = n3;
                c2 = nw3.f(object, l2);
                n16 = K$a.b((byte)c2);
                if (n16 != 0) {
                    n3 = n17 + 1;
                    cArray[n17] = c2 = (char)c2;
                    while (n15 < n14 && (n16 = (int)(K$a.b((byte)(c2 = (char)nw3.f(object, l2 = (long)n15))) ? 1 : 0)) != 0) {
                        n15 += n10;
                        n16 = n3 + 1;
                        cArray[n3] = c2 = (char)c2;
                        n3 = n16;
                    }
                    n17 = n3;
                    n3 = n15;
                    continue;
                }
                n16 = -32;
                if (c2 < n16) {
                    if (n15 < n14) {
                        n3 += n8;
                        l4 = n15;
                        n15 = nw3.f(object, l4);
                        n16 = n17 + 1;
                        K$a.c((byte)c2, (byte)n15, cArray, n17);
                        n17 = n16;
                        continue;
                    }
                    throw InvalidProtocolBufferException.a();
                }
                n16 = -16;
                if (c2 < n16) {
                    n16 = n14 + -1;
                    if (n15 < n16) {
                        n16 = n3 + 2;
                        l3 = n15;
                        n15 = nw3.f(object, l3);
                        n3 += n7;
                        l4 = n16;
                        n16 = nw3.f(object, l4);
                        n18 = n17 + 1;
                        K$a.d((byte)c2, (byte)n15, (byte)n16, cArray, n17);
                        n17 = n18;
                        continue;
                    }
                    throw InvalidProtocolBufferException.a();
                }
                n16 = n14 + -2;
                if (n15 < n16) {
                    n16 = n3 + 2;
                    l3 = n15;
                    n18 = nw3.f(object, l3);
                    n15 = n3 + 3;
                    long l7 = n16;
                    n16 = nw3.f(object, l7);
                    n3 += 4;
                    l7 = n15;
                    byte by2 = nw3.f(object, l7);
                    n15 = c2;
                    c2 = (char)n18;
                    n18 = by2;
                    K$a.a((byte)n15, (byte)c2, (byte)n16, by2, cArray, n17);
                    n17 += n8;
                    continue;
                }
                throw InvalidProtocolBufferException.a();
            }
            object = new String;
            object(cArray, 0, n17);
            return object;
        }
        object = ((byte[])object).length;
        Integer n19 = n3;
        Integer n20 = n4;
        Object[] objectArray = new Object[n7];
        objectArray[0] = object;
        objectArray[n10] = n19;
        objectArray[n8] = n20;
        object = String.format("buffer length=%d, index=%d, size=%d", objectArray);
        ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException((String)object);
        throw arrayIndexOutOfBoundsException;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int b(CharSequence var1_1, byte[] var2_2, int var3_3, int var4_4) {
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
                nw3.m((byte[])var6_6, var9_9, var8_8);
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
                                            nw3.m((byte[])var6_6, var9_9, var21_17);
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
                                            nw3.m((byte[])var6_6, var9_9, var16_14);
                                            var9_9 += var33_25;
                                            var16_14 = (byte)(var21_17 & 63 | var8_8);
                                            nw3.m((byte[])var6_6, var37_27, var16_14);
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
                                            nw3.m((byte[])var6_6, var9_9, var16_14);
                                            var17_15 = var9_9 + var33_25;
                                            var44_32 = (byte)(var21_17 >>> 6 & 63 | var8_8);
                                            nw3.m((byte[])var6_6, var37_27, var44_32);
                                            var37_27 = 3;
                                            var9_9 += var37_27;
                                            var39_28 = (byte)(var21_17 & 63 | var8_8);
                                            nw3.m((byte[])var6_6, var17_15, var39_28);
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
                                        nw3.m((byte[])var6_6, var9_9, var40_29);
                                        var25_20 = var11_10;
                                        var11_10 = var9_9 + var33_25;
                                        var40_29 = (byte)(var7_7 >>> 12 & 63 | var8_8);
                                        nw3.m((byte[])var6_6, var17_15, var40_29);
                                        var46_34 = 3;
                                        var17_15 = var9_9 + var46_34;
                                        var40_29 = (byte)(var7_7 >>> 6 & 63 | var8_8);
                                        nw3.m((byte[])var6_6, var11_10, var40_29);
                                        var11_10 = 4;
                                        var9_9 += var11_10;
                                        var7_7 = (byte)(var7_7 & 63 | var8_8);
                                        nw3.m((byte[])var6_6, var17_15, var7_7);
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
                            var5_5 = new K$d(var7_7 += -1, var13_11);
                            throw var5_5;
                        }
                        if (var40_29 > var21_17 || var21_17 > var39_28) break block20;
                        var48_35 = var7_7 + 1;
                        if (var48_35 == var13_11) break block21;
                        var49_36 = var5_5.charAt(var48_35);
                        if ((var49_36 = (char)Character.isSurrogatePair((char)var21_17, var49_36)) != '\u0000') break block20;
                    }
                    var5_5 = new K$d(var7_7, var13_11);
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
     * Enabled aggressive block sorting
     */
    public final int c(byte[] byArray, int n3, int n4) {
        int n7;
        long l2;
        long l3;
        Object var20_19;
        long l4;
        long l7;
        int n8;
        int n10;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        byte[] byArray2;
        block23: {
            byArray2 = byArray;
            n18 = n3;
            n17 = n4;
            n16 = 3;
            n15 = 2;
            n14 = 1;
            n10 = 0;
            n8 = -1;
            int n19 = n3 | n4;
            int n20 = byArray.length - n4;
            if ((n19 |= n20) < 0) {
                Integer n21 = byArray.length;
                Integer n22 = n3;
                Integer n24 = n4;
                Object[] objectArray = new Object[n16];
                objectArray[0] = n21;
                objectArray[n14] = n22;
                objectArray[2] = n24;
                String string2 = String.format("Array length=%d, index=%d, limit=%d", objectArray);
                ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException = new ArrayIndexOutOfBoundsException(string2);
                throw arrayIndexOutOfBoundsException;
            }
            l7 = n3;
            long l8 = (long)n4 - l7;
            n17 = (int)l8;
            n18 = 16;
            l4 = 1L;
            if (n17 < n18) {
                n18 = 0;
                var20_19 = null;
            } else {
                l3 = l7;
                var20_19 = null;
                for (n18 = 0; n18 < n17; n18 += n14) {
                    l2 = l3 + l4;
                    n7 = nw3.f(byArray2, l3);
                    if (n7 >= 0) {
                        l3 = l2;
                        continue;
                    }
                    break block23;
                }
                n18 = n17;
            }
        }
        n17 -= n18;
        l3 = n18;
        l7 += l3;
        while (true) {
            n18 = 0;
            var20_19 = null;
            while (n17 > 0) {
                l3 = l7 + l4;
                n18 = nw3.f(byArray2, l7);
                if (n18 >= 0) {
                    n17 += n8;
                    l7 = l3;
                    continue;
                }
                l7 = l3;
                break;
            }
            if (n17 == 0) {
                return n10;
            }
            n14 = n17 + -1;
            n7 = -32;
            int n25 = -65;
            if (n18 < n7) {
                if (n14 == 0) {
                    return n18;
                }
                n17 += -2;
                n14 = -62;
                if (n18 < n14) return -1;
                l2 = l7 + l4;
                n18 = nw3.f(byArray2, l7);
                if (n18 > n25) return -1;
                l7 = l2;
            } else {
                long l12;
                int n26 = -16;
                long l14 = 2;
                if (n18 < n26) {
                    if (n14 < n15) {
                        return K$e.d(byArray2, n18, l7, n14);
                    }
                    n17 += -3;
                    l12 = l7 + l4;
                    n8 = nw3.f(byArray2, l7);
                    if (n8 > n25) return -1;
                    n26 = -96;
                    if (n18 == n7) {
                        if (n8 < n26) return -1;
                    }
                    if (n18 == (n7 = -19)) {
                        if (n8 >= n26) return -1;
                    }
                    l7 += l14;
                    n18 = nw3.f(byArray2, l12);
                    if (n18 > n25) {
                        return -1;
                    }
                } else {
                    if (n14 < n16) {
                        return K$e.d(byArray2, n18, l7, n14);
                    }
                    n17 += -4;
                    l12 = l7 + l4;
                    n8 = nw3.f(byArray2, l7);
                    if (n8 > n25) return -1;
                    n18 <<= 28;
                    if ((n18 = (n8 = n8 + 112 + n18) >> 30) != 0) return -1;
                    l2 = l7 + l14;
                    n18 = nw3.f(byArray2, l12);
                    if (n18 > n25) return -1;
                    l12 = 3;
                    l7 += l12;
                    n18 = nw3.f(byArray2, l2);
                    if (n18 > n25) {
                        return -1;
                    }
                }
            }
            n15 = 2;
            n8 = -1;
        }
    }
}

