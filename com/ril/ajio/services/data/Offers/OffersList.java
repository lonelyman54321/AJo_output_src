/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.Offers;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Offers.OffersList$Creator;
import com.ril.ajio.services.data.Offers.VoucherOfferItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class OffersList
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private List allVouchers;

    static {
        OffersList$Creator offersList$Creator = new OffersList$Creator();
        CREATOR = offersList$Creator;
    }

    public OffersList(List list) {
        this.allVouchers = list;
    }

    public static /* synthetic */ OffersList copy$default(OffersList offersList, List list, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            list = offersList.allVouchers;
        }
        return offersList.copy(list);
    }

    public final List component1() {
        return this.allVouchers;
    }

    public final OffersList copy(List list) {
        OffersList offersList = new OffersList(list);
        return offersList;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof OffersList;
        if (!bl3) {
            return false;
        }
        object = (OffersList)object;
        List list = this.allVouchers;
        object = ((OffersList)object).allVouchers;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getAllVouchers() {
        return this.allVouchers;
    }

    public int hashCode() {
        int n3;
        List list = this.allVouchers;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        return n3;
    }

    public final void setAllVouchers(List list) {
        this.allVouchers = list;
    }

    public String toString() {
        List list = this.allVouchers;
        StringBuilder stringBuilder = new StringBuilder("OffersList(allVouchers=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.allVouchers;
        if (object == null) {
            n3 = 0;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            object = oz0_2.a(parcel, (List)object, n4);
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                VoucherOfferItem voucherOfferItem = (VoucherOfferItem)object.next();
                voucherOfferItem.writeToParcel(parcel, n3);
            }
        }
    }
}

