/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.collect.MapMakerInternalMap$1;
import com.google.common.collect.MapMakerInternalMap$Strength$1;
import com.google.common.collect.MapMakerInternalMap$Strength$2;

abstract class MapMakerInternalMap$Strength
extends Enum {
    private static final /* synthetic */ MapMakerInternalMap$Strength[] $VALUES;
    public static final /* enum */ MapMakerInternalMap$Strength STRONG;
    public static final /* enum */ MapMakerInternalMap$Strength WEAK;

    private static /* synthetic */ MapMakerInternalMap$Strength[] $values() {
        MapMakerInternalMap$Strength mapMakerInternalMap$Strength = STRONG;
        mapMakerInternalMap$Strength = WEAK;
        MapMakerInternalMap$Strength[] mapMakerInternalMap$StrengthArray = new MapMakerInternalMap$Strength[]{mapMakerInternalMap$Strength, mapMakerInternalMap$Strength};
        return mapMakerInternalMap$StrengthArray;
    }

    static {
        MapMakerInternalMap$Strength mapMakerInternalMap$Strength = new MapMakerInternalMap$Strength$1();
        STRONG = mapMakerInternalMap$Strength;
        mapMakerInternalMap$Strength = new MapMakerInternalMap$Strength$2();
        WEAK = mapMakerInternalMap$Strength;
        $VALUES = MapMakerInternalMap$Strength.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MapMakerInternalMap$Strength() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ MapMakerInternalMap$Strength(MapMakerInternalMap$1 mapMakerInternalMap$1) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static MapMakerInternalMap$Strength valueOf(String string2) {
        return Enum.valueOf(MapMakerInternalMap$Strength.class, string2);
    }

    public static MapMakerInternalMap$Strength[] values() {
        return (MapMakerInternalMap$Strength[])$VALUES.clone();
    }

    public abstract Equivalence defaultEquivalence();
}

