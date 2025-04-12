/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;

public final class HP1$a
extends Enum {
    private static final /* synthetic */ HP1$a[] $VALUES;
    public static final /* enum */ HP1$a MTML_APP_EVENT_PREDICTION;
    public static final /* enum */ HP1$a MTML_INTEGRITY_DETECT;

    private static final /* synthetic */ HP1$a[] $values() {
        HP1$a hP1$a = MTML_INTEGRITY_DETECT;
        hP1$a = MTML_APP_EVENT_PREDICTION;
        HP1$a[] hP1$aArray = new HP1$a[]{hP1$a, hP1$a};
        return hP1$aArray;
    }

    static {
        HP1$a hP1$a;
        MTML_INTEGRITY_DETECT = hP1$a = new HP1$a("MTML_INTEGRITY_DETECT", 0);
        MTML_APP_EVENT_PREDICTION = hP1$a = new HP1$a("MTML_APP_EVENT_PREDICTION", 1);
        $VALUES = HP1$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HP1$a() {
        void var2_-1;
        void var1_-1;
    }

    public static HP1$a valueOf(String string2) {
        return Enum.valueOf(HP1$a.class, string2);
    }

    public static HP1$a[] values() {
        return (HP1$a[])$VALUES.clone();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String toKey() {
        void var1_5;
        int[] nArray = HP1$a$a.$EnumSwitchMapping$0;
        int n3 = this.ordinal();
        int n4 = nArray[n3];
        if (n4 == (n3 = 1)) return var1_5;
        n3 = 2;
        if (n4 == n3) {
            return var1_5;
        }
        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
        throw noWhenBranchMatchedException;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String toUseCase() {
        void var1_5;
        int[] nArray = HP1$a$a.$EnumSwitchMapping$0;
        int n3 = this.ordinal();
        int n4 = nArray[n3];
        if (n4 == (n3 = 1)) return var1_5;
        n3 = 2;
        if (n4 == n3) {
            return var1_5;
        }
        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
        throw noWhenBranchMatchedException;
    }
}

