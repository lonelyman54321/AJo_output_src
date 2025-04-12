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
import com.ril.ajio.services.data.Cart.AmountData;
import com.ril.ajio.services.data.Cart.ConvenienceFee$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ConvenienceFee
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final AmountData COD;
    private final AmountData RVP;
    private final AmountData delivery;
    private final AmountData priorityDelivery;
    private final AmountData total;

    static {
        ConvenienceFee$Creator convenienceFee$Creator = new ConvenienceFee$Creator();
        CREATOR = convenienceFee$Creator;
    }

    public ConvenienceFee(AmountData amountData, AmountData amountData2, AmountData amountData3, AmountData amountData4, AmountData amountData5) {
        this.COD = amountData;
        this.RVP = amountData2;
        this.delivery = amountData3;
        this.total = amountData4;
        this.priorityDelivery = amountData5;
    }

    public /* synthetic */ ConvenienceFee(AmountData amountData, AmountData amountData2, AmountData amountData3, AmountData amountData4, AmountData amountData5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        AmountData amountData6 = n4 != 0 ? null : amountData;
        int n7 = n3 & 2;
        AmountData amountData7 = n7 != 0 ? null : amountData2;
        n7 = n3 & 4;
        AmountData amountData8 = n7 != 0 ? null : amountData3;
        n7 = n3 & 8;
        AmountData amountData9 = n7 != 0 ? null : amountData4;
        this(amountData6, amountData7, amountData8, amountData9, amountData5);
    }

    public static /* synthetic */ ConvenienceFee copy$default(ConvenienceFee convenienceFee, AmountData amountData, AmountData parcelable, AmountData amountData2, AmountData object, AmountData amountData3, int n3, Object object2) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            amountData = convenienceFee.COD;
        }
        if ((n4 = n3 & 2) != 0) {
            parcelable = convenienceFee.RVP;
        }
        object2 = parcelable;
        int n7 = n3 & 4;
        if (n7 != 0) {
            amountData2 = convenienceFee.delivery;
        }
        AmountData amountData4 = amountData2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object = convenienceFee.total;
        }
        AmountData amountData5 = object;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            amountData3 = convenienceFee.priorityDelivery;
        }
        AmountData amountData6 = amountData3;
        parcelable = convenienceFee;
        amountData2 = amountData;
        object = object2;
        amountData3 = amountData4;
        object2 = amountData6;
        return convenienceFee.copy(amountData, (AmountData)object, amountData4, amountData5, amountData6);
    }

    public final AmountData component1() {
        return this.COD;
    }

    public final AmountData component2() {
        return this.RVP;
    }

    public final AmountData component3() {
        return this.delivery;
    }

    public final AmountData component4() {
        return this.total;
    }

    public final AmountData component5() {
        return this.priorityDelivery;
    }

    public final ConvenienceFee copy(AmountData amountData, AmountData amountData2, AmountData amountData3, AmountData amountData4, AmountData amountData5) {
        ConvenienceFee convenienceFee = new ConvenienceFee(amountData, amountData2, amountData3, amountData4, amountData5);
        return convenienceFee;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ConvenienceFee;
        if (!bl3) {
            return false;
        }
        object = (ConvenienceFee)object;
        AmountData amountData = this.COD;
        AmountData amountData2 = ((ConvenienceFee)object).COD;
        bl3 = Intrinsics.areEqual(amountData, amountData2);
        if (!bl3) {
            return false;
        }
        amountData = this.RVP;
        amountData2 = ((ConvenienceFee)object).RVP;
        bl3 = Intrinsics.areEqual(amountData, amountData2);
        if (!bl3) {
            return false;
        }
        amountData = this.delivery;
        amountData2 = ((ConvenienceFee)object).delivery;
        bl3 = Intrinsics.areEqual(amountData, amountData2);
        if (!bl3) {
            return false;
        }
        amountData = this.total;
        amountData2 = ((ConvenienceFee)object).total;
        bl3 = Intrinsics.areEqual(amountData, amountData2);
        if (!bl3) {
            return false;
        }
        amountData = this.priorityDelivery;
        object = ((ConvenienceFee)object).priorityDelivery;
        boolean bl4 = Intrinsics.areEqual(amountData, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final AmountData getCOD() {
        return this.COD;
    }

    public final AmountData getDelivery() {
        return this.delivery;
    }

    public final AmountData getPriorityDelivery() {
        return this.priorityDelivery;
    }

    public final AmountData getRVP() {
        return this.RVP;
    }

    public final AmountData getTotal() {
        return this.total;
    }

    public int hashCode() {
        int n3;
        int n4;
        AmountData amountData = this.COD;
        int n7 = 0;
        if (amountData == null) {
            n4 = 0;
            amountData = null;
        } else {
            n4 = amountData.hashCode();
        }
        n4 *= 31;
        AmountData amountData2 = this.RVP;
        if (amountData2 == null) {
            n3 = 0;
            amountData2 = null;
        } else {
            n3 = amountData2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        amountData2 = this.delivery;
        if (amountData2 == null) {
            n3 = 0;
            amountData2 = null;
        } else {
            n3 = amountData2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        amountData2 = this.total;
        if (amountData2 == null) {
            n3 = 0;
            amountData2 = null;
        } else {
            n3 = amountData2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        amountData2 = this.priorityDelivery;
        if (amountData2 != null) {
            n7 = amountData2.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        AmountData amountData = this.COD;
        AmountData amountData2 = this.RVP;
        AmountData amountData3 = this.delivery;
        AmountData amountData4 = this.total;
        AmountData amountData5 = this.priorityDelivery;
        StringBuilder stringBuilder = new StringBuilder("ConvenienceFee(COD=");
        stringBuilder.append(amountData);
        stringBuilder.append(", RVP=");
        stringBuilder.append(amountData2);
        stringBuilder.append(", delivery=");
        stringBuilder.append(amountData3);
        stringBuilder.append(", total=");
        stringBuilder.append(amountData4);
        stringBuilder.append(", priorityDelivery=");
        stringBuilder.append(amountData5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        AmountData amountData = this.COD;
        int n4 = 1;
        if (amountData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            amountData.writeToParcel(parcel, n3);
        }
        amountData = this.RVP;
        if (amountData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            amountData.writeToParcel(parcel, n3);
        }
        amountData = this.delivery;
        if (amountData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            amountData.writeToParcel(parcel, n3);
        }
        amountData = this.total;
        if (amountData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            amountData.writeToParcel(parcel, n3);
        }
        amountData = this.priorityDelivery;
        if (amountData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            amountData.writeToParcel(parcel, n3);
        }
    }
}

