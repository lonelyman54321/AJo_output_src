/*
 * Decompiled with CFR 0.152.
 */
public final class QB0
extends Enum {
    private static final /* synthetic */ QB0[] $VALUES;
    public static final QB0$a Companion;
    public static final /* enum */ QB0 PROFILE;
    public static final /* enum */ QB0 RAISED;
    private final String key;

    private static final /* synthetic */ QB0[] $values() {
        QB0 qB0 = PROFILE;
        qB0 = RAISED;
        QB0[] qB0Array = new QB0[]{qB0, qB0};
        return qB0Array;
    }

    static {
        Object object;
        PROFILE = object = new QB0("PROFILE", 0, "profile");
        RAISED = object = new QB0("RAISED", 1, "raised");
        $VALUES = QB0.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private QB0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.key = var3_2;
    }

    public static QB0 valueOf(String string2) {
        return Enum.valueOf(QB0.class, string2);
    }

    public static QB0[] values() {
        return (QB0[])$VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }
}

