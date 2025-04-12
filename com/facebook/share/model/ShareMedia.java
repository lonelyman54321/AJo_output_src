/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 */
package com.facebook.share.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia$a;
import com.facebook.share.model.ShareMedia$b;
import kotlin.jvm.internal.Intrinsics;

public abstract class ShareMedia
implements Parcelable {
    public final Bundle a;

    public ShareMedia(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        ClassLoader classLoader = this.getClass().getClassLoader();
        parcel = parcel.readBundle(classLoader);
        if (parcel == null) {
        }
        this.a = parcel;
    }

    public ShareMedia(ShareMedia$a shareMedia$a) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(shareMedia$a, "builder");
        shareMedia$a = shareMedia$a.a;
        this.a = bundle = new Bundle((Bundle)shareMedia$a);
    }

    public abstract ShareMedia$b a();

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Bundle bundle = this.a;
        parcel.writeBundle(bundle);
    }
}

