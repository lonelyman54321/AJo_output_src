/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.ads.nativead;

import android.os.Bundle;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd$AdChoicesInfo;
import com.google.android.gms.ads.nativead.NativeAd$Image;
import com.google.android.gms.ads.nativead.NativeAd$UnconfirmedClickListener;
import java.util.List;

public abstract class NativeAd {
    public abstract void cancelUnconfirmedClick();

    public abstract void destroy();

    public abstract void enableCustomClickGesture();

    public abstract NativeAd$AdChoicesInfo getAdChoicesInfo();

    public abstract String getAdvertiser();

    public abstract String getBody();

    public abstract String getCallToAction();

    public abstract Bundle getExtras();

    public abstract String getHeadline();

    public abstract NativeAd$Image getIcon();

    public abstract List getImages();

    public abstract MediaContent getMediaContent();

    public abstract List getMuteThisAdReasons();

    public abstract String getPrice();

    public abstract ResponseInfo getResponseInfo();

    public abstract Double getStarRating();

    public abstract String getStore();

    public abstract boolean isCustomClickGestureEnabled();

    public abstract boolean isCustomMuteThisAdEnabled();

    public abstract void muteThisAd(MuteThisAdReason var1);

    public abstract void performClick(Bundle var1);

    public abstract void recordCustomClickGesture();

    public abstract boolean recordImpression(Bundle var1);

    public abstract void reportTouchEvent(Bundle var1);

    public abstract void setMuteThisAdListener(MuteThisAdListener var1);

    public abstract void setOnPaidEventListener(OnPaidEventListener var1);

    public abstract void setUnconfirmedClickListener(NativeAd$UnconfirmedClickListener var1);

    public abstract Object zza();
}

