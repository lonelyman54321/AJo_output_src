/*
 * Decompiled with CFR 0.152.
 */
public final class aS1
extends Enum {
    private static final /* synthetic */ aS1[] $VALUES;
    public static final /* enum */ aS1 Default;
    public static final /* enum */ aS1 PreventUserInput;
    public static final /* enum */ aS1 UserInput;

    private static final /* synthetic */ aS1[] $values() {
        aS1 aS12 = Default;
        aS12 = UserInput;
        aS12 = PreventUserInput;
        aS1[] aS1Array = new aS1[]{aS12, aS12, aS12};
        return aS1Array;
    }

    static {
        aS1 aS12;
        Default = aS12 = new aS1("Default", 0);
        UserInput = aS12 = new aS1("UserInput", 1);
        PreventUserInput = aS12 = new aS1("PreventUserInput", 2);
        $VALUES = aS1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private aS1() {
        void var2_-1;
        void var1_-1;
    }

    public static aS1 valueOf(String string2) {
        return Enum.valueOf(aS1.class, string2);
    }

    public static aS1[] values() {
        return (aS1[])$VALUES.clone();
    }
}

