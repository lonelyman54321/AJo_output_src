/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.ads.formats;

import android.os.Bundle;

public abstract class NativeAd {
    public static final String ASSET_ADCHOICES_CONTAINER_VIEW = "1098";

    public abstract void performClick(Bundle var1);

    public abstract boolean recordImpression(Bundle var1);

    public abstract void reportTouchEvent(Bundle var1);
}

