/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.ads.nativead;

import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.nativead.NativeAd$Image;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd$DisplayOpenMeasurement;
import java.util.List;

public interface NativeCustomFormatAd {
    public static final String ASSET_NAME_VIDEO = "_videoMediaView";

    public void destroy();

    public List getAvailableAssetNames();

    public String getCustomFormatId();

    public NativeCustomFormatAd$DisplayOpenMeasurement getDisplayOpenMeasurement();

    public NativeAd$Image getImage(String var1);

    public MediaContent getMediaContent();

    public CharSequence getText(String var1);

    public void performClick(String var1);

    public void recordImpression();
}

