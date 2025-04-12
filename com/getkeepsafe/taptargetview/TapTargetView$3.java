/*
 * Decompiled with CFR 0.152.
 */
package com.getkeepsafe.taptargetview;

import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder$UpdateListener;
import com.getkeepsafe.taptargetview.TapTargetView;

class TapTargetView$3
implements FloatValueAnimatorBuilder$UpdateListener {
    final /* synthetic */ TapTargetView this$0;

    public TapTargetView$3(TapTargetView tapTargetView) {
        this.this$0 = tapTargetView;
    }

    public void onUpdate(float f5) {
        this.this$0.expandContractUpdateListener.onUpdate(f5);
    }
}

