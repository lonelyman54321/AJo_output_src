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
import com.ril.ajio.services.data.Home.HomePageRatingResponse;
import com.ril.ajio.services.data.Home.UserUnratedItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class HomePageRatingResponse$Creator
implements Parcelable.Creator {
    public final HomePageRatingResponse createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        int n3 = object.readInt();
        ArrayList<Object> arrayList = null;
        if (n3 != 0) {
            n3 = object.readInt();
            ArrayList<Object> arrayList2 = new ArrayList<Object>(n3);
            for (int i3 = 0; i3 != n3; ++i3) {
                Object object2;
                int n4 = object.readInt();
                if (n4 == 0) {
                    n4 = 0;
                    object2 = null;
                } else {
                    object2 = UserUnratedItem.CREATOR.createFromParcel(object);
                }
                arrayList2.add(object2);
            }
            arrayList = arrayList2;
        }
        object = object.readString();
        HomePageRatingResponse homePageRatingResponse = new HomePageRatingResponse(string2, arrayList, (String)object);
        return homePageRatingResponse;
    }

    public final HomePageRatingResponse[] newArray(int n3) {
        return new HomePageRatingResponse[n3];
    }
}

