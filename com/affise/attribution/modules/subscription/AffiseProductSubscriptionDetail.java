/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules.subscription;

import com.affise.attribution.modules.subscription.TimeUnitType;
import kotlin.jvm.internal.Intrinsics;

public final class AffiseProductSubscriptionDetail {
    private final Long numberOfUnits;
    private final String offerId;
    private final String offerToken;
    private final TimeUnitType timeUnit;

    public AffiseProductSubscriptionDetail(String string2, String string3, TimeUnitType timeUnitType, Long l2) {
        Intrinsics.checkNotNullParameter(string2, "offerToken");
        Intrinsics.checkNotNullParameter(string3, "offerId");
        this.offerToken = string2;
        this.offerId = string3;
        this.timeUnit = timeUnitType;
        this.numberOfUnits = l2;
    }

    public static /* synthetic */ AffiseProductSubscriptionDetail copy$default(AffiseProductSubscriptionDetail affiseProductSubscriptionDetail, String string2, String string3, TimeUnitType timeUnitType, Long l2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = affiseProductSubscriptionDetail.offerToken;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = affiseProductSubscriptionDetail.offerId;
        }
        if ((n4 = n3 & 4) != 0) {
            timeUnitType = affiseProductSubscriptionDetail.timeUnit;
        }
        if ((n3 &= 8) != 0) {
            l2 = affiseProductSubscriptionDetail.numberOfUnits;
        }
        return affiseProductSubscriptionDetail.copy(string2, string3, timeUnitType, l2);
    }

    public final String component1() {
        return this.offerToken;
    }

    public final String component2() {
        return this.offerId;
    }

    public final TimeUnitType component3() {
        return this.timeUnit;
    }

    public final Long component4() {
        return this.numberOfUnits;
    }

    public final AffiseProductSubscriptionDetail copy(String string2, String string3, TimeUnitType timeUnitType, Long l2) {
        Intrinsics.checkNotNullParameter(string2, "offerToken");
        Intrinsics.checkNotNullParameter(string3, "offerId");
        AffiseProductSubscriptionDetail affiseProductSubscriptionDetail = new AffiseProductSubscriptionDetail(string2, string3, timeUnitType, l2);
        return affiseProductSubscriptionDetail;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AffiseProductSubscriptionDetail;
        if (!bl3) {
            return false;
        }
        object = (AffiseProductSubscriptionDetail)object;
        Object object2 = this.offerToken;
        Object object3 = ((AffiseProductSubscriptionDetail)object).offerToken;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.offerId;
        object3 = ((AffiseProductSubscriptionDetail)object).offerId;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.timeUnit;
        object3 = ((AffiseProductSubscriptionDetail)object).timeUnit;
        if (object2 != object3) {
            return false;
        }
        object2 = this.numberOfUnits;
        object = ((AffiseProductSubscriptionDetail)object).numberOfUnits;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Long getNumberOfUnits() {
        return this.numberOfUnits;
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    public final TimeUnitType getTimeUnit() {
        return this.timeUnit;
    }

    public int hashCode() {
        int n3;
        String string2 = this.offerToken;
        int n4 = string2.hashCode();
        int n7 = 31;
        n4 *= 31;
        Object object = this.offerId;
        n4 = zy_2.b(n4, n7, (String)object);
        object = this.timeUnit;
        int n8 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        Long l2 = this.numberOfUnits;
        if (l2 != null) {
            n8 = ((Object)l2).hashCode();
        }
        return n4 + n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AffiseProductSubscriptionDetail(offerToken=");
        Object object = this.offerToken;
        stringBuilder.append((String)object);
        stringBuilder.append(", offerId=");
        object = this.offerId;
        stringBuilder.append((String)object);
        stringBuilder.append(", timeUnit=");
        object = this.timeUnit;
        stringBuilder.append(object);
        stringBuilder.append(", numberOfUnits=");
        object = this.numberOfUnits;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

