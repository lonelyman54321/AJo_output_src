/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common.reedsolomon;

import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.GenericGFPoly;
import com.google.zxing.common.reedsolomon.ReedSolomonException;

public final class ReedSolomonDecoder {
    private final GenericGF field;

    public ReedSolomonDecoder(GenericGF genericGF) {
        this.field = genericGF;
    }

    private int[] findErrorLocations(GenericGFPoly object) {
        GenericGF genericGF;
        int n3;
        int n4;
        int n7 = ((GenericGFPoly)object).getDegree();
        if (n7 == (n4 = 1)) {
            int n8 = ((GenericGFPoly)object).getCoefficient(n4);
            return new int[]{n8};
        }
        int[] nArray = new int[n7];
        int n10 = 0;
        while (n4 < (n3 = (genericGF = this.field).getSize()) && n10 < n7) {
            n3 = ((GenericGFPoly)object).evaluateAt(n4);
            if (n3 == 0) {
                genericGF = this.field;
                nArray[n10] = n3 = genericGF.inverse(n4);
                ++n10;
            }
            ++n4;
        }
        if (n10 == n7) {
            return nArray;
        }
        object = new ReedSolomonException("Error locator degree does not match number of roots");
        throw object;
    }

    private int[] findErrorMagnitudes(GenericGFPoly genericGFPoly, int[] nArray) {
        int n3 = nArray.length;
        int[] nArray2 = new int[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            GenericGF genericGF;
            int n4;
            int n7;
            GenericGF genericGF2 = this.field;
            int n8 = nArray[i3];
            int n10 = genericGF2.inverse(n8);
            n8 = 1;
            GenericGF genericGF3 = null;
            for (n7 = 0; n7 < n3; ++n7) {
                if (i3 == n7) continue;
                GenericGF genericGF4 = this.field;
                int n14 = nArray[n7];
                n4 = genericGF4.multiply(n14, n10);
                n4 = (n14 = n4 & 1) == 0 ? (n4 |= 1) : (n4 &= 0xFFFFFFFE);
                genericGF = this.field;
                n8 = genericGF.multiply(n8, n4);
            }
            genericGF3 = this.field;
            n4 = genericGFPoly.evaluateAt(n10);
            genericGF = this.field;
            n8 = genericGF.inverse(n8);
            nArray2[i3] = n8 = genericGF3.multiply(n4, n8);
            GenericGF genericGF5 = this.field;
            n8 = genericGF5.getGeneratorBase();
            if (n8 == 0) continue;
            genericGF5 = this.field;
            n7 = nArray2[i3];
            nArray2[i3] = n10 = genericGF5.multiply(n7, n10);
        }
        return nArray2;
    }

    private GenericGFPoly[] runEuclideanAlgorithm(GenericGFPoly object, GenericGFPoly object2, int n3) {
        GenericGFPoly genericGFPoly;
        GenericGFPoly[] genericGFPolyArray;
        int n4;
        block4: {
            block5: {
                int n7;
                int n8;
                int n10;
                n4 = 2;
                int n14 = ((GenericGFPoly)object).getDegree();
                if (n14 < (n10 = object2.getDegree())) {
                    genericGFPolyArray = object2;
                    object2 = object;
                    object = genericGFPolyArray;
                }
                GenericGFPoly genericGFPoly2 = this.field.getZero();
                GenericGFPoly genericGFPoly3 = this.field.getOne();
                do {
                    int n15;
                    int n16;
                    genericGFPolyArray = object2;
                    object2 = object;
                    object = genericGFPolyArray;
                    genericGFPoly = genericGFPoly3;
                    genericGFPoly3 = genericGFPoly2;
                    genericGFPoly2 = genericGFPoly;
                    n8 = genericGFPolyArray.getDegree();
                    if (n8 < (n7 = n3 / 2)) break block4;
                    n8 = (int)(genericGFPolyArray.isZero() ? 1 : 0);
                    if (n8 != 0) break block5;
                    GenericGFPoly genericGFPoly4 = this.field.getZero();
                    n7 = genericGFPolyArray.getDegree();
                    n7 = genericGFPolyArray.getCoefficient(n7);
                    Object object3 = this.field;
                    n7 = ((GenericGF)object3).inverse(n7);
                    while ((n16 = object2.getDegree()) >= (n15 = ((GenericGFPoly)object).getDegree()) && (n16 = (int)(object2.isZero() ? 1 : 0)) == 0) {
                        n16 = object2.getDegree();
                        n15 = ((GenericGFPoly)object).getDegree();
                        n16 -= n15;
                        GenericGF genericGF = this.field;
                        int n17 = object2.getDegree();
                        n17 = object2.getCoefficient(n17);
                        n15 = genericGF.multiply(n17, n7);
                        GenericGFPoly genericGFPoly5 = this.field.buildMonomial(n16, n15);
                        genericGFPoly4 = genericGFPoly4.addOrSubtract(genericGFPoly5);
                        object3 = ((GenericGFPoly)object).multiplyByMonomial(n16, n15);
                        object2 = object2.addOrSubtract((GenericGFPoly)object3);
                    }
                    genericGFPoly4 = genericGFPoly4.multiply(genericGFPoly2);
                    genericGFPoly3 = genericGFPoly4.addOrSubtract(genericGFPoly3);
                } while ((n8 = object2.getDegree()) < (n7 = ((GenericGFPoly)object).getDegree()));
                object = new IllegalStateException("Division algorithm failed to reduce polynomial?");
                throw object;
            }
            object = new ReedSolomonException("r_{i-1} was zero");
            throw object;
        }
        int n18 = genericGFPoly.getCoefficient(0);
        if (n18 != 0) {
            n18 = this.field.inverse(n18);
            GenericGFPoly genericGFPoly6 = genericGFPoly.multiply(n18);
            object = genericGFPolyArray.multiply(n18);
            object2 = new GenericGFPoly[n4];
            object2[0] = genericGFPoly6;
            object2[1] = object;
            return object2;
        }
        object = new ReedSolomonException("sigmaTilde(0) was zero");
        throw object;
    }

    public void decode(int[] object, int n3) {
        int n4;
        int n7;
        Object object2 = this.field;
        Object object3 = new GenericGFPoly((GenericGF)object2, (int[])object);
        object2 = new int[n3];
        int n8 = 1;
        int n10 = 0;
        GenericGF genericGF = null;
        Object object4 = true;
        for (n7 = 0; n7 < n3; ++n7) {
            GenericGF genericGF2 = this.field;
            int n14 = genericGF2.getGeneratorBase() + n7;
            int n15 = genericGF2.exp(n14);
            n15 = ((GenericGFPoly)object3).evaluateAt(n15);
            n14 = n3 + -1 - n7;
            object2[n14] = n15;
            if (n15 == 0) continue;
            object4 = false;
        }
        if (object4) {
            return;
        }
        genericGF = this.field;
        object3 = new GenericGFPoly(genericGF, (int[])object2);
        object2 = this.field.buildMonomial(n3, n8);
        Object object5 = this.runEuclideanAlgorithm((GenericGFPoly)object2, (GenericGFPoly)object3, n3);
        object3 = object5[0];
        object5 = object5[n8];
        object3 = this.findErrorLocations((GenericGFPoly)object3);
        object5 = this.findErrorMagnitudes((GenericGFPoly)object5, (int[])object3);
        while (n10 < (n4 = ((Object)object3).length)) {
            n4 = ((int[])object).length - n8;
            genericGF = this.field;
            object4 = object3[n10];
            n7 = genericGF.log((int)object4);
            if ((n4 -= n7) >= 0) {
                n7 = object[n4];
                object4 = object5[n10];
                object[n4] = n7 = GenericGF.addOrSubtract(n7, (int)object4);
                ++n10;
                continue;
            }
            object = new ReedSolomonException;
            object("Bad error location");
            throw object;
        }
    }
}

