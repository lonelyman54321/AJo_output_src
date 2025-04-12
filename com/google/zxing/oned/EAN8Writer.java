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
import java.util.Map;

public final class EAN8Writer
extends UPCEANWriter {
    private static final int CODE_WIDTH = 67;

    public BitMatrix encode(String object, BarcodeFormat object2, int n3, int n4, Map map2) {
        BarcodeFormat barcodeFormat = BarcodeFormat.EAN_8;
        if (object2 == barcodeFormat) {
            return super.encode((String)object, (BarcodeFormat)((Object)object2), n3, n4, map2);
        }
        object2 = String.valueOf(object2);
        object2 = "Can only encode EAN_8, but got ".concat((String)object2);
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
                break block11;
            }
            catch (FormatException formatException) {}
        } else {
            int n8;
            Object object2;
            block11: {
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
            n7 = 67;
            boolean[] blArray = new boolean[n7];
            object2 = UPCEANReader.START_END_PATTERN;
            int n10 = 0;
            boolean bl2 = true;
            n3 = OneDimensionalCodeWriter.appendPattern(blArray, 0, (int[])object2, bl2);
            int n14 = 0;
            Object var10_14 = null;
            while (true) {
                int n15 = 3;
                n8 = 10;
                if (n14 > n15) break;
                n15 = Character.digit(((String)object).charAt(n14), n8);
                int[][] nArray = UPCEANReader.L_PATTERNS;
                int[] nArray2 = nArray[n15];
                n15 = OneDimensionalCodeWriter.appendPattern(blArray, n3, nArray2, false);
                n3 += n15;
                ++n14;
            }
            int[] nArray = UPCEANReader.MIDDLE_PATTERN;
            n10 = OneDimensionalCodeWriter.appendPattern(blArray, n3, nArray, false) + n3;
            n3 = 4;
            while (true) {
                if (n3 > n4) {
                    object = UPCEANReader.START_END_PATTERN;
                    OneDimensionalCodeWriter.appendPattern(blArray, n10, (int[])object, bl2);
                    return blArray;
                }
                n14 = Character.digit(((String)object).charAt(n3), n8);
                int[][] nArray3 = UPCEANReader.L_PATTERNS;
                int[] nArray4 = nArray3[n14];
                n14 = OneDimensionalCodeWriter.appendPattern(blArray, n10, nArray4, bl2);
                n10 += n14;
                ++n3;
            }
        }
        object = new IllegalArgumentException("Illegal contents");
        throw object;
    }
}

