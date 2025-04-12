/*
 * Decompiled with CFR 0.152.
 */
public final class mG2
extends Enum {
    private static final /* synthetic */ mG2[] $VALUES;
    public static final /* enum */ mG2 REDUCED_MOTION;
    public static final /* enum */ mG2 STANDARD_MOTION;

    private static /* synthetic */ mG2[] $values() {
        mG2 mG22 = STANDARD_MOTION;
        mG22 = REDUCED_MOTION;
        mG2[] mG2Array = new mG2[]{mG22, mG22};
        return mG2Array;
    }

    static {
        mG2 mG22;
        STANDARD_MOTION = mG22 = new mG2("STANDARD_MOTION", 0);
        REDUCED_MOTION = mG22 = new mG2("REDUCED_MOTION", 1);
        $VALUES = mG2.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private mG2() {
        void var2_-1;
        void var1_-1;
    }

    public static mG2 valueOf(String string2) {
        return Enum.valueOf(mG2.class, string2);
    }

    public static mG2[] values() {
        return (mG2[])$VALUES.clone();
    }
}

