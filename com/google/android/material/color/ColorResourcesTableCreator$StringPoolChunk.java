/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.material.color;

import android.util.Pair;
import com.google.android.material.color.ColorResourcesTableCreator;
import com.google.android.material.color.ColorResourcesTableCreator$ResChunkHeader;
import com.google.android.material.color.ColorResourcesTableCreator$StringStyledSpan;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ColorResourcesTableCreator$StringPoolChunk {
    private static final int FLAG_UTF8 = 256;
    private static final short HEADER_SIZE = 28;
    private static final int STYLED_SPAN_LIST_END = 255;
    private final int chunkSize;
    private final ColorResourcesTableCreator$ResChunkHeader header;
    private final int stringCount;
    private final List stringIndex;
    private final List strings;
    private final int stringsPaddingSize;
    private final int stringsStart;
    private final int styledSpanCount;
    private final List styledSpanIndex;
    private final List styledSpans;
    private final int styledSpansStart;
    private final boolean utf8Encode;

    public ColorResourcesTableCreator$StringPoolChunk(boolean n3, String ... stringArray) {
        int n4;
        List list;
        int n7;
        short s7;
        Object object;
        Object object2;
        Object object3;
        int n8;
        ArrayList arrayList;
        this.stringIndex = arrayList = new ArrayList();
        this.styledSpanIndex = arrayList = new ArrayList();
        this.strings = arrayList = new ArrayList();
        this.styledSpans = arrayList = new ArrayList();
        this.utf8Encode = n3;
        n3 = stringArray.length;
        int n10 = 0;
        arrayList = null;
        int n14 = 0;
        for (n8 = 0; n8 < n3; ++n8) {
            object3 = stringArray[n8];
            object3 = this.processString((String)object3);
            object2 = this.stringIndex;
            object = n14;
            object2.add(object);
            object = object2 = ((Pair)object3).first;
            s7 = ((byte[])object2).length;
            n14 += s7;
            object = this.strings;
            object2 = (byte[])object2;
            object.add(object2);
            object2 = this.styledSpans;
            object3 = (List)((Pair)object3).second;
            object2.add(object3);
        }
        Object object4 = this.styledSpans.iterator();
        n8 = 0;
        while ((n7 = object4.hasNext()) != 0) {
            object3 = (List)object4.next();
            object2 = object3.iterator();
            while ((s7 = object2.hasNext()) != 0) {
                object = (ColorResourcesTableCreator$StringStyledSpan)object2.next();
                list = this.stringIndex;
                Integer n15 = n14;
                list.add(n15);
                n4 = ColorResourcesTableCreator$StringStyledSpan.access$700((ColorResourcesTableCreator$StringStyledSpan)object).length;
                n14 += n4;
                list = this.strings;
                object = ColorResourcesTableCreator$StringStyledSpan.access$700((ColorResourcesTableCreator$StringStyledSpan)object);
                list.add(object);
            }
            object2 = this.styledSpanIndex;
            object = n8;
            object2.add(object);
            n7 = object3.size() * 12 + 4;
            n8 += n7;
        }
        n3 = n14 % 4;
        if (!n3) {
            n3 = 0;
            object4 = null;
        } else {
            n3 = 4 - n3;
        }
        this.stringsPaddingSize = n3;
        object3 = this.strings;
        this.stringCount = n7 = object3.size();
        int n16 = this.strings.size();
        s7 = stringArray.length;
        this.styledSpanCount = n16 -= s7;
        object2 = this.strings;
        n16 = object2.size();
        short s8 = stringArray.length;
        n16 -= s8;
        s8 = 1;
        if (n16 > 0) {
            n16 = 1;
        } else {
            n16 = 0;
            object2 = null;
        }
        if (n16 == 0) {
            this.styledSpanIndex.clear();
            object = this.styledSpans;
            object.clear();
        }
        n7 *= 4;
        s7 = 28;
        list = this.styledSpanIndex;
        this.stringsStart = n4 = list.size() * 4 + (n7 += s7);
        n14 += n3;
        if (n16 != 0) {
            n3 = n4 + n14;
        } else {
            n3 = 0;
            object4 = null;
        }
        this.styledSpansStart = n3;
        n4 += n14;
        if (n16 != 0) {
            n10 = n8;
        }
        this.chunkSize = n4 += n10;
        this.header = object4 = new ColorResourcesTableCreator$ResChunkHeader(s8, s7, n4);
    }

    public ColorResourcesTableCreator$StringPoolChunk(String ... stringArray) {
        this(false, stringArray);
    }

    private Pair processString(String object) {
        boolean bl2 = this.utf8Encode;
        object = bl2 ? (Object)ColorResourcesTableCreator.access$800((String)object) : (Object)ColorResourcesTableCreator.access$900((String)object);
        List list = Collections.emptyList();
        Pair pair = new Pair(object, list);
        return pair;
    }

    public int getChunkSize() {
        return this.chunkSize;
    }

    public void writeTo(ByteArrayOutputStream byteArrayOutputStream) {
        Object object;
        int n3;
        this.header.writeTo(byteArrayOutputStream);
        Object object2 = ColorResourcesTableCreator.access$500(this.stringCount);
        byteArrayOutputStream.write((byte[])object2);
        object2 = ColorResourcesTableCreator.access$500(this.styledSpanCount);
        byteArrayOutputStream.write((byte[])object2);
        int n4 = this.utf8Encode;
        if (n4 != 0) {
            n4 = 256;
        } else {
            n4 = 0;
            object2 = null;
        }
        object2 = ColorResourcesTableCreator.access$500(n4);
        byteArrayOutputStream.write((byte[])object2);
        object2 = ColorResourcesTableCreator.access$500(this.stringsStart);
        byteArrayOutputStream.write((byte[])object2);
        n4 = this.styledSpansStart;
        object2 = ColorResourcesTableCreator.access$500(n4);
        byteArrayOutputStream.write((byte[])object2);
        object2 = this.stringIndex.iterator();
        while ((n3 = object2.hasNext()) != 0) {
            n3 = (Integer)object2.next();
            object = ColorResourcesTableCreator.access$500(n3);
            byteArrayOutputStream.write((byte[])object);
        }
        object2 = this.styledSpanIndex.iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            n3 = (Integer)object2.next();
            object = ColorResourcesTableCreator.access$500(n3);
            byteArrayOutputStream.write((byte[])object);
        }
        object2 = this.strings.iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object = (byte[])object2.next();
            byteArrayOutputStream.write((byte[])object);
        }
        n4 = this.stringsPaddingSize;
        if (n4 > 0) {
            object2 = new byte[n4];
            byteArrayOutputStream.write((byte[])object2);
        }
        object2 = this.styledSpans.iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            boolean bl2;
            object = ((List)object2.next()).iterator();
            while (bl2 = object.hasNext()) {
                ColorResourcesTableCreator$StringStyledSpan colorResourcesTableCreator$StringStyledSpan = (ColorResourcesTableCreator$StringStyledSpan)object.next();
                colorResourcesTableCreator$StringStyledSpan.writeTo(byteArrayOutputStream);
            }
            n3 = -1;
            object = ColorResourcesTableCreator.access$500(n3);
            byteArrayOutputStream.write((byte[])object);
        }
    }
}

