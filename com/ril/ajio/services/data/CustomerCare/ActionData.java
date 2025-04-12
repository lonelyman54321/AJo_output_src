/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.CustomerCare;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.CustomerCare.ActionData$Creator;
import com.ril.ajio.services.data.CustomerCare.CCHelpInterface;
import com.ril.ajio.services.data.CustomerCare.ImageDetails;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class ActionData
implements CCHelpInterface,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String commentMessage;
    private final List imageDetails;

    static {
        ActionData$Creator actionData$Creator = new ActionData$Creator();
        CREATOR = actionData$Creator;
    }

    public ActionData(List list, String string2) {
        this.imageDetails = list;
        this.commentMessage = string2;
    }

    public static /* synthetic */ ActionData copy$default(ActionData actionData, List list, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = actionData.imageDetails;
        }
        if ((n3 &= 2) != 0) {
            string2 = actionData.commentMessage;
        }
        return actionData.copy(list, string2);
    }

    public final List component1() {
        return this.imageDetails;
    }

    public final String component2() {
        return this.commentMessage;
    }

    public final ActionData copy(List list, String string2) {
        ActionData actionData = new ActionData(list, string2);
        return actionData;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ActionData;
        if (!bl3) {
            return false;
        }
        object = (ActionData)object;
        Object object2 = this.imageDetails;
        List list = ((ActionData)object).imageDetails;
        bl3 = Intrinsics.areEqual(object2, list);
        if (!bl3) {
            return false;
        }
        object2 = this.commentMessage;
        object = ((ActionData)object).commentMessage;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCommentMessage() {
        return this.commentMessage;
    }

    public final List getImageDetails() {
        return this.imageDetails;
    }

    public int hashCode() {
        int n3;
        List list = this.imageDetails;
        int n4 = 0;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        n3 *= 31;
        String string2 = this.commentMessage;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        List list = this.imageDetails;
        String string2 = this.commentMessage;
        StringBuilder stringBuilder = new StringBuilder("ActionData(imageDetails=");
        stringBuilder.append(list);
        stringBuilder.append(", commentMessage=");
        stringBuilder.append(string2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.imageDetails;
        if (object == null) {
            n3 = 0;
            string2 = null;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            object = oz0_2.a(parcel, (List)object, n4);
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                ImageDetails imageDetails = (ImageDetails)object.next();
                imageDetails.writeToParcel(parcel, n3);
            }
        }
        string2 = this.commentMessage;
        parcel.writeString(string2);
    }
}

