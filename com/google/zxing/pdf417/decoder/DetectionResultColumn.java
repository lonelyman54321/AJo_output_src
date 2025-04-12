/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.decoder.BoundingBox;
import com.google.zxing.pdf417.decoder.Codeword;
import java.util.Formatter;

class DetectionResultColumn {
    private static final int MAX_NEARBY_DISTANCE = 5;
    private final BoundingBox boundingBox;
    private final Codeword[] codewords;

    public DetectionResultColumn(BoundingBox codewordArray) {
        BoundingBox boundingBox;
        this.boundingBox = boundingBox = new BoundingBox((BoundingBox)codewordArray);
        int n3 = codewordArray.getMaxY();
        int n4 = codewordArray.getMinY();
        codewordArray = new Codeword[n3 - n4 + 1];
        this.codewords = codewordArray;
    }

    public final BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    public final Codeword getCodeword(int n3) {
        Codeword[] codewordArray = this.codewords;
        n3 = this.imageRowToCodewordIndex(n3);
        return codewordArray[n3];
    }

    public final Codeword getCodewordNearby(int n3) {
        int n4;
        Codeword codeword = this.getCodeword(n3);
        if (codeword != null) {
            return codeword;
        }
        for (int i3 = 1; i3 < (n4 = 5); ++i3) {
            int n7;
            Codeword[] codewordArray;
            Codeword codeword2;
            n4 = this.imageRowToCodewordIndex(n3) - i3;
            if (n4 >= 0 && (codeword2 = (codewordArray = this.codewords)[n4]) != null) {
                return codeword2;
            }
            n4 = this.imageRowToCodewordIndex(n3) + i3;
            if (n4 >= (n7 = (codewordArray = this.codewords).length) || (codeword2 = codewordArray[n4]) == null) continue;
            return codeword2;
        }
        return null;
    }

    public final Codeword[] getCodewords() {
        return this.codewords;
    }

    public final int imageRowToCodewordIndex(int n3) {
        int n4 = this.boundingBox.getMinY();
        return n3 - n4;
    }

    public final void setCodeword(int n3, Codeword codeword) {
        Codeword[] codewordArray = this.codewords;
        n3 = this.imageRowToCodewordIndex(n3);
        codewordArray[n3] = codeword;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String toString() {
        Integer n3;
        int n4;
        int n7;
        int n8;
        Codeword[] codewordArray;
        Formatter formatter;
        int n10;
        String string2;
        block10: {
            string2 = null;
            n10 = 1;
            formatter = new Formatter();
            try {
                codewordArray = this.codewords;
                n8 = codewordArray.length;
                n7 = 0;
                n4 = 0;
                n3 = null;
                break block10;
            }
            catch (Throwable throwable) {}
            try {
                throw throwable;
            }
            catch (Throwable throwable) {
                try {
                    formatter.close();
                    throw throwable;
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
        }
        while (true) {
            if (n7 >= n8) {
                string2 = formatter.toString();
                formatter.close();
                return string2;
            }
            Object object = codewordArray[n7];
            if (object == null) {
                object = "%3d:    |   %n";
                int n14 = n4 + 1;
                n3 = n4;
                Object[] objectArray = new Object[n10];
                objectArray[0] = n3;
                formatter.format((String)object, objectArray);
                n4 = n14;
            } else {
                String string3 = "%3d: %3d|%3d%n";
                int n15 = n4 + 1;
                n3 = n4;
                int n16 = ((Codeword)object).getRowNumber();
                Integer n17 = n16;
                int n18 = ((Codeword)object).getValue();
                object = n18;
                int n19 = 3;
                Object[] objectArray = new Object[n19];
                objectArray[0] = n3;
                objectArray[n10] = n17;
                n4 = 2;
                objectArray[n4] = object;
                formatter.format(string3, objectArray);
                n4 = n15;
            }
            n7 += n10;
        }
    }
}

