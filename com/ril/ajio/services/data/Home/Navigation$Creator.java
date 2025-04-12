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
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class Navigation$Creator
implements Parcelable.Creator {
    public final Navigation createFromParcel(Parcel object) {
        ArrayList arrayList;
        Parcelable.Creator creator;
        int n3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int n4;
        String string2 = "parcel";
        Intrinsics.checkNotNullParameter(object, string2);
        int n7 = object.readInt();
        boolean bl2 = false;
        Boolean bl3 = null;
        if (n7 == 0) {
            n4 = 0;
            arrayList3 = null;
        } else {
            n7 = object.readInt();
            arrayList2 = new ArrayList(n7);
            n3 = 0;
            while (n3 != n7) {
                creator = Navigation.CREATOR;
                n4 = 1;
                n3 = pz0_2.a(creator, object, arrayList2, n3, n4);
            }
            arrayList3 = arrayList2;
        }
        n7 = object.readInt();
        if (n7 == 0) {
            boolean bl4 = false;
            arrayList = null;
        } else {
            n7 = object.readInt();
            arrayList2 = new ArrayList(n7);
            n3 = 0;
            while (n3 != n7) {
                creator = LinkDetail.CREATOR;
                int n8 = 1;
                n3 = pz0_2.a(creator, object, arrayList2, n3, n8);
            }
            arrayList = arrayList2;
        }
        String string3 = object.readString();
        String string4 = object.readString();
        String string5 = object.readString();
        String string6 = object.readString();
        n7 = object.readInt();
        if (n7 != 0) {
            n7 = object.readInt();
            if (n7 != 0) {
                bl2 = true;
            }
            bl3 = bl2;
        }
        String string7 = object.readString();
        creator = object;
        object = new Navigation(arrayList3, arrayList, string3, string4, string5, string6, bl3, string7);
        return object;
    }

    public final Navigation[] newArray(int n3) {
        return new Navigation[n3];
    }
}

