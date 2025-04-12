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
import com.ril.ajio.services.data.dresstool.ApplicableStyle;
import com.ril.ajio.services.data.dresstool.DressToolModel;
import com.ril.ajio.services.data.dresstool.NoResult;
import com.ril.ajio.services.data.dresstool.Question;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class DressToolModel$Creator
implements Parcelable.Creator {
    /*
     * Enabled aggressive block sorting
     */
    public final DressToolModel createFromParcel(Parcel parcel) {
        String string2;
        Parcel parcel2;
        Object object = "parcel";
        Intrinsics.checkNotNullParameter(parcel, (String)object);
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        int n3 = parcel.readInt();
        Object object2 = null;
        if (n3 == 0) {
            n3 = 0;
            object = null;
        } else {
            object = NoResult.CREATOR.createFromParcel(parcel);
        }
        Object object3 = object;
        object3 = (NoResult)object;
        n3 = parcel.readInt();
        int n4 = 0;
        Parcel parcel3 = null;
        if (n3 == 0) {
            parcel2 = null;
        } else {
            n3 = parcel.readInt();
            parcel2 = new ArrayList(n3);
            int n7 = 0;
            string2 = null;
            while (n7 != n3) {
                Parcelable.Creator creator = Question.CREATOR;
                int n8 = 1;
                n7 = pz0_2.a(creator, parcel, (ArrayList)parcel2, n7, n8);
            }
        }
        n3 = parcel.readInt();
        if (n3 != 0) {
            n3 = parcel.readInt();
            object2 = new LinkedHashMap(n3);
            while (n4 != n3) {
                string2 = parcel.readString();
                Object object4 = ApplicableStyle.CREATOR.createFromParcel(parcel);
                ((AbstractMap)object2).put(string2, object4);
                ++n4;
            }
        }
        parcel = object2;
        object2 = object;
        parcel3 = parcel2;
        parcel2 = parcel;
        return new DressToolModel(string3, string4, string5, string6, string7, (NoResult)object3, (List)parcel3, (Map)parcel);
    }

    public final DressToolModel[] newArray(int n3) {
        return new DressToolModel[n3];
    }
}

