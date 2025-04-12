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
import com.ril.ajio.services.data.Order.ExchangeRequestFailed$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ExchangeRequestFailed
implements Parcelable,
Serializable {
    public static final Parcelable.Creator CREATOR;
    private final String exchangeOrderID;
    private final String exchangeRTOMessage;
    private final Boolean isExchangeRTO;
    private final String productCode;
    private final String returnMessage;
    private final String returnRequestedOnMessage;

    static {
        ExchangeRequestFailed$Creator exchangeRequestFailed$Creator = new ExchangeRequestFailed$Creator();
        CREATOR = exchangeRequestFailed$Creator;
    }

    public ExchangeRequestFailed(String string2, String string3, String string4, Boolean bl2, String string5, String string6) {
        this.exchangeOrderID = string2;
        this.returnRequestedOnMessage = string3;
        this.returnMessage = string4;
        this.isExchangeRTO = bl2;
        this.productCode = string5;
        this.exchangeRTOMessage = string6;
    }

    public /* synthetic */ ExchangeRequestFailed(String string2, String string3, String string4, Boolean bl2, String string5, String string6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 8) != 0) {
            bl2 = Boolean.FALSE;
        }
        this(string2, string3, string4, bl2, string5, string6);
    }

    public static /* synthetic */ ExchangeRequestFailed copy$default(ExchangeRequestFailed exchangeRequestFailed, String string2, String object, String string3, Boolean object2, String string4, String object3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = exchangeRequestFailed.exchangeOrderID;
        }
        if ((n4 = n3 & 2) != 0) {
            object = exchangeRequestFailed.returnRequestedOnMessage;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = exchangeRequestFailed.returnMessage;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = exchangeRequestFailed.isExchangeRTO;
        }
        Boolean bl2 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = exchangeRequestFailed.productCode;
        }
        String string6 = string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object3 = exchangeRequestFailed.exchangeRTOMessage;
        }
        String string7 = object3;
        object = exchangeRequestFailed;
        string3 = string2;
        object2 = object4;
        string4 = string5;
        object3 = bl2;
        object4 = string7;
        return exchangeRequestFailed.copy(string2, (String)object2, string5, bl2, string6, string7);
    }

    public final String component1() {
        return this.exchangeOrderID;
    }

    public final String component2() {
        return this.returnRequestedOnMessage;
    }

    public final String component3() {
        return this.returnMessage;
    }

    public final Boolean component4() {
        return this.isExchangeRTO;
    }

    public final String component5() {
        return this.productCode;
    }

    public final String component6() {
        return this.exchangeRTOMessage;
    }

    public final ExchangeRequestFailed copy(String string2, String string3, String string4, Boolean bl2, String string5, String string6) {
        ExchangeRequestFailed exchangeRequestFailed = new ExchangeRequestFailed(string2, string3, string4, bl2, string5, string6);
        return exchangeRequestFailed;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ExchangeRequestFailed;
        if (!bl3) {
            return false;
        }
        object = (ExchangeRequestFailed)object;
        Object object2 = this.exchangeOrderID;
        Object object3 = ((ExchangeRequestFailed)object).exchangeOrderID;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.returnRequestedOnMessage;
        object3 = ((ExchangeRequestFailed)object).returnRequestedOnMessage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.returnMessage;
        object3 = ((ExchangeRequestFailed)object).returnMessage;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isExchangeRTO;
        object3 = ((ExchangeRequestFailed)object).isExchangeRTO;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productCode;
        object3 = ((ExchangeRequestFailed)object).productCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.exchangeRTOMessage;
        object = ((ExchangeRequestFailed)object).exchangeRTOMessage;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getExchangeOrderID() {
        return this.exchangeOrderID;
    }

    public final String getExchangeRTOMessage() {
        return this.exchangeRTOMessage;
    }

    public final String getProductCode() {
        return this.productCode;
    }

    public final String getReturnMessage() {
        return this.returnMessage;
    }

    public final String getReturnRequestedOnMessage() {
        return this.returnRequestedOnMessage;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.exchangeOrderID;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.returnRequestedOnMessage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.returnMessage;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isExchangeRTO;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.exchangeRTOMessage;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isExchangeRTO() {
        return this.isExchangeRTO;
    }

    public String toString() {
        CharSequence charSequence = this.exchangeOrderID;
        String string2 = this.returnRequestedOnMessage;
        String string3 = this.returnMessage;
        Boolean bl2 = this.isExchangeRTO;
        String string4 = this.productCode;
        String string5 = this.exchangeRTOMessage;
        charSequence = og_1.a("ExchangeRequestFailed(exchangeOrderID=", charSequence, ", returnRequestedOnMessage=", string2, ", returnMessage=");
        vw0_1.a(bl2, string3, ", isExchangeRTO=", ", productCode=", (StringBuilder)charSequence);
        return ko_0.a((StringBuilder)charSequence, string4, ", exchangeRTOMessage=", string5, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.exchangeOrderID;
        parcel.writeString((String)object);
        object = this.returnRequestedOnMessage;
        parcel.writeString((String)object);
        object = this.returnMessage;
        parcel.writeString((String)object);
        object = this.isExchangeRTO;
        if (object == null) {
            object = null;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            yi0_2.a(parcel, n4, (Boolean)object);
        }
        object = this.productCode;
        parcel.writeString((String)object);
        object = this.exchangeRTOMessage;
        parcel.writeString((String)object);
    }
}

