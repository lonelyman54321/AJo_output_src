/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

public final class PDPClosetActionIdentifier
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ PDPClosetActionIdentifier[] $VALUES;
    public static final /* enum */ PDPClosetActionIdentifier DEFAULT;
    public static final /* enum */ PDPClosetActionIdentifier FROM_SIMILAR;
    public static final /* enum */ PDPClosetActionIdentifier FROM_SIMILAR_STL;

    private static final /* synthetic */ PDPClosetActionIdentifier[] $values() {
        PDPClosetActionIdentifier pDPClosetActionIdentifier = DEFAULT;
        pDPClosetActionIdentifier = FROM_SIMILAR;
        pDPClosetActionIdentifier = FROM_SIMILAR_STL;
        PDPClosetActionIdentifier[] pDPClosetActionIdentifierArray = new PDPClosetActionIdentifier[]{pDPClosetActionIdentifier, pDPClosetActionIdentifier, pDPClosetActionIdentifier};
        return pDPClosetActionIdentifierArray;
    }

    static {
        Enum[] enumArray = new PDPClosetActionIdentifier("DEFAULT", 0);
        DEFAULT = enumArray;
        enumArray = new PDPClosetActionIdentifier("FROM_SIMILAR", 1);
        FROM_SIMILAR = enumArray;
        enumArray = new PDPClosetActionIdentifier("FROM_SIMILAR_STL", 2);
        FROM_SIMILAR_STL = enumArray;
        enumArray = PDPClosetActionIdentifier.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PDPClosetActionIdentifier() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static PDPClosetActionIdentifier valueOf(String string2) {
        return Enum.valueOf(PDPClosetActionIdentifier.class, string2);
    }

    public static PDPClosetActionIdentifier[] values() {
        return (PDPClosetActionIdentifier[])$VALUES.clone();
    }
}

