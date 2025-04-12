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
import com.ril.ajio.services.data.Order.Entries$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Entries
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String productCode;
    private String url;

    static {
        Entries$Creator entries$Creator = new Entries$Creator();
        CREATOR = entries$Creator;
    }

    public Entries() {
        this(null, null, 3, null);
    }

    public Entries(String string2, String string3) {
        this.productCode = string2;
        this.url = string3;
    }

    public /* synthetic */ Entries(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ Entries copy$default(Entries entries2, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = entries2.productCode;
        }
        if ((n3 &= 2) != 0) {
            string3 = entries2.url;
        }
        return entries2.copy(string2, string3);
    }

    public final String component1() {
        return this.productCode;
    }

    public final String component2() {
        return this.url;
    }

    public final Entries copy(String string2, String string3) {
        Entries entries2 = new Entries(string2, string3);
        return entries2;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Entries;
        if (!bl3) {
            return false;
        }
        object = (Entries)object;
        String string2 = this.productCode;
        String string3 = ((Entries)object).productCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.url;
        object = ((Entries)object).url;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int n3;
        String string2 = this.productCode;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.url;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setProductCode(String string2) {
        this.productCode = string2;
    }

    public final void setUrl(String string2) {
        this.url = string2;
    }

    public String toString() {
        String string2 = this.productCode;
        String string3 = this.url;
        return uc0_0.a("Entries(productCode=", string2, ", url=", string3, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.productCode;
        parcel.writeString(string2);
        string2 = this.url;
        parcel.writeString(string2);
    }
}

