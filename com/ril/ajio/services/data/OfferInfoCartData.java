/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class OfferInfoCartData
implements Serializable {
    private String offerInfocontent;
    private String offerInfocontentType;
    private String offerInfouId;
    private String offerInfourlLink;

    public OfferInfoCartData(String string2, String string3, String string4, String string5) {
        this.offerInfocontent = string2;
        this.offerInfocontentType = string3;
        this.offerInfouId = string4;
        this.offerInfourlLink = string5;
    }

    public static /* synthetic */ OfferInfoCartData copy$default(OfferInfoCartData offerInfoCartData, String string2, String string3, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = offerInfoCartData.offerInfocontent;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = offerInfoCartData.offerInfocontentType;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = offerInfoCartData.offerInfouId;
        }
        if ((n3 &= 8) != 0) {
            string5 = offerInfoCartData.offerInfourlLink;
        }
        return offerInfoCartData.copy(string2, string3, string4, string5);
    }

    public final String component1() {
        return this.offerInfocontent;
    }

    public final String component2() {
        return this.offerInfocontentType;
    }

    public final String component3() {
        return this.offerInfouId;
    }

    public final String component4() {
        return this.offerInfourlLink;
    }

    public final OfferInfoCartData copy(String string2, String string3, String string4, String string5) {
        OfferInfoCartData offerInfoCartData = new OfferInfoCartData(string2, string3, string4, string5);
        return offerInfoCartData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof OfferInfoCartData;
        if (!bl3) {
            return false;
        }
        object = (OfferInfoCartData)object;
        String string2 = this.offerInfocontent;
        String string3 = ((OfferInfoCartData)object).offerInfocontent;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.offerInfocontentType;
        string3 = ((OfferInfoCartData)object).offerInfocontentType;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.offerInfouId;
        string3 = ((OfferInfoCartData)object).offerInfouId;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.offerInfourlLink;
        object = ((OfferInfoCartData)object).offerInfourlLink;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getOfferInfocontent() {
        return this.offerInfocontent;
    }

    public final String getOfferInfocontentType() {
        return this.offerInfocontentType;
    }

    public final String getOfferInfouId() {
        return this.offerInfouId;
    }

    public final String getOfferInfourlLink() {
        return this.offerInfourlLink;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.offerInfocontent;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.offerInfocontentType;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.offerInfouId;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.offerInfourlLink;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setOfferInfocontent(String string2) {
        this.offerInfocontent = string2;
    }

    public final void setOfferInfocontentType(String string2) {
        this.offerInfocontentType = string2;
    }

    public final void setOfferInfouId(String string2) {
        this.offerInfouId = string2;
    }

    public final void setOfferInfourlLink(String string2) {
        this.offerInfourlLink = string2;
    }

    public String toString() {
        String string2 = this.offerInfocontent;
        String string3 = this.offerInfocontentType;
        String string4 = this.offerInfouId;
        String string5 = this.offerInfourlLink;
        return ko_0.a(og_1.a("OfferInfoCartData(offerInfocontent=", string2, ", offerInfocontentType=", string3, ", offerInfouId="), string4, ", offerInfourlLink=", string5, ")");
    }
}

