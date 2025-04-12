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
import com.ril.ajio.services.data.ratings.Question;
import com.ril.ajio.services.data.ratings.ResponseOption;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class Question$Creator
implements Parcelable.Creator {
    public final Question createFromParcel(Parcel object) {
        Object object2;
        String string2;
        ArrayList<Object> arrayList;
        Object object3;
        Object object4 = "parcel";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        String string3 = object.readString();
        int n3 = object.readInt();
        if (n3 == 0) {
            object3 = null;
        } else {
            n3 = object.readInt();
            object3 = object4 = Integer.valueOf(n3);
        }
        n3 = object.readInt();
        if (n3 == 0) {
            arrayList = null;
        } else {
            n3 = object.readInt();
            arrayList = new ArrayList<Object>(n3);
            string2 = null;
            for (int i3 = 0; i3 != n3; ++i3) {
                int n4 = object.readInt();
                if (n4 == 0) {
                    n4 = 0;
                    object2 = null;
                } else {
                    object2 = ResponseOption.CREATOR.createFromParcel(object);
                }
                arrayList.add(object2);
            }
        }
        string2 = object.readString();
        object2 = object.readString();
        String string4 = object.readString();
        object = new Question(string3, (Integer)object3, arrayList, string2, (String)object2, string4);
        return object;
    }

    public final Question[] newArray(int n3) {
        return new Question[n3];
    }
}

