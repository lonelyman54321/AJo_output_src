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
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareStoryContent$a;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class ShareStoryContent
extends ShareContent {
    public static final Parcelable.Creator CREATOR;
    public final ShareMedia g;
    public final SharePhoto h;
    public final List i;
    public final String j;

    static {
        ShareStoryContent$a shareStoryContent$a = new Object();
        CREATOR = shareStoryContent$a;
    }

    public ShareStoryContent(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        super((Parcel)object);
        List list = ShareMedia.class.getClassLoader();
        list = (ShareMedia)object.readParcelable((ClassLoader)((Object)list));
        this.g = list;
        list = SharePhoto.class.getClassLoader();
        list = (SharePhoto)object.readParcelable((ClassLoader)((Object)list));
        this.h = list;
        list = new List();
        object.readStringList(list);
        boolean bl2 = list.isEmpty();
        list = bl2 ? null : CollectionsKt.k0(list);
        this.i = list;
        object = object.readString();
        this.j = object;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        super.writeToParcel(parcel, n3);
        Object object = this.g;
        parcel.writeParcelable((Parcelable)object, 0);
        object = this.h;
        parcel.writeParcelable((Parcelable)object, 0);
        object = this.i;
        if (object != null) {
            object = CollectionsKt.k0((Iterable)object);
        } else {
            n3 = 0;
            object = null;
        }
        parcel.writeStringList((List)object);
        object = this.j;
        parcel.writeString((String)object);
    }
}

