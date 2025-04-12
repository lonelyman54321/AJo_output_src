/*
 * Decompiled with CFR 0.152.
 */
public final class CB0$a
extends Enum {
    private static final /* synthetic */ CB0$a[] $VALUES;
    public static final /* enum */ CB0$a CLICK;
    public static final /* enum */ CB0$a SELECTED;
    public static final /* enum */ CB0$a TEXT_CHANGED;

    private static final /* synthetic */ CB0$a[] $values() {
        CB0$a cB0$a = CLICK;
        cB0$a = SELECTED;
        cB0$a = TEXT_CHANGED;
        CB0$a[] cB0$aArray = new CB0$a[]{cB0$a, cB0$a, cB0$a};
        return cB0$aArray;
    }

    static {
        CB0$a cB0$a;
        CLICK = cB0$a = new CB0$a("CLICK", 0);
        SELECTED = cB0$a = new CB0$a("SELECTED", 1);
        TEXT_CHANGED = cB0$a = new CB0$a("TEXT_CHANGED", 2);
        $VALUES = CB0$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private CB0$a() {
        void var2_-1;
        void var1_-1;
    }

    public static CB0$a valueOf(String string2) {
        return Enum.valueOf(CB0$a.class, string2);
    }

    public static CB0$a[] values() {
        return (CB0$a[])$VALUES.clone();
    }
}

