/*
 * Decompiled with CFR 0.152.
 */
package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

public final class i$b
extends Enum {
    private static final /* synthetic */ i$b[] $VALUES;
    public static final /* enum */ i$b CREATED;
    public static final /* enum */ i$b DESTROYED;
    public static final /* enum */ i$b INITIALIZED;
    public static final /* enum */ i$b RESUMED;
    public static final /* enum */ i$b STARTED;

    private static final /* synthetic */ i$b[] $values() {
        i$b i$b = DESTROYED;
        i$b = INITIALIZED;
        i$b = CREATED;
        i$b = STARTED;
        i$b = RESUMED;
        i$b[] i$bArray = new i$b[]{i$b, i$b, i$b, i$b, i$b};
        return i$bArray;
    }

    static {
        i$b i$b;
        DESTROYED = i$b = new i$b("DESTROYED", 0);
        INITIALIZED = i$b = new i$b("INITIALIZED", 1);
        CREATED = i$b = new i$b("CREATED", 2);
        STARTED = i$b = new i$b("STARTED", 3);
        RESUMED = i$b = new i$b("RESUMED", 4);
        $VALUES = i$b.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private i$b() {
        void var2_-1;
        void var1_-1;
    }

    public static i$b valueOf(String string2) {
        return Enum.valueOf(i$b.class, string2);
    }

    public static i$b[] values() {
        return (i$b[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     */
    public final boolean isAtLeast(i$b i$b) {
        void var3_6;
        String string2 = "state";
        Intrinsics.checkNotNullParameter((Object)i$b, string2);
        int bl2 = this.compareTo(i$b);
        if (bl2 >= 0) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            i$b = null;
        }
        return (boolean)var3_6;
    }
}

