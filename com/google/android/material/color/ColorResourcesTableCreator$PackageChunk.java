/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.ColorResourcesTableCreator$ColorResource;
import com.google.android.material.color.ColorResourcesTableCreator$PackageInfo;
import com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader;
import com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk;
import com.google.android.material.color.ColorResourcesTableCreator$TypeSpecChunk;
import java.io.ByteArrayOutputStream;
import java.util.List;

class ColorResourcesTableCreator$PackageChunk {
    private static final short HEADER_SIZE = 288;
    private static final int PACKAGE_NAME_MAX_LENGTH = 128;
    private final ColorResourcesTableCreator$ResChunkHeader header;
    private final ColorResourcesTableCreator$StringPoolChunk keyStrings;
    private final ColorResourcesTableCreator$PackageInfo packageInfo;
    private final ColorResourcesTableCreator$TypeSpecChunk typeSpecChunk;
    private final ColorResourcesTableCreator$StringPoolChunk typeStrings;

    public ColorResourcesTableCreator$PackageChunk(ColorResourcesTableCreator$PackageInfo object, List list) {
        int n3;
        this.packageInfo = object;
        String string2 = "?5";
        String string3 = "color";
        String string4 = "?3";
        String string5 = "?4";
        Object object2 = new String[]{"?1", "?2", string4, string5, string2, string3};
        object = new ColorResourcesTableCreator$StringPoolChunk(false, (String)object2);
        this.typeStrings = object;
        int n4 = list.size();
        object = new String[n4];
        for (int i3 = 0; i3 < (n3 = list.size()); ++i3) {
            object[i3] = object2 = ColorResourcesTableCreator$ColorResource.access$100((ColorResourcesTableCreator$ColorResource)list.get(i3));
        }
        super(true, (String)object);
        this.keyStrings = object2;
        super(list);
        this.typeSpecChunk = object;
        n3 = this.getChunkSize();
        super((short)512, (short)288, n3);
        this.header = object;
    }

    public int getChunkSize() {
        int n3 = this.typeStrings.getChunkSize() + 288;
        int n4 = this.keyStrings.getChunkSize();
        n3 += n4;
        n4 = this.typeSpecChunk.getChunkSizeWithTypeChunk();
        return n3 + n4;
    }

    public void writeTo(ByteArrayOutputStream byteArrayOutputStream) {
        int n3;
        this.header.writeTo(byteArrayOutputStream);
        int n4 = ColorResourcesTableCreator$PackageInfo.access$1000(this.packageInfo);
        Object[] objectArray = ColorResourcesTableCreator.access$500(n4);
        byteArrayOutputStream.write((byte[])objectArray);
        objectArray = ColorResourcesTableCreator$PackageInfo.access$1100(this.packageInfo).toCharArray();
        byte[] byArray = null;
        for (int i3 = 0; i3 < (n3 = 128); ++i3) {
            byte[] byArray2;
            n3 = objectArray.length;
            if (i3 < n3) {
                n3 = objectArray[i3];
                byArray2 = ColorResourcesTableCreator.access$1200((char)n3);
                byteArrayOutputStream.write(byArray2);
                continue;
            }
            byArray2 = ColorResourcesTableCreator.access$1200('\u0000');
            byteArrayOutputStream.write(byArray2);
        }
        n4 = 288;
        byArray = ColorResourcesTableCreator.access$500(n4);
        byteArrayOutputStream.write(byArray);
        byArray = ColorResourcesTableCreator.access$500(0);
        byteArrayOutputStream.write(byArray);
        objectArray = ColorResourcesTableCreator.access$500(this.typeStrings.getChunkSize() + n4);
        byteArrayOutputStream.write((byte[])objectArray);
        objectArray = ColorResourcesTableCreator.access$500(0);
        byteArrayOutputStream.write((byte[])objectArray);
        objectArray = ColorResourcesTableCreator.access$500(0);
        byteArrayOutputStream.write((byte[])objectArray);
        this.typeStrings.writeTo(byteArrayOutputStream);
        this.keyStrings.writeTo(byteArrayOutputStream);
        this.typeSpecChunk.writeTo(byteArrayOutputStream);
    }
}

