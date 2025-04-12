/*
 * Decompiled with CFR 0.152.
 */
package com.jio.unity.plugin.android;

import com.jio.jioads.adinterfaces.JioAd;
import com.jio.jioads.adinterfaces.JioAdError;
import com.jio.jioads.adinterfaces.JioAdListener;
import com.jio.jioads.adinterfaces.JioAdView;
import com.jio.unity.plugin.android.JioAdsPluginListener;
import com.jio.unity.plugin.android.UnityBridge;

class UnityBridge$3
extends JioAdListener {
    public final /* synthetic */ JioAdsPluginListener a;
    public final /* synthetic */ UnityBridge b;

    public UnityBridge$3(UnityBridge unityBridge, JioAdsPluginListener jioAdsPluginListener) {
        this.b = unityBridge;
        this.a = jioAdsPluginListener;
    }

    public final void onAdClicked(JioAdView object) {
        UnityBridge.a("Callback adClicked");
        object = this.a;
        if (object != null) {
            int n3 = this.b.f;
            String string2 = String.valueOf(n3);
            object.onAdClicked(string2);
        }
    }

    public final void onAdClosed(JioAdView object, boolean bl2, boolean bl3) {
        object = new StringBuilder("Callback adClosed:  isVideoCompleted: ");
        ((StringBuilder)object).append(bl2);
        CharSequence charSequence = " isEligibleForReward: ";
        ((StringBuilder)object).append((String)charSequence);
        ((StringBuilder)object).append(bl3);
        UnityBridge.a(((StringBuilder)object).toString());
        object = this.a;
        if (object != null) {
            charSequence = new StringBuilder();
            int n3 = this.b.f;
            ((StringBuilder)charSequence).append(n3);
            String string2 = "|";
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(bl2);
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(bl3);
            String string3 = ((StringBuilder)charSequence).toString();
            object.onAdClosed(string3);
        }
    }

    public final void onAdDataPrepared(JioAd jioAd, boolean bl2, JioAdView jioAdView) {
        super.onAdDataPrepared(jioAd, bl2, jioAdView);
        this.b.getClass();
    }

    public final void onAdFailedToLoad(JioAdView object, JioAdError object2) {
        object = new StringBuilder("Callback AdFailedToLoad:  ");
        CharSequence charSequence = "";
        CharSequence charSequence2 = object2 != null ? ((JioAdError)object2).getErrorDescription() : charSequence;
        ((StringBuilder)object).append((String)charSequence2);
        UnityBridge.a(((StringBuilder)object).toString());
        object = this.a;
        if (object != null) {
            charSequence2 = new StringBuilder();
            int n3 = this.b.f;
            ((StringBuilder)charSequence2).append(n3);
            String string2 = "|";
            ((StringBuilder)charSequence2).append(string2);
            if (object2 != null) {
                charSequence = new StringBuilder();
                String string3 = ((JioAdError)object2).getErrorCode();
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append(string2);
                string3 = ((JioAdError)object2).getErrorTitle();
                ((StringBuilder)charSequence).append(string3);
                ((StringBuilder)charSequence).append(string2);
                object2 = ((JioAdError)object2).getErrorDescription();
                ((StringBuilder)charSequence).append((String)object2);
                charSequence = ((StringBuilder)charSequence).toString();
            }
            ((StringBuilder)charSequence2).append((String)charSequence);
            object2 = ((StringBuilder)charSequence2).toString();
            object.onAdFailedToLoad((String)object2);
        }
    }

    public final void onAdMediaEnd(JioAdView object) {
        UnityBridge.a("Callback adMediaEnd");
        object = this.a;
        if (object != null) {
            int n3 = this.b.f;
            String string2 = String.valueOf(n3);
            object.onAdMediaEnd(string2);
        }
    }

    public final void onAdMediaProgress(long l2, long l3) {
        super.onAdMediaProgress(l2, l3);
        JioAdsPluginListener jioAdsPluginListener = this.a;
        if (jioAdsPluginListener != null) {
            jioAdsPluginListener.onAdMediaProgress(l2, l3);
        }
    }

    public final void onAdMediaStart(JioAdView object) {
        UnityBridge.a("Callback adMediaStart");
        object = this.a;
        if (object != null) {
            int n3 = this.b.f;
            String string2 = String.valueOf(n3);
            object.onAdMediaStart(string2);
        }
    }

    public final void onAdPrepared(JioAdView object) {
        UnityBridge.a("Callback adPrepared");
        object = this.a;
        if (object != null) {
            CharSequence charSequence = new StringBuilder();
            Object object2 = this.b;
            int n3 = object2.f;
            charSequence.append(n3);
            String string2 = "|";
            charSequence.append(string2);
            object2 = object2.d.getAdState();
            charSequence.append(object2);
            charSequence = charSequence.toString();
            object.onAdPrepared((String)charSequence);
        }
    }

    public final void onAdRender(JioAdView object) {
        UnityBridge.a("Callback adRender");
        object = this.a;
        if (object != null) {
            int n3 = this.b.f;
            String string2 = String.valueOf(n3);
            object.onAdRender(string2);
        }
    }

    public final void onAdSkippable(JioAdView object) {
        UnityBridge.a("Callback adSkippable");
        object = this.a;
        if (object != null) {
            int n3 = this.b.f;
            String string2 = String.valueOf(n3);
            object.onAdSkippable(string2);
        }
    }
}

