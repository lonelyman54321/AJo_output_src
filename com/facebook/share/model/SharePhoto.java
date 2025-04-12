/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMedia$a;
import com.facebook.share.model.ShareMedia$b;
import com.facebook.share.model.SharePhoto$a;
import com.facebook.share.model.SharePhoto$b;
import kotlin.jvm.internal.Intrinsics;

public final class SharePhoto
extends ShareMedia {
    public static final Parcelable.Creator CREATOR;
    public final Bitmap b;
    public final Uri c;
    public final boolean d;
    public final String e;
    public final ShareMedia$b f;

    static {
        SharePhoto$b sharePhoto$b = new Object();
        CREATOR = sharePhoto$b;
    }

    public SharePhoto(Parcel object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "parcel");
        super((Parcel)object);
        this.f = object2 = ShareMedia$b.PHOTO;
        object2 = Bitmap.class.getClassLoader();
        object2 = (Bitmap)object.readParcelable((ClassLoader)object2);
        this.b = object2;
        object2 = Uri.class.getClassLoader();
        object2 = (Uri)object.readParcelable((ClassLoader)object2);
        this.c = object2;
        byte by2 = object.readByte();
        if (by2 != 0) {
            by2 = 1;
        } else {
            by2 = 0;
            object2 = null;
        }
        this.d = by2;
        object = object.readString();
        this.e = object;
    }

    public SharePhoto(SharePhoto$a object) {
        super((ShareMedia$a)object);
        boolean bl2;
        ShareMedia$b shareMedia$b;
        this.f = shareMedia$b = ShareMedia$b.PHOTO;
        shareMedia$b = ((SharePhoto$a)object).b;
        this.b = shareMedia$b;
        shareMedia$b = ((SharePhoto$a)object).c;
        this.c = shareMedia$b;
        this.d = bl2 = ((SharePhoto$a)object).d;
        this.e = object = ((SharePhoto$a)object).e;
    }

    public final ShareMedia$b a() {
        return this.f;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        super.writeToParcel(parcel, n3);
        Object object = this.b;
        parcel.writeParcelable((Parcelable)object, 0);
        object = this.c;
        parcel.writeParcelable((Parcelable)object, 0);
        n3 = (byte)(this.d ? 1 : 0);
        parcel.writeByte((byte)n3);
        object = this.e;
        parcel.writeString((String)object);
    }
}

