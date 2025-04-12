/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

public final class ProductWishlistState
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ ProductWishlistState[] $VALUES;
    public static final /* enum */ ProductWishlistState ADDED;
    public static final /* enum */ ProductWishlistState DEFAULT;
    public static final /* enum */ ProductWishlistState REMOVED;

    private static final /* synthetic */ ProductWishlistState[] $values() {
        ProductWishlistState productWishlistState = DEFAULT;
        productWishlistState = ADDED;
        productWishlistState = REMOVED;
        ProductWishlistState[] productWishlistStateArray = new ProductWishlistState[]{productWishlistState, productWishlistState, productWishlistState};
        return productWishlistStateArray;
    }

    static {
        Enum[] enumArray = new ProductWishlistState("DEFAULT", 0);
        DEFAULT = enumArray;
        enumArray = new ProductWishlistState("ADDED", 1);
        ADDED = enumArray;
        enumArray = new ProductWishlistState("REMOVED", 2);
        REMOVED = enumArray;
        enumArray = ProductWishlistState.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ProductWishlistState() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static ProductWishlistState valueOf(String string2) {
        return Enum.valueOf(ProductWishlistState.class, string2);
    }

    public static ProductWishlistState[] values() {
        return (ProductWishlistState[])$VALUES.clone();
    }
}

