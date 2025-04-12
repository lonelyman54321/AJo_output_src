/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.AbstractIterator$State;

class AbstractIterator$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$AbstractIterator$State;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        AbstractIterator$State abstractIterator$State;
        int n7 = AbstractIterator$State.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$common$collect$AbstractIterator$State = nArray;
        try {
            abstractIterator$State = AbstractIterator$State.DONE;
            n4 = abstractIterator$State.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$collect$AbstractIterator$State;
            abstractIterator$State = AbstractIterator$State.READY;
            n4 = abstractIterator$State.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

