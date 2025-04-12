/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from GY0
 */
public final class gy0_0
extends Enum {
    private static final /* synthetic */ gy0_0[] $VALUES;
    public static final /* enum */ gy0_0 ContextChoose;
    public static final /* enum */ gy0_0 JoinTournament;
    private final String rawValue;

    private static final /* synthetic */ gy0_0[] $values() {
        gy0_0 gy0_02 = ContextChoose;
        gy0_02 = JoinTournament;
        gy0_0[] gy0_0Array = new gy0_0[]{gy0_02, gy0_02};
        return gy0_0Array;
    }

    static {
        gy0_0 gy0_02;
        ContextChoose = gy0_02 = new gy0_0("ContextChoose", 0, "context_choose");
        JoinTournament = gy0_02 = new gy0_0("JoinTournament", 1, "join_tournament");
        $VALUES = gy0_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gy0_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.rawValue = var3_2;
    }

    public static gy0_0 valueOf(String string2) {
        return Enum.valueOf(gy0_0.class, string2);
    }

    public static gy0_0[] values() {
        return (gy0_0[])$VALUES.clone();
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}

