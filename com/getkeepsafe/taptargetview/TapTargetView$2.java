/*
 * Decompiled with CFR 0.152.
 */
package com.getkeepsafe.taptargetview;

import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder$EndListener;
import com.getkeepsafe.taptargetview.TapTargetView;

class TapTargetView$2
implements FloatValueAnimatorBuilder$EndListener {
    final /* synthetic */ TapTargetView this$0;

    public TapTargetView$2(TapTargetView tapTargetView) {
        this.this$0 = tapTargetView;
    }

    public void onEnd() {
        this.this$0.pulseAnimation.start();
        TapTargetView.access$002(this.this$0, true);
    }
}

