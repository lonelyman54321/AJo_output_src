/*
 * Decompiled with CFR 0.152.
 */
public final class Bl3$a
extends Enum {
    private static final /* synthetic */ Bl3$a[] $VALUES;
    public static final /* enum */ Bl3$a HideKeyboard;
    public static final /* enum */ Bl3$a ShowKeyboard;
    public static final /* enum */ Bl3$a StartInput;
    public static final /* enum */ Bl3$a StopInput;

    private static final /* synthetic */ Bl3$a[] $values() {
        Bl3$a bl3$a = StartInput;
        bl3$a = StopInput;
        bl3$a = ShowKeyboard;
        bl3$a = HideKeyboard;
        Bl3$a[] bl3$aArray = new Bl3$a[]{bl3$a, bl3$a, bl3$a, bl3$a};
        return bl3$aArray;
    }

    static {
        Bl3$a bl3$a;
        StartInput = bl3$a = new Bl3$a("StartInput", 0);
        StopInput = bl3$a = new Bl3$a("StopInput", 1);
        ShowKeyboard = bl3$a = new Bl3$a("ShowKeyboard", 2);
        HideKeyboard = bl3$a = new Bl3$a("HideKeyboard", 3);
        $VALUES = Bl3$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Bl3$a() {
        void var2_-1;
        void var1_-1;
    }

    public static Bl3$a valueOf(String string2) {
        return Enum.valueOf(Bl3$a.class, string2);
    }

    public static Bl3$a[] values() {
        return (Bl3$a[])$VALUES.clone();
    }
}

