/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class PrepaidOffersItem
implements Serializable {
    private final String bankId;
    private final String bankName;
    private final String description;
    private final List eligiblePaymentInstruments;
    private final long endDate;
    private final boolean isAbsolute;
    private final String logo;
    private final int offerAmount;
    private final String offerCode;
    private String offerDetails;
    private final int priority;
    private final long startDate;
    private final int thresholdAmount;
    private final String tncUrl;
    private final String type;

    public PrepaidOffersItem(String string2, String string3, String string4, List list, long l2, boolean bl2, String string5, int n3, String string6, String string7, int n4, long l3, int n7, String string8, String string9) {
        Intrinsics.checkNotNullParameter(string2, "bankId");
        Intrinsics.checkNotNullParameter(string3, "bankName");
        Intrinsics.checkNotNullParameter(string4, "description");
        Intrinsics.checkNotNullParameter(list, "eligiblePaymentInstruments");
        Intrinsics.checkNotNullParameter(string5, "logo");
        Intrinsics.checkNotNullParameter(string6, "offerCode");
        Intrinsics.checkNotNullParameter(string8, "tncUrl");
        Intrinsics.checkNotNullParameter(string9, "type");
        this.bankId = string2;
        this.bankName = string3;
        this.description = string4;
        this.eligiblePaymentInstruments = list;
        this.endDate = l2;
        this.isAbsolute = bl2;
        this.logo = string5;
        this.offerAmount = n3;
        this.offerCode = string6;
        this.offerDetails = string7;
        this.priority = n4;
        this.startDate = l3;
        this.thresholdAmount = n7;
        this.tncUrl = string8;
        this.type = string9;
    }

    /*
     * WARNING - void declaration
     */
    public static /* synthetic */ PrepaidOffersItem copy$default(PrepaidOffersItem prepaidOffersItem, String string2, String string3, String string4, List list, long l2, boolean bl2, String string5, int n3, String string6, String string7, int n4, long l3, int n7, String string8, String string9, int n8, Object object) {
        void var33_33;
        PrepaidOffersItem prepaidOffersItem2 = prepaidOffersItem;
        int n10 = n8;
        int n14 = n8 & 1;
        String string10 = n14 != 0 ? prepaidOffersItem.bankId : string2;
        int n15 = n10 & 2;
        String string11 = n15 != 0 ? prepaidOffersItem2.bankName : string3;
        int n16 = n10 & 4;
        String string12 = n16 != 0 ? prepaidOffersItem2.description : string4;
        int n17 = n10 & 8;
        List list2 = n17 != 0 ? prepaidOffersItem2.eligiblePaymentInstruments : list;
        int n18 = n10 & 0x10;
        long l4 = n18 != 0 ? prepaidOffersItem2.endDate : l2;
        int bl3 = n10 & 0x20;
        if (bl3 != 0) {
            boolean bl4 = prepaidOffersItem2.isAbsolute;
        } else {
            boolean bl5 = bl2;
        }
        int n19 = n10 & 0x40;
        String string13 = n19 != 0 ? prepaidOffersItem2.logo : string5;
        int n20 = n10 & 0x80;
        n20 = n20 != 0 ? prepaidOffersItem2.offerAmount : n3;
        int n21 = n10 & 0x100;
        String string14 = n21 != 0 ? prepaidOffersItem2.offerCode : string6;
        int n22 = n10 & 0x200;
        String string15 = n22 != 0 ? prepaidOffersItem2.offerDetails : string7;
        int n24 = n10 & 0x400;
        n24 = n24 != 0 ? prepaidOffersItem2.priority : n4;
        int n25 = n10 & 0x800;
        long l7 = n25 != 0 ? prepaidOffersItem2.startDate : l3;
        l3 = l7;
        n25 = n10 & 0x1000;
        n25 = n25 != 0 ? prepaidOffersItem2.thresholdAmount : n7;
        int n26 = n10 & 0x2000;
        String string16 = n26 != 0 ? prepaidOffersItem2.tncUrl : string8;
        String string17 = (n10 &= 0x4000) != 0 ? prepaidOffersItem2.type : string9;
        string2 = string10;
        string3 = string11;
        string4 = string12;
        list = list2;
        l2 = l4;
        bl2 = var33_33;
        string5 = string13;
        n3 = n20;
        string6 = string14;
        string7 = string15;
        n4 = n24;
        n7 = n25;
        string8 = string16;
        string9 = string17;
        return prepaidOffersItem.copy(string10, string11, string12, list2, l4, (boolean)var33_33, string13, n20, string14, string15, n24, l3, n25, string16, string17);
    }

    public final String component1() {
        return this.bankId;
    }

    public final String component10() {
        return this.offerDetails;
    }

    public final int component11() {
        return this.priority;
    }

    public final long component12() {
        return this.startDate;
    }

    public final int component13() {
        return this.thresholdAmount;
    }

    public final String component14() {
        return this.tncUrl;
    }

    public final String component15() {
        return this.type;
    }

    public final String component2() {
        return this.bankName;
    }

    public final String component3() {
        return this.description;
    }

    public final List component4() {
        return this.eligiblePaymentInstruments;
    }

    public final long component5() {
        return this.endDate;
    }

    public final boolean component6() {
        return this.isAbsolute;
    }

    public final String component7() {
        return this.logo;
    }

    public final int component8() {
        return this.offerAmount;
    }

    public final String component9() {
        return this.offerCode;
    }

    public final PrepaidOffersItem copy(String string2, String string3, String string4, List list, long l2, boolean bl2, String string5, int n3, String string6, String string7, int n4, long l3, int n7, String string8, String string9) {
        Intrinsics.checkNotNullParameter(string2, "bankId");
        Intrinsics.checkNotNullParameter(string3, "bankName");
        Intrinsics.checkNotNullParameter(string4, "description");
        Intrinsics.checkNotNullParameter(list, "eligiblePaymentInstruments");
        Intrinsics.checkNotNullParameter(string5, "logo");
        Intrinsics.checkNotNullParameter(string6, "offerCode");
        Intrinsics.checkNotNullParameter(string8, "tncUrl");
        Intrinsics.checkNotNullParameter(string9, "type");
        PrepaidOffersItem prepaidOffersItem = new PrepaidOffersItem(string2, string3, string4, list, l2, bl2, string5, n3, string6, string7, n4, l3, n7, string8, string9);
        return prepaidOffersItem;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof PrepaidOffersItem;
        if (object2 == 0) {
            return false;
        }
        object = (PrepaidOffersItem)object;
        Object object3 = this.bankId;
        Object object4 = ((PrepaidOffersItem)object).bankId;
        object2 = Intrinsics.areEqual(object3, object4);
        if (object2 == 0) {
            return false;
        }
        object3 = this.bankName;
        object4 = ((PrepaidOffersItem)object).bankName;
        object2 = Intrinsics.areEqual(object3, object4);
        if (object2 == 0) {
            return false;
        }
        object3 = this.description;
        object4 = ((PrepaidOffersItem)object).description;
        object2 = Intrinsics.areEqual(object3, object4);
        if (object2 == 0) {
            return false;
        }
        object3 = this.eligiblePaymentInstruments;
        object4 = ((PrepaidOffersItem)object).eligiblePaymentInstruments;
        object2 = Intrinsics.areEqual(object3, object4);
        if (object2 == 0) {
            return false;
        }
        long l2 = this.endDate;
        long l3 = ((PrepaidOffersItem)object).endDate;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != 0) {
            return false;
        }
        object2 = this.isAbsolute;
        int n3 = ((PrepaidOffersItem)object).isAbsolute;
        if (object2 != n3) {
            return false;
        }
        object3 = this.logo;
        object4 = ((PrepaidOffersItem)object).logo;
        object2 = Intrinsics.areEqual(object3, object4);
        if (object2 == 0) {
            return false;
        }
        object2 = this.offerAmount;
        n3 = ((PrepaidOffersItem)object).offerAmount;
        if (object2 != n3) {
            return false;
        }
        object3 = this.offerCode;
        object4 = ((PrepaidOffersItem)object).offerCode;
        object2 = Intrinsics.areEqual(object3, object4);
        if (object2 == 0) {
            return false;
        }
        object3 = this.offerDetails;
        object4 = ((PrepaidOffersItem)object).offerDetails;
        object2 = Intrinsics.areEqual(object3, object4);
        if (object2 == 0) {
            return false;
        }
        object2 = this.priority;
        n3 = ((PrepaidOffersItem)object).priority;
        if (object2 != n3) {
            return false;
        }
        l2 = this.startDate;
        l3 = ((PrepaidOffersItem)object).startDate;
        long l7 = l2 - l3;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 != 0) {
            return false;
        }
        object2 = this.thresholdAmount;
        n3 = ((PrepaidOffersItem)object).thresholdAmount;
        if (object2 != n3) {
            return false;
        }
        object3 = this.tncUrl;
        object4 = ((PrepaidOffersItem)object).tncUrl;
        object2 = Intrinsics.areEqual(object3, object4);
        if (object2 == 0) {
            return false;
        }
        object3 = this.type;
        object = ((PrepaidOffersItem)object).type;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
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

    public final String getDescription() {
        return this.description;
    }

    public final List getEligiblePaymentInstruments() {
        return this.eligiblePaymentInstruments;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final int getOfferAmount() {
        return this.offerAmount;
    }

    public final String getOfferCode() {
        return this.offerCode;
    }

    public final String getOfferDetails() {
        return this.offerDetails;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final long getStartDate() {
        return this.startDate;
    }

    public final int getThresholdAmount() {
        return this.thresholdAmount;
    }

    public final String getTncUrl() {
        return this.tncUrl;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String string2 = this.bankId;
        int n3 = string2.hashCode();
        int n4 = 31;
        n3 *= 31;
        Object object = this.bankName;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.description;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.eligiblePaymentInstruments;
        n3 = ne_0.a(n3, n4, (List)object);
        long l2 = this.endDate;
        int n7 = 32;
        long l3 = l2 >>> n7;
        int n8 = (int)(l2 ^= l3);
        n3 = (n3 + n8) * 31;
        int n10 = this.isAbsolute;
        n10 = n10 != 0 ? 1231 : 1237;
        n3 = (n3 + n10) * 31;
        object = this.logo;
        n3 = zy_2.b(n3, n4, (String)object);
        n10 = this.offerAmount;
        n3 = (n3 + n10) * 31;
        object = this.offerCode;
        n3 = zy_2.b(n3, n4, (String)object);
        object = this.offerDetails;
        if (object == null) {
            n10 = 0;
            object = null;
        } else {
            n10 = ((String)object).hashCode();
        }
        n3 = (n3 + n10) * 31;
        n10 = this.priority;
        n3 = (n3 + n10) * 31;
        l2 = this.startDate;
        long l4 = l2 >>> n7;
        n8 = (int)(l2 ^ l4);
        n3 = (n3 + n8) * 31;
        n10 = this.thresholdAmount;
        n3 = (n3 + n10) * 31;
        object = this.tncUrl;
        n3 = zy_2.b(n3, n4, (String)object);
        return this.type.hashCode() + n3;
    }

    public final boolean isAbsolute() {
        return this.isAbsolute;
    }

    public final void setOfferDetails(String string2) {
        this.offerDetails = string2;
    }

    public String toString() {
        Serializable serializable = this;
        String string2 = this.bankId;
        String string3 = this.bankName;
        String string4 = this.description;
        Object object = this.eligiblePaymentInstruments;
        long l2 = this.endDate;
        boolean bl2 = this.isAbsolute;
        String string5 = this.logo;
        int n3 = this.offerAmount;
        String string6 = this.offerCode;
        String string7 = this.offerDetails;
        int n4 = this.priority;
        long l3 = this.startDate;
        int n7 = this.thresholdAmount;
        String string8 = this.tncUrl;
        String string9 = this.type;
        serializable = og_1.a("PrepaidOffersItem(bankId=", string2, ", bankName=", string3, ", description=");
        ((StringBuilder)serializable).append(string4);
        ((StringBuilder)serializable).append(", eligiblePaymentInstruments=");
        ((StringBuilder)serializable).append(object);
        ((StringBuilder)serializable).append(", endDate=");
        ((StringBuilder)serializable).append(l2);
        ((StringBuilder)serializable).append(", isAbsolute=");
        ((StringBuilder)serializable).append(bl2);
        ((StringBuilder)serializable).append(", logo=");
        ((StringBuilder)serializable).append(string5);
        ((StringBuilder)serializable).append(", offerAmount=");
        ((StringBuilder)serializable).append(n3);
        X50.a((StringBuilder)serializable, ", offerCode=", string6, ", offerDetails=", string7);
        ((StringBuilder)serializable).append(", priority=");
        ((StringBuilder)serializable).append(n4);
        ((StringBuilder)serializable).append(", startDate=");
        ((StringBuilder)serializable).append(l3);
        ((StringBuilder)serializable).append(", thresholdAmount=");
        ((StringBuilder)serializable).append(n7);
        string4 = string8;
        object = string9;
        X50.a((StringBuilder)serializable, ", tncUrl=", string8, ", type=", string9);
        ((StringBuilder)serializable).append(")");
        return ((StringBuilder)serializable).toString();
    }
}

