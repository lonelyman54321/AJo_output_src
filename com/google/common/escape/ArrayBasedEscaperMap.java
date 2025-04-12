/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.escape;

import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public final class ArrayBasedEscaperMap {
    private static final char[][] EMPTY_REPLACEMENT_ARRAY;
    private final char[][] replacementArray;

    static {
        int[] nArray = new int[2];
        nArray[1] = 0;
        nArray[0] = 0;
        EMPTY_REPLACEMENT_ARRAY = (char[][])Array.newInstance(Character.TYPE, nArray);
    }

    private ArrayBasedEscaperMap(char[][] cArray) {
        this.replacementArray = cArray;
    }

    public static ArrayBasedEscaperMap create(Map object) {
        object = ArrayBasedEscaperMap.createReplacementArray((Map)object);
        ArrayBasedEscaperMap arrayBasedEscaperMap = new ArrayBasedEscaperMap((char[][])object);
        return arrayBasedEscaperMap;
    }

    public static char[][] createReplacementArray(Map map2) {
        boolean bl2;
        Preconditions.checkNotNull(map2);
        int n3 = map2.isEmpty();
        if (n3 != 0) {
            return EMPTY_REPLACEMENT_ARRAY;
        }
        n3 = ((Character)Collections.max(map2.keySet())).charValue() + '\u0001';
        char[][] cArrayArray = new char[n3][];
        Iterator iterator = map2.keySet().iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (Character)iterator.next();
            char c2 = ((Character)object).charValue();
            object = ((String)map2.get(object)).toCharArray();
            cArrayArray[c2] = (char[])object;
        }
        return cArrayArray;
    }

    public char[][] getReplacementArray() {
        return this.replacementArray;
    }
}

