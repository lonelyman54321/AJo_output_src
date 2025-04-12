/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.dynamiclinks.internal.DynamicLinkDataCreator;

public class DynamicLinkData
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private long clickTimestamp;
    private String deepLink;
    private String dynamicLink;
    private Bundle extensionBundle;
    private int minVersion;
    private Uri redirectUrl;

    static {
        DynamicLinkDataCreator dynamicLinkDataCreator = new DynamicLinkDataCreator();
        CREATOR = dynamicLinkDataCreator;
    }

    public DynamicLinkData(String string2, String string3, int n3, long l2, Bundle bundle, Uri uri) {
        this.dynamicLink = string2;
        this.deepLink = string3;
        this.minVersion = n3;
        this.clickTimestamp = l2;
        this.extensionBundle = bundle;
        this.redirectUrl = uri;
    }

    public long getClickTimestamp() {
        return this.clickTimestamp;
    }

    public String getDeepLink() {
        return this.deepLink;
    }

    public String getDynamicLink() {
        return this.dynamicLink;
    }

    public Bundle getExtensionBundle() {
        Bundle bundle = this.extensionBundle;
        if (bundle == null) {
            bundle = new Bundle();
        }
        return bundle;
    }

    public int getMinVersion() {
        return this.minVersion;
    }

    public Uri getRedirectUrl() {
        return this.redirectUrl;
    }

    public void setClickTimestamp(long l2) {
        this.clickTimestamp = l2;
    }

    public void setDeepLink(String string2) {
        this.deepLink = string2;
    }

    public void setDynamicLink(String string2) {
        this.dynamicLink = string2;
    }

    public void setExtensionData(Bundle bundle) {
        this.extensionBundle = bundle;
    }

    public void setMinVersion(int n3) {
        this.minVersion = n3;
    }

    public void setRedirectUrl(Uri uri) {
        this.redirectUrl = uri;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        DynamicLinkDataCreator.writeToParcel(this, parcel, n3);
    }
}

