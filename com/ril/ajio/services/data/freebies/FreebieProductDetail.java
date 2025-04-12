/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.freebies;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.freebies.FreebieProductDetail$Creator;
import kotlin.jvm.internal.Intrinsics;

public final class FreebieProductDetail
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String brandName;
    private final String imageUrl;
    private final boolean isReturnable;
    private final double mrp;
    private final String name;
    private final String productId;
    private final long quantity;
    private final String selection2AttributeValue;
    private final String uom;

    static {
        FreebieProductDetail$Creator freebieProductDetail$Creator = new FreebieProductDetail$Creator();
        CREATOR = freebieProductDetail$Creator;
    }

    public FreebieProductDetail(String string2, double d2, long l2, boolean bl2, String string3, String string4, String string5, String string6, String string7) {
        Intrinsics.checkNotNullParameter(string2, "productId");
        Intrinsics.checkNotNullParameter(string3, "imageUrl");
        Intrinsics.checkNotNullParameter(string4, "brandName");
        Intrinsics.checkNotNullParameter(string5, "name");
        Intrinsics.checkNotNullParameter(string6, "selection2AttributeValue");
        Intrinsics.checkNotNullParameter(string7, "uom");
        this.productId = string2;
        this.mrp = d2;
        this.quantity = l2;
        this.isReturnable = bl2;
        this.imageUrl = string3;
        this.brandName = string4;
        this.name = string5;
        this.selection2AttributeValue = string6;
        this.uom = string7;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ FreebieProductDetail copy$default(FreebieProductDetail freebieProductDetail, String string2, double d2, long l2, boolean bl2, String string3, String string4, String string5, String string6, String string7, int n3, Object object) {
        void var24_23;
        FreebieProductDetail freebieProductDetail2 = freebieProductDetail;
        int n4 = n3;
        int n7 = n3 & 1;
        String string8 = n7 != 0 ? freebieProductDetail.productId : string2;
        int n8 = n4 & 2;
        double d5 = n8 != 0 ? freebieProductDetail2.mrp : d2;
        int n10 = n4 & 4;
        long l3 = n10 != 0 ? freebieProductDetail2.quantity : l2;
        int bl3 = n4 & 8;
        if (bl3 != 0) {
            boolean bl4 = freebieProductDetail2.isReturnable;
        } else {
            boolean bl5 = bl2;
        }
        int n14 = n4 & 0x10;
        String string9 = n14 != 0 ? freebieProductDetail2.imageUrl : string3;
        int n15 = n4 & 0x20;
        String string10 = n15 != 0 ? freebieProductDetail2.brandName : string4;
        int n16 = n4 & 0x40;
        String string11 = n16 != 0 ? freebieProductDetail2.name : string5;
        int n17 = n4 & 0x80;
        String string12 = n17 != 0 ? freebieProductDetail2.selection2AttributeValue : string6;
        String string13 = (n4 &= 0x100) != 0 ? freebieProductDetail2.uom : string7;
        string2 = string8;
        d2 = d5;
        l2 = l3;
        bl2 = var24_23;
        string3 = string9;
        string4 = string10;
        string5 = string11;
        string6 = string12;
        string7 = string13;
        return freebieProductDetail.copy(string8, d5, l3, (boolean)var24_23, string9, string10, string11, string12, string13);
    }

    public final String component1() {
        return this.productId;
    }

    public final double component2() {
        return this.mrp;
    }

    public final long component3() {
        return this.quantity;
    }

    public final boolean component4() {
        return this.isReturnable;
    }

    public final String component5() {
        return this.imageUrl;
    }

    public final String component6() {
        return this.brandName;
    }

    public final String component7() {
        return this.name;
    }

    public final String component8() {
        return this.selection2AttributeValue;
    }

    public final String component9() {
        return this.uom;
    }

    public final FreebieProductDetail copy(String string2, double d2, long l2, boolean bl2, String string3, String string4, String string5, String string6, String string7) {
        Intrinsics.checkNotNullParameter(string2, "productId");
        Intrinsics.checkNotNullParameter(string3, "imageUrl");
        Intrinsics.checkNotNullParameter(string4, "brandName");
        Intrinsics.checkNotNullParameter(string5, "name");
        Intrinsics.checkNotNullParameter(string6, "selection2AttributeValue");
        Intrinsics.checkNotNullParameter(string7, "uom");
        FreebieProductDetail freebieProductDetail = new FreebieProductDetail(string2, d2, l2, bl2, string3, string4, string5, string6, string7);
        return freebieProductDetail;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof FreebieProductDetail;
        if (n3 == 0) {
            return false;
        }
        object = (FreebieProductDetail)object;
        String string2 = this.productId;
        String string3 = ((FreebieProductDetail)object).productId;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        double d2 = this.mrp;
        double d5 = ((FreebieProductDetail)object).mrp;
        n3 = Double.compare(d2, d5);
        if (n3 != 0) {
            return false;
        }
        long l2 = this.quantity;
        long l3 = ((FreebieProductDetail)object).quantity;
        long l4 = l2 - l3;
        n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        if (n3 != 0) {
            return false;
        }
        n3 = (int)(this.isReturnable ? 1 : 0);
        int n4 = ((FreebieProductDetail)object).isReturnable;
        if (n3 != n4) {
            return false;
        }
        string2 = this.imageUrl;
        string3 = ((FreebieProductDetail)object).imageUrl;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.brandName;
        string3 = ((FreebieProductDetail)object).brandName;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.name;
        string3 = ((FreebieProductDetail)object).name;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.selection2AttributeValue;
        string3 = ((FreebieProductDetail)object).selection2AttributeValue;
        n3 = (int)(Intrinsics.areEqual(string2, string3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        string2 = this.uom;
        object = ((FreebieProductDetail)object).uom;
        boolean bl3 = Intrinsics.areEqual(string2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final double getMrp() {
        return this.mrp;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final long getQuantity() {
        return this.quantity;
    }

    public final String getSelection2AttributeValue() {
        return this.selection2AttributeValue;
    }

    public final String getUom() {
        return this.uom;
    }

    public int hashCode() {
        String string2 = this.productId;
        int n3 = string2.hashCode();
        int n4 = 31;
        n3 *= 31;
        double d2 = this.mrp;
        long l2 = Double.doubleToLongBits(d2);
        int n7 = 32;
        long l3 = l2 >>> n7;
        int n8 = (int)(l2 ^ l3);
        n3 = (n3 + n8) * 31;
        l2 = this.quantity;
        long l4 = l2 >>> n7;
        n8 = (int)(l2 ^= l4);
        n3 = (n3 + n8) * 31;
        int n10 = this.isReturnable;
        n10 = n10 != 0 ? 1231 : 1237;
        n3 = (n3 + n10) * 31;
        String string3 = this.imageUrl;
        n3 = zy_2.b(n3, n4, string3);
        string3 = this.brandName;
        n3 = zy_2.b(n3, n4, string3);
        string3 = this.name;
        n3 = zy_2.b(n3, n4, string3);
        string3 = this.selection2AttributeValue;
        n3 = zy_2.b(n3, n4, string3);
        return this.uom.hashCode() + n3;
    }

    public final boolean isReturnable() {
        return this.isReturnable;
    }

    public String toString() {
        String string2 = this.productId;
        double d2 = this.mrp;
        long l2 = this.quantity;
        boolean bl2 = this.isReturnable;
        String string3 = this.imageUrl;
        String string4 = this.brandName;
        String string5 = this.name;
        String string6 = this.selection2AttributeValue;
        String string7 = this.uom;
        StringBuilder stringBuilder = new StringBuilder("FreebieProductDetail(productId=");
        stringBuilder.append(string2);
        stringBuilder.append(", mrp=");
        stringBuilder.append(d2);
        fn0_2.b(stringBuilder, ", quantity=", l2, ", isReturnable=");
        stringBuilder.append(bl2);
        stringBuilder.append(", imageUrl=");
        stringBuilder.append(string3);
        stringBuilder.append(", brandName=");
        X50.a(stringBuilder, string4, ", name=", string5, ", selection2AttributeValue=");
        return ko_0.a(stringBuilder, string6, ", uom=", string7, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.productId;
        parcel.writeString(string2);
        double d2 = this.mrp;
        parcel.writeDouble(d2);
        long l2 = this.quantity;
        parcel.writeLong(l2);
        n3 = (int)(this.isReturnable ? 1 : 0);
        parcel.writeInt(n3);
        string2 = this.imageUrl;
        parcel.writeString(string2);
        string2 = this.brandName;
        parcel.writeString(string2);
        string2 = this.name;
        parcel.writeString(string2);
        string2 = this.selection2AttributeValue;
        parcel.writeString(string2);
        string2 = this.uom;
        parcel.writeString(string2);
    }
}

