/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import com.ril.ajio.services.data.Order.ReturnRefundLinksEnum;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class ReturnRefundBottomLink
implements Serializable {
    private final String bottomHeader;
    private final ReturnRefundLinksEnum bottomLinkCode;
    private final String bottomLinkMessage;
    private final String bottomLinkName;
    private final String bottomLinkUrl;
    private final String message;

    public ReturnRefundBottomLink(String string2, String string3, String string4, String string5, String string6, ReturnRefundLinksEnum returnRefundLinksEnum) {
        Intrinsics.checkNotNullParameter((Object)returnRefundLinksEnum, "bottomLinkCode");
        this.bottomHeader = string2;
        this.message = string3;
        this.bottomLinkName = string4;
        this.bottomLinkUrl = string5;
        this.bottomLinkMessage = string6;
        this.bottomLinkCode = returnRefundLinksEnum;
    }

    public static /* synthetic */ ReturnRefundBottomLink copy$default(ReturnRefundBottomLink returnRefundBottomLink, String string2, String object, String string3, String object2, String string4, ReturnRefundLinksEnum object3, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = returnRefundBottomLink.bottomHeader;
        }
        if ((n4 = n3 & 2) != 0) {
            object = returnRefundBottomLink.message;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            string3 = returnRefundBottomLink.bottomLinkName;
        }
        String string5 = string3;
        n7 = n3 & 8;
        if (n7 != 0) {
            object2 = returnRefundBottomLink.bottomLinkUrl;
        }
        String string6 = object2;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string4 = returnRefundBottomLink.bottomLinkMessage;
        }
        String string7 = string4;
        n7 = n3 & 0x20;
        if (n7 != 0) {
            object3 = returnRefundBottomLink.bottomLinkCode;
        }
        ReturnRefundLinksEnum returnRefundLinksEnum = object3;
        object = returnRefundBottomLink;
        string3 = string2;
        object2 = object4;
        string4 = string5;
        object3 = string6;
        object4 = returnRefundLinksEnum;
        return returnRefundBottomLink.copy(string2, (String)object2, string5, string6, string7, returnRefundLinksEnum);
    }

    public final String component1() {
        return this.bottomHeader;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.bottomLinkName;
    }

    public final String component4() {
        return this.bottomLinkUrl;
    }

    public final String component5() {
        return this.bottomLinkMessage;
    }

    public final ReturnRefundLinksEnum component6() {
        return this.bottomLinkCode;
    }

    public final ReturnRefundBottomLink copy(String string2, String string3, String string4, String string5, String string6, ReturnRefundLinksEnum returnRefundLinksEnum) {
        Intrinsics.checkNotNullParameter((Object)returnRefundLinksEnum, "bottomLinkCode");
        ReturnRefundBottomLink returnRefundBottomLink = new ReturnRefundBottomLink(string2, string3, string4, string5, string6, returnRefundLinksEnum);
        return returnRefundBottomLink;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ReturnRefundBottomLink;
        if (!bl3) {
            return false;
        }
        object = (ReturnRefundBottomLink)object;
        Object object2 = this.bottomHeader;
        String string2 = ((ReturnRefundBottomLink)object).bottomHeader;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.message;
        string2 = ((ReturnRefundBottomLink)object).message;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.bottomLinkName;
        string2 = ((ReturnRefundBottomLink)object).bottomLinkName;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.bottomLinkUrl;
        string2 = ((ReturnRefundBottomLink)object).bottomLinkUrl;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.bottomLinkMessage;
        string2 = ((ReturnRefundBottomLink)object).bottomLinkMessage;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.bottomLinkCode;
        object = ((ReturnRefundBottomLink)object).bottomLinkCode;
        if (object2 != object) {
            return false;
        }
        return bl2;
    }

    public final String getBottomHeader() {
        return this.bottomHeader;
    }

    public final ReturnRefundLinksEnum getBottomLinkCode() {
        return this.bottomLinkCode;
    }

    public final String getBottomLinkMessage() {
        return this.bottomLinkMessage;
    }

    public final String getBottomLinkName() {
        return this.bottomLinkName;
    }

    public final String getBottomLinkUrl() {
        return this.bottomLinkUrl;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.bottomHeader;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.message;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.bottomLinkName;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.bottomLinkUrl;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.bottomLinkMessage;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        n4 = (n4 + n7) * 31;
        return ((Object)((Object)this.bottomLinkCode)).hashCode() + n4;
    }

    public String toString() {
        CharSequence charSequence = this.bottomHeader;
        String string2 = this.message;
        String string3 = this.bottomLinkName;
        String string4 = this.bottomLinkUrl;
        String string5 = this.bottomLinkMessage;
        ReturnRefundLinksEnum returnRefundLinksEnum = this.bottomLinkCode;
        charSequence = og_1.a("ReturnRefundBottomLink(bottomHeader=", (String)charSequence, ", message=", string2, ", bottomLinkName=");
        X50.a((StringBuilder)charSequence, string3, ", bottomLinkUrl=", string4, ", bottomLinkMessage=");
        ((StringBuilder)charSequence).append(string5);
        ((StringBuilder)charSequence).append(", bottomLinkCode=");
        ((StringBuilder)charSequence).append((Object)returnRefundLinksEnum);
        ((StringBuilder)charSequence).append(")");
        return ((StringBuilder)charSequence).toString();
    }
}

