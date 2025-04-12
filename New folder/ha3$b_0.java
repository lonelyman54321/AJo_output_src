/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from hA3$b
 */
public final class ha3$b_0
extends Enum {
    private static final /* synthetic */ ha3$b_0[] $VALUES;
    public static final /* enum */ ha3$b_0 Event;
    public static final /* enum */ ha3$b_0 Profile;

    private static /* synthetic */ ha3$b_0[] $values() {
        ha3$b_0 ha3$b_0 = Profile;
        ha3$b_0 = Event;
        ha3$b_0[] ha3$b_0Array = new ha3$b_0[]{ha3$b_0, ha3$b_0};
        return ha3$b_0Array;
    }

    static {
        ha3$b_0 ha3$b_0;
        Profile = ha3$b_0 = new ha3$b_0("Profile", 0);
        Event = ha3$b_0 = new ha3$b_0("Event", 1);
        $VALUES = ha3$b_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ha3$b_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ha3$b_0 valueOf(String string2) {
        return Enum.valueOf(ha3$b_0.class, string2);
    }

    public static ha3$b_0[] values() {
        return (ha3$b_0[])$VALUES.clone();
    }
}

