/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home.transform;

import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class HomeData {
    private HomeRowData floatingWidget;
    private List homeRowData;
    private String pageName;
    private String pageTitle;
    private String pageUrl;

    public HomeData() {
        this(null, null, null, null, null, 31, null);
    }

    public HomeData(List list, String string2, String string3, HomeRowData homeRowData, String string4) {
        this.homeRowData = list;
        this.pageTitle = string2;
        this.pageName = string3;
        this.floatingWidget = homeRowData;
        this.pageUrl = string4;
    }

    public /* synthetic */ HomeData(List object, String object2, String string2, HomeRowData object3, String object4, int n3, DefaultConstructorMarker object5) {
        String string3;
        int n4 = n3 & 1;
        if (n4 != 0) {
            n4 = 0;
            object5 = null;
        } else {
            object5 = object;
        }
        int n7 = n3 & 2;
        Object object6 = n7 != 0 ? null : object2;
        n7 = n3 & 4;
        String string4 = n7 != 0 ? null : string2;
        n7 = n3 & 8;
        Object object7 = n7 != 0 ? null : object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            n3 = 0;
            string3 = null;
        } else {
            string3 = object4;
        }
        object = this;
        object2 = object5;
        string2 = object6;
        object3 = string4;
        object4 = object7;
        this((List)object5, (String)object6, string4, (HomeRowData)object7, string3);
    }

    public static /* synthetic */ HomeData copy$default(HomeData homeData, List list, String object, String object2, HomeRowData object3, String string2, int n3, Object object4) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = homeData.homeRowData;
        }
        if ((n4 = n3 & 2) != 0) {
            object = homeData.pageTitle;
        }
        object4 = object;
        int n7 = n3 & 4;
        if (n7 != 0) {
            object2 = homeData.pageName;
        }
        String string3 = object2;
        n7 = n3 & 8;
        if (n7 != 0) {
            object3 = homeData.floatingWidget;
        }
        HomeRowData homeRowData = object3;
        n7 = n3 & 0x10;
        if (n7 != 0) {
            string2 = homeData.pageUrl;
        }
        String string4 = string2;
        object = homeData;
        object2 = list;
        object3 = object4;
        string2 = string3;
        object4 = string4;
        return homeData.copy(list, (String)object3, string3, homeRowData, string4);
    }

    public final List component1() {
        return this.homeRowData;
    }

    public final String component2() {
        return this.pageTitle;
    }

    public final String component3() {
        return this.pageName;
    }

    public final HomeRowData component4() {
        return this.floatingWidget;
    }

    public final String component5() {
        return this.pageUrl;
    }

    public final HomeData copy(List list, String string2, String string3, HomeRowData homeRowData, String string4) {
        HomeData homeData = new HomeData(list, string2, string3, homeRowData, string4);
        return homeData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof HomeData;
        if (!bl3) {
            return false;
        }
        object = (HomeData)object;
        Object object2 = this.homeRowData;
        Object object3 = ((HomeData)object).homeRowData;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageTitle;
        object3 = ((HomeData)object).pageTitle;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageName;
        object3 = ((HomeData)object).pageName;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.floatingWidget;
        object3 = ((HomeData)object).floatingWidget;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.pageUrl;
        object = ((HomeData)object).pageUrl;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final HomeRowData getFloatingWidget() {
        return this.floatingWidget;
    }

    public final List getHomeRowData() {
        return this.homeRowData;
    }

    public final String getPageName() {
        return this.pageName;
    }

    public final String getPageTitle() {
        return this.pageTitle;
    }

    public final String getPageUrl() {
        return this.pageUrl;
    }

    public int hashCode() {
        int n3;
        int n4;
        List list = this.homeRowData;
        int n7 = 0;
        if (list == null) {
            n4 = 0;
            list = null;
        } else {
            n4 = ((Object)list).hashCode();
        }
        n4 *= 31;
        Object object = this.pageTitle;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pageName;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.floatingWidget;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((HomeRowData)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.pageUrl;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final void setFloatingWidget(HomeRowData homeRowData) {
        this.floatingWidget = homeRowData;
    }

    public final void setHomeRowData(List list) {
        this.homeRowData = list;
    }

    public final void setPageName(String string2) {
        this.pageName = string2;
    }

    public final void setPageTitle(String string2) {
        this.pageTitle = string2;
    }

    public final void setPageUrl(String string2) {
        this.pageUrl = string2;
    }

    public String toString() {
        List list = this.homeRowData;
        String string2 = this.pageTitle;
        String string3 = this.pageName;
        HomeRowData homeRowData = this.floatingWidget;
        String string4 = this.pageUrl;
        StringBuilder stringBuilder = new StringBuilder("HomeData(homeRowData=");
        stringBuilder.append(list);
        stringBuilder.append(", pageTitle=");
        stringBuilder.append(string2);
        stringBuilder.append(", pageName=");
        stringBuilder.append(string3);
        stringBuilder.append(", floatingWidget=");
        stringBuilder.append(homeRowData);
        stringBuilder.append(", pageUrl=");
        return h30_0.a(stringBuilder, string4, ")");
    }
}

