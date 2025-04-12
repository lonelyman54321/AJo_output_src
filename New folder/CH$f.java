/*
 * Decompiled with CFR 0.152.
 */
public final class CH$f
extends Enum {
    private static final /* synthetic */ CH$f[] $VALUES;
    public static final /* enum */ CH$f all;
    public static final /* enum */ CH$f aural;
    public static final /* enum */ CH$f braille;
    public static final /* enum */ CH$f embossed;
    public static final /* enum */ CH$f handheld;
    public static final /* enum */ CH$f print;
    public static final /* enum */ CH$f projection;
    public static final /* enum */ CH$f screen;
    public static final /* enum */ CH$f speech;
    public static final /* enum */ CH$f tty;
    public static final /* enum */ CH$f tv;

    static {
        CH$f cH$f;
        CH$f cH$f2;
        CH$f cH$f3;
        CH$f cH$f4;
        CH$f cH$f5;
        CH$f cH$f6;
        CH$f cH$f7;
        CH$f cH$f8;
        CH$f cH$f9;
        CH$f cH$f10;
        CH$f cH$f11;
        all = cH$f11 = new CH$f("all", 0);
        int n3 = 1;
        aural = cH$f10 = new CH$f("aural", n3);
        int n4 = 2;
        braille = cH$f9 = new CH$f("braille", n4);
        embossed = cH$f8 = new CH$f("embossed", 3);
        handheld = cH$f7 = new CH$f("handheld", 4);
        print = cH$f6 = new CH$f("print", 5);
        projection = cH$f5 = new CH$f("projection", 6);
        screen = cH$f4 = new CH$f("screen", 7);
        speech = cH$f3 = new CH$f("speech", 8);
        tty = cH$f2 = new CH$f("tty", 9);
        int n7 = 10;
        tv = cH$f = new CH$f("tv", n7);
        CH$f[] cH$fArray = new CH$f[11];
        cH$fArray[0] = cH$f11;
        cH$fArray[n3] = cH$f10;
        cH$fArray[n4] = cH$f9;
        cH$fArray[3] = cH$f8;
        cH$fArray[4] = cH$f7;
        cH$fArray[5] = cH$f6;
        cH$fArray[6] = cH$f5;
        cH$fArray[7] = cH$f4;
        cH$fArray[8] = cH$f3;
        cH$fArray[9] = cH$f2;
        cH$fArray[n7] = cH$f;
        $VALUES = cH$fArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CH$f() {
        void var2_-1;
        void var1_-1;
    }

    public static CH$f valueOf(String string2) {
        return Enum.valueOf(CH$f.class, string2);
    }

    public static CH$f[] values() {
        return (CH$f[])$VALUES.clone();
    }
}

