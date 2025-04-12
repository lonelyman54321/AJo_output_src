/*
 * Decompiled with CFR 0.152.
 */
public final class CH$e
extends Enum {
    private static final /* synthetic */ CH$e[] $VALUES;
    public static final /* enum */ CH$e CHILD;
    public static final /* enum */ CH$e DESCENDANT;
    public static final /* enum */ CH$e FOLLOWS;

    static {
        CH$e cH$e;
        CH$e cH$e2;
        CH$e cH$e3;
        DESCENDANT = cH$e3 = new CH$e("DESCENDANT", 0);
        int n3 = 1;
        CHILD = cH$e2 = new CH$e("CHILD", n3);
        int n4 = 2;
        FOLLOWS = cH$e = new CH$e("FOLLOWS", n4);
        CH$e[] cH$eArray = new CH$e[3];
        cH$eArray[0] = cH$e3;
        cH$eArray[n3] = cH$e2;
        cH$eArray[n4] = cH$e;
        $VALUES = cH$eArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CH$e() {
        void var2_-1;
        void var1_-1;
    }

    public static CH$e valueOf(String string2) {
        return Enum.valueOf(CH$e.class, string2);
    }

    public static CH$e[] values() {
        return (CH$e[])$VALUES.clone();
    }
}

