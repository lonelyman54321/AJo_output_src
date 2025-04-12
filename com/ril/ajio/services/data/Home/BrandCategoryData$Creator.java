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
import com.ril.ajio.services.data.Home.BrandCategoryData;
import com.ril.ajio.services.data.Home.BrandSubCategory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class BrandCategoryData$Creator
implements Parcelable.Creator {
    public final BrandCategoryData createFromParcel(Parcel object) {
        BrandCategoryData brandCategoryData;
        Object object2;
        Object object3 = "parcel";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n3 = object.readInt();
        if (n3 == 0) {
            n3 = 0;
            object3 = null;
        } else {
            n3 = object.readInt();
            object2 = new ArrayList(n3);
            int n4 = 0;
            brandCategoryData = null;
            while (n4 != n3) {
                Parcelable.Creator creator = BrandSubCategory.CREATOR;
                int n7 = 1;
                n4 = pz0_2.a(creator, object, (ArrayList)object2, n4, n7);
            }
            object3 = object2;
        }
        object2 = object.readString();
        object = object.readString();
        brandCategoryData = new BrandCategoryData((List)object3, (String)object2, (String)object);
        return brandCategoryData;
    }

    public final BrandCategoryData[] newArray(int n3) {
        return new BrandCategoryData[n3];
    }
}

