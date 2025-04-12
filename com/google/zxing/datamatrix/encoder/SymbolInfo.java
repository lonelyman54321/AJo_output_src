/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.datamatrix.encoder;

import com.google.zxing.Dimension;
import com.google.zxing.datamatrix.encoder.DataMatrixSymbolInfo144;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;

public class SymbolInfo {
    static final SymbolInfo[] PROD_SYMBOLS;
    private static SymbolInfo[] symbols;
    private final int dataCapacity;
    private final int dataRegions;
    private final int errorCodewords;
    public final int matrixHeight;
    public final int matrixWidth;
    private final boolean rectangular;
    private final int rsBlockData;
    private final int rsBlockError;

    static {
        SymbolInfo symbolInfo;
        SymbolInfo symbolInfo2;
        SymbolInfo symbolInfo3;
        SymbolInfo symbolInfo4;
        SymbolInfo symbolInfo5;
        SymbolInfo symbolInfo6;
        SymbolInfo symbolInfo7;
        SymbolInfo symbolInfo8;
        SymbolInfo symbolInfo9;
        SymbolInfo symbolInfo10;
        SymbolInfo symbolInfo11;
        SymbolInfo symbolInfo12;
        SymbolInfo symbolInfo13;
        SymbolInfo symbolInfo14;
        SymbolInfo symbolInfo15;
        SymbolInfo[] symbolInfoArray;
        SymbolInfo symbolInfo16;
        SymbolInfo symbolInfo17 = symbolInfo16;
        symbolInfo16 = new SymbolInfo(false, 3, 5, 8, 8, 1);
        int n3 = 1;
        SymbolInfo symbolInfo18 = symbolInfo17;
        symbolInfo17 = new SymbolInfo(false, 5, 7, 10, 10, n3);
        int n4 = 6;
        boolean bl2 = true;
        SymbolInfo[] symbolInfoArray2 = symbolInfoArray;
        symbolInfoArray = new SymbolInfo(bl2, 5, 7, 16, n4, 1);
        symbolInfo18 = symbolInfo15;
        symbolInfo15 = new SymbolInfo(false, 8, 10, 12, 12, n3);
        symbolInfoArray2 = symbolInfo14;
        symbolInfo14 = new SymbolInfo(bl2, 10, 11, 14, n4, 2);
        symbolInfo18 = symbolInfo13;
        symbolInfo13 = new SymbolInfo(false, 12, 12, 14, 14, n3);
        int n7 = 1;
        symbolInfoArray2 = symbolInfo12;
        symbolInfo12 = new SymbolInfo(bl2, 16, 14, 24, 10, n7);
        int n8 = 16;
        symbolInfo18 = symbolInfo11;
        symbolInfo11 = new SymbolInfo(false, 18, 14, 16, n8, n3);
        symbolInfoArray2 = symbolInfo18;
        symbolInfo18 = new SymbolInfo(false, 22, 18, 18, 18, n7);
        SymbolInfo symbolInfo19 = symbolInfo10;
        symbolInfo10 = new SymbolInfo(true, 22, 18, n8, 10, 2);
        int n10 = 1;
        SymbolInfo symbolInfo20 = symbolInfo19;
        symbolInfo19 = new SymbolInfo(false, 30, 20, 20, 20, n10);
        SymbolInfo symbolInfo21 = symbolInfo9;
        symbolInfo9 = new SymbolInfo(true, 32, 24, 16, 14, 2);
        n7 = 22;
        symbolInfo20 = symbolInfo8;
        symbolInfo8 = new SymbolInfo(false, 36, 24, n7, 22, n10);
        symbolInfo21 = symbolInfo7;
        symbolInfo7 = new SymbolInfo(false, 44, 28, 24, 24, 1);
        symbolInfo20 = symbolInfo6;
        symbolInfo6 = new SymbolInfo(true, 49, 28, n7, 14, 2);
        int n14 = 4;
        symbolInfo21 = symbolInfo5;
        symbolInfo5 = new SymbolInfo(false, 62, 36, 14, 14, n14);
        symbolInfo20 = symbolInfoArray2;
        symbolInfoArray2 = new SymbolInfo(false, 86, 42, 16, 16, 4);
        symbolInfo21 = symbolInfo20;
        symbolInfo20 = new SymbolInfo(false, 114, 48, 18, 18, n14);
        SymbolInfo symbolInfo22 = symbolInfo4;
        symbolInfo4 = new SymbolInfo(false, 144, 56, 20, 20, 4);
        SymbolInfo symbolInfo23 = symbolInfo22;
        symbolInfo22 = new SymbolInfo(false, 174, 68, 22, 22, 4);
        SymbolInfo symbolInfo24 = new SymbolInfo(false, 204, 84, 24, 24, 4, 102, 42);
        SymbolInfo symbolInfo25 = new SymbolInfo(false, 280, 112, 14, 14, 16, 140, 56);
        int n15 = 16;
        symbolInfo23 = symbolInfo3;
        symbolInfo3 = new SymbolInfo(false, 368, 144, 16, 16, n15, 92, 36);
        int n16 = 16;
        SymbolInfo symbolInfo26 = symbolInfo2;
        symbolInfo2 = new SymbolInfo(false, 456, 192, 18, 18, n16, 114, 48);
        int n17 = 56;
        symbolInfo23 = symbolInfo;
        symbolInfo = new SymbolInfo(false, 576, 224, 20, 20, n15, 144, n17);
        symbolInfo26 = symbolInfo21;
        symbolInfo21 = new SymbolInfo(false, 696, 272, 22, 22, n16, 174, 68);
        symbolInfo23 = symbolInfo26;
        symbolInfo26 = new SymbolInfo(false, 816, 336, 24, 24, n15, 136, n17);
        symbolInfo23 = new SymbolInfo(false, 1050, 408, 18, 18, 36, 175, 68);
        SymbolInfo symbolInfo27 = new SymbolInfo(false, 1304, 496, 20, 20, 36, 163, 62);
        DataMatrixSymbolInfo144 dataMatrixSymbolInfo144 = new DataMatrixSymbolInfo144();
        SymbolInfo[] symbolInfoArray3 = symbolInfoArray2;
        symbolInfoArray2 = new SymbolInfo[]{symbolInfo16, symbolInfo17, symbolInfoArray, symbolInfo15, symbolInfo14, symbolInfo13, symbolInfo12, symbolInfo11, symbolInfo18, symbolInfo10, symbolInfo19, symbolInfo9, symbolInfo8, symbolInfo7, symbolInfo6, symbolInfo5, symbolInfoArray3, symbolInfo20, symbolInfo4, symbolInfo22, symbolInfo24, symbolInfo25, symbolInfo3, symbolInfo2, symbolInfo, symbolInfo21, symbolInfo26, symbolInfo23, symbolInfo27, dataMatrixSymbolInfo144};
        PROD_SYMBOLS = symbolInfoArray2;
        symbols = symbolInfoArray2;
    }

    public SymbolInfo(boolean bl2, int n3, int n4, int n7, int n8, int n10) {
        this(bl2, n3, n4, n7, n8, n10, n3, n4);
    }

    public SymbolInfo(boolean bl2, int n3, int n4, int n7, int n8, int n10, int n14, int n15) {
        this.rectangular = bl2;
        this.dataCapacity = n3;
        this.errorCodewords = n4;
        this.matrixWidth = n7;
        this.matrixHeight = n8;
        this.dataRegions = n10;
        this.rsBlockData = n14;
        this.rsBlockError = n15;
    }

    private int getHorizontalDataRegions() {
        int n3;
        int n4 = this.dataRegions;
        int n7 = 1;
        if (n4 != n7 && n4 != (n7 = 2) && n4 != (n3 = 4)) {
            n7 = 16;
            if (n4 != n7) {
                n7 = 36;
                if (n4 == n7) {
                    return 6;
                }
                IllegalStateException illegalStateException = new IllegalStateException("Cannot handle this number of data regions");
                throw illegalStateException;
            }
            return n3;
        }
        return n7;
    }

    private int getVerticalDataRegions() {
        int n3;
        int n4 = this.dataRegions;
        int n7 = 1;
        if (n4 != n7 && n4 != (n3 = 2)) {
            n7 = 4;
            if (n4 != n7) {
                n3 = 16;
                if (n4 != n3) {
                    n7 = 36;
                    if (n4 == n7) {
                        return 6;
                    }
                    IllegalStateException illegalStateException = new IllegalStateException("Cannot handle this number of data regions");
                    throw illegalStateException;
                }
                return n7;
            }
            return n3;
        }
        return n7;
    }

    public static SymbolInfo lookup(int n3) {
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        return SymbolInfo.lookup(n3, symbolShapeHint, true);
    }

    public static SymbolInfo lookup(int n3, SymbolShapeHint symbolShapeHint) {
        return SymbolInfo.lookup(n3, symbolShapeHint, true);
    }

    public static SymbolInfo lookup(int n3, SymbolShapeHint object, Dimension dimension, Dimension dimension2, boolean bl2) {
        for (SymbolInfo symbolInfo : symbols) {
            int n4;
            int n7;
            SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_SQUARE;
            if (object == symbolShapeHint && (n7 = symbolInfo.rectangular) != 0 || object == (symbolShapeHint = SymbolShapeHint.FORCE_RECTANGLE) && (n7 = symbolInfo.rectangular) == 0 || dimension != null && ((n7 = symbolInfo.getSymbolWidth()) < (n4 = dimension.getWidth()) || (n7 = symbolInfo.getSymbolHeight()) < (n4 = dimension.getHeight())) || dimension2 != null && ((n7 = symbolInfo.getSymbolWidth()) > (n4 = dimension2.getWidth()) || (n7 = symbolInfo.getSymbolHeight()) > (n4 = dimension2.getHeight())) || n3 > (n7 = symbolInfo.dataCapacity)) continue;
            return symbolInfo;
        }
        if (!bl2) {
            return null;
        }
        String string2 = String.valueOf(n3);
        string2 = "Can't find a symbol arrangement that matches the message. Data codewords: ".concat(string2);
        object = new IllegalArgumentException(string2);
        throw object;
    }

    private static SymbolInfo lookup(int n3, SymbolShapeHint symbolShapeHint, boolean bl2) {
        return SymbolInfo.lookup(n3, symbolShapeHint, null, null, bl2);
    }

    public static SymbolInfo lookup(int n3, boolean bl2, boolean bl3) {
        SymbolShapeHint symbolShapeHint = bl2 ? SymbolShapeHint.FORCE_NONE : SymbolShapeHint.FORCE_SQUARE;
        return SymbolInfo.lookup(n3, symbolShapeHint, bl3);
    }

    public static void overrideSymbolSet(SymbolInfo[] symbolInfoArray) {
        symbols = symbolInfoArray;
    }

    public int getCodewordCount() {
        int n3 = this.dataCapacity;
        int n4 = this.errorCodewords;
        return n3 + n4;
    }

    public final int getDataCapacity() {
        return this.dataCapacity;
    }

    public int getDataLengthForInterleavedBlock(int n3) {
        return this.rsBlockData;
    }

    public final int getErrorCodewords() {
        return this.errorCodewords;
    }

    public final int getErrorLengthForInterleavedBlock(int n3) {
        return this.rsBlockError;
    }

    public int getInterleavedBlockCount() {
        int n3 = this.dataCapacity;
        int n4 = this.rsBlockData;
        return n3 / n4;
    }

    public final int getSymbolDataHeight() {
        int n3 = this.getVerticalDataRegions();
        int n4 = this.matrixHeight;
        return n3 * n4;
    }

    public final int getSymbolDataWidth() {
        int n3 = this.getHorizontalDataRegions();
        int n4 = this.matrixWidth;
        return n3 * n4;
    }

    public final int getSymbolHeight() {
        int n3 = this.getSymbolDataHeight();
        int n4 = this.getVerticalDataRegions() << 1;
        return n3 + n4;
    }

    public final int getSymbolWidth() {
        int n3 = this.getSymbolDataWidth();
        int n4 = this.getHorizontalDataRegions() << 1;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.rectangular;
        String string2 = n3 != 0 ? "Rectangular Symbol:" : "Square Symbol:";
        stringBuilder.append(string2);
        stringBuilder.append(" data region ");
        n3 = this.matrixWidth;
        stringBuilder.append(n3);
        n3 = 120;
        stringBuilder.append((char)n3);
        int n4 = this.matrixHeight;
        stringBuilder.append(n4);
        stringBuilder.append(", symbol size ");
        n4 = this.getSymbolWidth();
        stringBuilder.append(n4);
        stringBuilder.append((char)n3);
        n4 = this.getSymbolHeight();
        stringBuilder.append(n4);
        stringBuilder.append(", symbol data size ");
        n4 = this.getSymbolDataWidth();
        stringBuilder.append(n4);
        stringBuilder.append((char)n3);
        n3 = this.getSymbolDataHeight();
        stringBuilder.append(n3);
        stringBuilder.append(", codewords ");
        n3 = this.dataCapacity;
        stringBuilder.append(n3);
        stringBuilder.append('+');
        n3 = this.errorCodewords;
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }
}

