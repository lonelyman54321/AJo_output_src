/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.aztec.encoder;

import com.google.zxing.aztec.encoder.HighLevelEncoder;
import com.google.zxing.aztec.encoder.State;
import java.util.Comparator;

class HighLevelEncoder$1
implements Comparator {
    final /* synthetic */ HighLevelEncoder this$0;

    public HighLevelEncoder$1(HighLevelEncoder highLevelEncoder) {
        this.this$0 = highLevelEncoder;
    }

    public int compare(State state, State state2) {
        int n3 = state.getBitCount();
        int n4 = state2.getBitCount();
        return n3 - n4;
    }
}

