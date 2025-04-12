/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.common.reedsolomon;

import com.google.zxing.common.reedsolomon.GenericGFPoly;

public final class GenericGF {
    public static final GenericGF AZTEC_DATA_10;
    public static final GenericGF AZTEC_DATA_12;
    public static final GenericGF AZTEC_DATA_6;
    public static final GenericGF AZTEC_DATA_8;
    public static final GenericGF AZTEC_PARAM;
    public static final GenericGF DATA_MATRIX_FIELD_256;
    public static final GenericGF MAXICODE_FIELD_64;
    public static final GenericGF QR_CODE_FIELD_256;
    private final int[] expTable;
    private final int generatorBase;
    private final int[] logTable;
    private final GenericGFPoly one;
    private final int primitive;
    private final int size;
    private final GenericGFPoly zero;

    static {
        GenericGF genericGF;
        GenericGF genericGF2;
        int n3 = 1;
        AZTEC_DATA_12 = genericGF2 = new GenericGF(4201, 4096, n3);
        AZTEC_DATA_10 = genericGF2 = new GenericGF(1033, 1024, n3);
        AZTEC_DATA_6 = genericGF2 = new GenericGF(67, 64, n3);
        AZTEC_PARAM = genericGF = new GenericGF(19, 16, n3);
        int n4 = 256;
        QR_CODE_FIELD_256 = genericGF = new GenericGF(285, n4, 0);
        DATA_MATRIX_FIELD_256 = genericGF = new GenericGF(301, n4, n3);
        AZTEC_DATA_8 = genericGF;
        MAXICODE_FIELD_64 = genericGF2;
    }

    public GenericGF(int n3, int n4, int n7) {
        int n8;
        this.primitive = n3;
        this.size = n4;
        this.generatorBase = n7;
        int[] nArray = new int[n4];
        this.expTable = nArray;
        nArray = new int[n4];
        this.logTable = nArray;
        n7 = 1;
        int[] nArray2 = null;
        int n10 = 1;
        for (n8 = 0; n8 < n4; ++n8) {
            int[] nArray3 = this.expTable;
            nArray3[n8] = n10;
            if ((n10 <<= n7) < n4) continue;
            n10 ^= n3;
            int n14 = n4 + -1;
            n10 &= n14;
        }
        n3 = 0;
        GenericGFPoly genericGFPoly = null;
        while (n3 < (n8 = n4 + -1)) {
            nArray2 = this.logTable;
            int[] nArray4 = this.expTable;
            n10 = nArray4[n3];
            nArray2[n10] = n3++;
        }
        int[] nArray5 = new int[]{0};
        this.zero = genericGFPoly = new GenericGFPoly(this, nArray5);
        nArray5 = new int[]{n7};
        this.one = genericGFPoly = new GenericGFPoly(this, nArray5);
    }

    public static int addOrSubtract(int n3, int n4) {
        return n3 ^ n4;
    }

    public GenericGFPoly buildMonomial(int n3, int n4) {
        if (n3 >= 0) {
            if (n4 == 0) {
                return this.zero;
            }
            int[] nArray = new int[n3 + 1];
            nArray[0] = n4;
            GenericGFPoly genericGFPoly = new GenericGFPoly(this, nArray);
            return genericGFPoly;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    public int exp(int n3) {
        return this.expTable[n3];
    }

    public int getGeneratorBase() {
        return this.generatorBase;
    }

    public GenericGFPoly getOne() {
        return this.one;
    }

    public int getSize() {
        return this.size;
    }

    public GenericGFPoly getZero() {
        return this.zero;
    }

    public int inverse(int n3) {
        if (n3 != 0) {
            int[] nArray = this.expTable;
            int n4 = this.size;
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
            n4 = this.size + -1;
            return nArray[n3 %= n4];
        }
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("GF(0x");
        String string2 = Integer.toHexString(this.primitive);
        stringBuilder.append(string2);
        stringBuilder.append(',');
        int n3 = this.size;
        return tu.a(stringBuilder, n3, ')');
    }
}

