/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$E$a
extends Enum {
    private static final /* synthetic */ rR2$E$a[] $VALUES;
    public static final /* enum */ rR2$E$a EvenOdd;
    public static final /* enum */ rR2$E$a NonZero;

    static {
        rR2$E$a rR2$E$a;
        rR2$E$a rR2$E$a2;
        NonZero = rR2$E$a2 = new rR2$E$a("NonZero", 0);
        int n3 = 1;
        EvenOdd = rR2$E$a = new rR2$E$a("EvenOdd", n3);
        rR2$E$a[] rR2$E$aArray = new rR2$E$a[2];
        rR2$E$aArray[0] = rR2$E$a2;
        rR2$E$aArray[n3] = rR2$E$a;
        $VALUES = rR2$E$aArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rR2$E$a() {
        void var2_-1;
        void var1_-1;
    }

    public static rR2$E$a valueOf(String string2) {
        return Enum.valueOf(rR2$E$a.class, string2);
    }

    public static rR2$E$a[] values() {
        return (rR2$E$a[])$VALUES.clone();
    }
}

