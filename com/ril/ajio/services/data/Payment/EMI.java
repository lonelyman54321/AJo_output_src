/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Payment.EMI$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class EMI
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String bankName;
    private String code;

    static {
        EMI$Creator eMI$Creator = new EMI$Creator();
        CREATOR = eMI$Creator;
    }

    public EMI() {
        this(null, null, 3, null);
    }

    public EMI(String string2, String string3) {
        this.code = string2;
        this.bankName = string3;
    }

    public /* synthetic */ EMI(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ EMI copy$default(EMI eMI, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = eMI.code;
        }
        if ((n3 &= 2) != 0) {
            string3 = eMI.bankName;
        }
        return eMI.copy(string2, string3);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.bankName;
    }

    public final EMI copy(String string2, String string3) {
        EMI eMI = new EMI(string2, string3);
        return eMI;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof EMI;
        if (!bl3) {
            return false;
        }
        object = (EMI)object;
        String string2 = this.code;
        String string3 = ((EMI)object).code;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.bankName;
        object = ((EMI)object).bankName;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        int n3;
        String string2 = this.code;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.bankName;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setBankName(String string2) {
        this.bankName = string2;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public String toString() {
        String string2 = this.code;
        String string3 = this.bankName;
        return uc0_0.a("EMI(code=", string2, ", bankName=", string3, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.code;
        parcel.writeString(string2);
        string2 = this.bankName;
        parcel.writeString(string2);
    }
}

