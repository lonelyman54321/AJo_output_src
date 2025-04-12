/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.base.Ascii;
import com.google.common.base.Equivalence;
import com.google.common.base.MoreObjects;
import com.google.common.base.MoreObjects$ToStringHelper;
import com.google.common.base.Preconditions;
import com.google.common.collect.MapMakerInternalMap;
import com.google.common.collect.MapMakerInternalMap$Strength;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class MapMaker {
    private static final int DEFAULT_CONCURRENCY_LEVEL = 4;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    static final int UNSET_INT = 255;
    int concurrencyLevel;
    int initialCapacity;
    Equivalence keyEquivalence;
    MapMakerInternalMap$Strength keyStrength;
    boolean useCustomMap;
    MapMakerInternalMap$Strength valueStrength;

    public MapMaker() {
        int n3;
        this.initialCapacity = n3 = -1;
        this.concurrencyLevel = n3;
    }

    public MapMaker concurrencyLevel(int n3) {
        int n4 = this.concurrencyLevel;
        int n7 = -1;
        boolean bl2 = false;
        n7 = n4 == n7 ? 1 : 0;
        String string2 = "concurrency level was already set to %s";
        Preconditions.checkState(n7 != 0, string2, n4);
        if (n3 > 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        this.concurrencyLevel = n3;
        return this;
    }

    public int getConcurrencyLevel() {
        int n3 = this.concurrencyLevel;
        int n4 = -1;
        if (n3 == n4) {
            n3 = 4;
        }
        return n3;
    }

    public int getInitialCapacity() {
        int n3 = this.initialCapacity;
        int n4 = -1;
        if (n3 == n4) {
            n3 = 16;
        }
        return n3;
    }

    public Equivalence getKeyEquivalence() {
        Equivalence equivalence = this.keyEquivalence;
        Equivalence equivalence2 = this.getKeyStrength().defaultEquivalence();
        return (Equivalence)MoreObjects.firstNonNull(equivalence, equivalence2);
    }

    public MapMakerInternalMap$Strength getKeyStrength() {
        MapMakerInternalMap$Strength mapMakerInternalMap$Strength = this.keyStrength;
        MapMakerInternalMap$Strength mapMakerInternalMap$Strength2 = MapMakerInternalMap$Strength.STRONG;
        return (MapMakerInternalMap$Strength)((Object)MoreObjects.firstNonNull((Object)mapMakerInternalMap$Strength, (Object)mapMakerInternalMap$Strength2));
    }

    public MapMakerInternalMap$Strength getValueStrength() {
        MapMakerInternalMap$Strength mapMakerInternalMap$Strength = this.valueStrength;
        MapMakerInternalMap$Strength mapMakerInternalMap$Strength2 = MapMakerInternalMap$Strength.STRONG;
        return (MapMakerInternalMap$Strength)((Object)MoreObjects.firstNonNull((Object)mapMakerInternalMap$Strength, (Object)mapMakerInternalMap$Strength2));
    }

    public MapMaker initialCapacity(int n3) {
        int n4 = this.initialCapacity;
        int n7 = -1;
        boolean bl2 = false;
        n7 = n4 == n7 ? 1 : 0;
        String string2 = "initial capacity was already set to %s";
        Preconditions.checkState(n7 != 0, string2, n4);
        if (n3 >= 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        this.initialCapacity = n3;
        return this;
    }

    public MapMaker keyEquivalence(Equivalence equivalence) {
        Equivalence equivalence2 = this.keyEquivalence;
        boolean bl2 = true;
        boolean bl3 = equivalence2 == null;
        Preconditions.checkState(bl3, "key equivalence was already set to %s", (Object)equivalence2);
        this.keyEquivalence = equivalence = (Equivalence)Preconditions.checkNotNull(equivalence);
        this.useCustomMap = bl2;
        return this;
    }

    public ConcurrentMap makeMap() {
        boolean bl2 = this.useCustomMap;
        if (!bl2) {
            int n3 = this.getInitialCapacity();
            int n4 = this.getConcurrencyLevel();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(n3, 0.75f, n4);
            return concurrentHashMap;
        }
        return MapMakerInternalMap.create(this);
    }

    public MapMaker setKeyStrength(MapMakerInternalMap$Strength mapMakerInternalMap$Strength) {
        MapMakerInternalMap$Strength mapMakerInternalMap$Strength2 = this.keyStrength;
        boolean bl2 = true;
        boolean bl3 = mapMakerInternalMap$Strength2 == null;
        String string2 = "Key strength was already set to %s";
        Preconditions.checkState(bl3, string2, (Object)mapMakerInternalMap$Strength2);
        this.keyStrength = mapMakerInternalMap$Strength2 = (MapMakerInternalMap$Strength)((Object)Preconditions.checkNotNull((Object)mapMakerInternalMap$Strength));
        mapMakerInternalMap$Strength2 = MapMakerInternalMap$Strength.STRONG;
        if (mapMakerInternalMap$Strength != mapMakerInternalMap$Strength2) {
            this.useCustomMap = bl2;
        }
        return this;
    }

    public MapMaker setValueStrength(MapMakerInternalMap$Strength mapMakerInternalMap$Strength) {
        MapMakerInternalMap$Strength mapMakerInternalMap$Strength2 = this.valueStrength;
        boolean bl2 = true;
        boolean bl3 = mapMakerInternalMap$Strength2 == null;
        String string2 = "Value strength was already set to %s";
        Preconditions.checkState(bl3, string2, (Object)mapMakerInternalMap$Strength2);
        this.valueStrength = mapMakerInternalMap$Strength2 = (MapMakerInternalMap$Strength)((Object)Preconditions.checkNotNull((Object)mapMakerInternalMap$Strength));
        mapMakerInternalMap$Strength2 = MapMakerInternalMap$Strength.STRONG;
        if (mapMakerInternalMap$Strength != mapMakerInternalMap$Strength2) {
            this.useCustomMap = bl2;
        }
        return this;
    }

    public String toString() {
        Object object;
        String string2;
        MoreObjects$ToStringHelper moreObjects$ToStringHelper = MoreObjects.toStringHelper(this);
        int n3 = this.initialCapacity;
        int n4 = -1;
        if (n3 != n4) {
            String string3 = "initialCapacity";
            moreObjects$ToStringHelper.add(string3, n3);
        }
        if ((n3 = this.concurrencyLevel) != n4) {
            string2 = "concurrencyLevel";
            moreObjects$ToStringHelper.add(string2, n3);
        }
        if ((object = this.keyStrength) != null) {
            object = Ascii.toLowerCase(object.toString());
            string2 = "keyStrength";
            moreObjects$ToStringHelper.add(string2, object);
        }
        if ((object = this.valueStrength) != null) {
            object = Ascii.toLowerCase(object.toString());
            string2 = "valueStrength";
            moreObjects$ToStringHelper.add(string2, object);
        }
        if ((object = this.keyEquivalence) != null) {
            object = "keyEquivalence";
            moreObjects$ToStringHelper.addValue(object);
        }
        return moreObjects$ToStringHelper.toString();
    }

    public MapMaker weakKeys() {
        MapMakerInternalMap$Strength mapMakerInternalMap$Strength = MapMakerInternalMap$Strength.WEAK;
        return this.setKeyStrength(mapMakerInternalMap$Strength);
    }

    public MapMaker weakValues() {
        MapMakerInternalMap$Strength mapMakerInternalMap$Strength = MapMakerInternalMap$Strength.WEAK;
        return this.setValueStrength(mapMakerInternalMap$Strength);
    }
}

