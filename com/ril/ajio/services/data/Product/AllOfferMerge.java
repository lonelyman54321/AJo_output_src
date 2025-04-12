/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Product;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Offers.BankOfferItem;
import com.ril.ajio.services.data.Product.AllOfferMerge$Creator;
import com.ril.ajio.services.data.Product.ProductPromotion;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class AllOfferMerge
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private final ArrayList bankOffers;
    private final ArrayList couponList;

    static {
        AllOfferMerge$Creator allOfferMerge$Creator = new AllOfferMerge$Creator();
        CREATOR = allOfferMerge$Creator;
    }

    public AllOfferMerge(ArrayList arrayList, ArrayList arrayList2) {
        this.couponList = arrayList;
        this.bankOffers = arrayList2;
    }

    public static /* synthetic */ AllOfferMerge copy$default(AllOfferMerge allOfferMerge, ArrayList arrayList, ArrayList arrayList2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            arrayList = allOfferMerge.couponList;
        }
        if ((n3 &= 2) != 0) {
            arrayList2 = allOfferMerge.bankOffers;
        }
        return allOfferMerge.copy(arrayList, arrayList2);
    }

    public final ArrayList component1() {
        return this.couponList;
    }

    public final ArrayList component2() {
        return this.bankOffers;
    }

    public final AllOfferMerge copy(ArrayList arrayList, ArrayList arrayList2) {
        AllOfferMerge allOfferMerge = new AllOfferMerge(arrayList, arrayList2);
        return allOfferMerge;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AllOfferMerge;
        if (!bl3) {
            return false;
        }
        object = (AllOfferMerge)object;
        ArrayList arrayList = this.couponList;
        ArrayList arrayList2 = ((AllOfferMerge)object).couponList;
        bl3 = Intrinsics.areEqual(arrayList, arrayList2);
        if (!bl3) {
            return false;
        }
        arrayList = this.bankOffers;
        object = ((AllOfferMerge)object).bankOffers;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getBankOffers() {
        return this.bankOffers;
    }

    public final ArrayList getCouponList() {
        return this.couponList;
    }

    public int hashCode() {
        int n3;
        ArrayList arrayList = this.couponList;
        int n4 = 0;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.hashCode();
        }
        n3 *= 31;
        ArrayList arrayList2 = this.bankOffers;
        if (arrayList2 != null) {
            n4 = arrayList2.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        ArrayList arrayList = this.couponList;
        ArrayList arrayList2 = this.bankOffers;
        StringBuilder stringBuilder = new StringBuilder("AllOfferMerge(couponList=");
        stringBuilder.append(arrayList);
        stringBuilder.append(", bankOffers=");
        stringBuilder.append(arrayList2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Iterator iterator = this.couponList;
        int n4 = 1;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            int n7 = ((ArrayList)((Object)iterator)).size();
            parcel.writeInt(n7);
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while ((n7 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                ProductPromotion productPromotion = (ProductPromotion)iterator.next();
                productPromotion.writeToParcel(parcel, n3);
            }
        }
        iterator = this.bankOffers;
        if (iterator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            n4 = ((ArrayList)((Object)iterator)).size();
            parcel.writeInt(n4);
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                BankOfferItem bankOfferItem = (BankOfferItem)iterator.next();
                bankOfferItem.writeToParcel(parcel, n3);
            }
        }
    }
}

