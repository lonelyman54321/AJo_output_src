/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.videomodule.callback;

import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.cdnlogging.d;
import com.jio.jioads.videomodule.b;

public interface a {
    public boolean canPrepareNextVideoAd(int var1);

    public int getBitRate();

    public void onAdChange(String var1, int var2);

    public void onAdClick();

    public void onAdCollapsed();

    public void onAdComplete(String var1, int var2, int var3, int var4, Integer var5);

    public void onAdExpand();

    public void onAdLoaded(String var1, int var2);

    public void onAdPrepared(String var1);

    public void onAdProgress(String var1, long var2, long var4);

    public void onAdSkippable(String var1, int var2, int var3, int var4, Integer var5);

    public void onAdSkipped(int var1, int var2, Integer var3);

    public void onAdStarted(String var1, int var2);

    public void onAllAdMediaProgress(long var1, long var3);

    public void onFailedToLoad(JioAdError var1, boolean var2, d var3, String var4, String var5, String var6);

    public void onMediaPlaybackChange(b var1);

    public void onMediaPrepareTimeOut(String var1, int var2);

    public void onPlayAgain(String var1, int var2);

    public void onPlayerError(int var1, String var2);

    public void onStartPrepare(String var1, int var2);

    public void playAgainFromMediaPlayer(String var1, int var2);
}

