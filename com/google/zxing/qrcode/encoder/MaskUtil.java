/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.encoder;

import com.google.zxing.qrcode.encoder.ByteMatrix;

final class MaskUtil {
    private static final int N1 = 3;
    private static final int N2 = 3;
    private static final int N3 = 40;
    private static final int N4 = 10;

    private MaskUtil() {
    }

    public static int applyMaskPenaltyRule1(ByteMatrix byteMatrix) {
        int n3 = MaskUtil.applyMaskPenaltyRule1Internal(byteMatrix, true);
        int n4 = MaskUtil.applyMaskPenaltyRule1Internal(byteMatrix, false);
        return n3 + n4;
    }

    private static int applyMaskPenaltyRule1Internal(ByteMatrix object, boolean bl2) {
        int n3 = bl2 ? ((ByteMatrix)object).getHeight() : ((ByteMatrix)object).getWidth();
        int n4 = bl2 ? ((ByteMatrix)object).getWidth() : ((ByteMatrix)object).getHeight();
        object = ((ByteMatrix)object).getArray();
        int n7 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n8;
            Object object2 = -1;
            int n10 = 0;
            int n14 = 0;
            while (true) {
                Object object3;
                Object object4;
                n8 = 5;
                if (n10 >= n4) break;
                if (bl2) {
                    object4 = object[i3];
                    object3 = object4[n10];
                } else {
                    object4 = object[n10];
                    object3 = object4[i3];
                }
                if (object3 == object2) {
                    ++n14;
                } else {
                    if (n14 >= n8) {
                        n7 += (n14 += -2);
                    }
                    object2 = object3;
                    n14 = 1;
                }
                ++n10;
            }
            if (n14 < n8) continue;
            n7 = n14 = n14 + -2 + n7;
        }
        return n7;
    }

    public static int applyMaskPenaltyRule2(ByteMatrix byteMatrix) {
        int n3;
        byte[][] byArray = byteMatrix.getArray();
        int n4 = byteMatrix.getWidth();
        int n7 = byteMatrix.getHeight();
        int n8 = 0;
        for (int i3 = 0; i3 < (n3 = n7 + -1); ++i3) {
            int n10;
            byte[] byArray2 = byArray[i3];
            int n14 = 0;
            while (n14 < (n10 = n4 + -1)) {
                byte[] byArray3;
                n10 = byArray2[n14];
                int n15 = n14 + 1;
                int n16 = byArray2[n15];
                if (n10 == n16 && n10 == (n14 = (byArray3 = byArray[n16 = i3 + 1])[n14]) && n10 == (n14 = byArray3[n15])) {
                    ++n8;
                }
                n14 = n15;
            }
        }
        return n8 * 3;
    }

    public static int applyMaskPenaltyRule3(ByteMatrix byteMatrix) {
        byte[][] byArray = byteMatrix.getArray();
        int n3 = byteMatrix.getWidth();
        int n4 = byteMatrix.getHeight();
        int n7 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            for (int i8 = 0; i8 < n3; ++i8) {
                byte[] byArray2;
                int n8;
                int n10;
                byte[] byArray3 = byArray[i3];
                int n14 = i8 + 6;
                int n15 = 1;
                if (n14 < n3 && (n10 = byArray3[i8]) == n15) {
                    n10 = i8 + 1;
                    if ((n10 = byArray3[n10]) == 0) {
                        n10 = i8 + 2;
                        if ((n10 = byArray3[n10]) == n15) {
                            n10 = i8 + 3;
                            if ((n10 = byArray3[n10]) == n15) {
                                n10 = i8 + 4;
                                if ((n10 = byArray3[n10]) == n15) {
                                    n10 = i8 + 5;
                                    if ((n10 = byArray3[n10]) == 0 && (n14 = byArray3[n14]) == n15) {
                                        n14 = i8 + -4;
                                        if ((n14 = (int)(MaskUtil.isWhiteHorizontal(byArray3, n14, i8) ? 1 : 0)) != 0 || (n8 = (int)(MaskUtil.isWhiteHorizontal(byArray3, n14 = i8 + 7, n10 = i8 + 11) ? 1 : 0)) != 0) {
                                            ++n7;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if ((n8 = i3 + 6) >= n4 || (n14 = (byArray2 = byArray[i3])[i8]) != n15) continue;
                n14 = i3 + 1;
                byArray2 = byArray[n14];
                if ((n14 = byArray2[i8]) != 0) continue;
                n14 = i3 + 2;
                byArray2 = byArray[n14];
                if ((n14 = byArray2[i8]) != n15) continue;
                n14 = i3 + 3;
                byArray2 = byArray[n14];
                if ((n14 = byArray2[i8]) != n15) continue;
                n14 = i3 + 4;
                byArray2 = byArray[n14];
                if ((n14 = byArray2[i8]) != n15) continue;
                n14 = i3 + 5;
                byArray2 = byArray[n14];
                if ((n14 = byArray2[i8]) != 0 || (n8 = (byArray3 = byArray[n8])[i8]) != n15) continue;
                n8 = i3 + -4;
                if ((n8 = (int)(MaskUtil.isWhiteVertical(byArray, i8, n8, i3) ? 1 : 0)) == 0) {
                    n8 = i3 + 7;
                    n14 = i3 + 11;
                    if ((n8 = (int)(MaskUtil.isWhiteVertical(byArray, i8, n8, n14) ? 1 : 0)) == 0) continue;
                }
                ++n7;
            }
        }
        return n7 * 40;
    }

    public static int applyMaskPenaltyRule4(ByteMatrix byteMatrix) {
        byte[][] byArray = byteMatrix.getArray();
        int n3 = byteMatrix.getWidth();
        int n4 = byteMatrix.getHeight();
        int n7 = 0;
        int n8 = 0;
        while (true) {
            byte by2 = 1;
            if (n7 >= n4) break;
            byte[] byArray2 = byArray[n7];
            for (int i3 = 0; i3 < n3; ++i3) {
                byte by4 = byArray2[i3];
                if (by4 != by2) continue;
                ++n8;
            }
            ++n7;
        }
        int n10 = byteMatrix.getHeight();
        int n14 = byteMatrix.getWidth() * n10;
        return Math.abs((n8 << 1) - n14) * 10 / n14 * 10;
    }

    /*
     * Handled duff style switch with additional control
     * Enabled aggressive block sorting
     */
    public static boolean getDataMaskBit(int n3, int n4, int n7) {
        int n8 = 1;
        int n10 = Integer.MIN_VALUE;
        block10: do {
            switch (n10 == Integer.MIN_VALUE ? n3 : n10) {
                default: {
                    String string2 = String.valueOf(n3);
                    string2 = "Invalid mask pattern: ".concat(string2);
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
                    throw illegalArgumentException;
                }
                case 7: {
                    n3 = n7 * n4 % 3;
                    n7 += n4;
                    n4 = n7 & 1;
                    n3 = n3 + n4 & n8;
                    break;
                }
                case 6: {
                    n3 = (n7 *= n4) & 1;
                    n7 = n7 % 3 + n3;
                    n10 = 1;
                    continue block10;
                }
                case 5: {
                    n3 = (n7 *= n4) & 1;
                    n3 += (n7 %= 3);
                    break;
                }
                case 4: {
                    n4 = n4 / 3 + (n7 /= 2);
                    n3 = n4 & 1;
                    break;
                }
                case 3: {
                    n3 = (n7 += n4) % 3;
                    break;
                }
                case 2: {
                    n3 = n4 % 3;
                    break;
                }
                case 0: {
                    n7 += n4;
                }
                case 1: {
                    n3 = n7 & 1;
                    break;
                }
            }
            break;
        } while (true);
        if (n3 == 0) {
            return n8 != 0;
        }
        return false;
    }

    private static boolean isWhiteHorizontal(byte[] byArray, int n3, int n4) {
        n3 = Math.max(n3, 0);
        byte by2 = byArray.length;
        n4 = Math.min(n4, by2);
        while (true) {
            by2 = 1;
            if (n3 >= n4) break;
            byte by4 = byArray[n3];
            if (by4 == by2) {
                return false;
            }
            ++n3;
        }
        return by2 != 0;
    }

    private static boolean isWhiteVertical(byte[][] byArray, int n3, int n4, int n7) {
        n4 = Math.max(n4, 0);
        byte by2 = byArray.length;
        n7 = Math.min(n7, by2);
        while (true) {
            by2 = 1;
            if (n4 >= n7) break;
            byte[] byArray2 = byArray[n4];
            byte by4 = byArray2[n3];
            if (by4 == by2) {
                return false;
            }
            ++n4;
        }
        return by2 != 0;
    }
}

