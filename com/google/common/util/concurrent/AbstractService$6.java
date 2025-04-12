/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

import com.google.common.util.concurrent.Service$State;

class AbstractService$6 {
    static final /* synthetic */ int[] $SwitchMap$com$google$common$util$concurrent$Service$State;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        Service$State service$State;
        int n7 = Service$State.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$common$util$concurrent$Service$State = nArray;
        try {
            service$State = Service$State.NEW;
            n4 = service$State.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$util$concurrent$Service$State;
            service$State = Service$State.STARTING;
            n4 = service$State.ordinal();
            nArray[n4] = n3 = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$util$concurrent$Service$State;
            service$State = Service$State.RUNNING;
            n4 = service$State.ordinal();
            nArray[n4] = n3 = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$util$concurrent$Service$State;
            service$State = Service$State.STOPPING;
            n4 = service$State.ordinal();
            nArray[n4] = n3 = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$util$concurrent$Service$State;
            service$State = Service$State.TERMINATED;
            n4 = service$State.ordinal();
            nArray[n4] = n3 = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$util$concurrent$Service$State;
            service$State = Service$State.FAILED;
            n4 = service$State.ordinal();
            nArray[n4] = n3 = 6;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

