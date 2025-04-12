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
import com.ril.ajio.services.data.Order.NextStepsSection;
import com.ril.ajio.services.data.Order.SubStatusMessage;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class NextStepsSection$Creator
implements Parcelable.Creator {
    public final NextStepsSection createFromParcel(Parcel object) {
        Serializable serializable;
        Serializable serializable2;
        Intrinsics.checkNotNullParameter(object, "parcel");
        String string2 = object.readString();
        String string3 = object.readString();
        int n3 = object.readInt();
        if (n3 == 0) {
            n3 = 0;
            serializable2 = null;
        } else {
            n3 = object.readInt();
            serializable = new Serializable(n3);
            int n4 = 0;
            while (n4 != n3) {
                Parcelable.Creator creator = SubStatusMessage.CREATOR;
                int n7 = 1;
                n4 = pz0_2.a(creator, object, serializable, n4, n7);
            }
            serializable2 = serializable;
        }
        object = object.readString();
        serializable = new Serializable(string2, string3, (List)((Object)serializable2), (String)object);
        return serializable;
    }

    public final NextStepsSection[] newArray(int n3) {
        return new NextStepsSection[n3];
    }
}

