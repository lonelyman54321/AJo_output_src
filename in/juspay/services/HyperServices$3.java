/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.services;

import in.juspay.services.SDKState;

class HyperServices$3 {
    static final /* synthetic */ int[] $SwitchMap$in$juspay$services$SDKState;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        SDKState sDKState;
        int n7 = SDKState.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$in$juspay$services$SDKState = nArray;
        try {
            sDKState = SDKState.INSTANTIATED;
            n4 = sDKState.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$in$juspay$services$SDKState;
            sDKState = SDKState.INITIATE_STARTED;
            n4 = sDKState.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$in$juspay$services$SDKState;
            sDKState = SDKState.INITIATE_COMPLETED;
            n4 = sDKState.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$in$juspay$services$SDKState;
            sDKState = SDKState.TERMINATED;
            n4 = sDKState.ordinal();
            nArray[n4] = n3 = 4;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

