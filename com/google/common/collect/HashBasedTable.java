/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.CollectPreconditions;
import com.google.common.collect.HashBasedTable$Factory;
import com.google.common.collect.Maps;
import com.google.common.collect.StandardTable;
import com.google.common.collect.Table;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashBasedTable
extends StandardTable {
    private static final long serialVersionUID;

    public HashBasedTable(Map map2, HashBasedTable$Factory hashBasedTable$Factory) {
        super(map2, hashBasedTable$Factory);
    }

    public static HashBasedTable create() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashBasedTable$Factory hashBasedTable$Factory = new HashBasedTable$Factory(0);
        HashBasedTable hashBasedTable = new HashBasedTable(linkedHashMap, hashBasedTable$Factory);
        return hashBasedTable;
    }

    public static HashBasedTable create(int n3, int n4) {
        CollectPreconditions.checkNonnegative(n4, "expectedCellsPerRow");
        LinkedHashMap linkedHashMap = Maps.newLinkedHashMapWithExpectedSize(n3);
        HashBasedTable$Factory hashBasedTable$Factory = new HashBasedTable$Factory(n4);
        HashBasedTable hashBasedTable = new HashBasedTable((Map)linkedHashMap, hashBasedTable$Factory);
        return hashBasedTable;
    }

    public static HashBasedTable create(Table table) {
        HashBasedTable hashBasedTable = HashBasedTable.create();
        hashBasedTable.putAll(table);
        return hashBasedTable;
    }
}

