/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

final class MapMaker$Dummy
extends Enum {
    private static final /* synthetic */ MapMaker$Dummy[] $VALUES;
    public static final /* enum */ MapMaker$Dummy VALUE;

    private static /* synthetic */ MapMaker$Dummy[] $values() {
        MapMaker$Dummy mapMaker$Dummy = VALUE;
        MapMaker$Dummy[] mapMaker$DummyArray = new MapMaker$Dummy[]{mapMaker$Dummy};
        return mapMaker$DummyArray;
    }

    static {
        MapMaker$Dummy mapMaker$Dummy;
        VALUE = mapMaker$Dummy = new MapMaker$Dummy("VALUE", 0);
        $VALUES = MapMaker$Dummy.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MapMaker$Dummy() {
        void var2_-1;
        void var1_-1;
    }

    public static MapMaker$Dummy valueOf(String string2) {
        return Enum.valueOf(MapMaker$Dummy.class, string2);
    }

    public static MapMaker$Dummy[] values() {
        return (MapMaker$Dummy[])$VALUES.clone();
    }
}

