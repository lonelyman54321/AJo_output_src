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
import com.ril.ajio.services.data.Product.CategoryTags$Creator;
import com.ril.ajio.services.data.Product.TagPrimary;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class CategoryTags
implements Parcelable,
Serializable {
    public static final Parcelable.Creator CREATOR;
    private final String category;
    private final TagPrimary primary;

    static {
        CategoryTags$Creator categoryTags$Creator = new CategoryTags$Creator();
        CREATOR = categoryTags$Creator;
    }

    public CategoryTags(String string2, TagPrimary tagPrimary) {
        this.category = string2;
        this.primary = tagPrimary;
    }

    public static /* synthetic */ CategoryTags copy$default(CategoryTags categoryTags, String string2, TagPrimary tagPrimary, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = categoryTags.category;
        }
        if ((n3 &= 2) != 0) {
            tagPrimary = categoryTags.primary;
        }
        return categoryTags.copy(string2, tagPrimary);
    }

    public final String component1() {
        return this.category;
    }

    public final TagPrimary component2() {
        return this.primary;
    }

    public final CategoryTags copy(String string2, TagPrimary tagPrimary) {
        CategoryTags categoryTags = new CategoryTags(string2, tagPrimary);
        return categoryTags;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CategoryTags;
        if (!bl3) {
            return false;
        }
        object = (CategoryTags)object;
        Object object2 = this.category;
        String string2 = ((CategoryTags)object).category;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.primary;
        object = ((CategoryTags)object).primary;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCategory() {
        return this.category;
    }

    public final TagPrimary getPrimary() {
        return this.primary;
    }

    public int hashCode() {
        int n3;
        String string2 = this.category;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        TagPrimary tagPrimary = this.primary;
        if (tagPrimary != null) {
            n4 = tagPrimary.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.category;
        TagPrimary tagPrimary = this.primary;
        StringBuilder stringBuilder = new StringBuilder("CategoryTags(category=");
        stringBuilder.append(string2);
        stringBuilder.append(", primary=");
        stringBuilder.append(tagPrimary);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.category;
        parcel.writeString((String)object);
        object = this.primary;
        if (object == null) {
            n3 = 0;
            parcel.writeInt(0);
        } else {
            int n4 = 1;
            parcel.writeInt(n4);
            ((TagPrimary)object).writeToParcel(parcel, n3);
        }
    }
}

