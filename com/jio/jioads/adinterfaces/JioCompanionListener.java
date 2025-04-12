/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdView$JioAdCompanion;

public interface JioCompanionListener {
    public void onCompanionChange(JioAdView$JioAdCompanion var1);

    public void onCompanionClose(JioAdView$JioAdCompanion var1);

    public void onCompanionError(JioAdView$JioAdCompanion var1, String var2);

    public void onCompanionRender(JioAdView$JioAdCompanion var1);
}

