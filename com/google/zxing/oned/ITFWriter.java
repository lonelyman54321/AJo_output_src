/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.OneDimensionalCodeWriter;
import java.util.Map;

public final class ITFWriter
extends OneDimensionalCodeWriter {
    private static final int[] END_PATTERN;
    private static final int N = 1;
    private static final int[][] PATTERNS;
    private static final int[] START_PATTERN;
    private static final int W = 3;

    static {
        int n3 = 1;
        START_PATTERN = new int[]{n3, n3, n3, n3};
        int n4 = 3;
        END_PATTERN = new int[]{n4, n3, n3};
        int[][] nArrayArray = new int[10][];
        int[] nArray = new int[]{n3, n3, n4, n4, n3};
        nArrayArray[0] = nArray;
        nArray = new int[]{n4, n3, n3, n3, n4};
        nArrayArray[n3] = nArray;
        nArray = new int[]{n3, n4, n3, n3, n4};
        nArrayArray[2] = nArray;
        nArray = new int[]{n4, n4, n3, n3, n3};
        nArrayArray[n4] = nArray;
        nArray = new int[]{n3, n3, n4, n3, n4};
        nArrayArray[4] = nArray;
        nArray = new int[]{n4, n3, n4, n3, n3};
        nArrayArray[5] = nArray;
        nArray = new int[]{n3, n4, n4, n3, n3};
        nArrayArray[6] = nArray;
        nArray = new int[]{n3, n3, n3, n4, n4};
        nArrayArray[7] = nArray;
        nArray = new int[]{n4, n3, n3, n4, n3};
        nArrayArray[8] = nArray;
        int[] nArray2 = new int[]{n3, n4, n3, n4, n3};
        nArrayArray[9] = nArray2;
        PATTERNS = nArrayArray;
    }

    public BitMatrix encode(String object, BarcodeFormat object2, int n3, int n4, Map map2) {
        BarcodeFormat barcodeFormat = BarcodeFormat.ITF;
        if (object2 == barcodeFormat) {
            return super.encode((String)object, (BarcodeFormat)((Object)object2), n3, n4, map2);
        }
        object2 = String.valueOf(object2);
        object2 = "Can only encode ITF, but got ".concat((String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public boolean[] encode(String object) {
        int n3 = ((String)object).length();
        int n4 = n3 % 2;
        if (n4 == 0) {
            n4 = 80;
            if (n3 <= n4) {
                n4 = n3 * 9 + 9;
                boolean[] blArray = new boolean[n4];
                int[] nArray = START_PATTERN;
                int n7 = 1;
                int n8 = OneDimensionalCodeWriter.appendPattern(blArray, 0, nArray, n7 != 0);
                for (int i3 = 0; i3 < n3; i3 += 2) {
                    int n10;
                    int n14 = ((String)object).charAt(i3);
                    int n15 = 10;
                    n14 = Character.digit((char)n14, n15);
                    int n16 = i3 + 1;
                    n16 = Character.digit(((String)object).charAt(n16), n15);
                    int[] nArray2 = new int[n15];
                    for (int i8 = 0; i8 < (n10 = 5); ++i8) {
                        int n17;
                        n10 = i8 * 2;
                        Object object2 = PATTERNS;
                        int[] nArray3 = object2[n14];
                        nArray2[n10] = n17 = nArray3[i8];
                        object2 = object2[n16];
                        int[] nArray4 = object2[i8];
                        nArray2[n10 += n7] = (int)nArray4;
                    }
                    n14 = OneDimensionalCodeWriter.appendPattern(blArray, n8, nArray2, n7 != 0);
                    n8 += n14;
                }
                object = END_PATTERN;
                OneDimensionalCodeWriter.appendPattern(blArray, n8, (int[])object, n7 != 0);
                return blArray;
            }
            String string2 = String.valueOf(n3);
            string2 = "Requested contents should be less than 80 digits long, but got ".concat(string2);
            object = new IllegalArgumentException(string2);
            throw object;
        }
        object = new IllegalArgumentException("The length of the input should be even");
        throw object;
    }
}

