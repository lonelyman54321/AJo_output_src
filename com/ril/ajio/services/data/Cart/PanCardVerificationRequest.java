/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Cart;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Cart.PanCardVerificationRequest$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PanCardVerificationRequest
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private Boolean acceptedTnC;
    private String dateOfBirth;
    private String name;
    private String taxPayerId;

    static {
        PanCardVerificationRequest$Creator panCardVerificationRequest$Creator = new PanCardVerificationRequest$Creator();
        CREATOR = panCardVerificationRequest$Creator;
    }

    public PanCardVerificationRequest() {
        this(null, null, null, null, 15, null);
    }

    public PanCardVerificationRequest(String string2, String string3, String string4, Boolean bl2) {
        this.name = string2;
        this.dateOfBirth = string3;
        this.taxPayerId = string4;
        this.acceptedTnC = bl2;
    }

    public /* synthetic */ PanCardVerificationRequest(String string2, String string3, String string4, Boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = null;
        }
        if ((n3 &= 8) != 0) {
            bl2 = null;
        }
        this(string2, string3, string4, bl2);
    }

    public static /* synthetic */ PanCardVerificationRequest copy$default(PanCardVerificationRequest panCardVerificationRequest, String string2, String string3, String string4, Boolean bl2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = panCardVerificationRequest.name;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = panCardVerificationRequest.dateOfBirth;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = panCardVerificationRequest.taxPayerId;
        }
        if ((n3 &= 8) != 0) {
            bl2 = panCardVerificationRequest.acceptedTnC;
        }
        return panCardVerificationRequest.copy(string2, string3, string4, bl2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.dateOfBirth;
    }

    public final String component3() {
        return this.taxPayerId;
    }

    public final Boolean component4() {
        return this.acceptedTnC;
    }

    public final PanCardVerificationRequest copy(String string2, String string3, String string4, Boolean bl2) {
        PanCardVerificationRequest panCardVerificationRequest = new PanCardVerificationRequest(string2, string3, string4, bl2);
        return panCardVerificationRequest;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof PanCardVerificationRequest;
        if (!bl3) {
            return false;
        }
        object = (PanCardVerificationRequest)object;
        Object object2 = this.name;
        String string2 = ((PanCardVerificationRequest)object).name;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.dateOfBirth;
        string2 = ((PanCardVerificationRequest)object).dateOfBirth;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.taxPayerId;
        string2 = ((PanCardVerificationRequest)object).taxPayerId;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.acceptedTnC;
        object = ((PanCardVerificationRequest)object).acceptedTnC;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Boolean getAcceptedTnC() {
        return this.acceptedTnC;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTaxPayerId() {
        return this.taxPayerId;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.name;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.dateOfBirth;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.taxPayerId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.acceptedTnC;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setAcceptedTnC(Boolean bl2) {
        this.acceptedTnC = bl2;
    }

    public final void setDateOfBirth(String string2) {
        this.dateOfBirth = string2;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setTaxPayerId(String string2) {
        this.taxPayerId = string2;
    }

    public String toString() {
        CharSequence charSequence = this.name;
        String string2 = this.dateOfBirth;
        String string3 = this.taxPayerId;
        Boolean bl2 = this.acceptedTnC;
        charSequence = og_1.a("PanCardVerificationRequest(name=", (String)charSequence, ", dateOfBirth=", string2, ", taxPayerId=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", acceptedTnC=");
        ((StringBuilder)charSequence).append(bl2);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.name;
        parcel.writeString((String)object);
        object = this.dateOfBirth;
        parcel.writeString((String)object);
        object = this.taxPayerId;
        parcel.writeString((String)object);
        object = this.acceptedTnC;
        if (object == null) {
            object = null;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            yi0_2.a(parcel, n4, (Boolean)object);
        }
    }
}

