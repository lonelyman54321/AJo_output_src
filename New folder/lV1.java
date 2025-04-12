/*
 * Decompiled with CFR 0.152.
 */
public final class lV1
extends Enum {
    private static final /* synthetic */ lV1[] $VALUES;
    public static final /* enum */ lV1 CONNECTED;
    public static final /* enum */ lV1 METERED;
    public static final /* enum */ lV1 NOT_REQUIRED;
    public static final /* enum */ lV1 NOT_ROAMING;
    public static final /* enum */ lV1 TEMPORARILY_UNMETERED;
    public static final /* enum */ lV1 UNMETERED;

    private static final /* synthetic */ lV1[] $values() {
        lV1 lV12 = NOT_REQUIRED;
        lV12 = CONNECTED;
        lV12 = UNMETERED;
        lV12 = NOT_ROAMING;
        lV12 = METERED;
        lV12 = TEMPORARILY_UNMETERED;
        lV1[] lV1Array = new lV1[]{lV12, lV12, lV12, lV12, lV12, lV12};
        return lV1Array;
    }

    static {
        lV1 lV12;
        NOT_REQUIRED = lV12 = new lV1("NOT_REQUIRED", 0);
        CONNECTED = lV12 = new lV1("CONNECTED", 1);
        UNMETERED = lV12 = new lV1("UNMETERED", 2);
        NOT_ROAMING = lV12 = new lV1("NOT_ROAMING", 3);
        METERED = lV12 = new lV1("METERED", 4);
        TEMPORARILY_UNMETERED = lV12 = new lV1("TEMPORARILY_UNMETERED", 5);
        $VALUES = lV1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lV1() {
        void var2_-1;
        void var1_-1;
    }

    public static lV1 valueOf(String string2) {
        return Enum.valueOf(lV1.class, string2);
    }

    public static lV1[] values() {
        return (lV1[])$VALUES.clone();
    }
}

