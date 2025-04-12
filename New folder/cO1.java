/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;

public final class cO1
extends Enum {
    private static final /* synthetic */ cO1[] $VALUES;
    public static final /* enum */ cO1 Copy;
    public static final /* enum */ cO1 Cut;
    public static final /* enum */ cO1 Paste;
    public static final /* enum */ cO1 SelectAll;
    private final int id;
    private final int order;

    private static final /* synthetic */ cO1[] $values() {
        cO1 cO12 = Copy;
        cO12 = Paste;
        cO12 = Cut;
        cO12 = SelectAll;
        cO1[] cO1Array = new cO1[]{cO12, cO12, cO12, cO12};
        return cO1Array;
    }

    static {
        cO1 cO12;
        Copy = cO12 = new cO1("Copy", 0, 0);
        int n3 = 1;
        Paste = cO12 = new cO1("Paste", n3, n3);
        n3 = 2;
        Cut = cO12 = new cO1("Cut", n3, n3);
        n3 = 3;
        SelectAll = cO12 = new cO1("SelectAll", n3, n3);
        $VALUES = cO1.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cO1() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.id = var3_2;
        this.order = var3_2;
    }

    public static cO1 valueOf(String string2) {
        return Enum.valueOf(cO1.class, string2);
    }

    public static cO1[] values() {
        return (cO1[])$VALUES.clone();
    }

    public final int getId() {
        return this.id;
    }

    public final int getOrder() {
        return this.order;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int getTitleResource() {
        int[] nArray = cO1$a.$EnumSwitchMapping$0;
        int n3 = this.ordinal();
        int n4 = nArray[n3];
        if (n4 == (n3 = 1)) return 0x1040001;
        n3 = 2;
        if (n4 == n3) return 17039371;
        n3 = 3;
        if (n4 == n3) return 17039363;
        n3 = 4;
        if (n4 == n3) {
            return 17039373;
        }
        NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
        throw noWhenBranchMatchedException;
    }
}

