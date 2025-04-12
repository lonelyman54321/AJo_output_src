/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.color.utilities;

import com.google.android.material.color.utilities.Quantizer;
import com.google.android.material.color.utilities.QuantizerResult;
import java.util.LinkedHashMap;
import java.util.Map;

public final class QuantizerMap
implements Quantizer {
    Map colorToCount;

    public Map getColorToCount() {
        return this.colorToCount;
    }

    public QuantizerResult quantize(int[] object, int n3) {
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        for (Object object2 : object) {
            Integer n4 = (int)object2;
            n4 = (Integer)linkedHashMap.get(n4);
            int n7 = 1;
            if (n4 != null) {
                int n8 = n4;
                n7 += n8;
            }
            Integer n10 = (int)object2;
            n4 = n7;
            linkedHashMap.put(n10, n4);
        }
        this.colorToCount = linkedHashMap;
        QuantizerResult quantizerResult = new QuantizerResult(linkedHashMap);
        return quantizerResult;
    }
}

