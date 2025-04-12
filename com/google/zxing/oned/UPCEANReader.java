/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import com.google.zxing.oned.EANManufacturerOrgSupport;
import com.google.zxing.oned.OneDReader;
import com.google.zxing.oned.UPCEANExtensionSupport;
import java.util.Arrays;
import java.util.Map;

public abstract class UPCEANReader
extends OneDReader {
    static final int[] END_PATTERN;
    static final int[][] L_AND_G_PATTERNS;
    static final int[][] L_PATTERNS;
    private static final float MAX_AVG_VARIANCE = 0.48f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;
    static final int[] MIDDLE_PATTERN;
    static final int[] START_END_PATTERN;
    private final StringBuilder decodeRowStringBuffer;
    private final EANManufacturerOrgSupport eanManSupport;
    private final UPCEANExtensionSupport extensionReader;

    static {
        int[] nArray;
        int n3 = 1;
        START_END_PATTERN = new int[]{n3, n3, n3};
        MIDDLE_PATTERN = new int[]{n3, n3, n3, n3, n3};
        int n4 = 6;
        int[] nArray2 = nArray = new int[n4];
        int[] nArray3 = nArray;
        nArray2[0] = 1;
        nArray3[1] = 1;
        nArray2[2] = 1;
        nArray3[3] = 1;
        nArray2[4] = 1;
        nArray3[5] = 1;
        END_PATTERN = nArray;
        int n7 = 10;
        int[][] nArrayArray = new int[n7][];
        int n8 = 3;
        int n10 = 2;
        int[] nArray4 = new int[]{n8, n10, n3, n3};
        nArrayArray[0] = nArray4;
        nArray4 = new int[]{n10, n10, n10, n3};
        nArrayArray[n3] = nArray4;
        nArray4 = new int[]{n10, n3, n10, n10};
        nArrayArray[n10] = nArray4;
        int n14 = 4;
        int[] nArray5 = new int[]{n3, n14, n3, n3};
        nArrayArray[n8] = nArray5;
        nArray5 = new int[]{n3, n3, n8, n10};
        nArrayArray[n14] = nArray5;
        nArray5 = new int[]{n3, n10, n8, n3};
        int n15 = 5;
        nArrayArray[n15] = nArray5;
        nArray4 = new int[]{n3, n3, n3, n14};
        nArrayArray[n4] = nArray4;
        int[] nArray6 = new int[]{n3, n8, n3, n10};
        nArrayArray[7] = nArray6;
        nArray6 = new int[]{n3, n10, n3, n8};
        n14 = 8;
        nArrayArray[n14] = nArray6;
        nArray6 = new int[]{n8, n3, n3, n10};
        n8 = 9;
        nArrayArray[n8] = nArray6;
        L_PATTERNS = nArrayArray;
        n4 = 20;
        Object object = new int[n4][];
        L_AND_G_PATTERNS = object;
        System.arraycopy(nArrayArray, 0, object, 0, n7);
        for (int i3 = 10; i3 < n4; i3 += n3) {
            Object object2;
            object = L_PATTERNS;
            n10 = i3 + -10;
            object = object[n10];
            n10 = ((int[][])object).length;
            int[] nArray7 = new int[n10];
            nArray4 = null;
            for (n14 = 0; n14 < (object2 = ((int[][])object).length); n14 += n3) {
                object2 = ((int[][])object).length - n14 - n3;
                nArray7[n14] = object2 = (Object)object[object2];
            }
            object = L_AND_G_PATTERNS;
            object[i3] = nArray7;
        }
    }

    public UPCEANReader() {
        Object object = new StringBuilder(20);
        this.decodeRowStringBuffer = object;
        this.extensionReader = object = new UPCEANExtensionSupport();
        this.eanManSupport = object = new EANManufacturerOrgSupport();
    }

    public static boolean checkStandardUPCEANChecksum(CharSequence charSequence) {
        int n3 = charSequence.length();
        if (n3 == 0) {
            return false;
        }
        int n4 = 1;
        int n7 = charSequence.charAt(n3 -= n4);
        int n8 = 10;
        n7 = Character.digit((char)n7, n8);
        int n10 = UPCEANReader.getStandardUPCEANChecksum(charSequence = charSequence.subSequence(0, n3));
        if (n10 == n7) {
            return n4 != 0;
        }
        return false;
    }

    public static int decodeDigit(BitArray bitArray, int[] nArray, int n3, int[][] nArray2) {
        OneDReader.recordPattern(bitArray, n3, nArray);
        int n4 = nArray2.length;
        n3 = 1056293519;
        float f5 = 0.48f;
        int n7 = -1;
        for (int i3 = 0; i3 < n4; ++i3) {
            int[] nArray3 = nArray2[i3];
            float f6 = 0.7f;
            float f7 = OneDReader.patternMatchVariance(nArray, nArray3, f6);
            float f8 = f7 - f5;
            Object object = f8 == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1);
            if (object >= 0) continue;
            n7 = i3;
            f5 = f7;
        }
        if (n7 >= 0) {
            return n7;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] findGuardPattern(BitArray bitArray, int n3, boolean bl2, int[] nArray) {
        int[] nArray2 = new int[nArray.length];
        return UPCEANReader.findGuardPattern(bitArray, n3, bl2, nArray, nArray2);
    }

    private static int[] findGuardPattern(BitArray bitArray, int n3, boolean n4, int[] nArray, int[] nArray2) {
        int n7 = bitArray.getSize();
        n3 = n4 != 0 ? bitArray.getNextUnset(n3) : bitArray.getNextSet(n3);
        int n8 = nArray.length;
        int n10 = n4;
        int n14 = 0;
        n4 = n3;
        while (n3 < n7) {
            int n15 = bitArray.get(n3);
            int n16 = 1;
            if (n15 != n10) {
                nArray2[n14] = n15 = nArray2[n14] + n16;
            } else {
                n15 = n8 + -1;
                if (n14 == n15) {
                    float f5 = OneDReader.patternMatchVariance(nArray2, nArray, 0.7f);
                    int n17 = 1056293519;
                    float f6 = 0.48f;
                    float f7 = f5 - f6;
                    n15 = (int)(f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1));
                    if (n15 < 0) {
                        return new int[]{n4, n3};
                    }
                    n15 = nArray2[0];
                    n17 = nArray2[n16];
                    n4 += (n15 += n17);
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
                n10 ^= true;
            }
            ++n3;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public static int[] findStartGuardPattern(BitArray bitArray) {
        int n3 = START_END_PATTERN.length;
        int[] nArray = new int[n3];
        int[] nArray2 = null;
        boolean bl2 = false;
        int n4 = 0;
        while (!bl2) {
            nArray2 = START_END_PATTERN;
            int n7 = nArray2.length;
            Arrays.fill(nArray, 0, n7, 0);
            nArray2 = UPCEANReader.findGuardPattern(bitArray, n4, false, nArray2, nArray);
            n4 = nArray2[0];
            n7 = nArray2[1];
            int n8 = n7 - n4;
            n8 = n4 - n8;
            if (n8 >= 0) {
                bl2 = bitArray.isRange(n8, n4, false);
            }
            n4 = n7;
        }
        return nArray2;
    }

    public static int getStandardUPCEANChecksum(CharSequence charSequence) {
        int n3;
        int n4;
        int n7;
        int n8;
        block3: {
            n8 = charSequence.length();
            n7 = n8 + -1;
            n4 = 0;
            while (true) {
                n3 = 9;
                if (n7 < 0) break block3;
                int n10 = charSequence.charAt(n7) + -48;
                if (n10 < 0 || n10 > n3) break;
                n4 += n10;
                n7 += -2;
            }
            throw FormatException.getFormatInstance();
        }
        n4 *= 3;
        n8 += -2;
        while (n8 >= 0) {
            n7 = charSequence.charAt(n8) + -48;
            if (n7 >= 0 && n7 <= n3) {
                n4 += n7;
                n8 += -2;
                continue;
            }
            throw FormatException.getFormatInstance();
        }
        return (1000 - n4) % 10;
    }

    public boolean checkChecksum(String string2) {
        return UPCEANReader.checkStandardUPCEANChecksum(string2);
    }

    public int[] decodeEnd(BitArray bitArray, int n3) {
        int[] nArray = START_END_PATTERN;
        return UPCEANReader.findGuardPattern(bitArray, n3, false, nArray);
    }

    public abstract int decodeMiddle(BitArray var1, int[] var2, StringBuilder var3);

    public Result decodeRow(int n3, BitArray bitArray, Map map2) {
        int[] nArray = UPCEANReader.findStartGuardPattern(bitArray);
        return this.decodeRow(n3, bitArray, nArray, map2);
    }

    public Result decodeRow(int n3, BitArray resultPointArray, int[] object, Map map2) {
        int n4;
        Object object2;
        float f5;
        float f6;
        ResultPoint[] resultPointArray2;
        float f7;
        int n7;
        int n8;
        Object object3;
        int n10;
        int n14 = 0;
        int n15 = 1;
        Object object4 = null;
        if (map2 == null) {
            n10 = 0;
            object3 = null;
        } else {
            object3 = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
            object3 = (ResultPointCallback)map2.get(object3);
        }
        float f8 = 2.0f;
        if (object3 != null) {
            n8 = object[0];
            n7 = object[n15];
            float f11 = (float)(n8 += n7) / f8;
            f7 = n3;
            resultPointArray2 = new ResultPoint(f11, f7);
            object3.foundPossibleResultPoint((ResultPoint)resultPointArray2);
        }
        resultPointArray2 = this.decodeRowStringBuffer;
        resultPointArray2.setLength(0);
        n8 = this.decodeMiddle((BitArray)resultPointArray, (int[])object, (StringBuilder)resultPointArray2);
        if (object3 != null) {
            f6 = n8;
            f5 = n3;
            object2 = new ResultPoint(f6, f5);
            object3.foundPossibleResultPoint((ResultPoint)object2);
        }
        int[] nArray = this.decodeEnd((BitArray)resultPointArray, n8);
        if (object3 != null) {
            n4 = nArray[0];
            int n16 = nArray[n15];
            f6 = (float)(n4 += n16) / f8;
            f5 = n3;
            object2 = new ResultPoint(f6, f5);
            object3.foundPossibleResultPoint((ResultPoint)object2);
        }
        n10 = nArray[n15];
        n7 = nArray[0];
        n4 = resultPointArray.getSize();
        if ((n7 = n10 - n7 + n10) < n4 && (n10 = (int)(resultPointArray.isRange(n10, n7, false) ? 1 : 0)) != 0) {
            object3 = resultPointArray2.toString();
            int n17 = ((String)object3).length();
            n7 = 8;
            f7 = 1.1E-44f;
            if (n17 >= n7) {
                n17 = (int)(this.checkChecksum((String)object3) ? 1 : 0);
                if (n17 != 0) {
                    Object object5;
                    BarcodeFormat barcodeFormat;
                    block23: {
                        n17 = object[n15];
                        Object object6 = object[0];
                        float f12 = (float)(n17 + object6) / f8;
                        n17 = nArray[n15];
                        n7 = nArray[0];
                        float f14 = (float)(n17 + n7) / f8;
                        barcodeFormat = this.getBarcodeFormat();
                        f5 = n3;
                        ResultPoint resultPoint = new ResultPoint(f12, f5);
                        object = new ResultPoint;
                        ((ResultPoint)object)(f14, f5);
                        n17 = 2;
                        f14 = 2.8E-45f;
                        resultPointArray2 = new ResultPoint[n17];
                        resultPointArray2[0] = resultPoint;
                        resultPointArray2[n15] = object;
                        object2 = new Result((String)object3, null, resultPointArray2, barcodeFormat);
                        object = this.extensionReader;
                        n17 = nArray[n15];
                        object5 = ((UPCEANExtensionSupport)object).decodeRow(n3, (BitArray)resultPointArray, n17);
                        resultPointArray = ResultMetadataType.UPC_EAN_EXTENSION;
                        object = ((Result)object5).getText();
                        ((Result)object2).putMetadata((ResultMetadataType)resultPointArray, object);
                        resultPointArray = ((Result)object5).getResultMetadata();
                        ((Result)object2).putAllMetadata((Map)resultPointArray);
                        resultPointArray = ((Result)object5).getResultPoints();
                        ((Result)object2).addResultPoints(resultPointArray);
                        object5 = ((Result)object5).getText();
                        try {
                            n3 = ((String)object5).length();
                        }
                        catch (ReaderException readerException) {
                            n3 = 0;
                            object5 = null;
                        }
                        if (map2 != null) {
                            resultPointArray = DecodeHintType.ALLOWED_EAN_EXTENSIONS;
                            resultPointArray = map2.get(resultPointArray);
                            object4 = resultPointArray;
                            object4 = (int[])resultPointArray;
                        }
                        if (object4 != null) {
                            int n18 = (object4).length;
                            while (n14 < n18) {
                                object6 = object4[n14];
                                if (n3 != object6) {
                                    n14 += n15;
                                    continue;
                                }
                                break block23;
                            }
                            throw NotFoundException.getNotFoundInstance();
                        }
                    }
                    if ((barcodeFormat == (object5 = BarcodeFormat.EAN_13) || barcodeFormat == (object5 = BarcodeFormat.UPC_A)) && (object5 = this.eanManSupport.lookupCountryIdentifier((String)object3)) != null) {
                        resultPointArray = ResultMetadataType.POSSIBLE_COUNTRY;
                        ((Result)object2).putMetadata((ResultMetadataType)resultPointArray, object5);
                    }
                    return object2;
                }
                throw ChecksumException.getChecksumInstance();
            }
            throw FormatException.getFormatInstance();
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public abstract BarcodeFormat getBarcodeFormat();
}

