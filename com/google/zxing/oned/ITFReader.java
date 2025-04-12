/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.OneDReader;
import java.util.Map;

public final class ITFReader
extends OneDReader {
    private static final int[] DEFAULT_ALLOWED_LENGTHS;
    private static final int[][] END_PATTERN_REVERSED;
    private static final float MAX_AVG_VARIANCE = 0.38f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.5f;
    private static final int N = 1;
    private static final int[][] PATTERNS;
    private static final int[] START_PATTERN;
    private static final int W = 3;
    private static final int w = 2;
    private int narrowLineWidth = -1;

    static {
        int n3 = 12;
        int n4 = 14;
        int n7 = 6;
        int n8 = 8;
        int n10 = 10;
        DEFAULT_ALLOWED_LENGTHS = new int[]{n7, n8, n10, n3, n4};
        int n14 = 1;
        START_PATTERN = new int[]{n14, n14, n14, n14};
        int n15 = 2;
        int[][] nArrayArray = new int[n15][];
        int[] nArray = new int[]{n14, n14, n15};
        nArrayArray[0] = nArray;
        int n16 = 3;
        int[] nArray2 = new int[]{n14, n14, n16};
        nArrayArray[n14] = nArray2;
        END_PATTERN_REVERSED = nArrayArray;
        nArrayArray = new int[20][];
        nArray2 = new int[]{n14, n14, n15, n15, n14};
        nArrayArray[0] = nArray2;
        int[] nArray3 = new int[]{n15, n14, n14, n14, n15};
        nArrayArray[n14] = nArray3;
        nArray3 = new int[]{n14, n15, n14, n14, n15};
        nArrayArray[n15] = nArray3;
        nArray3 = new int[]{n15, n15, n14, n14, n14};
        nArrayArray[n16] = nArray3;
        nArray3 = new int[]{n14, n14, n15, n14, n15};
        nArrayArray[4] = nArray3;
        nArray3 = new int[]{n15, n14, n15, n14, n14};
        nArrayArray[5] = nArray3;
        nArray3 = new int[]{n14, n15, n15, n14, n14};
        nArrayArray[n7] = nArray3;
        int[] nArray4 = new int[]{n14, n14, n14, n15, n15};
        nArrayArray[7] = nArray4;
        nArray4 = new int[]{n15, n14, n14, n15, n14};
        nArrayArray[n8] = nArray4;
        nArray4 = new int[]{n14, n15, n14, n15, n14};
        nArrayArray[9] = nArray4;
        nArray4 = new int[]{n14, n14, n16, n16, n14};
        nArrayArray[n10] = nArray4;
        nArray4 = new int[]{n16, n14, n14, n14, n16};
        nArrayArray[11] = nArray4;
        nArray4 = new int[]{n14, n16, n14, n14, n16};
        nArrayArray[n3] = nArray4;
        int[] nArray5 = new int[]{n16, n16, n14, n14, n14};
        nArrayArray[13] = nArray5;
        nArray5 = new int[]{n14, n14, n16, n14, n16};
        nArrayArray[n4] = nArray5;
        nArray5 = new int[]{n16, n14, n16, n14, n14};
        nArrayArray[15] = nArray5;
        nArray5 = new int[]{n14, n16, n16, n14, n14};
        nArrayArray[16] = nArray5;
        nArray5 = new int[]{n14, n14, n14, n16, n16};
        nArrayArray[17] = nArray5;
        nArray5 = new int[]{n16, n14, n14, n16, n14};
        nArrayArray[18] = nArray5;
        nArray5 = new int[]{n14, n16, n14, n16, n14};
        nArrayArray[19] = nArray5;
        PATTERNS = nArrayArray;
    }

    private static int decodeDigit(int[] nArray) {
        int[][] nArray2 = PATTERNS;
        int n3 = nArray2.length;
        float f5 = 0.38f;
        int n4 = -1;
        for (int i3 = 0; i3 < n3; ++i3) {
            int[] nArray3 = PATTERNS[i3];
            float f6 = 0.5f;
            float f7 = OneDReader.patternMatchVariance(nArray, nArray3, f6);
            float f8 = f7 - f5;
            Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object < 0) {
                n4 = i3;
                f5 = f7;
                continue;
            }
            Object object2 = f7 == f5 ? 0 : (f7 > f5 ? 1 : -1);
            if (object2 != false) continue;
            n4 = -1;
        }
        if (n4 >= 0) {
            return n4 % 10;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private int[] decodeEnd(BitArray var1_1) {
        block7: {
            var1_1.reverse();
            var2_2 = ITFReader.skipWhiteSpace(var1_1);
            var3_3 = 1;
            var4_4 = 0;
            var5_5 /* !! */  = ITFReader.END_PATTERN_REVERSED;
            var5_5 /* !! */  = (int[][])var5_5 /* !! */ [0];
            var6_7 = ITFReader.findGuardPattern(var1_1, var2_2, (int[])var5_5 /* !! */ );
            ** GOTO lbl17
            {
                catch (Throwable var6_8) {
                    break block7;
                }
                catch (NotFoundException v0) {}
                {
                    var5_6 /* !! */  = ITFReader.END_PATTERN_REVERSED;
                    var5_6 /* !! */  = (int[][])var5_6 /* !! */ [var3_3];
                    var6_7 = ITFReader.findGuardPattern(var1_1, var2_2, (int[])var5_6 /* !! */ );
lbl17:
                    // 2 sources

                    var7_9 = var6_7[0];
                    this.validateQuietZone(var1_1, var7_9);
                    var7_9 = var6_7[0];
                    var8_10 = var1_1.getSize();
                    var9_11 = var6_7[var3_3];
                }
            }
            {
                var6_7[0] = var8_10 -= var9_11;
                var4_4 = var1_1.getSize() - var7_9;
            }
            {
                var6_7[var3_3] = var4_4;
                var1_1.reverse();
                return var6_7;
            }
        }
        var1_1.reverse();
        throw var6_8;
    }

    private static void decodeMiddle(BitArray bitArray, int n3, int n4, StringBuilder stringBuilder) {
        int n7 = 10;
        int[] nArray = new int[n7];
        int n8 = 5;
        int[] nArray2 = new int[n8];
        int[] nArray3 = new int[n8];
        while (n3 < n4) {
            int n10;
            OneDReader.recordPattern(bitArray, n3, nArray);
            int n14 = 0;
            for (n10 = 0; n10 < n8; ++n10) {
                int n15;
                int n16 = n10 * 2;
                nArray2[n10] = n15 = nArray[n16];
                ++n16;
                nArray3[n10] = n16 = nArray[n16];
            }
            n10 = (char)(ITFReader.decodeDigit(nArray2) + 48);
            stringBuilder.append((char)n10);
            n10 = (char)(ITFReader.decodeDigit(nArray3) + 48);
            stringBuilder.append((char)n10);
            while (n14 < n7) {
                n10 = nArray[n14];
                n3 += n10;
                ++n14;
            }
        }
    }

    private int[] decodeStart(BitArray bitArray) {
        int n3 = ITFReader.skipWhiteSpace(bitArray);
        int[] nArray = START_PATTERN;
        int[] nArray2 = ITFReader.findGuardPattern(bitArray, n3, nArray);
        int n4 = nArray2[1];
        int n7 = nArray2[0];
        this.narrowLineWidth = n4 = (n4 - n7) / 4;
        this.validateQuietZone(bitArray, n7);
        return nArray2;
    }

    private static int[] findGuardPattern(BitArray bitArray, int n3, int[] nArray) {
        int n4 = nArray.length;
        int[] nArray2 = new int[n4];
        int n7 = bitArray.getSize();
        int n8 = n3;
        int n10 = 0;
        int n14 = 0;
        while (n3 < n7) {
            int n15 = bitArray.get(n3);
            int n16 = 1;
            if (n15 != n10) {
                nArray2[n14] = n15 = nArray2[n14] + n16;
            } else {
                n15 = n4 + -1;
                if (n14 == n15) {
                    float f5 = OneDReader.patternMatchVariance(nArray2, nArray, 0.5f);
                    int n17 = 1052938076;
                    float f6 = 0.38f;
                    float f7 = f5 - f6;
                    n15 = (int)(f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1));
                    if (n15 < 0) {
                        return new int[]{n8, n3};
                    }
                    n15 = nArray2[0];
                    n17 = nArray2[n16];
                    n8 += (n15 += n17);
                    n15 = n14 + -1;
                    n17 = 2;
                    f6 = 2.8E-45f;
                    System.arraycopy(nArray2, n17, nArray2, 0, n15);
                    nArray2[n15] = 0;
                    nArray2[n14] = 0;
                    n14 += -1;
                } else {
                    ++n14;
                }
                nArray2[n14] = n16;
                n10 ^= 1;
            }
            ++n3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int skipWhiteSpace(BitArray bitArray) {
        int n3 = bitArray.getSize();
        int n4 = bitArray.getNextSet(0);
        if (n4 != n3) {
            return n4;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private void validateQuietZone(BitArray bitArray, int n3) {
        boolean bl2;
        int n4 = this.narrowLineWidth * 10;
        if (n4 >= n3) {
            n4 = n3;
        }
        n3 += -1;
        while (n4 > 0 && n3 >= 0 && !(bl2 = bitArray.get(n3))) {
            n4 += -1;
            n3 += -1;
        }
        if (n4 == 0) {
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decodeRow(int n3, BitArray object, Map object2) {
        Object object3;
        boolean bl2;
        Object object4;
        int n4;
        int n7;
        int[] nArray;
        Object object5;
        block7: {
            object5 = this.decodeStart((BitArray)object);
            nArray = this.decodeEnd((BitArray)object);
            StringBuilder stringBuilder = new StringBuilder(20);
            n7 = 1;
            n4 = object5[n7];
            int n8 = nArray[0];
            ITFReader.decodeMiddle((BitArray)object, n4, n8, stringBuilder);
            object = stringBuilder.toString();
            stringBuilder = null;
            if (object2 != null) {
                object4 = DecodeHintType.ALLOWED_LENGTHS;
                object2 = (int[])object2.get(object4);
            } else {
                bl2 = false;
                object2 = null;
            }
            if (object2 == null) {
                object2 = DEFAULT_ALLOWED_LENGTHS;
            }
            n4 = ((String)object).length();
            n8 = ((Object)object2).length;
            object3 = 0;
            for (int i3 = 0; i3 < n8; i3 += n7) {
                Object object6 = object2[i3];
                if (n4 == object6) {
                    bl2 = true;
                    break block7;
                }
                if (object6 <= object3) continue;
                object3 = object6;
            }
            bl2 = false;
            object2 = null;
        }
        if (!bl2 && n4 > object3) {
            bl2 = true;
        }
        if (bl2) {
            float f5 = object5[n7];
            float f6 = n3;
            object4 = new ResultPoint(f5, f6);
            object5 = new ResultPoint;
            float f7 = nArray[0];
            object5(f7, f6);
            ResultPoint[] resultPointArray = new ResultPoint[2];
            resultPointArray[0] = object4;
            resultPointArray[n7] = object5;
            object5 = (Object)BarcodeFormat.ITF;
            object2 = new Result((String)object, null, resultPointArray, (BarcodeFormat)((Object)object5));
            return object2;
        }
        throw FormatException.getFormatInstance();
    }
}

