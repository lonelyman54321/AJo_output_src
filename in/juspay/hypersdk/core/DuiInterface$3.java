/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersmshandler.SmsEventInterface$RetrieverEvents;

class DuiInterface$3 {
    static final /* synthetic */ int[] $SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        SmsEventInterface$RetrieverEvents smsEventInterface$RetrieverEvents;
        int n7 = SmsEventInterface$RetrieverEvents.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents = nArray;
        try {
            smsEventInterface$RetrieverEvents = SmsEventInterface$RetrieverEvents.ON_ATTACH;
            n4 = smsEventInterface$RetrieverEvents.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents;
            smsEventInterface$RetrieverEvents = SmsEventInterface$RetrieverEvents.ON_EXECUTE;
            n4 = smsEventInterface$RetrieverEvents.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$in$juspay$hypersmshandler$SmsEventInterface$RetrieverEvents;
            smsEventInterface$RetrieverEvents = SmsEventInterface$RetrieverEvents.ON_RECEIVE;
            n4 = smsEventInterface$RetrieverEvents.ordinal();
            nArray[n4] = n3 = 3;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

