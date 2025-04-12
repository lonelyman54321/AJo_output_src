/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.ReturnRefundLinksEnum;

public final class yN2$b {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ReturnRefundLinksEnum returnRefundLinksEnum;
        int n7 = ReturnRefundLinksEnum.values().length;
        int[] nArray = new int[n7];
        try {
            returnRefundLinksEnum = ReturnRefundLinksEnum.RAISE_A_CONCERN;
            n4 = returnRefundLinksEnum.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            returnRefundLinksEnum = ReturnRefundLinksEnum.VIEW_ORDER;
            n4 = returnRefundLinksEnum.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            returnRefundLinksEnum = ReturnRefundLinksEnum.VIEW_REFUND_DETAILS;
            n4 = returnRefundLinksEnum.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            returnRefundLinksEnum = ReturnRefundLinksEnum.REFUND_POLICY;
            n4 = returnRefundLinksEnum.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            returnRefundLinksEnum = ReturnRefundLinksEnum.REFUND_BREAKUP;
            n4 = returnRefundLinksEnum.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

