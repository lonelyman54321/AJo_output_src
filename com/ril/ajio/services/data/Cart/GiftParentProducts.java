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
import com.ril.ajio.services.data.Cart.GiftParentProducts$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class GiftParentProducts
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String code;
    private final String imageUrl;

    static {
        GiftParentProducts$Creator giftParentProducts$Creator = new GiftParentProducts$Creator();
        CREATOR = giftParentProducts$Creator;
    }

    public GiftParentProducts(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "code");
        Intrinsics.checkNotNullParameter(string3, "imageUrl");
        this.code = string2;
        this.imageUrl = string3;
    }

    public static /* synthetic */ GiftParentProducts copy$default(GiftParentProducts giftParentProducts, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = giftParentProducts.code;
        }
        if ((n3 &= 2) != 0) {
            string3 = giftParentProducts.imageUrl;
        }
        return giftParentProducts.copy(string2, string3);
    }

    public final String component1() {
        return this.code;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final GiftParentProducts copy(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "code");
        Intrinsics.checkNotNullParameter(string3, "imageUrl");
        GiftParentProducts giftParentProducts = new GiftParentProducts(string2, string3);
        return giftParentProducts;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof GiftParentProducts;
        if (!bl3) {
            return false;
        }
        object = (GiftParentProducts)object;
        String string2 = this.code;
        String string3 = ((GiftParentProducts)object).code;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.imageUrl;
        object = ((GiftParentProducts)object).imageUrl;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        int n3 = this.code.hashCode() * 31;
        return this.imageUrl.hashCode() + n3;
    }

    public String toString() {
        String string2 = this.code;
        String string3 = this.imageUrl;
        return uc0_0.a("GiftParentProducts(code=", string2, ", imageUrl=", string3, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.code;
        parcel.writeString(string2);
        string2 = this.imageUrl;
        parcel.writeString(string2);
    }
}

