/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.OneDReader;
import java.util.Arrays;
import java.util.Map;

public final class Code39Reader
extends OneDReader {
    static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";
    static final int ASTERISK_ENCODING = 148;
    static final int[] CHARACTER_ENCODINGS;
    private final int[] counters;
    private final StringBuilder decodeRowResult;
    private final boolean extendedMode;
    private final boolean usingCheckDigit;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[43];
        int[] nArray3 = nArray;
        nArray2[0] = 52;
        nArray3[1] = 289;
        nArray2[2] = 97;
        nArray3[3] = 352;
        nArray2[4] = 49;
        nArray3[5] = 304;
        nArray2[6] = 112;
        nArray3[7] = 37;
        nArray2[8] = 292;
        nArray3[9] = 100;
        nArray2[10] = 265;
        nArray3[11] = 73;
        nArray2[12] = 328;
        nArray3[13] = 25;
        nArray2[14] = 280;
        nArray3[15] = 88;
        nArray2[16] = 13;
        nArray3[17] = 268;
        nArray2[18] = 76;
        nArray3[19] = 28;
        nArray2[20] = 259;
        nArray3[21] = 67;
        nArray2[22] = 322;
        nArray3[23] = 19;
        nArray2[24] = 274;
        nArray3[25] = 82;
        nArray2[26] = 7;
        nArray3[27] = 262;
        nArray2[28] = 70;
        nArray3[29] = 22;
        nArray2[30] = 385;
        nArray3[31] = 193;
        nArray2[32] = 448;
        nArray3[33] = 145;
        nArray2[34] = 400;
        nArray3[35] = 208;
        nArray2[36] = 133;
        nArray3[37] = 388;
        nArray2[38] = 196;
        nArray3[39] = 168;
        nArray2[40] = 162;
        nArray3[41] = 138;
        nArray3[42] = 42;
        CHARACTER_ENCODINGS = nArray;
    }

    public Code39Reader() {
        this(false);
    }

    public Code39Reader(boolean bl2) {
        this(bl2, false);
    }

    public Code39Reader(boolean bl2, boolean bl3) {
        this.usingCheckDigit = bl2;
        this.extendedMode = bl3;
        Object object = new StringBuilder(20);
        this.decodeRowResult = object;
        object = new int[9];
        this.counters = (int[])object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String decodeExtended(CharSequence charSequence) {
        int n3 = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(n3);
        int n4 = 0;
        while (true) {
            block13: {
                int n7;
                block11: {
                    int n8;
                    block10: {
                        int n10;
                        int n14;
                        block14: {
                            block23: {
                                block17: {
                                    block22: {
                                        block21: {
                                            int n15;
                                            block20: {
                                                block19: {
                                                    block15: {
                                                        block16: {
                                                            block18: {
                                                                int n16;
                                                                int n17;
                                                                int n18;
                                                                block12: {
                                                                    if (n4 >= n3) {
                                                                        return stringBuilder.toString();
                                                                    }
                                                                    n7 = charSequence.charAt(n4);
                                                                    n18 = 47;
                                                                    n17 = 37;
                                                                    n15 = 36;
                                                                    n16 = 43;
                                                                    if (n7 == n16 || n7 == n15 || n7 == n17 || n7 == n18) break block12;
                                                                    stringBuilder.append((char)n7);
                                                                    break block13;
                                                                }
                                                                n8 = charSequence.charAt(++n4);
                                                                n14 = 90;
                                                                n10 = 65;
                                                                if (n7 == n15) break block14;
                                                                n15 = 79;
                                                                if (n7 == n17) break block15;
                                                                if (n7 == n16) break block16;
                                                                if (n7 != n18) break block17;
                                                                if (n8 < n10 || n8 > n15) break block18;
                                                                n8 += -32;
                                                                break block10;
                                                            }
                                                            if (n8 != n14) {
                                                                throw FormatException.getFormatInstance();
                                                            }
                                                            n7 = 58;
                                                            break block11;
                                                        }
                                                        if (n8 >= n10 && n8 <= n14) {
                                                            n8 += 32;
                                                            break block10;
                                                        } else {
                                                            throw FormatException.getFormatInstance();
                                                        }
                                                    }
                                                    if (n8 < n10 || n8 > (n7 = 69)) break block19;
                                                    n8 += -38;
                                                    break block10;
                                                }
                                                n7 = 70;
                                                if (n8 < n7 || n8 > (n7 = 74)) break block20;
                                                n8 += -11;
                                                break block10;
                                            }
                                            n7 = 75;
                                            if (n8 < n7 || n8 > n15) break block21;
                                            n8 += 16;
                                            break block10;
                                        }
                                        n7 = 80;
                                        if (n8 < n7 || n8 > (n7 = 84)) break block22;
                                        n8 += 43;
                                        break block10;
                                    }
                                    n7 = 85;
                                    if (n8 != n7) break block23;
                                }
                                n7 = 0;
                                break block11;
                            }
                            n7 = 86;
                            if (n8 == n7) {
                                n7 = 64;
                                break block11;
                            } else {
                                n7 = 87;
                                if (n8 == n7) {
                                    n7 = 96;
                                    break block11;
                                } else {
                                    n7 = 88;
                                    if (n8 != n7 && n8 != (n7 = 89) && n8 != n14) {
                                        throw FormatException.getFormatInstance();
                                    }
                                    n7 = 127;
                                }
                            }
                            break block11;
                        }
                        if (n8 < n10 || n8 > n14) break;
                        n8 += -64;
                    }
                    n7 = (char)n8;
                }
                stringBuilder.append((char)n7);
            }
            ++n4;
        }
        throw FormatException.getFormatInstance();
    }

    private static int[] findAsteriskPattern(BitArray bitArray, int[] nArray) {
        int n3;
        int n4 = bitArray.getSize();
        int n7 = nArray.length;
        int n8 = n3;
        int n10 = 0;
        int n14 = 0;
        for (n3 = bitArray.getNextSet(0); n3 < n4; ++n3) {
            int n15 = bitArray.get(n3);
            int n16 = 1;
            if (n15 != n10) {
                nArray[n14] = n15 = nArray[n14] + n16;
                continue;
            }
            n15 = n7 + -1;
            if (n14 == n15) {
                n15 = Code39Reader.toNarrowWidePattern(nArray);
                int n17 = 148;
                int n18 = 2;
                if (n15 == n17) {
                    n15 = (n3 - n8) / n18;
                    n15 = n8 - n15;
                    n15 = Math.max(0, n15);
                    if ((n15 = (int)(bitArray.isRange(n15, n8, false) ? 1 : 0)) != 0) {
                        return new int[]{n8, n3};
                    }
                }
                n15 = nArray[0];
                n17 = nArray[n16];
                n8 += (n15 += n17);
                n15 = n14 + -1;
                System.arraycopy(nArray, n18, nArray, 0, n15);
                nArray[n15] = 0;
                nArray[n14] = 0;
                n14 += -1;
            } else {
                ++n14;
            }
            nArray[n14] = n16;
            n10 ^= 1;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static char patternToChar(int n3) {
        int[] nArray;
        int n4;
        int n7;
        for (n7 = 0; n7 < (n4 = (nArray = CHARACTER_ENCODINGS).length); ++n7) {
            int n8 = nArray[n7];
            if (n8 != n3) continue;
            return ALPHABET_STRING.charAt(n7);
        }
        n7 = 148;
        if (n3 == n7) {
            return '*';
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int toNarrowWidePattern(int[] nArray) {
        int n3 = nArray.length;
        int n4 = 0;
        int n7 = 0;
        while (true) {
            int n8;
            int n10;
            int n14;
            int n15 = nArray.length;
            int n16 = -1 >>> 1;
            for (n14 = 0; n14 < n15; ++n14) {
                n10 = nArray[n14];
                if (n10 >= n16 || n10 <= n7) continue;
                n16 = n10;
            }
            n15 = 0;
            n14 = 0;
            n10 = 0;
            for (n7 = 0; n7 < n3; ++n7) {
                n8 = nArray[n7];
                if (n8 <= n16) continue;
                int n17 = n3 + -1 - n7;
                int n18 = 1;
                n17 = n18 << n17;
                n14 |= n17;
                ++n15;
                n10 += n8;
            }
            n7 = 3;
            n8 = -1;
            if (n15 == n7) {
                while (n4 < n3 && n15 > 0) {
                    n7 = nArray[n4];
                    if (n7 > n16) {
                        n15 += -1;
                        if ((n7 <<= 1) >= n10) {
                            return n8;
                        }
                    }
                    ++n4;
                }
                return n14;
            }
            if (n15 <= n7) {
                return n8;
            }
            n7 = n16;
        }
    }

    public Result decodeRow(int n3, BitArray object, Map object2) {
        object2 = this.counters;
        Arrays.fill((int[])object2, 0);
        Object object3 = this.decodeRowResult;
        ((StringBuilder)object3).setLength(0);
        Object object4 = Code39Reader.findAsteriskPattern((BitArray)object, (int[])object2);
        int n4 = 1;
        int n7 = object4[n4];
        n7 = ((BitArray)object).getNextSet(n7);
        int n8 = ((BitArray)object).getSize();
        while (true) {
            int n10;
            OneDReader.recordPattern((BitArray)object, n7, (int[])object2);
            int n14 = Code39Reader.toNarrowWidePattern((int[])object2);
            if (n14 < 0) break;
            n14 = Code39Reader.patternToChar(n14);
            ((StringBuilder)object3).append((char)n14);
            int n15 = ((Object)object2).length;
            Object object5 = n7;
            for (n10 = 0; n10 < n15; n10 += n4) {
                Object object6 = object2[n10];
                object5 += object6;
            }
            n15 = ((BitArray)object).getNextSet((int)object5);
            n10 = 42;
            if (n14 == n10) {
                float f5;
                int n16;
                int n17 = ((StringBuilder)object3).length() - n4;
                ((StringBuilder)object3).setLength(n17);
                n17 = ((Object)object2).length;
                String string2 = null;
                n10 = 0;
                for (n14 = 0; n14 < n17; n14 += n4) {
                    object5 = object2[n14];
                    n10 += object5;
                }
                n17 = n15 - n7 - n10;
                if (n15 != n8 && (n17 <<= n4) < n10) {
                    throw NotFoundException.getNotFoundInstance();
                }
                n17 = (int)(this.usingCheckDigit ? 1 : 0);
                if (n17 != 0) {
                    n17 = ((StringBuilder)object3).length() - n4;
                    n16 = 0;
                    f5 = 0.0f;
                    object2 = null;
                    n8 = 0;
                    while (true) {
                        string2 = ALPHABET_STRING;
                        if (n16 >= n17) break;
                        StringBuilder stringBuilder = this.decodeRowResult;
                        n15 = stringBuilder.charAt(n16);
                        n14 = string2.indexOf(n15);
                        n8 += n14;
                        n16 += n4;
                    }
                    n16 = ((StringBuilder)object3).charAt(n17);
                    n8 %= 43;
                    if (n16 == (n8 = (int)string2.charAt(n8))) {
                        ((StringBuilder)object3).setLength(n17);
                    } else {
                        throw ChecksumException.getChecksumInstance();
                    }
                }
                if ((n17 = ((StringBuilder)object3).length()) != 0) {
                    n17 = (int)(this.extendedMode ? 1 : 0);
                    object = n17 != 0 ? Code39Reader.decodeExtended((CharSequence)object3) : ((StringBuilder)object3).toString();
                    n16 = object4[n4];
                    int n18 = object4[0];
                    f5 = n16 + n18;
                    float f6 = 2.0f;
                    float f7 = n7;
                    float f8 = (float)n10 / f6 + f7;
                    object4 = new ResultPoint;
                    float f11 = n3;
                    object4(f5 /= f6, f11);
                    object2 = new ResultPoint(f8, f11);
                    ResultPoint[] resultPointArray = new ResultPoint[2];
                    resultPointArray[0] = object4;
                    resultPointArray[n4] = object2;
                    object2 = BarcodeFormat.CODE_39;
                    object3 = new Result((String)object, null, resultPointArray, (BarcodeFormat)((Object)object2));
                    return object3;
                }
                throw NotFoundException.getNotFoundInstance();
            }
            n7 = n15;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

