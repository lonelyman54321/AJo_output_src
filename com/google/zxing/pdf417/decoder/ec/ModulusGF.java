/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.pdf417.decoder.ec.ModulusPoly;

public final class ModulusGF {
    public static final ModulusGF PDF417_GF;
    private final int[] expTable;
    private final int[] logTable;
    private final int modulus;
    private final ModulusPoly one;
    private final ModulusPoly zero;

    static {
        ModulusGF modulusGF;
        PDF417_GF = modulusGF = new ModulusGF(929, 3);
    }

    private ModulusGF(int n3, int n4) {
        ModulusPoly modulusPoly;
        int n7;
        this.modulus = n3;
        int[] nArray = new int[n3];
        this.expTable = nArray;
        nArray = new int[n3];
        this.logTable = nArray;
        int n8 = 1;
        int[] nArray2 = null;
        int n10 = 1;
        for (n7 = 0; n7 < n3; ++n7) {
            int[] nArray3 = this.expTable;
            nArray3[n7] = n10;
            n10 = n10 * n4 % n3;
        }
        n4 = 0;
        int[] nArray4 = null;
        while (n4 < (n7 = n3 + -1)) {
            nArray2 = this.logTable;
            int[] nArray5 = this.expTable;
            n10 = nArray5[n4];
            nArray2[n10] = n4++;
        }
        nArray4 = new int[]{0};
        this.zero = modulusPoly = new ModulusPoly(this, nArray4);
        nArray4 = new int[]{n8};
        this.one = modulusPoly = new ModulusPoly(this, nArray4);
    }

    public int add(int n3, int n4) {
        n3 += n4;
        n4 = this.modulus;
        return n3 % n4;
    }

    public ModulusPoly buildMonomial(int n3, int n4) {
        if (n3 >= 0) {
            if (n4 == 0) {
                return this.zero;
            }
            int[] nArray = new int[n3 + 1];
            nArray[0] = n4;
            ModulusPoly modulusPoly = new ModulusPoly(this, nArray);
            return modulusPoly;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public int exp(int n3) {
        return this.expTable[n3];
    }

    public ModulusPoly getOne() {
        return this.one;
    }

    public int getSize() {
        return this.modulus;
    }

    public ModulusPoly getZero() {
        return this.zero;
    }

    public int inverse(int n3) {
        if (n3 != 0) {
            int[] nArray = this.expTable;
            int n4 = this.modulus;
            n3 = this.logTable[n3];
            n4 = n4 - n3 + -1;
            return nArray[n4];
        }
        ArithmeticException arithmeticException = new ArithmeticException();
        throw arithmeticException;
    }

    public int log(int n3) {
        if (n3 != 0) {
            return this.logTable[n3];
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public int multiply(int n3, int n4) {
        if (n3 != 0 && n4 != 0) {
            int[] nArray = this.expTable;
            int[] nArray2 = this.logTable;
            n3 = nArray2[n3];
            n4 = nArray2[n4];
            n3 += n4;
            n4 = this.modulus + -1;
            return nArray[n3 %= n4];
        }
        return 0;
    }

    public int subtract(int n3, int n4) {
        int n7 = this.modulus;
        return (n3 + n7 - n4) % n7;
    }
}

