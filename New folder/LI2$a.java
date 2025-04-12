/*
 * Decompiled with CFR 0.152.
 */
public final class LI2$a
extends Enum {
    private static final /* synthetic */ LI2$a[] $VALUES;
    public static final /* enum */ LI2$a CUSTOM_APP_EVENTS;
    public static final /* enum */ LI2$a MOBILE_APP_INSTALL;
    private final String eventType;

    private static final /* synthetic */ LI2$a[] $values() {
        LI2$a lI2$a = MOBILE_APP_INSTALL;
        lI2$a = CUSTOM_APP_EVENTS;
        LI2$a[] lI2$aArray = new LI2$a[]{lI2$a, lI2$a};
        return lI2$aArray;
    }

    static {
        LI2$a lI2$a;
        String string2 = "MOBILE_APP_INSTALL";
        MOBILE_APP_INSTALL = lI2$a = new LI2$a(string2, 0, string2);
        string2 = "CUSTOM_APP_EVENTS";
        CUSTOM_APP_EVENTS = lI2$a = new LI2$a(string2, 1, string2);
        $VALUES = LI2$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LI2$a() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.eventType = var3_2;
    }

    public static LI2$a valueOf(String string2) {
        return Enum.valueOf(LI2$a.class, string2);
    }

    public static LI2$a[] values() {
        return (LI2$a[])$VALUES.clone();
    }

    public String toString() {
        return this.eventType;
    }
}

