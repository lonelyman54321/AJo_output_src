/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.jioads.mediation;

import com.jioads.mediation.partners.videoutils.JioMediationVideoController;
import org.json.JSONObject;

public interface JioAdsMediationCallback {
    public void addMediationUrl(String var1, JioMediationVideoController var2, int var3, int var4, Integer var5, Integer var6, String var7);

    public int getCurrentPosition();

    public int getVideoAdDuration();

    public int getVolume();

    public void mediationData(JSONObject var1);

    public void onLoadAdCalledForVideoMediationIMA();

    public void pauseAdFromMediation(boolean var1);

    public void resumeAdFromMediation(boolean var1);

    public void stopAds(boolean var1);
}

