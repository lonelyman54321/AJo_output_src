/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Dx1
 */
public final class dx1_1
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ dx1_1[] $VALUES;
    public static final /* enum */ dx1_1 Default;
    public static final /* enum */ dx1_1 OkHttp;

    private static final /* synthetic */ dx1_1[] $values() {
        dx1_1 dx1_12 = Default;
        dx1_12 = OkHttp;
        dx1_1[] dx1_1Array = new dx1_1[]{dx1_12, dx1_12};
        return dx1_1Array;
    }

    static {
        Enum[] enumArray = new dx1_1("Default", 0);
        Default = enumArray;
        enumArray = new dx1_1("OkHttp", 1);
        OkHttp = enumArray;
        enumArray = dx1_1.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dx1_1() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static dx1_1 valueOf(String string2) {
        return Enum.valueOf(dx1_1.class, string2);
    }

    public static dx1_1[] values() {
        return (dx1_1[])$VALUES.clone();
    }
}

