/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from xf1
 */
public final class xf1_1
extends Enum {
    private static final /* synthetic */ xf1_1[] $VALUES;
    public static final /* enum */ xf1_1 CLOSE;
    public static final /* enum */ xf1_1 CUSTOM_CODE;
    public static final xf1$a Companion;
    public static final /* enum */ xf1_1 KEY_VALUES;
    public static final /* enum */ xf1_1 OPEN_URL;
    public static final /* enum */ xf1_1 REQUEST_FOR_PERMISSIONS;
    private final String stringValue;

    private static final /* synthetic */ xf1_1[] $values() {
        xf1_1 xf1_12 = CLOSE;
        xf1_12 = OPEN_URL;
        xf1_12 = KEY_VALUES;
        xf1_12 = CUSTOM_CODE;
        xf1_12 = REQUEST_FOR_PERMISSIONS;
        xf1_1[] xf1_1Array = new xf1_1[]{xf1_12, xf1_12, xf1_12, xf1_12, xf1_12};
        return xf1_1Array;
    }

    static {
        Object object;
        CLOSE = object = new xf1_1("CLOSE", 0, "close");
        OPEN_URL = object = new xf1_1("OPEN_URL", 1, "url");
        KEY_VALUES = object = new xf1_1("KEY_VALUES", 2, "kv");
        CUSTOM_CODE = object = new xf1_1("CUSTOM_CODE", 3, "custom-code");
        REQUEST_FOR_PERMISSIONS = object = new xf1_1("REQUEST_FOR_PERMISSIONS", 4, "rfp");
        $VALUES = xf1_1.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xf1_1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.stringValue = var3_2;
    }

    public static final /* synthetic */ String access$getStringValue$p(xf1_1 xf1_12) {
        return xf1_12.stringValue;
    }

    public static xf1_1 valueOf(String string2) {
        return Enum.valueOf(xf1_1.class, string2);
    }

    public static xf1_1[] values() {
        return (xf1_1[])$VALUES.clone();
    }

    public String toString() {
        return this.stringValue;
    }
}

