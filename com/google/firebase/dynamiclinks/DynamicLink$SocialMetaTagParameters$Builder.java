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
import com.google.firebase.dynamiclinks.DynamicLink$SocialMetaTagParameters;

public final class DynamicLink$SocialMetaTagParameters$Builder {
    private final Bundle parameters;

    public DynamicLink$SocialMetaTagParameters$Builder() {
        Bundle bundle;
        this.parameters = bundle = new Bundle();
    }

    public DynamicLink$SocialMetaTagParameters build() {
        Bundle bundle = this.parameters;
        DynamicLink$SocialMetaTagParameters dynamicLink$SocialMetaTagParameters = new DynamicLink$SocialMetaTagParameters(bundle, null);
        return dynamicLink$SocialMetaTagParameters;
    }

    public String getDescription() {
        return this.parameters.getString("sd", "");
    }

    public Uri getImageUrl() {
        Bundle bundle = this.parameters;
        String string2 = "si";
        if ((bundle = (Uri)bundle.getParcelable(string2)) == null) {
            bundle = Uri.EMPTY;
        }
        return bundle;
    }

    public String getTitle() {
        return this.parameters.getString("st", "");
    }

    public DynamicLink$SocialMetaTagParameters$Builder setDescription(String string2) {
        this.parameters.putString("sd", string2);
        return this;
    }

    public DynamicLink$SocialMetaTagParameters$Builder setImageUrl(Uri uri) {
        this.parameters.putParcelable("si", (Parcelable)uri);
        return this;
    }

    public DynamicLink$SocialMetaTagParameters$Builder setTitle(String string2) {
        this.parameters.putString("st", string2);
        return this;
    }
}

