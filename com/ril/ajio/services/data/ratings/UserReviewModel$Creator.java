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
import com.ril.ajio.services.data.ratings.ImageMap;
import com.ril.ajio.services.data.ratings.UserReviewModel;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class UserReviewModel$Creator
implements Parcelable.Creator {
    public final UserReviewModel createFromParcel(Parcel object) {
        UserReviewModel userReviewModel;
        Object object2;
        Serializable serializable;
        Object object3;
        Intrinsics.checkNotNullParameter(object, "parcel");
        int n3 = object.readInt();
        Object object4 = null;
        if (n3 == 0) {
            object3 = null;
        } else {
            long l2 = object.readLong();
            serializable = l2;
            object3 = serializable;
        }
        String string2 = object.readString();
        Object object5 = object.readString();
        n3 = object.readInt();
        if (n3 == 0) {
            object2 = null;
        } else {
            float f5 = object.readFloat();
            serializable = Float.valueOf(f5);
            object2 = serializable;
        }
        String string3 = object.readString();
        String string4 = object.readString();
        String string5 = object.readString();
        String string6 = object.readString();
        n3 = object.readInt();
        if (n3 != 0) {
            serializable = ImageMap.CREATOR;
            object4 = serializable.createFromParcel((Parcel)object);
        }
        object = object4;
        object = (ImageMap)object4;
        serializable = userReviewModel;
        object4 = object3;
        object3 = string2;
        string2 = object5;
        object5 = object2;
        object2 = string3;
        string3 = string4;
        string4 = string5;
        string5 = string6;
        string6 = object;
        userReviewModel = new UserReviewModel((Long)object4, (String)object3, string2, (Float)object5, (String)object2, string3, string4, string5, (ImageMap)object);
        return userReviewModel;
    }

    public final UserReviewModel[] newArray(int n3) {
        return new UserReviewModel[n3];
    }
}

