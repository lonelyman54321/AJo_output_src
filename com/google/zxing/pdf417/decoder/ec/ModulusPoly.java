/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.pdf417.decoder.ec.ModulusGF;

final class ModulusPoly {
    private final int[] coefficients;
    private final ModulusGF field;

    public ModulusPoly(ModulusGF object, int[] nArray) {
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

    public ModulusPoly add(ModulusPoly object) {
        Object object2 = this.field;
        Object object3 = ((ModulusPoly)object).field;
        boolean bl2 = object2.equals(object3);
        if (bl2) {
            int n3;
            bl2 = this.isZero();
            if (bl2) {
                return object;
            }
            bl2 = ((ModulusPoly)object).isZero();
            if (bl2) {
                return this;
            }
            object2 = this.coefficients;
            int n4 = ((Object)object2).length;
            object = ((ModulusPoly)object).coefficients;
            int n7 = ((Object)object).length;
            if (n4 <= n7) {
                Object object4 = object2;
                object2 = object;
                object = object4;
            }
            n4 = ((Object)object2).length;
            object3 = new int[n4];
            n7 = ((Object)object2).length;
            int n8 = ((Object)object).length;
            System.arraycopy(object2, 0, object3, 0, n7 -= n8);
            for (n8 = n7; n8 < (n3 = ((Object)object2).length); ++n8) {
                ModulusGF modulusGF = this.field;
                Object object5 = n8 - n7;
                object5 = object[object5];
                Object object6 = object2[n8];
                n3 = modulusGF.add((int)object5, (int)object6);
                object3[n8] = n3;
            }
            object2 = this.field;
            object = new ModulusPoly((ModulusGF)object2, (int[])object3);
            return object;
        }
        object = new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        throw object;
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
                ModulusGF modulusGF = this.field;
                n8 = modulusGF.add(n8, n10);
            }
            return n8;
        }
        int[] nArray = this.coefficients;
        n4 = nArray[0];
        int n14 = nArray.length;
        while (n7 < n14) {
            ModulusGF modulusGF = this.field;
            n4 = modulusGF.multiply(n3, n4);
            int[] nArray2 = this.coefficients;
            int n15 = nArray2[n7];
            n4 = modulusGF.add(n4, n15);
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

    public ModulusPoly multiply(int n3) {
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
            ModulusGF modulusGF = this.field;
            int[] nArray2 = this.coefficients;
            int n8 = nArray2[i3];
            nArray[i3] = n7 = modulusGF.multiply(n8, n3);
        }
        object = this.field;
        ModulusPoly modulusPoly = new ModulusPoly((ModulusGF)object, nArray);
        return modulusPoly;
    }

    public ModulusPoly multiply(ModulusPoly object) {
        Object object2 = this.field;
        ModulusGF modulusGF = ((ModulusPoly)object).field;
        boolean bl2 = object2.equals(modulusGF);
        if (bl2) {
            bl2 = this.isZero();
            if (!bl2 && !(bl2 = ((ModulusPoly)object).isZero())) {
                object2 = this.coefficients;
                int n3 = ((Object)object2).length;
                object = ((ModulusPoly)object).coefficients;
                int n4 = ((Object)object).length;
                int n7 = n3 + n4 + -1;
                int[] nArray = new int[n7];
                for (int i3 = 0; i3 < n3; ++i3) {
                    Object object3 = object2[i3];
                    for (int i8 = 0; i8 < n4; ++i8) {
                        int n8;
                        int n10 = i3 + i8;
                        ModulusGF modulusGF2 = this.field;
                        int n14 = nArray[n10];
                        Object object4 = object[i8];
                        object4 = modulusGF2.multiply((int)object3, (int)object4);
                        nArray[n10] = n8 = modulusGF2.add(n14, (int)object4);
                    }
                }
                object2 = this.field;
                object = new ModulusPoly((ModulusGF)object2, nArray);
                return object;
            }
            return this.field.getZero();
        }
        object = new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        throw object;
    }

    public ModulusPoly multiplyByMonomial(int n3, int n4) {
        if (n3 >= 0) {
            if (n4 == 0) {
                return this.field.getZero();
            }
            Object object = this.coefficients;
            int n7 = ((int[])object).length;
            int[] nArray = new int[n3 += n7];
            for (int i3 = 0; i3 < n7; ++i3) {
                int n8;
                ModulusGF modulusGF = this.field;
                int[] nArray2 = this.coefficients;
                int n10 = nArray2[i3];
                nArray[i3] = n8 = modulusGF.multiply(n10, n4);
            }
            object = this.field;
            ModulusPoly modulusPoly = new ModulusPoly((ModulusGF)object, nArray);
            return modulusPoly;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public ModulusPoly negative() {
        Object object = this.coefficients;
        int n3 = ((int[])object).length;
        int[] nArray = new int[n3];
        ModulusGF modulusGF = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            ModulusGF modulusGF2 = this.field;
            int[] nArray2 = this.coefficients;
            int n7 = nArray2[i3];
            nArray[i3] = n4 = modulusGF2.subtract(0, n7);
        }
        object = new ModulusPoly;
        modulusGF = this.field;
        object(modulusGF, nArray);
        return object;
    }

    public ModulusPoly subtract(ModulusPoly object) {
        ModulusGF modulusGF = this.field;
        ModulusGF modulusGF2 = ((ModulusPoly)object).field;
        boolean bl2 = modulusGF.equals(modulusGF2);
        if (bl2) {
            bl2 = ((ModulusPoly)object).isZero();
            if (bl2) {
                return this;
            }
            object = ((ModulusPoly)object).negative();
            return this.add((ModulusPoly)object);
        }
        object = new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        throw object;
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
                stringBuilder.append(n7);
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

