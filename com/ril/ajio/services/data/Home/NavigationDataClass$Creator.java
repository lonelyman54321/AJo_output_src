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
import com.ril.ajio.services.data.Home.CMSNavigation;
import com.ril.ajio.services.data.Home.NavigationDataClass;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class NavigationDataClass$Creator
implements Parcelable.Creator {
    public final NavigationDataClass createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        int n3 = object.readInt();
        if (n3 == 0) {
            object = null;
        } else {
            n3 = object.readInt();
            ArrayList arrayList = new ArrayList(n3);
            int n4 = 0;
            while (n4 != n3) {
                Parcelable.Creator creator = CMSNavigation.CREATOR;
                int n7 = 1;
                n4 = pz0_2.a(creator, object, arrayList, n4, n7);
            }
            object = arrayList;
        }
        NavigationDataClass navigationDataClass = new NavigationDataClass(string2, (List)object);
        return navigationDataClass;
    }

    public final NavigationDataClass[] newArray(int n3) {
        return new NavigationDataClass[n3];
    }
}

