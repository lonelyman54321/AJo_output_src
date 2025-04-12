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
import com.facebook.share.model.ShareMedia$a;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhoto$a;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideo$a;
import com.facebook.share.model.ShareVideoContent$a;
import kotlin.jvm.internal.Intrinsics;

public final class ShareVideoContent
extends ShareContent
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String g;
    public final String h;
    public final SharePhoto i;
    public final ShareVideo j;

    static {
        ShareVideoContent$a shareVideoContent$a = new Object();
        CREATOR = shareVideoContent$a;
    }

    public ShareVideoContent(Parcel object) {
        Object object2 = "parcel";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super((Parcel)object);
        Object object3 = object.readString();
        this.g = object3;
        object3 = object.readString();
        this.h = object3;
        object3 = new SharePhoto$a();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object4 = SharePhoto.class.getClassLoader();
        object4 = (SharePhoto)object.readParcelable((ClassLoader)object4);
        ((SharePhoto$a)object3).a((SharePhoto)object4);
        object4 = ((SharePhoto$a)object3).c;
        object3 = object4 == null && (object4 = ((SharePhoto$a)object3).b) == null ? null : (object4 = new SharePhoto((SharePhoto$a)object3));
        this.i = object3;
        object3 = new ShareMedia$a();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = ShareVideo.class.getClassLoader();
        object = (ShareVideo)object.readParcelable((ClassLoader)object2);
        if (object != null) {
            object = object.b;
            ((ShareVideo$a)object3).b = object;
        }
        super((ShareVideo$a)object3);
        this.j = object;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        super.writeToParcel(parcel, n3);
        Object object = this.g;
        parcel.writeString((String)object);
        object = this.h;
        parcel.writeString((String)object);
        object = this.i;
        parcel.writeParcelable((Parcelable)object, 0);
        object = this.j;
        parcel.writeParcelable((Parcelable)object, 0);
    }
}

