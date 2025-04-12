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
import com.ril.ajio.services.data.freebies.FreebieGift$Creator;
import com.ril.ajio.services.data.freebies.FreebieProductDetail;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class FreebieGift
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final String description;
    private final String detailsUrl;
    private final List productDetails;
    private final String termsLink;

    static {
        FreebieGift$Creator freebieGift$Creator = new FreebieGift$Creator();
        CREATOR = freebieGift$Creator;
    }

    public FreebieGift(String string2, String string3, String string4, List list) {
        this.description = string2;
        this.detailsUrl = string3;
        this.termsLink = string4;
        this.productDetails = list;
    }

    public static /* synthetic */ FreebieGift copy$default(FreebieGift freebieGift, String string2, String string3, String string4, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = freebieGift.description;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = freebieGift.detailsUrl;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = freebieGift.termsLink;
        }
        if ((n3 &= 8) != 0) {
            list = freebieGift.productDetails;
        }
        return freebieGift.copy(string2, string3, string4, list);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.detailsUrl;
    }

    public final String component3() {
        return this.termsLink;
    }

    public final List component4() {
        return this.productDetails;
    }

    public final FreebieGift copy(String string2, String string3, String string4, List list) {
        FreebieGift freebieGift = new FreebieGift(string2, string3, string4, list);
        return freebieGift;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FreebieGift;
        if (!bl3) {
            return false;
        }
        object = (FreebieGift)object;
        Object object2 = this.description;
        String string2 = ((FreebieGift)object).description;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.detailsUrl;
        string2 = ((FreebieGift)object).detailsUrl;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.termsLink;
        string2 = ((FreebieGift)object).termsLink;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.productDetails;
        object = ((FreebieGift)object).productDetails;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDetailsUrl() {
        return this.detailsUrl;
    }

    public final List getProductDetails() {
        return this.productDetails;
    }

    public final String getTermsLink() {
        return this.termsLink;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.description;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.detailsUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.termsLink;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.productDetails;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.description;
        String string2 = this.detailsUrl;
        String string3 = this.termsLink;
        List list = this.productDetails;
        charSequence = og_1.a("FreebieGift(description=", (String)charSequence, ", detailsUrl=", string2, ", termsLink=");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append(", productDetails=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.description;
        parcel.writeString((String)object);
        object = this.detailsUrl;
        parcel.writeString((String)object);
        object = this.termsLink;
        parcel.writeString((String)object);
        object = this.productDetails;
        if (object == null) {
            n3 = 0;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            object = oz0_2.a(parcel, (List)object, n4);
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                FreebieProductDetail freebieProductDetail = (FreebieProductDetail)object.next();
                freebieProductDetail.writeToParcel(parcel, n3);
            }
        }
    }
}

