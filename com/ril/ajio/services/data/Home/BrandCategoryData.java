/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Home;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Home.BrandCategoryData$Creator;
import com.ril.ajio.services.data.Home.BrandSubCategory;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BrandCategoryData
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String id;
    private List subcategories;
    private String type;

    static {
        BrandCategoryData$Creator brandCategoryData$Creator = new BrandCategoryData$Creator();
        CREATOR = brandCategoryData$Creator;
    }

    public BrandCategoryData() {
        this(null, null, null, 7, null);
    }

    public BrandCategoryData(List list, String string2, String string3) {
        this.subcategories = list;
        this.type = string2;
        this.id = string3;
    }

    public /* synthetic */ BrandCategoryData(List list, String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = null;
        }
        if ((n3 &= 4) != 0) {
            string3 = null;
        }
        this(list, string2, string3);
    }

    public final int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.id;
    }

    public final List getSubcategories() {
        return this.subcategories;
    }

    public final String getType() {
        return this.type;
    }

    public final void setId(String string2) {
        this.id = string2;
    }

    public final void setSubcategories(List list) {
        this.subcategories = list;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.subcategories;
        if (object == null) {
            n3 = 0;
            string2 = null;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            object = oz0_2.a(parcel, (List)object, n4);
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                BrandSubCategory brandSubCategory = (BrandSubCategory)object.next();
                brandSubCategory.writeToParcel(parcel, n3);
            }
        }
        string2 = this.type;
        parcel.writeString(string2);
        string2 = this.id;
        parcel.writeString(string2);
    }
}

