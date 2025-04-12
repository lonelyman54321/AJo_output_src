/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.OneDReader;
import java.util.Arrays;
import java.util.Map;

public final class CodaBarReader
extends OneDReader {
    static final char[] ALPHABET;
    private static final String ALPHABET_STRING = "0123456789-$:/.+ABCD";
    static final int[] CHARACTER_ENCODINGS;
    private static final float MAX_ACCEPTABLE = 2.0f;
    private static final int MIN_CHARACTER_LENGTH = 3;
    private static final float PADDING = 1.5f;
    private static final char[] STARTEND_ENCODING;
    private int counterLength;
    private int[] counters;
    private final StringBuilder decodeRowResult;

    static {
        Object[] objectArray;
        ALPHABET = ALPHABET_STRING.toCharArray();
        int[] nArray = objectArray = new int[20];
        int[] nArray2 = objectArray;
        nArray[0] = 3;
        nArray2[1] = 6;
        nArray[2] = 9;
        nArray2[3] = 96;
        nArray[4] = 18;
        nArray2[5] = 66;
        nArray[6] = 33;
        nArray2[7] = 36;
        nArray[8] = 48;
        nArray2[9] = 72;
        nArray[10] = 12;
        nArray2[11] = 24;
        nArray[12] = 69;
        nArray2[13] = 81;
        nArray[14] = 84;
        nArray2[15] = 21;
        nArray[16] = 26;
        nArray2[17] = 41;
        nArray[18] = 11;
        nArray2[19] = 14;
        CHARACTER_ENCODINGS = objectArray;
        Object[] objectArray2 = objectArray = (Object[])new char[4];
        Object[] objectArray3 = objectArray;
        objectArray2[0] = 65;
        objectArray3[1] = 66;
        objectArray2[2] = 67;
        objectArray3[3] = 68;
        STARTEND_ENCODING = (char[])objectArray;
    }

    public CodaBarReader() {
        Object object = new StringBuilder(20);
        this.decodeRowResult = object;
        object = new int[80];
        this.counters = (int[])object;
        this.counterLength = 0;
    }

    public static boolean arrayContains(char[] cArray, char c2) {
        if (cArray != null) {
            for (char c3 : cArray) {
                if (c3 != c2) continue;
                return true;
            }
        }
        return false;
    }

    private void counterAppend(int n3) {
        int[] nArray = this.counters;
        int n4 = this.counterLength;
        nArray[n4] = n3;
        this.counterLength = ++n4;
        n3 = nArray.length;
        if (n4 >= n3) {
            n3 = n4 << 1;
            int[] nArray2 = new int[n3];
            System.arraycopy(nArray, 0, nArray2, 0, n4);
            this.counters = nArray2;
        }
    }

    private int findStartPattern() {
        int n3;
        int n4 = 1;
        for (int i3 = 1; i3 < (n3 = this.counterLength); i3 += 2) {
            int n7;
            int n8;
            n3 = this.toNarrowWidePattern(i3);
            if (n3 == (n8 = -1)) continue;
            Object[] objectArray = STARTEND_ENCODING;
            Object[] objectArray2 = ALPHABET;
            n3 = objectArray2[n3];
            if ((n3 = (int)(CodaBarReader.arrayContains(objectArray, (char)n3) ? 1 : 0)) == 0) continue;
            n3 = 0;
            for (n8 = i3; n8 < (n7 = i3 + 7); ++n8) {
                objectArray2 = this.counters;
                n7 = objectArray2[n8];
                n3 += n7;
            }
            if (i3 != n4 && (n8 = (objectArray = (Object[])this.counters)[n7 = i3 + -1]) < (n3 /= 2)) continue;
            return i3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private void setCounters(BitArray bitArray) {
        int n3;
        int n4 = 0;
        this.counterLength = 0;
        int n7 = bitArray.getNextUnset(0);
        if (n7 < (n3 = bitArray.getSize())) {
            boolean bl2 = true;
            while (n7 < n3) {
                boolean bl3 = bitArray.get(n7);
                if (bl3 != bl2) {
                    ++n4;
                } else {
                    this.counterAppend(n4);
                    bl2 ^= true;
                    n4 = 1;
                }
                ++n7;
            }
            this.counterAppend(n4);
            return;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private int toNarrowWidePattern(int n3) {
        int[] nArray;
        int n4;
        int n7;
        int n8 = n3 + 7;
        int n10 = this.counterLength;
        int n14 = -1;
        if (n8 >= n10) {
            return n14;
        }
        int[] nArray2 = this.counters;
        int n15 = -1 >>> 1;
        int n16 = 0;
        int n17 = -1 >>> 1;
        int n18 = 0;
        for (n7 = n3; n7 < n8; n7 += 2) {
            n4 = nArray2[n7];
            if (n4 < n17) {
                n17 = n4;
            }
            if (n4 <= n18) continue;
            n18 = n4;
        }
        n17 = (n17 + n18) / 2;
        n18 = 0;
        for (n7 = n3 + 1; n7 < n8; n7 += 2) {
            n4 = nArray2[n7];
            if (n4 < n15) {
                n15 = n4;
            }
            if (n4 <= n18) continue;
            n18 = n4;
        }
        n15 = (n15 + n18) / 2;
        n8 = 128;
        n18 = 0;
        for (n7 = 0; n7 < (n4 = 7); ++n7) {
            n4 = n7 & 1;
            n4 = n4 == 0 ? n17 : n15;
            n8 >>= 1;
            int n19 = n3 + n7;
            if ((n19 = nArray2[n19]) <= n4) continue;
            n18 |= n8;
        }
        while (n16 < (n8 = (nArray = CHARACTER_ENCODINGS).length)) {
            n3 = nArray[n16];
            if (n3 == n18) {
                return n16;
            }
            ++n16;
        }
        return n14;
    }

    private void validatePattern(int n3) {
        float f5;
        Object object;
        int n4;
        int n7;
        float f6;
        int n8;
        int[] nArray;
        CodaBarReader codaBarReader = this;
        int n10 = 4;
        int[] nArray2 = new int[n10];
        int n14 = 0;
        float f7 = 0.0f;
        nArray2[0] = 0;
        int n15 = 1;
        nArray2[n15] = 0;
        int n16 = 2;
        nArray2[n16] = 0;
        int n17 = 3;
        nArray2[n17] = 0;
        Object object2 = new int[n10];
        object2[0] = 0;
        object2[n15] = 0;
        object2[n16] = 0;
        object2[n17] = 0;
        StringBuilder stringBuilder = this.decodeRowResult;
        n17 = stringBuilder.length() - n15;
        int n18 = n3;
        int n19 = 0;
        float[] fArray = null;
        while (true) {
            nArray = CHARACTER_ENCODINGS;
            StringBuilder stringBuilder2 = codaBarReader.decodeRowResult;
            int n20 = stringBuilder2.charAt(n19);
            n8 = nArray[n20];
            n20 = 6;
            f6 = 8.4E-45f;
            for (n7 = 6; n7 >= 0; n7 += -1) {
                n4 = n7 & 1;
                Object object3 = (n8 & 1) << n15;
                n4 += object3;
                object3 = nArray2[n4];
                int[] nArray3 = codaBarReader.counters;
                int n21 = n18 + n7;
                object = nArray3[n21];
                nArray2[n4] = object3 += object;
                object3 = object2[n4] + n15;
                object2[n4] = object3;
                n8 >>= n15;
            }
            if (n19 >= n17) break;
            n18 += 8;
            ++n19;
        }
        fArray = new float[n10];
        float[] fArray2 = new float[n10];
        float f8 = 0.0f;
        for (n18 = 0; n18 < n16; ++n18) {
            f5 = 0.0f;
            nArray = null;
            fArray2[n18] = 0.0f;
            n8 = n18 + 2;
            n7 = nArray2[n18];
            f6 = n7;
            float f11 = (float)object2[n18];
            n4 = nArray2[n8];
            float f12 = n4;
            object = object2[n8];
            f7 = object;
            f12 = f12 / f7 + (f6 /= f11);
            f7 = 2.0f;
            fArray2[n8] = f12 /= f7;
            fArray[n18] = f12;
            f6 = (float)n4 * f7 + 1.5f;
            f7 = object;
            fArray[n8] = f6 /= f7;
            n14 = 0;
            f7 = 0.0f;
        }
        int n22 = n3;
        n14 = 0;
        f7 = 0.0f;
        while (true) {
            int[] nArray4 = CHARACTER_ENCODINGS;
            object2 = codaBarReader.decodeRowResult;
            int n24 = ((StringBuilder)object2).charAt(n14);
            n16 = nArray4[n24];
            for (n24 = 6; n24 >= 0; n24 += -1) {
                float f14;
                n18 = n24 & 1;
                n8 = (n16 & 1) << n15;
                n18 += n8;
                nArray = codaBarReader.counters;
                n7 = n22 + n24;
                n8 = nArray[n7];
                f5 = n8;
                f6 = fArray2[n18];
                float f15 = f5 - f6;
                if ((n7 = (int)(f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1))) >= 0 && (n18 = (int)((f14 = f5 - (f8 = fArray[n18])) == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1))) <= 0) {
                    n16 >>= 1;
                    continue;
                }
                throw NotFoundException.getNotFoundInstance();
            }
            if (n14 >= n17) break;
            n22 += 8;
            ++n14;
        }
    }

    public Result decodeRow(int n3, BitArray object, Map object2) {
        Object object3;
        int n4;
        int n7 = 2;
        int n8 = 1;
        Arrays.fill(this.counters, 0);
        this.setCounters((BitArray)object);
        int n10 = this.findStartPattern();
        Object object4 = this.decodeRowResult;
        ((StringBuilder)object4).setLength(0);
        int n14 = n10;
        while ((n4 = this.toNarrowWidePattern(n14)) != (object3 = -1)) {
            int c2;
            block15: {
                Object object5;
                char[] cArray;
                int n15;
                Object object6;
                block14: {
                    block13: {
                        object6 = this.decodeRowResult;
                        n15 = n4;
                        ((StringBuilder)object6).append((char)n15);
                        c2 = n14 + 8;
                        Object object7 = this.decodeRowResult;
                        n15 = ((StringBuilder)object7).length();
                        if (n15 <= n8) break block13;
                        object7 = STARTEND_ENCODING;
                        cArray = ALPHABET;
                        n4 = cArray[n4];
                        if ((n4 = (int)(CodaBarReader.arrayContains((char[])object7, (char)n4) ? 1 : 0)) != 0) break block14;
                    }
                    if (c2 < (n4 = this.counterLength)) break block15;
                }
                Object object8 = this.counters;
                n4 = object8[n14 += 7];
                int n16 = 0;
                cArray = null;
                for (n15 = -8; n15 < object3; n15 += n8) {
                    int[] nArray = this.counters;
                    int n17 = c2 + n15;
                    int n18 = nArray[n17];
                    n16 += n18;
                }
                object3 = this.counterLength;
                if (c2 < object3 && n4 < (n16 /= n7)) {
                    throw NotFoundException.getNotFoundInstance();
                }
                this.validatePattern(n10);
                object8 = null;
                for (n4 = 0; n4 < (object3 = ((StringBuilder)(object5 = this.decodeRowResult)).length()); n4 += n8) {
                    object5 = this.decodeRowResult;
                    object6 = ALPHABET;
                    n15 = ((StringBuilder)object5).charAt(n4);
                    Object object9 = object6[n15];
                    ((StringBuilder)object5).setCharAt(n4, (char)object9);
                }
                object8 = this.decodeRowResult;
                n4 = object8.charAt(0);
                object5 = STARTEND_ENCODING;
                if ((n4 = (int)(CodaBarReader.arrayContains((char[])object5, (char)n4) ? 1 : 0)) != 0) {
                    object8 = this.decodeRowResult;
                    int n19 = object8.length() - n8;
                    n4 = object8.charAt(n19);
                    if ((n4 = (int)(CodaBarReader.arrayContains((char[])object5, (char)n4) ? 1 : 0)) != 0) {
                        object8 = this.decodeRowResult;
                        n4 = object8.length();
                        if (n4 > (object3 = 3)) {
                            int n20;
                            if (object2 == null || (n20 = object2.containsKey(object8 = DecodeHintType.RETURN_CODABAR_START_END)) == 0) {
                                object2 = this.decodeRowResult;
                                n4 = ((StringBuilder)object2).length() - n8;
                                ((StringBuilder)object2).deleteCharAt(n4);
                                object2 = this.decodeRowResult;
                                ((StringBuilder)object2).deleteCharAt(0);
                            }
                            float f5 = 0.0f;
                            object2 = null;
                            n4 = 0;
                            object8 = null;
                            for (n20 = 0; n20 < n10; n20 += n8) {
                                object5 = this.counters;
                                object3 = object5[n20];
                                n4 += object3;
                            }
                            f5 = n4;
                            while (n10 < n14) {
                                object5 = this.counters;
                                object3 = object5[n10];
                                n4 += object3;
                                n10 += n8;
                            }
                            float f6 = n4;
                            object8 = this.decodeRowResult.toString();
                            float f7 = n3;
                            object5 = new ResultPoint(f5, f7);
                            object2 = new ResultPoint(f6, f7);
                            ResultPoint[] resultPointArray = new ResultPoint[n7];
                            resultPointArray[0] = object5;
                            resultPointArray[n8] = object2;
                            object = BarcodeFormat.CODABAR;
                            object4 = new Result((String)object8, null, resultPointArray, (BarcodeFormat)((Object)object));
                            return object4;
                        }
                        throw NotFoundException.getNotFoundInstance();
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                throw NotFoundException.getNotFoundInstance();
            }
            n14 = c2;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

