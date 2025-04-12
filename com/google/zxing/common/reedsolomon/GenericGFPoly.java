/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common.reedsolomon;

import com.google.zxing.common.reedsolomon.GenericGF;

final class GenericGFPoly {
    private final int[] coefficients;
    private final GenericGF field;

    public GenericGFPoly(GenericGF object, int[] nArray) {
        int n3 = nArray.length;
        if (n3 != 0) {
            int n4;
            this.field = object;
            int n7 = nArray.length;
            n3 = 1;
            if (n7 > n3 && (n4 = nArray[0]) == 0) {
                while (n3 < n7 && (n4 = nArray[n3]) == 0) {
                    ++n3;
                }
                if (n3 == n7) {
                    object = new int[]{0};
                    this.coefficients = (int[])object;
                    return;
                }
                object = new int[n7 - n3];
                this.coefficients = (int[])object;
                n4 = ((Object)object).length;
                System.arraycopy(nArray, n3, object, 0, n4);
                return;
            }
            this.coefficients = nArray;
            return;
        }
        object = new IllegalArgumentException();
        throw object;
    }

    public GenericGFPoly addOrSubtract(GenericGFPoly object) {
        Object object2 = this.field;
        Object object3 = ((GenericGFPoly)object).field;
        boolean bl2 = object2.equals(object3);
        if (bl2) {
            Object object4;
            bl2 = this.isZero();
            if (bl2) {
                return object;
            }
            bl2 = ((GenericGFPoly)object).isZero();
            if (bl2) {
                return this;
            }
            object2 = this.coefficients;
            int n3 = ((Object)object2).length;
            object = ((GenericGFPoly)object).coefficients;
            int n4 = ((Object)object).length;
            if (n3 <= n4) {
                Object object5 = object2;
                object2 = object;
                object = object5;
            }
            n3 = ((Object)object2).length;
            object3 = new int[n3];
            n4 = ((Object)object2).length;
            int n7 = ((Object)object).length;
            System.arraycopy(object2, 0, object3, 0, n4 -= n7);
            for (n7 = n4; n7 < (object4 = ((Object)object2).length); ++n7) {
                object4 = n7 - n4;
                object4 = object[object4];
                Object object6 = object2[n7];
                object4 = GenericGF.addOrSubtract(object4, (int)object6);
                object3[n7] = object4;
            }
            object2 = this.field;
            object = new GenericGFPoly((GenericGF)object2, (int[])object3);
            return object;
        }
        object = new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        throw object;
    }

    public GenericGFPoly[] divide(GenericGFPoly genericGFPolyArray) {
        Object object = this.field;
        GenericGF genericGF = genericGFPolyArray.field;
        boolean bl2 = object.equals(genericGF);
        if (bl2) {
            bl2 = genericGFPolyArray.isZero();
            if (!bl2) {
                int n3;
                int n4;
                object = this.field.getZero();
                int n7 = genericGFPolyArray.getDegree();
                n7 = genericGFPolyArray.getCoefficient(n7);
                n7 = this.field.inverse(n7);
                GenericGFPoly genericGFPoly = this;
                while ((n4 = genericGFPoly.getDegree()) >= (n3 = genericGFPolyArray.getDegree()) && (n4 = (int)(genericGFPoly.isZero() ? 1 : 0)) == 0) {
                    n4 = genericGFPoly.getDegree();
                    n3 = genericGFPolyArray.getDegree();
                    n4 -= n3;
                    GenericGF genericGF2 = this.field;
                    int n8 = genericGFPoly.getDegree();
                    n8 = genericGFPoly.getCoefficient(n8);
                    n3 = genericGF2.multiply(n8, n7);
                    GenericGFPoly genericGFPoly2 = genericGFPolyArray.multiplyByMonomial(n4, n3);
                    GenericGF genericGF3 = this.field;
                    GenericGFPoly genericGFPoly3 = genericGF3.buildMonomial(n4, n3);
                    object = ((GenericGFPoly)object).addOrSubtract(genericGFPoly3);
                    genericGFPoly = genericGFPoly.addOrSubtract(genericGFPoly2);
                }
                genericGFPolyArray = new GenericGFPoly[]{object, genericGFPoly};
                return genericGFPolyArray;
            }
            genericGFPolyArray = new IllegalArgumentException("Divide by 0");
            throw genericGFPolyArray;
        }
        genericGFPolyArray = new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        throw genericGFPolyArray;
    }

    public int evaluateAt(int n3) {
        int n4;
        if (n3 == 0) {
            return this.getCoefficient(0);
        }
        int n7 = 1;
        if (n3 == n7) {
            int[] nArray = this.coefficients;
            n7 = nArray.length;
            int n8 = 0;
            Object var6_7 = null;
            for (n4 = 0; n4 < n7; ++n4) {
                int n10 = nArray[n4];
                n8 = GenericGF.addOrSubtract(n8, n10);
            }
            return n8;
        }
        int[] nArray = this.coefficients;
        n4 = nArray[0];
        int n14 = nArray.length;
        while (n7 < n14) {
            n4 = this.field.multiply(n3, n4);
            int[] nArray2 = this.coefficients;
            int n15 = nArray2[n7];
            n4 = GenericGF.addOrSubtract(n4, n15);
            ++n7;
        }
        return n4;
    }

    public int getCoefficient(int n3) {
        int[] nArray = this.coefficients;
        int n4 = nArray.length + -1 - n3;
        return nArray[n4];
    }

    public int[] getCoefficients() {
        return this.coefficients;
    }

    public int getDegree() {
        return this.coefficients.length + -1;
    }

    public boolean isZero() {
        int[] nArray = this.coefficients;
        int n3 = nArray[0];
        return n3 == 0;
    }

    public GenericGFPoly multiply(int n3) {
        if (n3 == 0) {
            return this.field.getZero();
        }
        int n4 = 1;
        if (n3 == n4) {
            return this;
        }
        Object object = this.coefficients;
        n4 = ((int[])object).length;
        int[] nArray = new int[n4];
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7;
            GenericGF genericGF = this.field;
            int[] nArray2 = this.coefficients;
            int n8 = nArray2[i3];
            nArray[i3] = n7 = genericGF.multiply(n8, n3);
        }
        object = this.field;
        GenericGFPoly genericGFPoly = new GenericGFPoly((GenericGF)object, nArray);
        return genericGFPoly;
    }

    public GenericGFPoly multiply(GenericGFPoly object) {
        Object object2 = this.field;
        GenericGF genericGF = ((GenericGFPoly)object).field;
        boolean bl2 = object2.equals(genericGF);
        if (bl2) {
            bl2 = this.isZero();
            if (!bl2 && !(bl2 = ((GenericGFPoly)object).isZero())) {
                object2 = this.coefficients;
                int n3 = ((Object)object2).length;
                object = ((GenericGFPoly)object).coefficients;
                int n4 = ((Object)object).length;
                int n7 = n3 + n4 + -1;
                int[] nArray = new int[n7];
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object object3 = object2[i3];
                    for (int i8 = 0; i8 < n4; ++i8) {
                        int n8 = i3 + i8;
                        int n10 = nArray[n8];
                        GenericGF genericGF2 = this.field;
                        Object object4 = object[i8];
                        int n14 = genericGF2.multiply((int)object3, (int)object4);
                        nArray[n8] = n10 = GenericGF.addOrSubtract(n10, n14);
                    }
                }
                object2 = this.field;
                object = new GenericGFPoly((GenericGF)object2, nArray);
                return object;
            }
            return this.field.getZero();
        }
        object = new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        throw object;
    }

    public GenericGFPoly multiplyByMonomial(int n3, int n4) {
        if (n3 >= 0) {
            if (n4 == 0) {
                return this.field.getZero();
            }
            Object object = this.coefficients;
            int n7 = ((int[])object).length;
            int[] nArray = new int[n3 += n7];
            for (int i3 = 0; i3 < n7; ++i3) {
                int n8;
                GenericGF genericGF = this.field;
                int[] nArray2 = this.coefficients;
                int n10 = nArray2[i3];
                nArray[i3] = n8 = genericGF.multiply(n10, n4);
            }
            object = this.field;
            GenericGFPoly genericGFPoly = new GenericGFPoly((GenericGF)object, nArray);
            return genericGFPoly;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public String toString() {
        int n3 = this.getDegree() * 8;
        StringBuilder stringBuilder = new StringBuilder(n3);
        for (n3 = this.getDegree(); n3 >= 0; n3 += -1) {
            int n4;
            String string2;
            int n7 = this.getCoefficient(n3);
            if (n7 == 0) continue;
            if (n7 < 0) {
                string2 = " - ";
                stringBuilder.append(string2);
                n7 = -n7;
            } else {
                n4 = stringBuilder.length();
                if (n4 > 0) {
                    string2 = " + ";
                    stringBuilder.append(string2);
                }
            }
            n4 = 1;
            if (n3 == 0 || n7 != n4) {
                Object object = this.field;
                if ((n7 = ((GenericGF)object).log(n7)) == 0) {
                    n7 = 49;
                    stringBuilder.append((char)n7);
                } else if (n7 == n4) {
                    n7 = 97;
                    stringBuilder.append((char)n7);
                } else {
                    object = "a^";
                    stringBuilder.append((String)object);
                    stringBuilder.append(n7);
                }
            }
            if (n3 == 0) continue;
            if (n3 == n4) {
                n7 = 120;
                stringBuilder.append((char)n7);
                continue;
            }
            String string3 = "x^";
            stringBuilder.append(string3);
            stringBuilder.append(n3);
        }
        return stringBuilder.toString();
    }
}

