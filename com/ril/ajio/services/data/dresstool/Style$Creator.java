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
import com.ril.ajio.services.data.dresstool.Style;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Style$Creator
implements Parcelable.Creator {
    public final Style createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        object = object.createStringArrayList();
        Style style2 = new Style(string2, string3, (List)object);
        return style2;
    }

    public final Style[] newArray(int n3) {
        return new Style[n3];
    }
}

