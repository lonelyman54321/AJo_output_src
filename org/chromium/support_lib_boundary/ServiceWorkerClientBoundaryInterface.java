/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebResourceRequest
 *  android.webkit.WebResourceResponse
 */
package org.chromium.support_lib_boundary;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;

public interface ServiceWorkerClientBoundaryInterface
extends FeatureFlagHolderBoundaryInterface {
    public WebResourceResponse shouldInterceptRequest(WebResourceRequest var1);
}

