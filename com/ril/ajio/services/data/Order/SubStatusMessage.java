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
import com.ril.ajio.services.data.Order.SubStatusMessage$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class SubStatusMessage
implements Parcelable,
Serializable {
    public static final Parcelable.Creator CREATOR;
    private final String message;

    static {
        SubStatusMessage$Creator subStatusMessage$Creator = new SubStatusMessage$Creator();
        CREATOR = subStatusMessage$Creator;
    }

    public SubStatusMessage(String string2) {
        this.message = string2;
    }

    public static /* synthetic */ SubStatusMessage copy$default(SubStatusMessage subStatusMessage, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = subStatusMessage.message;
        }
        return subStatusMessage.copy(string2);
    }

    public final String component1() {
        return this.message;
    }

    public final SubStatusMessage copy(String string2) {
        SubStatusMessage subStatusMessage = new SubStatusMessage(string2);
        return subStatusMessage;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SubStatusMessage;
        if (!bl3) {
            return false;
        }
        object = (SubStatusMessage)object;
        String string2 = this.message;
        object = ((SubStatusMessage)object).message;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int n3;
        String string2 = this.message;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n3;
    }

    public String toString() {
        String string2 = this.message;
        return cP.a("SubStatusMessage(message=", string2, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.message;
        parcel.writeString(string2);
    }
}

