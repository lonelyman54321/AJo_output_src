/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class BodyContent {
    private String linkMessage;
    private String linkName;
    private String linkUrl;
    private String message;

    public BodyContent() {
        this(null, null, null, null, 15, null);
    }

    public BodyContent(String string2, String string3, String string4, String string5) {
        this.linkMessage = string2;
        this.linkName = string3;
        this.message = string4;
        this.linkUrl = string5;
    }

    public /* synthetic */ BodyContent(String string2, String string3, String string4, String string5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = null;
        }
        if ((n3 &= 8) != 0) {
            string5 = null;
        }
        this(string2, string3, string4, string5);
    }

    public static /* synthetic */ BodyContent copy$default(BodyContent bodyContent, String string2, String string3, String string4, String string5, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = bodyContent.linkMessage;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = bodyContent.linkName;
        }
        if ((n4 = n3 & 4) != 0) {
            string4 = bodyContent.message;
        }
        if ((n3 &= 8) != 0) {
            string5 = bodyContent.linkUrl;
        }
        return bodyContent.copy(string2, string3, string4, string5);
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

    public final BodyContent copy(String string2, String string3, String string4, String string5) {
        BodyContent bodyContent = new BodyContent(string2, string3, string4, string5);
        return bodyContent;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof BodyContent;
        if (!bl3) {
            return false;
        }
        object = (BodyContent)object;
        String string2 = this.linkMessage;
        String string3 = ((BodyContent)object).linkMessage;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.linkName;
        string3 = ((BodyContent)object).linkName;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.message;
        string3 = ((BodyContent)object).message;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.linkUrl;
        object = ((BodyContent)object).linkUrl;
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

    public final void setLinkMessage(String string2) {
        this.linkMessage = string2;
    }

    public final void setLinkName(String string2) {
        this.linkName = string2;
    }

    public final void setLinkUrl(String string2) {
        this.linkUrl = string2;
    }

    public final void setMessage(String string2) {
        this.message = string2;
    }

    public String toString() {
        String string2 = this.linkMessage;
        String string3 = this.linkName;
        String string4 = this.message;
        String string5 = this.linkUrl;
        return ko_0.a(og_1.a("BodyContent(linkMessage=", string2, ", linkName=", string3, ", message="), string4, ", linkUrl=", string5, ")");
    }
}

