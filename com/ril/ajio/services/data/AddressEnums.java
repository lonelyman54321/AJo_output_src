/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

public final class AddressEnums
extends Enum {
    private static final /* synthetic */ AddressEnums[] $VALUES;
    public static final /* enum */ AddressEnums CART_MODE;
    public static final /* enum */ AddressEnums MY_ACCOUNT_MODE;

    private static /* synthetic */ AddressEnums[] $values() {
        AddressEnums addressEnums = CART_MODE;
        addressEnums = MY_ACCOUNT_MODE;
        AddressEnums[] addressEnumsArray = new AddressEnums[]{addressEnums, addressEnums};
        return addressEnumsArray;
    }

    static {
        AddressEnums addressEnums;
        CART_MODE = addressEnums = new AddressEnums("CART_MODE", 0);
        MY_ACCOUNT_MODE = addressEnums = new AddressEnums("MY_ACCOUNT_MODE", 1);
        $VALUES = AddressEnums.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AddressEnums() {
        void var2_-1;
        void var1_-1;
    }

    public static AddressEnums valueOf(String string2) {
        return Enum.valueOf(AddressEnums.class, string2);
    }

    public static AddressEnums[] values() {
        return (AddressEnums[])$VALUES.clone();
    }
}

