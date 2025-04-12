/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.firebase.dynamiclinks.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.dynamiclinks.ShortDynamicLink;
import com.google.firebase.dynamiclinks.internal.ShortDynamicLinkImplCreator;
import java.util.List;

public final class ShortDynamicLinkImpl
extends AbstractSafeParcelable
implements ShortDynamicLink {
    public static final Parcelable.Creator CREATOR;
    private final Uri previewLink;
    private final Uri shortLink;
    private final List warnings;

    static {
        ShortDynamicLinkImplCreator shortDynamicLinkImplCreator = new ShortDynamicLinkImplCreator();
        CREATOR = shortDynamicLinkImplCreator;
    }

    public ShortDynamicLinkImpl(Uri uri, Uri uri2, List list) {
        this.shortLink = uri;
        this.previewLink = uri2;
        if (list == null) {
        }
        this.warnings = list;
    }

    public Uri getPreviewLink() {
        return this.previewLink;
    }

    public Uri getShortLink() {
        return this.shortLink;
    }

    public List getWarnings() {
        return this.warnings;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        ShortDynamicLinkImplCreator.writeToParcel(this, parcel, n3);
    }
}

