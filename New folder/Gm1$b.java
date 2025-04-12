/*
 * Decompiled with CFR 0.152.
 */
public final class Gm1$b
extends Enum {
    private static final /* synthetic */ Gm1$b[] $VALUES;
    public static final /* enum */ Gm1$b BEGIN_ARRAY;
    public static final /* enum */ Gm1$b BEGIN_OBJECT;
    public static final /* enum */ Gm1$b BOOLEAN;
    public static final /* enum */ Gm1$b END_ARRAY;
    public static final /* enum */ Gm1$b END_DOCUMENT;
    public static final /* enum */ Gm1$b END_OBJECT;
    public static final /* enum */ Gm1$b NAME;
    public static final /* enum */ Gm1$b NULL;
    public static final /* enum */ Gm1$b NUMBER;
    public static final /* enum */ Gm1$b STRING;

    private static /* synthetic */ Gm1$b[] $values() {
        Gm1$b gm1$b = BEGIN_ARRAY;
        gm1$b = END_ARRAY;
        gm1$b = BEGIN_OBJECT;
        gm1$b = END_OBJECT;
        gm1$b = NAME;
        gm1$b = STRING;
        gm1$b = NUMBER;
        gm1$b = BOOLEAN;
        gm1$b = NULL;
        gm1$b = END_DOCUMENT;
        Gm1$b[] gm1$bArray = new Gm1$b[]{gm1$b, gm1$b, gm1$b, gm1$b, gm1$b, gm1$b, gm1$b, gm1$b, gm1$b, gm1$b};
        return gm1$bArray;
    }

    static {
        Gm1$b gm1$b;
        BEGIN_ARRAY = gm1$b = new Gm1$b("BEGIN_ARRAY", 0);
        END_ARRAY = gm1$b = new Gm1$b("END_ARRAY", 1);
        BEGIN_OBJECT = gm1$b = new Gm1$b("BEGIN_OBJECT", 2);
        END_OBJECT = gm1$b = new Gm1$b("END_OBJECT", 3);
        NAME = gm1$b = new Gm1$b("NAME", 4);
        STRING = gm1$b = new Gm1$b("STRING", 5);
        NUMBER = gm1$b = new Gm1$b("NUMBER", 6);
        BOOLEAN = gm1$b = new Gm1$b("BOOLEAN", 7);
        NULL = gm1$b = new Gm1$b("NULL", 8);
        END_DOCUMENT = gm1$b = new Gm1$b("END_DOCUMENT", 9);
        $VALUES = Gm1$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Gm1$b() {
        void var2_-1;
        void var1_-1;
    }

    public static Gm1$b valueOf(String string2) {
        return Enum.valueOf(Gm1$b.class, string2);
    }

    public static Gm1$b[] values() {
        return (Gm1$b[])$VALUES.clone();
    }
}

