/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent$a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ShareMediaContent
extends ShareContent {
    public static final Parcelable.Creator CREATOR;
    public final List g;

    static {
        ShareMediaContent$a shareMediaContent$a = new Object();
        CREATOR = shareMediaContent$a;
    }

    public ShareMediaContent(Parcel parcelableArray) {
        Intrinsics.checkNotNullParameter(parcelableArray, "source");
        super((Parcel)parcelableArray);
        ArrayList<ShareMedia> arrayList = ShareMedia.class.getClassLoader();
        parcelableArray = parcelableArray.readParcelableArray((ClassLoader)((Object)arrayList));
        if (parcelableArray != null) {
            arrayList = new ArrayList<ShareMedia>();
            int n3 = parcelableArray.length;
            for (int i3 = 0; i3 < n3; ++i3) {
                ShareMedia shareMedia = (ShareMedia)parcelableArray[i3];
                if (shareMedia == null) continue;
                arrayList.add(shareMedia);
            }
        } else {
            arrayList = mz0_2.a;
        }
        this.g = arrayList;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        super.writeToParcel(parcel, n3);
        Parcelable[] parcelableArray = (Parcelable[])this.g;
        ShareMedia[] shareMediaArray = new ShareMedia[]{};
        parcelableArray = parcelableArray.toArray(shareMediaArray);
        parcel.writeParcelableArray(parcelableArray, n3);
    }
}

