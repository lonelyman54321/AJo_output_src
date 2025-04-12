/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.ChecksumException;
import com.google.zxing.pdf417.decoder.ec.ModulusGF;
import com.google.zxing.pdf417.decoder.ec.ModulusPoly;

public final class ErrorCorrection {
    private final ModulusGF field;

    public ErrorCorrection() {
        ModulusGF modulusGF;
        this.field = modulusGF = ModulusGF.PDF417_GF;
    }

    private int[] findErrorLocations(ModulusPoly modulusPoly) {
        ModulusGF modulusGF;
        int n3;
        int n4 = modulusPoly.getDegree();
        int[] nArray = new int[n4];
        int n7 = 0;
        for (int i3 = 1; i3 < (n3 = (modulusGF = this.field).getSize()) && n7 < n4; ++i3) {
            n3 = modulusPoly.evaluateAt(i3);
            if (n3 != 0) continue;
            modulusGF = this.field;
            nArray[n7] = n3 = modulusGF.inverse(i3);
            ++n7;
        }
        if (n7 == n4) {
            return nArray;
        }
        throw ChecksumException.getChecksumInstance();
    }

    private int[] findErrorMagnitudes(ModulusPoly modulusPoly, ModulusPoly modulusPoly2, int[] nArray) {
        int n3;
        int n4;
        ModulusGF modulusGF;
        int n7;
        int n8;
        int n10 = modulusPoly2.getDegree();
        int[] nArray2 = new int[n10];
        for (n8 = 1; n8 <= n10; ++n8) {
            n7 = n10 - n8;
            modulusGF = this.field;
            n4 = modulusPoly2.getCoefficient(n8);
            nArray2[n7] = n3 = modulusGF.multiply(n8, n4);
        }
        ModulusGF modulusGF2 = this.field;
        modulusPoly2 = new ModulusPoly(modulusGF2, nArray2);
        n10 = nArray.length;
        nArray2 = new int[n10];
        n8 = 0;
        for (n7 = 0; n7 < n10; ++n7) {
            modulusGF = this.field;
            n4 = nArray[n7];
            n3 = modulusGF.inverse(n4);
            ModulusGF modulusGF3 = this.field;
            int n14 = modulusPoly.evaluateAt(n3);
            n4 = modulusGF3.subtract(0, n14);
            ModulusGF modulusGF4 = this.field;
            n3 = modulusPoly2.evaluateAt(n3);
            n3 = modulusGF4.inverse(n3);
            modulusGF4 = this.field;
            nArray2[n7] = n3 = modulusGF4.multiply(n4, n3);
        }
        return nArray2;
    }

    private ModulusPoly[] runEuclideanAlgorithm(ModulusPoly modulusPoly, ModulusPoly object, int n3) {
        ModulusPoly modulusPoly2;
        ModulusPoly[] modulusPolyArray;
        int n4;
        block4: {
            int n7;
            n4 = 2;
            int n8 = modulusPoly.getDegree();
            if (n8 < (n7 = object.getDegree())) {
                modulusPolyArray = object;
                object = modulusPoly;
                modulusPoly = modulusPolyArray;
            }
            ModulusPoly modulusPoly3 = this.field.getZero();
            ModulusPoly modulusPoly4 = this.field.getOne();
            while (true) {
                int n10;
                int n14;
                int n15;
                modulusPolyArray = object;
                object = modulusPoly;
                modulusPoly = modulusPolyArray;
                modulusPoly2 = modulusPoly4;
                modulusPoly4 = modulusPoly3;
                modulusPoly3 = modulusPoly2;
                int n16 = modulusPolyArray.getDegree();
                if (n16 < (n15 = n3 / 2)) break block4;
                n16 = (int)(modulusPolyArray.isZero() ? 1 : 0);
                if (n16 != 0) break;
                ModulusPoly modulusPoly5 = this.field.getZero();
                n15 = modulusPolyArray.getDegree();
                n15 = modulusPolyArray.getCoefficient(n15);
                Object object2 = this.field;
                n15 = ((ModulusGF)object2).inverse(n15);
                while ((n14 = object.getDegree()) >= (n10 = modulusPoly.getDegree()) && (n14 = (int)(object.isZero() ? 1 : 0)) == 0) {
                    n14 = object.getDegree();
                    n10 = modulusPoly.getDegree();
                    n14 -= n10;
                    ModulusGF modulusGF = this.field;
                    int n17 = object.getDegree();
                    n17 = object.getCoefficient(n17);
                    n10 = modulusGF.multiply(n17, n15);
                    ModulusPoly modulusPoly6 = this.field.buildMonomial(n14, n10);
                    modulusPoly5 = modulusPoly5.add(modulusPoly6);
                    object2 = modulusPoly.multiplyByMonomial(n14, n10);
                    object = object.subtract((ModulusPoly)object2);
                }
                modulusPoly5 = modulusPoly5.multiply(modulusPoly3);
                modulusPoly4 = modulusPoly5.subtract(modulusPoly4).negative();
            }
            throw ChecksumException.getChecksumInstance();
        }
        int n18 = modulusPoly2.getCoefficient(0);
        if (n18 != 0) {
            n18 = this.field.inverse(n18);
            ModulusPoly modulusPoly7 = modulusPoly2.multiply(n18);
            modulusPoly = modulusPolyArray.multiply(n18);
            object = new ModulusPoly[n4];
            object[0] = modulusPoly7;
            object[1] = modulusPoly;
            return object;
        }
        throw ChecksumException.getChecksumInstance();
    }

    public int decode(int[] nArray, int n3, int[] object) {
        int n4;
        Object object2;
        Object object3;
        int n7;
        Object object4 = this.field;
        Object object5 = new ModulusPoly((ModulusGF)object4, nArray);
        object4 = new int[n3];
        int n8 = 0;
        Object object6 = n3;
        Object object7 = 0;
        while (true) {
            n7 = 1;
            if (object6 <= 0) break;
            object3 = this.field;
            object2 = ((ModulusGF)object3).exp((int)object6);
            object2 = ((ModulusPoly)object5).evaluateAt((int)object2);
            int n10 = n3 - object6;
            object4[n10] = object2;
            if (object2 != 0) {
                object7 = 1;
            }
            object6 += -1;
        }
        if (object7 == 0) {
            return 0;
        }
        object5 = this.field.getOne();
        if (object != null) {
            object6 = ((Object)object).length;
            for (object7 = 0; object7 < object6; ++object7) {
                object2 = object[object7];
                Object object8 = this.field;
                int n14 = nArray.length - n7 - object2;
                object2 = ((ModulusGF)object8).exp(n14);
                ModulusGF modulusGF = this.field;
                object2 = modulusGF.subtract(0, (int)object2);
                object3 = new int[]{object2, n7};
                object8 = new ModulusPoly(modulusGF, (int[])object3);
                object5 = ((ModulusPoly)object5).multiply((ModulusPoly)object8);
            }
        }
        object5 = this.field;
        ModulusPoly modulusPoly = new ModulusPoly((ModulusGF)object5, (int[])object4);
        object5 = this.field.buildMonomial(n3, n7);
        Object object9 = this.runEuclideanAlgorithm((ModulusPoly)object5, modulusPoly, n3);
        ModulusPoly modulusPoly2 = object9[0];
        object9 = object9[n7];
        object5 = this.findErrorLocations(modulusPoly2);
        object9 = this.findErrorMagnitudes((ModulusPoly)object9, modulusPoly2, (int[])object5);
        while (n8 < (n4 = ((Object)object5).length)) {
            n4 = nArray.length - n7;
            object4 = this.field;
            object6 = object5[n8];
            int n15 = ((ModulusGF)object4).log((int)object6);
            if ((n4 -= n15) >= 0) {
                object4 = this.field;
                object6 = nArray[n4];
                object7 = object9[n8];
                nArray[n4] = n15 = ((ModulusGF)object4).subtract((int)object6, (int)object7);
                ++n8;
                continue;
            }
            throw ChecksumException.getChecksumInstance();
        }
        return ((Object)object5).length;
    }
}

