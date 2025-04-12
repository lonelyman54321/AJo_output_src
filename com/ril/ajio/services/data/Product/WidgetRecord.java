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
import com.ril.ajio.services.data.Product.WidgetRecord$Creator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class WidgetRecord
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private Integer adapterPositionOfWidget;
    private String bannerType;
    private String currentStore;
    private Boolean showDefault;
    private Boolean showViewAllWidget;
    private String widgetFilters;
    private String widgetID;
    private String widgetMinProdCount;
    private String widgetName;
    private String widgetType;

    static {
        WidgetRecord$Creator widgetRecord$Creator = new WidgetRecord$Creator();
        CREATOR = widgetRecord$Creator;
    }

    public WidgetRecord() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public WidgetRecord(String string2, String string3, String string4, String string5, Boolean bl2, Boolean bl3, Integer n3, String string6, String string7, String string8) {
        this.widgetID = string2;
        this.widgetType = string3;
        this.widgetMinProdCount = string4;
        this.widgetName = string5;
        this.showViewAllWidget = bl2;
        this.showDefault = bl3;
        this.adapterPositionOfWidget = n3;
        this.currentStore = string6;
        this.widgetFilters = string7;
        this.bannerType = string8;
    }

    public /* synthetic */ WidgetRecord(String object, String string2, String string3, String string4, Boolean object2, Boolean bl2, Integer constable, String object3, String string5, String string6, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        String string7;
        String string8;
        Integer n4;
        Boolean bl3;
        String string9;
        String string10;
        String string11;
        String string12;
        int n7 = n3;
        int n8 = n3 & 1;
        String string13 = null;
        if (n8 != 0) {
            n8 = 0;
            string12 = null;
        } else {
            string12 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string11 = null;
        } else {
            string11 = string2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            string10 = null;
        } else {
            string10 = string3;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            string9 = null;
        } else {
            string9 = string4;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            bl3 = null;
        } else {
            bl3 = object2;
        }
        int n17 = n7 & 0x20;
        Boolean bl4 = n17 != 0 ? Boolean.FALSE : bl2;
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            n4 = null;
        } else {
            n4 = constable;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            string8 = null;
        } else {
            string8 = object3;
        }
        int n20 = n7 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            string7 = null;
        } else {
            string7 = string5;
        }
        if ((n7 &= 0x200) == 0) {
            string13 = string6;
        }
        object = this;
        string2 = string12;
        string3 = string11;
        string4 = string10;
        object2 = string9;
        bl2 = bl3;
        constable = bl4;
        object3 = n4;
        string5 = string8;
        string6 = string7;
        this(string12, string11, string10, string9, bl3, bl4, n4, string8, string7, string13);
    }

    public static /* synthetic */ WidgetRecord copy$default(WidgetRecord widgetRecord, String string2, String string3, String string4, String string5, Boolean bl2, Boolean bl3, Integer n3, String string6, String string7, String string8, int n4, Object object) {
        WidgetRecord widgetRecord2 = widgetRecord;
        int n7 = n4;
        int n8 = n4 & 1;
        String string9 = n8 != 0 ? widgetRecord.widgetID : string2;
        int n10 = n7 & 2;
        String string10 = n10 != 0 ? widgetRecord2.widgetType : string3;
        int n14 = n7 & 4;
        String string11 = n14 != 0 ? widgetRecord2.widgetMinProdCount : string4;
        int n15 = n7 & 8;
        String string12 = n15 != 0 ? widgetRecord2.widgetName : string5;
        int n16 = n7 & 0x10;
        Boolean bl4 = n16 != 0 ? widgetRecord2.showViewAllWidget : bl2;
        int n17 = n7 & 0x20;
        Boolean bl5 = n17 != 0 ? widgetRecord2.showDefault : bl3;
        int n18 = n7 & 0x40;
        Integer n19 = n18 != 0 ? widgetRecord2.adapterPositionOfWidget : n3;
        int n20 = n7 & 0x80;
        String string13 = n20 != 0 ? widgetRecord2.currentStore : string6;
        int n21 = n7 & 0x100;
        String string14 = n21 != 0 ? widgetRecord2.widgetFilters : string7;
        String string15 = (n7 &= 0x200) != 0 ? widgetRecord2.bannerType : string8;
        string2 = string9;
        string3 = string10;
        string4 = string11;
        string5 = string12;
        bl2 = bl4;
        bl3 = bl5;
        n3 = n19;
        string6 = string13;
        string7 = string14;
        string8 = string15;
        return widgetRecord.copy(string9, string10, string11, string12, bl4, bl5, n19, string13, string14, string15);
    }

    public final String component1() {
        return this.widgetID;
    }

    public final String component10() {
        return this.bannerType;
    }

    public final String component2() {
        return this.widgetType;
    }

    public final String component3() {
        return this.widgetMinProdCount;
    }

    public final String component4() {
        return this.widgetName;
    }

    public final Boolean component5() {
        return this.showViewAllWidget;
    }

    public final Boolean component6() {
        return this.showDefault;
    }

    public final Integer component7() {
        return this.adapterPositionOfWidget;
    }

    public final String component8() {
        return this.currentStore;
    }

    public final String component9() {
        return this.widgetFilters;
    }

    public final WidgetRecord copy(String string2, String string3, String string4, String string5, Boolean bl2, Boolean bl3, Integer n3, String string6, String string7, String string8) {
        WidgetRecord widgetRecord = new WidgetRecord(string2, string3, string4, string5, bl2, bl3, n3, string6, string7, string8);
        return widgetRecord;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof WidgetRecord;
        if (!bl3) {
            return false;
        }
        object = (WidgetRecord)object;
        Object object2 = this.widgetID;
        Object object3 = ((WidgetRecord)object).widgetID;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.widgetType;
        object3 = ((WidgetRecord)object).widgetType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.widgetMinProdCount;
        object3 = ((WidgetRecord)object).widgetMinProdCount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.widgetName;
        object3 = ((WidgetRecord)object).widgetName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.showViewAllWidget;
        object3 = ((WidgetRecord)object).showViewAllWidget;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.showDefault;
        object3 = ((WidgetRecord)object).showDefault;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.adapterPositionOfWidget;
        object3 = ((WidgetRecord)object).adapterPositionOfWidget;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.currentStore;
        object3 = ((WidgetRecord)object).currentStore;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.widgetFilters;
        object3 = ((WidgetRecord)object).widgetFilters;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bannerType;
        object = ((WidgetRecord)object).bannerType;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Integer getAdapterPositionOfWidget() {
        return this.adapterPositionOfWidget;
    }

    public final String getBannerType() {
        return this.bannerType;
    }

    public final String getCurrentStore() {
        return this.currentStore;
    }

    public final Boolean getShowDefault() {
        return this.showDefault;
    }

    public final Boolean getShowViewAllWidget() {
        return this.showViewAllWidget;
    }

    public final String getWidgetFilters() {
        return this.widgetFilters;
    }

    public final String getWidgetID() {
        return this.widgetID;
    }

    public final String getWidgetMinProdCount() {
        return this.widgetMinProdCount;
    }

    public final String getWidgetName() {
        return this.widgetName;
    }

    public final String getWidgetType() {
        return this.widgetType;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.widgetID;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.widgetType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.widgetMinProdCount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.widgetName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.showViewAllWidget;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.showDefault;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.adapterPositionOfWidget;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.currentStore;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.widgetFilters;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bannerType;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAdapterPositionOfWidget(Integer n3) {
        this.adapterPositionOfWidget = n3;
    }

    public final void setBannerType(String string2) {
        this.bannerType = string2;
    }

    public final void setCurrentStore(String string2) {
        this.currentStore = string2;
    }

    public final void setShowDefault(Boolean bl2) {
        this.showDefault = bl2;
    }

    public final void setShowViewAllWidget(Boolean bl2) {
        this.showViewAllWidget = bl2;
    }

    public final void setWidgetFilters(String string2) {
        this.widgetFilters = string2;
    }

    public final void setWidgetID(String string2) {
        this.widgetID = string2;
    }

    public final void setWidgetMinProdCount(String string2) {
        this.widgetMinProdCount = string2;
    }

    public final void setWidgetName(String string2) {
        this.widgetName = string2;
    }

    public final void setWidgetType(String string2) {
        this.widgetType = string2;
    }

    public String toString() {
        CharSequence charSequence = this.widgetID;
        String string2 = this.widgetType;
        String string3 = this.widgetMinProdCount;
        String string4 = this.widgetName;
        Boolean bl2 = this.showViewAllWidget;
        Boolean bl3 = this.showDefault;
        Integer n3 = this.adapterPositionOfWidget;
        String string5 = this.currentStore;
        String string6 = this.widgetFilters;
        String string7 = this.bannerType;
        charSequence = og_1.a("WidgetRecord(widgetID=", (String)charSequence, ", widgetType=", string2, ", widgetMinProdCount=");
        X50.a((StringBuilder)charSequence, string3, ", widgetName=", string4, ", showViewAllWidget=");
        ((StringBuilder)charSequence).append(bl2);
        ((StringBuilder)charSequence).append(", showDefault=");
        ((StringBuilder)charSequence).append(bl3);
        ((StringBuilder)charSequence).append(", adapterPositionOfWidget=");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(", currentStore=");
        ((StringBuilder)charSequence).append(string5);
        ((StringBuilder)charSequence).append(", widgetFilters=");
        return ko_0.a((StringBuilder)charSequence, string6, ", bannerType=", string7, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.widgetID;
        parcel.writeString((String)object);
        object = this.widgetType;
        parcel.writeString((String)object);
        object = this.widgetMinProdCount;
        parcel.writeString((String)object);
        object = this.widgetName;
        parcel.writeString((String)object);
        object = this.showViewAllWidget;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n4, (Boolean)object);
        }
        object = this.showDefault;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            yi0_2.a(parcel, n4, (Boolean)object);
        }
        object = this.adapterPositionOfWidget;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            n3 = (Integer)object;
            parcel.writeInt(n3);
        }
        object = this.currentStore;
        parcel.writeString((String)object);
        object = this.widgetFilters;
        parcel.writeString((String)object);
        object = this.bannerType;
        parcel.writeString((String)object);
    }
}

