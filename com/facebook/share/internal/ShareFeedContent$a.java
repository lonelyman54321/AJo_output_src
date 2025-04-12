/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.facebook.share.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.internal.ShareFeedContent;
import kotlin.jvm.internal.Intrinsics;

public final class ShareFeedContent$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        ShareFeedContent shareFeedContent = new ShareFeedContent(parcel);
        return shareFeedContent;
    }

    public final Object[] newArray(int n3) {
        return new ShareFeedContent[n3];
    }
}

