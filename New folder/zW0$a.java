/*
 * Decompiled with CFR 0.152.
 */
public final class zW0$a
extends Enum {
    private static final /* synthetic */ zW0$a[] $VALUES;
    public static final /* enum */ zW0$a DETECT_FRAGMENT_REUSE;
    public static final /* enum */ zW0$a DETECT_FRAGMENT_TAG_USAGE;
    public static final /* enum */ zW0$a DETECT_RETAIN_INSTANCE_USAGE;
    public static final /* enum */ zW0$a DETECT_SET_USER_VISIBLE_HINT;
    public static final /* enum */ zW0$a DETECT_TARGET_FRAGMENT_USAGE;
    public static final /* enum */ zW0$a DETECT_WRONG_FRAGMENT_CONTAINER;
    public static final /* enum */ zW0$a DETECT_WRONG_NESTED_HIERARCHY;
    public static final /* enum */ zW0$a PENALTY_DEATH;
    public static final /* enum */ zW0$a PENALTY_LOG;

    private static final /* synthetic */ zW0$a[] $values() {
        zW0$a zW0$a = PENALTY_LOG;
        zW0$a = PENALTY_DEATH;
        zW0$a = DETECT_FRAGMENT_REUSE;
        zW0$a = DETECT_FRAGMENT_TAG_USAGE;
        zW0$a = DETECT_WRONG_NESTED_HIERARCHY;
        zW0$a = DETECT_RETAIN_INSTANCE_USAGE;
        zW0$a = DETECT_SET_USER_VISIBLE_HINT;
        zW0$a = DETECT_TARGET_FRAGMENT_USAGE;
        zW0$a = DETECT_WRONG_FRAGMENT_CONTAINER;
        zW0$a[] zW0$aArray = new zW0$a[]{zW0$a, zW0$a, zW0$a, zW0$a, zW0$a, zW0$a, zW0$a, zW0$a, zW0$a};
        return zW0$aArray;
    }

    static {
        zW0$a zW0$a;
        PENALTY_LOG = zW0$a = new zW0$a("PENALTY_LOG", 0);
        PENALTY_DEATH = zW0$a = new zW0$a("PENALTY_DEATH", 1);
        DETECT_FRAGMENT_REUSE = zW0$a = new zW0$a("DETECT_FRAGMENT_REUSE", 2);
        DETECT_FRAGMENT_TAG_USAGE = zW0$a = new zW0$a("DETECT_FRAGMENT_TAG_USAGE", 3);
        DETECT_WRONG_NESTED_HIERARCHY = zW0$a = new zW0$a("DETECT_WRONG_NESTED_HIERARCHY", 4);
        DETECT_RETAIN_INSTANCE_USAGE = zW0$a = new zW0$a("DETECT_RETAIN_INSTANCE_USAGE", 5);
        DETECT_SET_USER_VISIBLE_HINT = zW0$a = new zW0$a("DETECT_SET_USER_VISIBLE_HINT", 6);
        DETECT_TARGET_FRAGMENT_USAGE = zW0$a = new zW0$a("DETECT_TARGET_FRAGMENT_USAGE", 7);
        DETECT_WRONG_FRAGMENT_CONTAINER = zW0$a = new zW0$a("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        $VALUES = zW0$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zW0$a() {
        void var2_-1;
        void var1_-1;
    }

    public static zW0$a valueOf(String string2) {
        return Enum.valueOf(zW0$a.class, string2);
    }

    public static zW0$a[] values() {
        return (zW0$a[])$VALUES.clone();
    }
}

