/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Zu0
 */
public final class zu0_0
extends Enum {
    private static final /* synthetic */ zu0_0[] $VALUES;
    public static final /* enum */ zu0_0 Closed;
    public static final /* enum */ zu0_0 Open;

    private static final /* synthetic */ zu0_0[] $values() {
        zu0_0 zu0_02 = Closed;
        zu0_02 = Open;
        zu0_0[] zu0_0Array = new zu0_0[]{zu0_02, zu0_02};
        return zu0_0Array;
    }

    static {
        zu0_0 zu0_02;
        Closed = zu0_02 = new zu0_0("Closed", 0);
        Open = zu0_02 = new zu0_0("Open", 1);
        $VALUES = zu0_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zu0_0() {
        void var2_-1;
        void var1_-1;
    }

    public static zu0_0 valueOf(String string2) {
        return Enum.valueOf(zu0_0.class, string2);
    }

    public static zu0_0[] values() {
        return (zu0_0[])$VALUES.clone();
    }
}

