/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Product.TagPrimary;
import kotlin.jvm.internal.Intrinsics;

public final class TagPrimary$Creator
implements Parcelable.Creator {
    public final TagPrimary createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        object = object.readString();
        TagPrimary tagPrimary = new TagPrimary(string2, (String)object);
        return tagPrimary;
    }

    public final TagPrimary[] newArray(int n3) {
        return new TagPrimary[n3];
    }
}

