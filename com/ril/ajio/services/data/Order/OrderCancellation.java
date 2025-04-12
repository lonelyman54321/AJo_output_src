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
import com.ril.ajio.services.data.Order.OrderCancellation$Creator;
import com.ril.ajio.services.data.returnexchange.TotalPrice;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class OrderCancellation
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String code;
    private TotalPrice luxeTotalPrice;
    private String productCode;
    private TotalPrice totalPrice;

    static {
        OrderCancellation$Creator orderCancellation$Creator = new OrderCancellation$Creator();
        CREATOR = orderCancellation$Creator;
    }

    public OrderCancellation() {
        this(null, null, null, null, 15, null);
    }

    public OrderCancellation(String string2, String string3, TotalPrice totalPrice, TotalPrice totalPrice2) {
        this.code = string2;
        this.productCode = string3;
        this.totalPrice = totalPrice;
        this.luxeTotalPrice = totalPrice2;
    }

    public /* synthetic */ OrderCancellation(String string2, String string3, TotalPrice totalPrice, TotalPrice totalPrice2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            totalPrice = null;
        }
        if ((n3 &= 8) != 0) {
            totalPrice2 = null;
        }
        this(string2, string3, totalPrice, totalPrice2);
    }

    public static /* synthetic */ OrderCancellation copy$default(OrderCancellation orderCancellation, String string2, String string3, TotalPrice totalPrice, TotalPrice totalPrice2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = orderCancellation.code;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = orderCancellation.productCode;
        }
        if ((n4 = n3 & 4) != 0) {
            totalPrice = orderCancellation.totalPrice;
        }
        if ((n3 &= 8) != 0) {
            totalPrice2 = orderCancellation.luxeTotalPrice;
        }
        return orderCancellation.copy(string2, string3, totalPrice, totalPrice2);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.productCode;
    }

    public final TotalPrice component3() {
        return this.totalPrice;
    }

    public final TotalPrice component4() {
        return this.luxeTotalPrice;
    }

    public final OrderCancellation copy(String string2, String string3, TotalPrice totalPrice, TotalPrice totalPrice2) {
        OrderCancellation orderCancellation = new OrderCancellation(string2, string3, totalPrice, totalPrice2);
        return orderCancellation;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof OrderCancellation;
        if (!bl3) {
            return false;
        }
        object = (OrderCancellation)object;
        Object object2 = this.code;
        Object object3 = ((OrderCancellation)object).code;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productCode;
        object3 = ((OrderCancellation)object).productCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.totalPrice;
        object3 = ((OrderCancellation)object).totalPrice;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.luxeTotalPrice;
        object = ((OrderCancellation)object).luxeTotalPrice;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCode() {
        return this.code;
    }

    public final TotalPrice getLuxeTotalPrice() {
        return this.luxeTotalPrice;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final TotalPrice getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.code;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.productCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.totalPrice;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.luxeTotalPrice;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setLuxeTotalPrice(TotalPrice totalPrice) {
        this.luxeTotalPrice = totalPrice;
    }

    public final void setProductCode(String string2) {
        this.productCode = string2;
    }

    public final void setTotalPrice(TotalPrice totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String toString() {
        CharSequence charSequence = this.code;
        String string2 = this.productCode;
        TotalPrice totalPrice = this.totalPrice;
        TotalPrice totalPrice2 = this.luxeTotalPrice;
        charSequence = og_1.a("OrderCancellation(code=", (String)charSequence, ", productCode=", string2, ", totalPrice=");
        ((StringBuilder)charSequence).append(totalPrice);
        ((StringBuilder)charSequence).append(", luxeTotalPrice=");
        ((StringBuilder)charSequence).append(totalPrice2);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.code;
        parcel.writeString((String)object);
        object = this.productCode;
        parcel.writeString((String)object);
        object = this.totalPrice;
        parcel.writeSerializable((Serializable)object);
        object = this.luxeTotalPrice;
        parcel.writeSerializable((Serializable)object);
    }
}

