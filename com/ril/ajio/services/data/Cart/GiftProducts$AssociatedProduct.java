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
import com.ril.ajio.services.data.Cart.GiftProducts$AssociatedProduct$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class GiftProducts$AssociatedProduct
implements Parcelable,
Serializable {
    public static final Parcelable.Creator CREATOR;
    private final String image;
    private final String sku;

    static {
        GiftProducts$AssociatedProduct$Creator giftProducts$AssociatedProduct$Creator = new GiftProducts$AssociatedProduct$Creator();
        CREATOR = giftProducts$AssociatedProduct$Creator;
    }

    public GiftProducts$AssociatedProduct() {
        this(null, null, 3, null);
    }

    public GiftProducts$AssociatedProduct(String string2, String string3) {
        this.image = string2;
        this.sku = string3;
    }

    public /* synthetic */ GiftProducts$AssociatedProduct(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ GiftProducts$AssociatedProduct copy$default(GiftProducts$AssociatedProduct giftProducts$AssociatedProduct, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = giftProducts$AssociatedProduct.image;
        }
        if ((n3 &= 2) != 0) {
            string3 = giftProducts$AssociatedProduct.sku;
        }
        return giftProducts$AssociatedProduct.copy(string2, string3);
    }

    public final String component1() {
        return this.image;
    }

    public final String component2() {
        return this.sku;
    }

    public final GiftProducts$AssociatedProduct copy(String string2, String string3) {
        GiftProducts$AssociatedProduct giftProducts$AssociatedProduct = new GiftProducts$AssociatedProduct(string2, string3);
        return giftProducts$AssociatedProduct;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof GiftProducts$AssociatedProduct;
        if (!bl3) {
            return false;
        }
        object = (GiftProducts$AssociatedProduct)object;
        String string2 = this.image;
        String string3 = ((GiftProducts$AssociatedProduct)object).image;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.sku;
        object = ((GiftProducts$AssociatedProduct)object).sku;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getSku() {
        return this.sku;
    }

    public int hashCode() {
        int n3;
        String string2 = this.image;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.sku;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.image;
        String string3 = this.sku;
        return uc0_0.a("AssociatedProduct(image=", string2, ", sku=", string3, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.image;
        parcel.writeString(string2);
        string2 = this.sku;
        parcel.writeString(string2);
    }
}

