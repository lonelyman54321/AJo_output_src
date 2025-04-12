/*
 * Decompiled with CFR 0.152.
 */
package com.getkeepsafe.taptargetview;

import com.getkeepsafe.taptargetview.FloatValueAnimatorBuilder$EndListener;
import com.getkeepsafe.taptargetview.TapTargetView;

class TapTargetView$7
implements FloatValueAnimatorBuilder$EndListener {
    final /* synthetic */ TapTargetView this$0;

    public TapTargetView$7(TapTargetView tapTargetView) {
        this.this$0 = tapTargetView;
    }

    public void onEnd() {
        TapTargetView.access$100(this.this$0, true);
    }
}

