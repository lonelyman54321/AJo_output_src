/*
 * Decompiled with CFR 0.152.
 */
public final class ao3
extends Enum {
    private static final /* synthetic */ ao3[] $VALUES;
    public static final /* enum */ ao3 Indeterminate;
    public static final /* enum */ ao3 Off;
    public static final /* enum */ ao3 On;

    private static final /* synthetic */ ao3[] $values() {
        ao3 ao32 = On;
        ao32 = Off;
        ao32 = Indeterminate;
        ao3[] ao3Array = new ao3[]{ao32, ao32, ao32};
        return ao3Array;
    }

    static {
        ao3 ao32;
        On = ao32 = new ao3("On", 0);
        Off = ao32 = new ao3("Off", 1);
        Indeterminate = ao32 = new ao3("Indeterminate", 2);
        $VALUES = ao3.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ao3() {
        void var2_-1;
        void var1_-1;
    }

    public static ao3 valueOf(String string2) {
        return Enum.valueOf(ao3.class, string2);
    }

    public static ao3[] values() {
        return (ao3[])$VALUES.clone();
    }
}

