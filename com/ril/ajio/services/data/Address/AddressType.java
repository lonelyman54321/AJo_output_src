/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Address;

public final class AddressType
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ AddressType[] $VALUES;
    public static final /* enum */ AddressType Address;
    public static final /* enum */ AddressType None;
    public static final /* enum */ AddressType PinCodeEmpty;
    public static final /* enum */ AddressType Pincode;

    private static final /* synthetic */ AddressType[] $values() {
        AddressType addressType = Pincode;
        addressType = Address;
        addressType = None;
        addressType = PinCodeEmpty;
        AddressType[] addressTypeArray = new AddressType[]{addressType, addressType, addressType, addressType};
        return addressTypeArray;
    }

    static {
        Enum[] enumArray = new AddressType("Pincode", 0);
        Pincode = enumArray;
        enumArray = new AddressType("Address", 1);
        Address = enumArray;
        enumArray = new AddressType("None", 2);
        None = enumArray;
        enumArray = new AddressType("PinCodeEmpty", 3);
        PinCodeEmpty = enumArray;
        enumArray = AddressType.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AddressType() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static AddressType valueOf(String string2) {
        return Enum.valueOf(AddressType.class, string2);
    }

    public static AddressType[] values() {
        return (AddressType[])$VALUES.clone();
    }
}

