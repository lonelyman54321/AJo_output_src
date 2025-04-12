/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer;

import java.util.Map;

public interface AppsFlyerConversionListener {
    public void onAppOpenAttribution(Map var1);

    public void onAttributionFailure(String var1);

    public void onConversionDataFail(String var1);

    public void onConversionDataSuccess(Map var1);
}

