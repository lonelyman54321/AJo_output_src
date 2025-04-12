/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.decoder.BarcodeMetadata;
import com.google.zxing.pdf417.decoder.BoundingBox;
import com.google.zxing.pdf417.decoder.Codeword;
import com.google.zxing.pdf417.decoder.DetectionResultColumn;
import com.google.zxing.pdf417.decoder.DetectionResultRowIndicatorColumn;
import java.util.Formatter;

final class DetectionResult {
    private static final int ADJUST_ROW_NUMBER_SKIP = 2;
    private final int barcodeColumnCount;
    private final BarcodeMetadata barcodeMetadata;
    private BoundingBox boundingBox;
    private final DetectionResultColumn[] detectionResultColumns;

    public DetectionResult(BarcodeMetadata detectionResultColumnArray, BoundingBox boundingBox) {
        int n3;
        this.barcodeMetadata = detectionResultColumnArray;
        this.barcodeColumnCount = n3 = detectionResultColumnArray.getColumnCount();
        this.boundingBox = boundingBox;
        detectionResultColumnArray = new DetectionResultColumn[n3 + 2];
        this.detectionResultColumns = detectionResultColumnArray;
    }

    private void adjustIndicatorColumnRowNumbers(DetectionResultColumn detectionResultColumn) {
        if (detectionResultColumn != null) {
            detectionResultColumn = (DetectionResultRowIndicatorColumn)detectionResultColumn;
            BarcodeMetadata barcodeMetadata = this.barcodeMetadata;
            ((DetectionResultRowIndicatorColumn)detectionResultColumn).adjustCompleteIndicatorColumnRowNumbers(barcodeMetadata);
        }
    }

    private static boolean adjustRowNumber(Codeword codeword, Codeword codeword2) {
        int n3;
        if (codeword2 == null) {
            return false;
        }
        int n4 = codeword2.hasValidRowNumber();
        if (n4 != 0 && (n4 = codeword2.getBucket()) == (n3 = codeword.getBucket())) {
            int n7 = codeword2.getRowNumber();
            codeword.setRowNumber(n7);
            return true;
        }
        return false;
    }

    private static int adjustRowNumberIfValid(int n3, int n4, Codeword codeword) {
        if (codeword == null) {
            return n4;
        }
        boolean bl2 = codeword.hasValidRowNumber();
        if (!bl2) {
            bl2 = codeword.isValidRowNumber(n3);
            if (bl2) {
                codeword.setRowNumber(n3);
                n4 = 0;
            } else {
                ++n4;
            }
        }
        return n4;
    }

    private int adjustRowNumbers() {
        int n3;
        int n4 = this.adjustRowNumbersByRow();
        if (n4 == 0) {
            return 0;
        }
        int n7 = 1;
        for (int i3 = 1; i3 < (n3 = this.barcodeColumnCount + n7); ++i3) {
            int n8;
            Codeword[] codewordArray = this.detectionResultColumns[i3].getCodewords();
            for (int i8 = 0; i8 < (n8 = codewordArray.length); ++i8) {
                Codeword codeword = codewordArray[i8];
                if (codeword == null || (n8 = (int)(codeword.hasValidRowNumber() ? 1 : 0)) != 0) continue;
                this.adjustRowNumbers(i3, i8, codewordArray);
            }
        }
        return n4;
    }

    private void adjustRowNumbers(int n3, int n4, Codeword[] object) {
        Object object2;
        int n7;
        Object object3;
        Object object4;
        Codeword codeword = object[n4];
        Object object5 = this.detectionResultColumns;
        int n8 = n3 + -1;
        object5 = object5[n8].getCodewords();
        DetectionResultColumn[] detectionResultColumnArray = this.detectionResultColumns;
        int n10 = 1;
        Object object6 = detectionResultColumnArray[n3 += n10];
        object6 = object6 != null ? object6.getCodewords() : object5;
        n8 = 14;
        Codeword[] codewordArray = new Codeword[n8];
        Object object7 = object5[n4];
        int n14 = 2;
        codewordArray[n14] = object7;
        object7 = object6[n4];
        int n15 = 3;
        codewordArray[n15] = object7;
        int n16 = 0;
        object7 = null;
        if (n4 > 0) {
            n15 = n4 + -1;
            object4 = object[n15];
            codewordArray[0] = object4;
            codewordArray[4] = object3 = object5[n15];
            n7 = 5;
            codewordArray[n7] = object2 = object6[n15];
        }
        if (n4 > n10) {
            n15 = n4 + -2;
            object4 = object[n15];
            int n17 = 8;
            codewordArray[n17] = object4;
            codewordArray[10] = object3 = object5[n15];
            n7 = 11;
            codewordArray[n7] = object2 = object6[n15];
        }
        if (n4 < (n15 = ((Codeword[])object).length - n10)) {
            n15 = n4 + 1;
            object4 = object[n15];
            codewordArray[n10] = object4;
            codewordArray[6] = object4 = object5[n15];
            n10 = 7;
            codewordArray[n10] = object2 = object6[n15];
        }
        if (n4 < (n10 = ((Codeword[])object).length - n14)) {
            object = object[n4 += n14];
            n10 = 9;
            codewordArray[n10] = object;
            codewordArray[12] = object5 = object5[n4];
            int n18 = 13;
            codewordArray[n18] = object6 = object6[n4];
        }
        while (n16 < n8) {
            object6 = codewordArray[n16];
            n3 = (int)(DetectionResult.adjustRowNumber(codeword, (Codeword)object6) ? 1 : 0);
            if (n3 != 0) {
                return;
            }
            ++n16;
        }
    }

    private int adjustRowNumbersByRow() {
        this.adjustRowNumbersFromBothRI();
        int n3 = this.adjustRowNumbersFromLRI();
        int n4 = this.adjustRowNumbersFromRRI();
        return n3 + n4;
    }

    private void adjustRowNumbersFromBothRI() {
        Object object = this.detectionResultColumns;
        Object[] objectArray = object[0];
        if (objectArray != null) {
            int n3 = this.barcodeColumnCount;
            int n4 = 1;
            if ((object = object[n3 += n4]) != null) {
                object = objectArray.getCodewords();
                objectArray = this.detectionResultColumns;
                n3 = this.barcodeColumnCount + n4;
                objectArray = objectArray[n3].getCodewords();
                for (int i3 = 0; i3 < (n3 = ((DetectionResultColumn[])object).length); ++i3) {
                    int n7;
                    Object object2;
                    DetectionResultColumn detectionResultColumn = object[i3];
                    if (detectionResultColumn == null || (object2 = objectArray[i3]) == null || (n3 = ((Codeword)((Object)detectionResultColumn)).getRowNumber()) != (n7 = (object2 = objectArray[i3]).getRowNumber())) continue;
                    for (n3 = 1; n3 <= (n7 = this.barcodeColumnCount); ++n3) {
                        object2 = this.detectionResultColumns[n3].getCodewords()[i3];
                        if (object2 == null) continue;
                        DetectionResultColumn detectionResultColumn2 = object[i3];
                        int n8 = ((Codeword)((Object)detectionResultColumn2)).getRowNumber();
                        object2.setRowNumber(n8);
                        n7 = (int)(object2.hasValidRowNumber() ? 1 : 0);
                        if (n7 != 0) continue;
                        object2 = this.detectionResultColumns[n3].getCodewords();
                        n8 = 0;
                        detectionResultColumn2 = null;
                        object2[i3] = null;
                    }
                }
            }
        }
    }

    private int adjustRowNumbersFromLRI() {
        int n3;
        Codeword[] codewordArray = this.detectionResultColumns[0];
        if (codewordArray == null) {
            return 0;
        }
        codewordArray = codewordArray.getCodewords();
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = codewordArray.length); ++i3) {
            int n7;
            Codeword codeword = codewordArray[i3];
            if (codeword == null) continue;
            n3 = codeword.getRowNumber();
            int n8 = 1;
            int n10 = 0;
            for (int i8 = 1; i8 < (n7 = this.barcodeColumnCount + n8) && n10 < (n7 = 2); ++i8) {
                Codeword codeword2 = this.detectionResultColumns[i8].getCodewords()[i3];
                if (codeword2 == null) continue;
                n10 = DetectionResult.adjustRowNumberIfValid(n3, n10, codeword2);
                n7 = (int)(codeword2.hasValidRowNumber() ? 1 : 0);
                if (n7 != 0) continue;
                ++n4;
            }
        }
        return n4;
    }

    private int adjustRowNumbersFromRRI() {
        int n3;
        Object[] objectArray = this.detectionResultColumns;
        int n4 = this.barcodeColumnCount;
        int n7 = n4 + 1;
        DetectionResultColumn detectionResultColumn = objectArray[n7];
        if (detectionResultColumn == null) {
            return 0;
        }
        objectArray = objectArray[++n4].getCodewords();
        n7 = 0;
        detectionResultColumn = null;
        for (n4 = 0; n4 < (n3 = objectArray.length); ++n4) {
            int n8;
            Object object = objectArray[n4];
            if (object == null) continue;
            n3 = ((Codeword)object).getRowNumber();
            int n10 = 0;
            for (int i3 = this.barcodeColumnCount + 1; i3 > 0 && n10 < (n8 = 2); i3 += -1) {
                Codeword codeword = this.detectionResultColumns[i3].getCodewords()[n4];
                if (codeword == null) continue;
                n10 = DetectionResult.adjustRowNumberIfValid(n3, n10, codeword);
                n8 = (int)(codeword.hasValidRowNumber() ? 1 : 0);
                if (n8 != 0) continue;
                ++n7;
            }
        }
        return n7;
    }

    public int getBarcodeColumnCount() {
        return this.barcodeColumnCount;
    }

    public int getBarcodeECLevel() {
        return this.barcodeMetadata.getErrorCorrectionLevel();
    }

    public int getBarcodeRowCount() {
        return this.barcodeMetadata.getRowCount();
    }

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public DetectionResultColumn getDetectionResultColumn(int n3) {
        return this.detectionResultColumns[n3];
    }

    public DetectionResultColumn[] getDetectionResultColumns() {
        Object object = this.detectionResultColumns[0];
        this.adjustIndicatorColumnRowNumbers((DetectionResultColumn)object);
        object = this.detectionResultColumns;
        int n3 = this.barcodeColumnCount + 1;
        object = object[n3];
        this.adjustIndicatorColumnRowNumbers((DetectionResultColumn)object);
        int n4 = 928;
        while ((n3 = this.adjustRowNumbers()) > 0 && n3 < n4) {
            n4 = n3;
        }
        return this.detectionResultColumns;
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    public void setDetectionResultColumn(int n3, DetectionResultColumn detectionResultColumn) {
        this.detectionResultColumns[n3] = detectionResultColumn;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String toString() {
        int n3 = 2;
        int n4 = 1;
        Object object = this.detectionResultColumns;
        DetectionResultColumn detectionResultColumn = object[0];
        if (detectionResultColumn == null) {
            int n7 = this.barcodeColumnCount + n4;
            detectionResultColumn = object[n7];
        }
        object = new Formatter();
        int n8 = 0;
        try {
            while (true) {
                int n10;
                Object object2;
                int n14;
                if (n8 >= (n14 = ((Codeword[])(object2 = detectionResultColumn.getCodewords())).length)) {
                    String string2 = ((Formatter)object).toString();
                    ((Formatter)object).close();
                    return string2;
                }
                object2 = "CW %3d:";
                Object object3 = Integer.valueOf(n8);
                Object object4 = new Object[n4];
                object4[0] = object3;
                ((Formatter)object).format((String)object2, object4);
                object2 = null;
                for (n14 = 0; n14 < (n10 = this.barcodeColumnCount + n3); n14 += n4) {
                    object3 = this.detectionResultColumns;
                    object3 = object3[n14];
                    object4 = "    |   ";
                    if (object3 == null) {
                        object3 = new Object[]{};
                        ((Formatter)object).format((String)object4, (Object[])object3);
                        continue;
                    }
                    object3 = ((DetectionResultColumn)object3).getCodewords();
                    if ((object3 = object3[n8]) == null) {
                        object3 = new Object[]{};
                        ((Formatter)object).format((String)object4, (Object[])object3);
                        continue;
                    }
                    object4 = " %3d|%3d";
                    int n15 = ((Codeword)object3).getRowNumber();
                    Integer n16 = n15;
                    n10 = ((Codeword)object3).getValue();
                    object3 = n10;
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = n16;
                    objectArray[n4] = object3;
                    ((Formatter)object).format((String)object4, objectArray);
                }
                object2 = "%n";
                object3 = new Object[]{};
                ((Formatter)object).format((String)object2, (Object[])object3);
                n8 += n4;
            }
        }
        catch (Throwable throwable) {}
        try {
            throw throwable;
        }
        catch (Throwable throwable) {
            try {
                ((Formatter)object).close();
                throw throwable;
            }
            catch (Throwable throwable2) {
                throwable.addSuppressed(throwable2);
            }
            throw throwable;
        }
    }
}

