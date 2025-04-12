/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdEvent;
import java.util.HashMap;
import java.util.List;

public interface JioVmapAdsLoader$JioVmapListener {
    public void notifyPlayerTime();

    public void onJioVmapAdsLoaded(List var1);

    public void onJioVmapError(JioAdError var1);

    public void onJioVmapEvent(JioAdEvent var1, HashMap var2);
}

