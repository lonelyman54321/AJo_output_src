/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from v80
 */
public final class v80_0
extends Enum {
    private static final /* synthetic */ v80_0[] $VALUES;
    public static final /* enum */ v80_0 APP_DATA;
    public static final /* enum */ v80_0 CUSTOM_DATA;
    public static final /* enum */ v80_0 CUSTOM_EVENTS;
    public static final /* enum */ v80_0 USER_DATA;
    private final String rawValue;

    private static final /* synthetic */ v80_0[] $values() {
        v80_0 v80_02 = USER_DATA;
        v80_02 = APP_DATA;
        v80_02 = CUSTOM_DATA;
        v80_02 = CUSTOM_EVENTS;
        v80_0[] v80_0Array = new v80_0[]{v80_02, v80_02, v80_02, v80_02};
        return v80_0Array;
    }

    static {
        v80_0 v80_02;
        USER_DATA = v80_02 = new v80_0("USER_DATA", 0, "user_data");
        APP_DATA = v80_02 = new v80_0("APP_DATA", 1, "app_data");
        CUSTOM_DATA = v80_02 = new v80_0("CUSTOM_DATA", 2, "custom_data");
        CUSTOM_EVENTS = v80_02 = new v80_0("CUSTOM_EVENTS", 3, "custom_events");
        $VALUES = v80_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private v80_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.rawValue = var3_2;
    }

    public static v80_0 valueOf(String string2) {
        return Enum.valueOf(v80_0.class, string2);
    }

    public static v80_0[] values() {
        return (v80_0[])$VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

