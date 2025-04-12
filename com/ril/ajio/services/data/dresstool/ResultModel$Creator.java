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
import com.ril.ajio.services.data.dresstool.ResultModel;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ResultModel$Creator
implements Parcelable.Creator {
    public final ResultModel createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        String string4 = object.readString();
        int n3 = object.readInt();
        ArrayList arrayList = new ArrayList(n3);
        int n4 = 0;
        while (n4 != n3) {
            Parcelable.Creator creator = ApplicableStyle.CREATOR;
            int n7 = 1;
            n4 = pz0_2.a(creator, object, arrayList, n4, n7);
        }
        object = new ResultModel(string2, string3, string4, arrayList);
        return object;
    }

    public final ResultModel[] newArray(int n3) {
        return new ResultModel[n3];
    }
}

