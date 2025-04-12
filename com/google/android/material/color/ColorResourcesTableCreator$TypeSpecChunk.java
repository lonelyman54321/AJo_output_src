/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.ColorResourcesTableCreator$ColorResource;
import com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader;
import com.google.android.material.color.ColorResourcesTableCreator$TypeChunk;
import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.List;

class ColorResourcesTableCreator$TypeSpecChunk {
    private static final short HEADER_SIZE = 16;
    private static final int SPEC_PUBLIC = 0x40000000;
    private final int entryCount;
    private final int[] entryFlags;
    private final ColorResourcesTableCreator$ResChunkHeader header;
    private final ColorResourcesTableCreator$TypeChunk typeChunk;

    public ColorResourcesTableCreator$TypeSpecChunk(List list) {
        int n3;
        Object object;
        int n4;
        int n7 = 1;
        short s7 = ColorResourcesTableCreator$ColorResource.access$000((ColorResourcesTableCreator$ColorResource)on_2.d(n7, list)) + n7;
        this.entryCount = s7;
        HashSet<Short> hashSet = new HashSet<Short>();
        Object object2 = list.iterator();
        while ((n4 = object2.hasNext()) != 0) {
            n4 = ColorResourcesTableCreator$ColorResource.access$000((ColorResourcesTableCreator$ColorResource)object2.next());
            object = (short)n4;
            hashSet.add((Short)object);
        }
        object2 = new int[this.entryCount];
        this.entryFlags = (int[])object2;
        object2 = null;
        for (s7 = 0; s7 < (n4 = this.entryCount); s7 = (short)(s7 + 1)) {
            object = s7;
            n4 = (int)(hashSet.contains(object) ? 1 : 0);
            if (n4 == 0) continue;
            object = this.entryFlags;
            n3 = 0x40000000;
            object[s7] = n3;
        }
        n3 = this.getChunkSize();
        this.header = object2 = new ColorResourcesTableCreator$ResChunkHeader(514, 16, n3);
        n4 = this.entryCount;
        this.typeChunk = object2 = new ColorResourcesTableCreator$TypeChunk(list, hashSet, n4);
    }

    private int getChunkSize() {
        return this.entryCount * 4 + 16;
    }

    public int getChunkSizeWithTypeChunk() {
        int n3 = this.getChunkSize();
        int n4 = this.typeChunk.getChunkSize();
        return n3 + n4;
    }

    public void writeTo(ByteArrayOutputStream byteArrayOutputStream) {
        ColorResourcesTableCreator$ResChunkHeader colorResourcesTableCreator$ResChunkHeader = this.header;
        colorResourcesTableCreator$ResChunkHeader.writeTo(byteArrayOutputStream);
        byte by2 = ColorResourcesTableCreator.access$1300();
        Object[] objectArray = new byte[4];
        objectArray[0] = by2;
        by2 = 1;
        objectArray[by2] = 0;
        objectArray[2] = 0;
        objectArray[3] = 0;
        byteArrayOutputStream.write((byte[])objectArray);
        int n3 = this.entryCount;
        objectArray = ColorResourcesTableCreator.access$500(n3);
        byteArrayOutputStream.write((byte[])objectArray);
        objectArray = this.entryFlags;
        int n4 = objectArray.length;
        for (int i3 = 0; i3 < n4; i3 += by2) {
            byte by4 = objectArray[i3];
            byte[] byArray = ColorResourcesTableCreator.access$500(by4);
            byteArrayOutputStream.write(byArray);
        }
        this.typeChunk.writeTo(byteArrayOutputStream);
    }
}

