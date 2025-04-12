/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Facet;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class Facet$Creator
implements Parcelable.Creator {
    public final Facet createFromParcel(Parcel parcel) {
        ArrayList<ClassLoader> arrayList;
        HashMap<Object, Parcel> hashMap;
        int n3;
        Object object;
        Object object2;
        Object object3;
        int n4;
        Object object4 = parcel;
        String string2 = "parcel";
        Intrinsics.checkNotNullParameter(parcel, string2);
        int n7 = parcel.readInt();
        boolean bl2 = n7 != 0;
        n7 = parcel.readInt();
        boolean bl3 = n7 != 0;
        String string3 = parcel.readString();
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        n7 = parcel.readInt();
        Object object5 = Facet.class;
        if (n7 == 0) {
            n7 = 0;
            string2 = null;
            n4 = 0;
            object3 = null;
        } else {
            n7 = parcel.readInt();
            object2 = new ArrayList(n7);
            object3 = null;
            for (n4 = 0; n4 != n7; ++n4) {
                object = ((Class)object5).getClassLoader();
                object = object4.readParcelable((ClassLoader)object);
                object2.add(object);
            }
            object3 = object2;
        }
        object = parcel.readString();
        String string6 = parcel.readString();
        n7 = parcel.readInt();
        HashMap hashMap2 = new HashMap(n7);
        object2 = null;
        for (n3 = 0; n3 != n7; ++n3) {
            hashMap = parcel.readString();
            int n8 = parcel.readInt();
            arrayList = new ArrayList<ClassLoader>(n8);
            int n10 = n7;
            string2 = null;
            for (n7 = 0; n7 != n8; ++n7) {
                ClassLoader classLoader = ((Class)object5).getClassLoader();
                classLoader = object4.readParcelable(classLoader);
                arrayList.add(classLoader);
            }
            hashMap2.put(hashMap, arrayList);
            n7 = n10;
        }
        n7 = parcel.readInt();
        hashMap = new HashMap<Object, Parcel>(n7);
        arrayList = null;
        for (int i3 = 0; i3 != n7; ++i3) {
            object5 = parcel.readString();
            n3 = parcel.readInt();
            object2 = n3;
            hashMap.put(object5, (Parcel)object2);
        }
        object2 = object4;
        object4 = new Facet(bl2, bl3, string3, string4, string5, (ArrayList)object3, (String)object, string6, hashMap2, hashMap);
        return object4;
    }

    public final Facet[] newArray(int n3) {
        return new Facet[n3];
    }
}

