/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.CustomerCare;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.CustomerCare.ActionData;
import com.ril.ajio.services.data.CustomerCare.CCComplaintDetailInfo;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class CCComplaintDetailInfo$Creator
implements Parcelable.Creator {
    /*
     * WARNING - void declaration
     */
    public final CCComplaintDetailInfo createFromParcel(Parcel parcel) {
        CCComplaintDetailInfo cCComplaintDetailInfo;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        String string2;
        String string3;
        void var36_49;
        void var18_18;
        Serializable serializable;
        Boolean bl2;
        Integer n3;
        float f5;
        Object object5 = parcel;
        ArrayList arrayList = "parcel";
        Intrinsics.checkNotNullParameter(parcel, (String)((Object)arrayList));
        String string4 = parcel.readString();
        String string5 = parcel.readString();
        long l2 = parcel.readLong();
        long l3 = parcel.readLong();
        long l4 = parcel.readLong();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        String string10 = parcel.readString();
        ArrayList arrayList2 = parcel.createStringArrayList();
        int bl5 = parcel.readInt();
        if (bl5 != 0) {
            boolean bl3 = true;
            f5 = Float.MIN_VALUE;
        } else {
            boolean bl4 = false;
            f5 = 0.0f;
            arrayList = null;
        }
        String string11 = parcel.readString();
        String string12 = parcel.readString();
        String string13 = parcel.readString();
        String string14 = parcel.readString();
        String string15 = parcel.readString();
        String string16 = parcel.readString();
        String string17 = parcel.readString();
        String string18 = parcel.readString();
        int n4 = parcel.readInt();
        Boolean bl6 = null;
        if (n4 == 0) {
            n4 = 0;
            n3 = null;
        } else {
            n4 = parcel.readInt();
            n3 = n4;
        }
        int n7 = parcel.readInt();
        if (n7 == 0) {
            boolean bl7 = false;
            bl2 = null;
        } else {
            void var31_37;
            int n8 = parcel.readInt();
            if (n8 != 0) {
                boolean bl8 = true;
            } else {
                boolean bl9 = false;
                bl2 = null;
            }
            bl2 = (boolean)var31_37;
        }
        int n10 = parcel.readInt();
        if (n10 == 0) {
            boolean bl10 = false;
            serializable = null;
        } else {
            void var33_45;
            int n14 = parcel.readInt();
            if (n14 != 0) {
                boolean bl11 = true;
            } else {
                boolean bl12 = false;
                serializable = null;
            }
            serializable = (boolean)var33_45;
        }
        int n15 = parcel.readInt();
        if (n15 == 0) {
            var36_49 = var18_18;
            string3 = string9;
            string2 = string10;
            boolean bl13 = false;
            arrayList = null;
            f5 = 0.0f;
        } else {
            int n16 = parcel.readInt();
            var36_49 = var18_18;
            arrayList = new ArrayList(n16);
            string2 = string10;
            int n17 = 0;
            string10 = null;
            while (n17 != n16) {
                object4 = ActionData.CREATOR;
                string3 = string9;
                int n18 = 1;
                n17 = pz0_2.a(object4, object5, arrayList, n17, n18);
            }
            string3 = string9;
        }
        int n19 = parcel.readInt();
        if (n19 == 0) {
            object3 = null;
        } else {
            int n20 = parcel.readInt();
            object3 = object4 = Integer.valueOf(n20);
        }
        int n21 = parcel.readInt();
        if (n21 == 0) {
            object2 = null;
        } else {
            int n22 = parcel.readInt();
            object2 = object4 = Integer.valueOf(n22);
        }
        int n24 = parcel.readInt();
        if (n24 == 0) {
            object = null;
        } else {
            int n25 = parcel.readInt();
            object = object4 = Integer.valueOf(n25);
        }
        int n26 = parcel.readInt();
        if (n26 == 0) {
            boolean bl14 = false;
            object5 = null;
        } else {
            void var39_62;
            int n27 = parcel.readInt();
            if (n27 != 0) {
                boolean bl15 = true;
            } else {
                boolean bl16 = false;
                object4 = null;
            }
            object5 = (boolean)var39_62;
        }
        object4 = cCComplaintDetailInfo;
        string9 = string3;
        string10 = string2;
        bl6 = bl2;
        bl2 = serializable;
        serializable = arrayList;
        Object object6 = object3;
        string2 = object;
        object3 = object5;
        cCComplaintDetailInfo = new CCComplaintDetailInfo(string4, string5, l2, l3, l4, string6, string7, string8, string3, string10, arrayList2, (boolean)var36_49, string11, string12, string13, string14, string15, string16, string17, string18, n3, bl6, bl2, arrayList, (Integer)object6, (Integer)object2, (Integer)object, (Boolean)object5);
        return cCComplaintDetailInfo;
    }

    public final CCComplaintDetailInfo[] newArray(int n3) {
        return new CCComplaintDetailInfo[n3];
    }
}

