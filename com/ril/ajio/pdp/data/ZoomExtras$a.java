/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.pdp.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.pdp.data.ZoomExtras;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class ZoomExtras$a
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object createFromParcel(Parcel object) {
        void var1_3;
        Object object2;
        String string2 = "parcel";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.readInt();
        ArrayList arrayList = object.createStringArrayList();
        String string3 = object.readString();
        int n4 = object.readInt();
        ArrayList<Object> arrayList2 = new ArrayList<Object>(n4);
        for (int i3 = 0; i3 != n4; ++i3) {
            object2 = ZoomExtras.class.getClassLoader();
            object2 = object.readParcelable((ClassLoader)object2);
            arrayList2.add(object2);
        }
        object2 = object.readString();
        String string4 = object.readString();
        n4 = object.readInt();
        if (n4 == 0) {
            Object var1_2 = null;
        } else {
            long l2 = object.readLong();
            Long l3 = l2;
        }
        void var11_15 = var1_3;
        return new ZoomExtras(n3, arrayList, string3, arrayList2, (String)object2, string4, (Long)var11_15);
    }

    public final Object[] newArray(int n3) {
        return new ZoomExtras[n3];
    }
}

