/*
 * Decompiled with CFR 0.152.
 */
public final class FB0
extends Enum {
    private static final /* synthetic */ FB0[] $VALUES;
    public static final /* enum */ FB0 PUSH_NOTIFICATION_VIEWED;
    public static final /* enum */ FB0 REGULAR;
    public static final /* enum */ FB0 VARIABLES;
    public final String additionalPath;
    public final String httpResource;

    private static /* synthetic */ FB0[] $values() {
        FB0 fB0 = REGULAR;
        fB0 = PUSH_NOTIFICATION_VIEWED;
        fB0 = VARIABLES;
        FB0[] fB0Array = new FB0[]{fB0, fB0, fB0};
        return fB0Array;
    }

    static {
        FB0 fB0;
        String string2 = "";
        REGULAR = fB0 = new FB0("REGULAR", 0, string2, string2);
        PUSH_NOTIFICATION_VIEWED = fB0 = new FB0("PUSH_NOTIFICATION_VIEWED", 1, "-spiky", string2);
        VARIABLES = fB0 = new FB0("VARIABLES", 2, string2, "/defineVars");
        $VALUES = FB0.$values();
    }

    /*
     * WARNING - void declaration
     */
    private FB0() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.httpResource = var3_2;
        this.additionalPath = var4_1;
    }

    public static FB0 valueOf(String string2) {
        return Enum.valueOf(FB0.class, string2);
    }

    public static FB0[] values() {
        return (FB0[])$VALUES.clone();
    }
}

