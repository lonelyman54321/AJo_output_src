/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Pancard
implements Serializable {
    private final String consentFormLink;
    private final String description;
    private final Boolean isPanRequired;

    public Pancard() {
        this(null, null, null, 7, null);
    }

    public Pancard(String string2, String string3, Boolean bl2) {
        this.description = string2;
        this.consentFormLink = string3;
        this.isPanRequired = bl2;
    }

    public /* synthetic */ Pancard(String string2, String string3, Boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            bl2 = null;
        }
        this(string2, string3, bl2);
    }

    public static /* synthetic */ Pancard copy$default(Pancard pancard, String string2, String string3, Boolean bl2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = pancard.description;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = pancard.consentFormLink;
        }
        if ((n3 &= 4) != 0) {
            bl2 = pancard.isPanRequired;
        }
        return pancard.copy(string2, string3, bl2);
    }

    public final String component1() {
        return this.description;
    }

    public final String component2() {
        return this.consentFormLink;
    }

    public final Boolean component3() {
        return this.isPanRequired;
    }

    public final Pancard copy(String string2, String string3, Boolean bl2) {
        Pancard pancard = new Pancard(string2, string3, bl2);
        return pancard;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Pancard;
        if (!bl3) {
            return false;
        }
        object = (Pancard)object;
        Object object2 = this.description;
        String string2 = ((Pancard)object).description;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.consentFormLink;
        string2 = ((Pancard)object).consentFormLink;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.isPanRequired;
        object = ((Pancard)object).isPanRequired;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getConsentFormLink() {
        return this.consentFormLink;
    }

    public final String getDescription() {
        return this.description;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.description;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.consentFormLink;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.isPanRequired;
        if (object != null) {
            n7 = object.hashCode();
        }
        return n4 + n7;
    }

    public final Boolean isPanRequired() {
        return this.isPanRequired;
    }

    public String toString() {
        String string2 = this.description;
        String string3 = this.consentFormLink;
        Boolean bl2 = this.isPanRequired;
        return nx3_0.a(og_1.a("Pancard(description=", string2, ", consentFormLink=", string3, ", isPanRequired="), bl2, ")");
    }
}

