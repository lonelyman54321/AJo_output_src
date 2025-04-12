/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType$a;
import kotlin.jvm.internal.Intrinsics;

public final class GraphRequest$ParcelableResourceWithMimeType
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final Parcelable b;

    static {
        GraphRequest$ParcelableResourceWithMimeType$a graphRequest$ParcelableResourceWithMimeType$a = new Object();
        CREATOR = graphRequest$ParcelableResourceWithMimeType$a;
    }

    public GraphRequest$ParcelableResourceWithMimeType(Parcel parcel) {
        Object object = parcel.readString();
        this.a = object;
        object = FacebookSdk.a().getClassLoader();
        parcel = parcel.readParcelable((ClassLoader)object);
        this.b = parcel;
    }

    public GraphRequest$ParcelableResourceWithMimeType(Parcelable parcelable) {
        this.a = "image/png";
        this.b = parcelable;
    }

    public final int describeContents() {
        return 1;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        String string2 = this.a;
        parcel.writeString(string2);
        string2 = this.b;
        parcel.writeParcelable((Parcelable)string2, n3);
    }
}

