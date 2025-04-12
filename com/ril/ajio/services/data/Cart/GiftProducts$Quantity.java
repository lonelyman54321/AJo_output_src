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
import com.ril.ajio.services.data.Cart.GiftProducts$Quantity$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class GiftProducts$Quantity
implements Parcelable,
Serializable {
    public static final Parcelable.Creator CREATOR;
    private final String giftSku;
    private final String image;
    private final Boolean isReturnable;
    private final Double mrp;
    private final String productTitle;
    private final Integer qty;

    static {
        GiftProducts$Quantity$Creator giftProducts$Quantity$Creator = new GiftProducts$Quantity$Creator();
        CREATOR = giftProducts$Quantity$Creator;
    }

    public GiftProducts$Quantity() {
        this(null, null, null, null, null, null, 63, null);
    }

    public GiftProducts$Quantity(String string2, String string3, Double d2, String string4, Integer n3, Boolean bl2) {
        this.giftSku = string2;
        this.image = string3;
        this.mrp = d2;
        this.productTitle = string4;
        this.qty = n3;
        this.isReturnable = bl2;
    }

    public /* synthetic */ GiftProducts$Quantity(String object, String object2, Double object3, String object4, Integer object5, Boolean comparable, int n3, DefaultConstructorMarker object6) {
        int n4 = n3 & 1;
        Integer n7 = null;
        if (n4 != 0) {
            n4 = 0;
            object6 = null;
        } else {
            object6 = object;
        }
        int n8 = n3 & 2;
        Object object7 = n8 != 0 ? null : object2;
        n8 = n3 & 4;
        Object object8 = n8 != 0 ? null : object3;
        n8 = n3 & 8;
        Object object9 = n8 != 0 ? null : object4;
        n8 = n3 & 0x10;
        if (n8 == 0) {
            n7 = object5;
        }
        n8 = n3 & 0x20;
        if (n8 != 0) {
            comparable = Boolean.FALSE;
        }
        Boolean bl2 = comparable;
        object = this;
        object2 = object6;
        object3 = object7;
        object4 = object8;
        object5 = object9;
        comparable = n7;
        this((String)object6, (String)object7, (Double)object8, (String)object9, n7, bl2);
    }

    public static /* synthetic */ GiftProducts$Quantity copy$default(GiftProducts$Quantity giftProducts$Quantity, String string2, String object, Double object2, String object3, Integer number, Boolean object4, int n3, Object object5) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = giftProducts$Quantity.giftSku;
        }
        if ((n4 = n3 & 2) != 0) {
            object = giftProducts$Quantity.image;
        }
        object5 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = giftProducts$Quantity.mrp;
        }
        Double d2 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = giftProducts$Quantity.productTitle;
        }
        String string3 = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            number = giftProducts$Quantity.qty;
        }
        Integer n8 = number;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object4 = giftProducts$Quantity.isReturnable;
        }
        Boolean bl2 = object4;
        object = giftProducts$Quantity;
        object2 = string2;
        object3 = object5;
        number = d2;
        object4 = string3;
        object5 = bl2;
        return giftProducts$Quantity.copy(string2, (String)object3, d2, string3, n8, bl2);
    }

    public final String component1() {
        return this.giftSku;
    }

    public final String component2() {
        return this.image;
    }

    public final Double component3() {
        return this.mrp;
    }

    public final String component4() {
        return this.productTitle;
    }

    public final Integer component5() {
        return this.qty;
    }

    public final Boolean component6() {
        return this.isReturnable;
    }

    public final GiftProducts$Quantity copy(String string2, String string3, Double d2, String string4, Integer n3, Boolean bl2) {
        GiftProducts$Quantity giftProducts$Quantity = new GiftProducts$Quantity(string2, string3, d2, string4, n3, bl2);
        return giftProducts$Quantity;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof GiftProducts$Quantity;
        if (!bl3) {
            return false;
        }
        object = (GiftProducts$Quantity)object;
        Object object2 = this.giftSku;
        Object object3 = ((GiftProducts$Quantity)object).giftSku;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.image;
        object3 = ((GiftProducts$Quantity)object).image;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.mrp;
        object3 = ((GiftProducts$Quantity)object).mrp;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.productTitle;
        object3 = ((GiftProducts$Quantity)object).productTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.qty;
        object3 = ((GiftProducts$Quantity)object).qty;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.isReturnable;
        object = ((GiftProducts$Quantity)object).isReturnable;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getGiftSku() {
        return this.giftSku;
    }

    public final String getImage() {
        return this.image;
    }

    public final Double getMrp() {
        return this.mrp;
    }

    public final String getProductTitle() {
        return this.productTitle;
    }

    public final Integer getQty() {
        return this.qty;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.giftSku;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.image;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.mrp;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.qty;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isReturnable;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isReturnable() {
        return this.isReturnable;
    }

    public String toString() {
        CharSequence charSequence = this.giftSku;
        String string2 = this.image;
        Double d2 = this.mrp;
        String string3 = this.productTitle;
        Integer n3 = this.qty;
        Boolean bl2 = this.isReturnable;
        charSequence = og_1.a("Quantity(giftSku=", (String)charSequence, ", image=", string2, ", mrp=");
        ((StringBuilder)charSequence).append(d2);
        ((StringBuilder)charSequence).append(", productTitle=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", qty=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", isReturnable=");
        ((StringBuilder)charSequence).append(bl2);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.giftSku;
        parcel.writeString((String)object);
        object = this.image;
        parcel.writeString((String)object);
        object = this.mrp;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            double d2 = (Double)object;
            parcel.writeDouble(d2);
        }
        object = this.productTitle;
        parcel.writeString((String)object);
        object = this.qty;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            n3 = (Integer)object;
            parcel.writeInt(n3);
        }
        object = this.isReturnable;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n4, (Boolean)object);
        }
    }
}

