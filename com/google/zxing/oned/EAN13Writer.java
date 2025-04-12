/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Reader;
import com.google.zxing.oned.OneDimensionalCodeWriter;
import com.google.zxing.oned.UPCEANReader;
import com.google.zxing.oned.UPCEANWriter;
import java.util.Map;

public final class EAN13Writer
extends UPCEANWriter {
    private static final int CODE_WIDTH = 95;

    public BitMatrix encode(String object, BarcodeFormat object2, int n3, int n4, Map map2) {
        BarcodeFormat barcodeFormat = BarcodeFormat.EAN_13;
        if (object2 == barcodeFormat) {
            return super.encode((String)object, (BarcodeFormat)((Object)object2), n3, n4, map2);
        }
        object2 = String.valueOf(object2);
        object2 = "Can only encode EAN_13, but got ".concat((String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean[] encode(String object) {
        int n3;
        int n4;
        int n7 = ((String)object).length();
        if (n7 != (n4 = 12)) {
            n3 = 13;
            if (n7 != n3) {
                String string2 = String.valueOf(n7);
                string2 = "Requested contents should be 12 or 13 digits long, but got ".concat(string2);
                object = new IllegalArgumentException(string2);
                throw object;
            }
            try {
                n7 = (int)(UPCEANReader.checkStandardUPCEANChecksum((CharSequence)object) ? 1 : 0);
                if (n7 == 0) {
                    String string3 = "Contents do not pass checksum";
                    object = new IllegalArgumentException(string3);
                    throw object;
                }
                break block12;
            }
            catch (FormatException formatException) {}
        } else {
            int n8;
            Object object2;
            block12: {
                try {
                    n7 = UPCEANReader.getStandardUPCEANChecksum((CharSequence)object);
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append((String)object);
                }
                catch (FormatException formatException) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(formatException);
                    throw illegalArgumentException;
                }
                ((StringBuilder)object2).append(n7);
                object = ((StringBuilder)object2).toString();
            }
            n7 = 0;
            Object var5_8 = null;
            n3 = ((String)object).charAt(0);
            int n10 = 10;
            n3 = Character.digit((char)n3, n10);
            n3 = EAN13Reader.FIRST_DIGIT_ENCODINGS[n3];
            int n14 = 95;
            boolean[] blArray = new boolean[n14];
            int[] nArray = UPCEANReader.START_END_PATTERN;
            int n15 = 1;
            int n16 = OneDimensionalCodeWriter.appendPattern(blArray, 0, nArray, n15 != 0);
            for (int i3 = 1; i3 <= (n8 = 6); n16 += n8, ++i3) {
                n8 = Character.digit(((String)object).charAt(i3), n10);
                int n17 = 6 - i3;
                if ((n17 = n3 >> n17 & n15) == n15) {
                    n8 += 10;
                }
                int[][] nArray2 = UPCEANReader.L_AND_G_PATTERNS;
                int[] nArray3 = nArray2[n8];
                n8 = OneDimensionalCodeWriter.appendPattern(blArray, n16, nArray3, false);
            }
            object2 = UPCEANReader.MIDDLE_PATTERN;
            n7 = OneDimensionalCodeWriter.appendPattern(blArray, n16, (int[])object2, false) + n16;
            n3 = 7;
            while (true) {
                if (n3 > n4) {
                    object = UPCEANReader.START_END_PATTERN;
                    OneDimensionalCodeWriter.appendPattern(blArray, n7, (int[])object, n15 != 0);
                    return blArray;
                }
                n16 = Character.digit(((String)object).charAt(n3), n10);
                int[][] nArray4 = UPCEANReader.L_PATTERNS;
                nArray = nArray4[n16];
                n16 = OneDimensionalCodeWriter.appendPattern(blArray, n7, nArray, n15 != 0);
                n7 += n16;
                ++n3;
            }
        }
        object = new IllegalArgumentException("Illegal contents");
        throw object;
    }
}

