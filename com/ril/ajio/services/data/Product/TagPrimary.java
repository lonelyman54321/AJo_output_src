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
import com.ril.ajio.services.data.Product.TagPrimary$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class TagPrimary
implements Parcelable,
Serializable {
    public static final Parcelable.Creator CREATOR;
    private final String name;
    private final String value;

    static {
        TagPrimary$Creator tagPrimary$Creator = new TagPrimary$Creator();
        CREATOR = tagPrimary$Creator;
    }

    public TagPrimary(String string2, String string3) {
        this.name = string2;
        this.value = string3;
    }

    public static /* synthetic */ TagPrimary copy$default(TagPrimary tagPrimary, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = tagPrimary.name;
        }
        if ((n3 &= 2) != 0) {
            string3 = tagPrimary.value;
        }
        return tagPrimary.copy(string2, string3);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.value;
    }

    public final TagPrimary copy(String string2, String string3) {
        TagPrimary tagPrimary = new TagPrimary(string2, string3);
        return tagPrimary;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof TagPrimary;
        if (!bl3) {
            return false;
        }
        object = (TagPrimary)object;
        String string2 = this.name;
        String string3 = ((TagPrimary)object).name;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.value;
        object = ((TagPrimary)object).value;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3;
        String string2 = this.name;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.value;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.name;
        String string3 = this.value;
        return uc0_0.a("TagPrimary(name=", string2, ", value=", string3, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        String string2 = this.name;
        parcel.writeString(string2);
        string2 = this.value;
        parcel.writeString(string2);
    }
}

