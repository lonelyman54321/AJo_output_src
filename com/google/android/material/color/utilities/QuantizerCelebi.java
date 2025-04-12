/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.QuantizerWsmeans;
import com.google.android.material.color.utilities.QuantizerWu;
import java.util.Iterator;
import java.util.Map;

public final class QuantizerCelebi {
    private QuantizerCelebi() {
    }

    public static Map quantize(int[] nArray, int n3) {
        int n4;
        Iterator iterator = new Iterator();
        iterator = ((QuantizerWu)((Object)iterator)).quantize((int[])nArray, (int)n3).colorToCount.keySet();
        int n7 = iterator.size();
        int[] nArray2 = new int[n7];
        iterator = iterator.iterator();
        int n8 = 0;
        while ((n4 = iterator.hasNext()) != 0) {
            Integer n10 = (Integer)iterator.next();
            int n14 = n8 + 1;
            nArray2[n8] = n4 = n10.intValue();
            n8 = n14;
        }
        return QuantizerWsmeans.quantize(nArray, nArray2, n3);
    }
}

