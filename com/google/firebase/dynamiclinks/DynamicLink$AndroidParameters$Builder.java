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
import com.google.firebase.FirebaseApp;
import com.google.firebase.dynamiclinks.DynamicLink$AndroidParameters;

public final class DynamicLink$AndroidParameters$Builder {
    private final Bundle parameters;

    public DynamicLink$AndroidParameters$Builder() {
        Object object = FirebaseApp.getInstance();
        if (object != null) {
            object = new Bundle();
            this.parameters = object;
            String string2 = FirebaseApp.getInstance().getApplicationContext().getPackageName();
            object.putString("apn", string2);
            return;
        }
        object = new IllegalStateException("FirebaseApp not initialized.");
        throw object;
    }

    public DynamicLink$AndroidParameters$Builder(String string2) {
        Bundle bundle;
        this.parameters = bundle = new Bundle();
        bundle.putString("apn", string2);
    }

    public DynamicLink$AndroidParameters build() {
        Bundle bundle = this.parameters;
        DynamicLink$AndroidParameters dynamicLink$AndroidParameters = new DynamicLink$AndroidParameters(bundle, null);
        return dynamicLink$AndroidParameters;
    }

    public Uri getFallbackUrl() {
        Bundle bundle = this.parameters;
        String string2 = "afl";
        if ((bundle = (Uri)bundle.getParcelable(string2)) == null) {
            bundle = Uri.EMPTY;
        }
        return bundle;
    }

    public int getMinimumVersion() {
        return this.parameters.getInt("amv");
    }

    public DynamicLink$AndroidParameters$Builder setFallbackUrl(Uri uri) {
        this.parameters.putParcelable("afl", (Parcelable)uri);
        return this;
    }

    public DynamicLink$AndroidParameters$Builder setMinimumVersion(int n3) {
        this.parameters.putInt("amv", n3);
        return this;
    }
}

