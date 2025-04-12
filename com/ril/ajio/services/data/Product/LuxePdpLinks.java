/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import kotlin.jvm.internal.Intrinsics;

public final class LuxePdpLinks {
    private final String msg;
    private final String url;

    public LuxePdpLinks(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "msg");
        this.msg = string2;
        this.url = string3;
    }

    public static /* synthetic */ LuxePdpLinks copy$default(LuxePdpLinks luxePdpLinks, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = luxePdpLinks.msg;
        }
        if ((n3 &= 2) != 0) {
            string3 = luxePdpLinks.url;
        }
        return luxePdpLinks.copy(string2, string3);
    }

    public final String component1() {
        return this.msg;
    }

    public final String component2() {
        return this.url;
    }

    public final LuxePdpLinks copy(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "msg");
        LuxePdpLinks luxePdpLinks = new LuxePdpLinks(string2, string3);
        return luxePdpLinks;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof LuxePdpLinks;
        if (!bl3) {
            return false;
        }
        object = (LuxePdpLinks)object;
        String string2 = this.msg;
        String string3 = ((LuxePdpLinks)object).msg;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.url;
        object = ((LuxePdpLinks)object).url;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int n3;
        String string2 = this.msg;
        int n4 = string2.hashCode() * 31;
        String string3 = this.url;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        return n4 + n3;
    }

    public String toString() {
        String string2 = this.msg;
        String string3 = this.url;
        return uc0_0.a("LuxePdpLinks(msg=", string2, ", url=", string3, ")");
    }
}

