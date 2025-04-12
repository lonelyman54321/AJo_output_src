/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

public final class CMSRequestType
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ CMSRequestType[] $VALUES;
    public static final /* enum */ CMSRequestType REQUEST_TYPE_HOME;
    public static final /* enum */ CMSRequestType REQUEST_TYPE_SEARCH;
    private final int type;

    private static final /* synthetic */ CMSRequestType[] $values() {
        CMSRequestType cMSRequestType = REQUEST_TYPE_HOME;
        cMSRequestType = REQUEST_TYPE_SEARCH;
        CMSRequestType[] cMSRequestTypeArray = new CMSRequestType[]{cMSRequestType, cMSRequestType};
        return cMSRequestTypeArray;
    }

    static {
        int n3 = 1;
        Enum[] enumArray = new CMSRequestType("REQUEST_TYPE_HOME", 0, n3);
        REQUEST_TYPE_HOME = enumArray;
        enumArray = new CMSRequestType("REQUEST_TYPE_SEARCH", n3, 2);
        REQUEST_TYPE_SEARCH = enumArray;
        enumArray = CMSRequestType.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CMSRequestType() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static CMSRequestType valueOf(String string2) {
        return Enum.valueOf(CMSRequestType.class, string2);
    }

    public static CMSRequestType[] values() {
        return (CMSRequestType[])$VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}

