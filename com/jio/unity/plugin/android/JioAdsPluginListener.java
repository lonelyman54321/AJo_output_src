/*
 * Decompiled with CFR 0.152.
 */
package com.jio.unity.plugin.android;

public interface JioAdsPluginListener {
    public void onAdClicked(String var1);

    public void onAdClosed(String var1);

    public void onAdFailedToLoad(String var1);

    public void onAdMediaEnd(String var1);

    public void onAdMediaProgress(long var1, long var3);

    public void onAdMediaStart(String var1);

    public void onAdPrepared(String var1);

    public void onAdRender(String var1);

    public void onAdSkippable(String var1);
}

