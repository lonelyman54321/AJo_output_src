/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Order;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Order.BodyMessage;
import com.ril.ajio.services.data.Order.ReturnRequestCancelledPopUp$Creator;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnRequestCancelledPopUp
implements Parcelable,
Serializable {
    public static final Parcelable.Creator CREATOR;
    private final List bodyMessage;
    private final String title;

    static {
        ReturnRequestCancelledPopUp$Creator returnRequestCancelledPopUp$Creator = new ReturnRequestCancelledPopUp$Creator();
        CREATOR = returnRequestCancelledPopUp$Creator;
    }

    public ReturnRequestCancelledPopUp(List list, String string2) {
        this.bodyMessage = list;
        this.title = string2;
    }

    public static /* synthetic */ ReturnRequestCancelledPopUp copy$default(ReturnRequestCancelledPopUp returnRequestCancelledPopUp, List list, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = returnRequestCancelledPopUp.bodyMessage;
        }
        if ((n3 &= 2) != 0) {
            string2 = returnRequestCancelledPopUp.title;
        }
        return returnRequestCancelledPopUp.copy(list, string2);
    }

    public final List component1() {
        return this.bodyMessage;
    }

    public final String component2() {
        return this.title;
    }

    public final ReturnRequestCancelledPopUp copy(List list, String string2) {
        ReturnRequestCancelledPopUp returnRequestCancelledPopUp = new ReturnRequestCancelledPopUp(list, string2);
        return returnRequestCancelledPopUp;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReturnRequestCancelledPopUp;
        if (!bl3) {
            return false;
        }
        object = (ReturnRequestCancelledPopUp)object;
        Object object2 = this.bodyMessage;
        List list = ((ReturnRequestCancelledPopUp)object).bodyMessage;
        bl3 = Intrinsics.areEqual(object2, list);
        if (!bl3) {
            return false;
        }
        object2 = this.title;
        object = ((ReturnRequestCancelledPopUp)object).title;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getBodyMessage() {
        return this.bodyMessage;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int n3;
        List list = this.bodyMessage;
        int n4 = 0;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        n3 *= 31;
        String string2 = this.title;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        List list = this.bodyMessage;
        String string2 = this.title;
        StringBuilder stringBuilder = new StringBuilder("ReturnRequestCancelledPopUp(bodyMessage=");
        stringBuilder.append(list);
        stringBuilder.append(", title=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.bodyMessage;
        if (object == null) {
            n3 = 0;
            string2 = null;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            object = oz0_2.a(parcel, (List)object, n4);
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                BodyMessage bodyMessage = (BodyMessage)object.next();
                bodyMessage.writeToParcel(parcel, n3);
            }
        }
        string2 = this.title;
        parcel.writeString(string2);
    }
}

