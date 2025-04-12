/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Order;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Order.BodyMessage;
import com.ril.ajio.services.data.Order.ReturnRequestCancelledPopUp;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnRequestCancelledPopUp$Creator
implements Parcelable.Creator {
    public final ReturnRequestCancelledPopUp createFromParcel(Parcel object) {
        Serializable serializable;
        Object object2 = "parcel";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.readInt();
        if (n3 == 0) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = object.readInt();
            serializable = new Serializable(n3);
            int n4 = 0;
            while (n4 != n3) {
                Parcelable.Creator creator = BodyMessage.CREATOR;
                int n7 = 1;
                n4 = pz0_2.a(creator, object, serializable, n4, n7);
            }
            object2 = serializable;
        }
        object = object.readString();
        serializable = new Serializable((List)object2, (String)object);
        return serializable;
    }

    public final ReturnRequestCancelledPopUp[] newArray(int n3) {
        return new ReturnRequestCancelledPopUp[n3];
    }
}

