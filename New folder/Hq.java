/*
 * Decompiled with CFR 0.152.
 */
public final class Hq
extends Enum {
    private static final /* synthetic */ Hq[] $VALUES;
    public static final /* enum */ Hq AUTOMATIC;
    public static final /* enum */ Hq DISABLED;
    public static final /* enum */ Hq ENABLED;

    private static /* synthetic */ Hq[] $values() {
        Hq hq = AUTOMATIC;
        hq = ENABLED;
        hq = DISABLED;
        Hq[] hqArray = new Hq[]{hq, hq, hq};
        return hqArray;
    }

    static {
        Hq hq;
        AUTOMATIC = hq = new Hq("AUTOMATIC", 0);
        ENABLED = hq = new Hq("ENABLED", 1);
        DISABLED = hq = new Hq("DISABLED", 2);
        $VALUES = Hq.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Hq() {
        void var2_-1;
        void var1_-1;
    }

    public static Hq valueOf(String string2) {
        return Enum.valueOf(Hq.class, string2);
    }

    public static Hq[] values() {
        return (Hq[])$VALUES.clone();
    }
}

