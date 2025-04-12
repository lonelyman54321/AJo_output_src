/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.Facet$Companion;
import com.ril.ajio.services.data.Facet$Creator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Facet
implements Comparable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    public static final Facet$Companion Companion;
    private HashMap categoryFacetValues;
    private HashMap categoryGenderItemCount;
    private String code;
    private boolean commonFilter;
    private boolean hideIfCurated;
    private String maxPrice;
    private String minPrice;
    private String name;
    private String priceRangeValue;
    private ArrayList values;

    static {
        Object object = new Facet$Companion(null);
        Companion = object;
        object = new Facet$Creator();
        CREATOR = object;
    }

    public Facet() {
        this(false, false, null, null, null, null, null, null, null, null, 1023, null);
    }

    public Facet(boolean bl2, boolean bl3, String string2, String string3, String string4, ArrayList arrayList, String string5, String string6, HashMap hashMap, HashMap hashMap2) {
        Intrinsics.checkNotNullParameter(hashMap, "categoryFacetValues");
        Intrinsics.checkNotNullParameter(hashMap2, "categoryGenderItemCount");
        this.commonFilter = bl2;
        this.hideIfCurated = bl3;
        this.maxPrice = string2;
        this.minPrice = string3;
        this.priceRangeValue = string4;
        this.values = arrayList;
        this.code = string5;
        this.name = string6;
        this.categoryFacetValues = hashMap;
        this.categoryGenderItemCount = hashMap2;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ Facet(boolean bl2, boolean bl3, String string2, String string3, String string4, ArrayList object, String object2, String string5, HashMap object3, HashMap hashMap, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        void var14_17;
        HashMap hashMap2;
        Object object4;
        Object object5;
        String string6;
        String string7;
        String string8;
        int n4 = n3;
        int bl4 = n3 & 1;
        boolean bl5 = false;
        if (bl4 != 0) {
            boolean bl6 = false;
        } else {
            boolean bl7 = bl2;
        }
        int n7 = n4 & 2;
        if (n7 == 0) {
            bl5 = bl3;
        }
        n7 = n4 & 4;
        String string9 = null;
        if (n7 != 0) {
            n7 = 0;
            string8 = null;
        } else {
            string8 = string2;
        }
        int n8 = n4 & 8;
        if (n8 != 0) {
            n8 = 0;
            string7 = null;
        } else {
            string7 = string3;
        }
        int n10 = n4 & 0x10;
        if (n10 != 0) {
            n10 = 0;
            string6 = null;
        } else {
            string6 = string4;
        }
        int n14 = n4 & 0x20;
        if (n14 != 0) {
            n14 = 0;
            object5 = null;
        } else {
            object5 = object;
        }
        int n15 = n4 & 0x40;
        if (n15 != 0) {
            n15 = 0;
            object4 = null;
        } else {
            object4 = object2;
        }
        int n16 = n4 & 0x80;
        if (n16 == 0) {
            string9 = string5;
        }
        n16 = n4 & 0x100;
        Object object6 = n16 != 0 ? new Object() : object3;
        if ((n4 &= 0x200) != 0) {
        } else {
            hashMap2 = hashMap;
        }
        bl3 = var14_17;
        string3 = string8;
        string4 = string7;
        object = string6;
        object2 = object5;
        string5 = object4;
        object3 = string9;
        hashMap = object6;
        this((boolean)var14_17, bl5, string8, string7, string6, (ArrayList)object5, (String)object4, string9, (HashMap)object6, hashMap2);
    }

    public int compareTo(Facet facet) {
        Intrinsics.checkNotNullParameter(facet, "another");
        boolean bl2 = facet.commonFilter;
        boolean bl3 = this.commonFilter;
        return Boolean.compare(bl2, bl3);
    }

    public int describeContents() {
        return 0;
    }

    public final HashMap getCategoryFacetValues() {
        return this.categoryFacetValues;
    }

    public final HashMap getCategoryGenderItemCount() {
        return this.categoryGenderItemCount;
    }

    public final String getCode() {
        return this.code;
    }

    public final boolean getCommonFilter() {
        return this.commonFilter;
    }

    public final boolean getHideIfCurated() {
        return this.hideIfCurated;
    }

    public final String getMaxPrice() {
        return this.maxPrice;
    }

    public final String getMinPrice() {
        return this.minPrice;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPriceRangeValue() {
        return this.priceRangeValue;
    }

    public final ArrayList getValues() {
        return this.values;
    }

    public final void setCategoryFacetValues(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.categoryFacetValues = hashMap;
    }

    public final void setCategoryGenderItemCount(HashMap hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<set-?>");
        this.categoryGenderItemCount = hashMap;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setCommonFilter(boolean bl2) {
        this.commonFilter = bl2;
    }

    public final void setHideIfCurated(boolean bl2) {
        this.hideIfCurated = bl2;
    }

    public final void setMaxPrice(String string2) {
        this.maxPrice = string2;
    }

    public final void setMinPrice(String string2) {
        this.minPrice = string2;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setPriceRangeValue(String string2) {
        this.priceRangeValue = string2;
    }

    public final void setValues(ArrayList arrayList) {
        this.values = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4;
        Object object;
        int n7;
        Intrinsics.checkNotNullParameter(parcel, "dest");
        int n74 = this.commonFilter;
        parcel.writeInt(n74);
        int n8 = this.hideIfCurated;
        parcel.writeInt(n8);
        Object object2 = this.maxPrice;
        parcel.writeString((String)object2);
        object2 = this.minPrice;
        parcel.writeString((String)object2);
        object2 = this.priceRangeValue;
        parcel.writeString((String)object2);
        object2 = this.values;
        if (object2 == null) {
            boolean bl2 = false;
            object2 = null;
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            n7 = ((ArrayList)object2).size();
            parcel.writeInt(n7);
            object2 = ((ArrayList)object2).iterator();
            while ((n7 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                object = (Parcelable)object2.next();
                parcel.writeParcelable((Parcelable)object, n3);
            }
        }
        object2 = this.code;
        parcel.writeString(object2);
        object2 = this.name;
        parcel.writeString((String)object2);
        object2 = this.categoryFacetValues;
        n7 = ((HashMap)object2).size();
        parcel.writeInt(n7);
        object2 = ((HashMap)object2).entrySet().iterator();
        while ((n7 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object = object2.next();
            String string2 = (String)object.getKey();
            parcel.writeString(string2);
            object = (ArrayList)object.getValue();
            int n10 = ((ArrayList)object).size();
            parcel.writeInt(n10);
            object = ((ArrayList)object).iterator();
            while ((n10 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                string2 = (Parcelable)object.next();
                parcel.writeParcelable((Parcelable)string2, n3);
            }
        }
        Object object3 = this.categoryGenderItemCount;
        int n14 = ((HashMap)object3).size();
        parcel.writeInt(n14);
        object3 = ((HashMap)object3).entrySet().iterator();
        while ((n4 = object3.hasNext()) != 0) {
            object2 = (Map.Entry)object3.next();
            object = (String)object2.getKey();
            parcel.writeString((String)object);
            object2 = (Number)object2.getValue();
            n4 = ((Number)object2).intValue();
            parcel.writeInt(n4);
        }
    }
}

