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
import com.ril.ajio.services.data.ratings.AttributeRatings$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AttributeRatings
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String percentageRating;
    private String text;

    static {
        AttributeRatings$Creator attributeRatings$Creator = new AttributeRatings$Creator();
        CREATOR = attributeRatings$Creator;
    }

    public AttributeRatings() {
        this(null, null, 3, null);
    }

    public AttributeRatings(String string2, String string3) {
        this.text = string2;
        this.percentageRating = string3;
    }

    public /* synthetic */ AttributeRatings(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ AttributeRatings copy$default(AttributeRatings attributeRatings, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = attributeRatings.text;
        }
        if ((n3 &= 2) != 0) {
            string3 = attributeRatings.percentageRating;
        }
        return attributeRatings.copy(string2, string3);
    }

    public final String component1() {
        return this.text;
    }

    public final String component2() {
        return this.percentageRating;
    }

    public final AttributeRatings copy(String string2, String string3) {
        AttributeRatings attributeRatings = new AttributeRatings(string2, string3);
        return attributeRatings;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AttributeRatings;
        if (!bl3) {
            return false;
        }
        object = (AttributeRatings)object;
        String string2 = this.text;
        String string3 = ((AttributeRatings)object).text;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.percentageRating;
        object = ((AttributeRatings)object).percentageRating;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getPercentageRating() {
        return this.percentageRating;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int n3;
        String string2 = this.text;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.percentageRating;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setPercentageRating(String string2) {
        this.percentageRating = string2;
    }

    public final void setText(String string2) {
        this.text = string2;
    }

    public String toString() {
        String string2 = this.text;
        String string3 = this.percentageRating;
        return uc0_0.a("AttributeRatings(text=", string2, ", percentageRating=", string3, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.text;
        parcel.writeString(string2);
        string2 = this.percentageRating;
        parcel.writeString(string2);
    }
}

