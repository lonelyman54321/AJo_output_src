/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.listeners;

import com.jio.jioads.jioreel.data.JioReelAdMetaData;
import java.util.HashMap;

public interface JioReelListener {
    public void adBreakDetails(HashMap var1);

    public void onAdChange(JioReelAdMetaData var1);

    public void onAdDetection(boolean var1);

    public void onAdError(String var1, String var2);

    public void onAdMediaEnd();

    public void onAdMediaStart(JioReelAdMetaData var1);

    public void onAdSlotEnd(JioReelAdMetaData var1);

    public void onAdSlotStart(JioReelAdMetaData var1);

    public void onStreamReady(String var1);
}

