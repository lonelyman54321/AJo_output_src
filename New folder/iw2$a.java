/*
 * Decompiled with CFR 0.152.
 */
public final class iw2$a
extends Enum {
    private static final /* synthetic */ iw2$a[] $VALUES;
    public static final /* enum */ iw2$a Dispatching;
    public static final /* enum */ iw2$a NotDispatching;
    public static final /* enum */ iw2$a Unknown;

    private static final /* synthetic */ iw2$a[] $values() {
        iw2$a iw2$a = Unknown;
        iw2$a = Dispatching;
        iw2$a = NotDispatching;
        iw2$a[] iw2$aArray = new iw2$a[]{iw2$a, iw2$a, iw2$a};
        return iw2$aArray;
    }

    static {
        iw2$a iw2$a;
        Unknown = iw2$a = new iw2$a("Unknown", 0);
        Dispatching = iw2$a = new iw2$a("Dispatching", 1);
        NotDispatching = iw2$a = new iw2$a("NotDispatching", 2);
        $VALUES = iw2$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private iw2$a() {
        void var2_-1;
        void var1_-1;
    }

    public static iw2$a valueOf(String string2) {
        return Enum.valueOf(iw2$a.class, string2);
    }

    public static iw2$a[] values() {
        return (iw2$a[])$VALUES.clone();
    }
}

