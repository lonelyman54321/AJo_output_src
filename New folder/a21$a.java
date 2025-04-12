/*
 * Decompiled with CFR 0.152.
 */
public final class a21$a
extends Enum {
    private static final /* synthetic */ ga0_2 $ENTRIES;
    private static final /* synthetic */ a21$a[] $VALUES;
    public static final /* enum */ a21$a CANCELLATION_DETAIL;
    public static final /* enum */ a21$a CANCEL_INIT;
    public static final /* enum */ a21$a MSG_QUANTITY_CHANGE;
    public static final /* enum */ a21$a ORDER_DETAIL;
    public static final /* enum */ a21$a RETURN_CREATED;
    public static final /* enum */ a21$a RETURN_INIT;
    public static final /* enum */ a21$a RETURN_REFUND;
    public static final /* enum */ a21$a RETURN_REQUESTED;

    private static final /* synthetic */ a21$a[] $values() {
        a21$a a21$a = CANCEL_INIT;
        a21$a = CANCELLATION_DETAIL;
        a21$a = RETURN_REFUND;
        a21$a = ORDER_DETAIL;
        a21$a = RETURN_INIT;
        a21$a = MSG_QUANTITY_CHANGE;
        a21$a = RETURN_CREATED;
        a21$a = RETURN_REQUESTED;
        a21$a[] a21$aArray = new a21$a[]{a21$a, a21$a, a21$a, a21$a, a21$a, a21$a, a21$a, a21$a};
        return a21$aArray;
    }

    static {
        Enum[] enumArray = new a21$a("CANCEL_INIT", 0);
        CANCEL_INIT = enumArray;
        enumArray = new a21$a("CANCELLATION_DETAIL", 1);
        CANCELLATION_DETAIL = enumArray;
        enumArray = new a21$a("RETURN_REFUND", 2);
        RETURN_REFUND = enumArray;
        enumArray = new a21$a("ORDER_DETAIL", 3);
        ORDER_DETAIL = enumArray;
        enumArray = new a21$a("RETURN_INIT", 4);
        RETURN_INIT = enumArray;
        enumArray = new a21$a("MSG_QUANTITY_CHANGE", 5);
        MSG_QUANTITY_CHANGE = enumArray;
        enumArray = new a21$a("RETURN_CREATED", 6);
        RETURN_CREATED = enumArray;
        enumArray = new a21$a("RETURN_REQUESTED", 7);
        RETURN_REQUESTED = enumArray;
        enumArray = a21$a.$values();
        $VALUES = enumArray;
        $ENTRIES = ha0_2.a(enumArray);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private a21$a() {
        void var2_-1;
        void var1_-1;
    }

    public static ga0_2 getEntries() {
        return $ENTRIES;
    }

    public static a21$a valueOf(String string2) {
        return Enum.valueOf(a21$a.class, string2);
    }

    public static a21$a[] values() {
        return (a21$a[])$VALUES.clone();
    }
}

