/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class BarcodeValue {
    private final Map values;

    public BarcodeValue() {
        HashMap hashMap;
        this.values = hashMap = new HashMap();
    }

    public Integer getConfidence(int n3) {
        Map map2 = this.values;
        Integer n4 = n3;
        return (Integer)map2.get(n4);
    }

    public int[] getValue() {
        boolean bl2;
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.values.entrySet().iterator();
        int n3 = -1;
        while (bl2 = iterator.hasNext()) {
            Map.Entry entry = iterator.next();
            Integer n4 = (Integer)entry.getValue();
            int n7 = n4;
            if (n7 > n3) {
                Integer n8 = (Integer)entry.getValue();
                n3 = n8;
                arrayList.clear();
                entry = entry.getKey();
                arrayList.add(entry);
                continue;
            }
            n4 = (Integer)entry.getValue();
            n7 = n4;
            if (n7 != n3) continue;
            entry = entry.getKey();
            arrayList.add(entry);
        }
        return PDF417Common.toIntArray(arrayList);
    }

    public void setValue(int n3) {
        Object object = this.values;
        Object object2 = n3;
        if ((object = (Integer)object.get(object2)) == null) {
            object = 0;
        }
        object = (Integer)object + 1;
        object2 = this.values;
        Integer n4 = n3;
        object2.put(n4, object);
    }
}

