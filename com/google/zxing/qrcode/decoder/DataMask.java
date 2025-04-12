/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.decoder;

import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.DataMask$1;
import com.google.zxing.qrcode.decoder.DataMask$2;
import com.google.zxing.qrcode.decoder.DataMask$3;
import com.google.zxing.qrcode.decoder.DataMask$4;
import com.google.zxing.qrcode.decoder.DataMask$5;
import com.google.zxing.qrcode.decoder.DataMask$6;
import com.google.zxing.qrcode.decoder.DataMask$7;
import com.google.zxing.qrcode.decoder.DataMask$8;

abstract class DataMask
extends Enum {
    private static final /* synthetic */ DataMask[] $VALUES;
    public static final /* enum */ DataMask DATA_MASK_000;
    public static final /* enum */ DataMask DATA_MASK_001;
    public static final /* enum */ DataMask DATA_MASK_010;
    public static final /* enum */ DataMask DATA_MASK_011;
    public static final /* enum */ DataMask DATA_MASK_100;
    public static final /* enum */ DataMask DATA_MASK_101;
    public static final /* enum */ DataMask DATA_MASK_110;
    public static final /* enum */ DataMask DATA_MASK_111;

    static {
        DataMask$1 dataMask$1 = new DataMask$1();
        DATA_MASK_000 = dataMask$1;
        int n3 = 1;
        DataMask$2 dataMask$2 = new DataMask$2();
        DATA_MASK_001 = dataMask$2;
        int n4 = 2;
        DataMask$3 dataMask$3 = new DataMask$3();
        DATA_MASK_010 = dataMask$3;
        int n7 = 3;
        DataMask$4 dataMask$4 = new DataMask$4();
        DATA_MASK_011 = dataMask$4;
        int n8 = 4;
        DataMask$5 dataMask$5 = new DataMask$5();
        DATA_MASK_100 = dataMask$5;
        int n10 = 5;
        DataMask$6 dataMask$6 = new DataMask$6();
        DATA_MASK_101 = dataMask$6;
        DataMask$7 dataMask$7 = new DataMask$7();
        DATA_MASK_110 = dataMask$7;
        int n14 = 7;
        DataMask$8 dataMask$8 = new DataMask$8();
        DATA_MASK_111 = dataMask$8;
        DataMask[] dataMaskArray = new DataMask[8];
        dataMaskArray[0] = dataMask$1;
        dataMaskArray[n3] = dataMask$2;
        dataMaskArray[n4] = dataMask$3;
        dataMaskArray[n7] = dataMask$4;
        dataMaskArray[n8] = dataMask$5;
        dataMaskArray[n10] = dataMask$6;
        dataMaskArray[6] = dataMask$7;
        dataMaskArray[n14] = dataMask$8;
        $VALUES = dataMaskArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private DataMask() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ DataMask(DataMask$1 varnull) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static DataMask valueOf(String string2) {
        return Enum.valueOf(DataMask.class, string2);
    }

    public static DataMask[] values() {
        return (DataMask[])$VALUES.clone();
    }

    public abstract boolean isMasked(int var1, int var2);

    public final void unmaskBitMatrix(BitMatrix bitMatrix, int n3) {
        for (int i3 = 0; i3 < n3; ++i3) {
            for (int i8 = 0; i8 < n3; ++i8) {
                boolean bl2 = this.isMasked(i3, i8);
                if (!bl2) continue;
                bitMatrix.flip(i8, i3);
            }
        }
    }
}

