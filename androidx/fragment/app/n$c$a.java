/*
 * Decompiled with CFR 0.152.
 */
package androidx.fragment.app;

public final class n$c$a
extends Enum {
    private static final /* synthetic */ n$c$a[] $VALUES;
    public static final /* enum */ n$c$a ADDING;
    public static final /* enum */ n$c$a NONE;
    public static final /* enum */ n$c$a REMOVING;

    private static final /* synthetic */ n$c$a[] $values() {
        n$c$a n$c$a = NONE;
        n$c$a = ADDING;
        n$c$a = REMOVING;
        n$c$a[] n$c$aArray = new n$c$a[]{n$c$a, n$c$a, n$c$a};
        return n$c$aArray;
    }

    static {
        n$c$a n$c$a;
        NONE = n$c$a = new n$c$a("NONE", 0);
        ADDING = n$c$a = new n$c$a("ADDING", 1);
        REMOVING = n$c$a = new n$c$a("REMOVING", 2);
        $VALUES = n$c$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private n$c$a() {
        void var2_-1;
        void var1_-1;
    }

    public static n$c$a valueOf(String string2) {
        return Enum.valueOf(n$c$a.class, string2);
    }

    public static n$c$a[] values() {
        return (n$c$a[])$VALUES.clone();
    }
}

