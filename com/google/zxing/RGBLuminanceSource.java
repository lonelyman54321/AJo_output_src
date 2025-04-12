/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.LuminanceSource;

public final class RGBLuminanceSource
extends LuminanceSource {
    private final int dataHeight;
    private final int dataWidth;
    private final int left;
    private final byte[] luminances;
    private final int top;

    public RGBLuminanceSource(int n3, int n4, int[] nArray) {
        super(n3, n4);
        this.dataWidth = n3;
        this.dataHeight = n4;
        this.left = 0;
        this.top = 0;
        byte[] byArray = new byte[n3 *= n4];
        this.luminances = byArray;
        for (int i3 = 0; i3 < n3; ++i3) {
            n4 = nArray[i3];
            int n7 = n4 >> 16 & 0xFF;
            int n8 = n4 >> 7 & 0x1FE;
            byte[] byArray2 = this.luminances;
            n7 = (n7 + n8 + (n4 &= 0xFF)) / 4;
            byArray2[i3] = n4 = (int)((byte)n7);
        }
    }

    private RGBLuminanceSource(byte[] object, int n3, int n4, int n7, int n8, int n10, int n14) {
        super(n10, n14);
        if ((n10 += n7) <= n3 && (n14 += n8) <= n4) {
            this.luminances = object;
            this.dataWidth = n3;
            this.dataHeight = n4;
            this.left = n7;
            this.top = n8;
            return;
        }
        object = new IllegalArgumentException;
        super("Crop rectangle does not fit within image data.");
        throw object;
    }

    public LuminanceSource crop(int n3, int n4, int n7, int n8) {
        byte[] byArray = this.luminances;
        int n10 = this.dataWidth;
        int n14 = this.dataHeight;
        int n15 = this.left + n3;
        int n16 = this.top + n4;
        RGBLuminanceSource rGBLuminanceSource = new RGBLuminanceSource(byArray, n10, n14, n15, n16, n7, n8);
        return rGBLuminanceSource;
    }

    public byte[] getMatrix() {
        int n3;
        int n4 = this.getWidth();
        int n7 = this.getHeight();
        int n8 = this.dataWidth;
        if (n4 == n8 && n7 == (n3 = this.dataHeight)) {
            return this.luminances;
        }
        n3 = n4 * n7;
        byte[] byArray = new byte[n3];
        int n10 = this.top * n8;
        int n14 = this.left;
        n10 += n14;
        if (n4 == n8) {
            System.arraycopy(this.luminances, n10, byArray, 0, n3);
            return byArray;
        }
        for (n14 = 0; n14 < n7; ++n14) {
            n8 = n14 * n4;
            byte[] byArray2 = this.luminances;
            System.arraycopy(byArray2, n10, byArray, n8, n4);
            n8 = this.dataWidth;
            n10 += n8;
        }
        return byArray;
    }

    public byte[] getRow(int n3, byte[] object) {
        int n4;
        if (n3 >= 0 && n3 < (n4 = this.getHeight())) {
            int n7;
            n4 = this.getWidth();
            if (object == null || (n7 = ((byte[])object).length) < n4) {
                object = new byte[n4];
            }
            n7 = this.top;
            n3 += n7;
            n7 = this.dataWidth;
            n3 *= n7;
            n7 = this.left;
            System.arraycopy(this.luminances, n3 += n7, object, 0, n4);
            return object;
        }
        object = new IllegalArgumentException;
        String string2 = String.valueOf(n3);
        string2 = "Requested row is outside the image: ".concat(string2);
        object(string2);
        throw object;
    }

    public boolean isCropSupported() {
        return true;
    }
}

