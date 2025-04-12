/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from AC3
 */
public final class ac3_2
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ ac3_2[] $VALUES;
    public static final /* enum */ ac3_2 FULL_VIDEO;
    public static final /* enum */ ac3_2 HLIST_IMAGE;
    public static final /* enum */ ac3_2 HLIST_VIDEO;
    public static final /* enum */ ac3_2 VIDEO_CAROUSE;
    private final int type;

    private static final /* synthetic */ ac3_2[] $values() {
        ac3_2 ac3_22 = FULL_VIDEO;
        ac3_22 = VIDEO_CAROUSE;
        ac3_22 = HLIST_VIDEO;
        ac3_22 = HLIST_IMAGE;
        ac3_2[] ac3_2Array = new ac3_2[]{ac3_22, ac3_22, ac3_22, ac3_22};
        return ac3_2Array;
    }

    static {
        Enum[] enumArray = new ac3_2("FULL_VIDEO", 0, 111);
        FULL_VIDEO = enumArray;
        enumArray = new ac3_2("VIDEO_CAROUSE", 1, 112);
        VIDEO_CAROUSE = enumArray;
        enumArray = new ac3_2("HLIST_VIDEO", 2, 113);
        HLIST_VIDEO = enumArray;
        enumArray = new ac3_2("HLIST_IMAGE", 3, 114);
        HLIST_IMAGE = enumArray;
        enumArray = ac3_2.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ac3_2() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.type = var3_2;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static ac3_2 valueOf(String string2) {
        return Enum.valueOf(ac3_2.class, string2);
    }

    public static ac3_2[] values() {
        return (ac3_2[])$VALUES.clone();
    }

    public final int getType() {
        return this.type;
    }
}

