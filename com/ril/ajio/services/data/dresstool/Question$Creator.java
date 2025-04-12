/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.dresstool;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.dresstool.Question;
import com.ril.ajio.services.data.dresstool.Style;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class Question$Creator
implements Parcelable.Creator {
    public final Question createFromParcel(Parcel object) {
        Object object2;
        String string2;
        ArrayList arrayList;
        Object object3 = "parcel";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        String string3 = object.readString();
        String string4 = object.readString();
        int n3 = object.readInt();
        if (n3 == 0) {
            arrayList = null;
        } else {
            n3 = object.readInt();
            arrayList = new ArrayList(n3);
            int n4 = 0;
            string2 = null;
            while (n4 != n3) {
                object2 = Style.CREATOR;
                int n7 = 1;
                n4 = pz0_2.a(object2, object, arrayList, n4, n7);
            }
        }
        string2 = object.readString();
        n3 = object.readInt();
        if (n3 == 0) {
            object2 = null;
        } else {
            n3 = object.readInt();
            object3 = n3;
            object2 = object3;
        }
        String string5 = object.readString();
        String string6 = object.readString();
        object = new Question(string3, string4, arrayList, string2, (Integer)object2, string5, string6);
        return object;
    }

    public final Question[] newArray(int n3) {
        return new Question[n3];
    }
}

