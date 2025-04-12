/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.permission;

public final class PermissionTrigger
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ PermissionTrigger[] $VALUES;
    public static final /* enum */ PermissionTrigger CART;
    public static final /* enum */ PermissionTrigger RATINGS;
    public static final /* enum */ PermissionTrigger SESSIONS;
    public static final /* enum */ PermissionTrigger WISHLIST;
    private final String value;

    private static final /* synthetic */ PermissionTrigger[] $values() {
        PermissionTrigger permissionTrigger = WISHLIST;
        permissionTrigger = CART;
        permissionTrigger = SESSIONS;
        permissionTrigger = RATINGS;
        PermissionTrigger[] permissionTriggerArray = new PermissionTrigger[]{permissionTrigger, permissionTrigger, permissionTrigger, permissionTrigger};
        return permissionTriggerArray;
    }

    static {
        Enum[] enumArray = new PermissionTrigger("WISHLIST", 0, "wishlist");
        WISHLIST = enumArray;
        enumArray = new PermissionTrigger("CART", 1, "cart");
        CART = enumArray;
        enumArray = new PermissionTrigger("SESSIONS", 2, "sessions");
        SESSIONS = enumArray;
        enumArray = new PermissionTrigger("RATINGS", 3, "ratings");
        RATINGS = enumArray;
        enumArray = PermissionTrigger.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PermissionTrigger() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.value = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static PermissionTrigger valueOf(String string2) {
        return Enum.valueOf(PermissionTrigger.class, string2);
    }

    public static PermissionTrigger[] values() {
        return (PermissionTrigger[])$VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}

