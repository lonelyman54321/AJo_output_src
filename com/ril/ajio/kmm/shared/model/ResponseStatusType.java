/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model;

public final class ResponseStatusType
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ ResponseStatusType[] $VALUES;
    public static final /* enum */ ResponseStatusType API_EXCEPTION;
    public static final /* enum */ ResponseStatusType API_FAILURE;
    public static final /* enum */ ResponseStatusType API_LOADING;
    public static final /* enum */ ResponseStatusType API_SUCCESS;
    private final int type;

    private static final /* synthetic */ ResponseStatusType[] $values() {
        ResponseStatusType responseStatusType = API_SUCCESS;
        responseStatusType = API_FAILURE;
        responseStatusType = API_EXCEPTION;
        responseStatusType = API_LOADING;
        ResponseStatusType[] responseStatusTypeArray = new ResponseStatusType[]{responseStatusType, responseStatusType, responseStatusType, responseStatusType};
        return responseStatusTypeArray;
    }

    static {
        Enum[] enumArray = new ResponseStatusType("API_SUCCESS", 0, 0);
        API_SUCCESS = enumArray;
        int n3 = 1;
        enumArray = new ResponseStatusType("API_FAILURE", n3, n3);
        API_FAILURE = enumArray;
        enumArray = new ResponseStatusType("API_EXCEPTION", 2, -1);
        API_EXCEPTION = enumArray;
        enumArray = new ResponseStatusType("API_LOADING", 3, -2);
        API_LOADING = enumArray;
        enumArray = ResponseStatusType.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ResponseStatusType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static ResponseStatusType valueOf(String string2) {
        return Enum.valueOf(ResponseStatusType.class, string2);
    }

    public static ResponseStatusType[] values() {
        return (ResponseStatusType[])$VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}

