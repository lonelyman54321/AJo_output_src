/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.ByteArrayOutputStream;

class ColorResourcesTableCreator$ResChunkHeader {
    private final int chunkSize;
    private final short headerSize;
    private final short type;

    public ColorResourcesTableCreator$ResChunkHeader(short s7, short s8, int n3) {
        this.type = s7;
        this.headerSize = s8;
        this.chunkSize = n3;
    }

    public void writeTo(ByteArrayOutputStream byteArrayOutputStream) {
        byte[] byArray = ColorResourcesTableCreator.access$600(this.type);
        byteArrayOutputStream.write(byArray);
        byArray = ColorResourcesTableCreator.access$600(this.headerSize);
        byteArrayOutputStream.write(byArray);
        byArray = ColorResourcesTableCreator.access$500(this.chunkSize);
        byteArrayOutputStream.write(byArray);
    }
}

