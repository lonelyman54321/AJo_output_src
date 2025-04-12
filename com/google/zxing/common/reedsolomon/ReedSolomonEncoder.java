/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common.reedsolomon;

import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.GenericGFPoly;
import java.util.ArrayList;
import java.util.List;

public final class ReedSolomonEncoder {
    private final List cachedGenerators;
    private final GenericGF field;

    public ReedSolomonEncoder(GenericGF genericGF) {
        ArrayList<GenericGFPoly> arrayList;
        this.field = genericGF;
        this.cachedGenerators = arrayList = new ArrayList<GenericGFPoly>();
        int[] nArray = new int[]{1};
        GenericGFPoly genericGFPoly = new GenericGFPoly(genericGF, nArray);
        arrayList.add(genericGFPoly);
    }

    private GenericGFPoly buildGenerator(int n3) {
        Object object = this.cachedGenerators;
        int n4 = object.size();
        if (n3 >= n4) {
            object = this.cachedGenerators;
            int n7 = 1;
            object = (GenericGFPoly)on_2.d(n7, (List)object);
            List list = this.cachedGenerators;
            for (int i3 = list.size(); i3 <= n3; ++i3) {
                GenericGF genericGF = this.field;
                int n8 = i3 + -1;
                int n10 = genericGF.getGeneratorBase() + n8;
                n8 = genericGF.exp(n10);
                int[] nArray = new int[]{n7, n8};
                Object object2 = new GenericGFPoly(genericGF, nArray);
                object = ((GenericGFPoly)object).multiply((GenericGFPoly)object2);
                object2 = this.cachedGenerators;
                object2.add(object);
            }
        }
        return (GenericGFPoly)this.cachedGenerators.get(n3);
    }

    public void encode(int[] object, int n3) {
        if (n3 != 0) {
            int n4 = ((int[])object).length - n3;
            if (n4 > 0) {
                Object object2 = this.buildGenerator(n3);
                int[] nArray = new int[n4];
                System.arraycopy(object, 0, nArray, 0, n4);
                GenericGF genericGF = this.field;
                GenericGFPoly genericGFPoly = new GenericGFPoly(genericGF, nArray);
                int n7 = 1;
                genericGFPoly = genericGFPoly.multiplyByMonomial(n3, n7);
                object2 = genericGFPoly.divide((GenericGFPoly)object2)[n7].getCoefficients();
                n7 = ((Object)object2).length;
                n3 -= n7;
                nArray = null;
                for (n7 = 0; n7 < n3; ++n7) {
                    int n8 = n4 + n7;
                    object[n8] = 0;
                }
                n4 += n3;
                n3 = ((Object)object2).length;
                System.arraycopy(object2, 0, object, n4, n3);
                return;
            }
            object = new IllegalArgumentException;
            object("No data bytes provided");
            throw object;
        }
        object = new IllegalArgumentException;
        object("No error correction bytes");
        throw object;
    }
}

