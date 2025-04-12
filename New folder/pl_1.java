/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from pl
 */
public final class pl_1
extends Enum {
    private static final /* synthetic */ pl_1[] $VALUES;
    public static final /* enum */ pl_1 BoundReached;
    public static final /* enum */ pl_1 Finished;

    private static final /* synthetic */ pl_1[] $values() {
        pl_1 pl_12 = BoundReached;
        pl_12 = Finished;
        pl_1[] pl_1Array = new pl_1[]{pl_12, pl_12};
        return pl_1Array;
    }

    static {
        pl_1 pl_12;
        BoundReached = pl_12 = new pl_1("BoundReached", 0);
        Finished = pl_12 = new pl_1("Finished", 1);
        $VALUES = pl_1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private pl_1() {
        void var2_-1;
        void var1_-1;
    }

    public static pl_1 valueOf(String string2) {
        return Enum.valueOf(pl_1.class, string2);
    }

    public static pl_1[] values() {
        return (pl_1[])$VALUES.clone();
    }
}

