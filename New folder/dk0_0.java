/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Dk0
 */
public final class dk0_0
extends Enum {
    private static final /* synthetic */ dk0_0[] $VALUES;
    public static final /* enum */ dk0_0 EVERYONE;
    public static final /* enum */ dk0_0 FRIENDS;
    public static final /* enum */ dk0_0 NONE;
    public static final /* enum */ dk0_0 ONLY_ME;
    private final String nativeProtocolAudience;

    private static final /* synthetic */ dk0_0[] $values() {
        dk0_0 dk0_02 = NONE;
        dk0_02 = ONLY_ME;
        dk0_02 = FRIENDS;
        dk0_02 = EVERYONE;
        dk0_0[] dk0_0Array = new dk0_0[]{dk0_02, dk0_02, dk0_02, dk0_02};
        return dk0_0Array;
    }

    static {
        dk0_0 dk0_02;
        NONE = dk0_02 = new dk0_0("NONE", 0, null);
        ONLY_ME = dk0_02 = new dk0_0("ONLY_ME", 1, "only_me");
        FRIENDS = dk0_02 = new dk0_0("FRIENDS", 2, "friends");
        EVERYONE = dk0_02 = new dk0_0("EVERYONE", 3, "everyone");
        $VALUES = dk0_0.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dk0_0() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.nativeProtocolAudience = var3_2;
    }

    public static dk0_0 valueOf(String string2) {
        return Enum.valueOf(dk0_0.class, string2);
    }

    public static dk0_0[] values() {
        return (dk0_0[])$VALUES.clone();
    }

    public final String getNativeProtocolAudience() {
        return this.nativeProtocolAudience;
    }
}

