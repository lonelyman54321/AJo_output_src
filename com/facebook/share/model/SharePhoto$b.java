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
import com.facebook.share.model.SharePhoto;
import kotlin.jvm.internal.Intrinsics;

public final class SharePhoto$b
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        SharePhoto sharePhoto = new SharePhoto(parcel);
        return sharePhoto;
    }

    public final Object[] newArray(int n3) {
        return new SharePhoto[n3];
    }
}

