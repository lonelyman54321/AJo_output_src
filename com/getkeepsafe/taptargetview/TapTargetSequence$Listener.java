/*
 * Decompiled with CFR 0.152.
 */
package com.getkeepsafe.taptargetview;

import com.getkeepsafe.taptargetview.TapTarget;

public interface TapTargetSequence$Listener {
    public void onSequenceCanceled(TapTarget var1);

    public void onSequenceFinish();

    public void onSequenceStep(TapTarget var1, boolean var2);
}

