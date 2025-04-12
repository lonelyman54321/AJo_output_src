/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package com.google.firebase.dynamiclinks;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.dynamiclinks.DynamicLink$IosParameters;

public final class DynamicLink$IosParameters$Builder {
    private final Bundle parameters;

    public DynamicLink$IosParameters$Builder(String string2) {
        Bundle bundle;
        this.parameters = bundle = new Bundle();
        bundle.putString("ibi", string2);
    }

    public DynamicLink$IosParameters build() {
        Bundle bundle = this.parameters;
        DynamicLink$IosParameters dynamicLink$IosParameters = new DynamicLink$IosParameters(bundle, null);
        return dynamicLink$IosParameters;
    }

    public String getAppStoreId() {
        return this.parameters.getString("isi", "");
    }

    public String getCustomScheme() {
        return this.parameters.getString("ius", "");
    }

    public String getIpadBundleId() {
        return this.parameters.getString("ipbi", "");
    }

    public Uri getIpadFallbackUrl() {
        Bundle bundle = this.parameters;
        String string2 = "ipfl";
        if ((bundle = (Uri)bundle.getParcelable(string2)) == null) {
            bundle = Uri.EMPTY;
        }
        return bundle;
    }

    public String getMinimumVersion() {
        return this.parameters.getString("imv", "");
    }

    public DynamicLink$IosParameters$Builder setAppStoreId(String string2) {
        this.parameters.putString("isi", string2);
        return this;
    }

    public DynamicLink$IosParameters$Builder setCustomScheme(String string2) {
        this.parameters.putString("ius", string2);
        return this;
    }

    public DynamicLink$IosParameters$Builder setFallbackUrl(Uri uri) {
        this.parameters.putParcelable("ifl", (Parcelable)uri);
        return this;
    }

    public DynamicLink$IosParameters$Builder setIpadBundleId(String string2) {
        this.parameters.putString("ipbi", string2);
        return this;
    }

    public DynamicLink$IosParameters$Builder setIpadFallbackUrl(Uri uri) {
        this.parameters.putParcelable("ipfl", (Parcelable)uri);
        return this;
    }

    public DynamicLink$IosParameters$Builder setMinimumVersion(String string2) {
        this.parameters.putString("imv", string2);
        return this;
    }
}

