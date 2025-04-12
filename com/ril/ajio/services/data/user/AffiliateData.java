/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.ril.ajio.services.data.user;

import android.os.Parcel;
import android.os.Parcelable;
import com.ril.ajio.services.data.user.AffiliateData$Creator;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class AffiliateData
implements Serializable,
Parcelable {
    public static final Parcelable.Creator CREATOR;
    private String affiliateId;
    private String attributionWindow;
    private String clickId;
    private String conversionId;
    private Long endTime;
    private String offerId;
    private String returnCancellationWindow;
    private Long startTime;
    private String utmCampaign;
    private String utmMedium;
    private String utmSource;

    static {
        AffiliateData$Creator affiliateData$Creator = new AffiliateData$Creator();
        CREATOR = affiliateData$Creator;
    }

    public AffiliateData() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public AffiliateData(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Long l2, Long l3, String string10) {
        this.utmSource = string2;
        this.utmMedium = string3;
        this.utmCampaign = string4;
        this.clickId = string5;
        this.affiliateId = string6;
        this.offerId = string7;
        this.attributionWindow = string8;
        this.returnCancellationWindow = string9;
        this.startTime = l2;
        this.endTime = l3;
        this.conversionId = string10;
    }

    public /* synthetic */ AffiliateData(String object, String string2, String string3, String string4, String string5, String string6, String string7, String string8, Long object2, Long l2, String object3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Long l3;
        Long l4;
        String string9;
        String string10;
        String string11;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        int n4 = n3;
        int n7 = n3 & 1;
        String string17 = null;
        if (n7 != 0) {
            n7 = 0;
            string16 = null;
        } else {
            string16 = object;
        }
        int n8 = n4 & 2;
        if (n8 != 0) {
            n8 = 0;
            string15 = null;
        } else {
            string15 = string2;
        }
        int n10 = n4 & 4;
        if (n10 != 0) {
            n10 = 0;
            string14 = null;
        } else {
            string14 = string3;
        }
        int n14 = n4 & 8;
        if (n14 != 0) {
            n14 = 0;
            string13 = null;
        } else {
            string13 = string4;
        }
        int n15 = n4 & 0x10;
        if (n15 != 0) {
            n15 = 0;
            string12 = null;
        } else {
            string12 = string5;
        }
        int n16 = n4 & 0x20;
        if (n16 != 0) {
            n16 = 0;
            string11 = null;
        } else {
            string11 = string6;
        }
        int n17 = n4 & 0x40;
        if (n17 != 0) {
            n17 = 0;
            string10 = null;
        } else {
            string10 = string7;
        }
        int n18 = n4 & 0x80;
        if (n18 != 0) {
            n18 = 0;
            string9 = null;
        } else {
            string9 = string8;
        }
        int n19 = n4 & 0x100;
        if (n19 != 0) {
            n19 = 0;
            l4 = null;
        } else {
            l4 = object2;
        }
        int n20 = n4 & 0x200;
        if (n20 != 0) {
            n20 = 0;
            l3 = null;
        } else {
            l3 = l2;
        }
        if ((n4 &= 0x400) == 0) {
            string17 = object3;
        }
        object = this;
        string2 = string16;
        string3 = string15;
        string4 = string14;
        string5 = string13;
        string6 = string12;
        string7 = string11;
        string8 = string10;
        object2 = string9;
        l2 = l4;
        object3 = l3;
        this(string16, string15, string14, string13, string12, string11, string10, string9, l4, l3, string17);
    }

    public static /* synthetic */ AffiliateData copy$default(AffiliateData affiliateData, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Long l2, Long l3, String string10, int n3, Object object) {
        AffiliateData affiliateData2 = affiliateData;
        int n4 = n3;
        int n7 = n3 & 1;
        String string11 = n7 != 0 ? affiliateData.utmSource : string2;
        int n8 = n4 & 2;
        String string12 = n8 != 0 ? affiliateData2.utmMedium : string3;
        int n10 = n4 & 4;
        String string13 = n10 != 0 ? affiliateData2.utmCampaign : string4;
        int n14 = n4 & 8;
        String string14 = n14 != 0 ? affiliateData2.clickId : string5;
        int n15 = n4 & 0x10;
        String string15 = n15 != 0 ? affiliateData2.affiliateId : string6;
        int n16 = n4 & 0x20;
        String string16 = n16 != 0 ? affiliateData2.offerId : string7;
        int n17 = n4 & 0x40;
        String string17 = n17 != 0 ? affiliateData2.attributionWindow : string8;
        int n18 = n4 & 0x80;
        String string18 = n18 != 0 ? affiliateData2.returnCancellationWindow : string9;
        int n19 = n4 & 0x100;
        Long l4 = n19 != 0 ? affiliateData2.startTime : l2;
        int n20 = n4 & 0x200;
        Long l7 = n20 != 0 ? affiliateData2.endTime : l3;
        String string19 = (n4 &= 0x400) != 0 ? affiliateData2.conversionId : string10;
        string2 = string11;
        string3 = string12;
        string4 = string13;
        string5 = string14;
        string6 = string15;
        string7 = string16;
        string8 = string17;
        string9 = string18;
        l2 = l4;
        l3 = l7;
        string10 = string19;
        return affiliateData.copy(string11, string12, string13, string14, string15, string16, string17, string18, l4, l7, string19);
    }

    public final String component1() {
        return this.utmSource;
    }

    public final Long component10() {
        return this.endTime;
    }

    public final String component11() {
        return this.conversionId;
    }

    public final String component2() {
        return this.utmMedium;
    }

    public final String component3() {
        return this.utmCampaign;
    }

    public final String component4() {
        return this.clickId;
    }

    public final String component5() {
        return this.affiliateId;
    }

    public final String component6() {
        return this.offerId;
    }

    public final String component7() {
        return this.attributionWindow;
    }

    public final String component8() {
        return this.returnCancellationWindow;
    }

    public final Long component9() {
        return this.startTime;
    }

    public final AffiliateData copy(String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, Long l2, Long l3, String string10) {
        AffiliateData affiliateData = new AffiliateData(string2, string3, string4, string5, string6, string7, string8, string9, l2, l3, string10);
        return affiliateData;
    }

    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AffiliateData;
        if (!bl3) {
            return false;
        }
        object = (AffiliateData)object;
        Object object2 = this.utmSource;
        Object object3 = ((AffiliateData)object).utmSource;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.utmMedium;
        object3 = ((AffiliateData)object).utmMedium;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.utmCampaign;
        object3 = ((AffiliateData)object).utmCampaign;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.clickId;
        object3 = ((AffiliateData)object).clickId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.affiliateId;
        object3 = ((AffiliateData)object).affiliateId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerId;
        object3 = ((AffiliateData)object).offerId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.attributionWindow;
        object3 = ((AffiliateData)object).attributionWindow;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.returnCancellationWindow;
        object3 = ((AffiliateData)object).returnCancellationWindow;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.startTime;
        object3 = ((AffiliateData)object).startTime;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.endTime;
        object3 = ((AffiliateData)object).endTime;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.conversionId;
        object = ((AffiliateData)object).conversionId;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAffiliateId() {
        return this.affiliateId;
    }

    public final String getAttributionWindow() {
        return this.attributionWindow;
    }

    public final String getClickId() {
        return this.clickId;
    }

    public final String getConversionId() {
        return this.conversionId;
    }

    public final Long getEndTime() {
        return this.endTime;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getReturnCancellationWindow() {
        return this.returnCancellationWindow;
    }

    public final Long getStartTime() {
        return this.startTime;
    }

    public final String getUtmCampaign() {
        return this.utmCampaign;
    }

    public final String getUtmMedium() {
        return this.utmMedium;
    }

    public final String getUtmSource() {
        return this.utmSource;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.utmSource;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.utmMedium;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.utmCampaign;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.clickId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.affiliateId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.attributionWindow;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.returnCancellationWindow;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.startTime;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.endTime;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.conversionId;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setAffiliateId(String string2) {
        this.affiliateId = string2;
    }

    public final void setAttributionWindow(String string2) {
        this.attributionWindow = string2;
    }

    public final void setClickId(String string2) {
        this.clickId = string2;
    }

    public final void setConversionId(String string2) {
        this.conversionId = string2;
    }

    public final void setEndTime(Long l2) {
        this.endTime = l2;
    }

    public final void setOfferId(String string2) {
        this.offerId = string2;
    }

    public final void setReturnCancellationWindow(String string2) {
        this.returnCancellationWindow = string2;
    }

    public final void setStartTime(Long l2) {
        this.startTime = l2;
    }

    public final void setUtmCampaign(String string2) {
        this.utmCampaign = string2;
    }

    public final void setUtmMedium(String string2) {
        this.utmMedium = string2;
    }

    public final void setUtmSource(String string2) {
        this.utmSource = string2;
    }

    public String toString() {
        CharSequence charSequence = this.utmSource;
        String string2 = this.utmMedium;
        String string3 = this.utmCampaign;
        String string4 = this.clickId;
        String string5 = this.affiliateId;
        String string6 = this.offerId;
        String string7 = this.attributionWindow;
        String string8 = this.returnCancellationWindow;
        Long l2 = this.startTime;
        Long l3 = this.endTime;
        String string9 = this.conversionId;
        charSequence = og_1.a("AffiliateData(utmSource=", (String)charSequence, ", utmMedium=", string2, ", utmCampaign=");
        X50.a((StringBuilder)charSequence, string3, ", clickId=", string4, ", affiliateId=");
        X50.a((StringBuilder)charSequence, string5, ", offerId=", string6, ", attributionWindow=");
        X50.a((StringBuilder)charSequence, string7, ", returnCancellationWindow=", string8, ", startTime=");
        ((StringBuilder)charSequence).append(l2);
        ((StringBuilder)charSequence).append(", endTime=");
        ((StringBuilder)charSequence).append(l3);
        ((StringBuilder)charSequence).append(", conversionId=");
        return h30_0.a((StringBuilder)charSequence, string9, ")");
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Intrinsics.checkNotNullParameter(parcel, "dest");
        Object object = this.utmSource;
        parcel.writeString((String)object);
        object = this.utmMedium;
        parcel.writeString((String)object);
        object = this.utmCampaign;
        parcel.writeString((String)object);
        object = this.clickId;
        parcel.writeString((String)object);
        object = this.affiliateId;
        parcel.writeString((String)object);
        object = this.offerId;
        parcel.writeString((String)object);
        object = this.attributionWindow;
        parcel.writeString((String)object);
        object = this.returnCancellationWindow;
        parcel.writeString((String)object);
        object = this.startTime;
        int n4 = 1;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            long l2 = (Long)object;
            parcel.writeLong(l2);
        }
        object = this.endTime;
        if (object == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(n4);
            long l3 = (Long)object;
            parcel.writeLong(l3);
        }
        object = this.conversionId;
        parcel.writeString((String)object);
    }
}

