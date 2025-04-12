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
import com.ril.ajio.services.data.Offers.BankOffer$Creator;
import com.ril.ajio.services.data.Offers.BankOfferItem;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class BankOffer
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private ArrayList allBankOffer;

    static {
        BankOffer$Creator bankOffer$Creator = new BankOffer$Creator();
        CREATOR = bankOffer$Creator;
    }

    public BankOffer(ArrayList arrayList) {
        this.allBankOffer = arrayList;
    }

    public static /* synthetic */ BankOffer copy$default(BankOffer bankOffer, ArrayList arrayList, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            arrayList = bankOffer.allBankOffer;
        }
        return bankOffer.copy(arrayList);
    }

    public final ArrayList component1() {
        return this.allBankOffer;
    }

    public final BankOffer copy(ArrayList arrayList) {
        BankOffer bankOffer = new BankOffer(arrayList);
        return bankOffer;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BankOffer;
        if (!bl3) {
            return false;
        }
        object = (BankOffer)object;
        ArrayList arrayList = this.allBankOffer;
        object = ((BankOffer)object).allBankOffer;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getAllBankOffer() {
        return this.allBankOffer;
    }

    public int hashCode() {
        int n3;
        ArrayList arrayList = this.allBankOffer;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.hashCode();
        }
        return n3;
    }

    public final void setAllBankOffer(ArrayList arrayList) {
        this.allBankOffer = arrayList;
    }

    public String toString() {
        ArrayList arrayList = this.allBankOffer;
        StringBuilder stringBuilder = new StringBuilder("BankOffer(allBankOffer=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.allBankOffer;
        if (object == null) {
            n3 = 0;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            int n4 = ((ArrayList)object).size();
            parcel.writeInt(n4);
            object = ((ArrayList)object).iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                BankOfferItem bankOfferItem = (BankOfferItem)object.next();
                bankOfferItem.writeToParcel(parcel, n3);
            }
        }
    }
}

