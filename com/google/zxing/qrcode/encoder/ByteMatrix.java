/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.qrcode.encoder;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class ByteMatrix {
    private final byte[][] bytes;
    private final int height;
    private final int width;

    public ByteMatrix(int n3, int n4) {
        Object object = new int[2];
        object[1] = n3;
        object[0] = n4;
        object = (byte[][])Array.newInstance(Byte.TYPE, object);
        this.bytes = (byte[][])object;
        this.width = n3;
        this.height = n4;
    }

    public void clear(byte by2) {
        for (byte[] byArray : this.bytes) {
            Arrays.fill(byArray, by2);
        }
    }

    public byte get(int n3, int n4) {
        return this.bytes[n4][n3];
    }

    public byte[][] getArray() {
        return this.bytes;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void set(int n3, int n4, byte by2) {
        this.bytes[n4][n3] = by2;
    }

    public void set(int n3, int n4, int n7) {
        byte[] byArray = this.bytes[n4];
        byArray[n3] = n7 = (int)((byte)n7);
    }

    public void set(int n3, int n4, boolean bl2) {
        byte by2;
        byte[] byArray = this.bytes[n4];
        byArray[n3] = by2 = (byte)(bl2 ? 1 : 0);
    }

    public String toString() {
        char c2;
        int n3 = this.width * 2;
        int n4 = this.height;
        n3 = n3 * n4 + 2;
        StringBuilder stringBuilder = new StringBuilder(n3);
        n3 = 0;
        for (n4 = 0; n4 < (c2 = this.height); ++n4) {
            int n7;
            byte[] byArray = this.bytes[n4];
            for (int i3 = 0; i3 < (n7 = this.width); ++i3) {
                String string2;
                n7 = byArray[i3];
                if (n7 != 0) {
                    int n8 = 1;
                    if (n7 != n8) {
                        string2 = "  ";
                        stringBuilder.append(string2);
                        continue;
                    }
                    string2 = " 1";
                    stringBuilder.append(string2);
                    continue;
                }
                string2 = " 0";
                stringBuilder.append(string2);
            }
            c2 = '\n';
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
}

