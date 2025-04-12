/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.bo;
import com.google.android.play.core.assetpacks.cz;
import com.google.android.play.core.assetpacks.eg;
import com.google.android.play.core.assetpacks.ff;
import com.google.android.play.core.assetpacks.internal.an;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

final class bp
extends an {
    private final File a;
    private final File b;
    private final NavigableMap c;

    public bp(File object, File file) {
        this.a = object;
        this.b = file;
        Object object2 = new TreeMap();
        this.c = object2;
        object2 = ff.a((File)object, file);
        boolean bl2 = object2.isEmpty();
        if (!bl2) {
            boolean bl3;
            object = object2.iterator();
            long l2 = 0L;
            while (bl3 = object.hasNext()) {
                file = (File)object.next();
                NavigableMap navigableMap = this.c;
                Long l3 = l2;
                navigableMap.put(l3, file);
                long l4 = file.length();
                l2 += l4;
            }
            return;
        }
        Object[] objectArray = new Object[]{object, file};
        object = String.format("Virtualized slice archive empty for %s, %s", objectArray);
        object2 = new cz((String)object);
        throw object2;
    }

    private final InputStream d(long l2, Long l3) {
        long l4;
        Object object = this.c;
        object = (File)object.get(l3);
        FileInputStream fileInputStream = new FileInputStream((File)object);
        long l7 = l3;
        l7 = l2 - l7;
        long l8 = (l7 = ((InputStream)fileInputStream).skip(l7)) - (l2 -= (l4 = l3.longValue()));
        Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 == false) {
            return fileInputStream;
        }
        CharSequence charSequence = new StringBuilder("Virtualized slice archive corrupt, could not skip in file with key ");
        charSequence.append(l3);
        charSequence = charSequence.toString();
        cz cz2 = new cz((String)charSequence);
        throw cz2;
    }

    public final long a() {
        Map.Entry entry = this.c.lastEntry();
        long l2 = (Long)entry.getKey();
        return ((File)entry.getValue()).length() + l2;
    }

    public final InputStream b(long l2, long l3) {
        long l4 = 0L;
        long l7 = l2 - l4;
        Object object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object >= 0 && (object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1)) >= 0) {
            l4 = l2 + l3;
            long l8 = this.a();
            long l12 = l4 - l8;
            Object object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object2 <= 0) {
                Object object3 = this.c;
                Object object4 = l2;
                object3 = object3.floorKey(object4);
                object4 = this.c;
                Object object5 = l4;
                boolean bl2 = ((Long)object3).equals(object5 = object4.floorKey(object5));
                if (bl2) {
                    InputStream inputStream = this.d(l2, (Long)object3);
                    object5 = new bo(inputStream, l3);
                    return object5;
                }
                ArrayList<Object> arrayList = new ArrayList<Object>();
                object4 = this.d(l2, (Long)object3);
                arrayList.add(object4);
                object4 = this.c;
                object2 = 0;
                FileInputStream fileInputStream = null;
                object3 = object4.subMap(object3, false, object5, false).values();
                boolean bl3 = object3.isEmpty();
                if (!bl3) {
                    object3 = Collections.enumeration(object3);
                    object4 = new eg((Enumeration)object3);
                    arrayList.add(object4);
                }
                object3 = this.c;
                object3 = (File)object3.get(object5);
                fileInputStream = new FileInputStream((File)object3);
                long l14 = (Long)object5 - l2;
                object4 = new bo(fileInputStream, l3 -= l14);
                arrayList.add(object4);
                Enumeration enumeration = Collections.enumeration(arrayList);
                SequenceInputStream sequenceInputStream = new SequenceInputStream(enumeration);
                return sequenceInputStream;
            }
            CharSequence charSequence = D70.c(this.a(), "Trying to access archive out of bounds. Archive ends at: ", ". Tried accessing: ");
            charSequence.append(l4);
            charSequence = charSequence.toString();
            cz cz2 = new cz((String)charSequence);
            throw cz2;
        }
        CharSequence charSequence = D70.c(l2, "Invalid input parameters ", ", ");
        charSequence.append(l3);
        charSequence = charSequence.toString();
        cz cz4 = new cz((String)charSequence);
        throw cz4;
    }

    public final void close() {
    }
}

