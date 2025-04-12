/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.decoder.BarcodeMetadata;
import com.google.zxing.pdf417.decoder.BarcodeValue;
import com.google.zxing.pdf417.decoder.BoundingBox;
import com.google.zxing.pdf417.decoder.Codeword;
import com.google.zxing.pdf417.decoder.DetectionResultColumn;

final class DetectionResultRowIndicatorColumn
extends DetectionResultColumn {
    private final boolean isLeft;

    public DetectionResultRowIndicatorColumn(BoundingBox boundingBox, boolean bl2) {
        super(boundingBox);
        this.isLeft = bl2;
    }

    /*
     * Unable to fully structure code
     */
    private void adjustIncompleteIndicatorColumnRowNumbers(BarcodeMetadata var1_1) {
        var2_2 = this.getBoundingBox();
        var3_3 = this.isLeft;
        var4_4 = var3_3 != 0 ? var2_2.getTopLeft() : var2_2.getTopRight();
        var5_5 = this.isLeft;
        var2_2 = var5_5 != false ? var2_2.getBottomLeft() : var2_2.getBottomRight();
        var6_6 = var4_4.getY();
        var3_3 = (int)var6_6;
        var7_7 = var2_2.getY();
        var8_8 = (int)var7_7;
        var8_8 = this.imageRowToCodewordIndex(var8_8);
        var9_9 = this.getCodewords();
        var10_10 = 1;
        var11_11 = -1;
        var12_12 = 0;
        var13_13 = 1;
        block0: for (var3_3 = this.imageRowToCodewordIndex(var3_3); var3_3 < var8_8; ++var3_3) {
            var14_14 = var9_9[var3_3];
            if (var14_14 == null) continue;
            var14_14.setRowNumberAsRowIndicatorColumn();
            var15_15 = var14_14.getRowNumber() - var11_11;
            if (var15_15 == 0) {
                ++var12_12;
                continue;
            }
            if (var15_15 == var10_10) {
                var13_13 = Math.max(var13_13, var12_12);
                var11_11 = var14_14.getRowNumber();
lbl27:
                // 2 sources

                while (true) {
                    var12_12 = 1;
                    continue block0;
                    break;
                }
            }
            var15_15 = var14_14.getRowNumber();
            if (var15_15 >= (var16_16 = var1_1.getRowCount())) {
                var14_14 = null;
                var9_9[var3_3] = null;
                continue;
            }
            var11_11 = var14_14.getRowNumber();
            ** continue;
        }
    }

    private void removeIncorrectCodewords(Codeword[] codewordArray, BarcodeMetadata barcodeMetadata) {
        int n3;
        for (int i3 = 0; i3 < (n3 = codewordArray.length); ++i3) {
            int n4;
            Codeword codeword = codewordArray[i3];
            if (codeword == null) continue;
            int n7 = codeword.getValue() % 30;
            n3 = codeword.getRowNumber();
            if (n3 > (n4 = barcodeMetadata.getRowCount())) {
                codewordArray[i3] = null;
                continue;
            }
            n4 = (int)(this.isLeft ? 1 : 0);
            if (n4 == 0) {
                n3 += 2;
            }
            n4 = 1;
            if ((n3 %= 3) != 0) {
                if (n3 != n4) {
                    n4 = 2;
                    if (n3 != n4 || ++n7 == (n3 = barcodeMetadata.getColumnCount())) continue;
                    codewordArray[i3] = null;
                    continue;
                }
                n3 = n7 / 3;
                n4 = barcodeMetadata.getErrorCorrectionLevel();
                if (n3 == n4 && (n7 %= 3) == (n3 = barcodeMetadata.getRowCountLowerPart())) continue;
                codewordArray[i3] = null;
                continue;
            }
            n3 = barcodeMetadata.getRowCountUpperPart();
            if ((n7 = n7 * 3 + n4) == n3) continue;
            codewordArray[i3] = null;
        }
    }

    private void setRowNumbers() {
        for (Codeword codeword : this.getCodewords()) {
            if (codeword == null) continue;
            codeword.setRowNumberAsRowIndicatorColumn();
        }
    }

    /*
     * Unable to fully structure code
     */
    public void adjustCompleteIndicatorColumnRowNumbers(BarcodeMetadata var1_1) {
        var2_2 = this.getCodewords();
        this.setRowNumbers();
        this.removeIncorrectCodewords(var2_2, var1_1);
        var3_3 = this.getBoundingBox();
        var4_4 = this.isLeft;
        var5_5 = var4_4 != 0 ? var3_3.getTopLeft() : var3_3.getTopRight();
        var6_6 = this.isLeft;
        var3_3 = var6_6 != false ? var3_3.getBottomLeft() : var3_3.getBottomRight();
        var7_7 = var5_5.getY();
        var4_4 = (int)var7_7;
        var8_8 = var3_3.getY();
        var9_9 = (int)var8_8;
        var9_9 = this.imageRowToCodewordIndex(var9_9);
        var6_6 = false;
        var10_10 = 1;
        var11_11 = -1;
        var12_12 = 0;
        var13_13 = 1;
        block0: for (var4_4 = this.imageRowToCodewordIndex(var4_4); var4_4 < var9_9; ++var4_4) {
            var14_14 = var2_2[var4_4];
            if (var14_14 == null) continue;
            var15_15 = var14_14.getRowNumber() - var11_11;
            if (var15_15 == 0) {
                ++var12_12;
                continue;
            }
            if (var15_15 == var10_10) {
                var13_13 = Math.max(var13_13, var12_12);
                var11_11 = var14_14.getRowNumber();
lbl29:
                // 2 sources

                while (true) {
                    var12_12 = 1;
                    continue block0;
                    break;
                }
            }
            if (var15_15 >= 0 && (var16_16 = var14_14.getRowNumber()) < (var17_17 = var1_1.getRowCount()) && var15_15 <= var4_4) {
                var16_16 = 2;
                if (var13_13 > var16_16) {
                    var16_16 = var13_13 + -2;
                    var15_15 *= var16_16;
                }
                if (var15_15 >= var4_4) {
                    var16_16 = 1;
                } else {
                    var16_16 = 0;
                    var18_18 = null;
                }
                for (var17_17 = 1; var17_17 <= var15_15 && var16_16 == 0; ++var17_17) {
                    var16_16 = var4_4 - var17_17;
                    var18_18 = var2_2[var16_16];
                    if (var18_18 != null) {
                        var16_16 = 1;
                        continue;
                    }
                    var16_16 = 0;
                    var18_18 = null;
                }
                if (var16_16 != 0) {
                    var2_2[var4_4] = null;
                    continue;
                }
                var11_11 = var14_14.getRowNumber();
                ** continue;
            }
            var2_2[var4_4] = null;
        }
    }

    public BarcodeMetadata getBarcodeMetadata() {
        int n3;
        Codeword[] codewordArray = this.getCodewords();
        BarcodeValue barcodeValue = new BarcodeValue();
        BarcodeValue barcodeValue2 = new BarcodeValue();
        BarcodeValue barcodeValue3 = new BarcodeValue();
        BarcodeValue barcodeValue4 = new BarcodeValue();
        int n4 = codewordArray.length;
        int n7 = 0;
        int[] nArray = null;
        while (true) {
            n3 = 3;
            if (n7 >= n4) break;
            Codeword codeword = codewordArray[n7];
            if (codeword != null) {
                codeword.setRowNumberAsRowIndicatorColumn();
                int n8 = codeword.getValue() % 30;
                int n10 = codeword.getRowNumber();
                boolean bl2 = this.isLeft;
                if (!bl2) {
                    n10 += 2;
                }
                n10 %= n3;
                n3 = 1;
                if (n10 != 0) {
                    if (n10 != n3) {
                        n3 = 2;
                        if (n10 == n3) {
                            barcodeValue.setValue(++n8);
                        }
                    } else {
                        n3 = n8 / 3;
                        barcodeValue4.setValue(n3);
                        barcodeValue3.setValue(n8 %= 3);
                    }
                } else {
                    n8 = n8 * 3 + n3;
                    barcodeValue2.setValue(n8);
                }
            }
            ++n7;
        }
        Object object = barcodeValue.getValue();
        n4 = ((int[])object).length;
        if (n4 != 0 && (n4 = ((int[])(object = barcodeValue2.getValue())).length) != 0 && (n4 = ((int[])(object = barcodeValue3.getValue())).length) != 0 && (n4 = ((int[])(object = barcodeValue4.getValue())).length) != 0 && (n4 = (object = barcodeValue.getValue())[0]) > 0) {
            object = barcodeValue2.getValue();
            n4 = object[0];
            nArray = barcodeValue3.getValue();
            n7 = nArray[0];
            if ((n4 += n7) >= n3) {
                object = barcodeValue2.getValue();
                n4 = object[0];
                nArray = barcodeValue3.getValue();
                n7 = nArray[0];
                if ((n4 += n7) <= (n7 = 90)) {
                    object = new BarcodeMetadata;
                    int n14 = barcodeValue.getValue()[0];
                    int n15 = barcodeValue2.getValue()[0];
                    int n16 = barcodeValue3.getValue()[0];
                    int n17 = barcodeValue4.getValue()[0];
                    object(n14, n15, n16, n17);
                    this.removeIncorrectCodewords(codewordArray, (BarcodeMetadata)object);
                    return object;
                }
            }
        }
        return null;
    }

    public int[] getRowHeights() {
        BarcodeMetadata barcodeMetadata = this.getBarcodeMetadata();
        if (barcodeMetadata == null) {
            return null;
        }
        this.adjustIncompleteIndicatorColumnRowNumbers(barcodeMetadata);
        int n3 = barcodeMetadata.getRowCount();
        int[] nArray = new int[n3];
        for (Codeword codeword : this.getCodewords()) {
            int n4;
            int n7;
            if (codeword == null || (n7 = codeword.getRowNumber()) >= n3) continue;
            nArray[n7] = n4 = nArray[n7] + 1;
        }
        return nArray;
    }

    public boolean isLeft() {
        return this.isLeft;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("IsLeft: ");
        boolean bl2 = this.isLeft;
        stringBuilder.append(bl2);
        stringBuilder.append('\n');
        String string2 = super.toString();
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

