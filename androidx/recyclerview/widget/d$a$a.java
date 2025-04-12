/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

public final class d$a$a
extends Enum {
    private static final /* synthetic */ d$a$a[] $VALUES;
    public static final /* enum */ d$a$a ISOLATED_STABLE_IDS;
    public static final /* enum */ d$a$a NO_STABLE_IDS;
    public static final /* enum */ d$a$a SHARED_STABLE_IDS;

    private static /* synthetic */ d$a$a[] $values() {
        d$a$a d$a$a = NO_STABLE_IDS;
        d$a$a = ISOLATED_STABLE_IDS;
        d$a$a = SHARED_STABLE_IDS;
        d$a$a[] d$a$aArray = new d$a$a[]{d$a$a, d$a$a, d$a$a};
        return d$a$aArray;
    }

    static {
        d$a$a d$a$a;
        NO_STABLE_IDS = d$a$a = new d$a$a("NO_STABLE_IDS", 0);
        ISOLATED_STABLE_IDS = d$a$a = new d$a$a("ISOLATED_STABLE_IDS", 1);
        SHARED_STABLE_IDS = d$a$a = new d$a$a("SHARED_STABLE_IDS", 2);
        $VALUES = d$a$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d$a$a() {
        void var2_-1;
        void var1_-1;
    }

    public static d$a$a valueOf(String string2) {
        return Enum.valueOf(d$a$a.class, string2);
    }

    public static d$a$a[] values() {
        return (d$a$a[])$VALUES.clone();
    }
}

