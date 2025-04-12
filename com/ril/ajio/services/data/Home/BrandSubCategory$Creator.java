/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Home;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Home.BrandSubCategory;
import kotlin.jvm.internal.Intrinsics;

public final class BrandSubCategory$Creator
implements Parcelable.Creator {
    public final BrandSubCategory createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        BrandSubCategory brandSubCategory = new BrandSubCategory(string2, string3, string4, string5, string6, string7, string8);
        return brandSubCategory;
    }

    public final BrandSubCategory[] newArray(int n3) {
        return new BrandSubCategory[n3];
    }
}

