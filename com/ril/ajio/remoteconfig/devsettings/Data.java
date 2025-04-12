/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.remoteconfig.devsettings;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.remoteconfig.devsettings.Data$a;
import kotlin.jvm.internal.Intrinsics;

public final class Data
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final String c;

    static {
        Data$a data$a = new Object();
        CREATOR = data$a;
    }

    public Data(String string2, String string3, String string4) {
        this.a = string2;
        this.b = string3;
        this.c = string4;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Data;
        if (!bl3) {
            return false;
        }
        object = (Data)object;
        String string2 = this.a;
        String string3 = ((Data)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string3 = this.b;
        string2 = ((Data)object).b;
        bl3 = Intrinsics.areEqual(string3, string2);
        if (!bl3) {
            return false;
        }
        string3 = this.c;
        object = ((Data)object).c;
        boolean bl4 = Intrinsics.areEqual(string3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        String string2 = this.a;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.b;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.c;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Data(key=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", value=");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", editedValue=");
        string2 = this.c;
        return h30_0.a(stringBuilder, string2, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.a;
        parcel.writeString(string2);
        string2 = this.b;
        parcel.writeString(string2);
        string2 = this.c;
        parcel.writeString(string2);
    }
}

