/*
 * Decompiled with CFR 0.152.
 */
public final class CE0
extends Enum {
    private static final /* synthetic */ CE0[] $VALUES;
    public static final /* enum */ CE0 CANCEL_AND_REENQUEUE;
    public static final /* enum */ CE0 KEEP;
    public static final /* enum */ CE0 REPLACE;
    public static final /* enum */ CE0 UPDATE;

    private static final /* synthetic */ CE0[] $values() {
        CE0 cE0 = REPLACE;
        cE0 = KEEP;
        cE0 = UPDATE;
        cE0 = CANCEL_AND_REENQUEUE;
        CE0[] cE0Array = new CE0[]{cE0, cE0, cE0, cE0};
        return cE0Array;
    }

    static {
        CE0 cE0;
        REPLACE = cE0 = new CE0("REPLACE", 0);
        KEEP = cE0 = new CE0("KEEP", 1);
        UPDATE = cE0 = new CE0("UPDATE", 2);
        CANCEL_AND_REENQUEUE = cE0 = new CE0("CANCEL_AND_REENQUEUE", 3);
        $VALUES = CE0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CE0() {
        void var2_-1;
        void var1_-1;
    }

    public static CE0 valueOf(String string2) {
        return Enum.valueOf(CE0.class, string2);
    }

    public static CE0[] values() {
        return (CE0[])$VALUES.clone();
    }
}

