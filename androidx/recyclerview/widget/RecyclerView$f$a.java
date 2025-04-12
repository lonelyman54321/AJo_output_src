/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

public final class RecyclerView$f$a
extends Enum {
    private static final /* synthetic */ RecyclerView$f$a[] $VALUES;
    public static final /* enum */ RecyclerView$f$a ALLOW;
    public static final /* enum */ RecyclerView$f$a PREVENT;
    public static final /* enum */ RecyclerView$f$a PREVENT_WHEN_EMPTY;

    private static /* synthetic */ RecyclerView$f$a[] $values() {
        RecyclerView$f$a recyclerView$f$a = ALLOW;
        recyclerView$f$a = PREVENT_WHEN_EMPTY;
        recyclerView$f$a = PREVENT;
        RecyclerView$f$a[] recyclerView$f$aArray = new RecyclerView$f$a[]{recyclerView$f$a, recyclerView$f$a, recyclerView$f$a};
        return recyclerView$f$aArray;
    }

    static {
        RecyclerView$f$a recyclerView$f$a;
        ALLOW = recyclerView$f$a = new RecyclerView$f$a("ALLOW", 0);
        PREVENT_WHEN_EMPTY = recyclerView$f$a = new RecyclerView$f$a("PREVENT_WHEN_EMPTY", 1);
        PREVENT = recyclerView$f$a = new RecyclerView$f$a("PREVENT", 2);
        $VALUES = RecyclerView$f$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private RecyclerView$f$a() {
        void var2_-1;
        void var1_-1;
    }

    public static RecyclerView$f$a valueOf(String string2) {
        return Enum.valueOf(RecyclerView$f$a.class, string2);
    }

    public static RecyclerView$f$a[] values() {
        return (RecyclerView$f$a[])$VALUES.clone();
    }
}

