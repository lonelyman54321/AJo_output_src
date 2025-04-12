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
import com.ril.ajio.services.data.CustomerCare.CCComplaintAttachInfoNew;
import com.ril.ajio.services.data.CustomerCare.ImageData;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class CCComplaintAttachInfoNew$Creator
implements Parcelable.Creator {
    public final CCComplaintAttachInfoNew createFromParcel(Parcel object) {
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        int n3 = object.readInt();
        if (n3 == 0) {
            object = null;
        } else {
            n3 = object.readInt();
            ArrayList arrayList = new ArrayList(n3);
            int n4 = 0;
            while (n4 != n3) {
                Parcelable.Creator creator = ImageData.CREATOR;
                int n7 = 1;
                n4 = pz0_2.a(creator, object, arrayList, n4, n7);
            }
            object = arrayList;
        }
        CCComplaintAttachInfoNew cCComplaintAttachInfoNew = new CCComplaintAttachInfoNew(string2, string3, (ArrayList)object);
        return cCComplaintAttachInfoNew;
    }

    public final CCComplaintAttachInfoNew[] newArray(int n3) {
        return new CCComplaintAttachInfoNew[n3];
    }
}

