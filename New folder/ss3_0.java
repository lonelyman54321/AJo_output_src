/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ss3
 */
public final class ss3_0
extends Enum {
    private static final /* synthetic */ ss3_0[] $VALUES;
    public static final /* enum */ ss3_0 Between;
    public static final ss3$a_0 Companion;
    public static final /* enum */ ss3_0 Contains;
    public static final /* enum */ ss3_0 Equals;
    public static final /* enum */ ss3_0 GreaterThan;
    public static final /* enum */ ss3_0 LessThan;
    public static final /* enum */ ss3_0 NotContains;
    public static final /* enum */ ss3_0 NotEquals;
    public static final /* enum */ ss3_0 NotSet;
    public static final /* enum */ ss3_0 Set;
    private final int operatorValue;

    private static final /* synthetic */ ss3_0[] $values() {
        ss3_0 ss3_02 = GreaterThan;
        ss3_02 = Equals;
        ss3_02 = LessThan;
        ss3_02 = Contains;
        ss3_02 = Between;
        ss3_02 = NotEquals;
        ss3_02 = Set;
        ss3_02 = NotSet;
        ss3_02 = NotContains;
        ss3_0[] ss3_0Array = new ss3_0[]{ss3_02, ss3_02, ss3_02, ss3_02, ss3_02, ss3_02, ss3_02, ss3_02, ss3_02};
        return ss3_0Array;
    }

    static {
        Object object;
        GreaterThan = object = new ss3_0("GreaterThan", 0, 0);
        int n3 = 1;
        Equals = object = new ss3_0("Equals", n3, n3);
        n3 = 2;
        LessThan = object = new ss3_0("LessThan", n3, n3);
        n3 = 3;
        Contains = object = new ss3_0("Contains", n3, n3);
        n3 = 4;
        Between = object = new ss3_0("Between", n3, n3);
        NotEquals = object = new ss3_0("NotEquals", 5, 15);
        Set = object = new ss3_0("Set", 6, 26);
        NotSet = object = new ss3_0("NotSet", 7, 27);
        NotContains = object = new ss3_0("NotContains", 8, 28);
        $VALUES = ss3_0.$values();
        object = new Object();
        Companion = object;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ss3_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.operatorValue = var3_2;
    }

    public static ss3_0 valueOf(String string2) {
        return Enum.valueOf(ss3_0.class, string2);
    }

    public static ss3_0[] values() {
        return (ss3_0[])$VALUES.clone();
    }

    public final int getOperatorValue() {
        return this.operatorValue;
    }
}

