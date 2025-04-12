/*
 * Decompiled with CFR 0.152.
 */
public final class FF2$d
extends Enum {
    private static final /* synthetic */ FF2$d[] $VALUES;
    public static final /* enum */ FF2$d Idle;
    public static final /* enum */ FF2$d Inactive;
    public static final /* enum */ FF2$d InactivePendingWork;
    public static final /* enum */ FF2$d PendingWork;
    public static final /* enum */ FF2$d ShutDown;
    public static final /* enum */ FF2$d ShuttingDown;

    private static final /* synthetic */ FF2$d[] $values() {
        FF2$d fF2$d = ShutDown;
        fF2$d = ShuttingDown;
        fF2$d = Inactive;
        fF2$d = InactivePendingWork;
        fF2$d = Idle;
        fF2$d = PendingWork;
        FF2$d[] fF2$dArray = new FF2$d[]{fF2$d, fF2$d, fF2$d, fF2$d, fF2$d, fF2$d};
        return fF2$dArray;
    }

    static {
        FF2$d fF2$d;
        ShutDown = fF2$d = new FF2$d("ShutDown", 0);
        ShuttingDown = fF2$d = new FF2$d("ShuttingDown", 1);
        Inactive = fF2$d = new FF2$d("Inactive", 2);
        InactivePendingWork = fF2$d = new FF2$d("InactivePendingWork", 3);
        Idle = fF2$d = new FF2$d("Idle", 4);
        PendingWork = fF2$d = new FF2$d("PendingWork", 5);
        $VALUES = FF2$d.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FF2$d() {
        void var2_-1;
        void var1_-1;
    }

    public static FF2$d valueOf(String string2) {
        return Enum.valueOf(FF2$d.class, string2);
    }

    public static FF2$d[] values() {
        return (FF2$d[])$VALUES.clone();
    }
}

