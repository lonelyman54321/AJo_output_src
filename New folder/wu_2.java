/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Wu
 */
public final class wu_2
extends Enum {
    private static final /* synthetic */ wu_2[] $VALUES;
    public static final /* enum */ wu_2 BREATH;
    public static final /* enum */ wu_2 HEARTBEAT;
    public static final /* enum */ wu_2 NONE;
    public static final /* enum */ wu_2 ROTATE;
    public static final /* enum */ wu_2 SHAKE;

    private static final /* synthetic */ wu_2[] $values() {
        wu_2 wu_22 = NONE;
        wu_22 = HEARTBEAT;
        wu_22 = SHAKE;
        wu_22 = BREATH;
        wu_22 = ROTATE;
        wu_2[] wu_2Array = new wu_2[]{wu_22, wu_22, wu_22, wu_22, wu_22};
        return wu_2Array;
    }

    static {
        wu_2 wu_22;
        NONE = wu_22 = new wu_2("NONE", 0);
        HEARTBEAT = wu_22 = new wu_2("HEARTBEAT", 1);
        SHAKE = wu_22 = new wu_2("SHAKE", 2);
        BREATH = wu_22 = new wu_2("BREATH", 3);
        ROTATE = wu_22 = new wu_2("ROTATE", 4);
        $VALUES = wu_2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private wu_2() {
        void var2_-1;
        void var1_-1;
    }

    public static wu_2 valueOf(String string2) {
        return Enum.valueOf(wu_2.class, string2);
    }

    public static wu_2[] values() {
        return (wu_2[])$VALUES.clone();
    }
}

