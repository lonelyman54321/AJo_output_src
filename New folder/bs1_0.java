/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bS1
 */
public final class bs1_0
extends Enum {
    private static final /* synthetic */ bs1_0[] $VALUES;
    public static final /* enum */ bs1_0 Default;
    public static final /* enum */ bs1_0 PreventUserInput;
    public static final /* enum */ bs1_0 UserInput;

    private static final /* synthetic */ bs1_0[] $values() {
        bs1_0 bs1_02 = Default;
        bs1_02 = UserInput;
        bs1_02 = PreventUserInput;
        bs1_0[] bs1_0Array = new bs1_0[]{bs1_02, bs1_02, bs1_02};
        return bs1_0Array;
    }

    static {
        bs1_0 bs1_02;
        Default = bs1_02 = new bs1_0("Default", 0);
        UserInput = bs1_02 = new bs1_0("UserInput", 1);
        PreventUserInput = bs1_02 = new bs1_0("PreventUserInput", 2);
        $VALUES = bs1_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bs1_0() {
        void var2_-1;
        void var1_-1;
    }

    public static bs1_0 valueOf(String string2) {
        return Enum.valueOf(bs1_0.class, string2);
    }

    public static bs1_0[] values() {
        return (bs1_0[])$VALUES.clone();
    }
}

