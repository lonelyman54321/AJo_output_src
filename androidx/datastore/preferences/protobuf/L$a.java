/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

public final class L$a
extends Enum {
    private static final /* synthetic */ L$a[] $VALUES;
    public static final /* enum */ L$a ASCENDING;
    public static final /* enum */ L$a DESCENDING;

    static {
        L$a l$a;
        L$a l$a2;
        ASCENDING = l$a2 = new L$a("ASCENDING", 0);
        int n3 = 1;
        DESCENDING = l$a = new L$a("DESCENDING", n3);
        L$a[] l$aArray = new L$a[2];
        l$aArray[0] = l$a2;
        l$aArray[n3] = l$a;
        $VALUES = l$aArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private L$a() {
        void var2_-1;
        void var1_-1;
    }

    public static L$a valueOf(String string2) {
        return Enum.valueOf(L$a.class, string2);
    }

    public static L$a[] values() {
        return (L$a[])$VALUES.clone();
    }
}

