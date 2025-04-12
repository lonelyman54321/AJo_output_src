/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import com.ril.ajio.services.data.Home.NavigationDataClass;
import com.ril.ajio.services.data.Home.Status;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CmsNavigationData {
    private final NavigationDataClass data;
    private final Status status;

    public CmsNavigationData() {
        this(null, null, 3, null);
    }

    public CmsNavigationData(NavigationDataClass navigationDataClass, Status status) {
        this.data = navigationDataClass;
        this.status = status;
    }

    public /* synthetic */ CmsNavigationData(NavigationDataClass navigationDataClass, Status status, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            navigationDataClass = null;
        }
        if ((n3 &= 2) != 0) {
            status = null;
        }
        this(navigationDataClass, status);
    }

    public static /* synthetic */ CmsNavigationData copy$default(CmsNavigationData cmsNavigationData, NavigationDataClass navigationDataClass, Status status, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            navigationDataClass = cmsNavigationData.data;
        }
        if ((n3 &= 2) != 0) {
            status = cmsNavigationData.status;
        }
        return cmsNavigationData.copy(navigationDataClass, status);
    }

    public final NavigationDataClass component1() {
        return this.data;
    }

    public final Status component2() {
        return this.status;
    }

    public final CmsNavigationData copy(NavigationDataClass navigationDataClass, Status status) {
        CmsNavigationData cmsNavigationData = new CmsNavigationData(navigationDataClass, status);
        return cmsNavigationData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CmsNavigationData;
        if (!bl3) {
            return false;
        }
        object = (CmsNavigationData)object;
        Object object2 = this.data;
        NavigationDataClass navigationDataClass = ((CmsNavigationData)object).data;
        bl3 = Intrinsics.areEqual(object2, navigationDataClass);
        if (!bl3) {
            return false;
        }
        object2 = this.status;
        object = ((CmsNavigationData)object).status;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final NavigationDataClass getData() {
        return this.data;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3;
        NavigationDataClass navigationDataClass = this.data;
        int n4 = 0;
        if (navigationDataClass == null) {
            n3 = 0;
            navigationDataClass = null;
        } else {
            n3 = navigationDataClass.hashCode();
        }
        n3 *= 31;
        Status status = this.status;
        if (status != null) {
            n4 = status.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        NavigationDataClass navigationDataClass = this.data;
        Status status = this.status;
        StringBuilder stringBuilder = new StringBuilder("CmsNavigationData(data=");
        stringBuilder.append(navigationDataClass);
        stringBuilder.append(", status=");
        stringBuilder.append(status);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

