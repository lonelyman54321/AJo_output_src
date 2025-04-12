/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.webkit.ValueCallback
 */
package org.chromium.support_lib_boundary;

import android.content.Context;
import android.net.Uri;
import android.webkit.ValueCallback;
import java.util.List;
import java.util.Set;

public interface StaticsBoundaryInterface {
    public Uri getSafeBrowsingPrivacyPolicyUrl();

    public String getVariationsHeader();

    public void initSafeBrowsing(Context var1, ValueCallback var2);

    public boolean isMultiProcessEnabled();

    public void setSafeBrowsingAllowlist(Set var1, ValueCallback var2);

    public void setSafeBrowsingWhitelist(List var1, ValueCallback var2);
}

