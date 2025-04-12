/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from rg2
 */
public final class rg2_1
extends Enum {
    private static final /* synthetic */ rg2_1[] $VALUES;
    public static final /* enum */ rg2_1 ACTION_SOURCE;
    public static final /* enum */ rg2_1 APP;
    public static final /* enum */ rg2_1 EVENT;
    public static final /* enum */ rg2_1 INSTALL_EVENT_TIME;
    public static final /* enum */ rg2_1 MOBILE_APP_INSTALL;
    private final String rawValue;

    private static final /* synthetic */ rg2_1[] $values() {
        rg2_1 rg2_12 = EVENT;
        rg2_12 = ACTION_SOURCE;
        rg2_12 = APP;
        rg2_12 = MOBILE_APP_INSTALL;
        rg2_12 = INSTALL_EVENT_TIME;
        rg2_1[] rg2_1Array = new rg2_1[]{rg2_12, rg2_12, rg2_12, rg2_12, rg2_12};
        return rg2_1Array;
    }

    static {
        rg2_1 rg2_12;
        EVENT = rg2_12 = new rg2_1("EVENT", 0, "event");
        ACTION_SOURCE = rg2_12 = new rg2_1("ACTION_SOURCE", 1, "action_source");
        APP = rg2_12 = new rg2_1("APP", 2, "app");
        MOBILE_APP_INSTALL = rg2_12 = new rg2_1("MOBILE_APP_INSTALL", 3, "MobileAppInstall");
        INSTALL_EVENT_TIME = rg2_12 = new rg2_1("INSTALL_EVENT_TIME", 4, "install_timestamp");
        $VALUES = rg2_1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rg2_1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.rawValue = var3_2;
    }

    public static rg2_1 valueOf(String string2) {
        return Enum.valueOf(rg2_1.class, string2);
    }

    public static rg2_1[] values() {
        return (rg2_1[])$VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

