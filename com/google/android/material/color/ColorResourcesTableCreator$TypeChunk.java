/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.ColorResourcesTableCreator$ColorResource;
import com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader;
import com.google.android.material.color.ColorResourcesTableCreator$ResEntry;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;

class ColorResourcesTableCreator$TypeChunk {
    private static final byte CONFIG_SIZE = 64;
    private static final short HEADER_SIZE = 84;
    private static final int OFFSET_NO_ENTRY = 255;
    private final byte[] config;
    private final int entryCount;
    private final ColorResourcesTableCreator$ResChunkHeader header;
    private final int[] offsetTable;
    private final ColorResourcesTableCreator$ResEntry[] resEntries;

    public ColorResourcesTableCreator$TypeChunk(List object, Set set, int n3) {
        int n4;
        int n7 = 64;
        Object object2 = new byte[n7];
        this.config = object2;
        this.entryCount = n3;
        short s7 = 0;
        object2[0] = n7;
        Object object3 = new ColorResourcesTableCreator$ResEntry[object.size()];
        this.resEntries = object3;
        object3 = null;
        for (n7 = 0; n7 < (n4 = object.size()); ++n7) {
            ColorResourcesTableCreator$ResEntry colorResourcesTableCreator$ResEntry;
            object2 = (ColorResourcesTableCreator$ColorResource)object.get(n7);
            ColorResourcesTableCreator$ResEntry[] colorResourcesTableCreator$ResEntryArray = this.resEntries;
            n4 = ColorResourcesTableCreator$ColorResource.access$1400((ColorResourcesTableCreator$ColorResource)object2);
            colorResourcesTableCreator$ResEntryArray[n7] = colorResourcesTableCreator$ResEntry = new ColorResourcesTableCreator$ResEntry(n7, n4);
        }
        object = new int[n3];
        this.offsetTable = (int[])object;
        int n8 = 0;
        object = null;
        while (s7 < n3) {
            object3 = s7;
            n7 = (int)(set.contains(object3) ? 1 : 0);
            if (n7 != 0) {
                object3 = this.offsetTable;
                object3[s7] = (ColorResourcesTableCreator$ResEntry)n8;
                n8 += 16;
            } else {
                object3 = this.offsetTable;
                n4 = -1;
                object3[s7] = (ColorResourcesTableCreator$ResEntry)n4;
            }
            s7 = (short)(s7 + 1);
        }
        n3 = this.getChunkSize();
        this.header = object = new ColorResourcesTableCreator$ResChunkHeader(513, 84, n3);
    }

    private int getEntryStart() {
        return this.getOffsetTableSize() + 84;
    }

    private int getOffsetTableSize() {
        return this.offsetTable.length * 4;
    }

    public int getChunkSize() {
        int n3 = this.getEntryStart();
        return this.resEntries.length * 16 + n3;
    }

    public void writeTo(ByteArrayOutputStream byteArrayOutputStream) {
        ColorResourcesTableCreator$ResChunkHeader colorResourcesTableCreator$ResChunkHeader = this.header;
        colorResourcesTableCreator$ResChunkHeader.writeTo(byteArrayOutputStream);
        byte by2 = ColorResourcesTableCreator.access$1300();
        int n3 = 0;
        Object[] objectArray = new byte[4];
        objectArray[0] = by2;
        by2 = 1;
        objectArray[by2] = 0;
        objectArray[2] = 0;
        objectArray[3] = 0;
        byteArrayOutputStream.write((byte[])objectArray);
        objectArray = ColorResourcesTableCreator.access$500(this.entryCount);
        byteArrayOutputStream.write((byte[])objectArray);
        int n4 = this.getEntryStart();
        objectArray = ColorResourcesTableCreator.access$500(n4);
        byteArrayOutputStream.write((byte[])objectArray);
        objectArray = this.config;
        byteArrayOutputStream.write((byte[])objectArray);
        objectArray = this.offsetTable;
        int n7 = objectArray.length;
        Object object = null;
        for (int i3 = 0; i3 < n7; i3 += by2) {
            byte by4 = objectArray[i3];
            byte[] byArray = ColorResourcesTableCreator.access$500(by4);
            byteArrayOutputStream.write(byArray);
        }
        objectArray = this.resEntries;
        n7 = objectArray.length;
        while (n3 < n7) {
            object = objectArray[n3];
            ((ColorResourcesTableCreator$ResEntry)object).writeTo(byteArrayOutputStream);
            n3 += by2;
        }
    }
}

