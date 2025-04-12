/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.flashsale.pdp;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RilfnlBreadCrumb
implements Serializable {
    private final String categoryCode;
    private final String name;

    public RilfnlBreadCrumb() {
        this(null, null, 3, null);
    }

    public RilfnlBreadCrumb(String string2, String string3) {
        this.categoryCode = string2;
        this.name = string3;
    }

    public /* synthetic */ RilfnlBreadCrumb(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ RilfnlBreadCrumb copy$default(RilfnlBreadCrumb rilfnlBreadCrumb, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = rilfnlBreadCrumb.categoryCode;
        }
        if ((n3 &= 2) != 0) {
            string3 = rilfnlBreadCrumb.name;
        }
        return rilfnlBreadCrumb.copy(string2, string3);
    }

    public final String component1() {
        return this.categoryCode;
    }

    public final String component2() {
        return this.name;
    }

    public final RilfnlBreadCrumb copy(String string2, String string3) {
        RilfnlBreadCrumb rilfnlBreadCrumb = new RilfnlBreadCrumb(string2, string3);
        return rilfnlBreadCrumb;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RilfnlBreadCrumb;
        if (!bl3) {
            return false;
        }
        object = (RilfnlBreadCrumb)object;
        String string2 = this.categoryCode;
        String string3 = ((RilfnlBreadCrumb)object).categoryCode;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.name;
        object = ((RilfnlBreadCrumb)object).name;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCategoryCode() {
        return this.categoryCode;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int n3;
        String string2 = this.categoryCode;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.name;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        String string2 = this.categoryCode;
        String string3 = this.name;
        return uc0_0.a("RilfnlBreadCrumb(categoryCode=", string2, ", name=", string3, ")");
    }
}

