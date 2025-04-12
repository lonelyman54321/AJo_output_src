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
import com.facebook.share.model.ShareHashtag$a;
import com.facebook.share.model.ShareHashtag$b;
import kotlin.jvm.internal.Intrinsics;

public final class ShareHashtag
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;

    static {
        ShareHashtag$b shareHashtag$b = new Object();
        CREATOR = shareHashtag$b;
    }

    public ShareHashtag(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        object = object.readString();
        this.a = object;
    }

    public ShareHashtag(ShareHashtag$a object) {
        this.a = object = ((ShareHashtag$a)object).a;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.a;
        parcel.writeString(string2);
    }
}

