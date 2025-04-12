/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.cache.LocalCache$1;
import com.google.common.cache.LocalCache$Segment;
import com.google.common.cache.LocalCache$Strength$1;
import com.google.common.cache.LocalCache$Strength$2;
import com.google.common.cache.LocalCache$Strength$3;
import com.google.common.cache.LocalCache$ValueReference;
import com.google.common.cache.ReferenceEntry;

abstract class LocalCache$Strength
extends Enum {
    private static final /* synthetic */ LocalCache$Strength[] $VALUES;
    public static final /* enum */ LocalCache$Strength SOFT;
    public static final /* enum */ LocalCache$Strength STRONG;
    public static final /* enum */ LocalCache$Strength WEAK;

    private static /* synthetic */ LocalCache$Strength[] $values() {
        LocalCache$Strength localCache$Strength = STRONG;
        localCache$Strength = SOFT;
        localCache$Strength = WEAK;
        LocalCache$Strength[] localCache$StrengthArray = new LocalCache$Strength[]{localCache$Strength, localCache$Strength, localCache$Strength};
        return localCache$StrengthArray;
    }

    static {
        LocalCache$Strength localCache$Strength = new LocalCache$Strength$1();
        STRONG = localCache$Strength;
        localCache$Strength = new LocalCache$Strength$2();
        SOFT = localCache$Strength;
        localCache$Strength = new LocalCache$Strength$3();
        WEAK = localCache$Strength;
        $VALUES = LocalCache$Strength.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LocalCache$Strength() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ LocalCache$Strength(LocalCache$1 localCache$1) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static LocalCache$Strength valueOf(String string2) {
        return Enum.valueOf(LocalCache$Strength.class, string2);
    }

    public static LocalCache$Strength[] values() {
        return (LocalCache$Strength[])$VALUES.clone();
    }

    public abstract Equivalence defaultEquivalence();

    public abstract LocalCache$ValueReference referenceValue(LocalCache$Segment var1, ReferenceEntry var2, Object var3, int var4);
}

