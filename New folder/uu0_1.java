/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;

/*
 * Renamed from uU0
 */
public final class uu0_1
extends Enum
implements tu0_0 {
    private static final /* synthetic */ uu0_1[] $VALUES;
    public static final /* enum */ uu0_1 Active;
    public static final /* enum */ uu0_1 ActiveParent;
    public static final /* enum */ uu0_1 Captured;
    public static final /* enum */ uu0_1 Inactive;

    private static final /* synthetic */ uu0_1[] $values() {
        uu0_1 uu0_12 = Active;
        uu0_12 = ActiveParent;
        uu0_12 = Captured;
        uu0_12 = Inactive;
        uu0_1[] uu0_1Array = new uu0_1[]{uu0_12, uu0_12, uu0_12, uu0_12};
        return uu0_1Array;
    }

    static {
        uu0_1 uu0_12;
        Active = uu0_12 = new uu0_1("Active", 0);
        ActiveParent = uu0_12 = new uu0_1("ActiveParent", 1);
        Captured = uu0_12 = new uu0_1("Captured", 2);
        Inactive = uu0_12 = new uu0_1("Inactive", 3);
        $VALUES = uu0_1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private uu0_1() {
        void var2_-1;
        void var1_-1;
    }

    public static uu0_1 valueOf(String string2) {
        return Enum.valueOf(uu0_1.class, string2);
    }

    public static uu0_1[] values() {
        return (uu0_1[])$VALUES.clone();
    }

    public boolean getHasFocus() {
        int n3;
        Object object = uU0$a.$EnumSwitchMapping$0;
        int n4 = this.ordinal();
        int n7 = object[n4];
        if (n7 != (n4 = 1) && n7 != (n3 = 2) && n7 != (n3 = 3)) {
            n4 = 4;
            if (n7 == n4) {
                n4 = 0;
            } else {
                object = new NoWhenBranchMatchedException;
                object();
                throw object;
            }
        }
        return n4 != 0;
    }

    public boolean isCaptured() {
        Object object = uU0$a.$EnumSwitchMapping$0;
        int n3 = this.ordinal();
        int n4 = object[n3];
        if (n4 != (n3 = 1)) {
            n3 = 2;
            if (n4 != n3 && n4 != (n3 = 3) && n4 != (n3 = 4)) {
                object = new NoWhenBranchMatchedException;
                object();
                throw object;
            }
            n3 = 0;
        }
        return n3 != 0;
    }

    public boolean isFocused() {
        int n3;
        Object object = uU0$a.$EnumSwitchMapping$0;
        int n4 = this.ordinal();
        int n7 = object[n4];
        if (n7 != (n4 = 1) && n7 != (n3 = 2)) {
            n4 = 3;
            if (n7 != n4 && n7 != (n4 = 4)) {
                object = new NoWhenBranchMatchedException;
                object();
                throw object;
            }
            n4 = 0;
        }
        return n4 != 0;
    }
}

