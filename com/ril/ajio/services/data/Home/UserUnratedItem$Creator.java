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
import com.ril.ajio.services.data.Home.HomePageRatingViewType;
import com.ril.ajio.services.data.Home.UserUnratedItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class UserUnratedItem$Creator
implements Parcelable.Creator {
    public final UserUnratedItem createFromParcel(Parcel object) {
        UserUnratedItem userUnratedItem;
        Object object2;
        Object object3;
        float f5;
        Object object4;
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        String string4 = object.readString();
        String string5 = object.readString();
        String string6 = object.readString();
        int n3 = object.readInt();
        Object object5 = null;
        if (n3 == 0) {
            object4 = null;
        } else {
            n3 = object.readInt();
            if (n3 != 0) {
                n3 = 1;
                f5 = Float.MIN_VALUE;
            } else {
                n3 = 0;
                f5 = 0.0f;
                object3 = null;
            }
            object4 = object3 = Boolean.valueOf(n3 != 0);
        }
        n3 = object.readInt();
        Object object6 = n3 == 0 ? null : (object3 = HomePageRatingViewType.valueOf(object.readString()));
        Object object7 = object.createStringArrayList();
        n3 = object.readInt();
        if (n3 == 0) {
            object2 = null;
        } else {
            f5 = object.readFloat();
            object2 = object3 = Float.valueOf(f5);
        }
        String string7 = object.readString();
        String string8 = object.readString();
        object = object.readString();
        object3 = userUnratedItem;
        object5 = object4;
        object4 = object6;
        object6 = object7;
        object7 = object2;
        object2 = string7;
        string7 = string8;
        string8 = object;
        userUnratedItem = new UserUnratedItem(string2, string3, string4, string5, string6, (Boolean)object5, (HomePageRatingViewType)((Object)object4), (ArrayList)object6, (Float)object7, (String)object2, string7, (String)object);
        return userUnratedItem;
    }

    public final UserUnratedItem[] newArray(int n3) {
        return new UserUnratedItem[n3];
    }
}

