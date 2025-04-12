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
import com.ril.ajio.services.data.Home.LinkDetail;
import com.ril.ajio.services.data.Home.Navigation;
import com.ril.ajio.services.data.Home.NavigationDataClass;
import com.ril.ajio.services.data.Home.NavigationParent;
import com.ril.ajio.services.data.Home.Status;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class NavigationParent$Creator
implements Parcelable.Creator {
    public final NavigationParent createFromParcel(Parcel parcel) {
        String string2;
        String string3;
        ArrayList arrayList;
        int n3;
        ArrayList arrayList2;
        Object object = parcel;
        Object object2 = "parcel";
        Intrinsics.checkNotNullParameter(parcel, (String)object2);
        int n4 = parcel.readInt();
        Boolean bl2 = null;
        if (n4 == 0) {
            n4 = 0;
            object2 = null;
        } else {
            object2 = Status.CREATOR.createFromParcel(parcel);
        }
        Object object3 = object2;
        object3 = (Status)object2;
        n4 = parcel.readInt();
        if (n4 == 0) {
            n4 = 0;
            object2 = null;
        } else {
            object2 = NavigationDataClass.CREATOR.createFromParcel(object);
        }
        Object object4 = object2;
        object4 = (NavigationDataClass)object2;
        n4 = parcel.readInt();
        boolean bl3 = false;
        if (n4 == 0) {
            arrayList2 = null;
        } else {
            n4 = parcel.readInt();
            arrayList2 = new ArrayList(n4);
            n3 = 0;
            arrayList = null;
            while (n3 != n4) {
                string3 = Navigation.CREATOR;
                int n7 = 1;
                n3 = pz0_2.a((Parcelable.Creator)string3, object, arrayList2, n3, n7);
            }
        }
        n4 = parcel.readInt();
        if (n4 == 0) {
            n3 = 0;
            arrayList = null;
        } else {
            n4 = parcel.readInt();
            arrayList = new ArrayList(n4);
            int n8 = 0;
            string3 = null;
            while (n8 != n4) {
                string2 = LinkDetail.CREATOR;
                int n10 = 1;
                n8 = pz0_2.a((Parcelable.Creator)string2, object, arrayList, n8, n10);
            }
        }
        string3 = parcel.readString();
        string2 = parcel.readString();
        String string4 = parcel.readString();
        n4 = parcel.readInt();
        if (n4 != 0) {
            n4 = parcel.readInt();
            if (n4 != 0) {
                bl3 = true;
            }
            bl2 = bl3;
        }
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        object = new NavigationParent((Status)object3, (NavigationDataClass)object4, arrayList2, arrayList, string3, string2, string4, bl2, string5, string6, string7, string8, string9);
        return object;
    }

    public final NavigationParent[] newArray(int n3) {
        return new NavigationParent[n3];
    }
}

