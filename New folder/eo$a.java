/*
 * Decompiled with CFR 0.152.
 */
public final class eo$a
extends Enum {
    private static final /* synthetic */ eo$a[] $VALUES;
    public static final /* enum */ eo$a CUSTOM_APP_EVENTS;
    public static final /* enum */ eo$a MOBILE_INSTALL_EVENT;

    private static final /* synthetic */ eo$a[] $values() {
        eo$a eo$a = MOBILE_INSTALL_EVENT;
        eo$a = CUSTOM_APP_EVENTS;
        eo$a[] eo$aArray = new eo$a[]{eo$a, eo$a};
        return eo$aArray;
    }

    static {
        eo$a eo$a;
        MOBILE_INSTALL_EVENT = eo$a = new eo$a("MOBILE_INSTALL_EVENT", 0);
        CUSTOM_APP_EVENTS = eo$a = new eo$a("CUSTOM_APP_EVENTS", 1);
        $VALUES = eo$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private eo$a() {
        void var2_-1;
        void var1_-1;
    }

    public static eo$a valueOf(String string2) {
        return Enum.valueOf(eo$a.class, string2);
    }

    public static eo$a[] values() {
        return (eo$a[])$VALUES.clone();
    }
}

