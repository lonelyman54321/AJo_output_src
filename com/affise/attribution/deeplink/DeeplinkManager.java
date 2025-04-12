/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.affise.attribution.deeplink;

import android.net.Uri;
import com.affise.attribution.deeplink.OnDeeplinkCallback;

public interface DeeplinkManager {
    public void handleDeeplink(Uri var1);

    public void init();

    public void setDeeplinkCallback(OnDeeplinkCallback var1);
}

