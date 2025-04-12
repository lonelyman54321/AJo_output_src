/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing;

import com.google.zxing.LuminanceSource;

public final class PlanarYUVLuminanceSource
extends LuminanceSource {
    private static final int THUMBNAIL_SCALE_FACTOR = 2;
    private final int dataHeight;
    private final int dataWidth;
    private final int left;
    private final int top;
    private final byte[] yuvData;

    public PlanarYUVLuminanceSource(byte[] object, int n3, int n4, int n7, int n8, int n10, int n14, boolean bl2) {
        super(n10, n14);
        int n15 = n7 + n10;
        if (n15 <= n3 && (n15 = n8 + n14) <= n4) {
            this.yuvData = object;
            this.dataWidth = n3;
            this.dataHeight = n4;
            this.left = n7;
            this.top = n8;
            if (bl2) {
                this.reverseHorizontal(n10, n14);
            }
            return;
        }
        object = new IllegalArgumentException;
        super("Crop rectangle does not fit within image data.");
        throw object;
    }

    private void reverseHorizontal(int n3, int n4) {
        byte[] byArray = this.yuvData;
        int n7 = this.top;
        int n8 = this.dataWidth;
        n7 *= n8;
        n8 = this.left;
        n7 += n8;
        n8 = 0;
        while (n8 < n4) {
            int n10 = n3 / 2 + n7;
            int n14 = n7 + n3 + -1;
            int n15 = n7;
            while (n15 < n10) {
                byte by2;
                byte by4 = byArray[n15];
                byArray[n15] = by2 = byArray[n14];
                byArray[n14] = by4;
                ++n15;
                n14 += -1;
            }
            ++n8;
            n10 = this.dataWidth;
            n7 += n10;
        }
    }

    public LuminanceSource crop(int n3, int n4, int n7, int n8) {
        byte[] byArray = this.yuvData;
        int n10 = this.dataWidth;
        int n14 = this.dataHeight;
        int n15 = this.left + n3;
        int n16 = this.top + n4;
        PlanarYUVLuminanceSource planarYUVLuminanceSource = new PlanarYUVLuminanceSource(byArray, n10, n14, n15, n16, n7, n8, false);
        return planarYUVLuminanceSource;
    }

    public byte[] getMatrix() {
        int n3;
        int n4 = this.getWidth();
        int n7 = this.getHeight();
        int n8 = this.dataWidth;
        if (n4 == n8 && n7 == (n3 = this.dataHeight)) {
            return this.yuvData;
        }
        n3 = n4 * n7;
        byte[] byArray = new byte[n3];
        int n10 = this.top * n8;
        int n14 = this.left;
        n10 += n14;
        if (n4 == n8) {
            System.arraycopy(this.yuvData, n10, byArray, 0, n3);
            return byArray;
        }
        for (n14 = 0; n14 < n7; ++n14) {
            n8 = n14 * n4;
            byte[] byArray2 = this.yuvData;
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
            System.arraycopy(this.yuvData, n3 += n7, object, 0, n4);
            return object;
        }
        object = new IllegalArgumentException;
        String string2 = String.valueOf(n3);
        string2 = "Requested row is outside the image: ".concat(string2);
        object(string2);
        throw object;
    }

    public int getThumbnailHeight() {
        return this.getHeight() / 2;
    }

    public int getThumbnailWidth() {
        return this.getWidth() / 2;
    }

    public boolean isCropSupported() {
        return true;
    }

    public int[] renderThumbnail() {
        int n3 = this.getWidth() / 2;
        int n4 = this.getHeight() / 2;
        int n7 = n3 * n4;
        int[] nArray = new int[n7];
        byte[] byArray = this.yuvData;
        int n8 = this.top;
        int n10 = this.dataWidth;
        n8 *= n10;
        n10 = this.left;
        n8 += n10;
        n10 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n14 = i3 * n3;
            for (int i8 = 0; i8 < n3; ++i8) {
                int n15 = (i8 << 1) + n8;
                n15 = byArray[n15] & 0xFF;
                int n16 = n14 + i8;
                n15 *= 65793;
                int n17 = -16777216;
                nArray[n16] = n15 |= n17;
            }
            n14 = this.dataWidth << 1;
            n8 += n14;
        }
        return nArray;
    }
}

