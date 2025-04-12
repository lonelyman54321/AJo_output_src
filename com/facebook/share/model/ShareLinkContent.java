/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent$a;
import kotlin.jvm.internal.Intrinsics;

public final class ShareLinkContent
extends ShareContent {
    public static final Parcelable.Creator CREATOR;
    public final String g;

    static {
        ShareLinkContent$a shareLinkContent$a = new Object();
        CREATOR = shareLinkContent$a;
    }

    public ShareLinkContent(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "source");
        super((Parcel)object);
        object = object.readString();
        this.g = object;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        super.writeToParcel(parcel, n3);
        String string2 = this.g;
        parcel.writeString(string2);
    }
}

