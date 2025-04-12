/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

public final class ReturnRefundLinksEnum
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ ReturnRefundLinksEnum[] $VALUES;
    public static final /* enum */ ReturnRefundLinksEnum AJIO_WALLET;
    public static final /* enum */ ReturnRefundLinksEnum CREATE_NEW_RETURN;
    public static final /* enum */ ReturnRefundLinksEnum NEED_HELP;
    public static final /* enum */ ReturnRefundLinksEnum NOT_NOW;
    public static final /* enum */ ReturnRefundLinksEnum RAISE_A_CONCERN;
    public static final /* enum */ ReturnRefundLinksEnum REFUND_BREAKUP;
    public static final /* enum */ ReturnRefundLinksEnum REFUND_POLICY;
    public static final /* enum */ ReturnRefundLinksEnum TRANSFER_TO_BANK;
    public static final /* enum */ ReturnRefundLinksEnum VIEW_ORDER;
    public static final /* enum */ ReturnRefundLinksEnum VIEW_REFUND_DETAILS;
    public static final /* enum */ ReturnRefundLinksEnum WHAT_NEXT;

    private static final /* synthetic */ ReturnRefundLinksEnum[] $values() {
        ReturnRefundLinksEnum returnRefundLinksEnum = VIEW_REFUND_DETAILS;
        returnRefundLinksEnum = REFUND_POLICY;
        returnRefundLinksEnum = NEED_HELP;
        returnRefundLinksEnum = VIEW_ORDER;
        returnRefundLinksEnum = CREATE_NEW_RETURN;
        returnRefundLinksEnum = NOT_NOW;
        returnRefundLinksEnum = WHAT_NEXT;
        returnRefundLinksEnum = TRANSFER_TO_BANK;
        returnRefundLinksEnum = RAISE_A_CONCERN;
        returnRefundLinksEnum = REFUND_BREAKUP;
        returnRefundLinksEnum = AJIO_WALLET;
        ReturnRefundLinksEnum[] returnRefundLinksEnumArray = new ReturnRefundLinksEnum[]{returnRefundLinksEnum, returnRefundLinksEnum, returnRefundLinksEnum, returnRefundLinksEnum, returnRefundLinksEnum, returnRefundLinksEnum, returnRefundLinksEnum, returnRefundLinksEnum, returnRefundLinksEnum, returnRefundLinksEnum, returnRefundLinksEnum};
        return returnRefundLinksEnumArray;
    }

    static {
        String string2 = "VIEW_REFUND_DETAILS";
        Enum[] enumArray = new ReturnRefundLinksEnum(string2, 0, string2);
        VIEW_REFUND_DETAILS = enumArray;
        string2 = "REFUND_POLICY";
        enumArray = new ReturnRefundLinksEnum(string2, 1, string2);
        REFUND_POLICY = enumArray;
        string2 = "NEED_HELP";
        enumArray = new ReturnRefundLinksEnum(string2, 2, string2);
        NEED_HELP = enumArray;
        string2 = "VIEW_ORDER";
        enumArray = new ReturnRefundLinksEnum(string2, 3, string2);
        VIEW_ORDER = enumArray;
        string2 = "CREATE_NEW_RETURN";
        enumArray = new ReturnRefundLinksEnum(string2, 4, string2);
        CREATE_NEW_RETURN = enumArray;
        string2 = "NOT_NOW";
        enumArray = new ReturnRefundLinksEnum(string2, 5, string2);
        NOT_NOW = enumArray;
        string2 = "WHAT_NEXT";
        enumArray = new ReturnRefundLinksEnum(string2, 6, string2);
        WHAT_NEXT = enumArray;
        string2 = "TRANSFER_TO_BANK";
        enumArray = new ReturnRefundLinksEnum(string2, 7, string2);
        TRANSFER_TO_BANK = enumArray;
        string2 = "RAISE_A_CONCERN";
        enumArray = new ReturnRefundLinksEnum(string2, 8, string2);
        RAISE_A_CONCERN = enumArray;
        string2 = "REFUND_BREAKUP";
        enumArray = new ReturnRefundLinksEnum(string2, 9, string2);
        REFUND_BREAKUP = enumArray;
        string2 = "AJIO_WALLET";
        enumArray = new ReturnRefundLinksEnum(string2, 10, string2);
        AJIO_WALLET = enumArray;
        enumArray = ReturnRefundLinksEnum.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ReturnRefundLinksEnum() {
        void var2_1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static ReturnRefundLinksEnum valueOf(String string2) {
        return Enum.valueOf(ReturnRefundLinksEnum.class, string2);
    }

    public static ReturnRefundLinksEnum[] values() {
        return (ReturnRefundLinksEnum[])$VALUES.clone();
    }
}

