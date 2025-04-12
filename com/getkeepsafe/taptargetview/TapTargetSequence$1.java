/*
 * Decompiled with CFR 0.152.
 */
package com.getkeepsafe.taptargetview;

import com.getkeepsafe.taptargetview.TapTarget;
import com.getkeepsafe.taptargetview.TapTargetSequence;
import com.getkeepsafe.taptargetview.TapTargetSequence$Listener;
import com.getkeepsafe.taptargetview.TapTargetView;
import com.getkeepsafe.taptargetview.TapTargetView$Listener;

class TapTargetSequence$1
extends TapTargetView$Listener {
    final /* synthetic */ TapTargetSequence this$0;

    public TapTargetSequence$1(TapTargetSequence tapTargetSequence) {
        this.this$0 = tapTargetSequence;
    }

    public void onOuterCircleClick(TapTargetView tapTargetView) {
        TapTargetSequence tapTargetSequence = this.this$0;
        boolean bl2 = tapTargetSequence.considerOuterCircleCanceled;
        if (bl2) {
            this.onTargetCancel(tapTargetView);
        }
    }

    public void onTargetCancel(TapTargetView object) {
        super.onTargetCancel((TapTargetView)((Object)object));
        Object object2 = this.this$0;
        boolean bl2 = ((TapTargetSequence)object2).continueOnCancel;
        if (bl2) {
            object2 = ((TapTargetSequence)object2).listener;
            if (object2 != null) {
                object = ((TapTargetView)((Object)object)).target;
                bl2 = false;
                object2.onSequenceStep((TapTarget)object, false);
            }
            object = this.this$0;
            ((TapTargetSequence)object).showNext();
        } else {
            object2 = ((TapTargetSequence)object2).listener;
            if (object2 != null) {
                object = ((TapTargetView)((Object)object)).target;
                object2.onSequenceCanceled((TapTarget)object);
            }
        }
    }

    public void onTargetClick(TapTargetView object) {
        super.onTargetClick((TapTargetView)((Object)object));
        TapTargetSequence$Listener tapTargetSequence$Listener = this.this$0.listener;
        if (tapTargetSequence$Listener != null) {
            object = object.target;
            boolean bl2 = true;
            tapTargetSequence$Listener.onSequenceStep((TapTarget)object, bl2);
        }
        this.this$0.showNext();
    }
}

