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
import com.facebook.share.model.ShareContent$a;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent$a;
import com.facebook.share.model.SharePhotoContent$b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class SharePhotoContent
extends ShareContent {
    public static final Parcelable.Creator CREATOR;
    public final List g;

    static {
        SharePhotoContent$b sharePhotoContent$b = new Object();
        CREATOR = sharePhotoContent$b;
    }

    public SharePhotoContent(Parcel object) {
        int n3;
        ArrayList<Object> arrayList = "parcel";
        Intrinsics.checkNotNullParameter(object, (String)((Object)arrayList));
        super((Parcel)object);
        Intrinsics.checkNotNullParameter(object, (String)((Object)arrayList));
        Intrinsics.checkNotNullParameter(object, (String)((Object)arrayList));
        arrayList = ShareMedia.class.getClassLoader();
        object = object.readParcelableArray((ClassLoader)((Object)arrayList));
        if (object == null) {
            object = mz0_2.a;
        } else {
            arrayList = new ArrayList<Object>();
            for (Object object2 : object) {
                boolean bl2 = object2 instanceof ShareMedia;
                if (!bl2) continue;
                arrayList.add(object2);
            }
            object = arrayList;
        }
        object = (Iterable)object;
        arrayList = new ArrayList<Object>();
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            Object e2 = object.next();
            int n4 = e2 instanceof SharePhoto;
            if (n4 == 0) continue;
            arrayList.add(e2);
        }
        this.g = object = CollectionsKt.k0(arrayList);
    }

    public SharePhotoContent(SharePhotoContent$a object) {
        super((ShareContent$a)object);
        this.g = object = CollectionsKt.k0(((SharePhotoContent$a)object).g);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Parcelable[] parcelableArray = "out";
        Intrinsics.checkNotNullParameter(parcel, (String)parcelableArray);
        super.writeToParcel(parcel, n3);
        Intrinsics.checkNotNullParameter(parcel, (String)parcelableArray);
        parcelableArray = this.g;
        Intrinsics.checkNotNullParameter(parcelableArray, "photos");
        parcelableArray = (Collection)parcelableArray;
        SharePhoto[] sharePhotoArray = new SharePhoto[]{};
        parcelableArray = parcelableArray.toArray(sharePhotoArray);
        parcel.writeParcelableArray(parcelableArray, n3);
    }
}

