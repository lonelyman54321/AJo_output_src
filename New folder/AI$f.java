/*
 * Decompiled with CFR 0.152.
 */
public final class AI$f
extends Enum {
    private static final /* synthetic */ AI$f[] $VALUES;
    public static final /* enum */ AI$f ACTIVATED;
    public static final /* enum */ AI$f FETCHED;
    public static final /* enum */ AI$f INIT;

    private static /* synthetic */ AI$f[] $values() {
        AI$f aI$f = INIT;
        aI$f = FETCHED;
        aI$f = ACTIVATED;
        AI$f[] aI$fArray = new AI$f[]{aI$f, aI$f, aI$f};
        return aI$fArray;
    }

    static {
        AI$f aI$f;
        INIT = aI$f = new AI$f("INIT", 0);
        FETCHED = aI$f = new AI$f("FETCHED", 1);
        ACTIVATED = aI$f = new AI$f("ACTIVATED", 2);
        $VALUES = AI$f.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AI$f() {
        void var2_-1;
        void var1_-1;
    }

    public static AI$f valueOf(String string2) {
        return Enum.valueOf(AI$f.class, string2);
    }

    public static AI$f[] values() {
        return (AI$f[])$VALUES.clone();
    }
}

