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

public final class Code93Reader
extends OneDReader {
    private static final char[] ALPHABET;
    static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
    private static final int ASTERISK_ENCODING;
    static final int[] CHARACTER_ENCODINGS;
    private final int[] counters;
    private final StringBuilder decodeRowResult;

    static {
        int[] nArray;
        ALPHABET = ALPHABET_STRING.toCharArray();
        int[] nArray2 = nArray = new int[48];
        int[] nArray3 = nArray;
        nArray2[0] = 276;
        nArray3[1] = 328;
        nArray2[2] = 324;
        nArray3[3] = 322;
        nArray2[4] = 296;
        nArray3[5] = 292;
        nArray2[6] = 290;
        nArray3[7] = 336;
        nArray2[8] = 274;
        nArray3[9] = 266;
        nArray2[10] = 424;
        nArray3[11] = 420;
        nArray2[12] = 418;
        nArray3[13] = 404;
        nArray2[14] = 402;
        nArray3[15] = 394;
        nArray2[16] = 360;
        nArray3[17] = 356;
        nArray2[18] = 354;
        nArray3[19] = 308;
        nArray2[20] = 282;
        nArray3[21] = 344;
        nArray2[22] = 332;
        nArray3[23] = 326;
        nArray2[24] = 300;
        nArray3[25] = 278;
        nArray2[26] = 436;
        nArray3[27] = 434;
        nArray2[28] = 428;
        nArray3[29] = 422;
        nArray2[30] = 406;
        nArray3[31] = 410;
        nArray2[32] = 364;
        nArray3[33] = 358;
        nArray2[34] = 310;
        nArray3[35] = 314;
        nArray2[36] = 302;
        nArray3[37] = 468;
        nArray2[38] = 466;
        nArray3[39] = 458;
        nArray2[40] = 366;
        nArray3[41] = 374;
        nArray2[42] = 430;
        nArray3[43] = 294;
        nArray2[44] = 474;
        nArray3[45] = 470;
        nArray2[46] = 306;
        nArray3[47] = 350;
        CHARACTER_ENCODINGS = nArray;
        ASTERISK_ENCODING = nArray[47];
    }

    public Code93Reader() {
        Object object = new StringBuilder(20);
        this.decodeRowResult = object;
        object = new int[6];
        this.counters = (int[])object;
    }

    private static void checkChecksums(CharSequence charSequence) {
        int n3 = charSequence.length();
        int n4 = n3 + -2;
        Code93Reader.checkOneChecksum(charSequence, n4, 20);
        Code93Reader.checkOneChecksum(charSequence, n3 += -1, 15);
    }

    private static void checkOneChecksum(CharSequence charSequence, int n3, int n4) {
        char[] cArray;
        int n7 = 1;
        int n8 = 0;
        int n10 = 1;
        for (int i3 = n3 + -1; i3 >= 0; i3 += -1) {
            String string2 = ALPHABET_STRING;
            char c2 = charSequence.charAt(i3);
            int n14 = string2.indexOf(c2) * n10;
            n8 += n14;
            if ((n10 += n7) <= n4) continue;
            n10 = 1;
        }
        char c3 = charSequence.charAt(n3);
        if (c3 == (n3 = (cArray = ALPHABET)[n8 %= 47])) {
            return;
        }
        throw ChecksumException.getChecksumInstance();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String decodeExtended(CharSequence charSequence) {
        int n3 = charSequence.length();
        StringBuilder stringBuilder = new StringBuilder(n3);
        int n4 = 0;
        while (true) {
            block21: {
                int n7;
                block19: {
                    block20: {
                        block18: {
                            int n8;
                            if (n4 >= n3) {
                                return stringBuilder.toString();
                            }
                            n7 = charSequence.charAt(n4);
                            if (n7 < (n8 = 97) || n7 > (n8 = 100)) break block19;
                            n8 = n3 + -1;
                            if (n4 >= n8) {
                                throw FormatException.getFormatInstance();
                            }
                            n8 = charSequence.charAt(++n4);
                            int n10 = 79;
                            int n14 = 90;
                            int n15 = 65;
                            switch (n7) {
                                default: {
                                    n7 = 0;
                                    break block18;
                                }
                                case 100: {
                                    if (n8 >= n15 && n8 <= n14) {
                                        n8 += 32;
                                        break;
                                    }
                                    throw FormatException.getFormatInstance();
                                }
                                case 99: {
                                    if (n8 >= n15 && n8 <= n10) {
                                        n8 += -32;
                                        break;
                                    }
                                    if (n8 != n14) {
                                        throw FormatException.getFormatInstance();
                                    }
                                    n7 = 58;
                                    break block18;
                                }
                                case 98: {
                                    if (n8 >= n15 && n8 <= (n7 = 69)) {
                                        n8 += -38;
                                        break;
                                    }
                                    n7 = 70;
                                    if (n8 >= n7 && n8 <= (n7 = 74)) {
                                        n8 += -11;
                                        break;
                                    }
                                    n7 = 75;
                                    if (n8 >= n7 && n8 <= n10) {
                                        n8 += 16;
                                        break;
                                    }
                                    n7 = 80;
                                    if (n8 >= n7 && n8 <= (n7 = 83)) {
                                        n8 += 43;
                                        break;
                                    }
                                    n7 = 84;
                                    if (n8 >= n7 && n8 <= n14) {
                                        n7 = 127;
                                        break block18;
                                    } else {
                                        throw FormatException.getFormatInstance();
                                    }
                                }
                                case 97: {
                                    if (n8 < n15 || n8 > n14) break block20;
                                    n8 += -64;
                                }
                            }
                            n7 = (char)n8;
                        }
                        stringBuilder.append((char)n7);
                        break block21;
                    }
                    throw FormatException.getFormatInstance();
                }
                stringBuilder.append((char)n7);
            }
            ++n4;
        }
    }

    private int[] findAsteriskPattern(BitArray bitArray) {
        int n3;
        int n4 = bitArray.getSize();
        Arrays.fill(this.counters, 0);
        int[] nArray = this.counters;
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
                int n17;
                n15 = Code93Reader.toPattern(nArray);
                if (n15 == (n17 = ASTERISK_ENCODING)) {
                    return new int[]{n8, n3};
                }
                n15 = nArray[0];
                n17 = nArray[n16];
                n8 += (n15 += n17);
                n15 = n14 + -1;
                n17 = 2;
                System.arraycopy(nArray, n17, nArray, 0, n15);
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
        for (int i3 = 0; i3 < (n4 = (nArray = CHARACTER_ENCODINGS).length); ++i3) {
            int n7 = nArray[i3];
            if (n7 != n3) continue;
            return ALPHABET[i3];
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int toPattern(int[] nArray) {
        int n3;
        int n4;
        int n7 = nArray.length;
        int n8 = 0;
        for (n4 = 0; n4 < n7; ++n4) {
            n3 = nArray[n4];
            n8 += n3;
        }
        n7 = nArray.length;
        n3 = 0;
        for (n4 = 0; n4 < n7; ++n4) {
            float f5 = nArray[n4];
            int n10 = 0x41100000;
            f5 *= 9.0f;
            float f6 = n8;
            int n14 = Math.round(f5 /= f6);
            if (n14 > 0) {
                n10 = 4;
                f6 = 5.6E-45f;
                if (n14 <= n10) {
                    n10 = n4 & 1;
                    if (n10 == 0) {
                        f6 = 0.0f;
                        for (n10 = 0; n10 < n14; ++n10) {
                            n3 = n3 << 1 | 1;
                        }
                        continue;
                    }
                    n3 <<= n14;
                    continue;
                }
            }
            return -1;
        }
        return n3;
    }

    public Result decodeRow(int n3, BitArray object, Map object2) {
        int n4 = 2;
        Object object3 = this.findAsteriskPattern((BitArray)object);
        int n7 = 1;
        int n8 = object3[n7];
        n8 = ((BitArray)object).getNextSet(n8);
        int n10 = ((BitArray)object).getSize();
        int[] nArray = this.counters;
        Arrays.fill(nArray, 0);
        StringBuilder stringBuilder = this.decodeRowResult;
        stringBuilder.setLength(0);
        while (true) {
            int n14;
            int n15;
            OneDReader.recordPattern((BitArray)object, n8, nArray);
            int n16 = Code93Reader.toPattern(nArray);
            if (n16 < 0) break;
            n16 = Code93Reader.patternToChar(n16);
            stringBuilder.append((char)n16);
            int n17 = nArray.length;
            int n18 = n8;
            for (n15 = 0; n15 < n17; n15 += n7) {
                n14 = nArray[n15];
                n18 += n14;
            }
            n17 = ((BitArray)object).getNextSet(n18);
            n15 = 42;
            if (n16 == n15) {
                int n19;
                n16 = stringBuilder.length() - n7;
                stringBuilder.deleteCharAt(n16);
                n16 = nArray.length;
                n18 = 0;
                for (n15 = 0; n15 < n16; n15 += n7) {
                    n14 = nArray[n15];
                    n18 += n14;
                }
                if (n17 != n10 && (n19 = ((BitArray)object).get(n17)) != 0) {
                    n19 = stringBuilder.length();
                    if (n19 >= n4) {
                        Code93Reader.checkChecksums(stringBuilder);
                        n19 = stringBuilder.length() - n4;
                        stringBuilder.setLength(n19);
                        object = Code93Reader.decodeExtended(stringBuilder);
                        n10 = object3[n7];
                        int n20 = object3[0];
                        float f5 = n10 + n20;
                        float f6 = 2.0f;
                        float f7 = n8;
                        float f8 = (float)n18 / f6 + f7;
                        float f11 = n3;
                        ResultPoint resultPoint = new ResultPoint(f5 /= f6, f11);
                        object3 = new ResultPoint;
                        object3(f8, f11);
                        ResultPoint[] resultPointArray = new ResultPoint[n4];
                        resultPointArray[0] = resultPoint;
                        resultPointArray[n7] = object3;
                        object2 = BarcodeFormat.CODE_93;
                        Result result2 = new Result((String)object, null, resultPointArray, (BarcodeFormat)((Object)object2));
                        return result2;
                    }
                    throw NotFoundException.getNotFoundInstance();
                }
                throw NotFoundException.getNotFoundInstance();
            }
            n8 = n17;
        }
        throw NotFoundException.getNotFoundInstance();
    }
}

