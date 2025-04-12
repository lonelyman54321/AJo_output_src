/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Home;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Home.Status$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class Status
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String errorCode;
    private final String messageDescription;
    private final int statusCode;

    static {
        Status$Creator status$Creator = new Status$Creator();
        CREATOR = status$Creator;
    }

    public Status(int n3, String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "messageDescription");
        Intrinsics.checkNotNullParameter(string3, "errorCode");
        this.statusCode = n3;
        this.messageDescription = string2;
        this.errorCode = string3;
    }

    public static /* synthetic */ Status copy$default(Status status, int n3, String string2, String string3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = status.statusCode;
        }
        if ((n7 = n4 & 2) != 0) {
            string2 = status.messageDescription;
        }
        if ((n4 &= 4) != 0) {
            string3 = status.errorCode;
        }
        return status.copy(n3, string2, string3);
    }

    public final int component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.messageDescription;
    }

    public final String component3() {
        return this.errorCode;
    }

    public final Status copy(int n3, String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "messageDescription");
        Intrinsics.checkNotNullParameter(string3, "errorCode");
        Status status = new Status(n3, string2, string3);
        return status;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Status;
        if (n3 == 0) {
            return false;
        }
        object = (Status)object;
        n3 = this.statusCode;
        int n4 = ((Status)object).statusCode;
        if (n3 != n4) {
            return false;
        }
        String string2 = this.messageDescription;
        String string3 = ((Status)object).messageDescription;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.errorCode;
        object = ((Status)object).errorCode;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getMessageDescription() {
        return this.messageDescription;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        int n3 = this.statusCode * 31;
        String string2 = this.messageDescription;
        n3 = zy_2.b(n3, 31, string2);
        return this.errorCode.hashCode() + n3;
    }

    public String toString() {
        int n3 = this.statusCode;
        String string2 = this.messageDescription;
        String string3 = this.errorCode;
        return h30_0.a(Fh3.a(n3, "Status(statusCode=", ", messageDescription=", string2, ", errorCode="), string3, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        n3 = this.statusCode;
        parcel.writeInt(n3);
        String string2 = this.messageDescription;
        parcel.writeString(string2);
        string2 = this.errorCode;
        parcel.writeString(string2);
    }
}

