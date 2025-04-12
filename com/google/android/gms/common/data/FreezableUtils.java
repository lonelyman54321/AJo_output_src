/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.data;

import com.google.android.gms.common.data.Freezable;
import java.util.ArrayList;

public final class FreezableUtils {
    public static ArrayList freeze(ArrayList arrayList) {
        int n3 = arrayList.size();
        ArrayList<Object> arrayList2 = new ArrayList<Object>(n3);
        n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = ((Freezable)arrayList.get(i3)).freeze();
            arrayList2.add(object);
        }
        return arrayList2;
    }

    public static ArrayList freeze(Freezable[] freezableArray) {
        int n3;
        int n4 = freezableArray.length;
        ArrayList<Object> arrayList = new ArrayList<Object>(n4);
        for (n4 = 0; n4 < (n3 = freezableArray.length); ++n4) {
            Object object = freezableArray[n4].freeze();
            arrayList.add(object);
        }
        return arrayList;
    }

    public static ArrayList freezeIterable(Iterable object) {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = ((Freezable)object.next()).freeze();
            arrayList.add(object2);
        }
        return arrayList;
    }
}

