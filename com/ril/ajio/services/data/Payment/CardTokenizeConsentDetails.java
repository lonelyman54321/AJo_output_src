/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CardTokenizeConsentDetails {
    private final List content;
    private final String heading;
    private final String subheading;

    public CardTokenizeConsentDetails() {
        this(null, null, null, 7, null);
    }

    public CardTokenizeConsentDetails(String string2, String string3, List list) {
        this.heading = string2;
        this.subheading = string3;
        this.content = list;
    }

    public /* synthetic */ CardTokenizeConsentDetails(String string2, String string3, List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            list = null;
        }
        this(string2, string3, list);
    }

    public static /* synthetic */ CardTokenizeConsentDetails copy$default(CardTokenizeConsentDetails cardTokenizeConsentDetails, String string2, String string3, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = cardTokenizeConsentDetails.heading;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = cardTokenizeConsentDetails.subheading;
        }
        if ((n3 &= 4) != 0) {
            list = cardTokenizeConsentDetails.content;
        }
        return cardTokenizeConsentDetails.copy(string2, string3, list);
    }

    public final String component1() {
        return this.heading;
    }

    public final String component2() {
        return this.subheading;
    }

    public final List component3() {
        return this.content;
    }

    public final CardTokenizeConsentDetails copy(String string2, String string3, List list) {
        CardTokenizeConsentDetails cardTokenizeConsentDetails = new CardTokenizeConsentDetails(string2, string3, list);
        return cardTokenizeConsentDetails;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CardTokenizeConsentDetails;
        if (!bl3) {
            return false;
        }
        object = (CardTokenizeConsentDetails)object;
        Object object2 = this.heading;
        String string2 = ((CardTokenizeConsentDetails)object).heading;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.subheading;
        string2 = ((CardTokenizeConsentDetails)object).subheading;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.content;
        object = ((CardTokenizeConsentDetails)object).content;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getContent() {
        return this.content;
    }

    public final String getHeading() {
        return this.heading;
    }

    public final String getSubheading() {
        return this.subheading;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.heading;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.subheading;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.content;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        CharSequence charSequence = this.heading;
        String string2 = this.subheading;
        List list = this.content;
        charSequence = og_1.a("CardTokenizeConsentDetails(heading=", (String)charSequence, ", subheading=", string2, ", content=");
        ((StringBuilder)charSequence).append(list);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

