/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.ratings;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.ratings.AttributeRatings;
import com.ril.ajio.services.data.ratings.SubRatings$Creator;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SubRatings
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private ArrayList attributeRatings;
    private String productAttribute;

    static {
        SubRatings$Creator subRatings$Creator = new SubRatings$Creator();
        CREATOR = subRatings$Creator;
    }

    public SubRatings() {
        this(null, null, 3, null);
    }

    public SubRatings(String string2, ArrayList arrayList) {
        this.productAttribute = string2;
        this.attributeRatings = arrayList;
    }

    public /* synthetic */ SubRatings(String string2, ArrayList arrayList, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            arrayList = null;
        }
        this(string2, arrayList);
    }

    public static /* synthetic */ SubRatings copy$default(SubRatings subRatings, String string2, ArrayList arrayList, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = subRatings.productAttribute;
        }
        if ((n3 &= 2) != 0) {
            arrayList = subRatings.attributeRatings;
        }
        return subRatings.copy(string2, arrayList);
    }

    public final String component1() {
        return this.productAttribute;
    }

    public final ArrayList component2() {
        return this.attributeRatings;
    }

    public final SubRatings copy(String string2, ArrayList arrayList) {
        SubRatings subRatings = new SubRatings(string2, arrayList);
        return subRatings;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof SubRatings;
        if (!bl3) {
            return false;
        }
        object = (SubRatings)object;
        Object object2 = this.productAttribute;
        String string2 = ((SubRatings)object).productAttribute;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.attributeRatings;
        object = ((SubRatings)object).attributeRatings;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getAttributeRatings() {
        return this.attributeRatings;
    }

    public final String getProductAttribute() {
        return this.productAttribute;
    }

    public int hashCode() {
        int n3;
        String string2 = this.productAttribute;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        ArrayList arrayList = this.attributeRatings;
        if (arrayList != null) {
            n4 = arrayList.hashCode();
        }
        return n3 + n4;
    }

    public final void setAttributeRatings(ArrayList arrayList) {
        this.attributeRatings = arrayList;
    }

    public final void setProductAttribute(String string2) {
        this.productAttribute = string2;
    }

    public String toString() {
        String string2 = this.productAttribute;
        ArrayList arrayList = this.attributeRatings;
        StringBuilder stringBuilder = new StringBuilder("SubRatings(productAttribute=");
        stringBuilder.append(string2);
        stringBuilder.append(", attributeRatings=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Iterator iterator = this.productAttribute;
        parcel.writeString((String)((Object)iterator));
        iterator = this.attributeRatings;
        if (iterator == null) {
            n3 = 0;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            int n4 = ((ArrayList)((Object)iterator)).size();
            parcel.writeInt(n4);
            iterator = ((ArrayList)((Object)iterator)).iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                AttributeRatings attributeRatings = (AttributeRatings)iterator.next();
                attributeRatings.writeToParcel(parcel, n3);
            }
        }
    }
}

