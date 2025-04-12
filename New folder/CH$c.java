/*
 * Decompiled with CFR 0.152.
 */
public final class CH$c
extends Enum {
    private static final /* synthetic */ CH$c[] $VALUES;
    public static final /* enum */ CH$c DASHMATCH;
    public static final /* enum */ CH$c EQUALS;
    public static final /* enum */ CH$c EXISTS;
    public static final /* enum */ CH$c INCLUDES;

    static {
        CH$c cH$c;
        CH$c cH$c2;
        CH$c cH$c3;
        CH$c cH$c4;
        EXISTS = cH$c4 = new CH$c("EXISTS", 0);
        int n3 = 1;
        EQUALS = cH$c3 = new CH$c("EQUALS", n3);
        int n4 = 2;
        INCLUDES = cH$c2 = new CH$c("INCLUDES", n4);
        int n7 = 3;
        DASHMATCH = cH$c = new CH$c("DASHMATCH", n7);
        CH$c[] cH$cArray = new CH$c[4];
        cH$cArray[0] = cH$c4;
        cH$cArray[n3] = cH$c3;
        cH$cArray[n4] = cH$c2;
        cH$cArray[n7] = cH$c;
        $VALUES = cH$cArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CH$c() {
        void var2_-1;
        void var1_-1;
    }

    public static CH$c valueOf(String string2) {
        return Enum.valueOf(CH$c.class, string2);
    }

    public static CH$c[] values() {
        return (CH$c[])$VALUES.clone();
    }
}

