/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia$b;
import com.facebook.share.model.ShareVideo$a;
import com.facebook.share.model.ShareVideo$b;
import kotlin.jvm.internal.Intrinsics;

public final class ShareVideo
extends ShareMedia {
    public static final Parcelable.Creator CREATOR;
    public final Uri b;
    public final ShareMedia$b c;

    static {
        ShareVideo$b shareVideo$b = new Object();
        CREATOR = shareVideo$b;
    }

    public ShareVideo(Parcel parcel) {
        Object object;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        super(parcel);
        this.c = object = ShareMedia$b.VIDEO;
        object = Uri.class.getClassLoader();
        parcel = (Uri)parcel.readParcelable((ClassLoader)object);
        this.b = parcel;
    }

    public ShareVideo(ShareVideo$a shareVideo$a) {
        super(shareVideo$a);
        ShareMedia$b shareMedia$b;
        this.c = shareMedia$b = ShareMedia$b.VIDEO;
        shareVideo$a = shareVideo$a.b;
        this.b = shareVideo$a;
    }

    public final ShareMedia$b a() {
        return this.c;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        super.writeToParcel(parcel, n3);
        Uri uri = this.b;
        parcel.writeParcelable((Parcelable)uri, 0);
    }
}

