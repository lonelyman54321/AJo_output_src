/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.payment.view;

public final class PaymentActivity$c {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ir2_1 ir2_12;
        int n7 = ir2_1.values().length;
        int[] nArray = new int[n7];
        try {
            ir2_12 = ir2_1.NO_INTERNET_CONNECTION;
            n4 = ir2_12.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ir2_12 = ir2_1.NO_SERVER_CONNECTION;
            n4 = ir2_12.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            ir2_12 = ir2_1.API_TIME_OUT;
            n4 = ir2_12.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        $EnumSwitchMapping$0 = nArray;
    }
}

