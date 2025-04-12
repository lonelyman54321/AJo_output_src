/*
 * Decompiled with CFR 0.152.
 */
public final class lI3$a
extends Enum {
    private static final /* synthetic */ lI3$a[] $VALUES;
    public static final /* enum */ lI3$a APPLIED_FOR_NEXT_RUN;
    public static final /* enum */ lI3$a APPLIED_IMMEDIATELY;
    public static final /* enum */ lI3$a NOT_APPLIED;

    private static final /* synthetic */ lI3$a[] $values() {
        lI3$a lI3$a = NOT_APPLIED;
        lI3$a = APPLIED_IMMEDIATELY;
        lI3$a = APPLIED_FOR_NEXT_RUN;
        lI3$a[] lI3$aArray = new lI3$a[]{lI3$a, lI3$a, lI3$a};
        return lI3$aArray;
    }

    static {
        lI3$a lI3$a;
        NOT_APPLIED = lI3$a = new lI3$a("NOT_APPLIED", 0);
        APPLIED_IMMEDIATELY = lI3$a = new lI3$a("APPLIED_IMMEDIATELY", 1);
        APPLIED_FOR_NEXT_RUN = lI3$a = new lI3$a("APPLIED_FOR_NEXT_RUN", 2);
        $VALUES = lI3$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private lI3$a() {
        void var2_-1;
        void var1_-1;
    }

    public static lI3$a valueOf(String string2) {
        return Enum.valueOf(lI3$a.class, string2);
    }

    public static lI3$a[] values() {
        return (lI3$a[])$VALUES.clone();
    }
}

