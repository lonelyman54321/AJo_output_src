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
import com.ril.ajio.services.data.Order.BodyMessage$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class BodyMessage
implements Parcelable,
Serializable {
    public static final Parcelable.Creator CREATOR;
    private final String message;

    static {
        BodyMessage$Creator bodyMessage$Creator = new BodyMessage$Creator();
        CREATOR = bodyMessage$Creator;
    }

    public BodyMessage(String string2) {
        this.message = string2;
    }

    public static /* synthetic */ BodyMessage copy$default(BodyMessage bodyMessage, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = bodyMessage.message;
        }
        return bodyMessage.copy(string2);
    }

    public final String component1() {
        return this.message;
    }

    public final BodyMessage copy(String string2) {
        BodyMessage bodyMessage = new BodyMessage(string2);
        return bodyMessage;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BodyMessage;
        if (!bl3) {
            return false;
        }
        object = (BodyMessage)object;
        String string2 = this.message;
        object = ((BodyMessage)object).message;
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
        return cP.a("BodyMessage(message=", string2, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.message;
        parcel.writeString(string2);
    }
}

