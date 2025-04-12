/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

public abstract class OneDimensionalCodeWriter
implements Writer {
    public static int appendPattern(boolean[] blArray, int n3, int[] nArray, boolean bl2) {
        int n4 = nArray.length;
        int n7 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n8 = nArray[i3];
            for (int i8 = 0; i8 < n8; ++i8) {
                int n10 = n3 + 1;
                blArray[n3] = bl2;
                n3 = n10;
            }
            n7 += n8;
            bl2 ^= true;
        }
        return n7;
    }

    private static BitMatrix renderResult(boolean[] blArray, int n3, int n4, int n7) {
        int n8 = blArray.length;
        n3 = Math.max(n3, n7 += n8);
        n4 = Math.max(1, n4);
        n7 = n3 / n7;
        int n10 = n8 * n7;
        n10 = (n3 - n10) / 2;
        BitMatrix bitMatrix = new BitMatrix(n3, n4);
        n3 = 0;
        int n14 = 0;
        while (n14 < n8) {
            boolean bl2 = blArray[n14];
            if (bl2) {
                bitMatrix.setRegion(n10, 0, n7, n4);
            }
            ++n14;
            n10 += n7;
        }
        return bitMatrix;
    }

    public final BitMatrix encode(String string2, BarcodeFormat barcodeFormat, int n3, int n4) {
        return this.encode(string2, barcodeFormat, n3, n4, null);
    }

    public BitMatrix encode(String object, BarcodeFormat object2, int n3, int n4, Map map2) {
        boolean n7 = ((String)object).isEmpty();
        if (!n7) {
            if (n3 >= 0 && n4 >= 0) {
                int n8;
                EncodeHintType encodeHintType;
                boolean bl2;
                int n10 = this.getDefaultMargin();
                if (map2 != null && (bl2 = map2.containsKey((Object)(encodeHintType = EncodeHintType.MARGIN)))) {
                    object2 = map2.get((Object)encodeHintType).toString();
                    n8 = Integer.parseInt((String)object2);
                }
                return OneDimensionalCodeWriter.renderResult(this.encode((String)object), n3, n4, n8);
            }
            object2 = new StringBuilder("Negative size is not allowed. Input: ");
            ((StringBuilder)object2).append(n3);
            ((StringBuilder)object2).append('x');
            ((StringBuilder)object2).append(n4);
            object2 = ((StringBuilder)object2).toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object = new IllegalArgumentException("Found empty contents");
        throw object;
    }

    public abstract boolean[] encode(String var1);

    public int getDefaultMargin() {
        return 10;
    }
}

