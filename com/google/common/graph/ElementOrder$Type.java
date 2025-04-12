/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.graph;

public final class ElementOrder$Type
extends Enum {
    private static final /* synthetic */ ElementOrder$Type[] $VALUES;
    public static final /* enum */ ElementOrder$Type INSERTION;
    public static final /* enum */ ElementOrder$Type SORTED;
    public static final /* enum */ ElementOrder$Type STABLE;
    public static final /* enum */ ElementOrder$Type UNORDERED;

    private static /* synthetic */ ElementOrder$Type[] $values() {
        ElementOrder$Type elementOrder$Type = UNORDERED;
        elementOrder$Type = STABLE;
        elementOrder$Type = INSERTION;
        elementOrder$Type = SORTED;
        ElementOrder$Type[] elementOrder$TypeArray = new ElementOrder$Type[]{elementOrder$Type, elementOrder$Type, elementOrder$Type, elementOrder$Type};
        return elementOrder$TypeArray;
    }

    static {
        ElementOrder$Type elementOrder$Type;
        UNORDERED = elementOrder$Type = new ElementOrder$Type("UNORDERED", 0);
        STABLE = elementOrder$Type = new ElementOrder$Type("STABLE", 1);
        INSERTION = elementOrder$Type = new ElementOrder$Type("INSERTION", 2);
        SORTED = elementOrder$Type = new ElementOrder$Type("SORTED", 3);
        $VALUES = ElementOrder$Type.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ElementOrder$Type() {
        void var2_-1;
        void var1_-1;
    }

    public static ElementOrder$Type valueOf(String string2) {
        return Enum.valueOf(ElementOrder$Type.class, string2);
    }

    public static ElementOrder$Type[] values() {
        return (ElementOrder$Type[])$VALUES.clone();
    }
}

