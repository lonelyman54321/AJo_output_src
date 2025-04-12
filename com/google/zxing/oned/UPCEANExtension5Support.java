/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.UPCEANReader;
import java.util.EnumMap;
import java.util.Map;

final class UPCEANExtension5Support {
    private static final int[] CHECK_DIGIT_ENCODINGS;
    private final int[] decodeMiddleCounters;
    private final StringBuilder decodeRowStringBuffer;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[10];
        int[] nArray3 = nArray;
        nArray2[0] = 24;
        nArray3[1] = 20;
        nArray2[2] = 18;
        nArray3[3] = 17;
        nArray2[4] = 12;
        nArray3[5] = 6;
        nArray2[6] = 3;
        nArray3[7] = 10;
        nArray2[8] = 9;
        nArray3[9] = 5;
        CHECK_DIGIT_ENCODINGS = nArray;
    }

    public UPCEANExtension5Support() {
        Object object = new int[4];
        this.decodeMiddleCounters = object;
        object = new StringBuilder;
        this.decodeRowStringBuffer = object;
    }

    private int decodeMiddle(BitArray bitArray, int[] nArray, StringBuilder charSequence) {
        int n3;
        int[] nArray2 = this.decodeMiddleCounters;
        nArray2[0] = 0;
        int n4 = 1;
        nArray2[n4] = 0;
        nArray2[2] = 0;
        nArray2[3] = 0;
        int n7 = bitArray.getSize();
        int n8 = nArray[n4];
        int n10 = 0;
        for (int i3 = 0; i3 < (n3 = 5) && n8 < n7; ++i3) {
            int[][] nArray3 = UPCEANReader.L_AND_G_PATTERNS;
            n3 = UPCEANReader.decodeDigit(bitArray, nArray2, n8, nArray3);
            int n14 = n3 % 10 + 48;
            ((StringBuilder)charSequence).append((char)n14);
            for (int n15 : nArray2) {
                n8 += n15;
            }
            n14 = 10;
            if (n3 >= n14) {
                n3 = 4 - i3;
                n3 = n4 << n3;
                n10 |= n3;
            }
            if (i3 == (n3 = 4)) continue;
            n8 = bitArray.getNextSet(n8);
            n8 = bitArray.getNextUnset(n8);
        }
        int n16 = ((StringBuilder)charSequence).length();
        if (n16 == n3) {
            n16 = UPCEANExtension5Support.determineCheckDigit(n10);
            int n17 = UPCEANExtension5Support.extensionChecksum(charSequence = ((StringBuilder)charSequence).toString());
            if (n17 == n16) {
                return n8;
            }
            throw NotFoundException.getNotFoundInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int determineCheckDigit(int n3) {
        int n4;
        for (int i3 = 0; i3 < (n4 = 10); ++i3) {
            int[] nArray = CHECK_DIGIT_ENCODINGS;
            n4 = nArray[i3];
            if (n3 != n4) continue;
            return i3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int extensionChecksum(CharSequence charSequence) {
        int n3;
        int n4 = charSequence.length();
        int n7 = 0;
        for (n3 = n4 + -2; n3 >= 0; n3 += -2) {
            int n8 = charSequence.charAt(n3) + -48;
            n7 += n8;
        }
        n7 *= 3;
        n4 += -1;
        while (n4 >= 0) {
            n3 = charSequence.charAt(n4) + -48;
            n7 += n3;
            n4 += -2;
        }
        return n7 * 3 % 10;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String parseExtension5String(String string2) {
        String string3;
        CharSequence charSequence;
        int n3;
        int n4;
        block14: {
            block12: {
                block13: {
                    block15: {
                        int n7;
                        n4 = 1;
                        n3 = 0;
                        charSequence = null;
                        int n8 = string2.charAt(0);
                        if (n8 == (n7 = 48)) break block12;
                        n7 = 53;
                        if (n8 == n7) break block13;
                        n7 = 57;
                        string3 = "";
                        if (n8 != n7) break block14;
                        n8 = -1;
                        n7 = string2.hashCode();
                        switch (n7) {
                            case 54395377: {
                                charSequence = "99991";
                                n3 = (int)(string2.equals(charSequence) ? 1 : 0);
                                if (n3 == 0) break;
                                n3 = 2;
                                break block15;
                            }
                            case 54395376: {
                                charSequence = "99990";
                                n3 = (int)(string2.equals(charSequence) ? 1 : 0);
                                if (n3 == 0) break;
                                n3 = 1;
                                break block15;
                            }
                            case 54118329: {
                                String string4 = "90000";
                                n7 = (int)(string2.equals(string4) ? 1 : 0);
                                if (n7 != 0) break block15;
                            }
                        }
                        n3 = -1;
                    }
                    switch (n3) {
                        default: {
                            break block14;
                        }
                        case 2: {
                            return "0.00";
                        }
                        case 1: {
                            return "Used";
                        }
                        case 0: {
                            return null;
                        }
                    }
                }
                string3 = "$";
                break block14;
            }
            string3 = "\u00a3";
        }
        string2 = string2.substring(n4);
        int n10 = Integer.parseInt(string2);
        n4 = n10 / 100;
        String string5 = String.valueOf(n4);
        n3 = 10;
        if ((n10 %= 100) < n3) {
            charSequence = "0";
            string2 = String.valueOf(n10);
            string2 = ((String)charSequence).concat(string2);
        } else {
            string2 = String.valueOf(n10);
        }
        charSequence = new StringBuilder();
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(string5);
        ((StringBuilder)charSequence).append('.');
        ((StringBuilder)charSequence).append(string2);
        return ((StringBuilder)charSequence).toString();
    }

    private static Map parseExtensionString(String string2) {
        int n3;
        int n4 = string2.length();
        if (n4 != (n3 = 5)) {
            return null;
        }
        if ((string2 = UPCEANExtension5Support.parseExtension5String(string2)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(ResultMetadataType.class);
        ResultMetadataType resultMetadataType = ResultMetadataType.SUGGESTED_PRICE;
        enumMap.put((Object)resultMetadataType, string2);
        return enumMap;
    }

    public Result decodeRow(int n3, BitArray object, int[] object2) {
        CharSequence charSequence = this.decodeRowStringBuffer;
        charSequence.setLength(0);
        int n4 = this.decodeMiddle((BitArray)object, (int[])object2, (StringBuilder)charSequence);
        charSequence = charSequence.toString();
        Map map2 = UPCEANExtension5Support.parseExtensionString((String)charSequence);
        int n7 = object2[0];
        int n8 = 1;
        int n10 = object2[n8];
        float f5 = n7 + n10;
        n7 = 0x40000000;
        float f6 = 2.0f;
        float f7 = n3;
        ResultPoint resultPoint = new ResultPoint(f5 /= f6, f7);
        object2 = new ResultPoint;
        float f8 = n4;
        object2(f8, f7);
        n3 = 2;
        f7 = 2.8E-45f;
        ResultPoint[] resultPointArray = new ResultPoint[n3];
        resultPointArray[0] = resultPoint;
        resultPointArray[n8] = object2;
        object = BarcodeFormat.UPC_EAN_EXTENSION;
        n10 = 0;
        f5 = 0.0f;
        object2 = null;
        Result result2 = new Result((String)charSequence, null, resultPointArray, (BarcodeFormat)((Object)object));
        if (map2 != null) {
            result2.putAllMetadata(map2);
        }
        return result2;
    }
}

