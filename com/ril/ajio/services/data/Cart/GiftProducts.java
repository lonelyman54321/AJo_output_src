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
import com.ril.ajio.services.data.Cart.GiftProducts$AssociatedProduct;
import com.ril.ajio.services.data.Cart.GiftProducts$Creator;
import com.ril.ajio.services.data.Cart.GiftProducts$Quantity;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class GiftProducts
implements Parcelable,
Serializable {
    public static final Parcelable.Creator CREATOR;
    private final List associatedProducts;
    private final String gwpCode;
    private final String gwpType;
    private final List quantities;

    static {
        GiftProducts$Creator giftProducts$Creator = new GiftProducts$Creator();
        CREATOR = giftProducts$Creator;
    }

    public GiftProducts() {
        this(null, null, null, null, 15, null);
    }

    public GiftProducts(List list, String string2, String string3, List list2) {
        this.associatedProducts = list;
        this.gwpCode = string2;
        this.gwpType = string3;
        this.quantities = list2;
    }

    public /* synthetic */ GiftProducts(List list, String string2, String string3, List list2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = null;
        }
        if ((n3 &= 8) != 0) {
            list2 = null;
        }
        this(list, string2, string3, list2);
    }

    public static /* synthetic */ GiftProducts copy$default(GiftProducts giftProducts, List list, String string2, String string3, List list2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = giftProducts.associatedProducts;
        }
        if ((n4 = n3 & 2) != 0) {
            string2 = giftProducts.gwpCode;
        }
        if ((n4 = n3 & 4) != 0) {
            string3 = giftProducts.gwpType;
        }
        if ((n3 &= 8) != 0) {
            list2 = giftProducts.quantities;
        }
        return giftProducts.copy(list, string2, string3, list2);
    }

    public final List component1() {
        return this.associatedProducts;
    }

    public final String component2() {
        return this.gwpCode;
    }

    public final String component3() {
        return this.gwpType;
    }

    public final List component4() {
        return this.quantities;
    }

    public final GiftProducts copy(List list, String string2, String string3, List list2) {
        GiftProducts giftProducts = new GiftProducts(list, string2, string3, list2);
        return giftProducts;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof GiftProducts;
        if (!bl3) {
            return false;
        }
        object = (GiftProducts)object;
        Object object2 = this.associatedProducts;
        Object object3 = ((GiftProducts)object).associatedProducts;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.gwpCode;
        object3 = ((GiftProducts)object).gwpCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.gwpType;
        object3 = ((GiftProducts)object).gwpType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.quantities;
        object = ((GiftProducts)object).quantities;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getAssociatedProducts() {
        return this.associatedProducts;
    }

    public final String getGwpCode() {
        return this.gwpCode;
    }

    public final String getGwpType() {
        return this.gwpType;
    }

    public final List getQuantities() {
        return this.quantities;
    }

    public int hashCode() {
        int n3;
        int n4;
        List list = this.associatedProducts;
        int n7 = 0;
        if (list == null) {
            n4 = 0;
            list = null;
        } else {
            n4 = ((Object)list).hashCode();
        }
        n4 *= 31;
        Object object = this.gwpCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.gwpType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.quantities;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        List list = this.associatedProducts;
        String string2 = this.gwpCode;
        String string3 = this.gwpType;
        List list2 = this.quantities;
        StringBuilder stringBuilder = new StringBuilder("GiftProducts(associatedProducts=");
        stringBuilder.append(list);
        stringBuilder.append(", gwpCode=");
        stringBuilder.append(string2);
        stringBuilder.append(", gwpType=");
        stringBuilder.append(string3);
        stringBuilder.append(", quantities=");
        stringBuilder.append(list2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.associatedProducts;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            boolean bl2;
            object = oz0_2.a(parcel, (List)object, n4);
            while (bl2 = object.hasNext()) {
                GiftProducts$AssociatedProduct giftProducts$AssociatedProduct = (GiftProducts$AssociatedProduct)object.next();
                giftProducts$AssociatedProduct.writeToParcel(parcel, n3);
            }
        }
        object = this.gwpCode;
        parcel.writeString((String)object);
        object = this.gwpType;
        parcel.writeString((String)object);
        object = this.quantities;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            object = oz0_2.a(parcel, (List)object, n4);
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                GiftProducts$Quantity giftProducts$Quantity = (GiftProducts$Quantity)object.next();
                giftProducts$Quantity.writeToParcel(parcel, n3);
            }
        }
    }
}

