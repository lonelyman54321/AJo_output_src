/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class MultimapBuilder$3
extends MultimapBuilder$MultimapBuilderWithKeys {
    final /* synthetic */ Comparator val$comparator;

    public MultimapBuilder$3(Comparator comparator) {
        this.val$comparator = comparator;
    }

    public Map createMap() {
        Comparator comparator = this.val$comparator;
        TreeMap treeMap = new TreeMap(comparator);
        return treeMap;
    }
}

