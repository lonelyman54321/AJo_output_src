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
import com.ril.ajio.services.data.Product.CategoryTags;
import com.ril.ajio.services.data.Product.TagPrimary;
import kotlin.jvm.internal.Intrinsics;

public final class CategoryTags$Creator
implements Parcelable.Creator {
    public final CategoryTags createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        int n3 = object.readInt();
        if (n3 == 0) {
            object = null;
        } else {
            Parcelable.Creator creator = TagPrimary.CREATOR;
            object = creator.createFromParcel(object);
        }
        object = (TagPrimary)object;
        CategoryTags categoryTags = new CategoryTags(string2, (TagPrimary)object);
        return categoryTags;
    }

    public final CategoryTags[] newArray(int n3) {
        return new CategoryTags[n3];
    }
}

