/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Offers.BankOfferItem$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BankOfferItem
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String bankName;
    private String description;
    private long endDate;
    private String offerDetails;
    private String tncUrl;
    private String type;

    static {
        BankOfferItem$Creator bankOfferItem$Creator = new BankOfferItem$Creator();
        CREATOR = bankOfferItem$Creator;
    }

    public BankOfferItem(String string2, String string3, String string4, long l2, String string5, String string6) {
        this.description = string2;
        this.bankName = string3;
        this.type = string4;
        this.endDate = l2;
        this.tncUrl = string5;
        this.offerDetails = string6;
    }

    public /* synthetic */ BankOfferItem(String string2, String string3, String string4, long l2, String string5, String string6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        long l3;
        int n4 = n3 & 8;
        long l4 = n4 != 0 ? (l3 = 0L) : l2;
        this(string2, string3, string4, l4, string5, string6);
    }

    public static /* synthetic */ BankOfferItem copy$default(BankOfferItem bankOfferItem, String string2, String object, String string3, long l2, String string4, String string5, int n3, Object object2) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = bankOfferItem.description;
        }
        if ((n4 = n3 & 2) != 0) {
            object = bankOfferItem.bankName;
        }
        object2 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = bankOfferItem.type;
        }
        String string6 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            l2 = bankOfferItem.endDate;
        }
        long l3 = l2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = bankOfferItem.tncUrl;
        }
        String string7 = string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            string5 = bankOfferItem.offerDetails;
        }
        object = bankOfferItem;
        string3 = string2;
        Object object3 = object2;
        object2 = string5;
        return bankOfferItem.copy(string2, (String)object3, string6, l3, string7, string5);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.bankName;
    }

    public final String component3() {
        return this.type;
    }

    public final long component4() {
        return this.endDate;
    }

    public final String component5() {
        return this.tncUrl;
    }

    public final String component6() {
        return this.offerDetails;
    }

    public final BankOfferItem copy(String string2, String string3, String string4, long l2, String string5, String string6) {
        BankOfferItem bankOfferItem = new BankOfferItem(string2, string3, string4, l2, string5, string6);
        return bankOfferItem;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof BankOfferItem;
        if (!object2) {
            return false;
        }
        object = (BankOfferItem)object;
        String string2 = this.description;
        String string3 = ((BankOfferItem)object).description;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        string2 = this.bankName;
        string3 = ((BankOfferItem)object).bankName;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        string2 = this.type;
        string3 = ((BankOfferItem)object).type;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        long l2 = this.endDate;
        long l3 = ((BankOfferItem)object).endDate;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        string2 = this.tncUrl;
        string3 = ((BankOfferItem)object).tncUrl;
        object2 = Intrinsics.areEqual(string2, string3);
        if (!object2) {
            return false;
        }
        string2 = this.offerDetails;
        object = ((BankOfferItem)object).offerDetails;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    public final String getOfferDetails() {
        return this.offerDetails;
    }

    public final String getTncUrl() {
        return this.tncUrl;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.description;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.bankName;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.type;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        long l2 = this.endDate;
        int n8 = 32;
        long l3 = l2 >>> n8;
        int n10 = (int)(l2 ^= l3);
        n4 = (n4 + n10) * 31;
        string3 = this.tncUrl;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.offerDetails;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setBankName(String string2) {
        this.bankName = string2;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setEndDate(long l2) {
        this.endDate = l2;
    }

    public final void setOfferDetails(String string2) {
        this.offerDetails = string2;
    }

    public final void setTncUrl(String string2) {
        this.tncUrl = string2;
    }

    public final void setType(String string2) {
        this.type = string2;
    }

    public String toString() {
        CharSequence charSequence = this.description;
        String string2 = this.bankName;
        String string3 = this.type;
        long l2 = this.endDate;
        String string4 = this.tncUrl;
        String string5 = this.offerDetails;
        charSequence = og_1.a("BankOfferItem(description=", (String)charSequence, ", bankName=", string2, ", type=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", endDate=");
        ((StringBuilder)charSequence).append(l2);
        X50.a((StringBuilder)charSequence, ", tncUrl=", string4, ", offerDetails=", string5);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.description;
        parcel.writeString(string2);
        string2 = this.bankName;
        parcel.writeString(string2);
        string2 = this.type;
        parcel.writeString(string2);
        long l2 = this.endDate;
        parcel.writeLong(l2);
        string2 = this.tncUrl;
        parcel.writeString(string2);
        string2 = this.offerDetails;
        parcel.writeString(string2);
    }
}

