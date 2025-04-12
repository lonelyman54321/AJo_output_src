/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

import com.google.common.graph.ElementOrder$Type;

class ElementOrder$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$common$graph$ElementOrder$Type;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ElementOrder$Type elementOrder$Type;
        int n7 = ElementOrder$Type.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$common$graph$ElementOrder$Type = nArray;
        try {
            elementOrder$Type = ElementOrder$Type.UNORDERED;
            n4 = elementOrder$Type.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$graph$ElementOrder$Type;
            elementOrder$Type = ElementOrder$Type.INSERTION;
            n4 = elementOrder$Type.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$graph$ElementOrder$Type;
            elementOrder$Type = ElementOrder$Type.STABLE;
            n4 = elementOrder$Type.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$graph$ElementOrder$Type;
            elementOrder$Type = ElementOrder$Type.SORTED;
            n4 = elementOrder$Type.ordinal();
            nArray[n4] = n3 = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

