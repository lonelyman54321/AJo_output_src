/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color;

import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.ColorResourcesTableCreator$PackageChunk;
import com.google.android.material.color.ColorResourcesTableCreator$PackageInfo;
import com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader;
import com.google.android.material.color.ColorResourcesTableCreator$StringPoolChunk;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class ColorResourcesTableCreator$ResTable {
    private static final short HEADER_SIZE = 12;
    private final ColorResourcesTableCreator$ResChunkHeader header;
    private final List packageChunks;
    private final int packageCount;
    private final ColorResourcesTableCreator$StringPoolChunk stringPool;

    public ColorResourcesTableCreator$ResTable(Map object) {
        int n3;
        Object object2 = new ArrayList();
        this.packageChunks = object2;
        this.packageCount = n3 = object.size();
        int n4 = 0;
        Object object3 = new String[]{};
        this.stringPool = object2 = new ColorResourcesTableCreator$StringPoolChunk((String)object3);
        object = object.entrySet().iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            object2 = (Map.Entry)object.next();
            object3 = (List)object2.getValue();
            Object object4 = ColorResourcesTableCreator.access$400();
            Collections.sort(object3, object4);
            object4 = this.packageChunks;
            object2 = (ColorResourcesTableCreator$PackageInfo)object2.getKey();
            ColorResourcesTableCreator$PackageChunk colorResourcesTableCreator$PackageChunk = new ColorResourcesTableCreator$PackageChunk((ColorResourcesTableCreator$PackageInfo)object2, (List)object3);
            object4.add(colorResourcesTableCreator$PackageChunk);
        }
        n4 = this.getOverallSize();
        this.header = object = new ColorResourcesTableCreator$ResChunkHeader(2, 12, n4);
    }

    private int getOverallSize() {
        int n3;
        Iterator iterator = this.packageChunks.iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            ColorResourcesTableCreator$PackageChunk colorResourcesTableCreator$PackageChunk = (ColorResourcesTableCreator$PackageChunk)iterator.next();
            n3 = colorResourcesTableCreator$PackageChunk.getChunkSize();
            n4 += n3;
        }
        return this.stringPool.getChunkSize() + 12 + n4;
    }

    public void writeTo(ByteArrayOutputStream byteArrayOutputStream) {
        boolean bl2;
        this.header.writeTo(byteArrayOutputStream);
        int n3 = this.packageCount;
        Object object = ColorResourcesTableCreator.access$500(n3);
        byteArrayOutputStream.write((byte[])object);
        this.stringPool.writeTo(byteArrayOutputStream);
        object = this.packageChunks.iterator();
        while (bl2 = object.hasNext()) {
            ColorResourcesTableCreator$PackageChunk colorResourcesTableCreator$PackageChunk = (ColorResourcesTableCreator$PackageChunk)object.next();
            colorResourcesTableCreator$PackageChunk.writeTo(byteArrayOutputStream);
        }
    }
}

