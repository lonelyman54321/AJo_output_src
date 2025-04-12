/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.collect;

import com.google.common.collect.BoundType;

class Cut$1 {
    static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int n3;
        int n4;
        BoundType boundType;
        int n7 = BoundType.values().length;
        int[] nArray = new int[n7];
        $SwitchMap$com$google$common$collect$BoundType = nArray;
        try {
            boundType = BoundType.CLOSED;
            n4 = boundType.ordinal();
            nArray[n4] = n3 = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray = $SwitchMap$com$google$common$collect$BoundType;
            boundType = BoundType.OPEN;
            n4 = boundType.ordinal();
            nArray[n4] = n3 = 2;
            return;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            return;
        }
    }
}

