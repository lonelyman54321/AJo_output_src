/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.CookieManager
 *  android.webkit.GeolocationPermissions
 *  android.webkit.ServiceWorkerController
 *  android.webkit.WebStorage
 */
package org.chromium.support_lib_boundary;

import android.webkit.CookieManager;
import android.webkit.GeolocationPermissions;
import android.webkit.ServiceWorkerController;
import android.webkit.WebStorage;

public interface ProfileBoundaryInterface {
    public CookieManager getCookieManager();

    public GeolocationPermissions getGeoLocationPermissions();

    public String getName();

    public ServiceWorkerController getServiceWorkerController();

    public WebStorage getWebStorage();
}

