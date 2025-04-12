/*
 * Decompiled with CFR 0.152.
 */
public final class LI2$c
extends Enum {
    private static final /* synthetic */ LI2$c[] $VALUES;
    public static final /* enum */ LI2$c OPERATION_SUCCESS;
    public static final /* enum */ LI2$c SERVICE_ERROR;
    public static final /* enum */ LI2$c SERVICE_NOT_AVAILABLE;

    private static final /* synthetic */ LI2$c[] $values() {
        LI2$c lI2$c = OPERATION_SUCCESS;
        lI2$c = SERVICE_NOT_AVAILABLE;
        lI2$c = SERVICE_ERROR;
        LI2$c[] lI2$cArray = new LI2$c[]{lI2$c, lI2$c, lI2$c};
        return lI2$cArray;
    }

    static {
        LI2$c lI2$c;
        OPERATION_SUCCESS = lI2$c = new LI2$c("OPERATION_SUCCESS", 0);
        SERVICE_NOT_AVAILABLE = lI2$c = new LI2$c("SERVICE_NOT_AVAILABLE", 1);
        SERVICE_ERROR = lI2$c = new LI2$c("SERVICE_ERROR", 2);
        $VALUES = LI2$c.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private LI2$c() {
        void var2_-1;
        void var1_-1;
    }

    public static LI2$c valueOf(String string2) {
        return Enum.valueOf(LI2$c.class, string2);
    }

    public static LI2$c[] values() {
        return (LI2$c[])$VALUES.clone();
    }
}

