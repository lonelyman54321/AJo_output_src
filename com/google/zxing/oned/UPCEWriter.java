/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.OneDimensionalCodeWriter;
import com.google.zxing.oned.UPCEANReader;
import com.google.zxing.oned.UPCEANWriter;
import com.google.zxing.oned.UPCEReader;
import java.util.Map;

public final class UPCEWriter
extends UPCEANWriter {
    private static final int CODE_WIDTH = 51;

    public BitMatrix encode(String object, BarcodeFormat object2, int n3, int n4, Map map2) {
        BarcodeFormat barcodeFormat = BarcodeFormat.UPC_E;
        if (object2 == barcodeFormat) {
            return super.encode((String)object, (BarcodeFormat)((Object)object2), n3, n4, map2);
        }
        object2 = String.valueOf(object2);
        object2 = "Can only encode UPC_E, but got ".concat((String)object2);
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
        if (n7 != (n4 = 7)) {
            n3 = 8;
            if (n7 != n3) {
                String string2 = String.valueOf(n7);
                string2 = "Requested contents should be 8 digits long, but got ".concat(string2);
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
            Object object2;
            String string4;
            block12: {
                try {
                    string4 = UPCEReader.convertUPCEtoUPCA((String)object);
                    n7 = UPCEANReader.getStandardUPCEANChecksum(string4);
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
            string4 = null;
            n3 = ((String)object).charAt(0);
            int n8 = 10;
            n3 = Character.digit((char)n3, n8);
            int n10 = 1;
            if (n3 != 0 && n3 != n10) {
                object = new IllegalArgumentException("Number system must be 0 or 1");
                throw object;
            }
            n4 = Character.digit(((String)object).charAt(n4), n8);
            n4 = UPCEReader.NUMSYS_AND_CHECK_DIGIT_PATTERNS[n3][n4];
            n3 = 51;
            object2 = new boolean[n3];
            int[] nArray = UPCEANReader.START_END_PATTERN;
            int n14 = OneDimensionalCodeWriter.appendPattern((boolean[])object2, 0, nArray, n10 != 0);
            int n15 = 1;
            while (true) {
                int n16;
                if (n15 > (n16 = 6)) {
                    object = UPCEANReader.END_PATTERN;
                    OneDimensionalCodeWriter.appendPattern((boolean[])object2, n14, (int[])object, false);
                    return object2;
                }
                n16 = Character.digit(((String)object).charAt(n15), n8);
                int n17 = 6 - n15;
                if ((n17 = n4 >> n17 & n10) == n10) {
                    n16 += 10;
                }
                int[][] nArray2 = UPCEANReader.L_AND_G_PATTERNS;
                int[] nArray3 = nArray2[n16];
                n16 = OneDimensionalCodeWriter.appendPattern((boolean[])object2, n14, nArray3, false);
                n14 += n16;
                ++n15;
            }
        }
        object = new IllegalArgumentException("Illegal contents");
        throw object;
    }
}

