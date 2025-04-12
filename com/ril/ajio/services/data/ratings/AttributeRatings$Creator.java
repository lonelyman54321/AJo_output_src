/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.ratings;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.ratings.AttributeRatings;
import kotlin.jvm.internal.Intrinsics;

public final class AttributeRatings$Creator
implements Parcelable.Creator {
    public final AttributeRatings createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        object = object.readString();
        AttributeRatings attributeRatings = new AttributeRatings(string2, (String)object);
        return attributeRatings;
    }

    public final AttributeRatings[] newArray(int n3) {
        return new AttributeRatings[n3];
    }
}

