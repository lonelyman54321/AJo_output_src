/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from le0
 */
public final class le0_0
extends Enum {
    private static final /* synthetic */ le0_0[] $VALUES;
    public static final /* enum */ le0_0 COLLAPSED;
    public static final /* enum */ le0_0 CROSSED;
    public static final /* enum */ le0_0 NOT_CROSSED;

    private static final /* synthetic */ le0_0[] $values() {
        le0_0 le0_02 = CROSSED;
        le0_02 = NOT_CROSSED;
        le0_02 = COLLAPSED;
        le0_0[] le0_0Array = new le0_0[]{le0_02, le0_02, le0_02};
        return le0_0Array;
    }

    static {
        le0_0 le0_02;
        CROSSED = le0_02 = new le0_0("CROSSED", 0);
        NOT_CROSSED = le0_02 = new le0_0("NOT_CROSSED", 1);
        COLLAPSED = le0_02 = new le0_0("COLLAPSED", 2);
        $VALUES = le0_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private le0_0() {
        void var2_-1;
        void var1_-1;
    }

    public static le0_0 valueOf(String string2) {
        return Enum.valueOf(le0_0.class, string2);
    }

    public static le0_0[] values() {
        return (le0_0[])$VALUES.clone();
    }
}

