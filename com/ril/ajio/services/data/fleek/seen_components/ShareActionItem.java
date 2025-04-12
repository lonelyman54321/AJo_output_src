/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.fleek.seen_components;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ShareActionItem {
    private String bid;
    private String id;
    private String pageName;

    public ShareActionItem() {
        this(null, null, null, 7, null);
    }

    public ShareActionItem(String string2, String string3, String string4) {
        this.id = string2;
        this.bid = string3;
        this.pageName = string4;
    }

    public /* synthetic */ ShareActionItem(String string2, String string3, String string4, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 &= 4) != 0) {
            string4 = null;
        }
        this(string2, string3, string4);
    }

    public static /* synthetic */ ShareActionItem copy$default(ShareActionItem shareActionItem, String string2, String string3, String string4, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = shareActionItem.id;
        }
        if ((n4 = n3 & 2) != 0) {
            string3 = shareActionItem.bid;
        }
        if ((n3 &= 4) != 0) {
            string4 = shareActionItem.pageName;
        }
        return shareActionItem.copy(string2, string3, string4);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.bid;
    }

    public final String component3() {
        return this.pageName;
    }

    public final ShareActionItem copy(String string2, String string3, String string4) {
        ShareActionItem shareActionItem = new ShareActionItem(string2, string3, string4);
        return shareActionItem;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ShareActionItem;
        if (!bl3) {
            return false;
        }
        object = (ShareActionItem)object;
        String string2 = this.id;
        String string3 = ((ShareActionItem)object).id;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.bid;
        string3 = ((ShareActionItem)object).bid;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.pageName;
        object = ((ShareActionItem)object).pageName;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getBid() {
        return this.bid;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public int hashCode() {
        int n3;
        int n4;
        String string2 = this.id;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        String string3 = this.bid;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string3 = this.pageName;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        return n4 + n7;
    }

    public final void setBid(String string2) {
        this.bid = string2;
    }

    public final void setId(String string2) {
        this.id = string2;
    }

    public final void setPageName(String string2) {
        this.pageName = string2;
    }

    public String toString() {
        String string2 = this.id;
        String string3 = this.bid;
        String string4 = this.pageName;
        return h30_0.a(og_1.a("ShareActionItem(id=", string2, ", bid=", string3, ", pageName="), string4, ")");
    }
}

