/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BannerInfo {
    private String bankId;
    private String bankName;
    private Boolean boostPrepayEnabled;
    private String description;
    private String discountString;
    private ArrayList eligiblePaymentMode;
    private String endDate;
    private String iconURl;
    private String instrumentInstanceCode;
    private String instrumentType;
    private String logo;
    private Float offerAmount;
    private Integer priority;
    private String startDate;
    private String termsAndConditionsUrl;
    private String tncUrl;

    public BannerInfo() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (char)-1, null);
    }

    public BannerInfo(String string2, String string3, String string4, String string5, Integer n3, String string6, String string7, String string8, String string9, String string10, String string11, String string12, Float f5, String string13, ArrayList arrayList, Boolean bl2) {
        this.iconURl = string2;
        this.description = string3;
        this.termsAndConditionsUrl = string4;
        this.discountString = string5;
        this.priority = n3;
        this.startDate = string6;
        this.endDate = string7;
        this.bankName = string8;
        this.bankId = string9;
        this.tncUrl = string10;
        this.logo = string11;
        this.instrumentInstanceCode = string12;
        this.offerAmount = f5;
        this.instrumentType = string13;
        this.eligiblePaymentMode = arrayList;
        this.boostPrepayEnabled = bl2;
    }

    public /* synthetic */ BannerInfo(String object, String string2, String string3, String string4, Integer object2, String object3, String string5, String string6, String string7, String string8, String string9, String string10, Float object4, String object5, ArrayList object6, Boolean serializable, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        Boolean bl2;
        ArrayList arrayList;
        String string11;
        Float f5;
        String string12;
        String string13;
        String string14;
        String string15;
        String string16;
        String string17;
        String string18;
        Integer n4;
        String string19;
        String string20;
        String string21;
        String string22;
        int n7 = n3;
        int n8 = n3 & 1;
        if (n8 != 0) {
            n8 = 0;
            string22 = null;
        } else {
            string22 = object;
        }
        int n10 = n7 & 2;
        if (n10 != 0) {
            n10 = 0;
            string21 = null;
        } else {
            string21 = string2;
        }
        int n14 = n7 & 4;
        if (n14 != 0) {
            n14 = 0;
            string20 = null;
        } else {
            string20 = string3;
        }
        int n15 = n7 & 8;
        if (n15 != 0) {
            n15 = 0;
            string19 = null;
        } else {
            string19 = string4;
        }
        int n16 = n7 & 0x10;
        if (n16 != 0) {
            n16 = 0;
            n4 = 0;
        } else {
            n4 = object2;
        }
        int n17 = n7 & 0x20;
        if (n17 != 0) {
            n17 = 0;
            string18 = null;
        } else {
            string18 = object3;
        }
        int n18 = n7 & 0x40;
        if (n18 != 0) {
            n18 = 0;
            string17 = null;
        } else {
            string17 = string5;
        }
        int n19 = n7 & 0x80;
        if (n19 != 0) {
            n19 = 0;
            string16 = null;
        } else {
            string16 = string6;
        }
        int n20 = n7 & 0x100;
        if (n20 != 0) {
            n20 = 0;
            string15 = null;
        } else {
            string15 = string7;
        }
        int n21 = n7 & 0x200;
        if (n21 != 0) {
            n21 = 0;
            string14 = null;
        } else {
            string14 = string8;
        }
        int n22 = n7 & 0x400;
        if (n22 != 0) {
            n22 = 0;
            string13 = null;
        } else {
            string13 = string9;
        }
        int n24 = n7 & 0x800;
        if (n24 != 0) {
            n24 = 0;
            string12 = null;
        } else {
            string12 = string10;
        }
        int n25 = n7 & 0x1000;
        if (n25 != 0) {
            n25 = 0;
            f5 = Float.valueOf(0.0f);
        } else {
            f5 = object4;
        }
        int n26 = n7 & 0x2000;
        if (n26 != 0) {
            n26 = 0;
            string11 = null;
        } else {
            string11 = object5;
        }
        int n27 = n7 & 0x4000;
        if (n27 != 0) {
            n27 = 0;
            arrayList = null;
        } else {
            arrayList = object6;
        }
        int n28 = 32768;
        if ((n7 &= n28) != 0) {
            n7 = 0;
            bl2 = null;
        } else {
            bl2 = serializable;
        }
        object = this;
        string2 = string22;
        string3 = string21;
        string4 = string20;
        object2 = string19;
        object3 = n4;
        string5 = string18;
        string6 = string17;
        string7 = string16;
        string8 = string15;
        string9 = string14;
        string10 = string13;
        object4 = string12;
        object5 = f5;
        object6 = string11;
        serializable = arrayList;
        this(string22, string21, string20, string19, n4, string18, string17, string16, string15, string14, string13, string12, f5, string11, arrayList, bl2);
    }

    public static /* synthetic */ BannerInfo copy$default(BannerInfo bannerInfo, String string2, String string3, String string4, String string5, Integer n3, String string6, String string7, String string8, String string9, String string10, String string11, String string12, Float f5, String string13, ArrayList object, Boolean bl2, int n4, Object object2) {
        BannerInfo bannerInfo2 = bannerInfo;
        int n7 = n4;
        int n8 = n4 & 1;
        String string14 = n8 != 0 ? bannerInfo.iconURl : string2;
        int n10 = n7 & 2;
        String string15 = n10 != 0 ? bannerInfo2.description : string3;
        int n14 = n7 & 4;
        String string16 = n14 != 0 ? bannerInfo2.termsAndConditionsUrl : string4;
        int n15 = n7 & 8;
        String string17 = n15 != 0 ? bannerInfo2.discountString : string5;
        int n16 = n7 & 0x10;
        Integer n17 = n16 != 0 ? bannerInfo2.priority : n3;
        int n18 = n7 & 0x20;
        String string18 = n18 != 0 ? bannerInfo2.startDate : string6;
        int n19 = n7 & 0x40;
        String string19 = n19 != 0 ? bannerInfo2.endDate : string7;
        int n20 = n7 & 0x80;
        String string20 = n20 != 0 ? bannerInfo2.bankName : string8;
        int n21 = n7 & 0x100;
        String string21 = n21 != 0 ? bannerInfo2.bankId : string9;
        int n22 = n7 & 0x200;
        String string22 = n22 != 0 ? bannerInfo2.tncUrl : string10;
        int n24 = n7 & 0x400;
        String string23 = n24 != 0 ? bannerInfo2.logo : string11;
        int n25 = n7 & 0x800;
        String string24 = n25 != 0 ? bannerInfo2.instrumentInstanceCode : string12;
        int n26 = n7 & 0x1000;
        Float f6 = n26 != 0 ? bannerInfo2.offerAmount : f5;
        int n27 = n7 & 0x2000;
        Object object3 = n27 != 0 ? bannerInfo2.instrumentType : string13;
        string13 = object3;
        n27 = n7 & 0x4000;
        object3 = n27 != 0 ? bannerInfo2.eligiblePaymentMode : object;
        int n28 = 32768;
        Boolean bl3 = (n7 &= n28) != 0 ? bannerInfo2.boostPrepayEnabled : bl2;
        string2 = string14;
        string3 = string15;
        string4 = string16;
        string5 = string17;
        n3 = n17;
        string6 = string18;
        string7 = string19;
        string8 = string20;
        string9 = string21;
        string10 = string22;
        string11 = string23;
        string12 = string24;
        f5 = f6;
        object = object3;
        bl2 = bl3;
        return bannerInfo.copy(string14, string15, string16, string17, n17, string18, string19, string20, string21, string22, string23, string24, f6, string13, (ArrayList)object3, bl3);
    }

    public final String component1() {
        return this.iconURl;
    }

    public final String component10() {
        return this.tncUrl;
    }

    public final String component11() {
        return this.logo;
    }

    public final String component12() {
        return this.instrumentInstanceCode;
    }

    public final Float component13() {
        return this.offerAmount;
    }

    public final String component14() {
        return this.instrumentType;
    }

    public final ArrayList component15() {
        return this.eligiblePaymentMode;
    }

    public final Boolean component16() {
        return this.boostPrepayEnabled;
    }

    public final String component2() {
        return this.description;
    }

    public final String component3() {
        return this.termsAndConditionsUrl;
    }

    public final String component4() {
        return this.discountString;
    }

    public final Integer component5() {
        return this.priority;
    }

    public final String component6() {
        return this.startDate;
    }

    public final String component7() {
        return this.endDate;
    }

    public final String component8() {
        return this.bankName;
    }

    public final String component9() {
        return this.bankId;
    }

    public final BannerInfo copy(String string2, String string3, String string4, String string5, Integer n3, String string6, String string7, String string8, String string9, String string10, String string11, String string12, Float f5, String string13, ArrayList arrayList, Boolean bl2) {
        BannerInfo bannerInfo = new BannerInfo(string2, string3, string4, string5, n3, string6, string7, string8, string9, string10, string11, string12, f5, string13, arrayList, bl2);
        return bannerInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BannerInfo;
        if (!bl3) {
            return false;
        }
        object = (BannerInfo)object;
        Object object2 = this.iconURl;
        Object object3 = ((BannerInfo)object).iconURl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.description;
        object3 = ((BannerInfo)object).description;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.termsAndConditionsUrl;
        object3 = ((BannerInfo)object).termsAndConditionsUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.discountString;
        object3 = ((BannerInfo)object).discountString;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.priority;
        object3 = ((BannerInfo)object).priority;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.startDate;
        object3 = ((BannerInfo)object).startDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.endDate;
        object3 = ((BannerInfo)object).endDate;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bankName;
        object3 = ((BannerInfo)object).bankName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.bankId;
        object3 = ((BannerInfo)object).bankId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.tncUrl;
        object3 = ((BannerInfo)object).tncUrl;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.logo;
        object3 = ((BannerInfo)object).logo;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.instrumentInstanceCode;
        object3 = ((BannerInfo)object).instrumentInstanceCode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerAmount;
        object3 = ((BannerInfo)object).offerAmount;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.instrumentType;
        object3 = ((BannerInfo)object).instrumentType;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.eligiblePaymentMode;
        object3 = ((BannerInfo)object).eligiblePaymentMode;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.boostPrepayEnabled;
        object = ((BannerInfo)object).boostPrepayEnabled;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBankId() {
        return this.bankId;
    }

    public final String getBankName() {
        return this.bankName;
    }

    public final Boolean getBoostPrepayEnabled() {
        return this.boostPrepayEnabled;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDiscountString() {
        return this.discountString;
    }

    public final ArrayList getEligiblePaymentMode() {
        return this.eligiblePaymentMode;
    }

    public final String getEndDate() {
        return this.endDate;
    }

    public final String getIconURl() {
        return this.iconURl;
    }

    public final String getInstrumentInstanceCode() {
        return this.instrumentInstanceCode;
    }

    public final String getInstrumentType() {
        return this.instrumentType;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final Float getOfferAmount() {
        return this.offerAmount;
    }

    public final Integer getPriority() {
        return this.priority;
    }

    public final String getStartDate() {
        return this.startDate;
    }

    public final String getTermsAndConditionsUrl() {
        return this.termsAndConditionsUrl;
    }

    public final String getTncUrl() {
        return this.tncUrl;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.iconURl;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.description;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.termsAndConditionsUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.discountString;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.priority;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.startDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.endDate;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bankName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.bankId;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.tncUrl;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.logo;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.instrumentInstanceCode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.offerAmount;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.instrumentType;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.eligiblePaymentMode;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((ArrayList)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.boostPrepayEnabled;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final void setBankId(String string2) {
        this.bankId = string2;
    }

    public final void setBankName(String string2) {
        this.bankName = string2;
    }

    public final void setBoostPrepayEnabled(Boolean bl2) {
        this.boostPrepayEnabled = bl2;
    }

    public final void setDescription(String string2) {
        this.description = string2;
    }

    public final void setDiscountString(String string2) {
        this.discountString = string2;
    }

    public final void setEligiblePaymentMode(ArrayList arrayList) {
        this.eligiblePaymentMode = arrayList;
    }

    public final void setEndDate(String string2) {
        this.endDate = string2;
    }

    public final void setIconURl(String string2) {
        this.iconURl = string2;
    }

    public final void setInstrumentInstanceCode(String string2) {
        this.instrumentInstanceCode = string2;
    }

    public final void setInstrumentType(String string2) {
        this.instrumentType = string2;
    }

    public final void setLogo(String string2) {
        this.logo = string2;
    }

    public final void setOfferAmount(Float f5) {
        this.offerAmount = f5;
    }

    public final void setPriority(Integer n3) {
        this.priority = n3;
    }

    public final void setStartDate(String string2) {
        this.startDate = string2;
    }

    public final void setTermsAndConditionsUrl(String string2) {
        this.termsAndConditionsUrl = string2;
    }

    public final void setTncUrl(String string2) {
        this.tncUrl = string2;
    }

    public String toString() {
        Object object = this;
        Object object2 = this.iconURl;
        String string2 = this.description;
        String string3 = this.termsAndConditionsUrl;
        String string4 = this.discountString;
        Integer n3 = this.priority;
        String string5 = this.startDate;
        String string6 = this.endDate;
        String string7 = this.bankName;
        String string8 = this.bankId;
        String string9 = this.tncUrl;
        String string10 = this.logo;
        String string11 = this.instrumentInstanceCode;
        Float f5 = this.offerAmount;
        String string12 = this.instrumentType;
        ArrayList arrayList = this.eligiblePaymentMode;
        Boolean bl2 = this.boostPrepayEnabled;
        object = og_1.a("BannerInfo(iconURl=", (String)object2, ", description=", string2, ", termsAndConditionsUrl=");
        X50.a((StringBuilder)object, string3, ", discountString=", string4, ", priority=");
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append(", startDate=");
        ((StringBuilder)object).append(string5);
        ((StringBuilder)object).append(", endDate=");
        X50.a((StringBuilder)object, string6, ", bankName=", string7, ", bankId=");
        X50.a((StringBuilder)object, string8, ", tncUrl=", string9, ", logo=");
        X50.a((StringBuilder)object, string10, ", instrumentInstanceCode=", string11, ", offerAmount=");
        ((StringBuilder)object).append(f5);
        ((StringBuilder)object).append(", instrumentType=");
        object2 = string12;
        ((StringBuilder)object).append(string12);
        ((StringBuilder)object).append(", eligiblePaymentMode=");
        object2 = arrayList;
        ((StringBuilder)object).append(arrayList);
        ((StringBuilder)object).append(", boostPrepayEnabled=");
        object2 = bl2;
        ((StringBuilder)object).append(bl2);
        ((StringBuilder)object).append(")");
        return ((StringBuilder)object).toString();
    }
}

