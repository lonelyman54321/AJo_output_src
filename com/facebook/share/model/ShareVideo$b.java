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
import com.facebook.share.model.ShareVideo;
import kotlin.jvm.internal.Intrinsics;

public final class ShareVideo$b
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        ShareVideo shareVideo = new ShareVideo(parcel);
        return shareVideo;
    }

    public final Object[] newArray(int n3) {
        return new ShareVideo[n3];
    }
}

