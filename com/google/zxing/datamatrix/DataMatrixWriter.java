/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Dimension;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.DefaultPlacement;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import java.util.Map;

public final class DataMatrixWriter
implements Writer {
    private static BitMatrix convertByteMatrixToBitMatrix(ByteMatrix byteMatrix, int n3, int n4) {
        BitMatrix bitMatrix;
        int n7 = byteMatrix.getWidth();
        int n8 = byteMatrix.getHeight();
        int n10 = Math.max(n3, n7);
        int n14 = Math.max(n4, n8);
        int n15 = n10 / n7;
        int n16 = n14 / n8;
        n15 = Math.min(n15, n16);
        n16 = n7 * n15;
        n10 = (n10 - n16) / 2;
        n16 = n8 * n15;
        n14 = (n14 - n16) / 2;
        n16 = 0;
        if (n4 >= n8 && n3 >= n7) {
            bitMatrix = new BitMatrix(n3, n4);
        } else {
            bitMatrix = new BitMatrix(n7, n8);
            n10 = 0;
            n14 = 0;
        }
        bitMatrix.clear();
        n3 = 0;
        while (n3 < n8) {
            int n17 = n10;
            n4 = 0;
            while (n4 < n7) {
                byte by2;
                byte by4 = byteMatrix.get(n4, n3);
                if (by4 == (by2 = 1)) {
                    bitMatrix.setRegion(n17, n14, n15, n15);
                }
                ++n4;
                n17 += n15;
            }
            ++n3;
            n14 += n15;
        }
        return bitMatrix;
    }

    private static BitMatrix encodeLowLevel(DefaultPlacement defaultPlacement, SymbolInfo symbolInfo, int n3, int n4) {
        int n7 = symbolInfo.getSymbolDataWidth();
        int n8 = symbolInfo.getSymbolDataHeight();
        int n10 = symbolInfo.getSymbolWidth();
        int n14 = symbolInfo.getSymbolHeight();
        ByteMatrix byteMatrix = new ByteMatrix(n10, n14);
        n10 = 0;
        int n15 = 0;
        for (n14 = 0; n14 < n8; ++n14) {
            int n16;
            int n17;
            int n18;
            int n19 = symbolInfo.matrixHeight;
            n19 = n14 % n19;
            int n20 = 1;
            if (n19 == 0) {
                n18 = 0;
                for (n19 = 0; n19 < (n17 = symbolInfo.getSymbolWidth()); ++n19) {
                    n17 = n19 % 2;
                    n17 = n17 == 0 ? 1 : 0;
                    byteMatrix.set(n18, n15, n17 != 0);
                    n18 += n20;
                }
                ++n15;
            }
            n18 = 0;
            for (n19 = 0; n19 < n7; ++n19) {
                n17 = symbolInfo.matrixWidth;
                if ((n17 = n19 % n17) == 0) {
                    byteMatrix.set(n18, n15, n20 != 0);
                    ++n18;
                }
                n17 = (int)(defaultPlacement.getBit(n19, n14) ? 1 : 0);
                byteMatrix.set(n18, n15, n17 != 0);
                n17 = n18 + 1;
                n16 = symbolInfo.matrixWidth;
                int n21 = n19 % n16;
                if (n21 == (n16 -= n20)) {
                    n16 = n14 % 2;
                    n16 = n16 == 0 ? 1 : 0;
                    byteMatrix.set(n17, n15, n16 != 0);
                    n18 += 2;
                    continue;
                }
                n18 = n17;
            }
            n19 = n15 + 1;
            n18 = symbolInfo.matrixHeight;
            n17 = n14 % n18;
            if (n17 == (n18 -= n20)) {
                n17 = 0;
                for (n18 = 0; n18 < (n16 = symbolInfo.getSymbolWidth()); ++n18) {
                    byteMatrix.set(n17, n19, n20 != 0);
                    n17 += n20;
                }
                n15 += 2;
                continue;
            }
            n15 = n19;
        }
        return DataMatrixWriter.convertByteMatrixToBitMatrix(byteMatrix, n3, n4);
    }

    public BitMatrix encode(String string2, BarcodeFormat barcodeFormat, int n3, int n4) {
        return this.encode(string2, barcodeFormat, n3, n4, null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public BitMatrix encode(String object, BarcodeFormat object2, int n3, int n4, Map object3) {
        int n7 = ((String)object).isEmpty();
        if (n7 != 0) {
            object = new IllegalArgumentException("Found empty contents");
            throw object;
        }
        BarcodeFormat barcodeFormat = BarcodeFormat.DATA_MATRIX;
        if (object2 != barcodeFormat) {
            object2 = String.valueOf(object2);
            object2 = "Can only encode DATA_MATRIX, but got ".concat((String)object2);
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        if (n3 >= 0 && n4 >= 0) {
            void var7_10;
            int n8;
            object2 = SymbolShapeHint.FORCE_NONE;
            n7 = 0;
            Object var7_8 = null;
            if (object3 != null) {
                Object object4 = EncodeHintType.DATA_MATRIX_SHAPE;
                if ((object4 = (SymbolShapeHint)((Object)object3.get(object4))) != null) {
                    object2 = object4;
                }
                object4 = EncodeHintType.MIN_SIZE;
                if ((object4 = (Dimension)object3.get(object4)) == null) {
                    n8 = 0;
                    object4 = null;
                }
                EncodeHintType encodeHintType = EncodeHintType.MAX_SIZE;
                object3 = (Dimension)object3.get((Object)encodeHintType);
                if (object3 == null) {
                    object3 = null;
                }
                Object object5 = object4;
            } else {
                object3 = null;
            }
            object = HighLevelEncoder.encodeHighLevel((String)object, (SymbolShapeHint)((Object)object2), (Dimension)var7_10, (Dimension)object3);
            object2 = SymbolInfo.lookup(((String)object).length(), (SymbolShapeHint)((Object)object2), (Dimension)var7_10, (Dimension)object3, true);
            object = ErrorCorrection.encodeECC200((String)object, (SymbolInfo)object2);
            n7 = ((SymbolInfo)object2).getSymbolDataWidth();
            n8 = ((SymbolInfo)object2).getSymbolDataHeight();
            object3 = new DefaultPlacement((CharSequence)object, n7, n8);
            ((DefaultPlacement)object3).place();
            return DataMatrixWriter.encodeLowLevel((DefaultPlacement)object3, (SymbolInfo)object2, n3, n4);
        }
        object2 = new StringBuilder("Requested dimensions can't be negative: ");
        ((StringBuilder)object2).append(n3);
        ((StringBuilder)object2).append('x');
        ((StringBuilder)object2).append(n4);
        object2 = ((StringBuilder)object2).toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }
}

