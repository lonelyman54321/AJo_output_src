/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Order.orderhistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Order.orderhistory.DateRangeItem$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class DateRangeItem
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String key;
    private final String value;

    static {
        DateRangeItem$Creator dateRangeItem$Creator = new DateRangeItem$Creator();
        CREATOR = dateRangeItem$Creator;
    }

    public DateRangeItem(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "value");
        this.key = string2;
        this.value = string3;
    }

    public static /* synthetic */ DateRangeItem copy$default(DateRangeItem dateRangeItem, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = dateRangeItem.key;
        }
        if ((n3 &= 2) != 0) {
            string3 = dateRangeItem.value;
        }
        return dateRangeItem.copy(string2, string3);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final DateRangeItem copy(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "value");
        DateRangeItem dateRangeItem = new DateRangeItem(string2, string3);
        return dateRangeItem;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof DateRangeItem;
        if (!bl3) {
            return false;
        }
        object = (DateRangeItem)object;
        String string2 = this.key;
        String string3 = ((DateRangeItem)object).key;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.value;
        object = ((DateRangeItem)object).value;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3 = this.key.hashCode() * 31;
        return this.value.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.key;
        String string3 = this.value;
        return uc0_0.a("DateRangeItem(key=", string2, ", value=", string3, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.key;
        parcel.writeString(string2);
        string2 = this.value;
        parcel.writeString(string2);
    }
}

