/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.encoder.BarcodeMatrix;
import com.google.zxing.pdf417.encoder.Compaction;
import com.google.zxing.pdf417.encoder.Dimensions;
import com.google.zxing.pdf417.encoder.PDF417;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

public final class PDF417Writer
implements Writer {
    private static final int DEFAULT_ERROR_CORRECTION_LEVEL = 2;
    private static final int WHITE_SPACE = 30;

    private static BitMatrix bitMatrixFromBitArray(byte[][] byArray, int n3) {
        int n4;
        byte[] byArray2 = byArray[0];
        int n7 = byArray2.length;
        int n8 = n3 * 2;
        int n10 = byArray.length + n8;
        BitMatrix bitMatrix = new BitMatrix(n7 += n8, n10);
        bitMatrix.clear();
        n7 = bitMatrix.getHeight() - n3;
        n8 = 1;
        n7 -= n8;
        n10 = 0;
        while (n10 < (n4 = byArray.length)) {
            byte[] byArray3;
            int n14;
            byte[] byArray4 = byArray[n10];
            for (int i3 = 0; i3 < (n14 = (byArray3 = byArray[0]).length); ++i3) {
                n14 = byArray4[i3];
                if (n14 != n8) continue;
                n14 = i3 + n3;
                bitMatrix.set(n14, n7);
            }
            ++n10;
            n7 += -1;
        }
        return bitMatrix;
    }

    private static BitMatrix bitMatrixFromEncoder(PDF417 object, String object2, int n3, int n4, int n7, int n8) {
        ((PDF417)object).generateBarcodeLogic((String)object2, n3);
        object2 = ((PDF417)object).getBarcodeMatrix();
        int n10 = 1;
        object2 = ((BarcodeMatrix)object2).getScaledMatrix(n10, 4);
        n3 = 0;
        Object object3 = null;
        int n14 = n7 > n4 ? 1 : 0;
        Object object4 = object2[0];
        int n15 = ((Object)object4).length;
        int n16 = ((Object)object2).length;
        if (n15 < n16) {
            n15 = 1;
        } else {
            n15 = 0;
            object4 = null;
        }
        if (n14 != n15) {
            object2 = PDF417Writer.rotateArray((byte[][])object2);
            n14 = 1;
        } else {
            n14 = 0;
        }
        object3 = object2[0];
        n3 = ((Object)object3).length;
        n4 /= n3;
        n3 = ((Object)object2).length;
        if (n4 >= (n7 /= n3)) {
            n4 = n7;
        }
        if (n4 > n10) {
            object = ((PDF417)object).getBarcodeMatrix();
            int n17 = n4 << 2;
            object = ((BarcodeMatrix)object).getScaledMatrix(n4, n17);
            if (n14 != 0) {
                object = PDF417Writer.rotateArray((byte[][])object);
            }
            return PDF417Writer.bitMatrixFromBitArray((byte[][])object, n8);
        }
        return PDF417Writer.bitMatrixFromBitArray((byte[][])object2, n8);
    }

    private static byte[][] rotateArray(byte[][] byArray) {
        int n3 = byArray[0].length;
        int n4 = byArray.length;
        int n7 = 2;
        int[] nArray = new int[n7];
        int n8 = 1;
        nArray[n8] = n4;
        nArray[0] = n3;
        byte[][] byArray2 = (byte[][])Array.newInstance(Byte.TYPE, nArray);
        for (n4 = 0; n4 < (n7 = byArray.length); ++n4) {
            byte[] byArray3;
            int n10;
            n7 = byArray.length - n4 - n8;
            for (int i3 = 0; i3 < (n10 = (byArray3 = byArray[0]).length); ++i3) {
                byte by2;
                byArray3 = byArray2[i3];
                byte[] byArray4 = byArray[n4];
                byArray3[n7] = by2 = byArray4[i3];
            }
        }
        return byArray2;
    }

    public BitMatrix encode(String string2, BarcodeFormat barcodeFormat, int n3, int n4) {
        return this.encode(string2, barcodeFormat, n3, n4, null);
    }

    public BitMatrix encode(String object, BarcodeFormat object2, int n3, int n4, Map object3) {
        Object object4 = BarcodeFormat.PDF_417;
        if (object2 == object4) {
            int n7;
            int n8;
            int n10;
            int n14;
            Object object5;
            PDF417 pDF417 = new PDF417();
            int n15 = 30;
            int n16 = 2;
            if (object3 != null) {
                object5 = EncodeHintType.PDF417_COMPACT;
                n14 = (int)(object3.containsKey(object5) ? 1 : 0);
                if (n14 != 0) {
                    object5 = Boolean.valueOf(object3.get(object5).toString());
                    boolean n17 = (Boolean)object5;
                    pDF417.setCompact(n17);
                }
                if ((n14 = (int)(object3.containsKey(object5 = EncodeHintType.PDF417_COMPACTION) ? 1 : 0)) != 0) {
                    object5 = Compaction.valueOf(object3.get(object5).toString());
                    pDF417.setCompaction((Compaction)((Object)object5));
                }
                if ((n14 = (int)(object3.containsKey(object5 = EncodeHintType.PDF417_DIMENSIONS) ? 1 : 0)) != 0) {
                    object5 = (Dimensions)object3.get(object5);
                    n14 = ((Dimensions)object5).getMaxCols();
                    n10 = ((Dimensions)object5).getMinCols();
                    n8 = ((Dimensions)object5).getMaxRows();
                    int n17 = ((Dimensions)object5).getMinRows();
                    pDF417.setDimensions(n14, n10, n8, n17);
                }
                if ((n14 = (int)(object3.containsKey(object5 = EncodeHintType.MARGIN) ? 1 : 0)) != 0) {
                    object2 = object3.get(object5).toString();
                    n15 = Integer.parseInt((String)object2);
                }
                if ((n14 = (int)(object3.containsKey(object5 = EncodeHintType.ERROR_CORRECTION) ? 1 : 0)) != 0) {
                    object4 = object3.get(object5).toString();
                    n16 = Integer.parseInt((String)object4);
                }
                if ((n14 = (int)(object3.containsKey(object5 = EncodeHintType.CHARACTER_SET) ? 1 : 0)) != 0) {
                    object3 = Charset.forName(object3.get(object5).toString());
                    pDF417.setEncoding((Charset)object3);
                }
                n7 = n15;
                n14 = n16;
            } else {
                n14 = 2;
                n7 = 30;
            }
            object5 = object;
            n10 = n3;
            n8 = n4;
            return PDF417Writer.bitMatrixFromEncoder(pDF417, (String)object, n14, n3, n4, n7);
        }
        object2 = String.valueOf(object2);
        object2 = "Can only encode PDF_417, but got ".concat((String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

