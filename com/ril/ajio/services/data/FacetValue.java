/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package com.ril.ajio.services.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.ril.ajio.services.data.Facet;
import com.ril.ajio.services.data.FacetValue$Creator;
import com.ril.ajio.services.query.FacetQuery;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public class FacetValue
implements Parcelable,
Comparable {
    public static final Parcelable.Creator CREATOR;
    private String code;
    private int count;
    private String displayName;
    private Facet facet;
    private String facetCode;
    private boolean isDeliveryFacetFromApi;
    private boolean isEnabled;
    private boolean isQuickFilter;
    private boolean isTitleFacet;
    private String name;
    private FacetQuery query;
    private boolean selected;
    private String value;

    static {
        FacetValue$Creator facetValue$Creator = new FacetValue$Creator();
        CREATOR = facetValue$Creator;
    }

    public FacetValue() {
        this(null, null, false, false, 0, null, null, null, null, null, false, false, false, 8191, null);
    }

    public FacetValue(Facet facet, String string2, boolean bl2, boolean bl3, int n3, String string3, String string4, String string5, String string6, FacetQuery facetQuery, boolean bl4, boolean bl5, boolean bl6) {
        Intrinsics.checkNotNullParameter(string6, "displayName");
        this.facet = facet;
        this.facetCode = string2;
        this.isTitleFacet = bl2;
        this.selected = bl3;
        this.count = n3;
        this.code = string3;
        this.name = string4;
        this.value = string5;
        this.displayName = string6;
        this.query = facetQuery;
        this.isQuickFilter = bl4;
        this.isDeliveryFacetFromApi = bl5;
        this.isEnabled = bl6;
    }

    /*
     * WARNING - void declaration
     */
    public /* synthetic */ FacetValue(Facet parcelable, String object, boolean bl2, boolean bl3, int n3, String string2, String string3, String string4, String string5, FacetQuery object2, boolean bl4, boolean bl5, boolean bl6, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        void var35_50;
        void var34_46;
        void var24_32;
        void var22_27;
        void var13_14;
        void var12_13;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        Object object3;
        Parcelable parcelable2;
        void var14_15;
        int n7 = var14_15;
        int n8 = var14_15 & 1;
        FacetQuery facetQuery = null;
        if (n8 != 0) {
            n8 = 0;
            parcelable2 = null;
        } else {
            parcelable2 = parcelable;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            object3 = null;
        } else {
            object3 = object;
        }
        int n14 = n7 & 4;
        boolean bl7 = false;
        if (n14 != 0) {
            boolean bl8 = false;
        } else {
            boolean bl9 = bl2;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            boolean bl10 = false;
        } else {
            boolean bl11 = bl3;
        }
        int n16 = n7 & 0x10;
        n16 = n16 != 0 ? 0 : n3;
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            string12 = null;
        } else {
            void var6_7;
            string12 = var6_7;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            string11 = null;
        } else {
            string11 = string10;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            string9 = null;
        } else {
            string9 = string8;
        }
        int n20 = n7 & 0x100;
        String string13 = n20 != 0 ? "" : string7;
        int n21 = n7 & 0x200;
        if (n21 == 0) {
            facetQuery = string6;
        }
        int n22 = n7 & 0x400;
        if (n22 != 0) {
            boolean bl12 = false;
        } else {
            void var11_12;
            void var34_45 = var11_12;
        }
        int n24 = n7 & 0x800;
        if (n24 != 0) {
            boolean bl13 = true;
        } else {
            void var35_49 = var12_13;
        }
        if ((n7 &= 0x1000) == 0) {
            bl7 = var13_14;
        }
        parcelable = this;
        object = parcelable2;
        bl3 = var22_27;
        void var5_6 = var24_32;
        string10 = string12;
        string8 = string11;
        string7 = string9;
        string6 = string13;
        var12_13 = var34_46;
        var13_14 = var35_50;
        boolean bl14 = bl7;
        this((Facet)parcelable2, (String)object3, (boolean)var22_27, (boolean)var24_32, n16, string12, string11, string9, string13, facetQuery, (boolean)var34_46, (boolean)var35_50, bl7);
    }

    public FacetValue(FacetQuery facetQuery) {
        Intrinsics.checkNotNullParameter(facetQuery, "mFacetQuery");
        this(null, null, false, false, 0, null, null, null, null, null, false, false, false, 8191, null);
        this.query = facetQuery;
    }

    public FacetValue(String string2) {
        Intrinsics.checkNotNullParameter(string2, "mFacetInternalQueryString");
        Parcelable parcelable = this;
        int n3 = 8191;
        this(null, null, false, false, 0, null, null, null, null, null, false, false, false, n3, null);
        super(string2);
        this.query = parcelable;
        this.selected = true;
    }

    public int compareTo(FacetValue object) {
        String string2 = "other";
        Intrinsics.checkNotNullParameter(object, string2);
        String string3 = this.name;
        Intrinsics.checkNotNull(string3);
        object = ((FacetValue)object).name;
        Intrinsics.checkNotNull(object);
        Intrinsics.checkNotNullParameter(string3, "<this>");
        Intrinsics.checkNotNullParameter(object, string2);
        return string3.compareToIgnoreCase((String)object);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = super.equals(object);
        if (bl3) {
            return true;
        }
        String string2 = this.name;
        bl3 = TextUtils.isEmpty((CharSequence)string2);
        if (bl3) {
            bl2 = false;
            object = null;
        } else {
            string2 = this.name;
            String string3 = "null cannot be cast to non-null type com.ril.ajio.services.data.FacetValue";
            Intrinsics.checkNotNull(object, string3);
            object = ((FacetValue)object).name;
            bl2 = Intrinsics.areEqual(string2, object);
        }
        return bl2;
    }

    public final String getCode() {
        return this.code;
    }

    public final int getCount() {
        return this.count;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final Facet getFacet() {
        return this.facet;
    }

    public final String getFacetCode() {
        return this.facetCode;
    }

    public final String getName() {
        return this.name;
    }

    public final FacetQuery getQuery() {
        return this.query;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean isDeliveryFacetFromApi() {
        return this.isDeliveryFacetFromApi;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isQuickFilter() {
        return this.isQuickFilter;
    }

    public final boolean isTitleFacet() {
        return this.isTitleFacet;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public final void setCount(int n3) {
        this.count = n3;
    }

    public final void setDeliveryFacetFromApi(boolean bl2) {
        this.isDeliveryFacetFromApi = bl2;
    }

    public final void setDisplayName(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.displayName = string2;
    }

    public final void setEnabled(boolean bl2) {
        this.isEnabled = bl2;
    }

    public final void setFacet(Facet facet) {
        this.facet = facet;
    }

    public final void setFacetCode(String string2) {
        this.facetCode = string2;
    }

    public final void setName(String string2) {
        this.name = string2;
    }

    public final void setQuery(FacetQuery facetQuery) {
        this.query = facetQuery;
    }

    public final void setQuickFilter(boolean bl2) {
        this.isQuickFilter = bl2;
    }

    public final void setSelected(boolean bl2) {
        this.selected = bl2;
    }

    public final void setTitleFacet(boolean bl2) {
        this.isTitleFacet = bl2;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }

    public void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.facet;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            ((Facet)object).writeToParcel(parcel, n3);
        }
        object = this.facetCode;
        parcel.writeString((String)object);
        int n7 = this.isTitleFacet;
        parcel.writeInt(n7);
        int n8 = this.selected;
        parcel.writeInt(n8);
        int n10 = this.count;
        parcel.writeInt(n10);
        object = this.code;
        parcel.writeString((String)object);
        object = this.name;
        parcel.writeString((String)object);
        object = this.value;
        parcel.writeString((String)object);
        object = this.displayName;
        parcel.writeString((String)object);
        object = this.query;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            ((FacetQuery)object).writeToParcel(parcel, n3);
        }
        n3 = (int)(this.isQuickFilter ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.isDeliveryFacetFromApi ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.isEnabled ? 1 : 0);
        parcel.writeInt(n3);
    }
}

