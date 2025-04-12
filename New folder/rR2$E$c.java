/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$E$c
extends Enum {
    private static final /* synthetic */ rR2$E$c[] $VALUES;
    public static final /* enum */ rR2$E$c Butt;
    public static final /* enum */ rR2$E$c Round;
    public static final /* enum */ rR2$E$c Square;

    static {
        rR2$E$c rR2$E$c;
        rR2$E$c rR2$E$c2;
        rR2$E$c rR2$E$c3;
        Butt = rR2$E$c3 = new rR2$E$c("Butt", 0);
        int n3 = 1;
        Round = rR2$E$c2 = new rR2$E$c("Round", n3);
        int n4 = 2;
        Square = rR2$E$c = new rR2$E$c("Square", n4);
        rR2$E$c[] rR2$E$cArray = new rR2$E$c[3];
        rR2$E$cArray[0] = rR2$E$c3;
        rR2$E$cArray[n3] = rR2$E$c2;
        rR2$E$cArray[n4] = rR2$E$c;
        $VALUES = rR2$E$cArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rR2$E$c() {
        void var2_-1;
        void var1_-1;
    }

    public static rR2$E$c valueOf(String string2) {
        return Enum.valueOf(rR2$E$c.class, string2);
    }

    public static rR2$E$c[] values() {
        return (rR2$E$c[])$VALUES.clone();
    }
}

