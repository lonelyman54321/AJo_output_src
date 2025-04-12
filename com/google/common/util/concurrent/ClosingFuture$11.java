/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.ClosingFuture$State;

class ClosingFuture$11 {
    static final /* synthetic */ int[] $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        ClosingFuture$State closingFuture$State;
        int n7 = ClosingFuture$State.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State = nArray;
        try {
            closingFuture$State = ClosingFuture$State.SUBSUMED;
            n4 = closingFuture$State.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State;
            closingFuture$State = ClosingFuture$State.WILL_CREATE_VALUE_AND_CLOSER;
            n4 = closingFuture$State.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State;
            closingFuture$State = ClosingFuture$State.WILL_CLOSE;
            n4 = closingFuture$State.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State;
            closingFuture$State = ClosingFuture$State.CLOSING;
            n4 = closingFuture$State.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State;
            closingFuture$State = ClosingFuture$State.CLOSED;
            n4 = closingFuture$State.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$util$concurrent$ClosingFuture$State;
            closingFuture$State = ClosingFuture$State.OPEN;
            n4 = closingFuture$State.ordinal();
            nArray[n4] = n3 = 6;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

