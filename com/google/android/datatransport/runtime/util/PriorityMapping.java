/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 */
package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import com.google.android.datatransport.Priority;
import java.io.Serializable;
import java.util.HashMap;

public final class PriorityMapping {
    private static HashMap PRIORITY_INT_MAP;
    private static SparseArray PRIORITY_MAP;

    static {
        boolean bl2;
        Object object = new SparseArray();
        PRIORITY_MAP = object;
        object = new HashMap();
        PRIORITY_INT_MAP = object;
        Priority priority = Priority.DEFAULT;
        Integer n3 = 0;
        ((HashMap)object).put(priority, n3);
        object = PRIORITY_INT_MAP;
        priority = Priority.VERY_LOW;
        n3 = 1;
        ((HashMap)object).put(priority, n3);
        object = PRIORITY_INT_MAP;
        priority = Priority.HIGHEST;
        int n4 = 2;
        n3 = n4;
        ((HashMap)object).put(priority, n3);
        object = PRIORITY_INT_MAP.keySet().iterator();
        while (bl2 = object.hasNext()) {
            priority = (Priority)((Object)object.next());
            n3 = PRIORITY_MAP;
            Integer n7 = (Integer)PRIORITY_INT_MAP.get((Object)priority);
            int n8 = n7;
            n3.append(n8, (Object)priority);
        }
    }

    public static int toInt(Priority object) {
        Serializable serializable = (Integer)PRIORITY_INT_MAP.get(object);
        if (serializable != null) {
            return serializable;
        }
        StringBuilder stringBuilder = new StringBuilder("PriorityMapping is missing known Priority value ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        serializable = new IllegalStateException((String)object);
        throw serializable;
    }

    public static Priority valueOf(int n3) {
        Object object = (Priority)((Object)PRIORITY_MAP.get(n3));
        if (object != null) {
            return object;
        }
        String string2 = hj0_0.a(n3, "Unknown Priority for value ");
        object = new IllegalArgumentException(string2);
        throw object;
    }
}

