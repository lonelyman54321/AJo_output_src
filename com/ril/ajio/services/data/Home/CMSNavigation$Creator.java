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
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class CMSNavigation$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     */
    public final CMSNavigation createFromParcel(Parcel parcel) {
        boolean bl2;
        Parcelable.Creator creator;
        boolean bl3;
        ArrayList arrayList;
        Object object;
        Object object2;
        Object object3 = parcel;
        Object object4 = "parcel";
        Intrinsics.checkNotNullParameter(parcel, (String)object4);
        String string2 = parcel.readString();
        int bl4 = parcel.readInt();
        boolean bl5 = false;
        String string3 = null;
        if (bl4 == 0) {
            boolean bl6 = false;
            object4 = null;
        } else {
            void var5_10;
            int n3 = parcel.readInt();
            if (n3 != 0) {
                boolean bl7 = true;
            } else {
                boolean bl8 = false;
                object4 = null;
            }
            object4 = (boolean)var5_10;
        }
        String string4 = parcel.readString();
        Object object5 = parcel.readString();
        int n4 = parcel.readInt();
        if (n4 == 0) {
            n4 = 0;
            object2 = null;
        } else {
            n4 = parcel.readInt();
            object2 = n4;
        }
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        Object object6 = parcel.readString();
        int n7 = parcel.readInt();
        if (n7 == 0) {
            n7 = 0;
            object = null;
        } else {
            object = CMSNavigation.CREATOR.createFromParcel(object3);
        }
        object = (CMSNavigation)object;
        Object object7 = parcel.readString();
        int n8 = parcel.readInt();
        if (n8 == 0) {
            boolean bl9 = false;
            arrayList = null;
        } else {
            bl5 = parcel.readInt();
            arrayList = new ArrayList((int)(bl5 ? 1 : 0));
            bl3 = false;
            while (bl3 != bl5) {
                creator = CMSNavigation.CREATOR;
                int n10 = 1;
                bl3 = pz0_2.a(creator, object3, arrayList, (int)(bl3 ? 1 : 0), n10);
            }
        }
        int n14 = parcel.readInt();
        bl3 = n14 != 0;
        n14 = parcel.readInt();
        if (n14 != 0) {
            bl2 = true;
            float f5 = Float.MIN_VALUE;
        } else {
            bl2 = false;
            float f6 = 0.0f;
        }
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        String string10 = parcel.readString();
        String string11 = parcel.readString();
        creator = object3;
        string3 = string4;
        string4 = object5;
        object5 = object2;
        object2 = string5;
        string5 = string6;
        string6 = object6;
        object6 = object;
        object = object7;
        object7 = arrayList;
        boolean bl10 = bl3;
        bl3 = bl2;
        object3 = new CMSNavigation(string2, (Boolean)object4, string3, string4, (Integer)object5, (String)object2, string5, string6, (CMSNavigation)object6, (String)object, arrayList, bl10, bl2, string7, string8, string9, string10, string11);
        return object3;
    }

    public final CMSNavigation[] newArray(int n3) {
        return new CMSNavigation[n3];
    }
}

