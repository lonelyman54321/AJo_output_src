/*
 * Decompiled with CFR 0.152.
 */
public final class rR2$E$d
extends Enum {
    private static final /* synthetic */ rR2$E$d[] $VALUES;
    public static final /* enum */ rR2$E$d Bevel;
    public static final /* enum */ rR2$E$d Miter;
    public static final /* enum */ rR2$E$d Round;

    static {
        rR2$E$d rR2$E$d;
        rR2$E$d rR2$E$d2;
        rR2$E$d rR2$E$d3;
        Miter = rR2$E$d3 = new rR2$E$d("Miter", 0);
        int n3 = 1;
        Round = rR2$E$d2 = new rR2$E$d("Round", n3);
        int n4 = 2;
        Bevel = rR2$E$d = new rR2$E$d("Bevel", n4);
        rR2$E$d[] rR2$E$dArray = new rR2$E$d[3];
        rR2$E$dArray[0] = rR2$E$d3;
        rR2$E$dArray[n3] = rR2$E$d2;
        rR2$E$dArray[n4] = rR2$E$d;
        $VALUES = rR2$E$dArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private rR2$E$d() {
        void var2_-1;
        void var1_-1;
    }

    public static rR2$E$d valueOf(String string2) {
        return Enum.valueOf(rR2$E$d.class, string2);
    }

    public static rR2$E$d[] values() {
        return (rR2$E$d[])$VALUES.clone();
    }
}

