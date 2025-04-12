/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public abstract class OneDReader
implements Reader {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private Result doDecode(BinaryBitmap var1_1, Map var2_2) {
        var3_3 = var2_2;
        var4_4 = var1_1.getWidth();
        var5_5 = var1_1.getHeight();
        var6_6 = new BitArray(var4_4);
        var7_7 = 0.0f;
        var8_8 = null;
        var9_9 = 1;
        if (var2_2 != null && (var11_11 = var2_2.containsKey((Object)(var10_10 = DecodeHintType.TRY_HARDER))) != 0) {
            var11_11 = 1;
        } else {
            var11_11 = 0;
            var10_10 = null;
        }
        var12_12 = var11_11 != 0 ? 8 : 5;
        var12_12 = var5_5 >> var12_12;
        var12_12 = Math.max(var9_9, var12_12);
        var11_11 = var11_11 != 0 ? var5_5 : 15;
        var13_13 = var5_5 / 2;
        var14_14 = 0;
        while (var14_14 < var11_11) {
            var15_15 = var14_14 + 1;
            var16_16 = var15_15 / 2;
            if ((var14_14 &= 1) != 0) {
                var16_16 = -var16_16;
            }
            var16_16 = var16_16 * var12_12 + var13_13;
            if (var16_16 < 0 || var16_16 >= var5_5) break;
            try {
                var6_6 = var1_1.getBlackRow(var16_16, var6_6);
            }
            catch (NotFoundException v4) {
                var19_19 /* !! */  = this;
                var30_30 = var4_4;
                var32_32 = 1;
            }
            for (var17_17 = 0; var17_17 < (var18_18 = 2); ++var17_17) {
                block32: {
                    if (var17_17 != var9_9) ** GOTO lbl-1000
                    var6_6.reverse();
                    if (var3_3 != null && (var20_20 = var3_3.containsKey(var19_19 /* !! */  = DecodeHintType.NEED_RESULT_POINT_CALLBACK))) {
                        var22_22 /* !! */  = DecodeHintType.class;
                        var21_21 = new EnumMap<K, V>(var22_22 /* !! */ );
                        var21_21.putAll(var3_3);
                        var21_21.remove(var19_19 /* !! */ );
                        var19_19 /* !! */  = this;
                        var3_3 = var21_21;
                    } else lbl-1000:
                    // 2 sources

                    {
                        var19_19 /* !! */  = this;
                    }
                    var21_21 = var19_19 /* !! */ .decodeRow(var16_16, var6_6, var3_3);
                    if (var17_17 != var9_9) break block32;
                    var22_22 /* !! */  = ResultMetadataType.ORIENTATION;
                    var23_23 = 180;
                    var24_24 = Integer.valueOf(var23_23);
                    var21_21.putMetadata(var22_22 /* !! */ , var24_24);
                    var24_24 = var21_21.getResultPoints();
                    if (var24_24 == null) break block32;
                    var25_25 = var3_3;
                    var26_26 = var4_4;
                    var27_27 = var24_24[0];
                    var28_28 = var27_27.getX();
                    var28_28 = var26_26 - var28_28;
                    var29_29 = 1.0f;
                    var30_30 = var4_4;
                    var31_31 = var28_28 - var29_29;
                    try {
                        var27_27 = var24_24[0];
                    }
                    catch (ReaderException v0) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var32_32 = 1;
                            break;
                        }
                    }
                    var7_7 = var27_27.getY();
                    var22_22 /* !! */  = new ResultPoint(var31_31, var7_7);
                    var4_4 = 0;
                    var31_31 = 0.0f;
                    var24_24[0] = var22_22 /* !! */ ;
                    var32_32 = 1;
                    var33_33 = var24_24[var32_32];
                    var34_34 = var33_33.getX();
                    var26_26 = var26_26 - var34_34 - var29_29;
                    var33_33 = var24_24[var32_32];
                    var31_31 = var33_33.getY();
                    var8_8 = new ResultPoint(var26_26, var31_31);
                    var24_24[var32_32] = var8_8;
                    break block32;
                    catch (ReaderException v1) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var30_30 = var4_4;
                            ** continue;
                            break;
                        }
                    }
                    catch (ReaderException v2) {
                        var25_25 = var3_3;
                        ** continue;
                    }
                }
                return var21_21;
                catch (ReaderException v3) {}
                var3_3 = var25_25;
                var4_4 = var30_30;
                var7_7 = 0.0f;
                var8_8 = null;
                var9_9 = 1;
            }
            var19_19 /* !! */  = this;
            var30_30 = var4_4;
            var32_32 = 1;
            var14_14 = var15_15;
            var4_4 = var30_30;
            var7_7 = 0.0f;
            var8_8 = null;
            var9_9 = 1;
        }
        var19_19 /* !! */  = this;
        throw NotFoundException.getNotFoundInstance();
    }

    public static float patternMatchVariance(int[] nArray, int[] nArray2, float f5) {
        int n3;
        int n4;
        int n7 = nArray.length;
        int n8 = 0;
        float f6 = 0.0f;
        int n10 = 0;
        float f7 = 0.0f;
        int n14 = 0;
        float f8 = 0.0f;
        for (n4 = 0; n4 < n7; ++n4) {
            n3 = nArray[n4];
            n10 += n3;
            n3 = nArray2[n4];
            n14 += n3;
        }
        n4 = 2139095040;
        f6 = 1.0f / 0.0f;
        if (n10 < n14) {
            return f6;
        }
        f7 = n10;
        f8 = n14;
        f8 = f7 / f8;
        f5 *= f8;
        n3 = 0;
        float f11 = 0.0f;
        while (n8 < n7) {
            int n15 = nArray[n8];
            float f12 = n15;
            int n16 = nArray2[n8];
            float f14 = (float)n16 * f8;
            float f15 = f12 - f14;
            Object object = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
            f12 = object > 0 ? (f12 -= f14) : f14 - f12;
            n16 = (int)(f12 == f5 ? 0 : (f12 > f5 ? 1 : -1));
            if (n16 > 0) {
                return f6;
            }
            f11 += f12;
            ++n8;
        }
        return f11 / f7;
    }

    public static void recordPattern(BitArray bitArray, int n3, int[] nArray) {
        int n4 = nArray.length;
        int n7 = 0;
        Arrays.fill(nArray, 0, n4, 0);
        int n8 = bitArray.getSize();
        if (n3 < n8) {
            int n10 = bitArray.get(n3);
            int n14 = 1;
            n10 ^= n14;
            while (n3 < n8) {
                int n15 = bitArray.get(n3);
                if (n15 != n10) {
                    nArray[n7] = n15 = nArray[n7] + n14;
                } else {
                    if (++n7 == n4) break;
                    nArray[n7] = n14;
                    n10 ^= true;
                }
                ++n3;
            }
            if (n7 != n4 && (n7 != (n4 -= n14) || n3 != n8)) {
                throw NotFoundException.getNotFoundInstance();
            }
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static void recordPatternInReverse(BitArray bitArray, int n3, int[] nArray) {
        int n4 = nArray.length;
        boolean bl2 = bitArray.get(n3);
        while (n3 > 0 && n4 >= 0) {
            boolean bl3 = bitArray.get(n3 += -1);
            if (bl3 == bl2) continue;
            n4 += -1;
            bl2 ^= true;
        }
        if (n4 < 0) {
            OneDReader.recordPattern(bitArray, ++n3, nArray);
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decode(BinaryBitmap binaryBitmap) {
        return this.decode(binaryBitmap, null);
    }

    public Result decode(BinaryBitmap binaryBitmap, Map object) {
        try {
            return this.doDecode(binaryBitmap, (Map)object);
        }
        catch (NotFoundException notFoundException) {
            Object object2;
            int n3;
            if (object != null && (n3 = object.containsKey(object2 = DecodeHintType.TRY_HARDER)) != 0 && (n3 = binaryBitmap.isRotateSupported()) != 0) {
                Object object3;
                boolean bl2;
                binaryBitmap = binaryBitmap.rotateCounterClockwise();
                object = this.doDecode(binaryBitmap, (Map)object);
                Object object4 = ((Result)object).getResultMetadata();
                n3 = 270;
                if (object4 != null && (bl2 = object4.containsKey(object3 = ResultMetadataType.ORIENTATION))) {
                    object4 = (Integer)object4.get(object3);
                    int n4 = (Integer)object4 + n3;
                    n3 = n4 % 360;
                }
                object4 = ResultMetadataType.ORIENTATION;
                object2 = n3;
                ((Result)object).putMetadata((ResultMetadataType)((Object)object4), object2);
                object4 = ((Result)object).getResultPoints();
                if (object4 != null) {
                    int n7;
                    int n8 = binaryBitmap.getHeight();
                    object2 = null;
                    for (n3 = 0; n3 < (n7 = ((Object)object4).length); ++n3) {
                        float f5 = n8;
                        float f6 = ((ResultPoint)object4[n3]).getY();
                        f5 = f5 - f6 - 1.0f;
                        Object object5 = object4[n3];
                        f6 = ((ResultPoint)object5).getX();
                        object3 = new ResultPoint(f5, f6);
                        object4[n3] = object3;
                    }
                }
                return object;
            }
            throw notFoundException;
        }
    }

    public abstract Result decodeRow(int var1, BitArray var2, Map var3);

    public void reset() {
    }
}

