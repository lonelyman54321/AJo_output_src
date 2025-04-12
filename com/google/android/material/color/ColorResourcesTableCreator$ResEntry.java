/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.ByteArrayOutputStream;

class ColorResourcesTableCreator$ResEntry {
    private static final byte DATA_TYPE_AARRGGBB = 28;
    private static final short ENTRY_SIZE = 8;
    private static final short FLAG_PUBLIC = 2;
    private static final int SIZE = 16;
    private static final short VALUE_SIZE = 8;
    private final int data;
    private final int keyStringIndex;

    public ColorResourcesTableCreator$ResEntry(int n3, int n4) {
        this.keyStringIndex = n3;
        this.data = n4;
    }

    public void writeTo(ByteArrayOutputStream byteArrayOutputStream) {
        short s7 = 8;
        byte[] byArray = ColorResourcesTableCreator.access$600(s7);
        byteArrayOutputStream.write(byArray);
        short s8 = 2;
        byte[] byArray2 = ColorResourcesTableCreator.access$600(s8);
        byteArrayOutputStream.write(byArray2);
        byArray2 = ColorResourcesTableCreator.access$500(this.keyStringIndex);
        byteArrayOutputStream.write(byArray2);
        byte[] byArray3 = ColorResourcesTableCreator.access$600(s7);
        byteArrayOutputStream.write(byArray3);
        byArray3 = new byte[s8];
        byArray3[0] = 0;
        byArray3[1] = 28;
        byteArrayOutputStream.write(byArray3);
        byArray3 = ColorResourcesTableCreator.access$500(this.data);
        byteArrayOutputStream.write(byArray3);
    }
}

