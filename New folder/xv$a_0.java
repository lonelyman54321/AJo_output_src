/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from xv$a
 */
public final class xv$a_0
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ xv$a_0[] $VALUES;
    public static final /* enum */ xv$a_0 Cart;
    public static final /* enum */ xv$a_0 MyAccount;
    public static final /* enum */ xv$a_0 OrderList;
    public static final /* enum */ xv$a_0 PDP;
    public static final /* enum */ xv$a_0 ThankYou;

    private static final /* synthetic */ xv$a_0[] $values() {
        xv$a_0 xv$a_0 = PDP;
        xv$a_0 = Cart;
        xv$a_0 = OrderList;
        xv$a_0 = ThankYou;
        xv$a_0 = MyAccount;
        xv$a_0[] xv$a_0Array = new xv$a_0[]{xv$a_0, xv$a_0, xv$a_0, xv$a_0, xv$a_0};
        return xv$a_0Array;
    }

    static {
        Enum[] enumArray = new xv$a_0("PDP", 0);
        PDP = enumArray;
        enumArray = new xv$a_0("Cart", 1);
        Cart = enumArray;
        enumArray = new xv$a_0("OrderList", 2);
        OrderList = enumArray;
        enumArray = new xv$a_0("ThankYou", 3);
        ThankYou = enumArray;
        enumArray = new xv$a_0("MyAccount", 4);
        MyAccount = enumArray;
        enumArray = xv$a_0.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private xv$a_0() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static xv$a_0 valueOf(String string2) {
        return Enum.valueOf(xv$a_0.class, string2);
    }

    public static xv$a_0[] values() {
        return (xv$a_0[])$VALUES.clone();
    }
}

