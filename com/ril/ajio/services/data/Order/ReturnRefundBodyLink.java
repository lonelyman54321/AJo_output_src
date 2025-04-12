/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnRefundBodyLink
implements Serializable {
    private final String linkMessage;
    private final String linkName;
    private final String linkUrl;
    private final String message;

    public ReturnRefundBodyLink(String string2, String string3, String string4, String string5) {
        this.linkMessage = string2;
        this.linkName = string3;
        this.message = string4;
        this.linkUrl = string5;
    }

    public static /* synthetic */ ReturnRefundBodyLink copy$default(ReturnRefundBodyLink returnRefundBodyLink, String string2, String string3, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = returnRefundBodyLink.linkMessage;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = returnRefundBodyLink.linkName;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = returnRefundBodyLink.message;
        }
        if ((n3 &= 8) != 0) {
            string5 = returnRefundBodyLink.linkUrl;
        }
        return returnRefundBodyLink.copy(string2, string3, string4, string5);
    }

    public final String component1() {
        return this.linkMessage;
    }

    public final String component2() {
        return this.linkName;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.linkUrl;
    }

    public final ReturnRefundBodyLink copy(String string2, String string3, String string4, String string5) {
        ReturnRefundBodyLink returnRefundBodyLink = new ReturnRefundBodyLink(string2, string3, string4, string5);
        return returnRefundBodyLink;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReturnRefundBodyLink;
        if (!bl3) {
            return false;
        }
        object = (ReturnRefundBodyLink)object;
        String string2 = this.linkMessage;
        String string3 = ((ReturnRefundBodyLink)object).linkMessage;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.linkName;
        string3 = ((ReturnRefundBodyLink)object).linkName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.message;
        string3 = ((ReturnRefundBodyLink)object).message;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.linkUrl;
        object = ((ReturnRefundBodyLink)object).linkUrl;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getLinkMessage() {
        return this.linkMessage;
    }

    public final String getLinkName() {
        return this.linkName;
    }

    public final String getLinkUrl() {
        return this.linkUrl;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.linkMessage;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.linkName;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.message;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.linkUrl;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public String toString() {
        String string2 = this.linkMessage;
        String string3 = this.linkName;
        String string4 = this.message;
        String string5 = this.linkUrl;
        return ko_0.a(og_1.a("ReturnRefundBodyLink(linkMessage=", string2, ", linkName=", string3, ", message="), string4, ", linkUrl=", string5, ")");
    }
}

