/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.flashsale.pdp;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RilfnlBreadCrumbList
implements Serializable {
    private final ArrayList rilfnlBreadCrumb;

    public RilfnlBreadCrumbList() {
        this(null, 1, null);
    }

    public RilfnlBreadCrumbList(ArrayList arrayList) {
        this.rilfnlBreadCrumb = arrayList;
    }

    public /* synthetic */ RilfnlBreadCrumbList(ArrayList arrayList, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            arrayList = null;
        }
        this(arrayList);
    }

    public static /* synthetic */ RilfnlBreadCrumbList copy$default(RilfnlBreadCrumbList rilfnlBreadCrumbList, ArrayList arrayList, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            arrayList = rilfnlBreadCrumbList.rilfnlBreadCrumb;
        }
        return rilfnlBreadCrumbList.copy(arrayList);
    }

    public final ArrayList component1() {
        return this.rilfnlBreadCrumb;
    }

    public final RilfnlBreadCrumbList copy(ArrayList arrayList) {
        RilfnlBreadCrumbList rilfnlBreadCrumbList = new RilfnlBreadCrumbList(arrayList);
        return rilfnlBreadCrumbList;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RilfnlBreadCrumbList;
        if (!bl3) {
            return false;
        }
        object = (RilfnlBreadCrumbList)object;
        ArrayList arrayList = this.rilfnlBreadCrumb;
        object = ((RilfnlBreadCrumbList)object).rilfnlBreadCrumb;
        boolean bl4 = Intrinsics.areEqual(arrayList, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ArrayList getRilfnlBreadCrumb() {
        return this.rilfnlBreadCrumb;
    }

    public int hashCode() {
        int n3;
        ArrayList arrayList = this.rilfnlBreadCrumb;
        if (arrayList == null) {
            n3 = 0;
            arrayList = null;
        } else {
            n3 = arrayList.hashCode();
        }
        return n3;
    }

    public String toString() {
        ArrayList arrayList = this.rilfnlBreadCrumb;
        StringBuilder stringBuilder = new StringBuilder("RilfnlBreadCrumbList(rilfnlBreadCrumb=");
        stringBuilder.append(arrayList);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

