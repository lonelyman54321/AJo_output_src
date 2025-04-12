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
import com.ril.ajio.services.data.Cart.AmountData$Creator;
import com.ril.ajio.services.data.Price;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AmountData
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private Price amount;
    private String cohort;
    private Price netAmount;

    static {
        AmountData$Creator amountData$Creator = new AmountData$Creator();
        CREATOR = amountData$Creator;
    }

    public AmountData() {
        this(null, null, null, 7, null);
    }

    public AmountData(Price price, Price price2, String string2) {
        this.amount = price;
        this.netAmount = price2;
        this.cohort = string2;
    }

    public /* synthetic */ AmountData(Price price, Price price2, String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            price = null;
        }
        if ((n4 = n3 & 2) != 0) {
            price2 = null;
        }
        if ((n3 &= 4) != 0) {
            string2 = null;
        }
        this(price, price2, string2);
    }

    public static /* synthetic */ AmountData copy$default(AmountData amountData, Price price, Price price2, String string2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            price = amountData.amount;
        }
        if ((n4 = n3 & 2) != 0) {
            price2 = amountData.netAmount;
        }
        if ((n3 &= 4) != 0) {
            string2 = amountData.cohort;
        }
        return amountData.copy(price, price2, string2);
    }

    public final Price component1() {
        return this.amount;
    }

    public final Price component2() {
        return this.netAmount;
    }

    public final String component3() {
        return this.cohort;
    }

    public final AmountData copy(Price price, Price price2, String string2) {
        AmountData amountData = new AmountData(price, price2, string2);
        return amountData;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AmountData;
        if (!bl3) {
            return false;
        }
        object = (AmountData)object;
        Object object2 = this.amount;
        Price price = ((AmountData)object).amount;
        bl3 = Intrinsics.areEqual(object2, price);
        if (!bl3) {
            return false;
        }
        object2 = this.netAmount;
        price = ((AmountData)object).netAmount;
        bl3 = Intrinsics.areEqual(object2, price);
        if (!bl3) {
            return false;
        }
        object2 = this.cohort;
        object = ((AmountData)object).cohort;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Price getAmount() {
        return this.amount;
    }

    public final String getCohort() {
        return this.cohort;
    }

    public final Price getNetAmount() {
        return this.netAmount;
    }

    public int hashCode() {
        int n3;
        int n4;
        Price price = this.amount;
        int n7 = 0;
        if (price == null) {
            n4 = 0;
            price = null;
        } else {
            n4 = price.hashCode();
        }
        n4 *= 31;
        Object object = this.netAmount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.cohort;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAmount(Price price) {
        this.amount = price;
    }

    public final void setCohort(String string2) {
        this.cohort = string2;
    }

    public final void setNetAmount(Price price) {
        this.netAmount = price;
    }

    public String toString() {
        Price price = this.amount;
        Price price2 = this.netAmount;
        String string2 = this.cohort;
        StringBuilder stringBuilder = new StringBuilder("AmountData(amount=");
        stringBuilder.append(price);
        stringBuilder.append(", netAmount=");
        stringBuilder.append(price2);
        stringBuilder.append(", cohort=");
        return h30_0.a(stringBuilder, string2, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Price price = this.amount;
        parcel.writeParcelable((Parcelable)price, n3);
        price = this.netAmount;
        parcel.writeParcelable((Parcelable)price, n3);
        String string2 = this.cohort;
        parcel.writeString(string2);
    }
}

