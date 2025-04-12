/*
 * Decompiled with CFR 0.152.
 */
package androidx.transition;

import java.util.ArrayList;

public final class Transition$e {
    public static ArrayList a(Object object, ArrayList arrayList) {
        boolean bl2;
        if (arrayList == null) {
            arrayList = new ArrayList<Object>();
        }
        if (!(bl2 = arrayList.contains(object))) {
            arrayList.add(object);
        }
        return arrayList;
    }

    public static ArrayList b(Object object, ArrayList arrayList) {
        if (arrayList != null) {
            arrayList.remove(object);
            boolean bl2 = arrayList.isEmpty();
            if (bl2) {
                arrayList = null;
            }
        }
        return arrayList;
    }
}

