/*
 * Decompiled with CFR 0.152.
 */
public final class XP2$a
extends Enum {
    private static final /* synthetic */ XP2$a[] $VALUES;
    public static final /* enum */ XP2$a PATH;
    public static final /* enum */ XP2$a QUERY;

    private static final /* synthetic */ XP2$a[] $values() {
        XP2$a xP2$a = PATH;
        xP2$a = QUERY;
        XP2$a[] xP2$aArray = new XP2$a[]{xP2$a, xP2$a};
        return xP2$aArray;
    }

    static {
        XP2$a xP2$a;
        PATH = xP2$a = new XP2$a("PATH", 0);
        QUERY = xP2$a = new XP2$a("QUERY", 1);
        $VALUES = XP2$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private XP2$a() {
        void var2_-1;
        void var1_-1;
    }

    public static XP2$a valueOf(String string2) {
        return Enum.valueOf(XP2$a.class, string2);
    }

    public static XP2$a[] values() {
        return (XP2$a[])$VALUES.clone();
    }
}

