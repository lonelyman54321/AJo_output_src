/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

import com.google.android.material.color.ColorResourcesTableCreator;
import java.io.ByteArrayOutputStream;

class ColorResourcesTableCreator$StringStyledSpan {
    private int firstCharacterIndex;
    private int lastCharacterIndex;
    private int nameReference;
    private byte[] styleString;

    private ColorResourcesTableCreator$StringStyledSpan() {
    }

    public static /* synthetic */ byte[] access$700(ColorResourcesTableCreator$StringStyledSpan colorResourcesTableCreator$StringStyledSpan) {
        return colorResourcesTableCreator$StringStyledSpan.styleString;
    }

    public void writeTo(ByteArrayOutputStream byteArrayOutputStream) {
        byte[] byArray = ColorResourcesTableCreator.access$500(this.nameReference);
        byteArrayOutputStream.write(byArray);
        byArray = ColorResourcesTableCreator.access$500(this.firstCharacterIndex);
        byteArrayOutputStream.write(byArray);
        byArray = ColorResourcesTableCreator.access$500(this.lastCharacterIndex);
        byteArrayOutputStream.write(byArray);
    }
}

