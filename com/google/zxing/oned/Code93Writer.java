/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code93Reader;
import com.google.zxing.oned.OneDimensionalCodeWriter;
import java.util.Map;

public class Code93Writer
extends OneDimensionalCodeWriter {
    private static int appendPattern(boolean[] blArray, int n3, int[] nArray) {
        for (int n4 : nArray) {
            int n7 = n3 + 1;
            n4 = n4 != 0 ? 1 : 0;
            blArray[n3] = n4;
            n3 = n7;
        }
        return 9;
    }

    public static int appendPattern(boolean[] blArray, int n3, int[] nArray, boolean bl2) {
        return Code93Writer.appendPattern(blArray, n3, nArray);
    }

    private static int computeChecksumIndex(String string2, int n3) {
        int n4 = string2.length();
        int n7 = 1;
        n4 -= n7;
        int n8 = 0;
        int n10 = 1;
        while (n4 >= 0) {
            String string3 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
            char c2 = string2.charAt(n4);
            int n14 = string3.indexOf(c2) * n10;
            n8 += n14;
            if ((n10 += n7) > n3) {
                n10 = 1;
            }
            n4 += -1;
        }
        return n8 % 47;
    }

    private static void toIntArray(int n3, int[] nArray) {
        int n4;
        for (int i3 = 0; i3 < (n4 = 9); ++i3) {
            n4 = 8 - i3;
            int n7 = 1;
            if ((n4 = n7 << n4 & n3) == 0) {
                n7 = 0;
            }
            nArray[i3] = n7;
        }
    }

    public BitMatrix encode(String object, BarcodeFormat object2, int n3, int n4, Map map2) {
        BarcodeFormat barcodeFormat = BarcodeFormat.CODE_93;
        if (object2 == barcodeFormat) {
            return super.encode((String)object, (BarcodeFormat)((Object)object2), n3, n4, map2);
        }
        object2 = String.valueOf(object2);
        object2 = "Can only encode CODE_93, but got ".concat((String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public boolean[] encode(String object) {
        int n3;
        int n4 = ((String)object).length();
        if (n4 <= (n3 = 80)) {
            int n7;
            String string2;
            int[] nArray = new int[9];
            int n8 = (((String)object).length() + 4) * 9;
            n3 = 1;
            int[] nArray2 = Code93Reader.CHARACTER_ENCODINGS;
            int n10 = 47;
            Code93Writer.toIntArray(nArray2[n10], nArray);
            boolean[] blArray = new boolean[n8 += n3];
            int n14 = 0;
            nArray2 = null;
            int n15 = Code93Writer.appendPattern(blArray, 0, nArray);
            while (true) {
                string2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
                if (n14 >= n4) break;
                n7 = ((String)object).charAt(n14);
                int n16 = string2.indexOf(n7);
                int[] nArray3 = Code93Reader.CHARACTER_ENCODINGS;
                Code93Writer.toIntArray(nArray3[n16], nArray);
                n16 = Code93Writer.appendPattern(blArray, n15, nArray);
                n15 += n16;
                ++n14;
            }
            n4 = Code93Writer.computeChecksumIndex((String)object, 20);
            nArray2 = Code93Reader.CHARACTER_ENCODINGS;
            Code93Writer.toIntArray(nArray2[n4], nArray);
            n7 = Code93Writer.appendPattern(blArray, n15, nArray);
            n15 += n7;
            object = Ex0.a((String)object);
            n4 = string2.charAt(n4);
            ((StringBuilder)object).append((char)n4);
            int n17 = Code93Writer.computeChecksumIndex(((StringBuilder)object).toString(), 15);
            Code93Writer.toIntArray(nArray2[n17], nArray);
            n17 = Code93Writer.appendPattern(blArray, n15, nArray);
            n15 += n17;
            Code93Writer.toIntArray(nArray2[n10], nArray);
            n17 = Code93Writer.appendPattern(blArray, n15, nArray);
            blArray[n15 += n17] = n3;
            return blArray;
        }
        String string3 = String.valueOf(n4);
        string3 = "Requested contents should be less than 80 digits long, but got ".concat(string3);
        object = new IllegalArgumentException(string3);
        throw object;
    }
}

