/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from pJ3
 */
public final class pj3_2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ pj3_2[] $VALUES;
    public static final /* enum */ pj3_2 LIST;
    public static final /* enum */ pj3_2 MAP;
    public static final /* enum */ pj3_2 OBJ;
    public static final /* enum */ pj3_2 POLY_OBJ;
    public final char begin;
    public final char end;

    private static final /* synthetic */ pj3_2[] $values() {
        pj3_2 pj3_22 = OBJ;
        pj3_22 = LIST;
        pj3_22 = MAP;
        pj3_22 = POLY_OBJ;
        pj3_2[] pj3_2Array = new pj3_2[]{pj3_22, pj3_22, pj3_22, pj3_22};
        return pj3_2Array;
    }

    static {
        char c2 = '{';
        char c3 = '}';
        Enum[] enumArray = new pj3_2("OBJ", 0, c2, c3);
        OBJ = enumArray;
        char c5 = '[';
        char c6 = ']';
        enumArray = new pj3_2("LIST", 1, c5, c6);
        LIST = enumArray;
        enumArray = new pj3_2("MAP", 2, c2, c3);
        MAP = enumArray;
        enumArray = new pj3_2("POLY_OBJ", 3, c5, c6);
        POLY_OBJ = enumArray;
        enumArray = pj3_2.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - void declaration
     */
    private pj3_2() {
        void var4_1;
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.begin = var3_2;
        this.end = var4_1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static pj3_2 valueOf(String string2) {
        return Enum.valueOf(pj3_2.class, string2);
    }

    public static pj3_2[] values() {
        return (pj3_2[])$VALUES.clone();
    }
}

