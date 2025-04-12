/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

public final class MerchantViewType
extends Enum {
    private static final /* synthetic */ MerchantViewType[] $VALUES;
    public static final /* enum */ MerchantViewType FOOTER;
    public static final /* enum */ MerchantViewType FOOTER_ATTACHED;
    public static final /* enum */ MerchantViewType HEADER;
    public static final /* enum */ MerchantViewType HEADER_ATTACHED;

    private static /* synthetic */ MerchantViewType[] $values() {
        MerchantViewType merchantViewType = HEADER;
        merchantViewType = HEADER_ATTACHED;
        merchantViewType = FOOTER;
        merchantViewType = FOOTER_ATTACHED;
        MerchantViewType[] merchantViewTypeArray = new MerchantViewType[]{merchantViewType, merchantViewType, merchantViewType, merchantViewType};
        return merchantViewTypeArray;
    }

    static {
        MerchantViewType merchantViewType;
        HEADER = merchantViewType = new MerchantViewType("HEADER", 0);
        HEADER_ATTACHED = merchantViewType = new MerchantViewType("HEADER_ATTACHED", 1);
        FOOTER = merchantViewType = new MerchantViewType("FOOTER", 2);
        FOOTER_ATTACHED = merchantViewType = new MerchantViewType("FOOTER_ATTACHED", 3);
        $VALUES = MerchantViewType.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private MerchantViewType() {
        void var2_-1;
        void var1_-1;
    }

    public static MerchantViewType valueOf(String string2) {
        return Enum.valueOf(MerchantViewType.class, string2);
    }

    public static MerchantViewType[] values() {
        return (MerchantViewType[])$VALUES.clone();
    }
}

