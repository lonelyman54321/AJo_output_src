/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fA3
 */
public final class fa3_2
extends Enum {
    private static final /* synthetic */ fa3_2[] $VALUES;
    public static final /* enum */ fa3_2 ALL;
    public static final /* enum */ fa3_2 NONE;
    public static final /* enum */ fa3_2 ONFOCUSGAINED_CLEARVALIDATION;
    public static final /* enum */ fa3_2 ONFOCUSLOST_DOVALIDATE;
    public static final /* enum */ fa3_2 ONTEXTWATCH;
    public static final /* enum */ fa3_2 REGEX;

    private static /* synthetic */ fa3_2[] $values() {
        fa3_2 fa3_22 = ONTEXTWATCH;
        fa3_22 = ONFOCUSGAINED_CLEARVALIDATION;
        fa3_22 = ONFOCUSLOST_DOVALIDATE;
        fa3_22 = NONE;
        fa3_22 = REGEX;
        fa3_22 = ALL;
        fa3_2[] fa3_2Array = new fa3_2[]{fa3_22, fa3_22, fa3_22, fa3_22, fa3_22, fa3_22};
        return fa3_2Array;
    }

    static {
        fa3_2 fa3_22;
        ONTEXTWATCH = fa3_22 = new fa3_2("ONTEXTWATCH", 0);
        ONFOCUSGAINED_CLEARVALIDATION = fa3_22 = new fa3_2("ONFOCUSGAINED_CLEARVALIDATION", 1);
        ONFOCUSLOST_DOVALIDATE = fa3_22 = new fa3_2("ONFOCUSLOST_DOVALIDATE", 2);
        NONE = fa3_22 = new fa3_2("NONE", 3);
        REGEX = fa3_22 = new fa3_2("REGEX", 4);
        ALL = fa3_22 = new fa3_2("ALL", 5);
        $VALUES = fa3_2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fa3_2() {
        void var2_-1;
        void var1_-1;
    }

    public static fa3_2 valueOf(String string2) {
        return Enum.valueOf(fa3_2.class, string2);
    }

    public static fa3_2[] values() {
        return (fa3_2[])$VALUES.clone();
    }
}

