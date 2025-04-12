/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.facebook;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import kotlin.jvm.internal.Intrinsics;

public final class GraphRequest$ParcelableResourceWithMimeType$a
implements Parcelable.Creator {
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "source");
        GraphRequest$ParcelableResourceWithMimeType graphRequest$ParcelableResourceWithMimeType = new GraphRequest$ParcelableResourceWithMimeType(parcel);
        return graphRequest$ParcelableResourceWithMimeType;
    }

    public final Object[] newArray(int n3) {
        return new GraphRequest$ParcelableResourceWithMimeType[n3];
    }
}

